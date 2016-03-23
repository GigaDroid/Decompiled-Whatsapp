package com.whatsapp;

import android.widget.TextView;

class awy implements Runnable {
    final TextView a;
    final anu b;

    awy(anu com_whatsapp_anu, TextView textView) {
        this.b = com_whatsapp_anu;
        this.a = textView;
    }

    public void run() {
        this.a.setText("");
    }
}
