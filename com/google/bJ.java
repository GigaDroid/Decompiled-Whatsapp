package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public final class bJ {
    private static final String[] z;
    private final fn a;
    private String[] b;
    private volatile boolean c;
    private final fb[] d;

    static {
        int i;
        String[] strArr = new String[2];
        char[] toCharArray = "7\u0016?\u0000\"5\u001a)\u000f4\u0018\u000f.\u00034Q\u001b5\t5Q\u00115\u0018f\u001c\u001e.\u000f.Q\u0012?\u001f5\u0010\u0018?L2\b\u000f?B".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i2 = 0; length > i2; i2++) {
            char c = cArr[i2];
            switch (i2 % 5) {
                case v.m /*0*/:
                    i = 113;
                    break;
                case at.g /*1*/:
                    i = 127;
                    break;
                case at.i /*2*/:
                    i = 90;
                    break;
                case at.o /*3*/:
                    i = arj.Theme_spinnerStyle;
                    break;
                default:
                    i = 70;
                    break;
            }
            cArr[i2] = (char) (i ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "%\u00173\u001ff\u0005\u0006*\tf\u0015\u0010?\u001ff\u001f\u0010.L.\u0010\t?L#\t\u000b?\u00025\u0018\u00104\u001fh".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i = 113;
                    break;
                case at.g /*1*/:
                    i = 127;
                    break;
                case at.i /*2*/:
                    i = 90;
                    break;
                case at.o /*3*/:
                    i = arj.Theme_spinnerStyle;
                    break;
                default:
                    i = 70;
                    break;
            }
            cArr[length] = (char) (i ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    private fb a(e0 e0Var) {
        try {
            if (e0Var.f() != this.a) {
                throw new IllegalArgumentException(z[0]);
            }
            try {
                if (!e0Var.m()) {
                    return this.d[e0Var.a()];
                }
                throw new IllegalArgumentException(z[1]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public bJ(fn fnVar, String[] strArr) {
        this.a = fnVar;
        this.b = strArr;
        this.d = new fb[fnVar.b().size()];
        this.c = false;
    }

    static fb a(bJ bJVar, e0 e0Var) {
        return bJVar.a(e0Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.bJ a(java.lang.Class r7, java.lang.Class r8) {
        /*
        r6 = this;
        r2 = com.google.bA.b;
        r0 = r6.c;	 Catch:{ IllegalArgumentException -> 0x0007 }
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        return r6;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        monitor-enter(r6);
        r0 = r6.c;	 Catch:{ all -> 0x0010 }
        if (r0 == 0) goto L_0x0013;
    L_0x000e:
        monitor-exit(r6);	 Catch:{ all -> 0x0010 }
        goto L_0x0006;
    L_0x0010:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0010 }
        throw r0;
    L_0x0013:
        r0 = 0;
        r1 = r0;
    L_0x0015:
        r0 = r6.d;	 Catch:{ all -> 0x0010 }
        r0 = r0.length;	 Catch:{ all -> 0x0010 }
        if (r1 >= r0) goto L_0x00a8;
    L_0x001a:
        r0 = r6.a;	 Catch:{ all -> 0x0010 }
        r0 = r0.b();	 Catch:{ all -> 0x0010 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0010 }
        r0 = (com.google.e0) r0;	 Catch:{ all -> 0x0010 }
        r3 = r0.c();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        if (r3 == 0) goto L_0x0069;
    L_0x002c:
        r3 = r0.h();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r4 = com.google.fD.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        if (r3 != r4) goto L_0x0043;
    L_0x0034:
        r3 = r6.d;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r4 = new com.google.hR;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        if (r2 == 0) goto L_0x00a4;
    L_0x0043:
        r3 = r0.h();	 Catch:{ IllegalArgumentException -> 0x00b5 }
        r4 = com.google.fD.ENUM;	 Catch:{ IllegalArgumentException -> 0x00b5 }
        if (r3 != r4) goto L_0x005a;
    L_0x004b:
        r3 = r6.d;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r4 = new com.google.hr;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        if (r2 == 0) goto L_0x00a4;
    L_0x005a:
        r3 = r6.d;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r4 = new com.google.hL;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00b9 }
        if (r2 == 0) goto L_0x00a4;
    L_0x0069:
        r3 = r0.h();	 Catch:{ IllegalArgumentException -> 0x00bb }
        r4 = com.google.fD.MESSAGE;	 Catch:{ IllegalArgumentException -> 0x00bb }
        if (r3 != r4) goto L_0x0080;
    L_0x0071:
        r3 = r6.d;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r4 = new com.google.hF;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00bd }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00bd }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00bd }
        if (r2 == 0) goto L_0x00a4;
    L_0x0080:
        r3 = r0.h();	 Catch:{ IllegalArgumentException -> 0x00bf }
        r4 = com.google.fD.ENUM;	 Catch:{ IllegalArgumentException -> 0x00bf }
        if (r3 != r4) goto L_0x0097;
    L_0x0088:
        r3 = r6.d;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r4 = new com.google.hj;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        if (r2 == 0) goto L_0x00a4;
    L_0x0097:
        r3 = r6.d;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r4 = new com.google.hd;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r5 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r5 = r5[r1];	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r4.<init>(r0, r5, r7, r8);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r3[r1] = r4;	 Catch:{ IllegalArgumentException -> 0x00c3 }
    L_0x00a4:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x00c5;
    L_0x00a8:
        r0 = 1;
        r6.c = r0;	 Catch:{ all -> 0x0010 }
        r0 = 0;
        r6.b = r0;	 Catch:{ all -> 0x0010 }
        monitor-exit(r6);	 Catch:{ all -> 0x0010 }
        goto L_0x0006;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0010 }
    L_0x00c5:
        r1 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bJ.a(java.lang.Class, java.lang.Class):com.google.bJ");
    }

    static fn a(bJ bJVar) {
        return bJVar.a;
    }
}
