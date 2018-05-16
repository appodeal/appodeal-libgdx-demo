package org.moe.appodeal;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
public class APDSdk extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected APDSdk(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native APDSdk alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

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
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("disableUserInfoForNetworkName:")
	public native void disableUserInfoForNetworkName(String networkName);

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native APDSdk init();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("initializeForAdTypes:")
	public native void initializeForAdTypes(@NUInt long adTypes);

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
	@Selector("isInitializedForAdType:")
	public native boolean isInitializedForAdType(@NUInt long adType);

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
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resetUUID")
	public native void resetUUID();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setChildDirectedTreatment:")
	public native void setChildDirectedTreatment(boolean childDirectedTreatment);

	@Generated
	@Selector("setCustomRule:")
	public native void setCustomRule(NSDictionary<?, ?> customRule);

	@Generated
	@Selector("setFramework:")
	public native void setFramework(@NUInt long framework);

	@Generated
	@Selector("setLocationTracking:")
	public native void setLocationTracking(boolean enabled);

	@Generated
	@Selector("setLogLevel:")
	public native void setLogLevel(@NUInt long logLevel);

	@Generated
	@Selector("setMinimumFreeMemoryPercentage:observeSystemWarnings:forAdType:")
	public native void setMinimumFreeMemoryPercentageObserveSystemWarningsForAdType(
			@NUInt long percentage, boolean observeSystemWarnings,
			@NUInt long type);

	@Generated
	@Selector("setPluginVersion:")
	public native void setPluginVersion(String pluginVersion);

	@Generated
	@Selector("setTesingMode:")
	public native void setTesingMode(boolean enabled);

	@Generated
	@Selector("setUserInfo:")
	public native void setUserInfo(APDUserInfo userInfo);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("sharedSdk")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedSdk();

	@Generated
	@Selector("sharedSdkWithApiKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object sharedSdkWithApiKey(String apiKey);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("trackInAppPurchase:currency:")
	public native void trackInAppPurchaseCurrency(NSNumber amount,
			String currency);

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}