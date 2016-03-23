package com.whatsapp;

import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;

class cd implements OnMarkerClickListener {
    final LocationPicker2 a;

    cd(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMarkerClick(com.google.android.gms.maps.model.Marker r7) {
        /*
        r6 = this;
        r1 = 0;
        r5 = 8;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.getId();
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.h(r0);
        if (r0 == 0) goto L_0x0031;
    L_0x0014:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.h(r0);
        r0 = r0.tag;
        if (r0 == 0) goto L_0x0031;
    L_0x001e:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.h(r0);
        r0 = r0.tag;
        r0 = (com.google.android.gms.maps.model.Marker) r0;
        r3 = r6.a;
        r3 = com.whatsapp.LocationPicker2.A(r3);
        r0.setIcon(r3);
    L_0x0031:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.v(r0);
        r7.setIcon(r0);
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.r(r0);
        r0 = r0.p();
        r3 = r0.iterator();
    L_0x0048:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0065;
    L_0x004e:
        r0 = r3.next();
        r0 = (com.whatsapp.PlaceInfo) r0;
        r4 = r0.tag;
        r4 = r7.equals(r4);
        if (r4 == 0) goto L_0x0063;
    L_0x005c:
        r4 = r6.a;
        com.whatsapp.LocationPicker2.a(r4, r0);
        if (r2 == 0) goto L_0x0065;
    L_0x0063:
        if (r2 == 0) goto L_0x0048;
    L_0x0065:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.r(r0);
        r3 = r6.a;
        r3 = com.whatsapp.LocationPicker2.h(r3);
        r0 = r0.a(r3);
        if (r0 < 0) goto L_0x0098;
    L_0x0077:
        r3 = r6.a;
        r3 = com.whatsapp.LocationPicker2.f(r3);
        r3.notifyDataSetChanged();
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 < r5) goto L_0x008f;
    L_0x0084:
        r3 = r6.a;
        r3 = com.whatsapp.LocationPicker2.q(r3);
        r3.smoothScrollToPosition(r0);
        if (r2 == 0) goto L_0x0098;
    L_0x008f:
        r2 = r6.a;
        r2 = com.whatsapp.LocationPicker2.q(r2);
        r2.setSelection(r0);
    L_0x0098:
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.c(r0);
        r0.setVisibility(r5);
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.z(r0);
        r0.setVisibility(r5);
        r0 = r6.a;
        r0 = com.whatsapp.LocationPicker2.j(r0);
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x00ba;
    L_0x00b6:
        r0 = 1;
    L_0x00b7:
        r1 = r0;
        goto L_0x000b;
    L_0x00ba:
        r0 = r1;
        goto L_0x00b7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cd.onMarkerClick(com.google.android.gms.maps.model.Marker):boolean");
    }
}
