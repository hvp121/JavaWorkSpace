package com.manojbhadane.javaworkspace;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by manoj.bhadane on 14-12-2017.
 */
public class BActivity extends AppCompatActivity
{
    AnotherService mService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        printMsg("onCreate");

        Intent intent = new Intent(BActivity.this, AnotherService.class);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);

    }

    ServiceConnection serviceConnection = new ServiceConnection()
    {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder)
        {
            AnotherService.BinderClass binderClass = (AnotherService.BinderClass) iBinder;
            mService = binderClass.getService();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName)
        {

        }
    };

    @Override
    protected void onStart()
    {
        super.onStart();
        printMsg("onStart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        printMsg("onResume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        printMsg("onPause");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        printMsg("onStop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        printMsg("onDestroy");
    }

    private void printMsg(String methodname)
    {
        Log.e("-----B-Activity-----", "---" + methodname);
    }
}
