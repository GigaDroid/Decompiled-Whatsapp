package org.whispersystems;

import com.google.hx;
import java.util.Iterator;
import java.util.LinkedList;

public class bR {
    private U a;

    public U e() {
        return this.a;
    }

    public void a(g gVar) {
        int i = z.a;
        W f = W.b().a(gVar.b()).a(hx.a(gVar.c())).f();
        a1 e = this.a.e();
        e.a(f);
        if (e.l() > 2000) {
            e.b(0);
        }
        this.a = e.h();
        if (a5.o) {
            z.a = i + 1;
        }
    }

    private bR(int i, int i2, byte[] bArr, E e, o oVar) {
        V e2 = V.h().a(i2).a(hx.a(bArr)).e();
        ay a = X.k().a(hx.a(e.a()));
        if (oVar.a()) {
            a.b(hx.a(((u) oVar.c()).b()));
        }
        this.a = U.s().a(i).b(e2).a(a).h();
    }

    public E b() {
        return bx.a(this.a.n().h().h(), 0);
    }

    public int c() {
        return this.a.c();
    }

    public bj d() {
        return new bj(this.a.k().b(), this.a.k().f().h());
    }

    public bR(int i, int i2, byte[] bArr, E e) {
        this(i, i2, bArr, e, o.d());
    }

    public bR(int i, int i2, byte[] bArr, e eVar) {
        this(i, i2, bArr, eVar.b(), o.a(eVar.a()));
    }

    public bR(U u) {
        this.a = u;
    }

    public u a() {
        return bx.a(this.a.n().g().h());
    }

    public void a(bj bjVar) {
        this.a = this.a.e().b(V.h().a(bjVar.d()).a(hx.a(bjVar.b())).e()).h();
    }

    public g a(int i) {
        W w;
        int i2 = z.a;
        Iterable linkedList = new LinkedList(this.a.q());
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            w = (W) it.next();
            if (w.h() == i) {
                it.remove();
                break;
            }
        }
        w = null;
        this.a = this.a.e().e().a(linkedList).h();
        if (w != null) {
            return new g(w.h(), w.f().h());
        }
        if (i2 == 0) {
            return null;
        }
        a5.o = !a5.o;
        return null;
    }

    public boolean b(int i) {
        int i2 = z.a;
        for (W h : this.a.q()) {
            if (h.h() != i) {
                if (i2 != 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }
}
