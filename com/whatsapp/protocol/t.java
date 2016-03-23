package com.whatsapp.protocol;

class t extends a {
    final b5 a;
    final by b;
    final Runnable c;

    t(by byVar, Runnable runnable, b5 b5Var) {
        this.b = byVar;
        this.c = runnable;
        this.a = b5Var;
    }

    public void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public void a(cw cwVar, String str) {
        if (this.c != null) {
            this.c.run();
        }
    }
}
