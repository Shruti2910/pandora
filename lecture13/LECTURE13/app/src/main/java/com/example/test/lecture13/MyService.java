package com.example.test.lecture13;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("logs", "onStartCommand: ");
        Toast.makeText(MyService.this, "state changed", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);


    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
