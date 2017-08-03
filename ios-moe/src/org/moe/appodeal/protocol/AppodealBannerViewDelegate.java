package org.moe.appodeal.protocol;


import apple.foundation.NSError;
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
@ObjCProtocolName("AppodealBannerViewDelegate")
public interface AppodealBannerViewDelegate {
	@Generated
	@IsOptional
	@Selector("bannerView:didFailToLoadAdWithError:")
	default void bannerViewDidFailToLoadAdWithError(APDBannerView bannerView,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerViewDidInteract:")
	default void bannerViewDidInteract(APDBannerView bannerView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerViewDidLoadAd:")
	default void bannerViewDidLoadAd(APDBannerView bannerView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Deprecated
	@Selector("bannerViewDidRefresh:")
	default void bannerViewDidRefresh(APDBannerView bannerView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerViewDidShow:")
	default void bannerViewDidShow(APDBannerView bannerView) {
		throw new java.lang.UnsupportedOperationException();
	}
}