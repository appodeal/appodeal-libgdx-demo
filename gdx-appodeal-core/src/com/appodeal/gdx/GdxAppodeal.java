package com.appodeal.gdx;

public abstract class GdxAppodeal implements Appodeal {
    public static final String TAG = "GdxAppodeal";

    public static final int NONE = 0;
    public static final int INTERSTITIAL = 1;
    public static final int SKIPPABLE_VIDEO = 2;
    public static final int REWARDED_VIDEO = 128;
    public static final int NON_SKIPPABLE_VIDEO = 128;
    public static final int BANNER = 4;
    public static final int BANNER_BOTTOM = 8;
    public static final int BANNER_TOP = 16;
    public static final int BANNER_CENTER = 32;

    private static GdxAppodeal instance;

    protected GdxAppodeal() {
    }

    public static GdxAppodeal getInstance() {
        if (instance == null) instance = GdxAppodealLoader.buildAPI();
        return instance;
    }
}