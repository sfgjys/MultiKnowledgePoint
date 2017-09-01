package com.myself.multiknowledgepoint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Intent mUseToMultiProcess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 用于多进程
        mUseToMultiProcess = new Intent(this, MultiProcessService.class);
        startService(mUseToMultiProcess);
    }


    @Override
    protected void onDestroy() {
        // 用于多进程
        stopService(mUseToMultiProcess);
        super.onDestroy();
    }
}
