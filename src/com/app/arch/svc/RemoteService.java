package com.app.arch.svc;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.app.arch.MainActivity;

public class RemoteService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    // thread pool for multiprocessing

    private void makeForeground() {
        Notification notification = new Notification(R.drawable.icon,
                getText(R.string.ticker_text), System.currentTimeMillis());
        Intent notificationIntent = new Intent(this, MainActivity.class);
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
