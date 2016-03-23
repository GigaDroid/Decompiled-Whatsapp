package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aeh implements OnClickListener {
    final MultipleContactPicker a;

    public void onClick(View view) {
        MultipleContactPicker.c(this.a).setVisibility(8);
        MultipleContactPicker.e(this.a).setText("");
    }

    aeh(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }
}
