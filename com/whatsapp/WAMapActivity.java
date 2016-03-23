package com.whatsapp;

import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.maps.MapActivity;

public class WAMapActivity extends MapActivity {
    protected boolean isRouteDisplayed() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        aqu.b();
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle) {
        aqu.b();
        super.onCreate(bundle);
    }
}
