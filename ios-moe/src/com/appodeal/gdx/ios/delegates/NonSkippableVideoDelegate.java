package com.appodeal.gdx.ios.delegates;

import com.appodeal.gdx.callbacks.NonSkippableVideoCallback;

import org.moe.appodeal.Appodeal;
import org.moe.appodeal.protocol.AppodealNonSkippableVideoDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;

public class NonSkippableVideoDelegate extends NSObject implements AppodealNonSkippableVideoDelegate {

    private NonSkippableVideoCallback nonSkippableVideoListener;

    @Selector("alloc")
    public static native NonSkippableVideoDelegate alloc();

    protected NonSkippableVideoDelegate(Pointer peer) {
        super(peer);
    }

    public void initWithCallback(NonSkippableVideoCallback listener) {
        nonSkippableVideoListener = listener;
        Appodeal.setNonSkippableVideoDelegate(this);
    }


    //Non Skippable Video callbacks
    @Override
    @Selector("nonSkippableVideoDidFailToLoadAd")
    public void nonSkippableVideoDidFailToLoadAd() {
        nonSkippableVideoListener.onNonSkippableVideoFailedToLoad();
    }

    @Override
    @Selector("nonSkippableVideoDidFinish")
    public void nonSkippableVideoDidFinish() {
        nonSkippableVideoListener.onNonSkippableVideoFinished();
    }

    @Override
    @Selector("nonSkippableVideoDidLoadAd")
    public void nonSkippableVideoDidLoadAd() {
        nonSkippableVideoListener.onNonSkippableVideoLoaded();
    }

    @Override
    @Selector("nonSkippableVideoDidPresent")
    public void nonSkippableVideoDidPresent() {
        nonSkippableVideoListener.onNonSkippableVideoShown();
    }

    @Override
    @Selector("nonSkippableVideoWillDismiss")
    public void nonSkippableVideoWillDismiss() {
        nonSkippableVideoListener.onNonSkippableVideoClosed();
    }

}
