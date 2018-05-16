package org.moe.appodeal.protocol;


import apple.foundation.NSError;
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
@ObjCProtocolName("APDInterstitalAdDelegate")
public interface APDInterstitalAdDelegate {
	@Generated
	@IsOptional
	@Selector("interstitialAd:didFailToLoadWithError:")
	default void interstitialAdDidFailToLoadWithError(
			APDInterstitialAd interstitialAd, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialAd:didFailToPresentWithError:")
	default void interstitialAdDidFailToPresentWithError(
			APDInterstitialAd interstitialAd, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialAdDidAppear:")
	default void interstitialAdDidAppear(APDInterstitialAd interstitialAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialAdDidDisappear:")
	default void interstitialAdDidDisappear(APDInterstitialAd interstitialAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialAdDidLoad:")
	default void interstitialAdDidLoad(APDInterstitialAd interstitialAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialAdDidRecieveTapAction:")
	default void interstitialAdDidRecieveTapAction(
			APDInterstitialAd interstitialAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("precacheInterstitialAdDidLoad:")
	default void precacheInterstitialAdDidLoad(
			APDInterstitialAd precacheInterstitial) {
		throw new java.lang.UnsupportedOperationException();
	}
}