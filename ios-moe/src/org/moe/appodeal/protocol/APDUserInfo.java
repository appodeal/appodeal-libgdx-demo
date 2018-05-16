package org.moe.appodeal.protocol;


import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Appodeal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("APDUserInfo")
public interface APDUserInfo {
	@Generated
	@Selector("age")
	@NUInt
	long age();

	@Generated
	@Selector("alcoholAttitude")
	@NUInt
	long alcoholAttitude();

	@Generated
	@Selector("birthday")
	NSDate birthday();

	@Generated
	@Selector("birthdayString")
	String birthdayString();

	@Generated
	@Selector("email")
	String email();

	@Generated
	@Selector("ext")
	NSDictionary<?, ?> ext();

	@Generated
	@Selector("gender")
	@NUInt
	long gender();

	@Generated
	@Selector("interests")
	NSArray<?> interests();

	@Generated
	@Selector("occupation")
	@NUInt
	long occupation();

	@Generated
	@Selector("relationship")
	@NUInt
	long relationship();

	@Generated
	@Selector("smokingAttitude")
	@NUInt
	long smokingAttitude();

	@Generated
	@Selector("userId")
	String userId();
}