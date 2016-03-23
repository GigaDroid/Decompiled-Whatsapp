package com.whatsapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class WAActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        aqu.b();
        super.onCreate(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        aqu.b();
        super.onConfigurationChanged(configuration);
    }
}
