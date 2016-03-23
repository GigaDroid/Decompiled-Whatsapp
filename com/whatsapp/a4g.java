package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

class a4g implements OnMapClickListener {
    final LocationPicker2 a;

    public void onMapClick(LatLng latLng) {
        if (LocationPicker2.h(this.a) != null) {
            if (LocationPicker2.h(this.a).tag != null) {
                ((Marker) LocationPicker2.h(this.a).tag).setIcon(LocationPicker2.A(this.a));
            }
            LocationPicker2.a(this.a, null);
            LocationPicker2.f(this.a).notifyDataSetChanged();
        }
        LocationPicker2.c(this.a).setVisibility(8);
    }

    a4g(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
