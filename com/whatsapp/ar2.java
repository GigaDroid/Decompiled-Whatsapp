package com.whatsapp;

import android.graphics.Canvas;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;

class ar2 extends ItemizedOverlay {
    final GroupChatLiveLocationsActivity a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.google.android.maps.OverlayItem createItem(int r9) {
        /*
        r8 = this;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r0 = r8.a;
        r0 = com.whatsapp.GroupChatLiveLocationsActivity.f(r0);
        r0 = r0.j;
        r0 = r0.get(r9);
        r0 = (com.whatsapp.protocol.cx) r0;
        r1 = new com.google.android.maps.GeoPoint;
        r2 = r0.a;
        r2 = r2 * r6;
        r2 = (int) r2;
        r4 = r0.b;
        r4 = r4 * r6;
        r3 = (int) r4;
        r1.<init>(r2, r3);
        r2 = new com.google.android.maps.OverlayItem;
        r3 = "";
        r4 = "";
        r2.<init>(r1, r3, r4);
        r0 = r0.g;
        r4 = 1800000; // 0x1b7740 float:2.522337E-39 double:8.89318E-318;
        r0 = r0 + r4;
        r4 = java.lang.System.currentTimeMillis();
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0053;
    L_0x0039:
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r1 = 2130839621; // 0x7f020845 float:1.7284258E38 double:1.0527746535E-314;
        r0 = r0.getDrawable(r1);
        r0 = boundCenter(r0);
        r2.setMarker(r0);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0069;
    L_0x0053:
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r1 = 2130839622; // 0x7f020846 float:1.728426E38 double:1.052774654E-314;
        r0 = r0.getDrawable(r1);
        r0 = boundCenter(r0);
        r2.setMarker(r0);
    L_0x0069:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ar2.createItem(int):com.google.android.maps.OverlayItem");
    }

    public ar2(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
        super(boundCenter(App.z().getResources().getDrawable(2130839621)));
    }

    public void draw(Canvas canvas, MapView mapView, boolean z) {
        if (!z) {
            super.draw(canvas, mapView, z);
        }
    }

    public void a() {
        populate();
    }

    public int size() {
        return GroupChatLiveLocationsActivity.f(this.a).j.size();
    }
}
