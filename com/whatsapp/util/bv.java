package com.whatsapp.util;

import android.view.ViewGroup;

class bv implements Runnable {
    final e a;
    final ViewGroup b;

    public void run() {
        try {
            u.a(this.a.a, this.b);
        } catch (Exception e) {
        }
    }

    bv(e eVar, ViewGroup viewGroup) {
        this.a = eVar;
        this.b = viewGroup;
    }
}
