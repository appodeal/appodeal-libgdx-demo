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
@ObjCProtocolName("AppodealNonSkippableVideoDelegate")
public interface AppodealNonSkippableVideoDelegate {
	@Generated
	@IsOptional
	@Deprecated
	@Selector("nonSkippableVideoDidClick")
	default void nonSkippableVideoDidClick() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nonSkippableVideoDidFailToLoadAd")
	default void nonSkippableVideoDidFailToLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nonSkippableVideoDidFailToPresent")
	default void nonSkippableVideoDidFailToPresent() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nonSkippableVideoDidFinish")
	default void nonSkippableVideoDidFinish() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nonSkippableVideoDidLoadAd")
	default void nonSkippableVideoDidLoadAd() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nonSkippableVideoDidPresent")
	default void nonSkippableVideoDidPresent() {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nonSkippableVideoWillDismiss")
	default void nonSkippableVideoWillDismiss() {
		throw new java.lang.UnsupportedOperationException();
	}
}