package com.whatsapp;

class vd implements Runnable {
    final GoogleMapView2 a;

    vd(GoogleMapView2 googleMapView2) {
        this.a = googleMapView2;
    }

    public void run() {
        this.a.getMap().stopAnimation();
        GoogleMapView2.a(this.a, 0);
    }
}
