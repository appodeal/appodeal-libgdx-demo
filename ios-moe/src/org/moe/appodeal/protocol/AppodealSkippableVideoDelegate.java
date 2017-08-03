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
@ObjCProtocolName("AppodealSkippableVideoDelegate")
public interface AppodealSkippableVideoDelegate {
	@Generated
	@IsOptional
	@Selector("skippableVideoDidClick")
	default void skippableVideoDidClick() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidFailToLoadAd")
	default void skippableVideoDidFailToLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidFinish")
	default void skippableVideoDidFinish() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidLoadAd")
	default void skippableVideoDidLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoDidPresent")
	default void skippableVideoDidPresent() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("skippableVideoWillDismiss")
	default void skippableVideoWillDismiss() {
		throw new java.lang.UnsupportedOperationException();
	}
}