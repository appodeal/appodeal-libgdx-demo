package org.moe.appodeal.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Appodeal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AppodealRewardedVideoDelegate")
public interface AppodealRewardedVideoDelegate {
	@Generated
	@IsOptional
	@Deprecated
	@Selector("rewardedVideoDidClick")
	default void rewardedVideoDidClick() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidFailToLoadAd")
	default void rewardedVideoDidFailToLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidFailToPresent")
	default void rewardedVideoDidFailToPresent() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidFinish:name:")
	default void rewardedVideoDidFinishName(@NUInt long rewardAmount,
			String rewardName) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidLoadAd")
	default void rewardedVideoDidLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidPresent")
	default void rewardedVideoDidPresent() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoWillDismiss")
	default void rewardedVideoWillDismiss() {
		throw new java.lang.UnsupportedOperationException();
	}
}