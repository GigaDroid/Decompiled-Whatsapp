package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition.Builder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.whatsapp.protocol.co;

class pk implements OnMapReadyCallback {
    final ConversationRowLocation a;
    final co b;

    pk(ConversationRowLocation conversationRowLocation, co coVar) {
        this.a = conversationRowLocation;
        this.b = coVar;
    }

    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng = new LatLng(this.b.m, this.b.l);
        if (ConversationRowLocation.a() == null) {
            ConversationRowLocation.a(BitmapDescriptorFactory.fromResource(2130839710));
        }
        MarkerOptions icon = new MarkerOptions().position(latLng).icon(ConversationRowLocation.a());
        googleMap.clear();
        googleMap.addMarker(icon);
        int i = (int) (a4d.a().g * 2.0f);
        googleMap.setPadding(0, i * 2, i, i);
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(new Builder().target(latLng).zoom(15.0f).build()));
    }
}
