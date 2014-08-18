package com.example.nino.pracroidsupportlib;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by nino on 15/08/14.
 */
public class TestService extends Service{

    // indicates how to behave if the service is killed
    int serviceStartMode;
    // interface for the clients that bind
    IBinder serviceBinder;
    // on rebind restriction
    boolean serviceAllowedRebind;

    String messge = "Service: ";

    /** Called when the service is being created. */
    @Override
    public void onCreate(){
        Log.d(messge, "onCreate");
    }

    /** The service is starting, due to a call to startService() */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.d(messge, "onStartCommand");
        Toast.makeText(this, "Service started!", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    /** A client is binding to the service with bindService() */
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(messge, "onBind");
        return null;
    }

    /** Called when all clients have unbound with unbindService() */
    @Override
    public boolean onUnbind(Intent intent){
        Log.d(messge, "onUnbind");
        return serviceAllowedRebind;
    }

    /** Called when a client is binding to the service with bindService()*/
    @Override
    public void onRebind(Intent intent){
        Log.d(messge, "onRebind");
    }

    /** Called when The service is no longer used and is being destroyed */
    @Override
    public void onDestroy(){
        Log.d(messge, "onDestroy");
        super.onDestroy();
        Toast.makeText(this, "Service Stoped!", Toast.LENGTH_LONG).show();
    }
}
