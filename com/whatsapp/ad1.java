package com.whatsapp;

import android.location.Location;
import com.google.android.gms.location.LocationListener;

class ad1 implements LocationListener {
    private float a;
    private boolean b;
    private long c;
    private android.location.LocationListener d;

    static long b(ad1 com_whatsapp_ad1) {
        return com_whatsapp_ad1.c;
    }

    static boolean a(ad1 com_whatsapp_ad1) {
        return com_whatsapp_ad1.b;
    }

    static float c(ad1 com_whatsapp_ad1) {
        return com_whatsapp_ad1.a;
    }

    public ad1(long j, float f, boolean z, android.location.LocationListener locationListener) {
        this.d = locationListener;
        this.c = j;
        this.a = f;
        this.b = z;
    }

    public void onLocationChanged(Location location) {
        this.d.onLocationChanged(location);
    }
}
