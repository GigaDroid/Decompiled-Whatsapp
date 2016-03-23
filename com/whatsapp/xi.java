package com.whatsapp;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;

class xi implements OnActionExpandListener {
    final Conversations a;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        Conversations.a(this.a).a("");
        return true;
    }

    xi(Conversations conversations) {
        this.a = conversations;
    }
}
