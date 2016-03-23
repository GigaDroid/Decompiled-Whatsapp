package com.google;

import java.util.Iterator;
import java.util.Map.Entry;

public class f2 {
    final c8 a;
    private final Iterator b;
    private Entry c;
    private final boolean d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r5, com.google.eb r6) {
        /*
        r4 = this;
        r2 = com.google.bA.b;
    L_0x0002:
        r0 = r4.c;
        if (r0 == 0) goto L_0x007c;
    L_0x0006:
        r0 = r4.c;
        r0 = r0.getKey();
        r0 = (com.google.e0) r0;
        r0 = r0.e();
        if (r0 >= r5) goto L_0x007c;
    L_0x0014:
        r0 = r4.c;
        r0 = r0.getKey();
        r0 = (com.google.e0) r0;
        r1 = r4.d;
        if (r1 == 0) goto L_0x005a;
    L_0x0020:
        r1 = r0.b();
        r3 = com.google.d0.MESSAGE;
        if (r1 != r3) goto L_0x005a;
    L_0x0028:
        r1 = r0.c();
        if (r1 != 0) goto L_0x005a;
    L_0x002e:
        r1 = r4.c;
        r1 = r1 instanceof com.google.R;
        if (r1 == 0) goto L_0x0049;
    L_0x0034:
        r3 = r0.e();
        r1 = r4.c;
        r1 = (com.google.R) r1;
        r1 = r1.a();
        r1 = r1.d();
        r6.b(r3, r1);
        if (r2 == 0) goto L_0x0063;
    L_0x0049:
        r3 = r0.e();
        r1 = r4.c;
        r1 = r1.getValue();
        r1 = (com.google.ci) r1;
        r6.b(r3, r1);
        if (r2 == 0) goto L_0x0063;
    L_0x005a:
        r1 = r4.c;
        r1 = r1.getValue();
        com.google.iI.a(r0, r1, r6);
    L_0x0063:
        r0 = r4.b;
        r0 = r0.hasNext();
        if (r0 == 0) goto L_0x0077;
    L_0x006b:
        r0 = r4.b;
        r0 = r0.next();
        r0 = (java.util.Map.Entry) r0;
        r4.c = r0;
        if (r2 == 0) goto L_0x007a;
    L_0x0077:
        r0 = 0;
        r4.c = r0;
    L_0x007a:
        if (r2 == 0) goto L_0x0002;
    L_0x007c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.f2.a(int, com.google.eb):void");
    }

    f2(c8 c8Var, boolean z, er erVar) {
        this(c8Var, z);
    }

    private f2(c8 c8Var, boolean z) {
        this.a = c8Var;
        this.b = c8.a(this.a).j();
        if (this.b.hasNext()) {
            this.c = (Entry) this.b.next();
        }
        this.d = z;
    }
}
