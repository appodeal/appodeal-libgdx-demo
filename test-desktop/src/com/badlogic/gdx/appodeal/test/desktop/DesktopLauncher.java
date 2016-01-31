package com.badlogic.gdx.appodeal.test.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.appodeal.test.GdxAppodealTest;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class DesktopLauncher {
    public static void main(String[] arg) {
        //Just to quickly testing UIs in desktop
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 480;
        config.height = 800;

        new LwjglApplication(new GdxAppodealTest(), config);
    }
}
