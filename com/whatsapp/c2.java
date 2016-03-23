package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.util.bd;

class c2 implements Runnable {
    final ao3 a;

    c2(ao3 com_whatsapp_ao3) {
        this.a = com_whatsapp_ao3;
    }

    public void run() {
        try {
            if (bd.a()) {
                this.a.a.postDelayed(this, 1000);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            try {
                ConversationRowLocation.a(this.a.a).onCreate(null);
                ConversationRowLocation.a(this.a.a).onResume();
            } catch (Throwable e) {
                Log.b(e);
            }
            ConversationRowLocation.a(true);
        } catch (IncompatibleClassChangeError e2) {
            throw e2;
        }
    }
}
