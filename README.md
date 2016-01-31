# **GdxAppodeal** #

# Integration #

* ## core ##
    * Add the following dependencies in build.gradle
```
#!groovy
compile "com.appodeal.gdx:gdx-appodeal-core:1.0.0"
```

* ## android ##
    * Add the following dependencies in build.gradle
```
#!groovy
compile "com.appodeal.gdx:gdx-appodeal-android:1.12.8@aar"
compile "com.google.android.gms:play-services-ads:6.5.+"
```
    * If proguard is enabled, add this:

```
#!proguard

## GdxAppodeal ##
-keep public class com.appodeal.gdx.** {
  public protected *;
}

## Appodeal ##
-keep class com.appodeal.** { *; }
-keep class com.applovin.** { *; }
-keep class com.mopub.** { *; }
-keep class org.nexage.** { *; }
-keep class com.chartboost.** { *; }
-dontwarn com.chartboost.**
-keep class com.amazon.** { *; }
-keep class com.google.android.gms.ads.** { *; }
-keep class com.google.android.gms.common.GooglePlayServicesUtil { *; }
-keep class ru.mail.android.mytarget.** { *; }
-dontwarn ru.mail.android.mytarget.**
-keep class com.unity3d.ads.** { *; }
-keep class com.applifier.** { *; }

-keep class * extends java.util.ListResourceBundle {
protected Object[][] getContents();
}
-keep public class com.google.android.gms.common.internal.safeparcel.SafeParcelable {
public static final *** NULL;
}
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
@com.google.android.gms.common.annotation.KeepName *;
}
-keepnames class * implements android.os.Parcelable {
public static final ** CREATOR;
}

```

* ## iOS ##
    * Add the following dependencies in build.gradle
```
#!groovy
compile "org.robovm.bindings:appodeal:1.0.0"
compile "com.appodeal.gdx:gdx-appodeal-ios:1.0.0"

```
    * Add the following entry in robovm.xml

```
#!xml

  <forceLinkClasses>
    ...
    <pattern>com.appodeal.gdx.ios.IOSGdxAppodeal</pattern>
  </forceLinkClasses>

```

# Usage #

```
#!java

//To init the SDK
GdxAppodeal.getInstance().init("YOUR_APPODEAL_APP_KEY");

//To show ads
GdxAppodeal.getInstance().show(GdxAppodeal.ANY);

//To hide ads
GdxAppodeal.getInstance().hide(GdxAppodeal.ANY)
```
