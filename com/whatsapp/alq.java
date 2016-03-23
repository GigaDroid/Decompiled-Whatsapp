package com.whatsapp;

class alq implements Runnable {
    final ng a;

    alq(ng ngVar) {
        this.a = ngVar;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.a.a.p, null);
        } catch (InterruptedException e) {
        }
    }
}
