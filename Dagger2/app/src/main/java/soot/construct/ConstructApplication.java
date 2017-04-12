package soot.construct;

import android.app.Application;

import soot.construct.di.ApplicationComponent;

/**
 * Created by Soot on 01/04/2017.
 */

public class ConstructApplication extends Application {
    public static final String PREFERENCES_NAME = "scb.preferences";
    public ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//
//        mApplicationComponent = DaggerApplicationComponent.builder()
//                .applicationModule(new ApplicationModule(this))
//                .build();
    }
}
