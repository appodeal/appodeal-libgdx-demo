package com.badlogic.gdx.appodeal.test.android;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.appodeal.ads.Appodeal;
import com.badlogic.gdx.appodeal.test.GdxAppodealTest;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
    private RelativeLayout layout;
    private View gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GdxAppodealTest.APP_ID = "c7d96e93eb8714521b3f0408db3082c0c12891b2388cf41d";
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

        layout = new RelativeLayout(this);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        gameView = initializeForView(new GdxAppodealTest(), config);

        RelativeLayout.LayoutParams gameParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);
        gameParams.addRule(RelativeLayout.BELOW);
        layout.addView(gameView, gameParams);
        setContentView(layout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Appodeal.onResume(this, Appodeal.BANNER);
    }
}
