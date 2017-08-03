package org.moe.appodeal.protocol;


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
@ObjCProtocolName("AppodealInterstitialDelegate")
public interface AppodealInterstitialDelegate {
	@Generated
	@IsOptional
	@Selector("interstitialDidClick")
	default void interstitialDidClick() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidDismiss")
	default void interstitialDidDismiss() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidFailToLoadAd")
	default void interstitialDidFailToLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidFailToPresent")
	default void interstitialDidFailToPresent() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Deprecated
	@Selector("interstitialDidLoadAd")
	default void interstitialDidLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidLoadAdisPrecache:")
	default void interstitialDidLoadAdisPrecache(boolean precache) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialWillPresent")
	default void interstitialWillPresent() {
		throw new java.lang.UnsupportedOperationException();
	}
}