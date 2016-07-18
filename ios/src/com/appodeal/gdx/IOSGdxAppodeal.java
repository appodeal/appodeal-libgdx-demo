package com.appodeal.gdx;

import com.appodeal.gdx.callbacks.BannerCallback;
import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.appodeal.gdx.callbacks.NonSkippableVideoCallback;
import com.appodeal.gdx.callbacks.RewardedVideoCallback;
import com.appodeal.gdx.callbacks.SkippableVideoCallback;
import com.appodeal.org.robovm.bindings.appodeal.Appodeal;

import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIViewController;

public class IOSGdxAppodeal implements AppodealInterface {

    private UIViewController uiViewController;

    public IOSGdxAppodeal() {
        this.uiViewController = UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
    }

    private Appodeal.AppodealAdType NativeAdTypeForType(int adType) {
        return Appodeal.AppodealAdType.INTERSTITIAL;
    }

    @Override
    public void initialize(String appId, int type) {
        Appodeal.initializeWithApiKey(appId, NativeAdTypeForType(type));
    }

    @Override
    public void setInterstitialCallbacks(InterstitialCallback listener) {

    }

    @Override
    public void setBannerCallbacks(BannerCallback listener) {

    }

    @Override
    public void setSkippableVideoCallbacks(SkippableVideoCallback listener) {

    }

    @Override
    public void setNonSkippableVideoCallbacks(NonSkippableVideoCallback listener) {

    }

    @Override
    public void setRewardedVideoCallbacks(RewardedVideoCallback listener) {

    }

    @Override
    public boolean show(int type) {
        return false;
    }

    @Override
    public boolean show(int type, String placement) {
        return false;
    }

    @Override
    public void setAutoCache(int type, boolean autoCache) {

    }

    @Override
    public void setOnLoadedTriggerBoth(int type, boolean onLoadedTriggerBoth) {

    }

    @Override
    public boolean isLoaded(int type) {
        return false;
    }

    @Override
    public boolean isPreCache(int type) {
        return false;
    }

    @Override
    public void cache(int type) {

    }

    @Override
    public void hide(int type) {

    }

    @Override
    public void confirm(int type) {

    }

    @Override
    public void disableLocationPermissionCheck() {

    }

    @Override
    public void disableNetwork(String name) {

    }

    @Override
    public void disableNetwork(String name, int type) {

    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public void setTesting(boolean testing) {

    }

    @Override
    public void setLogging(boolean logging) {

    }
}
