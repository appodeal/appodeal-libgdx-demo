package com.appodeal.gdx;

import com.appodeal.gdx.callbacks.BannerCallback;
import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.appodeal.gdx.callbacks.NonSkippableVideoCallback;
import com.appodeal.gdx.callbacks.RewardedVideoCallback;
import com.appodeal.gdx.callbacks.SkippableVideoCallback;
import com.badlogic.gdx.Gdx;

public class DisabledGdxAppodeal extends GdxAppodeal {

    @Override
    public void initialize(String appId, int type) {
        disabledMessage();
    }

    @Override
    public void setInterstitialCallbacks(InterstitialCallback listener) {
        disabledMessage();
    }

    @Override
    public void setBannerCallbacks(BannerCallback listener) {
        disabledMessage();
    }

    @Override
    public void setSkippableVideoCallbacks(SkippableVideoCallback listener) {
        disabledMessage();
    }

    @Override
    public void setNonSkippableVideoCallbacks(NonSkippableVideoCallback listener) {
        disabledMessage();
    }

    @Override
    public void setRewardedVideoCallbacks(RewardedVideoCallback listener) {
        disabledMessage();
    }

    @Override
    public void show(int type) {
        disabledMessage();
    }

    @Override
    public void showWithPlacement(int type, String placement) {
        disabledMessage();
    }

    @Override
    public void setAutoCache(int type, boolean autoCache) {
        disabledMessage();
    }

    @Override
    public void setOnLoadedTriggerBoth(int type, boolean onLoadedTriggerBoth) {
        disabledMessage();
    }

    @Override
    public boolean isLoaded(int type) {
        disabledMessage();
        return false;
    }

    @Override
    public boolean isPreCache(int type) {
        disabledMessage();
        return false;
    }

    @Override
    public void cache(int type) {
        disabledMessage();
    }

    @Override
    public void hide(int type) {
        disabledMessage();
    }

    @Override
    public void confirm(int type) {
        disabledMessage();
    }

    @Override
    public void disableLocationPermissionCheck() {
        disabledMessage();
    }

    @Override
    public void disableNetwork(String name) {
        disabledMessage();
    }

    @Override
    public void disableNetwork(String name, int type) {
        disabledMessage();
    }

    @Override
    public String getVersion() {
        disabledMessage();
        return "invalid";
    }

    @Override
    public void setTesting(boolean testing) {
        disabledMessage();
    }

    @Override
    public void setLogging(boolean logging) {
        disabledMessage();
    }

    private void disabledMessage() {
        Gdx.app.debug(TAG, "GdxAppodeal not loaded or disabled!");
    }

}
