package com.whatsapp;

class a9y implements Runnable {
    final int a;
    final a9z b;

    a9y(a9z com_whatsapp_a9z, int i) {
        this.b = com_whatsapp_a9z;
        this.a = i;
    }

    public void run() {
        if (!a9z.h(this.b).isFinishing()) {
            a9z.h(this.b).showDialog(this.a);
        }
    }
}
