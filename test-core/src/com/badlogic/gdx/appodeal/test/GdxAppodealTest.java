package com.badlogic.gdx.appodeal.test;

import com.appodeal.gdx.GdxAppodeal;
import com.appodeal.gdx.callbacks.BannerCallback;
import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.appodeal.gdx.callbacks.RewardedVideoCallback;
import com.appodeal.gdx.callbacks.SkippableVideoCallback;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.SelectBox;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class GdxAppodealTest extends ApplicationAdapter {
    public static String APP_ID = "";

    private Skin skin;
    private Stage stage;
    private SelectBox<AdTypes> cboAdType;

    public void create() {
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        stage = new Stage(new ExtendViewport(320, 320));
        Gdx.input.setInputProcessor(stage);

        GdxAppodeal.getInstance().setTesting(false);
        GdxAppodeal.getInstance().setLogging(true);
        GdxAppodeal.getInstance().setBannerCallbacks(bannerCallbacks);
        GdxAppodeal.getInstance().setInterstitialCallbacks(interstitialCallbacks);
        GdxAppodeal.getInstance().setSkippableVideoCallbacks(skippableVideoCallbacks);
        GdxAppodeal.getInstance().setRewardedVideoCallbacks(rewardedVideoCallbacks);
        GdxAppodeal.getInstance().confirm(GdxAppodeal.SKIPPABLE_VIDEO);
        GdxAppodeal.getInstance().initialize(APP_ID, GdxAppodeal.BANNER | GdxAppodeal.INTERSTITIAL | GdxAppodeal.REWARDED_VIDEO | GdxAppodeal.SKIPPABLE_VIDEO);

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

        table.add(adTypeTable).row();
        for (TestOptions option : TestOptions.values())
            table.add(getOptionButton(option)).row();
    }

    private TextButton getOptionButton(final TestOptions option) {
        TextButton button = new TextButton(option.toString(), skin);
        button.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                final int type = cboAdType.getSelected().getValue();
                switch (option) {
                    case Show:
                        GdxAppodeal.getInstance().showWithPlacement(type, "level_end");
                        break;
                    case IsLoaded:
                        showMessage(GdxAppodeal.getInstance().isLoaded(type) ? "yes" : "no");
                        break;
                    case Hide:
                        GdxAppodeal.getInstance().hide(type);
                        break;
                    case GetVersion:
                        showMessage(GdxAppodeal.getInstance().getVersion());
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

    public void render() {
        Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    BannerCallback bannerCallbacks = new BannerCallback() {
        @Override
        public void onBannerLoaded() {
        }

        @Override
        public void onBannerFailedToLoad() {

        }

        @Override
        public void onBannerShown() {

        }

        @Override
        public void onBannerClicked() {

        }
    };

    InterstitialCallback interstitialCallbacks = new InterstitialCallback() {
        @Override
        public void onInterstitialLoaded(boolean isPrecache) {
        }

        @Override
        public void onInterstitialFailedToLoad() {

        }

        @Override
        public void onInterstitialShown() {

        }

        @Override
        public void onInterstitialClicked() {

        }

        @Override
        public void onInterstitialClosed() {

        }
    };

    SkippableVideoCallback skippableVideoCallbacks = new SkippableVideoCallback() {
        @Override
        public void onSkippableVideoLoaded() {
        }

        @Override
        public void onSkippableVideoFailedToLoad() {

        }

        @Override
        public void onSkippableVideoShown() {

        }

        @Override
        public void onSkippableVideoFinished() {

        }

        @Override
        public void onSkippableVideoClosed() {

        }
    };

    RewardedVideoCallback rewardedVideoCallbacks = new RewardedVideoCallback() {
        @Override
        public void onRewardedVideoLoaded() {

        }

        @Override
        public void onRewardedVideoFailedToLoad() {

        }

        @Override
        public void onRewardedVideoShown() {

        }

        @Override
        public void onRewardedVideoFinished(int amount, String name) {
        }

        @Override
        public void onRewardedVideoClosed() {

        }
    };
}