package com.whatsapp;

import android.widget.TextView;

class a3v implements Runnable {
    final anu a;
    final TextView b;

    a3v(anu com_whatsapp_anu, TextView textView) {
        this.a = com_whatsapp_anu;
        this.b = textView;
    }

    public void run() {
        this.b.setText("");
    }
}
