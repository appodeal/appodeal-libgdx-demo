package org.moe.appodeal.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.appodeal.APDNativeAd;
import org.moe.appodeal.APDNativeAdLoader;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Appodeal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("APDNativeAdLoaderDelegate")
public interface APDNativeAdLoaderDelegate {
	@Generated
	@Selector("nativeAdLoader:didFailToLoadWithError:")
	void nativeAdLoaderDidFailToLoadWithError(APDNativeAdLoader loader,
			NSError error);

	@Generated
	@Selector("nativeAdLoader:didLoadNativeAds:")
	void nativeAdLoaderDidLoadNativeAds(APDNativeAdLoader loader,
			NSArray<? extends APDNativeAd> nativeAds);
}