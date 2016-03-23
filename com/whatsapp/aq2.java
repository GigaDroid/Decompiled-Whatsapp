package com.whatsapp;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;

class aq2 implements OnQueryTextListener {
    final MediaGallery a;

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    aq2(MediaGallery mediaGallery) {
        this.a = mediaGallery;
    }

    public boolean onQueryTextChange(String str) {
        if (!TextUtils.equals(MediaGallery.f(this.a), str)) {
            MediaGallery.a(this.a, str);
            MediaGallery.a(this.a, ael.h(str));
            MediaGallery.c(this.a).a(str);
        }
        return false;
    }
}
