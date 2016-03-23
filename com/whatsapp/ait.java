package com.whatsapp;

import android.graphics.Bitmap;

class ait implements Runnable {
    final ax1 a;
    final Bitmap b;

    ait(ax1 com_whatsapp_ax1, Bitmap bitmap) {
        this.a = com_whatsapp_ax1;
        this.b = bitmap;
    }

    public void run() {
        CallLogActivity.c(this.a.a).setImageBitmap(this.b);
    }
}
