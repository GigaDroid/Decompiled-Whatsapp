package com.whatsapp;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import java.util.List;

class a5 implements Runnable {
    private i6 a;
    private Location b;

    public void run() {
        try {
            List fromLocation = new Geocoder(App.z(), aqu.f()).getFromLocation(this.b.getLatitude(), this.b.getLongitude(), 1);
            if (fromLocation != null) {
                if (!fromLocation.isEmpty()) {
                    Address address = (Address) fromLocation.get(0);
                    this.a.j = address.getLocality();
                }
            }
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
        }
        wn.r().a(this.a.c, this.a.l, this.a.e, this.a.a, this.a.j);
        App.p.M().post(new atu(this));
    }

    public a5(i6 i6Var, Location location) {
        this.a = i6Var;
        this.b = location;
        i6Var.l = location.getLatitude();
        i6Var.e = location.getLongitude();
        i6Var.a = (double) location.getAccuracy();
    }
}
