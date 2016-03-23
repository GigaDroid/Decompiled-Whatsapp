package com.whatsapp;

import android.support.v7.widget.SearchView.OnCloseListener;

class tf implements OnCloseListener {
    final WebImagePicker a;

    tf(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }

    public boolean onClose() {
        return true;
    }
}
