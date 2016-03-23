package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;

class a30 implements Runnable {
    final LocationPicker2 a;
    final boolean b;

    public void run() {
        if (LocationPicker2.r(this.a) == null || this.b) {
            LocationPicker2.t(this.a).animateCamera(CameraUpdateFactory.newLatLng(new LatLng(LocationPicker2.b(this.a).getLatitude(), LocationPicker2.b(this.a).getLongitude())));
            LocationPicker2.a(this.a, LocationPicker2.b(this.a), Math.max((int) LocationPicker2.b(this.a).getAccuracy(), 100), null, true);
        }
    }

    a30(LocationPicker2 locationPicker2, boolean z) {
        this.a = locationPicker2;
        this.b = z;
    }
}
