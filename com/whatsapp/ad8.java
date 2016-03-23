package com.whatsapp;

class ad8 implements Runnable {
    final j a;
    final long b;

    ad8(j jVar, long j) {
        this.a = jVar;
        this.b = j;
    }

    public void run() {
        if (!this.a.isCancelled()) {
            this.a.a.a(this.b);
        }
    }
}
