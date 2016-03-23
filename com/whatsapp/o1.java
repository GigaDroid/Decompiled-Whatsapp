package com.whatsapp;

import android.os.Build.VERSION;

class o1 implements Runnable {
    final a53 a;

    o1(a53 com_whatsapp_a53) {
        this.a = com_whatsapp_a53;
    }

    public void run() {
        if (VERSION.SDK_INT >= 21) {
            this.a.a.a.getWindow().setStatusBarColor(0);
        }
        this.a.a.a.finish();
    }
}
