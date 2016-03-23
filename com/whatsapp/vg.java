package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class vg implements TextWatcher {
    final MultipleContactPicker a;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    vg(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aam.a(MultipleContactPicker.e(this.a), charSequence);
        if (charSequence.length() > 0) {
            MultipleContactPicker.b(this.a, ael.h(charSequence.toString()));
            MultipleContactPicker.a(this.a, MultipleContactPicker.b(this.a));
            MultipleContactPicker.c(this.a).setVisibility(0);
            MultipleContactPicker.a(this.a, true);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        MultipleContactPicker.b(this.a, null);
        MultipleContactPicker.c(this.a).setVisibility(8);
        MultipleContactPicker.g(this.a);
        MultipleContactPicker.a(this.a, false);
    }
}
