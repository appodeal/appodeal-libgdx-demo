package com.appodeal.gdx.data;

public abstract class UserSettings {
    public enum Gender{FEMALE, MALE, OTHER};
    abstract public void setAge(int age);
    abstract public void setGender(Gender gender);
}
