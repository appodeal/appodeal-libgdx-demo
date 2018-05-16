package org.moe.appodeal.protocol;


import apple.foundation.NSError;
import org.moe.appodeal.APDNativeAdQueue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Appodeal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("APDNativeAdQueueDelegate")
public interface APDNativeAdQueueDelegate {
	@Generated
	@IsOptional
	@Selector("adQueue:failedWithError:")
	default void adQueueFailedWithError(APDNativeAdQueue adQueue, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("adQueueAdIsAvailable:ofCount:")
	default void adQueueAdIsAvailableOfCount(APDNativeAdQueue adQueue,
			@NInt long count) {
		throw new java.lang.UnsupportedOperationException();
	}
}