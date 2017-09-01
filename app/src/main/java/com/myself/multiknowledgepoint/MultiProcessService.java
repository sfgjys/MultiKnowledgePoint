package com.myself.multiknowledgepoint;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * 类的描述: 用来测试多进程的服务
 */
public class MultiProcessService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Log.v("process", "MultiProcessService服务创建了");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.v("process", "MultiProcessService服务销毁了");
        super.onDestroy();
    }
}
