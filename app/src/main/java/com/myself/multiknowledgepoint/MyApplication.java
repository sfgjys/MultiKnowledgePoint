package com.myself.multiknowledgepoint;

import android.app.Application;
import android.util.Log;

import com.myself.multiknowledgepoint.tool.SystemTool;

public class MyApplication extends Application {

    private static final String TAG = "MyApplication";
    private static MyApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplication = this;

        Log.v(TAG, "MyApplication的onCreate方法被调用");

        // 多进程应用，每个进程开启时都会调用一次Application子类的onCreate方法
        if (SystemTool.isMainProcess(mApplication)) {
            Log.v("process", "开启Application子类的onCreate方法的进程--是--主进程");
        } else {
            Log.v("process", "开启Application子类的onCreate方法的进程--不是--主进程");
        }
    }

    public static MyApplication getApplication() {
        return mApplication;
    }
}
