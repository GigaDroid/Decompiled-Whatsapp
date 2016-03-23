package com.whatsapp;

import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class am3 {
    public ConcurrentHashMap a;

    public am3() {
        this.a = new ConcurrentHashMap();
    }

    public void a(String str, int i, long j) {
        boolean z = l5.s;
        x4 x4Var = (x4) this.a.get(str);
        if (x4Var == null) {
            x4Var = new x4();
            this.a.put(str, x4Var);
        }
        switch (i) {
            case at.m /*5*/:
                break;
            case aF.u /*8*/:
                x4Var.c = j;
                if (!z) {
                    return;
                }
                break;
            case Y.q /*13*/:
                break;
            default:
                return;
        }
        x4Var.a = j;
        if (!z) {
            return;
        }
        x4Var.d = j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(int r7) {
        /*
        r6 = this;
        r0 = 0;
        r4 = com.whatsapp.l5.s;
        r1 = r6.a;
        r1 = r1.values();
        r5 = r1.iterator();
        r1 = r0;
        r2 = r0;
        r3 = r0;
    L_0x0010:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0046;
    L_0x0016:
        r0 = r5.next();
        r0 = (com.whatsapp.x4) r0;
        r0 = r0.a();
        switch(r0) {
            case 5: goto L_0x0031;
            case 8: goto L_0x002d;
            case 13: goto L_0x002f;
            default: goto L_0x0023;
        };
    L_0x0023:
        r0 = r1;
        r1 = r2;
        r2 = r3;
    L_0x0026:
        if (r4 == 0) goto L_0x0042;
    L_0x0028:
        if (r0 < r7) goto L_0x0037;
    L_0x002a:
        r0 = 8;
    L_0x002c:
        return r0;
    L_0x002d:
        r1 = r1 + 1;
    L_0x002f:
        r2 = r2 + 1;
    L_0x0031:
        r3 = r3 + 1;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0026;
    L_0x0037:
        if (r1 < r7) goto L_0x003c;
    L_0x0039:
        r0 = 13;
        goto L_0x002c;
    L_0x003c:
        if (r2 < r7) goto L_0x0040;
    L_0x003e:
        r0 = 5;
        goto L_0x002c;
    L_0x0040:
        r0 = 4;
        goto L_0x002c;
    L_0x0042:
        r3 = r2;
        r2 = r1;
        r1 = r0;
        goto L_0x0010;
    L_0x0046:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.am3.a(int):int");
    }
}
