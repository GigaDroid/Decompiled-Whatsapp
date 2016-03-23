package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.c;
import com.whatsapp.fieldstats.k;

class sq implements OnClickListener {
    final MultipleContactPicker a;

    public void onClick(View view) {
        nf.a(k.TELL_A_FRIEND, c.EMPTY_CONTACTS);
        App.b(this.a);
    }

    sq(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }
}
