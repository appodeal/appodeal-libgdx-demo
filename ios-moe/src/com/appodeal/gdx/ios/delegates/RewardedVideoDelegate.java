package com.appodeal.gdx.ios.delegates;

import com.appodeal.gdx.callbacks.RewardedVideoCallback;

import org.moe.appodeal.Appodeal;
import org.moe.appodeal.protocol.AppodealRewardedVideoDelegate;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.ann.Selector;

import apple.NSObject;

public class RewardedVideoDelegate extends NSObject implements AppodealRewardedVideoDelegate {

    private RewardedVideoCallback rewardedVideoListener;

    @Selector("alloc")
    public static native RewardedVideoDelegate alloc();

    protected RewardedVideoDelegate(Pointer peer) {
        super(peer);
    }

    public void initWithCallback(RewardedVideoCallback listener) {
        rewardedVideoListener = listener;
        Appodeal.setRewardedVideoDelegate(this);
    }


    //Rewarded Video Callbacks
    @Override
    @Selector("rewardedVideoDidFailToLoadAd")
    public void rewardedVideoDidFailToLoadAd() {
        rewardedVideoListener.onRewardedVideoFailedToLoad();
    }

    @Override
    @Selector("rewardedVideoDidFinish:name:")
    public void rewardedVideoDidFinishName(@NUInt long rewardAmount, String rewardName) {
        rewardedVideoListener.onRewardedVideoFinished((int)rewardAmount, rewardName);
    }

    @Override
    @Selector("rewardedVideoDidLoadAd")
    public void rewardedVideoDidLoadAd() {
        rewardedVideoListener.onRewardedVideoLoaded();
    }

    @Override
    @Selector("rewardedVideoDidPresent")
    public void rewardedVideoDidPresent() {
        rewardedVideoListener.onRewardedVideoShown();
    }

    @Override
    @Selector("rewardedVideoWillDismiss")
    public void rewardedVideoWillDismiss() {
        rewardedVideoListener.onRewardedVideoClosed();
    }
}
