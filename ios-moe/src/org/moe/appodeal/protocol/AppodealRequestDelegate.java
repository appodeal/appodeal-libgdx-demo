package org.moe.appodeal.protocol;


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
@ObjCProtocolName("AppodealRequestDelegate")
public interface AppodealRequestDelegate {
	@Generated
	@Selector("didDetectClickForAdNetwork:adType:")
	void didDetectClickForAdNetworkAdType(String adNetwork, @NInt long adType);

	@Generated
	@Selector("didDetectImpressionForAdNetwork:adType:")
	void didDetectImpressionForAdNetworkAdType(String adNetwork,
			@NInt long adType);

	@Generated
	@Selector("didFinishMediationForAdType:hasFilledAd:")
	void didFinishMediationForAdTypeHasFilledAd(@NInt long adType,
			boolean filled);

	@Generated
	@Selector("didReceiveAdResponseFromAdNetwork:adType:wasFilled:")
	void didReceiveAdResponseFromAdNetworkAdTypeWasFilled(String adNetwork,
			@NInt long adType, boolean filled);

	@Generated
	@Selector("mediationDidStartForAdType:")
	void mediationDidStartForAdType(@NInt long adType);

	@Generated
	@Selector("willStartAdRequestForAdNetwork:adType:")
	void willStartAdRequestForAdNetworkAdType(String adNetwork,
			@NInt long adType);
}