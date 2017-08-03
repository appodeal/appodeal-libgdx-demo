package org.moe.appodeal.protocol;


import org.moe.appodeal.APDNativeAd;
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
@ObjCProtocolName("APDNativeAdPresentationDelegate")
public interface APDNativeAdPresentationDelegate {
	@Generated
	@IsOptional
	@Selector("nativeAdWillLogImpression:")
	default void nativeAdWillLogImpression(APDNativeAd nativeAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillLogUserInteraction:")
	default void nativeAdWillLogUserInteraction(APDNativeAd nativeAd) {
		throw new java.lang.UnsupportedOperationException();
	}
}