package com.whatsapp.util;

import java.io.FileOutputStream;
import java.io.OutputStream;

public final class x {
    final b6 a;
    private final bl b;
    private boolean c;

    static bl a(x xVar) {
        return xVar.b;
    }

    public OutputStream a(int i) {
        OutputStream b0Var;
        synchronized (this.a) {
            if (bl.b(this.b) != this) {
                throw new IllegalStateException();
            }
            b0Var = new b0(this, new FileOutputStream(this.b.b(i)), null);
        }
        return b0Var;
    }

    public void a() {
        try {
            if (this.c) {
                b6.a(this.a, this, false);
                this.a.c(bl.a(this.b));
                if (Log.h == 0) {
                    return;
                }
            }
            b6.a(this.a, this, true);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void b() {
        b6.a(this.a, this, false);
    }

    private x(b6 b6Var, bl blVar) {
        this.a = b6Var;
        this.b = blVar;
    }

    x(b6 b6Var, bl blVar, aa aaVar) {
        this(b6Var, blVar);
    }

    static boolean a(x xVar, boolean z) {
        xVar.c = z;
        return z;
    }
}
