package com.whatsapp;

import android.os.Message;

class vy implements Runnable {
    final alv a;

    vy(alv com_whatsapp_alv) {
        this.a = com_whatsapp_alv;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        int a = aol.i()[aol.j()].a();
        int i = 0;
        while (i < a) {
            int a2 = aol.a(aol.i()[aol.j()].a(i));
            if (aol.c(a2) == null) {
                Message.obtain(aol.d(), 0, a2, 0, null).sendToTarget();
            }
            i++;
            if (z) {
                return;
            }
        }
    }
}
