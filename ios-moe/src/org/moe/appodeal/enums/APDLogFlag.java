package org.moe.appodeal.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class APDLogFlag {
	@Generated
	private APDLogFlag() {
	}

	@Generated
	@NUInt
	public static final long APDLogFlagError = 0x0000000000000001L;
	@Generated
	@NUInt
	public static final long APDLogFlagWarning = 0x0000000000000002L;
	@Generated
	@NUInt
	public static final long APDLogFlagInfo = 0x0000000000000004L;
	@Generated
	@NUInt
	public static final long APDLogFlagDebug = 0x0000000000000008L;
	@Generated
	@NUInt
	public static final long APDlogFlagVerbose = 0x0000000000000010L;
}