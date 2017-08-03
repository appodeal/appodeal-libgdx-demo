package com.appodeal.test;

import com.appodeal.gdx.GdxAppodeal;
import com.appodeal.gdx.callbacks.BannerCallback;
import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.appodeal.gdx.callbacks.RewardedVideoCallback;
import com.appodeal.gdx.data.UserSettings;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class AppodealGDXDemo extends ApplicationAdapter {

	public static String APP_ID = "";

	private Skin skin;
	private Stage stage;
	private SelectBox<AdTypes> cboAdType;

	private boolean enableLogging = false;
	private boolean enableTesting = false;
	private boolean enableAutocache = false;
	private boolean disableSmartBanners = false;
	private boolean disableBannerAnimation = false;
	private boolean disable728x90Banners = false;
	private boolean enableTriggerOnLoadedOnPrecache = false;
	private boolean disableLocationPermissionCheck = false;
	private boolean disableWriteExternalStorageCheck = false;
	private boolean muteVideoIfCalledMuted = false;

	public void create() {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		stage = new Stage(new ExtendViewport(320, 320));
		Gdx.input.setInputProcessor(stage);

		if (Gdx.app.getType() == Application.ApplicationType.Android) {
			APP_ID = "fee50c333ff3825fd6ad6d38cff78154de3025546d47a84f";
		} else if (Gdx.app.getType() == Application.ApplicationType.iOS) {
			APP_ID = "";
		} else {
			APP_ID = "";
		}

		GdxAppodeal.onCreate();
		GdxAppodeal.setBannerCallbacks(bannerCallbacks);
		GdxAppodeal.setInterstitialCallbacks(interstitialCallbacks);
		GdxAppodeal.setRewardedVideoCallbacks(rewardedVideoCallbacks);

		UserSettings userSettings = GdxAppodeal.getUserSettings();
		userSettings.setAge(42);
		userSettings.setGender(UserSettings.Gender.MALE);

		GdxAppodeal.setCustomRule("test_rule", true);
		GdxAppodeal.requestAndroidMPermissions(null);

		skin = new Skin(Gdx.files.internal("uiskin.json"));
		Table table = new Table();
		stage.addActor(table);
		table.setFillParent(true);

		table.defaults().pad(2).fillX().expandX();


		Table adTypeTable = new Table(skin);
		adTypeTable.add("Ad Type: ");
		cboAdType = new SelectBox<AdTypes>(skin);
		cboAdType.setItems(AdTypes.values());
		adTypeTable.add(cboAdType).fillX().expandX();

		table.add(adTypeTable);
		TestOptions[] to = TestOptions.values();
		TestCheckboxes[] tc = TestCheckboxes.values();
		table.add(getCheckbox(tc[0])).left();
		table.add(getCheckbox(tc[1])).left().row();

		int finalRow = Math.max(to.length, tc.length-3);
		for(int i = 0, j = 2; i < finalRow; i++, j++){
			table.add(getOptionButton(i < to.length ? to[i] : null));
			if(i == 0) {
				table.add(getCheckbox(j < tc.length ? tc[j] : null)).left();
				j++;
				table.add(getCheckbox(j < tc.length ? tc[j] : null)).left();
			}
			else {
				table.add(getCheckbox(j < tc.length ? tc[j] : null)).colspan(2).left();
			}
			table.row();
		}
	}

	private Actor getOptionButton(final TestOptions option) {
		if(option == null){
			return new Actor(); //To fill empty cells in table
		}
		TextButton button = new TextButton(option.toString(), skin);
		button.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				final int type = cboAdType.getSelected().getValue();
				switch (option) {
					case Initialize:
						if(enableLogging)
							GdxAppodeal.setLogLevel(GdxAppodeal.LogLevel.verbose);
						else
							GdxAppodeal.setLogLevel(GdxAppodeal.LogLevel.none);
						GdxAppodeal.setTesting(enableTesting);
						GdxAppodeal.setSmartBanners(!disableSmartBanners);
						GdxAppodeal.setBannerAnimation(!disableBannerAnimation);
						GdxAppodeal.set728x90Banners(!disable728x90Banners);
						GdxAppodeal.setTriggerOnLoadedOnPrecache(type, enableTriggerOnLoadedOnPrecache);
						GdxAppodeal.muteVideosIfCallsMuted(muteVideoIfCalledMuted);
						if(disableLocationPermissionCheck) GdxAppodeal.disableLocationPermissionCheck();
						if(disableWriteExternalStorageCheck) GdxAppodeal.disableWriteExternalStoragePermissionCheck();

						GdxAppodeal.setAutoCache(type, enableAutocache);
						GdxAppodeal.initialize(APP_ID, type);
						break;
					case Cache:
						GdxAppodeal.cache(type);
						break;
					case Show:
						GdxAppodeal.show(type, "level_end");
						break;
					case ShowWIthPlacement:
						GdxAppodeal.show(type, "unusual_placement");
						break;
					case IsLoaded:
						showMessage(GdxAppodeal.isLoaded(type) ? "yes" : "no");
						break;
					case CanShow:
						showMessage(GdxAppodeal.canShow(type)? "yes" : "no");
						break;
					case IsPreCache:
						showMessage(GdxAppodeal.isPreCache(type) ? "yes" : "no");
						break;
					case Hide:
						GdxAppodeal.hide(type);
						break;
					case Exit:
						Gdx.app.exit();
						break;
				}
			}

			private void showMessage(String msg) {
				new Dialog(option.toString(), skin).text(msg).button("OK").show(stage);
			}
		});
		return button;
	}

	private Actor getCheckbox(final TestCheckboxes checkbox){
		if(checkbox == null){
			return new Actor(); //To fill empty cells in table
		}
		CheckBox cb = new CheckBox(checkbox.toString(), skin);
		cb.left();
		cb.addListener(new ChangeListener() {
			@Override
			public void changed(ChangeEvent event, Actor actor) {
				CheckBox currentCb = (CheckBox)actor;
				switch (checkbox){
					case Logging:
						enableLogging = currentCb.isChecked();
						break;
					case Testing:
						enableTesting = currentCb.isChecked();
						break;
					case AutoCache:
						enableAutocache = currentCb.isChecked();
						break;
					case DisableSmartBanners:
						disableSmartBanners = currentCb.isChecked();
						break;
					case DisableBannerAnimation:
						disableBannerAnimation = currentCb.isChecked();
						break;
					case Disable728x90Banners:
						disable728x90Banners = currentCb.isChecked();
						break;
					case EnableTriggerOnLoadedOnPrecache:
						enableTriggerOnLoadedOnPrecache = currentCb.isChecked();
						break;
					case DisableLocationPermissionCheck:
						disableLocationPermissionCheck = currentCb.isChecked();
						break;
					case  DisableWriteExternalStorageCheck:
						disableWriteExternalStorageCheck = currentCb.isChecked();
						break;
					case MuteVideosIfCalledMuted:
						muteVideoIfCalledMuted = currentCb.isChecked();
						break;
				}
			}
		});
		return cb;
	}

	public void render() {
		Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}

	public void resize(int width, int height) {
		stage.getViewport().update(width, height, true);
	}

	@Override
	public void resume() {
		super.resume();
		GdxAppodeal.onResume();
	}

	BannerCallback bannerCallbacks = new BannerCallback() {
		@Override
		public void onBannerLoaded() {
			Gdx.app.log("AppodealGDX", "onBannerLoaded");
		}

		@Override
		public void onBannerFailedToLoad() {
			Gdx.app.log("AppodealGDX", "onBannerFailedToLoad");
		}

		@Override
		public void onBannerShown() {
			Gdx.app.log("AppodealGDX", "onBannerShown");
		}

		@Override
		public void onBannerClicked() {
			Gdx.app.log("AppodealGDX", "onBannerClicked");
		}
	};

	InterstitialCallback interstitialCallbacks = new InterstitialCallback() {
		@Override
		public void onInterstitialLoaded(boolean isPrecache) {
			Gdx.app.log("AppodealGDX", "onInterstitialLoaded");
		}

		@Override
		public void onInterstitialFailedToLoad() {
			Gdx.app.log("AppodealGDX", "onInterstitialFailedToLoad");
		}

		@Override
		public void onInterstitialShown() {
			Gdx.app.log("AppodealGDX", "onInterstitialShown");
		}

		@Override
		public void onInterstitialClicked() {
			Gdx.app.log("AppodealGDX", "onInterstitialClicked");
		}

		@Override
		public void onInterstitialClosed() {
			Gdx.app.log("AppodealGDX", "onInterstitialClosed");
		}
	};

	RewardedVideoCallback rewardedVideoCallbacks = new RewardedVideoCallback() {
		@Override
		public void onRewardedVideoLoaded() {
			Gdx.app.log("AppodealGDX", "onRewardedVideoLoaded");
		}

		@Override
		public void onRewardedVideoFailedToLoad() {
			Gdx.app.log("AppodealGDX", "onRewardedVideoFailedToLoad");
		}

		@Override
		public void onRewardedVideoShown() {
			Gdx.app.log("AppodealGDX", "onRewardedVideoShown");
		}

		@Override
		public void onRewardedVideoFinished(int amount, String name) {
			Gdx.app.log("AppodealGDX", "onRewardedVideoFinished");
		}

		@Override
		public void onRewardedVideoClosed() {
			Gdx.app.log("AppodealGDX", "onRewardedVideoClosed");
		}
	};
}
