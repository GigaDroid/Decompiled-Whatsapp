package com.whatsapp;

import android.app.Activity;

final class p6 implements Runnable {
    final Activity a;
    final boolean b;
    final String c;

    p6(Activity activity, boolean z, String str) {
        this.a = activity;
        this.b = z;
        this.c = str;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.a, this.b, this.c);
        } catch (InterruptedException e) {
        }
    }
}
