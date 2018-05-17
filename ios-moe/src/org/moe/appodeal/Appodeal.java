package org.moe.appodeal;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
import org.moe.appodeal.protocol.APDReward;
import org.moe.appodeal.protocol.AppodealBannerDelegate;
import org.moe.appodeal.protocol.AppodealInterstitialDelegate;
import org.moe.appodeal.protocol.AppodealNativeAdDelegate;
import org.moe.appodeal.protocol.AppodealNonSkippableVideoDelegate;
import org.moe.appodeal.protocol.AppodealRequestDelegate;
import org.moe.appodeal.protocol.AppodealRewardedVideoDelegate;
import org.moe.appodeal.protocol.AppodealSkippableVideoDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Appodeal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class Appodeal extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected Appodeal(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native Appodeal alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("availableNativeAdsCount")
	@NInt
	public static native long availableNativeAdsCount();

	@Generated
	@Selector("banner")
	public static native UIView banner();

	@Generated
	@Selector("cacheAd:")
	public static native void cacheAd(@NInt long type);

	@Generated
	@Selector("cacheAd:forPlacement:")
	public static native void cacheAdForPlacement(@NInt long type,
			String placement);

	@Generated
	@Selector("canShowAd:forPlacement:")
	public static native boolean canShowAdForPlacement(@NInt long style,
			String placement);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("confirmUsage:")
	public static native void confirmUsage(@NInt long adTypes);

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Deprecated
	@Selector("disableLocationPermissionCheck")
	public static native void disableLocationPermissionCheck();

	@Generated
	@Deprecated
	@Selector("disableNetworkForAdType:name:")
	public static native void disableNetworkForAdTypeName(@NInt long adType,
			String networkName);

	@Generated
	@Selector("disableUserData:")
	public static native void disableUserData(String networkName);

	@Generated
	@Selector("getNativeAdsOfCount:")
	public static native NSArray<?> getNativeAdsOfCount(@NInt long count);

	@Generated
	@Selector("getUUID")
	public static native String getUUID();

	@Generated
	@Selector("getVersion")
	public static native String getVersion();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("hideBanner")
	public static native void hideBanner();

	@Generated
	@Selector("init")
	public native Appodeal init();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("initializeWithApiKey:types:")
	public static native void initializeWithApiKeyTypes(String apiKey,
			@NInt long types);

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isAutocacheEnabled:")
	public static native boolean isAutocacheEnabled(@NInt long types);

	@Generated
	@Selector("isInitalized")
	public static native boolean isInitalized();

	@Generated
	@Selector("isReadyForShowWithStyle:")
	public static native boolean isReadyForShowWithStyle(@NInt long showStyle);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("loadNaitveAd:capacity:")
	public static native void loadNaitveAdCapacity(@NUInt long type,
			@NInt long capacity);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("rewardForPlacement:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native APDReward rewardForPlacement(String placement);

	@Generated
	@Selector("setAutocache:types:")
	public static native void setAutocacheTypes(boolean autocache,
			@NInt long types);

	@Generated
	@Selector("setBannerAnimationEnabled:")
	public static native void setBannerAnimationEnabled(
			boolean bannerAnimationEnabled);

	@Generated
	@Selector("setBannerBackgroundVisible:")
	public static native void setBannerBackgroundVisible(
			boolean bannerBackgroundVisible);

	@Generated
	@Selector("setBannerDelegate:")
	public static native void setBannerDelegate(
			@Mapped(ObjCObjectMapper.class) AppodealBannerDelegate bannerDelegate);

	@Generated
	@Selector("setChildDirectedTreatment:")
	public static native void setChildDirectedTreatment(
			boolean childDirectedTreatment);

	@Generated
	@Selector("setCustomRule:")
	public static native void setCustomRule(NSDictionary<?, ?> customRule);

	@Generated
	@Selector("setDebugEnabled:")
	public static native void setDebugEnabled(boolean debugEnabled);

	@Generated
	@Selector("setFramework:")
	public static native void setFramework(@NUInt long framework);

	@Generated
	@Selector("setInterstitialDelegate:")
	public static native void setInterstitialDelegate(
			@Mapped(ObjCObjectMapper.class) AppodealInterstitialDelegate interstitialDelegate);

	@Generated
	@Selector("setLocationTracking:")
	public static native void setLocationTracking(boolean enabled);

	@Generated
	@Selector("setLogLevel:")
	public static native void setLogLevel(@NUInt long logLevel);

	@Generated
	@Deprecated
	@Selector("setMinimumFreeMemoryPercentage:forAdType:")
	public static native void setMinimumFreeMemoryPercentageForAdType(
			@NUInt long percentage, @NInt long type);

	@Generated
	@Selector("setMinimumFreeMemoryPercentage:observeSystemWarnings:forAdType:")
	public static native void setMinimumFreeMemoryPercentageObserveSystemWarningsForAdType(
			@NUInt long percentage, boolean observeSystemWarnings,
			@NInt long type);

	@Generated
	@Selector("setNativeAdDelegate:")
	public static native void setNativeAdDelegate(
			@Mapped(ObjCObjectMapper.class) AppodealNativeAdDelegate nativeAdDelegate);

	@Generated
	@Selector("setNonSkippableVideoDelegate:")
	public static native void setNonSkippableVideoDelegate(
			@Mapped(ObjCObjectMapper.class) AppodealNonSkippableVideoDelegate nonSkippableVideoDelegate);

	@Generated
	@Selector("setPluginVersion:")
	public static native void setPluginVersion(String pluginVersion);

	@Generated
	@Selector("setRequestDelegate:")
	public static native void setRequestDelegate(
			@Mapped(ObjCObjectMapper.class) AppodealRequestDelegate requestDelegate);

	@Generated
	@Selector("setRewardedVideoDelegate:")
	public static native void setRewardedVideoDelegate(
			@Mapped(ObjCObjectMapper.class) AppodealRewardedVideoDelegate rewardedVideoDelegate);

	@Generated
	@Deprecated
	@Selector("setSkippableVideoDelegate:")
	public static native void setSkippableVideoDelegate(
			@Mapped(ObjCObjectMapper.class) AppodealSkippableVideoDelegate videoDelegate);

	@Generated
	@Selector("setSmartBannersEnabled:")
	public static native void setSmartBannersEnabled(boolean smartBannerEnabled);

	@Generated
	@Selector("setTestingEnabled:")
	public static native void setTestingEnabled(boolean testingEnabled);

	@Generated
	@Selector("setUserAge:")
	public static native void setUserAge(@NUInt long age);

	@Generated
	@Selector("setUserAlcoholAttitude:")
	public static native void setUserAlcoholAttitude(@NUInt long alcoholAttitude);

	@Generated
	@Selector("setUserBirthday:")
	public static native void setUserBirthday(NSDate birthday);

	@Generated
	@Selector("setUserEmail:")
	public static native void setUserEmail(String email);

	@Generated
	@Selector("setUserGender:")
	public static native void setUserGender(@NUInt long gender);

	@Generated
	@Selector("setUserId:")
	public static native void setUserId(String userId);

	@Generated
	@Selector("setUserInterests:")
	public static native void setUserInterests(String interests);

	@Generated
	@Selector("setUserOccupation:")
	public static native void setUserOccupation(@NUInt long occupation);

	@Generated
	@Selector("setUserRelationship:")
	public static native void setUserRelationship(@NUInt long relationship);

	@Generated
	@Selector("setUserSmokingAttitude:")
	public static native void setUserSmokingAttitude(@NUInt long smokingAttitude);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("showAd:forPlacement:rootViewController:")
	public static native boolean showAdForPlacementRootViewController(
			@NInt long style, String placement,
			UIViewController rootViewController);

	@Generated
	@Selector("showAd:rootViewController:")
	public static native boolean showAdRootViewController(@NInt long style,
			UIViewController rootViewController);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("trackInAppPurchase:currency:")
	public static native void trackInAppPurchaseCurrency(NSNumber amount,
			String currency);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}