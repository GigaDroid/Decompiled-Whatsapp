package com.whatsapp;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

class ov implements SensorEventListener {
    final GoogleMapView2 a;

    ov(GoogleMapView2 googleMapView2) {
        this.a = googleMapView2;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r14) {
        /*
        r13 = this;
        r2 = 3;
        r12 = 2;
        r11 = 0;
        r5 = 0;
        r10 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r8 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.a;	 Catch:{ IllegalArgumentException -> 0x0022 }
        r0 = r0.getMap();	 Catch:{ IllegalArgumentException -> 0x0022 }
        r0 = r0.isMyLocationEnabled();	 Catch:{ IllegalArgumentException -> 0x0022 }
        if (r0 == 0) goto L_0x0024;
    L_0x0014:
        r0 = r13.a;	 Catch:{ IllegalArgumentException -> 0x0022 }
        r0 = r0.getMap();	 Catch:{ IllegalArgumentException -> 0x0022 }
        r0 = r0.getMyLocation();	 Catch:{ IllegalArgumentException -> 0x0022 }
        r6 = r0;
    L_0x001f:
        if (r6 != 0) goto L_0x0027;
    L_0x0021:
        return;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = 0;
        r6 = r0;
        goto L_0x001f;
    L_0x0027:
        r0 = r13.a;	 Catch:{ IllegalArgumentException -> 0x015b }
        r0 = com.whatsapp.GoogleMapView2.e(r0);	 Catch:{ IllegalArgumentException -> 0x015b }
        r1 = r14.values;	 Catch:{ IllegalArgumentException -> 0x015b }
        android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1);	 Catch:{ IllegalArgumentException -> 0x015b }
    L_0x0032:
        r0 = r13.a;
        r0 = com.whatsapp.GoogleMapView2.f(r0);
        r9 = r0.getRotation();
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalArgumentException -> 0x0182 }
        r2 = r6.getTime();	 Catch:{ IllegalArgumentException -> 0x0182 }
        r0 = r0 - r2;
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0065;
    L_0x004b:
        r0 = r6.hasBearing();	 Catch:{ IllegalArgumentException -> 0x0184 }
        if (r0 == 0) goto L_0x0065;
    L_0x0051:
        r0 = r6.getSpeed();	 Catch:{ IllegalArgumentException -> 0x0184 }
        r0 = (double) r0;
        r2 = 4606228376254955242; // 0x3fec9c4da9003eea float:-2.847628E-14 double:0.89408;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0065;
    L_0x005f:
        r0 = r6.getBearing();
        if (r8 == 0) goto L_0x00ad;
    L_0x0065:
        r0 = r13.a;
        r0 = com.whatsapp.GoogleMapView2.e(r0);
        r1 = r13.a;
        r1 = com.whatsapp.GoogleMapView2.a(r1);
        android.hardware.SensorManager.getOrientation(r0, r1);
        r0 = r13.a;
        r0 = com.whatsapp.GoogleMapView2.a(r0);
        r0 = r0[r5];
        r0 = (double) r0;
        r0 = java.lang.Math.toDegrees(r0);
        r0 = (float) r0;
        switch(r9) {
            case 0: goto L_0x0186;
            case 1: goto L_0x0188;
            case 2: goto L_0x018d;
            case 3: goto L_0x0192;
            default: goto L_0x0085;
        };
    L_0x0085:
        r1 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1));
        if (r1 >= 0) goto L_0x019d;
    L_0x0089:
        r0 = r0 + r10;
        r7 = r0;
    L_0x008b:
        r0 = new android.hardware.GeomagneticField;
        r2 = r6.getLatitude();
        r1 = (float) r2;
        r2 = r6.getLongitude();
        r2 = (float) r2;
        r4 = r6.getAltitude();
        r3 = (float) r4;
        r4 = r6.getTime();
        r0.<init>(r1, r2, r3, r4);
        r0 = r0.getDeclination();
        r0 = r0 + r7;
        r1 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r1 < 0) goto L_0x00ad;
    L_0x00ac:
        r0 = r0 - r10;
    L_0x00ad:
        r1 = r13.a;	 Catch:{ IllegalArgumentException -> 0x0197 }
        r2 = r13.a;	 Catch:{ IllegalArgumentException -> 0x0197 }
        r3 = r13.a;	 Catch:{ IllegalArgumentException -> 0x0197 }
        r3 = com.whatsapp.GoogleMapView2.h(r3);	 Catch:{ IllegalArgumentException -> 0x0197 }
        r0 = com.whatsapp.GoogleMapView2.a(r2, r0, r3);	 Catch:{ IllegalArgumentException -> 0x0197 }
        com.whatsapp.GoogleMapView2.b(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0197 }
        if (r9 == 0) goto L_0x00c2;
    L_0x00c0:
        if (r9 != r12) goto L_0x00dc;
    L_0x00c2:
        r0 = r13.a;	 Catch:{ IllegalArgumentException -> 0x019b }
        r1 = r13.a;	 Catch:{ IllegalArgumentException -> 0x019b }
        r1 = com.whatsapp.GoogleMapView2.a(r1);	 Catch:{ IllegalArgumentException -> 0x019b }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x019b }
        r2 = (double) r1;	 Catch:{ IllegalArgumentException -> 0x019b }
        r2 = java.lang.Math.toDegrees(r2);	 Catch:{ IllegalArgumentException -> 0x019b }
        r2 = java.lang.Math.abs(r2);	 Catch:{ IllegalArgumentException -> 0x019b }
        r1 = (float) r2;	 Catch:{ IllegalArgumentException -> 0x019b }
        com.whatsapp.GoogleMapView2.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x019b }
        if (r8 == 0) goto L_0x00f4;
    L_0x00dc:
        r0 = r13.a;	 Catch:{ IllegalArgumentException -> 0x019b }
        r1 = r13.a;	 Catch:{ IllegalArgumentException -> 0x019b }
        r1 = com.whatsapp.GoogleMapView2.a(r1);	 Catch:{ IllegalArgumentException -> 0x019b }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x019b }
        r2 = (double) r1;	 Catch:{ IllegalArgumentException -> 0x019b }
        r2 = java.lang.Math.toDegrees(r2);	 Catch:{ IllegalArgumentException -> 0x019b }
        r2 = java.lang.Math.abs(r2);	 Catch:{ IllegalArgumentException -> 0x019b }
        r1 = (float) r2;	 Catch:{ IllegalArgumentException -> 0x019b }
        com.whatsapp.GoogleMapView2.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x019b }
    L_0x00f4:
        r0 = r13.a;
        r0 = com.whatsapp.GoogleMapView2.g(r0);
        if (r0 != 0) goto L_0x0021;
    L_0x00fc:
        r0 = new com.google.android.gms.maps.model.LatLng;
        r2 = r6.getLatitude();
        r4 = r6.getLongitude();
        r0.<init>(r2, r4);
        r2 = 4632233691727265792; // 0x4049000000000000 float:0.0 double:50.0;
        r1 = r13.a;
        r1 = com.whatsapp.GoogleMapView2.h(r1);
        r4 = (double) r1;
        r0 = com.whatsapp.GoogleMapView2.a(r0, r2, r4);
        r1 = com.google.android.gms.maps.model.CameraPosition.builder();
        r2 = r13.a;
        r2 = com.whatsapp.GoogleMapView2.c(r2);
        r3 = 1116143616; // 0x42870000 float:67.5 double:5.514482165E-315;
        r2 = com.whatsapp.GoogleMapView2.a(r2, r11, r3);
        r1 = r1.tilt(r2);
        r2 = r13.a;
        r2 = com.whatsapp.GoogleMapView2.h(r2);
        r1 = r1.bearing(r2);
        r2 = r13.a;
        r2 = com.whatsapp.GoogleMapView2.d(r2);
        r3 = 1097859072; // 0x41700000 float:15.0 double:5.424144515E-315;
        r2 = java.lang.Math.max(r2, r3);
        r1 = r1.zoom(r2);
        r0 = r1.target(r0);
        r0 = r0.build();
        r1 = r13.a;
        r1 = r1.getMap();
        r0 = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(r0);
        r1.moveCamera(r0);
        goto L_0x0021;
    L_0x015b:
        r0 = move-exception;
        r0 = r14.values;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r0 = r0.length;	 Catch:{ IllegalArgumentException -> 0x0180 }
        if (r0 <= r2) goto L_0x0032;
    L_0x0161:
        r0 = r14.values;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r1 = 0;
        r2 = r13.a;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r2 = com.whatsapp.GoogleMapView2.b(r2);	 Catch:{ IllegalArgumentException -> 0x0180 }
        r3 = 0;
        r4 = 3;
        java.lang.System.arraycopy(r0, r1, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0180 }
        r0 = r13.a;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r0 = com.whatsapp.GoogleMapView2.e(r0);	 Catch:{ IllegalArgumentException -> 0x0180 }
        r1 = r13.a;	 Catch:{ IllegalArgumentException -> 0x0180 }
        r1 = com.whatsapp.GoogleMapView2.b(r1);	 Catch:{ IllegalArgumentException -> 0x0180 }
        android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0180 }
        goto L_0x0032;
    L_0x0180:
        r0 = move-exception;
        throw r0;
    L_0x0182:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0184 }
    L_0x0184:
        r0 = move-exception;
        throw r0;
    L_0x0186:
        if (r8 == 0) goto L_0x0085;
    L_0x0188:
        r1 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r0 = r0 + r1;
        if (r8 == 0) goto L_0x0085;
    L_0x018d:
        r1 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r0 = r0 + r1;
        if (r8 == 0) goto L_0x0085;
    L_0x0192:
        r1 = 1132920832; // 0x43870000 float:270.0 double:5.597372625E-315;
        r0 = r0 + r1;
        goto L_0x0085;
    L_0x0197:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0199 }
    L_0x0199:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x019b }
    L_0x019b:
        r0 = move-exception;
        throw r0;
    L_0x019d:
        r7 = r0;
        goto L_0x008b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ov.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
