package com.whatsapp;

import android.location.Location;
import android.os.AsyncTask;

class al2 extends AsyncTask {
    private String a;
    private boolean b;
    final LocationPicker2 c;
    private int d;
    private Location e;

    protected void onPostExecute(Object obj) {
        a((k1) obj);
    }

    protected k1 a(Void[] voidArr) {
        return k1.b(this.e, this.d, this.a);
    }

    protected al2(LocationPicker2 locationPicker2, Location location, int i, String str, boolean z) {
        this.c = locationPicker2;
        this.e = location;
        this.a = str;
        this.d = i;
        this.b = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.k1 r21) {
        /*
        r20 = this;
        r12 = com.whatsapp.DialogToastActivity.f;
        r2 = r20.isCancelled();
        if (r2 != 0) goto L_0x0173;
    L_0x0008:
        r0 = r20;
        r2 = r0.c;
        r0 = r21;
        com.whatsapp.LocationPicker2.a(r2, r0);
        r0 = r20;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker2.w(r2);
        r3 = 8;
        r2.setVisibility(r3);
        r0 = r20;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker2.a(r2);
        r3 = 8;
        r2.setVisibility(r3);
        r0 = r20;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker2.r(r2);
        r2 = r2.k();
        if (r2 == 0) goto L_0x0065;
    L_0x0039:
        r0 = r20;
        r2 = r0.c;
        r2 = r2.getApplicationContext();
        r0 = r20;
        r3 = r0.c;
        r4 = 2131231563; // 0x7f08034b float:1.807921E38 double:1.0529682986E-314;
        r3 = r3.getString(r4);
        r4 = 1;
        r2 = android.widget.Toast.makeText(r2, r3, r4);
        r2.show();
        r0 = r20;
        r2 = r0.c;
        r3 = 2131755739; // 0x7f1002db float:1.9142366E38 double:1.053227276E-314;
        r2 = r2.findViewById(r3);
        r3 = 0;
        r2.setVisibility(r3);
        if (r12 == 0) goto L_0x0075;
    L_0x0065:
        r0 = r20;
        r2 = r0.c;
        r3 = 2131755739; // 0x7f1002db float:1.9142366E38 double:1.053227276E-314;
        r2 = r2.findViewById(r3);
        r3 = 8;
        r2.setVisibility(r3);
    L_0x0075:
        r0 = r20;
        r2 = r0.c;
        com.whatsapp.LocationPicker2.m(r2);
        r0 = r20;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker2.f(r2);
        r2.notifyDataSetChanged();
        r0 = r20;
        r2 = r0.c;
        com.whatsapp.LocationPicker2.i(r2);
        r0 = r20;
        r2 = r0.b;
        if (r2 == 0) goto L_0x015c;
    L_0x0094:
        r0 = r20;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker2.r(r2);
        r2 = r2.k();
        if (r2 != 0) goto L_0x015c;
    L_0x00a2:
        r8 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r6 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r4 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r2 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = r20;
        r10 = r0.c;
        r10 = com.whatsapp.LocationPicker2.r(r10);
        r10 = r10.p();
        r13 = r10.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x00ca:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0177;
    L_0x00d0:
        r2 = r13.next();
        r2 = (com.whatsapp.PlaceInfo) r2;
        r14 = r2.lat;
        r10 = java.lang.Math.min(r10, r14);
        r14 = r2.lat;
        r8 = java.lang.Math.max(r8, r14);
        r14 = r2.lon;
        r6 = java.lang.Math.min(r6, r14);
        r2 = r2.lon;
        r2 = java.lang.Math.max(r4, r2);
        if (r12 == 0) goto L_0x0174;
    L_0x00f0:
        r0 = r20;
        r4 = r0.c;
        r4 = com.whatsapp.LocationPicker2.r(r4);
        r4 = r4.o();
        r5 = 1;
        if (r4 > r5) goto L_0x0134;
    L_0x00ff:
        r0 = r20;
        r4 = r0.c;
        r4 = com.whatsapp.LocationPicker2.t(r4);
        r5 = new com.google.android.gms.maps.model.LatLng;
        r14 = r10 + r8;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r16 = r6 + r2;
        r18 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r16 = r16 / r18;
        r0 = r16;
        r5.<init>(r14, r0);
        r5 = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(r5);
        r4.animateCamera(r5);
        r0 = r20;
        r4 = r0.c;
        r4 = com.whatsapp.LocationPicker2.t(r4);
        r5 = 1099956224; // 0x41900000 float:18.0 double:5.43450582E-315;
        r5 = com.google.android.gms.maps.CameraUpdateFactory.zoomTo(r5);
        r4.animateCamera(r5);
        if (r12 == 0) goto L_0x015c;
    L_0x0134:
        r0 = r20;
        r4 = r0.c;
        r4 = com.whatsapp.LocationPicker2.t(r4);
        r5 = new com.google.android.gms.maps.model.LatLngBounds;
        r12 = new com.google.android.gms.maps.model.LatLng;
        r12.<init>(r10, r6);
        r6 = new com.google.android.gms.maps.model.LatLng;
        r6.<init>(r8, r2);
        r5.<init>(r12, r6);
        r2 = com.whatsapp.a4d.a();
        r2 = r2.g;
        r3 = 1098907648; // 0x41800000 float:16.0 double:5.42932517E-315;
        r2 = r2 * r3;
        r2 = (int) r2;
        r2 = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(r5, r2);
        r4.animateCamera(r2);
    L_0x015c:
        r0 = r20;
        r2 = r0.c;
        r2 = com.whatsapp.LocationPicker2.u(r2);
        r0 = r20;
        r3 = r0.c;
        r3 = com.whatsapp.LocationPicker2.r(r3);
        r3 = r3.l();
        r2.b(r3);
    L_0x0173:
        return;
    L_0x0174:
        r4 = r2;
        goto L_0x00ca;
    L_0x0177:
        r2 = r4;
        goto L_0x00f0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.al2.a(com.whatsapp.k1):void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
