package com.whatsapp;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

class aop implements TextWatcher {
    final CountryPicker a;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    aop(CountryPicker countryPicker) {
        this.a = countryPicker;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aam.a(CountryPicker.a(this.a), charSequence);
        CountryPicker.b(this.a).setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        CountryPicker.c(this.a).getFilter().filter(charSequence);
    }

    public void afterTextChanged(Editable editable) {
    }
}
