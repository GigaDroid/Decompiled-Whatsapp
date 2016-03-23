package com.whatsapp;

final class u2 implements Runnable {
    final String a;

    public void run() {
        App.as.a(App.z().getContentResolver(), this.a);
    }

    u2(String str) {
        this.a = str;
    }
}
