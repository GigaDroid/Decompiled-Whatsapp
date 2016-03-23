package com.whatsapp;

import android.location.Location;

class hx implements Runnable {
    final Location a;
    final m4 b;
    final boolean c;

    public void run() {
        if (LocationPicker.n(this.b.h) == null || this.c) {
            LocationPicker.o(this.b.h).b(LocationPicker.f(this.b.h).getMyLocation());
            LocationPicker.a(this.b.h, this.a, Math.max((int) this.a.getAccuracy(), 100), null, true);
        }
    }

    hx(m4 m4Var, boolean z, Location location) {
        this.b = m4Var;
        this.c = z;
        this.a = location;
    }
}
