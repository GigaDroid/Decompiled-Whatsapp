package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class a2y implements TextWatcher {
    final jn a;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aam.a(this.a.a, charSequence);
    }

    a2y(jn jnVar) {
        this.a = jnVar;
    }
}
