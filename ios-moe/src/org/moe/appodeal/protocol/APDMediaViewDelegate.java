package org.moe.appodeal.protocol;


import apple.uikit.UIView;
import org.moe.appodeal.APDMediaView;
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
@ObjCProtocolName("APDMediaViewDelegate")
public interface APDMediaViewDelegate {
	@Generated
	@IsOptional
	@Selector("mediaView:didPresentFullScreenView:")
	default void mediaViewDidPresentFullScreenView(APDMediaView mediaView,
			UIView presentedView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mediaViewDidDismissFullScreen:")
	default void mediaViewDidDismissFullScreen(APDMediaView mediaView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mediaViewFinishPlaying:videoWasSkipped:")
	default void mediaViewFinishPlayingVideoWasSkipped(APDMediaView mediaView,
			boolean wasSkipped) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("mediaViewStartPlaying:")
	default void mediaViewStartPlaying(APDMediaView mediaView) {
		throw new java.lang.UnsupportedOperationException();
	}
}