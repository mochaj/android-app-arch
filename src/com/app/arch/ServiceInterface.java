package com.app.arch;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

import com.app.arch.svc.IServiceBinder;
import com.app.arch.svc.RemoteService;
import com.app.arch.svc.ServiceBinder;

public class ServiceInterface implements ServiceConnection {

    private ServiceBinder mBinder = null;

    public void bind(Activity activity) {
        activity.bindService(new Intent(activity, RemoteService.class), this, 0);
    }

    public void unbind(Activity activity) {
        activity.unbindService(this);
    }

    public void invoke() {
    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        mBinder = (ServiceBinder) IServiceBinder.Stub.asInterface(service);
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        mBinder = null;
    }
}
