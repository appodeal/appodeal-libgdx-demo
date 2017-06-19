package com.appodeal.gdx.android;

import android.content.Context;

import com.appodeal.ads.Appodeal;
import com.appodeal.ads.UserSettings;


public class AndroidUserSettings extends com.appodeal.gdx.data.UserSettings{
    private UserSettings settings;
    public AndroidUserSettings(Context ctx){
        settings = Appodeal.getUserSettings(ctx);
    }
    @Override
    public void setAge(int age) {
        settings.setAge(age);
    }

    @Override
    public void setGender(com.appodeal.gdx.data.UserSettings.Gender gender) {
        UserSettings.Gender genderAndroid = UserSettings.Gender.valueOf(gender.name());
        settings.setGender(genderAndroid);
    }

}
