# Appodeal libGDX Demo

libGDX plugin for cross-platform Appodeal SDK support

## Getting Started

To start integration follow instructions on our [site](https://www.appodeal.com/sdk/ios2) or on [Wiki](https://github.com/appodeal/appodeal-libgdx-demo/wiki).

## Versions & Requirements

Current plugin version: 2.1.0

Appodeal SDK:
+ iOS 2.1.0
+ Android 2.1.0

Running OS Requirements:
+ iOS 8.1 and above
+ Android API 14 and above

iOS MOE requirements:
+ MOE 1.3.6 or above
+ libGDX 1.9.6 or above

Tested on:
+ libGDX 1.9.6
+ MOE 1.3.6

## Changelog

2.1.0 (03/08/2017)

+ Added iOS MOE Support
+ iOS Appodeal SDK updated to 2.1.0
+ Android Appodeal SDK updated to 2.1.0
+ added GdxAppodeal.canShow method
+ added GdxAppodeal.startTestActivity method (Android only) to test networks integration
+ added GdxAppodeal.muteVideosIfCallsMuted (Android only, iOS handled by OS) to mute ads sound if calls muted on phone
+ GdxAppodeal.setOnLoadedTriggerBoth method renamed to GdxAppodeal.setTriggerOnLoadedOnPrecache
