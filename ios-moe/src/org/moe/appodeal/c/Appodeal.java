package org.moe.appodeal.c;


import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Appodeal")
@Runtime(CRuntime.class)
public final class Appodeal {
	static {
		NatJ.register();
	}

	@Generated
	private Appodeal() {
	}

	@Generated
	@CFunction
	public static native NSArray<?> AppodealAvailableUnitSizes();

	@Generated
	@CFunction
	public static native boolean AppodealIsUnitSizeSupported(
			@ByValue CGSize size, NSArray<?> supportedSizes);

	@Generated
	@CFunction
	public static native boolean AppodealIsUnitSizeAvailable(
			@ByValue CGSize size);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize AppodealNearestUnitSizeForSize(
			@ByValue CGSize size);

	@Generated
	@CFunction
	public static native boolean APDIsAdSizeValid(@ByValue CGSize size);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize APDNearestValidAdSizeForCGSize(
			@ByValue CGSize size);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String APDSdkVersionString();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize kAppodealUnitSize_320x50();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize kAppodealUnitSize_300x250();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize kAppodealUnitSize_728x90();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize kAPDAdSize320x50();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize kAPDAdSize728x90();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize kAPDAdSize300x250();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize kAPDImageSizeUndefined();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kAPDErrorDomain();
}