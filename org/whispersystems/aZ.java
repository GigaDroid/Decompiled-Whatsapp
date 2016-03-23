package org.whispersystems;

import com.google.hx;

public class aZ {
    private at a;

    public int d() {
        return this.a.j();
    }

    public byte[] b() {
        return this.a.q().h();
    }

    public aZ(byte[] bArr) {
        this.a = at.a(bArr);
    }

    public aZ(int i, long j, e eVar, byte[] bArr) {
        this.a = at.k().a(i).c(hx.a(eVar.b().a())).b(hx.a(eVar.a().b())).a(hx.a(bArr)).a(j).c();
    }

    public byte[] a() {
        return this.a.b();
    }

    public e c() {
        try {
            return new e(bx.a(this.a.g().h(), 0), bx.a(this.a.p().h()));
        } catch (av e) {
            throw new AssertionError(e);
        }
    }
}
