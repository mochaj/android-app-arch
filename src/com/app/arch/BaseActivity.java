package com.app.arch;

import android.app.Activity;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {

    protected ServiceInterface mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mService = new ServiceInterface();
    }

    @Override
    public void onStart() {
        super.onStart();

        mService.bind(this);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        mService.unbind(this);

        super.onStop();
    }
}
