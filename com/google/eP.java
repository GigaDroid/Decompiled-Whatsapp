package com.google;

final class eP {
    private fI a;
    private fI b;
    private fI c;
    private hX d;
    private fI e;
    private int f;
    private int g;
    private int h;
    private int i;

    fI e() {
        return this.c;
    }

    fI g() {
        return this.b;
    }

    eP a(int i, int i2, boolean z) {
        fI fIVar;
        int b;
        fI fIVar2;
        int i3 = g0.a;
        fI fIVar3 = this.b;
        fI fIVar4 = this.a;
        fI fIVar5 = this.c;
        fI fIVar6 = this.e;
        if (i > 0) {
            fIVar = z ? this.b : this.c;
            b = ((int) fIVar.b()) - i;
            if (b < 0) {
                b = 0;
            }
            fIVar2 = new fI(fIVar.a(), (float) b);
            if (!z) {
                fIVar = fIVar3;
            } else if (i3 != 0) {
                fIVar = fIVar2;
            }
            fIVar5 = fIVar2;
            fIVar2 = fIVar;
        } else {
            fIVar2 = fIVar3;
        }
        if (i2 > 0) {
            if (z) {
                fIVar = this.a;
            } else {
                fIVar = this.e;
            }
            b = ((int) fIVar.b()) + i2;
            if (b >= this.d.g()) {
                b = this.d.g() - 1;
            }
            fIVar3 = new fI(fIVar.a(), (float) b);
            if (!z) {
                fIVar = fIVar4;
            } else if (i3 != 0) {
                fIVar = fIVar3;
            } else {
                fIVar4 = fIVar6;
            }
            fIVar4 = fIVar3;
            fIVar3 = fIVar;
        } else {
            fIVar3 = fIVar4;
            fIVar4 = fIVar6;
        }
        c();
        return new eP(this.d, fIVar2, fIVar3, fIVar5, fIVar4);
    }

    int i() {
        return this.h;
    }

    fI b() {
        return this.e;
    }

    eP(eP ePVar) {
        a(ePVar.d, ePVar.b, ePVar.a, ePVar.c, ePVar.e);
    }

    int d() {
        return this.i;
    }

    fI h() {
        return this.a;
    }

    static eP a(eP ePVar, eP ePVar2) {
        if (ePVar == null) {
            return ePVar2;
        }
        if (ePVar2 == null) {
            return ePVar;
        }
        return new eP(ePVar.d, ePVar.b, ePVar.a, ePVar2.c, ePVar2.e);
    }

    eP(hX hXVar, fI fIVar, fI fIVar2, fI fIVar3, fI fIVar4) {
        if (!(fIVar == null && fIVar3 == null) && (!(fIVar2 == null && fIVar4 == null) && ((fIVar == null || fIVar2 != null) && (fIVar3 == null || fIVar4 != null)))) {
            a(hXVar, fIVar, fIVar2, fIVar3, fIVar4);
            return;
        }
        throw aN.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r3 = this;
        r2 = 0;
        r0 = r3.b;
        if (r0 != 0) goto L_0x0023;
    L_0x0005:
        r0 = new com.google.fI;
        r1 = r3.c;
        r1 = r1.b();
        r0.<init>(r2, r1);
        r3.b = r0;
        r0 = new com.google.fI;
        r1 = r3.e;
        r1 = r1.b();
        r0.<init>(r2, r1);
        r3.a = r0;
        r0 = com.google.g0.a;
        if (r0 == 0) goto L_0x0053;
    L_0x0023:
        r0 = r3.c;
        if (r0 != 0) goto L_0x0053;
    L_0x0027:
        r0 = new com.google.fI;
        r1 = r3.d;
        r1 = r1.c();
        r1 = r1 + -1;
        r1 = (float) r1;
        r2 = r3.b;
        r2 = r2.b();
        r0.<init>(r1, r2);
        r3.c = r0;
        r0 = new com.google.fI;
        r1 = r3.d;
        r1 = r1.c();
        r1 = r1 + -1;
        r1 = (float) r1;
        r2 = r3.a;
        r2 = r2.b();
        r0.<init>(r1, r2);
        r3.e = r0;
    L_0x0053:
        r0 = r3.b;
        r0 = r0.a();
        r1 = r3.a;
        r1 = r1.a();
        r0 = java.lang.Math.min(r0, r1);
        r0 = (int) r0;
        r3.i = r0;
        r0 = r3.c;
        r0 = r0.a();
        r1 = r3.e;
        r1 = r1.a();
        r0 = java.lang.Math.max(r0, r1);
        r0 = (int) r0;
        r3.g = r0;
        r0 = r3.b;
        r0 = r0.b();
        r1 = r3.c;
        r1 = r1.b();
        r0 = java.lang.Math.min(r0, r1);
        r0 = (int) r0;
        r3.h = r0;
        r0 = r3.a;
        r0 = r0.b();
        r1 = r3.e;
        r1 = r1.b();
        r0 = java.lang.Math.max(r0, r1);
        r0 = (int) r0;
        r3.f = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.eP.c():void");
    }

    private void a(hX hXVar, fI fIVar, fI fIVar2, fI fIVar3, fI fIVar4) {
        this.d = hXVar;
        this.b = fIVar;
        this.a = fIVar2;
        this.c = fIVar3;
        this.e = fIVar4;
        c();
    }

    int a() {
        return this.f;
    }

    int f() {
        return this.g;
    }
}
