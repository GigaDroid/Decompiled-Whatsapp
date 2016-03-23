package com.whatsapp;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;

class ei implements OnActionExpandListener {
    final ContactPicker a;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    ei(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        ContactPicker.b(this.a, null);
        ContactPicker.d(this.a);
        ContactPicker.a(this.a);
        return true;
    }
}
