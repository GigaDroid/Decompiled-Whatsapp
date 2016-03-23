package com.whatsapp;

class avk implements Runnable {
    final ia a;

    avk(ia iaVar) {
        this.a = iaVar;
    }

    public void run() {
        this.a.a = null;
        this.a.e = null;
    }
}
