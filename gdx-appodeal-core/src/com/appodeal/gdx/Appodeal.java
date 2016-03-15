package com.appodeal.gdx;

import com.appodeal.gdx.callbacks.BannerCallback;
import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.appodeal.gdx.callbacks.NonSkippableVideoCallback;
import com.appodeal.gdx.callbacks.RewardedVideoCallback;
import com.appodeal.gdx.callbacks.SkippableVideoCallback;

public interface Appodeal {

    void initialize(String appId, int type);
    void setInterstitialCallbacks(InterstitialCallback listener);
    void setBannerCallbacks(BannerCallback listener);
    void setSkippableVideoCallbacks(SkippableVideoCallback listener);
    void setNonSkippableVideoCallbacks(NonSkippableVideoCallback listener);
    void setRewardedVideoCallbacks(RewardedVideoCallback listener);
    void show(int type);
    void showWithPlacement(int type, String placement);
    void setAutoCache(int type, boolean autoCache);
    void setOnLoadedTriggerBoth(int type, boolean onLoadedTriggerBoth);
    boolean isLoaded(int type);
    boolean isPreCache(int type);
    void cache(int type);
    void hide(int type);
    void confirm(int type);
    void disableLocationPermissionCheck();
    void disableNetwork(String name);
    void disableNetwork(String name, int type);
    String getVersion();
    void setTesting(boolean testing);
    void setLogging(boolean logging);
}
