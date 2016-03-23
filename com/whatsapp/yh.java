package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class yh extends ap {
    final LocationPicker2 b;

    yh(LocationPicker2 locationPicker2) {
        this.b = locationPicker2;
    }

    public void a(View view) {
        App.c(this.b);
    }
}
