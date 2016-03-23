package com.whatsapp.protocol;

import java.util.Vector;

class ax extends a {
    final Runnable a;
    final b5 b;
    final by c;

    public void a(int i) {
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void a(cw cwVar, String str) {
        by.a(this.c, cwVar, new Vector());
        by.b(this.c).a();
        if (this.a != null) {
            this.a.run();
        }
    }

    ax(by byVar, Runnable runnable, b5 b5Var) {
        this.c = byVar;
        this.a = runnable;
        this.b = b5Var;
    }
}
