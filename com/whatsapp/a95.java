package com.whatsapp;

import android.location.LocationListener;

final class a95 implements Runnable {
    final LocationListener a;
    final di b;

    public void run() {
        this.b.a(this.a);
    }

    a95(di diVar, LocationListener locationListener) {
        this.b = diVar;
        this.a = locationListener;
    }
}
