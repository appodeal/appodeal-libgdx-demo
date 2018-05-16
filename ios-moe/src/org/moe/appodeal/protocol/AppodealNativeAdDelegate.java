package org.moe.appodeal.protocol;


import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Appodeal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AppodealNativeAdDelegate")
public interface AppodealNativeAdDelegate {
	@Generated
	@Selector("didFailToLoadNativeAdsWithError:")
	void didFailToLoadNativeAdsWithError(NSError error);

	@Generated
	@Selector("didLoadNativeAds:")
	void didLoadNativeAds(@NInt long count);
}