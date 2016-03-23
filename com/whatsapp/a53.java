package com.whatsapp;

import android.os.Handler;
import android.os.Looper;

class a53 implements Runnable {
    final n_ a;

    a53(n_ n_Var) {
        this.a = n_Var;
    }

    public void run() {
        new Handler(Looper.getMainLooper()).postDelayed(new o1(this), 60);
    }
}
