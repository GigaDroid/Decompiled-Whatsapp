package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class hv implements OnClickListener {
    final CountryPicker a;

    hv(CountryPicker countryPicker) {
        this.a = countryPicker;
    }

    public void onClick(View view) {
        CountryPicker.a(this.a).setText("");
    }
}
