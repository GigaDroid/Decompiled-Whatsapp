package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

final class alm implements Callback {
    alm() {
    }

    public boolean handleMessage(Message message) {
        ana com_whatsapp_ana = (ana) h.b().b(ana.class);
        switch (message.what) {
            case v.m /*0*/:
                if (!com_whatsapp_ana.a) {
                    App.a_();
                }
                return true;
            case at.g /*1*/:
                if (!com_whatsapp_ana.a) {
                    App.bf();
                }
                return true;
            default:
                return false;
        }
    }
}
