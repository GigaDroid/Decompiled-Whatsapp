package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class adf implements LocationListener {
    final xo a;

    adf(xo xoVar) {
        this.a = xoVar;
    }

    public void onProviderEnabled(String str) {
    }

    public void onProviderDisabled(String str) {
    }

    public void onLocationChanged(Location location) {
        xo xoVar = this.a;
        xoVar.j++;
        this.a.i = location;
        if (this.a.j >= 2 || location.getAccuracy() < 200.0f) {
            this.a.f = true;
            this.a.j = 0;
        }
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
