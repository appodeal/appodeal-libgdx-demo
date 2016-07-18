package com.appodeal.org.robovm.bindings.appodeal;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.rt.bro.ValuedEnum;

public class Appodeal extends NSObject {

    public enum AppodealAdType implements ValuedEnum {
        NONE(0),
        INTERSTITIAL(1),
        SKIPPABLE_VIDEO(2),
        REWARDED_VIDEO(128),
        NON_SKIPPABLE_VIDEO(128),
        BANNER(4),
        BANNER_VIEW(64);

        private final long n;

        private AppodealAdType(long n) {
            this.n = n;
        }

        @Override
        public long value() {
            return n;
        }
    }

    public enum AppodealShowStyle implements ValuedEnum {
        INTERSTITIAL(1),
        SKIPPABLE_VIDEO(2),
        REWARDED_VIDEO(128),
        NON_SKIPPABLE_VIDEO(128),
        BANNER_TOP(4),
        BANNER_BOTTOM(5),
        BANNER_VIEW(64);

        private final long n;

        private AppodealShowStyle(long n) {
            this.n = n;
        }

        @Override
        public long value() {
            return n;
        }
    }

    @Method(selector = "initializeWithApiKey:type")
    public static native Appodeal initializeWithApiKey(String apiKey, AppodealAdType type);

}
