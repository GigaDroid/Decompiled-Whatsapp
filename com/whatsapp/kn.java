package com.whatsapp;

class kn implements Runnable {
    final Conversations a;
    final String b;

    kn(Conversations conversations, String str) {
        this.a = conversations;
        this.b = str;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.q(this.b);
        } catch (InterruptedException e) {
        }
    }
}
