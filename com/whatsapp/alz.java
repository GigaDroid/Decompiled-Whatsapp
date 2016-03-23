package com.whatsapp;

class alz implements Runnable {
    final App a;

    alz(App app) {
        this.a = app;
    }

    public void run() {
        App.I();
    }
}
