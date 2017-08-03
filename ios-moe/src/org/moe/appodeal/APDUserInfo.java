package org.moe.appodeal;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
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
public class APDUserInfo extends NSObject implements
		org.moe.appodeal.protocol.APDUserInfo {
	static {
		NatJ.register();
	}

	@Generated
	protected APDUserInfo(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("age")
	@NUInt
	public native long age();

	@Generated
	@Selector("alcoholAttitude")
	@NUInt
	public native long alcoholAttitude();

	@Generated
	@Owned
	@Selector("alloc")
	public static native APDUserInfo alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("birthday")
	public native NSDate birthday();

	@Generated
	@Selector("birthdayString")
	public native String birthdayString();

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
	@Selector("email")
	public native String email();

	@Generated
	@Selector("ext")
	public native NSDictionary<?, ?> ext();

	@Generated
	@Selector("gender")
	@NUInt
	public native long gender();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native APDUserInfo init();

	@Generated
	@Selector("initialize")
	public static native void initialize();

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
	@Selector("interests")
	public native NSArray<?> interests();

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
	@Selector("occupation")
	@NUInt
	public native long occupation();

	@Generated
	@Selector("relationship")
	@NUInt
	public native long relationship();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setAge:")
	public native void setAge(@NUInt long value);

	@Generated
	@Selector("setAlcoholAttitude:")
	public native void setAlcoholAttitude(@NUInt long value);

	@Generated
	@Selector("setBirthday:")
	public native void setBirthday(NSDate value);

	@Generated
	@Selector("setEmail:")
	public native void setEmail(String value);

	@Generated
	@Selector("setGender:")
	public native void setGender(@NUInt long value);

	@Generated
	@Selector("setInterests:")
	public native void setInterests(NSArray<?> value);

	@Generated
	@Selector("setOccupation:")
	public native void setOccupation(@NUInt long value);

	@Generated
	@Selector("setRelationship:")
	public native void setRelationship(@NUInt long value);

	@Generated
	@Selector("setSmokingAttitude:")
	public native void setSmokingAttitude(@NUInt long value);

	@Generated
	@Selector("setUserId:")
	public native void setUserId(String value);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("smokingAttitude")
	@NUInt
	public native long smokingAttitude();

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("userId")
	public native String userId();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}