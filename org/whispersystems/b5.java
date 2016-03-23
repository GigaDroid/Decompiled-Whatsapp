package org.whispersystems;

import com.google.hx;

public class b5 {
    private R a;

    public byte[] a() {
        return this.a.b();
    }

    public b5(byte[] bArr) {
        this.a = R.a(bArr);
    }

    public b5(int i, e eVar) {
        this.a = R.j().a(i).a(hx.a(eVar.b().a())).b(hx.a(eVar.a().b())).a();
    }

    public int b() {
        return this.a.f();
    }

    public e c() {
        try {
            return new e(bx.a(this.a.g().h(), 0), bx.a(this.a.l().h()));
        } catch (av e) {
            throw new AssertionError(e);
        }
    }
}
