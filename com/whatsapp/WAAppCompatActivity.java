package com.whatsapp;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class WAAppCompatActivity extends AppCompatActivity {
    public static int c;

    protected void onCreate(Bundle bundle) {
        aqu.b();
        super.onCreate(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        aqu.b();
        super.onConfigurationChanged(configuration);
    }
}
