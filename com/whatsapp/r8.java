package com.whatsapp;

import android.location.Location;
import android.os.AsyncTask;

class r8 extends AsyncTask {
    private String a;
    final LocationPicker b;
    private Location c;
    private int d;
    private boolean e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.k1 r19) {
        /*
        r18 = this;
        r12 = com.whatsapp.DialogToastActivity.f;
        r2 = r18.isCancelled();
        if (r2 != 0) goto L_0x0187;
    L_0x0008:
        r0 = r18;
        r2 = r0.b;
        r0 = r19;
        com.whatsapp.LocationPicker.a(r2, r0);
        r0 = r18;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker.c(r2);
        r3 = 8;
        r2.setVisibility(r3);
        r0 = r18;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker.n(r2);
        r2 = r2.k();
        if (r2 == 0) goto L_0x0058;
    L_0x002c:
        r0 = r18;
        r2 = r0.b;
        r2 = r2.getApplicationContext();
        r0 = r18;
        r3 = r0.b;
        r4 = 2131231563; // 0x7f08034b float:1.807921E38 double:1.0529682986E-314;
        r3 = r3.getString(r4);
        r4 = 1;
        r2 = android.widget.Toast.makeText(r2, r3, r4);
        r2.show();
        r0 = r18;
        r2 = r0.b;
        r3 = 2131755739; // 0x7f1002db float:1.9142366E38 double:1.053227276E-314;
        r2 = r2.findViewById(r3);
        r3 = 0;
        r2.setVisibility(r3);
        if (r12 == 0) goto L_0x0068;
    L_0x0058:
        r0 = r18;
        r2 = r0.b;
        r3 = 2131755739; // 0x7f1002db float:1.9142366E38 double:1.053227276E-314;
        r2 = r2.findViewById(r3);
        r3 = 8;
        r2.setVisibility(r3);
    L_0x0068:
        r0 = r18;
        r2 = r0.b;
        com.whatsapp.LocationPicker.e(r2);
        r0 = r18;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker.j(r2);
        r2.notifyDataSetChanged();
        r0 = r18;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker.i(r2);
        r2.a();
        r0 = r18;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker.o(r2);
        r2.invalidate();
        r0 = r18;
        r2 = r0.e;
        if (r2 == 0) goto L_0x0170;
    L_0x0096:
        r0 = r18;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker.n(r2);
        r2 = r2.k();
        if (r2 != 0) goto L_0x0170;
    L_0x00a4:
        r8 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r6 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r4 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r2 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = r18;
        r10 = r0.b;
        r10 = com.whatsapp.LocationPicker.n(r10);
        r10 = r10.p();
        r13 = r10.iterator();
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x00cc:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x018b;
    L_0x00d2:
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
        if (r12 == 0) goto L_0x0188;
    L_0x00f2:
        r4 = new com.google.android.maps.GeoPoint;
        r14 = r10 + r8;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r5 = (int) r14;
        r14 = r6 + r2;
        r16 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r14 = r14 * r16;
        r16 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r14 = r14 / r16;
        r13 = (int) r14;
        r4.<init>(r5, r13);
        r0 = r18;
        r5 = r0.b;
        r5 = com.whatsapp.LocationPicker.o(r5);
        r5 = r5.getController();
        r5.setCenter(r4);
        r4 = r8 - r10;
        r8 = 4608083138725491507; // 0x3ff3333333333333 float:4.172325E-8 double:1.2;
        r4 = r4 * r8;
        r8 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = r4 * r8;
        r4 = (int) r4;
        r2 = r2 - r6;
        r6 = 4608083138725491507; // 0x3ff3333333333333 float:4.172325E-8 double:1.2;
        r2 = r2 * r6;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r2 = r2 * r6;
        r2 = (int) r2;
        r0 = r18;
        r3 = r0.b;
        r3 = com.whatsapp.LocationPicker.n(r3);
        r3 = r3.o();
        r5 = 1;
        if (r3 > r5) goto L_0x0161;
    L_0x014e:
        r0 = r18;
        r3 = r0.b;
        r3 = com.whatsapp.LocationPicker.o(r3);
        r3 = r3.getController();
        r5 = 18;
        r3.setZoom(r5);
        if (r12 == 0) goto L_0x0170;
    L_0x0161:
        r0 = r18;
        r3 = r0.b;
        r3 = com.whatsapp.LocationPicker.o(r3);
        r3 = r3.getController();
        r3.zoomToSpan(r4, r2);
    L_0x0170:
        r0 = r18;
        r2 = r0.b;
        r2 = com.whatsapp.LocationPicker.h(r2);
        r0 = r18;
        r3 = r0.b;
        r3 = com.whatsapp.LocationPicker.n(r3);
        r3 = r3.l();
        r2.b(r3);
    L_0x0187:
        return;
    L_0x0188:
        r4 = r2;
        goto L_0x00cc;
    L_0x018b:
        r2 = r4;
        goto L_0x00f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.r8.a(com.whatsapp.k1):void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected k1 a(Void[] voidArr) {
        return k1.b(this.c, this.d, this.a);
    }

    protected void onPostExecute(Object obj) {
        a((k1) obj);
    }

    protected r8(LocationPicker locationPicker, Location location, int i, String str, boolean z) {
        this.b = locationPicker;
        this.c = location;
        this.a = str;
        this.d = i;
        this.e = z;
    }
}
