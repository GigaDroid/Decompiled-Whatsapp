package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.maps.model.Marker;

class jb implements OnClickListener {
    final LocationPicker2 a;

    public void onClick(View view) {
        LocationPicker2.c(this.a).setVisibility(0);
        if (LocationPicker2.h(this.a) != null && LocationPicker2.h(this.a).tag != null) {
            ((Marker) LocationPicker2.h(this.a).tag).hideInfoWindow();
        }
    }

    jb(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
