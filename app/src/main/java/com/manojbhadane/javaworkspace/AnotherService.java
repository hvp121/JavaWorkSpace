package com.manojbhadane.javaworkspace;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.animation.AnticipateOvershootInterpolator;

/**
 * Created by manoj.bhadane on 14-12-2017.
 */
public class AnotherService extends Service
{
    Binder binder=new BinderClass();

    public class BinderClass extends Binder
    {
        AnotherService getService()
        {
            return AnotherService.this;
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return binder;
    }
}
