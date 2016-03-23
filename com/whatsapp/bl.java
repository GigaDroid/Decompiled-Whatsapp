package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.a5;

class bl implements OnClickListener {
    final LocationPicker2 a;

    bl(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }

    public void onClick(View view) {
        App.a(this.a, LocationPicker2.s(this.a), LocationPicker2.d(this.a));
        LocationPicker2.a(this.a, a5.CUSTOM_LOCATION);
        this.a.finish();
    }
}
