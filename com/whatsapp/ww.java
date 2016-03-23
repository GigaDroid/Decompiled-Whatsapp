package com.whatsapp;

import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.MenuItem;
import org.v;
import org.whispersystems.at;

class ww implements OnMenuItemClickListener {
    final LocationPicker a;

    ww(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                this.a.onSearchRequested();
                return true;
            case at.g /*1*/:
                LocationPicker.a(this.a, false);
                LocationPicker.a(this.a, LocationPicker.o(this.a).b(), LocationPicker.o(this.a).c(), null, false);
                return true;
            default:
                return false;
        }
    }
}
