package com.whatsapp;

final class auk implements Runnable {
    final boolean a;

    auk(boolean z) {
        this.a = z;
    }

    public void run() {
        vh.a(App.z(), this.a);
    }
}
