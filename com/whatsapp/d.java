package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import com.whatsapp.contact.i;
import com.whatsapp.contact.o;
import com.whatsapp.messaging.co;
import com.whatsapp.protocol.ct;
import org.v;
import org.whispersystems.at;

final class d implements Callback {
    d() {
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case v.m /*0*/:
                i.a(App.z());
                App.b(o.BACKGROUND_FULL);
                return true;
            case at.g /*1*/:
                if (!(message.obj instanceof ct)) {
                    return false;
                }
                App.aF().b(co.c((ct) message.obj));
                return true;
            default:
                return false;
        }
    }
}
