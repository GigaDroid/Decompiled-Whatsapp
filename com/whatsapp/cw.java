package com.whatsapp;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

class cw implements ConnectionCallbacks, OnConnectionFailedListener {
    final di a;

    public void onConnectionSuspended(int i) {
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    cw(di diVar) {
        this.a = diVar;
    }

    public void onConnected(Bundle bundle) {
        boolean z = DialogToastActivity.f;
        if (App.u(App.z())) {
            for (ad1 com_whatsapp_ad1 : di.a(this.a).values()) {
                int i;
                LocationRequest create = LocationRequest.create();
                if (ad1.a(com_whatsapp_ad1)) {
                    i = 100;
                } else {
                    i = arj.Theme_checkboxStyle;
                }
                create.setPriority(i);
                create.setInterval(ad1.b(com_whatsapp_ad1));
                create.setFastestInterval(1000);
                create.setSmallestDisplacement(ad1.c(com_whatsapp_ad1));
                LocationServices.FusedLocationApi.requestLocationUpdates(di.b(this.a), create, com_whatsapp_ad1);
                if (z) {
                    break;
                }
            }
            if (di.a(this.a).isEmpty()) {
                di.b(this.a).disconnect();
            }
        }
    }
}
