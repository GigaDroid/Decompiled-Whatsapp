package com.whatsapp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

final class ts implements LocationListener {
    private static final String z;
    final i6 a;
    final di b;

    static {
        char[] toCharArray = "kx<`cic k?ve,ddse!*srk!bu~*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 26;
                    break;
                case at.g /*1*/:
                    i2 = 10;
                    break;
                case at.i /*2*/:
                    i2 = 79;
                    break;
                case at.o /*3*/:
                    i2 = 5;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onProviderDisabled(String str) {
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            Log.i(z + location.getTime() + " " + location.getAccuracy());
            bq.a(new a5(this.a, location));
            this.b.a((LocationListener) this);
        }
    }

    ts(i6 i6Var, di diVar) {
        this.a = i6Var;
        this.b = diVar;
    }
}
