package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.model.CameraPosition;

class kk implements OnCameraChangeListener {
    final LocationPicker2 a;

    public void onCameraChange(CameraPosition cameraPosition) {
        LocationPicker2.d(this.a).lat = cameraPosition.target.latitude;
        LocationPicker2.d(this.a).lon = cameraPosition.target.longitude;
        LocationPicker2.d(this.a).name = null;
        LocationPicker2.d(this.a).address = null;
        if (LocationPicker2.o(this.a)) {
            LocationPicker2.B(this.a).removeCallbacks(LocationPicker2.g(this.a));
            LocationPicker2.a(this.a, new anu(this.a, cameraPosition.target.latitude, cameraPosition.target.longitude));
            LocationPicker2.B(this.a).post(LocationPicker2.g(this.a));
        }
    }

    kk(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
