package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class arm implements LocationListener {
    final xo a;

    public void onProviderEnabled(String str) {
    }

    arm(xo xoVar) {
        this.a = xoVar;
    }

    public void onLocationChanged(Location location) {
        this.a.l = location;
    }

    public void onProviderDisabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
