package com.whatsapp;

import android.support.v4.view.MenuItemCompat;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class ae8 implements OnScrollListener {
    final MediaGallery a;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    ae8(MediaGallery mediaGallery) {
        this.a = mediaGallery;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (MediaGallery.g(this.a) != null && MenuItemCompat.isActionViewExpanded(MediaGallery.g(this.a)) && this.a.getCurrentFocus() != null) {
            MediaGallery.e(this.a).hideSoftInputFromWindow(absListView.getWindowToken(), 2);
        }
    }
}
