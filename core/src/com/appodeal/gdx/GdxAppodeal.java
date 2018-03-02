package com.appodeal.gdx;

import com.appodeal.gdx.callbacks.BannerCallback;
import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.appodeal.gdx.callbacks.NonSkippableVideoCallback;
import com.appodeal.gdx.callbacks.PermissionCallback;
import com.appodeal.gdx.callbacks.RewardedVideoCallback;
import com.appodeal.gdx.data.RewardParameters;
import com.appodeal.gdx.data.UserSettings;

public class GdxAppodeal {

    public static final String TAG = "GdxAppodeal";


    public enum LogLevel{none, debug, verbose};
    public static final int NONE = 0;
    public static final int INTERSTITIAL = 3;
    public static final int REWARDED_VIDEO = 128;
    public static final int NON_SKIPPABLE_VIDEO = 128;
    public static final int BANNER = 4;
    public static final int BANNER_BOTTOM = 8;
    public static final int BANNER_TOP = 16;
    private static AppodealInterface instance;

    private static AppodealInterface getInstance() {
        if (instance == null) instance = GdxAppodealLoader.buildAPI();
        return instance;
    }

    public static void initialize(String appKey, int adType) {
        getInstance().initialize(appKey, adType);
    }

    public static void setInterstitialCallbacks(InterstitialCallback listener) {
        getInstance().setInterstitialCallbacks(listener);
    }

    public static void setBannerCallbacks(BannerCallback listener) {
        getInstance().setBannerCallbacks(listener);
    }

    public static void setNonSkippableVideoCallbacks(NonSkippableVideoCallback listener) {
        getInstance().setNonSkippableVideoCallbacks(listener);
    }

    public static void setRewardedVideoCallbacks(RewardedVideoCallback listener) {
        getInstance().setRewardedVideoCallbacks(listener);
    }

    public static boolean show(int type) {
        return getInstance().show(type);
    }

    public static boolean show(int type, String placement) {
        return getInstance().show(type, placement);
    }

    public static void setAutoCache(int type, boolean autoCache) {
        getInstance().setAutoCache(type, autoCache);
    }

    public static boolean isLoaded(int type) {
        return getInstance().isLoaded(type);
    }

    public static boolean isPreCache(int type) {
        return getInstance().isPreCache(type);
    }

    public static void cache(int type) {
        getInstance().cache(type);
    }

    public static  void hide(int type) {
        getInstance().hide(type);
    }

    public static void disableLocationPermissionCheck() {
        getInstance().disableLocationPermissionCheck();
    }

    public static void disableNetwork(String name) {
        getInstance().disableNetwork(name);
    }

    public static void disableNetwork(String name, int type) {
        getInstance().disableNetwork(name, type);
    }

    public static String getVersion() {
        return getInstance().getVersion();
    }

    public static void setTesting(boolean testing) {
        getInstance().setTesting(testing);
    }

    public static void setLogLevel(LogLevel level) {
        getInstance().setLogLevel(level);
    }

    public static UserSettings getUserSettings(){
        return getInstance().getUserSettings();
    }

    public static void disableWriteExternalStoragePermissionCheck(){
        getInstance().disableWriteExternalStoragePermissionCheck();
    }

    public static void requestAndroidMPermissions(PermissionCallback permissionCallback) {
        getInstance().requestAndroidMPermissions(permissionCallback);
    }

    public static void set728x90Banners(boolean b){
        getInstance().set728x90Banners(b);
    }

    public static void setBannerAnimation(boolean b){
        getInstance().setBannerAnimation(b);
    }

    public static void setCustomRule(String s, boolean b){
        getInstance().setCustomRule(s, b);
    }

    public static void setCustomRule(String s, double v){
        getInstance().setCustomRule(s, v);
    }

    public static void setCustomRule(String s, int i){
        getInstance().setCustomRule(s, i);
    }

    public static void setCustomRule(String s1, String s2){
        getInstance().setCustomRule(s1, s2);
    }

    public static void setSmartBanners(boolean b){
        getInstance().setSmartBanners(b);
    }

    public static void trackInAppPurchase(double v, String s){
        getInstance().trackInAppPurchase(v, s);
    }

    public static void onResume(){
        getInstance().onResume();
    }

    public static void onCreate() {
        getInstance().onCreate();
    }

    public static void setTriggerOnLoadedOnPrecache(int adType, boolean flag){
        getInstance().setTriggerOnLoadedOnPrecache(adType, flag);
    }

    public static  boolean canShow(int adType){
        return getInstance().canShow(adType);
    }

    public static  boolean canShow(int adType, String placement){
        return getInstance().canShow(adType, placement);
    }

    public static RewardParameters getRewardParameters(){
        return getInstance().getRewardParameters();
    }

    public static RewardParameters getRewardParameters(String placement){
        return  getInstance().getRewardParameters();
    }

    public static void startTestActivity(){
        getInstance().startTestActivity();
    }

    public static void muteVideosIfCallsMuted(boolean flag){
        getInstance().muteVideosIfCallsMuted(flag);
    }

    public static String getPluginVersion() {
        return "2.1.7";
    }
	
	public static void destroy(int adTypes){
		getInstance().destroy(adTypes);
	}
}