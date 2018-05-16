package org.moe.appodeal.protocol;


import org.moe.appodeal.APDNativeAdLoader;
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
@ObjCProtocolName("APDNativeAdRequestDelegate")
public interface APDNativeAdRequestDelegate {
	@Generated
	@IsOptional
	@Selector("nativeAdLoader:didFinishMediationAdWasFilled:")
	default void nativeAdLoaderDidFinishMediationAdWasFilled(
			APDNativeAdLoader nativeAdLoader, boolean filled) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdLoader:didRecieveResponseFromAdNetwork:wasFilled:")
	default void nativeAdLoaderDidRecieveResponseFromAdNetworkWasFilled(
			APDNativeAdLoader nativeAdLoader, String adNetwork, boolean filled) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdLoader:willSendRequestToAdNetwork:")
	default void nativeAdLoaderWillSendRequestToAdNetwork(
			APDNativeAdLoader nativeAdLoader, String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdLoaderDidStartMediation:")
	default void nativeAdLoaderDidStartMediation(
			APDNativeAdLoader nativeAdLoader) {
		throw new java.lang.UnsupportedOperationException();
	}
}