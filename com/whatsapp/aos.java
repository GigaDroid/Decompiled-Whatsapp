package com.whatsapp;

import android.location.Location;

class aos extends aox {
    final GroupChatLiveLocationsActivity2 p;

    aos(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.p = groupChatLiveLocationsActivity2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.cx r7, boolean r8) {
        /*
        r6 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r6.p;
        com.whatsapp.GroupChatLiveLocationsActivity2.a(r1, r7);
        r1 = r6.p;
        r2 = 1;
        com.whatsapp.GroupChatLiveLocationsActivity2.a(r1, r2);
        r1 = r6.p;
        r1 = com.whatsapp.GroupChatLiveLocationsActivity2.h(r1);
        r2 = 2;
        r1.setLocationMode(r2);
        r1 = new com.google.android.gms.maps.model.LatLng;
        r2 = r7.a;
        r4 = r7.b;
        r1.<init>(r2, r4);
        if (r8 == 0) goto L_0x009c;
    L_0x0022:
        r2 = r6.p;
        r2 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r2);
        r2 = r2.getCameraPosition();
        r2 = r2.zoom;
        r3 = 1099431936; // 0x41880000 float:17.0 double:5.431915495E-315;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x009c;
    L_0x0034:
        r2 = r6.p;
        r2 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r2);
        r2 = r2.getProjection();
        r2 = r2.toScreenLocation(r1);
        r3 = r2.x;
        if (r3 <= 0) goto L_0x0066;
    L_0x0046:
        r3 = r2.y;
        if (r3 <= 0) goto L_0x0066;
    L_0x004a:
        r3 = r2.x;
        r4 = r6.p;
        r4 = com.whatsapp.GroupChatLiveLocationsActivity2.h(r4);
        r4 = r4.getWidth();
        if (r3 >= r4) goto L_0x0066;
    L_0x0058:
        r2 = r2.y;
        r3 = r6.p;
        r3 = com.whatsapp.GroupChatLiveLocationsActivity2.h(r3);
        r3 = r3.getHeight();
        if (r2 < r3) goto L_0x0075;
    L_0x0066:
        r2 = r6.p;
        r2 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r2);
        r3 = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(r1);
        r2.animateCamera(r3);
        if (r0 == 0) goto L_0x009a;
    L_0x0075:
        r2 = r6.p;
        r3 = r7.i;
        r2 = com.whatsapp.GroupChatLiveLocationsActivity2.a(r2, r3);
        r3 = r6.p;
        r3 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r3);
        r4 = com.google.android.gms.maps.model.CameraPosition.builder();
        r4 = r4.target(r1);
        r2 = r4.zoom(r2);
        r2 = r2.build();
        r2 = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(r2);
        r3.animateCamera(r2);
    L_0x009a:
        if (r0 == 0) goto L_0x00a9;
    L_0x009c:
        r0 = r6.p;
        r0 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r0);
        r1 = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(r1);
        r0.animateCamera(r1);
    L_0x00a9:
        r0 = r6.p;
        com.whatsapp.GroupChatLiveLocationsActivity2.j(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aos.a(com.whatsapp.protocol.cx, boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r6 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r6.p;
        com.whatsapp.GroupChatLiveLocationsActivity2.j(r1);
        r1 = r6.p;
        r1 = com.whatsapp.GroupChatLiveLocationsActivity2.c(r1);
        if (r1 == 0) goto L_0x00af;
    L_0x000f:
        r1 = new com.google.android.gms.maps.model.LatLng;
        r2 = r6.p;
        r2 = com.whatsapp.GroupChatLiveLocationsActivity2.c(r2);
        r2 = r2.a;
        r4 = r6.p;
        r4 = com.whatsapp.GroupChatLiveLocationsActivity2.c(r4);
        r4 = r4.b;
        r1.<init>(r2, r4);
        r2 = r6.p;
        r2 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r2);
        r2 = r2.getProjection();
        r2 = r2.toScreenLocation(r1);
        r3 = com.whatsapp.a4d.a();
        r3 = r3.g;
        r4 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r3 = r3 * r4;
        r3 = (int) r3;
        r4 = r2.x;
        if (r4 < r3) goto L_0x0063;
    L_0x0040:
        r4 = r2.y;
        if (r4 < r3) goto L_0x0063;
    L_0x0044:
        r4 = r2.x;
        r5 = r6.p;
        r5 = com.whatsapp.GroupChatLiveLocationsActivity2.h(r5);
        r5 = r5.getWidth();
        r5 = r5 - r3;
        if (r4 > r5) goto L_0x0063;
    L_0x0053:
        r2 = r2.y;
        r4 = r6.p;
        r4 = com.whatsapp.GroupChatLiveLocationsActivity2.h(r4);
        r4 = r4.getHeight();
        r3 = r4 - r3;
        if (r2 <= r3) goto L_0x00ad;
    L_0x0063:
        r2 = r6.p;
        r3 = r6.p;
        r3 = com.whatsapp.GroupChatLiveLocationsActivity2.c(r3);
        r3 = r3.i;
        r2 = com.whatsapp.GroupChatLiveLocationsActivity2.a(r2, r3);
        r3 = r6.p;
        r3 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r3);
        r3 = r3.getCameraPosition();
        r3 = r3.zoom;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x0090;
    L_0x0081:
        r3 = r6.p;
        r3 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r3);
        r4 = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(r1);
        r3.animateCamera(r4);
        if (r0 == 0) goto L_0x00ad;
    L_0x0090:
        r3 = r6.p;
        r3 = com.whatsapp.GroupChatLiveLocationsActivity2.d(r3);
        r4 = com.google.android.gms.maps.model.CameraPosition.builder();
        r1 = r4.target(r1);
        r1 = r1.zoom(r2);
        r1 = r1.build();
        r1 = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(r1);
        r3.animateCamera(r1);
    L_0x00ad:
        if (r0 == 0) goto L_0x00bc;
    L_0x00af:
        r0 = r6.p;
        r0 = com.whatsapp.GroupChatLiveLocationsActivity2.f(r0);
        if (r0 != 0) goto L_0x00bc;
    L_0x00b7:
        r0 = r6.p;
        com.whatsapp.GroupChatLiveLocationsActivity2.e(r0);
    L_0x00bc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aos.a():void");
    }

    public Location f() {
        return GroupChatLiveLocationsActivity2.d(this.p).getMyLocation();
    }
}
