package com.whatsapp;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;

class az2 implements OnActionExpandListener {
    final DocumentPickerActivity a;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    az2(DocumentPickerActivity documentPickerActivity) {
        this.a = documentPickerActivity;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        DocumentPickerActivity.a(this.a, null);
        DocumentPickerActivity.f(this.a);
        return true;
    }
}
