package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class dx implements OnClickListener {
    final WebImagePicker a;

    dx(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }

    public void onClick(View view) {
        WebImagePicker.m(this.a);
    }
}
