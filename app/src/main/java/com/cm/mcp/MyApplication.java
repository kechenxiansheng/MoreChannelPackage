package com.cm.mcp;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.support.multidex.MultiDex;

public class MyApplication extends Application {

    public MyApplication() {
    }

    public void onCreate() {
        super.onCreate();
    }

    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    public void onTerminate() {
        super.onTerminate();
    }
}
