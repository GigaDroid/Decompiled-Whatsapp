package com.whatsapp.protocol;

class ar extends a {
    final by a;
    final b5 b;
    final Runnable c;

    ar(by byVar, Runnable runnable, b5 b5Var) {
        this.a = byVar;
        this.c = runnable;
        this.b = b5Var;
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
        by.c(this.a).e(i);
    }

    public void a(cw cwVar, String str) {
        if (this.c != null) {
            this.c.run();
        }
    }
}
