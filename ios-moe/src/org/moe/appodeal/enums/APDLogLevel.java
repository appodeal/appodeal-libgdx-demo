package org.moe.appodeal.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class APDLogLevel {
	@Generated
	private APDLogLevel() {
	}

	@Generated
	@NUInt
	public static final long Off = 0x0000000000000000L;
	@Generated
	@NUInt
	public static final long Error = 0x0000000000000001L;
	@Generated
	@NUInt
	public static final long Warning = 0x0000000000000003L;
	@Generated
	@NUInt
	public static final long Info = 0x0000000000000007L;
	@Generated
	@NUInt
	public static final long Debug = 0x000000000000000FL;
	@Generated
	@NUInt
	public static final long Verbose = 0x000000000000001FL;
}