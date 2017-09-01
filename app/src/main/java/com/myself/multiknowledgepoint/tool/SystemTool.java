package com.myself.multiknowledgepoint.tool;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

/**
 * 类的描述: 系统方面的工具
 */
public class SystemTool {

    /**
     * 方法描述: 获取当前进程的名称
     */
    public static String getCurrentProcessName(Context context) {
        // 获取当前进程的pid
        int pid = android.os.Process.myPid();
        String processName = "";
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningAppProcessInfo process : manager.getRunningAppProcesses()) {
            if (process.pid == pid) {
                // 获取当前进程的名称
                processName = process.processName;
            }
        }
        return processName;
    }

    /**
     * 方法描述: 获取主进程的名称
     */
    public static String getMainProcessName(Context context) {
        return context.getPackageName();
    }

    /**
     * 方法描述: 判断当前进程是否时主进程
     */
    public static boolean isMainProcess(Context context) {
        String currentProcessName = getCurrentProcessName(context);
        Log.v("process", "当前进程名称: " + currentProcessName);
        String mainProcessName = getMainProcessName(context);
        Log.v("process", "主进程名称: " + mainProcessName);
        return currentProcessName.equals(mainProcessName);
    }
}
