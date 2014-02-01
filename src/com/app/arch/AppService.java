package com.app.arch;

import android.app.IntentService;
import android.content.Intent;

public class AppService extends IntentService {

    public AppService() {
        super("intent-service");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
    }
}
