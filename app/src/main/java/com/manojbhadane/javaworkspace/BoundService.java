package com.manojbhadane.javaworkspace;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by manoj.bhadane on 14-12-2017.
 */
public class BoundService extends Service
{
    private final IBinder mBinder = new LocalBinder();

    public class LocalBinder extends Binder
    {
        BoundService getService()
        {
            return BoundService.this;
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return mBinder;
    }

    public String printMsg()
    {
        return "----------Manoj Bhadane";
    }

}
