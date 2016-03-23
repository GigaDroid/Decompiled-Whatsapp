package org;

import com.whatsapp.WAAppCompatActivity;
import java.util.concurrent.atomic.AtomicLong;

public class g {
    public static int d;
    private AtomicLong a;
    private final aw b;
    private final aw c;
    private AtomicLong e;
    final a9 f;

    public g(byte[] bArr, byte[] bArr2, a9 a9Var) {
        int i = d;
        this.a = new AtomicLong(0);
        this.e = new AtomicLong(0);
        this.b = new aw(bArr);
        this.c = new aw(bArr2);
        this.f = a9Var;
        if (WAAppCompatActivity.c != 0) {
            d = i + 1;
        }
    }

    static AtomicLong c(g gVar) {
        return gVar.a;
    }

    static aw d(g gVar) {
        return gVar.c;
    }

    static AtomicLong b(g gVar) {
        return gVar.e;
    }

    static aw a(g gVar) {
        return gVar.b;
    }
}
