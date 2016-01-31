package com.appodeal.gdx.android;

import android.app.Activity;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.BannerCallbacks;
import com.appodeal.ads.InterstitialCallbacks;
import com.appodeal.ads.NonSkippableVideoCallbacks;
import com.appodeal.ads.RewardedVideoCallbacks;
import com.appodeal.ads.SkippableVideoCallbacks;
import com.appodeal.gdx.GdxAppodeal;
import com.appodeal.gdx.callbacks.BannerCallback;
import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.appodeal.gdx.callbacks.NonSkippableVideoCallback;
import com.appodeal.gdx.callbacks.RewardedVideoCallback;
import com.appodeal.gdx.callbacks.SkippableVideoCallback;
import com.badlogic.gdx.Gdx;

public class AndroidGdxAppodeal extends GdxAppodeal implements BannerCallbacks, InterstitialCallbacks, SkippableVideoCallbacks, RewardedVideoCallbacks, NonSkippableVideoCallbacks {
    private final Activity activity;

    private InterstitialCallback interstitialListener;
    private BannerCallback bannerListener;
    private SkippableVideoCallback skippableVideoListener;
    private NonSkippableVideoCallback nonSkippableVideoListener;
    private RewardedVideoCallback rewardedVideoListener;

    public AndroidGdxAppodeal(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void initialize(String appId, final int type) {
        Appodeal.initialize(activity, appId, type);
    }

    @Override
    public void setInterstitialCallbacks(InterstitialCallback listener) {
        Appodeal.setInterstitialCallbacks(this);
        interstitialListener = listener;
    }

    @Override
    public void setBannerCallbacks(BannerCallback listener) {
        Appodeal.setBannerCallbacks(this);
        bannerListener = listener;
    }

    @Override
    public void setSkippableVideoCallbacks(SkippableVideoCallback listener) {
        Appodeal.setSkippableVideoCallbacks(this);
        skippableVideoListener = listener;
    }

    @Override
    public void setNonSkippableVideoCallbacks(NonSkippableVideoCallback listener) {
        Appodeal.setNonSkippableVideoCallbacks(this);
        nonSkippableVideoListener = listener;
    }

    @Override
    public void setRewardedVideoCallbacks(RewardedVideoCallback listener) {
        Appodeal.setRewardedVideoCallbacks(this);
        rewardedVideoListener = listener;
    }

    @Override
    public void show(final int type) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Appodeal.show(activity, type);
            }
        });
    }

    @Override
    public void showWithPriceFloor(final int type) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Appodeal.showWithPriceFloor(activity, type);
            }
        });
    }

    @Override
    public void setAutoCache(int type, boolean autoCache) {
        Appodeal.setAutoCache(type, autoCache);
    }

    @Override
    public void setOnLoadedTriggerBoth(int type, boolean onLoadedTriggerBoth) {
        Appodeal.setOnLoadedTriggerBoth(type, onLoadedTriggerBoth);
    }

    @Override
    public boolean isLoaded(int type) {
        return Appodeal.isLoaded(type);
    }

    @Override
    public boolean isLoadedWithPriceFloor(int type) {
        return Appodeal.isLoadedWithPriceFloor(type);
    }

    @Override
    public boolean isPreCache(int type) {
        return Appodeal.isPrecache(type);
    }

    @Override
    public void cache(int type) {
        Appodeal.cache(activity, type);
    }

    @Override
    public void hide(final int type) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Appodeal.hide(activity, type);
            }
        });
    }

    @Override
    public void confirm(int type) {
        Appodeal.confirm(type);
    }

    @Override
    public void disableLocationPermissionCheck() {
        Appodeal.disableLocationPermissionCheck();
    }

    @Override
    public void disableNetwork(String name) {
        Appodeal.disableNetwork(activity, name);
    }

    @Override
    public void disableNetwork(String name, int type) {
        Appodeal.disableNetwork(activity, name, type);
    }

    @Override
    public String getVersion() {
        return Appodeal.getVersion();
    }

    @Override
    public void setTesting(boolean testing) {
        Appodeal.setTesting(testing);
    }

    @Override
    public void setLogging(boolean logging) {
        Appodeal.setLogging(logging);
    }


    @Override
    public void onBannerLoaded() {
        bannerListener.onBannerLoaded();
    }

    @Override
    public void onBannerFailedToLoad() {
        bannerListener.onBannerFailedToLoad();
    }

    @Override
    public void onBannerShown() {
        bannerListener.onBannerShown();
    }

    @Override
    public void onBannerClicked() {
        bannerListener.onBannerClicked();
    }

    @Override
    public void onInterstitialLoaded(boolean b) {
        interstitialListener.onInterstitialLoaded(b);
    }

    @Override
    public void onInterstitialFailedToLoad() {
        interstitialListener.onInterstitialFailedToLoad();
    }

    @Override
    public void onInterstitialShown() {
        interstitialListener.onInterstitialShown();
    }

    @Override
    public void onInterstitialClicked() {
        interstitialListener.onInterstitialClicked();
    }

    @Override
    public void onInterstitialClosed() {
        interstitialListener.onInterstitialClosed();
    }

    @Override
    public void onSkippableVideoLoaded() {
        skippableVideoListener.onSkippableVideoLoaded();
    }

    @Override
    public void onSkippableVideoFailedToLoad() { skippableVideoListener.onSkippableVideoFailedToLoad(); }

    @Override
    public void onSkippableVideoShown() {
        skippableVideoListener.onSkippableVideoShown();
    }

    @Override
    public void onSkippableVideoFinished() {
        skippableVideoListener.onSkippableVideoFinished();
    }

    @Override
    public void onSkippableVideoClosed() {
        skippableVideoListener.onSkippableVideoClosed();
    }

    @Override
    public void onNonSkippableVideoLoaded() { nonSkippableVideoListener.onNonSkippableVideoLoaded(); }

    @Override
    public void onNonSkippableVideoFailedToLoad() { nonSkippableVideoListener.onNonSkippableVideoFailedToLoad(); }

    @Override
    public void onNonSkippableVideoShown() {
        nonSkippableVideoListener.onNonSkippableVideoShown();
    }

    @Override
    public void onNonSkippableVideoFinished() { nonSkippableVideoListener.onNonSkippableVideoFinished(); }

    @Override
    public void onNonSkippableVideoClosed() { nonSkippableVideoListener.onNonSkippableVideoClosed(); }

    @Override
    public void onRewardedVideoLoaded() {
        rewardedVideoListener.onRewardedVideoLoaded();
    }

    @Override
    public void onRewardedVideoFailedToLoad() { rewardedVideoListener.onRewardedVideoFailedToLoad(); }

    @Override
    public void onRewardedVideoShown() {
        rewardedVideoListener.onRewardedVideoShown();
    }

    @Override
    public void onRewardedVideoFinished(int i, String s) {
        rewardedVideoListener.onRewardedVideoFinished(i, s);
        Gdx.app.debug("GDXAppodeal", "Reward from appodeal:" + i+" "+s);
    }

    @Override
    public void onRewardedVideoClosed() {
        rewardedVideoListener.onRewardedVideoClosed();
    }
}