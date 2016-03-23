package com.whatsapp;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class WAFragmentActivity extends FragmentActivity {
    protected void onCreate(Bundle bundle) {
        aqu.b();
        super.onCreate(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        aqu.b();
        super.onConfigurationChanged(configuration);
    }
}
