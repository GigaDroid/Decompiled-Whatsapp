package com.whatsapp;

import android.graphics.Bitmap;

class hq implements Runnable {
    final Bitmap a;
    final es b;

    hq(es esVar, Bitmap bitmap) {
        this.b = esVar;
        this.a = bitmap;
    }

    public void run() {
        if (!this.b.isCancelled()) {
            this.b.a.a(this.a, 2130837613, 2131623952);
        }
    }
}
