package com.demo.lizejun.javaapp;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * @author lizejun
 **/
public class BindWorkerService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("BindWorkerService", "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new BindWorker();
    }

    private class BindWorker extends Binder implements IBindWorker {

        @Override
        public int add(int a, int b) {
            return a + b;
        }
    }
}
