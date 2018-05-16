package com.appodeal.gdx.ios.delegates;


import com.appodeal.gdx.callbacks.InterstitialCallback;
import com.badlogic.gdx.Gdx;

import org.moe.appodeal.Appodeal;
import org.moe.appodeal.protocol.AppodealInterstitialDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;


public class InterstitialDelegate extends NSObject implements AppodealInterstitialDelegate {

    private InterstitialCallback interstitialListener;

    @Selector("alloc")
    public static native InterstitialDelegate alloc();

    protected InterstitialDelegate(Pointer peer) {
        super(peer);
    }

    public void initWithCallback(InterstitialCallback listener) {
        interstitialListener = listener;
        Appodeal.setInterstitialDelegate(this);
    }

    /// Interstitial Callbacks
    @Override
    @Selector("interstitialDidClick")
    public void interstitialDidClick() {
        interstitialListener.onInterstitialClicked();
    }

    @Override
    @Selector("interstitialDidDismiss")
    public void interstitialDidDismiss() {
        interstitialListener.onInterstitialClosed();
    }

    @Override
    @Selector("interstitialDidFailToLoadAd")
    public void interstitialDidFailToLoadAd() {
        interstitialListener.onInterstitialFailedToLoad();
    }

    @Override
    @Selector("interstitialDidLoadAdisPrecache:")
    public void interstitialDidLoadAdisPrecache(boolean precache) {
        Gdx.app.debug("GDXAppodealiOS from Custom Delegate", "interstitialDidLoadAdisPrecache");
        interstitialListener.onInterstitialLoaded(precache);
    }

    @Override
    @Selector("interstitialWillPresent")
    public void interstitialWillPresent() {
        interstitialListener.onInterstitialShown();
    }
}
