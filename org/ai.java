package org;

import com.whatsapp.protocol.cn;

public class ai implements cn {
    private final ak a;
    final g b;

    ai(g gVar, ak akVar) {
        this.b = gVar;
        this.a = akVar;
    }

    public byte[] a() {
        try {
            return g.d(this.b).b(g.b(this.b).getAndIncrement(), new byte[0], this.a.a());
        } catch (Throwable e) {
            throw new f(e);
        }
    }
}
