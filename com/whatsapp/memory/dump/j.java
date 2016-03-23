package com.whatsapp.memory.dump;

public class j extends h {
    private final e d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int n() {
        /*
        r8 = this;
        r1 = 0;
        r3 = com.whatsapp.memory.dump.d.a;
        r8.q();
        r0 = r8.c;
        r0.f();
        r8.q();
        r8.q();
        r8.q();
        r8.q();
        r8.q();
        r8.q();
        r0 = r8.c;
        r0.f();
        r0 = r8.b;
        r0 = r0 * 7;
        r0 = r0 + 4;
        r0 = r0 + 4;
        r4 = r8.g();
        r0 = r0 + 2;
        r2 = r1;
    L_0x0031:
        if (r2 >= r4) goto L_0x0041;
    L_0x0033:
        r8.g();
        r5 = r8.j();
        r5 = r5 + 2;
        r0 = r0 + r5;
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x0031;
    L_0x0041:
        r4 = r8.g();
        r0 = r0 + 2;
        r2 = r1;
    L_0x0048:
        if (r2 >= r4) goto L_0x0073;
    L_0x004a:
        r8.q();
        r5 = r8.c;
        r5 = r5.h();
        r5 = com.whatsapp.memory.dump.d.getType(r5);
        r6 = com.whatsapp.memory.dump.d.OBJECT;
        if (r5 != r6) goto L_0x0060;
    L_0x005b:
        r8.q();
        if (r3 == 0) goto L_0x0063;
    L_0x0060:
        r8.a(r5);
    L_0x0063:
        r6 = r8.b;
        r6 = r6 + 1;
        r7 = r8.a;
        r5 = r7.a(r5);
        r5 = r5 + r6;
        r0 = r0 + r5;
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x0048;
    L_0x0073:
        r2 = r8.g();
        r0 = r0 + 2;
    L_0x0079:
        if (r1 >= r2) goto L_0x008a;
    L_0x007b:
        r8.q();
        r8.m();
        r4 = r8.b;
        r4 = r4 + 1;
        r0 = r0 + r4;
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0079;
    L_0x008a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.memory.dump.j.n():int");
    }

    protected int i() {
        q();
        this.c.f();
        int a = this.a.a(d.getType(m())) * this.c.f();
        ((r) this.c).b(new byte[a]);
        return (((this.b + 4) + 4) + 1) + a;
    }

    protected void a(d dVar) {
        ((r) this.c).a(dVar.getSize());
    }

    public j(r rVar, e eVar) {
        super(rVar);
        this.d = eVar;
    }

    protected int f() {
        int i = d.a;
        q();
        this.c.f();
        long q = q();
        int f = this.c.f();
        for (l c : this.d.a(q)) {
            for (d dVar : c.c()) {
                if (dVar == d.OBJECT) {
                    q();
                    if (i == 0) {
                        continue;
                        if (i != 0) {
                            break;
                            continue;
                        }
                    }
                }
                a(dVar);
                continue;
                if (i != 0) {
                    break;
                    continue;
                }
            }
            if (i != 0) {
                break;
            }
        }
        return (((this.b + 4) + this.b) + 4) + f;
    }
}
