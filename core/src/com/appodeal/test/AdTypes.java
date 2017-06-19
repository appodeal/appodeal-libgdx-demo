package com.appodeal.test;

import com.appodeal.gdx.GdxAppodeal;

public enum AdTypes {
    NONE(GdxAppodeal.NONE),
    INTERSTITIAL(GdxAppodeal.INTERSTITIAL),
    NON_SKIPPABLE_VIDEO(GdxAppodeal.NON_SKIPPABLE_VIDEO),
    REWARDED_VIDEO(GdxAppodeal.REWARDED_VIDEO),
    BANNER(GdxAppodeal.BANNER),
    BANNER_BOTTOM(GdxAppodeal.BANNER_BOTTOM),
    BANNER_TOP(GdxAppodeal.BANNER_TOP);

    int value;

    AdTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
