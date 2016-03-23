package com.whatsapp;

import android.text.Editable;

public class ar9 extends are {
    private RegisterPhone e;
    final RegisterPhone f;

    public ar9(RegisterPhone registerPhone, RegisterPhone registerPhone2, String str) {
        this.f = registerPhone;
        super(str);
        this.e = registerPhone2;
    }

    public synchronized void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        this.e.r();
    }
}
