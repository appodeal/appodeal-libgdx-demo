package org.moe.appodeal.protocol;


import org.moe.appodeal.APDInterstitialAd;
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
@ObjCProtocolName("APDInterstitalAdRequestDelegate")
public interface APDInterstitalAdRequestDelegate {
	@Generated
	@IsOptional
	@Selector("interstitial:didFinishMediationAdWasFilled:")
	default void interstitialDidFinishMediationAdWasFilled(
			APDInterstitialAd interstitial, boolean filled) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitial:didRecieveResponseFromAdNetwork:wasFilled:")
	default void interstitialDidRecieveResponseFromAdNetworkWasFilled(
			APDInterstitialAd interstitial, String adNetwork, boolean filled) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitial:logClickForAdNetwork:")
	default void interstitialLogClickForAdNetwork(
			APDInterstitialAd interstitial, String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitial:logImpressionForAdNetwork:")
	default void interstitialLogImpressionForAdNetwork(
			APDInterstitialAd interstitial, String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitial:willSendRequestToAdNetwork:")
	default void interstitialWillSendRequestToAdNetwork(
			APDInterstitialAd interstitial, String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidStartMediation:")
	default void interstitialDidStartMediation(APDInterstitialAd interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}
}