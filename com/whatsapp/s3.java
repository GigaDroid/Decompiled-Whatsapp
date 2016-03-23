package com.whatsapp;

import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;

class s3 implements OnActionExpandListener {
    final StarredMessagesActivity a;

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        StarredMessagesActivity.a(this.a, null);
        StarredMessagesActivity.a(this.a);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    s3(StarredMessagesActivity starredMessagesActivity) {
        this.a = starredMessagesActivity;
    }
}
