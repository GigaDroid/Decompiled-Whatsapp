package com.whatsapp;

class a_w implements Runnable {
    final App a;

    a_w(App app) {
        this.a = app;
    }

    public void run() {
        ContactChooserTargetService.a(App.r(App.z()));
    }
}
