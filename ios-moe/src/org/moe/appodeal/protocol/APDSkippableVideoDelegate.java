package org.moe.appodeal.protocol;


import apple.foundation.NSError;
import org.moe.appodeal.APDSkippableVideo;
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
@ObjCProtocolName("APDSkippableVideoDelegate")
public interface APDSkippableVideoDelegate {
	@Generated
	@IsOptional
	@Selector("skippableVideo:didFailToLoadWithError:")
	default void skippableVideoDidFailToLoadWithError(
			APDSkippableVideo skippableVideo, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideo:didFailToPresentWithError:")
	default void skippableVideoDidFailToPresentWithError(
			APDSkippableVideo skippableVideo, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidAppear:")
	default void skippableVideoDidAppear(APDSkippableVideo skippableVideo) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidBecomeUnavailable:")
	default void skippableVideoDidBecomeUnavailable(
			APDSkippableVideo skippableVideo) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidDisappear:")
	default void skippableVideoDidDisappear(APDSkippableVideo skippableVideo) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidFinish:")
	default void skippableVideoDidFinish(APDSkippableVideo skippableVideo) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidLoad:")
	default void skippableVideoDidLoad(APDSkippableVideo skippableVideo) {
		throw new java.lang.UnsupportedOperationException();
	}
}