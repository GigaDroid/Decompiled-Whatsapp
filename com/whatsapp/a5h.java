package com.whatsapp;

import com.whatsapp.protocol.c2;
import org.v;
import org.whispersystems.at;

class a5h implements Runnable {
    private static final String z;
    final String a;
    final String b;
    final kd c;
    final c2 d;
    final int e;

    static {
        char[] toCharArray = "WsG".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 22;
                    break;
                case at.i /*2*/:
                    i2 = 37;
                    break;
                case at.o /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a5h(kd kdVar, c2 c2Var, String str, int i, String str2) {
        this.c = kdVar;
        this.d = c2Var;
        this.b = str;
        this.e = i;
        this.a = str2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r14 = this;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r14.d;
        r0 = r0.n;
        if (r0 == 0) goto L_0x00a5;
    L_0x0008:
        r0 = r14.d;
        r0 = r0.a;
        if (r0 == 0) goto L_0x00a5;
    L_0x000e:
        r0 = new com.whatsapp.protocol.c3;
        r1 = r14.d;
        r1 = r1.n;
        r2 = 1;
        r3 = r14.d;
        r3 = r3.a;
        r0.<init>(r1, r2, r3);
        r1 = r14.c;
        com.whatsapp.kd.a(r1);
        r1 = com.whatsapp.App.aK;
        r1 = r1.a(r0);
        r2 = r14.c;
        com.whatsapp.kd.a(r2);
        r2 = com.whatsapp.App.aK;
        r2 = r2.e(r0);
        if (r2 == 0) goto L_0x0097;
    L_0x0034:
        if (r1 == 0) goto L_0x0097;
    L_0x0036:
        r0 = r14.d;
        r0 = r0.n;
        r0 = com.whatsapp.qm.i(r0);
        if (r0 != 0) goto L_0x004a;
    L_0x0040:
        r0 = r14.d;
        r0 = r0.n;
        r0 = com.whatsapp.l5.e(r0);
        if (r0 == 0) goto L_0x00c0;
    L_0x004a:
        r0 = 1;
        r3 = r0;
    L_0x004c:
        r5 = new com.whatsapp.protocol.c2;
        r5.<init>();
        if (r3 == 0) goto L_0x00c3;
    L_0x0053:
        r0 = r1.L;
    L_0x0055:
        r5.r = r0;
        r0 = new java.util.Vector;
        r1 = r2.a;
        r1 = r1.size();
        r0.<init>(r1);
        r5.q = r0;
        r0 = r2.a;
        r0 = r0.entrySet();
        r6 = r0.iterator();
    L_0x006e:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0089;
    L_0x0074:
        r0 = r6.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getValue();
        r1 = (com.whatsapp.x4) r1;
        r7 = r1.a();
        switch(r7) {
            case 5: goto L_0x00f7;
            case 8: goto L_0x00c5;
            case 13: goto L_0x00da;
            default: goto L_0x0087;
        };
    L_0x0087:
        if (r4 == 0) goto L_0x006e;
    L_0x0089:
        r0 = r14.c;
        com.whatsapp.kd.a(r0);
        r0 = r14.b;
        r1 = r14.e;
        com.whatsapp.App.a(r0, r5, r1);
        if (r4 == 0) goto L_0x00a3;
    L_0x0097:
        r0 = r14.c;
        com.whatsapp.kd.a(r0);
        r0 = r14.b;
        r1 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        com.whatsapp.App.a(r0, r1);
    L_0x00a3:
        if (r4 == 0) goto L_0x00b1;
    L_0x00a5:
        r0 = r14.c;
        com.whatsapp.kd.a(r0);
        r0 = r14.b;
        r1 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        com.whatsapp.App.a(r0, r1);
    L_0x00b1:
        r0 = r14.c;
        com.whatsapp.kd.a(r0);
        r0 = r14.b;
        r1 = r14.a;
        r2 = z;
        com.whatsapp.App.c(r0, r1, r2);
        return;
    L_0x00c0:
        r0 = 0;
        r3 = r0;
        goto L_0x004c;
    L_0x00c3:
        r0 = 1;
        goto L_0x0055;
    L_0x00c5:
        r8 = r5.q;
        r9 = new com.whatsapp.protocol.br;
        r2 = r0.getKey();
        r2 = (java.lang.String) r2;
        r10 = 4;
        r12 = r1.a(r7);
        r9.<init>(r2, r10, r12);
        r8.add(r9);
    L_0x00da:
        r2 = 13;
        if (r2 == r7) goto L_0x00e0;
    L_0x00de:
        if (r3 != 0) goto L_0x00f7;
    L_0x00e0:
        r8 = r5.q;
        r9 = new com.whatsapp.protocol.br;
        r2 = r0.getKey();
        r2 = (java.lang.String) r2;
        r10 = 3;
        r11 = 13;
        r12 = r1.a(r11);
        r9.<init>(r2, r10, r12);
        r8.add(r9);
    L_0x00f7:
        r2 = 5;
        if (r2 == r7) goto L_0x00fc;
    L_0x00fa:
        if (r3 != 0) goto L_0x0087;
    L_0x00fc:
        r2 = r5.q;
        r7 = new com.whatsapp.protocol.br;
        r0 = r0.getKey();
        r0 = (java.lang.String) r0;
        r8 = 2;
        r9 = 5;
        r10 = r1.a(r9);
        r7.<init>(r0, r8, r10);
        r2.add(r7);
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5h.run():void");
    }
}
