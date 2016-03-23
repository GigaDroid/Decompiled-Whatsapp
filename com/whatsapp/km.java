package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.whispersystems.at;

class km extends Handler {
    final RegisterName a;

    public void handleMessage(Message message) {
        boolean z = DialogToastActivity.f;
        if (RegisterName.o() != null && zq.a(RegisterName.o())) {
            if (zq.c(RegisterName.o())) {
                if (RegisterName.a(this.a) != null) {
                    RegisterName.a(this.a).a(1);
                    if (!z) {
                        return;
                    }
                }
                return;
            }
            this.a.removeDialog(0);
            switch (zq.b(RegisterName.o())) {
                case at.g /*1*/:
                    this.a.showDialog(1);
                    if (!z) {
                        return;
                    }
                    break;
                case at.o /*3*/:
                    break;
                default:
                    return;
            }
            this.a.showDialog(arj.Theme_switchStyle);
        }
    }

    km(RegisterName registerName, Looper looper) {
        this.a = registerName;
        super(looper);
    }
}
