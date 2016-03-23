package com.whatsapp;

import android.graphics.Canvas;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;

class amn extends ItemizedOverlay {
    final GroupChatRecentLocationsActivity a;

    public void a() {
        populate();
    }

    public void draw(Canvas canvas, MapView mapView, boolean z) {
        if (!z) {
            super.draw(canvas, mapView, z);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected com.google.android.maps.OverlayItem createItem(int r9) {
        /*
        r8 = this;
        r6 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.a;
        r0 = com.whatsapp.GroupChatRecentLocationsActivity.f(r0);
        r0 = r0.get(r9);
        r0 = (com.whatsapp.protocol.co) r0;
        r2 = new com.google.android.maps.GeoPoint;
        r4 = r0.m;
        r4 = r4 * r6;
        r3 = (int) r4;
        r4 = r0.l;
        r4 = r4 * r6;
        r4 = (int) r4;
        r2.<init>(r3, r4);
        r3 = new com.google.android.maps.OverlayItem;
        r4 = "";
        r5 = "";
        r3.<init>(r2, r4, r5);
        r4 = r0.b;
        r6 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r4 = r4 + r6;
        r6 = java.lang.System.currentTimeMillis();
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x0051;
    L_0x0039:
        r2 = com.whatsapp.App.z();
        r2 = r2.getResources();
        r4 = 2130839621; // 0x7f020845 float:1.7284258E38 double:1.0527746535E-314;
        r2 = r2.getDrawable(r4);
        r2 = boundCenter(r2);
        r3.setMarker(r2);
        if (r1 == 0) goto L_0x008d;
    L_0x0051:
        r4 = r0.b;
        r6 = 43200000; // 0x2932e00 float:2.1626111E-37 double:2.1343636E-316;
        r4 = r4 + r6;
        r6 = java.lang.System.currentTimeMillis();
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0077;
    L_0x005f:
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r2 = 2130839622; // 0x7f020846 float:1.728426E38 double:1.052774654E-314;
        r0 = r0.getDrawable(r2);
        r0 = boundCenter(r0);
        r3.setMarker(r0);
        if (r1 == 0) goto L_0x008d;
    L_0x0077:
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r1 = 2130839623; // 0x7f020847 float:1.7284262E38 double:1.0527746545E-314;
        r0 = r0.getDrawable(r1);
        r0 = boundCenter(r0);
        r3.setMarker(r0);
    L_0x008d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amn.createItem(int):com.google.android.maps.OverlayItem");
    }

    public amn(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
        super(boundCenter(App.z().getResources().getDrawable(2130839621)));
    }

    public int size() {
        return GroupChatRecentLocationsActivity.f(this.a).size();
    }
}
