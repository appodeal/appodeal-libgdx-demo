package com.appodeal.gdx;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.reflect.ClassReflection;
import com.badlogic.gdx.utils.reflect.ReflectionException;

public class GdxAppodealLoader {

    private static final String CLASS_NAME_APPODEAL_ANDROID = "com.appodeal.gdx.android.AndroidGdxAppodeal";
    private static final String CLASS_NAME_APPODEAL_IOS = "com.appodeal.gdx.ios.iOSGdxAppodeal";

    private static Class<?> gdxClazz = null;
    private static Object gdxAppObject = null;

    public static AppodealInterface buildAPI() {
        loadGdxReflections();

        if (Gdx.app.getType() == Application.ApplicationType.Android)
            return getAndroidAppodealAPI();
        else if (Gdx.app.getType() == Application.ApplicationType.iOS)
            return getIOSAppodealAPI();
        else
            return new DisabledGdxAppodeal();
    }

    private static void loadGdxReflections() {
        try {
            gdxClazz = ClassReflection.forName("com.badlogic.gdx.Gdx");
            gdxAppObject = ClassReflection.getField(gdxClazz, "app").get(null);
        } catch (ReflectionException e) {
            throw new RuntimeException("No libGDX environment. \n");
        }

    }

    private static AppodealInterface getIOSAppodealAPI() {
        try {
            final Class<?> appodealClazz = ClassReflection.forName(CLASS_NAME_APPODEAL_IOS);
            Object appodeal = ClassReflection.getConstructor(appodealClazz).newInstance();
            Gdx.app.debug(GdxAppodeal.TAG, "GdxAppodeal for iOS loaded successfully.");
            return (AppodealInterface) appodeal;
        } catch (ReflectionException e) {
            Gdx.app.debug(GdxAppodeal.TAG, "Error creating GdxAppodeal for iOS.");
            e.printStackTrace();
            return new DisabledGdxAppodeal();
        }
    }

    private static AppodealInterface getAndroidAppodealAPI() {
        try {
            Class<?> activityClazz = ClassReflection.forName("android.app.Activity");
            final Class<?> appodealClazz = ClassReflection.forName(CLASS_NAME_APPODEAL_ANDROID);
            Object appodeal = ClassReflection.getConstructor(appodealClazz).newInstance();

            Gdx.app.debug(GdxAppodeal.TAG, "GdxAppodeal for Android loaded successfully.");
            return (AppodealInterface) appodeal;
        } catch (ReflectionException e) {
            Gdx.app.debug(GdxAppodeal.TAG, "Error creating GdxAppodeal for Android.");
            e.printStackTrace();
            return new DisabledGdxAppodeal();
        }
    }
}