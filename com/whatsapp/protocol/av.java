package com.whatsapp.protocol;

class av extends a {
    final by a;
    final b5 b;
    final Runnable c;

    public void a(cw cwVar, String str) {
        if (this.c != null) {
            this.c.run();
        }
    }

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    av(by byVar, Runnable runnable, b5 b5Var) {
        this.a = byVar;
        this.c = runnable;
        this.b = b5Var;
    }
}
