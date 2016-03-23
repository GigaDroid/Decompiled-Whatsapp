package com.whatsapp.memory.dump;

import com.whatsapp.WAAppCompatActivity;

public class i extends h {
    private final e d;

    public i(g gVar) {
        super(gVar);
        this.d = new e();
    }

    public e a() {
        return this.d;
    }

    protected int n() {
        int i = 0;
        int i2 = d.a;
        long q = q();
        this.c.f();
        long q2 = q();
        q();
        q();
        q();
        q();
        q();
        this.c.f();
        int i3 = ((this.b * 7) + 4) + 4;
        int g = g();
        i3 += 2;
        int i4 = 0;
        while (i4 < g) {
            g();
            i3 += j() + 2;
            i4++;
            if (i2 != 0) {
                break;
            }
        }
        g = g();
        i3 += 2;
        i4 = 0;
        while (i4 < g) {
            q();
            d type = d.getType(this.c.h());
            a((long) this.a.a(type));
            i3 += this.a.a(type) + (this.b + 1);
            i4++;
            if (i2 != 0) {
                break;
            }
        }
        g = g();
        d[] dVarArr = new d[g];
        i3 += 2;
        while (i < g) {
            q();
            dVarArr[i] = d.getType(m());
            i3 += this.b + 1;
            i++;
            if (i2 != 0) {
                break;
            }
        }
        this.d.a(new l(q, q2, dVarArr));
        if (WAAppCompatActivity.c != 0) {
            d.a = i2 + 1;
        }
        return i3;
    }
}
