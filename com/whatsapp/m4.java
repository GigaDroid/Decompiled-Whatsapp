package com.whatsapp;

import android.content.Context;
import com.google.android.maps.MapView;

class m4 extends m_ {
    final LocationPicker h;
    private int i;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLocationChanged(android.location.Location r9) {
        /*
        r8 = this;
        r7 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        super.onLocationChanged(r9);
        if (r9 == 0) goto L_0x00d0;
    L_0x000b:
        r0 = r9.hasAccuracy();
        if (r0 == 0) goto L_0x001c;
    L_0x0011:
        r0 = r9.getAccuracy();
        r0 = (int) r0;
        r0 = java.lang.Math.max(r1, r0);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        r0 = -1;
    L_0x001d:
        r4 = r8.i;
        if (r0 == r4) goto L_0x0059;
    L_0x0021:
        r8.i = r0;
        if (r0 <= 0) goto L_0x004e;
    L_0x0025:
        r4 = r8.h;
        r4 = com.whatsapp.LocationPicker.p(r4);
        r4.setVisibility(r2);
        r4 = r8.h;
        r4 = com.whatsapp.LocationPicker.p(r4);
        r5 = com.whatsapp.App.az;
        r6 = 2131296283; // 0x7f09001b float:1.8210478E38 double:1.0530002745E-314;
        r5 = r5.a(r6, r0);
        r6 = new java.lang.Object[r1];
        r0 = java.lang.Integer.valueOf(r0);
        r6[r2] = r0;
        r0 = java.lang.String.format(r5, r6);
        r4.setText(r0);
        if (r3 == 0) goto L_0x0059;
    L_0x004e:
        r0 = r8.h;
        r0 = com.whatsapp.LocationPicker.p(r0);
        r3 = 8;
        r0.setVisibility(r3);
    L_0x0059:
        r0 = r8.h;
        r0 = com.whatsapp.LocationPicker.n(r0);
        if (r0 == 0) goto L_0x00d1;
    L_0x0061:
        r0 = r8.h;
        r0 = com.whatsapp.LocationPicker.n(r0);
        r0 = r0.a();
        if (r0 == 0) goto L_0x00d1;
    L_0x006d:
        r0 = r8.h;
        r0 = com.whatsapp.LocationPicker.a(r0);
        if (r0 == 0) goto L_0x00d1;
    L_0x0075:
        r0 = r9.getAccuracy();
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 >= 0) goto L_0x00d1;
    L_0x007d:
        r0 = r8.h;
        r0 = com.whatsapp.LocationPicker.n(r0);
        r0 = r0.a();
        r0 = r0.distanceTo(r9);
        r3 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x00d1;
    L_0x0091:
        r0 = r8.h;
        com.whatsapp.LocationPicker.a(r0, r2);
        r0 = r1;
    L_0x0097:
        r1 = r8.h;
        com.whatsapp.LocationPicker.a(r1, r9);
        r1 = r8.h;
        r1 = com.whatsapp.LocationPicker.n(r1);
        if (r1 == 0) goto L_0x00a6;
    L_0x00a4:
        if (r0 == 0) goto L_0x00d0;
    L_0x00a6:
        r1 = r9.getAccuracy();
        r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r1 >= 0) goto L_0x00be;
    L_0x00ae:
        r2 = r9.getTime();
        r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r2 = r2 + r4;
        r4 = java.lang.System.currentTimeMillis();
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 > 0) goto L_0x00c6;
    L_0x00be:
        r1 = r8.h;
        r1 = com.whatsapp.LocationPicker.d(r1);
        if (r1 == 0) goto L_0x00d0;
    L_0x00c6:
        r1 = r8.h;
        r2 = new com.whatsapp.hx;
        r2.<init>(r8, r0, r9);
        r1.runOnUiThread(r2);
    L_0x00d0:
        return;
    L_0x00d1:
        r0 = r2;
        goto L_0x0097;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m4.onLocationChanged(android.location.Location):void");
    }

    m4(LocationPicker locationPicker, Context context, MapView mapView) {
        this.h = locationPicker;
        super(context, mapView);
        this.i = -1;
    }
}
