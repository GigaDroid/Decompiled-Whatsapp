package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.protocol.co;
import org.whispersystems.Y;
import org.whispersystems.at;

class a2 extends Handler {
    final ael a;

    a2(ael com_whatsapp_ael, Looper looper) {
        this.a = com_whatsapp_ael;
        super(looper);
    }

    public void handleMessage(Message message) {
        boolean z = true;
        boolean z2 = l5.s;
        co coVar = (co) message.obj;
        switch (message.what) {
            case at.i /*2*/:
                this.a.d(coVar, message.arg1);
                if (!z2) {
                    return;
                }
                break;
            case Y.t /*10*/:
                break;
            case Y.j /*11*/:
                break;
            default:
                return;
        }
        ael.f(this.a).b(coVar);
        if (!z2) {
            return;
        }
        cn f = ael.f(this.a);
        if (message.arg1 != 1) {
            z = false;
        }
        f.a(coVar, z);
    }
}
