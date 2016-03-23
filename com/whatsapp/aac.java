package com.whatsapp;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.ItemizedOverlay.OnFocusChangeListener;
import com.google.android.maps.OverlayItem;

class aac implements OnFocusChangeListener {
    final LocationPicker a;
    final fr b;

    aac(fr frVar, LocationPicker locationPicker) {
        this.b = frVar;
        this.a = locationPicker;
    }

    public void onFocusChanged(ItemizedOverlay itemizedOverlay, OverlayItem overlayItem) {
        if (overlayItem == null) {
            LocationPicker.a(this.b.a, null);
            LocationPicker.j(this.b.a).notifyDataSetChanged();
        }
    }
}
