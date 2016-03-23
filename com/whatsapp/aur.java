package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;

class aur implements OnClickListener {
    final LocationPicker2 a;
    final ImageView b;

    public void onClick(View view) {
        boolean z;
        LocationPicker2 locationPicker2 = this.a;
        if (LocationPicker2.o(this.a)) {
            z = false;
        } else {
            z = true;
        }
        LocationPicker2.c(locationPicker2, z);
        LocationPicker2.e(this.a);
        if (LocationPicker2.o(this.a)) {
            ViewGroup viewGroup = (ViewGroup) this.a.findViewById(2131755557);
            if (viewGroup != null) {
                LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                layoutParams.weight = 0.4f;
                viewGroup.setLayoutParams(layoutParams);
            }
            this.b.setImageResource(2130837664);
            if (LocationPicker2.t(this.a) != null) {
                LocationPicker2.t(this.a).animateCamera(CameraUpdateFactory.zoomBy(0.5f));
                if (!(LocationPicker2.h(this.a) == null || LocationPicker2.h(this.a).tag == null)) {
                    ((Marker) LocationPicker2.h(this.a).tag).showInfoWindow();
                }
            }
            LocationPicker2.c(this.a).setVisibility(8);
            LocationPicker2.z(this.a).setVisibility(0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.b.setImageResource(2130837667);
        if (LocationPicker2.t(this.a) != null) {
            CameraPosition cameraPosition = LocationPicker2.t(this.a).getCameraPosition();
            LocationPicker2.t(this.a).animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(cameraPosition.target).zoom(cameraPosition.zoom - 0.5f).tilt(0.0f).bearing(0.0f).build()));
            if (!(LocationPicker2.h(this.a) == null || LocationPicker2.h(this.a).tag == null)) {
                ((Marker) LocationPicker2.h(this.a).tag).hideInfoWindow();
            }
        }
        LocationPicker2.z(this.a).setVisibility(8);
    }

    aur(LocationPicker2 locationPicker2, ImageView imageView) {
        this.a = locationPicker2;
        this.b = imageView;
    }
}
