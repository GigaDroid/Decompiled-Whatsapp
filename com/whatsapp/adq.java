package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class adq implements OnClickListener {
    final LocationPicker a;

    public void onClick(View view) {
        LocationPicker.f(this.a).runOnFirstFix(new bd(this));
    }

    adq(LocationPicker locationPicker) {
        this.a = locationPicker;
    }
}
