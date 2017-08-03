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
@ObjCProtocolName("AppodealBannerDelegate")
public interface AppodealBannerDelegate {
	@Generated
	@IsOptional
	@Selector("bannerDidClick")
	default void bannerDidClick() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerDidFailToLoadAd")
	default void bannerDidFailToLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Deprecated
	@Selector("bannerDidLoadAd")
	default void bannerDidLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerDidLoadAdIsPrecache:")
	default void bannerDidLoadAdIsPrecache(boolean precache) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Deprecated
	@Selector("bannerDidRefresh")
	default void bannerDidRefresh() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("bannerDidShow")
	default void bannerDidShow() {
		throw new java.lang.UnsupportedOperationException();
	}
}