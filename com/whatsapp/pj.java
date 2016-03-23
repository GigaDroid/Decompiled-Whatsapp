package com.whatsapp;

import android.support.annotation.Nullable;

class pj implements o6 {
    final RegisterPhone a;

    pj(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    public void a(@Nullable String str, @Nullable String str2) {
        RegisterPhone.b(this.a, (VerifyNumber.a(str, 0) * 1000) + System.currentTimeMillis());
        RegisterPhone.a(this.a, (VerifyNumber.a(str2, 0) * 1000) + System.currentTimeMillis());
        if (!this.a.t && !this.a.isFinishing()) {
            this.a.showDialog(21);
        }
    }
}
