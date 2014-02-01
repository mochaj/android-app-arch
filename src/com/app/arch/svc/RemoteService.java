package com.app.arch.svc;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.app.arch.BaseActivity;

public class RemoteService extends Service {

    private ServiceBinder mBinder;

    @Override
    public void onCreate() {
        super.onCreate();

        mBinder = new ServiceBinder();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        handleCommand(intent, startId);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handleCommand(intent, startId);
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private void handleCommand(Intent intent, int startId) {
        // process
        stopSelfResult(startId);
    }

    private void makeForeground() {
        Notification notification = new Notification(R.drawable.icon,
                getText(R.string.ticker_text), System.currentTimeMillis());
        Intent notificationIntent = new Intent(this, BaseActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
                notificationIntent, 0);
        notification.setLatestEventInfo(this,
                getText(R.string.notification_title),
                getText(R.string.notification_message), pendingIntent);
        startForeground(ONGOING_NOTIFICATION_ID, notification);
    }

    private void makeBackground() {
        stopForeground(true);
    }
}
