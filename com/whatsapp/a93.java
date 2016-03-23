package com.whatsapp;

class a93 implements Runnable {
    final String a;
    final Conversations b;

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.a, null);
        } catch (InterruptedException e) {
        }
    }

    a93(Conversations conversations, String str) {
        this.b = conversations;
        this.a = str;
    }
}
