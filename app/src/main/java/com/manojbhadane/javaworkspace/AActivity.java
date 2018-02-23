package com.manojbhadane.javaworkspace;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by manoj.bhadane on 14-12-2017.
 */
public class AActivity extends AppCompatActivity
{
    private BoundService mService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.btn);
        printMsg("onCreate");

//        startService(new Intent(AActivity.this, BoundService.class));
        Intent intent = new Intent(AActivity.this, BoundService.class);
        bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String msg = mService.printMsg();
                printMsg(msg);

//                startActivity(new Intent(AActivity.this, BActivity.class));
//                finish();
            }
        });
    }

    private ServiceConnection serviceConnection = new ServiceConnection()
    {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder)
        {
            BoundService.LocalBinder localBinder = (BoundService.LocalBinder) iBinder;
            mService = localBinder.getService();
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
        Log.e("-----A-Activity-----", "---" + methodname);
    }

}
