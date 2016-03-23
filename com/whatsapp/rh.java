package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class rh implements TextWatcher {
    final MultipleContactsSelector a;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    rh(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aam.a(this.a.p, charSequence);
    }
}
