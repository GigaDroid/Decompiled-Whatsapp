package com.whatsapp;

import com.whatsapp.DialogToastActivity.ProgressDialogFragment;
import com.whatsapp.util.Log;

class d2 implements Runnable {
    final amt a;
    final ProgressDialogFragment b;

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        App.aK.s();
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis < 3000) {
            try {
                Thread.sleep(3000 - currentTimeMillis);
            } catch (Throwable e) {
                Log.a(e);
            }
        }
        App.p.M().post(new adr(this));
    }

    d2(amt com_whatsapp_amt, ProgressDialogFragment progressDialogFragment) {
        this.a = com_whatsapp_amt;
        this.b = progressDialogFragment;
    }
}
