package org.moe.appodeal.enums;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class APDError {
	@Generated
	private APDError() {
	}

	@Generated
	@NInt
	public static final long APDUnknownError = 0x000000000BADDEA1L;
	@Generated
	@NInt
	public static final long APDInternalInconsistencyError = 0x000000000BADDEA2L;
	@Generated
	@NInt
	public static final long APDNetworkingError = 0x000000000BADDEA3L;
	@Generated
	@NInt
	public static final long APDJSONDecodeError = 0x000000000BADDEA4L;
	@Generated
	@NInt
	public static final long APDNoFillError = 0x000000000BADDEA5L;
	@Generated
	@NInt
	public static final long APDMediationError = 0x000000000BADDEA6L;
	@Generated
	@NInt
	public static final long APDPresentationError = 0x000000000BADDEA7L;
	@Generated
	@NInt
	public static final long APDInconsistencyPresentationError = 0x000000000BADDEA8L;
	@Generated
	@NInt
	public static final long APDInvalidAdSizeError = 0x000000000BADDEA9L;
	@Generated
	@NInt
	public static final long APDHandledExceptionError = 0x000000000BADDEAAL;
	@Generated
	@NInt
	public static final long APDInvalidAdTypeError = 0x000000000BADDEABL;
	@Generated
	@NInt
	public static final long APDIncorrectAdUnitError = 0x000000000BADDEACL;
	@Generated
	@NInt
	public static final long APDUnarchiveError = 0x000000000BADDEADL;
	@Generated
	@NInt
	public static final long APDLowMemoryError = 0x000000000BADDEAEL;
}