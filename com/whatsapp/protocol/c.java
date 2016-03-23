package com.whatsapp.protocol;

class c extends a {
    final Runnable a;
    final b5 b;
    final by c;

    c(by byVar, Runnable runnable, b5 b5Var) {
        this.c = byVar;
        this.a = runnable;
        this.b = b5Var;
    }

    public void a(cw cwVar, String str) {
        if (this.a != null) {
            this.a.run();
        }
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }
}
