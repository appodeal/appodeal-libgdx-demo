package org.moe.appodeal.protocol;


import org.moe.appodeal.APDBannerView;
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
@ObjCProtocolName("APDBannerViewRequestDelegate")
public interface APDBannerViewRequestDelegate {
	@Generated
	@IsOptional
	@Selector("bannerView:didFinishMediationAdWasFilled:")
	default void bannerViewDidFinishMediationAdWasFilled(
			APDBannerView bannerView, boolean filled) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerView:didRecieveResponseFromAdNetwork:wasFilled:")
	default void bannerViewDidRecieveResponseFromAdNetworkWasFilled(
			APDBannerView bannerView, String adNetwork, boolean filled) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerView:logClickForAdNetwork:")
	default void bannerViewLogClickForAdNetwork(APDBannerView bannerView,
			String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerView:logImpressionForAdNetwork:")
	default void bannerViewLogImpressionForAdNetwork(APDBannerView bannerView,
			String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerView:willSendRequestToAdNetwork:")
	default void bannerViewWillSendRequestToAdNetwork(APDBannerView bannerView,
			String adNetwork) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerViewDidStartMediation:")
	default void bannerViewDidStartMediation(APDBannerView bannerView) {
		throw new java.lang.UnsupportedOperationException();
	}
}