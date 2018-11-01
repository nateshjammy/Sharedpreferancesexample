package com.example.admin.sharedpreferances;

import android.app.Application;
import android.content.Context;

import static com.example.admin.sharedpreferances.Utility.Constants.BUILD_TYPE_DEBUG;

public class TimeTrex extends Application {

    private static TimeTrex TimeTrexApp;


    @Override
    public void onCreate() {
        super.onCreate();
        TimeTrexApp = this;

        // Add fabric to beta and release build
        if (!BuildConfig.BUILD_TYPE.equals(BUILD_TYPE_DEBUG)) {

        }
    }

    public static TimeTrex getInstance() {
        return TimeTrexApp;
    }

    public static Context getStaticContext() {
        return getInstance().getApplicationContext();
    }


}
