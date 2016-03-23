package org.whispersystems;

import com.google.hx;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.v;

public class t {
    private static final String[] z;
    private Y a;

    static {
        String[] strArr = new String[4];
        String str = "\"j/";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 99;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "0J\u000f_N\fA.ID\f]\u0018z\u0015";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "0J\u000f_N\fA.ID\f]\u0018z\u0015";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "+B\u001dOt+nN\u0019\u0011";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(o oVar, int i, E e) {
        ao a = a8.g().a(i).a(hx.a(e.a()));
        if (oVar.a()) {
            a.b(((Integer) oVar.c()).intValue());
        }
        this.a = this.a.w().b(a.g()).j();
    }

    public t(t tVar) {
        this.a = tVar.a.w().j();
    }

    public void a(bp bpVar) {
        this.a = this.a.w().c(hx.a(bpVar.b())).j();
    }

    public boolean l() {
        return this.a.B();
    }

    public void a(E e, an anVar) {
        C b = b(e);
        Z z = (Z) b.a();
        ah a = z.m().a(aj.i().b(hx.a(anVar.d().getEncoded())).c(hx.a(anVar.b().getEncoded())).a(anVar.c()).a(hx.a(anVar.a().getIV())).d());
        if (a.e() > 2000) {
            a.a(0);
        }
        this.a = this.a.w().a(((Integer) b.b()).intValue(), a.j()).j();
    }

    public cd h() {
        ad q = this.a.k().q();
        return new cd(ag.a(p()), q.f().h(), q.c());
    }

    public void b(int i) {
        this.a = this.a.w().b(i).j();
    }

    public boolean c(E e) {
        return b(e) != null;
    }

    public e b() {
        return new e(i(), bx.a(this.a.k().e().h()));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.whispersystems.bu a() {
        /*
        r5 = this;
        r0 = r5.a;	 Catch:{ av -> 0x0049 }
        r0 = r0.y();	 Catch:{ av -> 0x0049 }
        r0 = r0.m();	 Catch:{ av -> 0x0049 }
        if (r0 == 0) goto L_0x0022;
    L_0x000c:
        r0 = r5.a;	 Catch:{ av -> 0x0049 }
        r0 = r0.y();	 Catch:{ av -> 0x0049 }
        r0 = r0.f();	 Catch:{ av -> 0x0049 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ av -> 0x0049 }
        r0 = org.whispersystems.o.a(r0);	 Catch:{ av -> 0x0049 }
        r1 = org.whispersystems.Y.r;	 Catch:{ av -> 0x0049 }
        if (r1 == 0) goto L_0x0026;
    L_0x0022:
        r0 = org.whispersystems.o.d();	 Catch:{ av -> 0x0049 }
    L_0x0026:
        r1 = new org.whispersystems.bu;	 Catch:{ av -> 0x0049 }
        r2 = r5.a;	 Catch:{ av -> 0x0049 }
        r2 = r2.y();	 Catch:{ av -> 0x0049 }
        r2 = r2.i();	 Catch:{ av -> 0x0049 }
        r3 = r5.a;	 Catch:{ av -> 0x0049 }
        r3 = r3.y();	 Catch:{ av -> 0x0049 }
        r3 = r3.e();	 Catch:{ av -> 0x0049 }
        r3 = r3.h();	 Catch:{ av -> 0x0049 }
        r4 = 0;
        r3 = org.whispersystems.bx.a(r3, r4);	 Catch:{ av -> 0x0049 }
        r1.<init>(r0, r2, r3);	 Catch:{ av -> 0x0049 }
        return r1;
    L_0x0049:
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.t.a():org.whispersystems.bu");
    }

    public void b(bp bpVar) {
        this.a = this.a.w().b(hx.a(bpVar.b())).j();
    }

    public int k() {
        return this.a.h();
    }

    public void a(E e, cd cdVar) {
        C b = b(e);
        Z z = (Z) b.a();
        this.a = this.a.w().a(((Integer) b.b()).intValue(), z.m().b(ad.k().a(hx.a(cdVar.c())).a(cdVar.d()).d()).j()).j();
    }

    public Y c() {
        return this.a;
    }

    public void a(int i) {
        this.a = this.a.w().e(i).j();
    }

    public E i() {
        try {
            return bx.a(this.a.k().f().h(), 0);
        } catch (av e) {
            throw new AssertionError(e);
        }
    }

    public void a(e eVar, cd cdVar) {
        this.a = this.a.w().c(Z.n().a(hx.a(eVar.b().a())).b(hx.a(eVar.a().b())).b(ad.k().a(hx.a(cdVar.c())).a(cdVar.d()).d()).j()).j();
    }

    public int m() {
        return this.a.F();
    }

    public t() {
        this.a = Y.I().j();
    }

    public void a(h hVar) {
        this.a = this.a.w().a(hx.a(hVar.a())).j();
    }

    public void a(cd cdVar) {
        this.a = this.a.w().c(this.a.k().m().b(ad.k().a(hx.a(cdVar.c())).a(cdVar.d()).d()).j()).j();
    }

    public cd a(E e) {
        Z z = (Z) b(e).a();
        if (z == null) {
            return null;
        }
        return new cd(ag.a(p()), z.q().f().h(), z.q().c());
    }

    public int p() {
        int m = this.a.m();
        return m == 0 ? 2 : m;
    }

    public bp o() {
        try {
            if (this.a.c()) {
                return new bp(this.a.K().h(), 0);
            }
            return null;
        } catch (Throwable e) {
            aB.a(z[2], e);
            return null;
        }
    }

    public int g() {
        return this.a.D();
    }

    public t(Y y) {
        this.a = y;
    }

    public boolean f() {
        return this.a.G();
    }

    public void a(byte[] bArr) {
        this.a = this.a.w().d(hx.a(bArr)).j();
    }

    public an a(E e, int i) {
        C b = b(e);
        Z z = (Z) b.a();
        if (z == null) {
            return null;
        }
        an anVar;
        Iterable linkedList = new LinkedList(z.j());
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            aj ajVar = (aj) it.next();
            if (ajVar.k() == i) {
                an anVar2 = new an(new SecretKeySpec(ajVar.f().h(), z[0]), new SecretKeySpec(ajVar.l().h(), z[1]), new IvParameterSpec(ajVar.d().h()), ajVar.k());
                it.remove();
                anVar = anVar2;
                break;
            }
        }
        anVar = null;
        this.a = this.a.w().a(((Integer) b.b()).intValue(), z.m().f().a(linkedList).j()).j();
        return anVar;
    }

    public void b(E e, cd cdVar) {
        this.a = this.a.w().b(Z.n().b(ad.k().a(hx.a(cdVar.c())).a(cdVar.d()).d()).a(hx.a(e.a())).j()).j();
        if (this.a.u().size() > 5) {
            this.a = this.a.w().d(0).j();
        }
    }

    public void d(int i) {
        this.a = this.a.w().a(i).j();
    }

    public void c(int i) {
        this.a = this.a.w().c(i).j();
    }

    public bp e() {
        try {
            return new bp(this.a.d().h(), 0);
        } catch (av e) {
            throw new AssertionError(e);
        }
    }

    public boolean b(E e, int i) {
        int i2 = Y.r;
        Z z = (Z) b(e).a();
        if (z == null) {
            return false;
        }
        for (aj k : z.j()) {
            if (k.k() != i) {
                if (i2 != 0) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public h n() {
        return new h(ag.a(p()), this.a.o().h());
    }

    public void d() {
        this.a = this.a.w().d().j();
    }

    public byte[] j() {
        return this.a.f().h();
    }

    private C b(E e) {
        int i = Y.r;
        int i2 = 0;
        for (Z z : this.a.u()) {
            try {
                if (bx.a(z.f().h(), 0).equals(e)) {
                    return new C(z, Integer.valueOf(i2));
                }
            } catch (Throwable e2) {
                aB.a(z[3], e2);
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return null;
    }
}
