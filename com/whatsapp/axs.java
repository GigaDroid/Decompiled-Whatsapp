package com.whatsapp;

import android.support.v7.widget.SearchView.OnQueryTextListener;

class axs implements OnQueryTextListener {
    final WebImagePicker a;

    axs(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }

    public boolean onQueryTextChange(String str) {
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        WebImagePicker.m(this.a);
        return true;
    }
}
