package xyz.ttyz.splashapplication;

import android.app.Application;

/**
 * Created by tou on 2019/5/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new ScreenAdaptation(this, 375 * 2, 667 * 2).register();
    }
}
