package org.moe.appodeal.protocol;


import apple.foundation.NSError;
import org.moe.appodeal.APDRewardedVideo;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Appodeal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("APDRewardedVideoDelegate")
public interface APDRewardedVideoDelegate {
	@Generated
	@IsOptional
	@Selector("rewardedVideo:didFailToLoadWithError:")
	default void rewardedVideoDidFailToLoadWithError(
			APDRewardedVideo rewardedVideo, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideo:didFailToPresentWithError:")
	default void rewardedVideoDidFailToPresentWithError(
			APDRewardedVideo rewardedVideo, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideo:didFinishWithReward:")
	default void rewardedVideoDidFinishWithReward(
			APDRewardedVideo rewardedVideo,
			@Mapped(ObjCObjectMapper.class) Object reward) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidAppear:")
	default void rewardedVideoDidAppear(APDRewardedVideo rewardedVideo) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidBecomeUnavailable:")
	default void rewardedVideoDidBecomeUnavailable(
			APDRewardedVideo rewardedVideo) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidDisappear:")
	default void rewardedVideoDidDisappear(APDRewardedVideo rewardedVideo) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidLoad:")
	default void rewardedVideoDidLoad(APDRewardedVideo rewardedVideo) {
		throw new java.lang.UnsupportedOperationException();
	}
}