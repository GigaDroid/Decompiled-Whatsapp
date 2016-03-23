package com.whatsapp;

import android.support.design.widget.AppBarLayout.LayoutParams;
import android.support.v4.view.MenuItemCompat.OnActionExpandListener;
import android.view.MenuItem;

class alb implements OnActionExpandListener {
    final MediaGallery a;

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        MediaGallery.a(this.a, null);
        ((LayoutParams) this.a.findViewById(2131755438).getLayoutParams()).setScrollFlags(21);
        return true;
    }

    alb(MediaGallery mediaGallery) {
        this.a = mediaGallery;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        ((LayoutParams) this.a.findViewById(2131755438).getLayoutParams()).setScrollFlags(0);
        return true;
    }
}
