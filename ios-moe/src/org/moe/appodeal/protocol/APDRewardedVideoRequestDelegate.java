package org.moe.appodeal.protocol;


import org.moe.appodeal.APDRewardedVideo;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Appodeal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("APDRewardedVideoRequestDelegate")
public interface APDRewardedVideoRequestDelegate {
	@Generated
	@IsOptional
	@Selector("rewardedVideo:didFinishMediationAdWasFilled:")
	default void rewardedVideoDidFinishMediationAdWasFilled(
			APDRewardedVideo rewardedVideo, boolean filled) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideo:didRecieveResponseFromAdNetwork:wasFilled:")
	default void rewardedVideoDidRecieveResponseFromAdNetworkWasFilled(
			APDRewardedVideo rewardedVideo, String adNetwork, boolean filled) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideo:logClickForAdNetwork:")
	default void rewardedVideoLogClickForAdNetwork(
			APDRewardedVideo rewardedVideo, String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideo:logImpressionForAdNetwork:")
	default void rewardedVideoLogImpressionForAdNetwork(
			APDRewardedVideo rewardedVideo, String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideo:willSendRequestToAdNetwork:")
	default void rewardedVideoWillSendRequestToAdNetwork(
			APDRewardedVideo rewardedVideo, String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("rewardedVideoDidStartMediation:")
	default void rewardedVideoDidStartMediation(APDRewardedVideo rewardedVideo) {
		throw new java.lang.UnsupportedOperationException();
	}
}