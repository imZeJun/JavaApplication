package com.demo.lizejun.javaapp;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ServiceConnection mConnection;
    private IBindWorker mWorker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindService();
        findViewById(R.id.tv_hello).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mWorker != null) {
                    //调用接口方法。
                    Log.d("IBindWorker", "result=" + mWorker.add(1, 2));
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unBindService();
    }

    private void bindService() {
        Intent intent = new Intent(this, BindWorkerService.class);
        mConnection = new BindWorkerConnection();
        bindService(intent, mConnection, Service.BIND_AUTO_CREATE);
    }

    private void unBindService() {
        unbindService(mConnection);
    }

    private void startService() {
        Intent intent = new Intent(this, CommandWorkerService.class);
        intent.setAction(CommandWorkerService.ACTION_LOG);
        intent.putExtra(CommandWorkerService.ACTION_KEY_LOG_MSG, "Call CommandWorkerService");
        startService(intent);
    }

    private void stopService() {
        Intent intent = new Intent(this, CommandWorkerService.class);
        stopService(intent);
    }

    private class BindWorkerConnection implements ServiceConnection {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //通过返回的 IBinder 子类，与 Service 进行交互。
            mWorker = (IBindWorker) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    }
}
