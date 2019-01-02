package com.demo.lizejun.javaapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;

/**
 * @author lizejun
 **/
public class CommandWorkerService extends Service {

    private static final String TAG = CommandWorkerService.class.getSimpleName();

    public static final String ACTION_LOG = "com.android.action.log";
    public static final String ACTION_KEY_LOG_MSG = "com.android.action.log.msg";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handleIntent(intent);
        return super.onStartCommand(intent, flags, startId);
    }

    private void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            switch (action) {
                case ACTION_LOG:
                    Log.d(TAG, intent.getStringExtra(ACTION_KEY_LOG_MSG));
                    break;
                default:
                    break;
            }
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
