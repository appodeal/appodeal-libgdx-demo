package com.appodeal.gdx.ios.delegates;

import com.appodeal.gdx.callbacks.BannerCallback;

import org.moe.appodeal.Appodeal;
import org.moe.appodeal.protocol.AppodealBannerDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;


public class BannerDelegate extends NSObject implements AppodealBannerDelegate {

    private BannerCallback bannerListener;

    @Selector("alloc")
    public static native BannerDelegate alloc();

    protected BannerDelegate(Pointer peer) {
        super(peer);
    }

    public void initWithCallback(BannerCallback listener) {
        bannerListener = listener;
        Appodeal.setBannerDelegate(this);
    }

    /// Banner Callbacks
    @Override
    @Selector("bannerDidClick")
    public void bannerDidClick() {
        bannerListener.onBannerClicked();
    }

    @Override
    @Selector("bannerDidFailToLoadAd")
    public void bannerDidFailToLoadAd() {
        bannerListener.onBannerFailedToLoad();
    }

    @Override
    @Selector("bannerDidLoadAdIsPrecache:")
    public void bannerDidLoadAdIsPrecache(boolean precache) {
        bannerListener.onBannerLoaded();
    }

    @Override
    @Selector("bannerDidShow")
    public void bannerDidShow() {
        bannerListener.onBannerShown();
    }

}
