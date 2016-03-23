package com.whatsapp;

import android.graphics.Canvas;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;

class fr extends ItemizedOverlay {
    final LocationPicker a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean onTap(int r3) {
        /*
        r2 = this;
        r0 = r2.a;
        r1 = r2.a;
        r1 = com.whatsapp.LocationPicker.n(r1);
        r1 = r1.b(r3);
        com.whatsapp.LocationPicker.a(r0, r1);
        r0 = r2.a;
        r0 = com.whatsapp.LocationPicker.j(r0);
        r0.notifyDataSetChanged();
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 8;
        if (r0 < r1) goto L_0x002b;
    L_0x001e:
        r0 = r2.a;
        r0 = com.whatsapp.LocationPicker.l(r0);
        r0.smoothScrollToPosition(r3);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0034;
    L_0x002b:
        r0 = r2.a;
        r0 = com.whatsapp.LocationPicker.l(r0);
        r0.setSelection(r3);
    L_0x0034:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fr.onTap(int):boolean");
    }

    public int size() {
        if (LocationPicker.n(this.a) == null) {
            return 0;
        }
        return LocationPicker.n(this.a).o();
    }

    public void draw(Canvas canvas, MapView mapView, boolean z) {
        if (!z) {
            super.draw(canvas, mapView, false);
        }
    }

    public fr(LocationPicker locationPicker) {
        this.a = locationPicker;
        super(boundCenter(App.z().getResources().getDrawable(2130839768)));
        setOnFocusChangeListener(new aac(this, locationPicker));
    }

    protected OverlayItem createItem(int i) {
        PlaceInfo b = LocationPicker.n(this.a).b(i);
        OverlayItem overlayItem = new OverlayItem(new GeoPoint((int) (b.lat * 1000000.0d), (int) (b.lon * 1000000.0d)), "", "");
        overlayItem.setMarker(boundCenter(App.z().getResources().getDrawable(2130839768)));
        return overlayItem;
    }

    public void a() {
        setLastFocusedIndex(-1);
        populate();
    }
}
