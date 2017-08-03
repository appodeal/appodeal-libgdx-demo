package com.appodeal.gdx.ios;

import com.appodeal.gdx.AppodealInterface;
import com.appodeal.gdx.GdxAppodeal;
import com.appodeal.gdx.callbacks.BannerCallback;
import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.appodeal.gdx.callbacks.NonSkippableVideoCallback;
import com.appodeal.gdx.callbacks.PermissionCallback;
import com.appodeal.gdx.callbacks.RewardedVideoCallback;
import com.appodeal.gdx.data.RewardParameters;
import com.appodeal.gdx.data.UserSettings;

import com.appodeal.gdx.ios.delegates.BannerDelegate;
import com.appodeal.gdx.ios.delegates.InterstitialDelegate;
import com.appodeal.gdx.ios.delegates.NonSkippableVideoDelegate;
import com.appodeal.gdx.ios.delegates.RewardedVideoDelegate;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.iosmoe.IOSApplication;

import org.moe.appodeal.APDSdk;
import org.moe.appodeal.Appodeal;
import org.moe.appodeal.enums.APDFramework;
import org.moe.appodeal.enums.AppodealAdType;
import org.moe.appodeal.enums.AppodealShowStyle;

import apple.foundation.NSDictionary;
import apple.foundation.NSNumber;
import apple.uikit.UIViewController;

import static org.moe.appodeal.APDSdk.sharedSdk;

public class iOSGdxAppodeal implements AppodealInterface {

    private iOSUserSettings userSettings;

    @Override
    public void initialize(String appId, int type) {
        Appodeal.setFramework(APDFramework.LibGDX);
        Appodeal.setPluginVersion(GdxAppodeal.getPluginVersion());
        Appodeal.initializeWithApiKeyTypes(appId, getNativeAdType(type));
    }

    @Override
    public void setInterstitialCallbacks(InterstitialCallback listener) {
        InterstitialDelegate.alloc().initWithCallback(listener);
    }

    @Override
    public void setBannerCallbacks(BannerCallback listener) {
        BannerDelegate.alloc().initWithCallback(listener);
    }

    @Override
    public void setNonSkippableVideoCallbacks(NonSkippableVideoCallback listener) {
        NonSkippableVideoDelegate.alloc().initWithCallback(listener);
    }

    @Override
    public void setRewardedVideoCallbacks(RewardedVideoCallback listener) {
        RewardedVideoDelegate.alloc().initWithCallback(listener);
    }

    @Override
    public boolean show(int type) {
        return Appodeal.showAdRootViewController(getNativeShowType(type), getRootViewController());
    }

    @Override
    public boolean show(int type, String placement) {
        return Appodeal.showAdForPlacementRootViewController(getNativeShowType(type), placement, getRootViewController());
    }

    @Override
    public void setAutoCache(int type, boolean autoCache) {
        Appodeal.setAutocacheTypes(autoCache, getNativeAdType(type));
    }

    @Override
    public void setTriggerOnLoadedOnPrecache(int type, boolean onLoadedTriggerBoth) {
        //handle it by callbacks on ios
    }

    @Override
    public boolean isLoaded(int type) {
        return Appodeal.isReadyForShowWithStyle(getNativeShowType(type));
    }

    @Override
    public boolean isPreCache(int type) {
        //not supported on iOS platform
        return false;
    }

    @Override
    public void cache(int type) {
        Appodeal.cacheAd(getNativeAdType(type));
    }

    @Override
    public void hide(int type) {
        Appodeal.hideBanner();
    }

    @Override
    public void disableLocationPermissionCheck() {
        Appodeal.setLocationTracking(false);
    }

    @Override
    public void disableNetwork(String name) {
        Appodeal.disableNetworkForAdTypeName(AppodealAdType.Interstitial, name);
        Appodeal.disableNetworkForAdTypeName(AppodealAdType.Banner, name);
        Appodeal.disableNetworkForAdTypeName(AppodealAdType.RewardedVideo, name);
        Appodeal.disableNetworkForAdTypeName(AppodealAdType.NonSkippableVideo, name);
    }

    @Override
    public void disableNetwork(String name, int type) {
        Appodeal.disableNetworkForAdTypeName(getNativeAdType(type), name);
    }

    @Override
    public String getVersion() {
        return Appodeal.getVersion();
    }

    @Override
    public void setTesting(boolean testing) {
        Appodeal.setTestingEnabled(testing);
    }

    @Override
    public void setLogLevel(com.appodeal.gdx.GdxAppodeal.LogLevel level) {
        switch (level) {
            case none:
                Appodeal.setDebugEnabled(false);
                break;
            case debug:
                Appodeal.setDebugEnabled(true);
                break;
            case verbose:
                Appodeal.setDebugEnabled(true);
                break;
        }
    }

    @Override
    public UserSettings getUserSettings(){
        if(userSettings == null)
            userSettings = new iOSUserSettings();
        return userSettings;
    }

    @Override
    public void disableWriteExternalStoragePermissionCheck() {
        //not supported on iOS SDK
    }

    @Override
    public void requestAndroidMPermissions(PermissionCallback permissionCallback) {
        //not supported on iOS SDK
    }

    @Override
    public void set728x90Banners(boolean b) {
        //not supported on iOS SDK, handled by SDK for iPad's
    }

    @Override
    public void setBannerAnimation(boolean b) {
        Appodeal.setBannerAnimationEnabled(b);
    }

    @Override
    public void setCustomRule(String name, boolean value) {
        NSDictionary temp = NSDictionary.dictionaryWithObjectForKey(name, String.valueOf(value));
        NSDictionary dict = NSDictionary.dictionaryWithDictionary(temp);
        Appodeal.setCustomRule(dict);
    }

    @Override
    public void setCustomRule(String name, double value) {
        NSDictionary temp = NSDictionary.dictionaryWithObjectForKey(name, String.valueOf(value));
        NSDictionary dict = NSDictionary.dictionaryWithDictionary(temp);
        Appodeal.setCustomRule(dict);
    }

    @Override
    public void setCustomRule(String name, int value) {
        NSDictionary temp = NSDictionary.dictionaryWithObjectForKey(name, String.valueOf(value));
        NSDictionary dict = NSDictionary.dictionaryWithDictionary(temp);
        Appodeal.setCustomRule(dict);
    }

    @Override
    public void setCustomRule(String name, String value) {
        NSDictionary temp = NSDictionary.dictionaryWithObjectForKey(name, String.valueOf(value));
        NSDictionary dict = NSDictionary.dictionaryWithDictionary(temp);
        Appodeal.setCustomRule(dict);
    }

    @Override
    public void setSmartBanners(boolean b) {
        Appodeal.setSmartBannersEnabled(b);
    }

    @Override
    public void trackInAppPurchase(double v, String s) {
        ((APDSdk) sharedSdk()).trackInAppPurchaseCurrency(NSNumber.numberWithDouble(v), s);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onCreate() {

    }

    @Override
    public boolean canShow(int adType) {
        return Appodeal.canShowAdForPlacement(getNativeShowType(adType), "");
    }

    @Override
    public boolean canShow(int adType, String placement) {
        return Appodeal.canShowAdForPlacement(getNativeShowType(adType), placement);
    }

    @Override
    public RewardParameters getRewardParameters() {
        //APDReward reward = Appodeal.rewardForPlacement("");
        //RewardParameters ret = new RewardParameters();
        //ret.amount = (int) reward.amount();
        //ret.currencyName = reward.currencyName();
        return null;
    }

    @Override
    public RewardParameters getRewardParameters(String placement) {
        //APDReward reward = Appodeal.rewardForPlacement(placement);
        //RewardParameters ret = new RewardParameters();
        //ret.amount = (int) reward.amount();
        //ret.currencyName = reward.currencyName();
        return null;
    }

    @Override
    public void startTestActivity() {
        //not supported on ios yet
    }

    @Override
    public void muteVideosIfCallsMuted(boolean flag) {
        //handled by os
    }

    private UIViewController getRootViewController() {
        return ((IOSApplication) Gdx.app).getUIViewController();
    }


    private long getNativeAdType(int adType) {
        long nativeType = 0;
        if((adType & GdxAppodeal.INTERSTITIAL) > 0) {
            nativeType |= AppodealAdType.Interstitial;
        } else if(((adType & GdxAppodeal.BANNER) > 0) || ((adType & GdxAppodeal.BANNER_TOP) > 0) || ((adType & GdxAppodeal.BANNER_BOTTOM) > 0)) {
            nativeType |= AppodealAdType.Banner;
        } else if((adType & GdxAppodeal.REWARDED_VIDEO) > 0) {
            nativeType |= AppodealAdType.RewardedVideo;
        } else if((adType & GdxAppodeal.NON_SKIPPABLE_VIDEO) > 0) {
            nativeType |= AppodealAdType.NonSkippableVideo;
        }
        return nativeType;
    }

    private long getNativeShowType(int adType) {
        if ((adType & GdxAppodeal.INTERSTITIAL) > 0) {
            return AppodealShowStyle.Interstitial;
        }

        if ((adType & GdxAppodeal.BANNER) > 0) {
            return AppodealShowStyle.BannerBottom;
        }

        if ((adType & GdxAppodeal.BANNER_TOP) > 0) {
            return AppodealShowStyle.BannerTop;
        }

        if ((adType & GdxAppodeal.BANNER_BOTTOM) > 0) {
            return AppodealShowStyle.BannerBottom;
        }

        if ((adType & GdxAppodeal.REWARDED_VIDEO) > 0) {
            return AppodealShowStyle.RewardedVideo;
        }

        if ((adType & GdxAppodeal.NON_SKIPPABLE_VIDEO) > 0) {
            return AppodealShowStyle.NonSkippableVideo;
        }

        return 0;
    }
}
