package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ax3 implements OnClickListener {
    final LocationPicker2 a;

    public void onClick(View view) {
        LocationPicker2.p(this.a).b();
    }

    ax3(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
