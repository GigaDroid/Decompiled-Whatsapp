package com.whatsapp;

class hk implements Runnable {
    final long a;
    final akk b;

    hk(akk com_whatsapp_akk, long j) {
        this.b = com_whatsapp_akk;
        this.a = j;
    }

    public void run() {
        if (!this.b.isCancelled()) {
            this.b.a.a(this.a);
        }
    }
}
