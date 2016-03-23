package com.whatsapp;

final class j8 implements Runnable {
    final l5 a;

    j8(l5 l5Var) {
        this.a = l5Var;
    }

    public void run() {
        App.as.a(App.z().getContentResolver(), this.a.p);
    }
}
