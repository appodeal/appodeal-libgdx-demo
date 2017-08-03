package com.appodeal.gdx.ios;

import org.moe.appodeal.Appodeal;
import org.moe.appodeal.enums.APDUserGender;

public class iOSUserSettings extends com.appodeal.gdx.data.UserSettings {

    public iOSUserSettings() { }

    @Override
    public void setAge(int age) {
        Appodeal.setUserAge(age);
    }

    @Override
    public void setGender(Gender gender) {
        if(gender.equals(Gender.OTHER)) {
            Appodeal.setUserGender(APDUserGender.Other);
        } else if(gender.equals(Gender.FEMALE)) {
            Appodeal.setUserGender(APDUserGender.Female);
        } else if(gender.equals(Gender.MALE)) {
            Appodeal.setUserGender(APDUserGender.Male);
        }
    }
}