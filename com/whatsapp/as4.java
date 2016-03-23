package com.whatsapp;

final class as4 implements Runnable {
    final int a;

    as4(int i) {
        this.a = i;
    }

    public void run() {
        vh.a(App.z(), this.a);
    }
}
