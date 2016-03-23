package com.whatsapp;

import com.whatsapp.protocol.b5;

class at5 implements b5 {
    final ChangeNumber a;

    at5(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }

    public void a(int i) {
        ChangeNumber.d(this.a).sendEmptyMessage(3);
    }
}
