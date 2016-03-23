package com.whatsapp;

import android.app.Activity;
import android.os.Handler;
import java.io.IOException;

final class aqc implements Runnable {
    final l5 a;
    final boolean b;
    final Activity c;
    final by d;
    final Handler e;

    aqc(l5 l5Var, boolean z, Handler handler, by byVar, Activity activity) {
        this.a = l5Var;
        this.b = z;
        this.e = handler;
        this.d = byVar;
        this.c = activity;
    }

    public void run() {
        try {
            this.e.post(new a_i(this, App.aK.b(this.a.p, this.b)));
        } catch (IOException e) {
            this.e.post(new fe(this, e.getMessage()));
        }
    }
}
