package com.whatsapp;

final class aa9 implements Runnable {
    final String a;

    public void run() {
        boolean z;
        boolean z2 = true;
        l5 b = App.as.b(this.a);
        if (b.c == -1 && b.o == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!(b.c == 0 && b.o == 0)) {
            z2 = false;
        }
        b.u();
        b.c(-1, -1);
        App.Q.a(b.p);
        App.a2.a(b.p);
        if (!z) {
            App.p.M().post(new aw_(this, z2, b));
        }
    }

    aa9(String str) {
        this.a = str;
    }
}
