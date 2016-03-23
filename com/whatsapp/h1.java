package com.whatsapp;

import com.whatsapp.protocol.ay;

class h1 implements ay {
    final ChangeNumber a;

    public void a(String str) {
        if (App.ay.jabber_id.equals(str)) {
            ChangeNumber.d(this.a).sendEmptyMessage(1);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ChangeNumber.d(this.a).sendEmptyMessage(2);
    }

    h1(ChangeNumber changeNumber) {
        this.a = changeNumber;
    }
}
