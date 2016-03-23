package com.google;

import java.io.Serializable;
import java.util.Collections;
import org.v;
import org.whispersystems.at;

public abstract class cV extends bs implements Serializable {
    private static final long serialVersionUID = 1;
    private static final String z;

    static {
        char[] toCharArray = "k@UHtV[\u001cH!OXSH1[\bHTt]M\u001cT\"ZZNR0[MR\u001b6F\bON6\\D]H'Z[\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 63;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 60;
                    break;
                case at.o /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static fE a(fO fOVar, Object obj, fO fOVar2, eR eRVar, int i, eK eKVar) {
        return new fE(fOVar, obj, fOVar2, new s(eRVar, i, eKVar, false, false, null), null);
    }

    protected cV(cR cRVar) {
    }

    public T getParserForType() {
        throw new UnsupportedOperationException(z);
    }

    static boolean b(iI iIVar, fO fOVar, ad adVar, h hVar, int i) {
        return a(iIVar, fOVar, adVar, hVar, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.google.iI r8, com.google.fO r9, com.google.ad r10, com.google.h r11, int r12) {
        /*
        r0 = 0;
        r1 = 1;
        r3 = com.google.bA.b;
        r4 = com.google.f7.b(r12);
        r2 = com.google.f7.a(r12);
        r5 = r11.a(r9, r2);
        if (r5 != 0) goto L_0x015d;
    L_0x0012:
        if (r3 == 0) goto L_0x015a;
    L_0x0014:
        r2 = r1;
    L_0x0015:
        r6 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x0058 }
        r6 = r6.d();	 Catch:{ UnsupportedOperationException -> 0x0058 }
        r7 = 0;
        r6 = com.google.iI.a(r6, r7);	 Catch:{ UnsupportedOperationException -> 0x0058 }
        if (r4 != r6) goto L_0x0026;
    L_0x0024:
        if (r3 == 0) goto L_0x0051;
    L_0x0026:
        r6 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x005a }
        r6 = com.google.s.c(r6);	 Catch:{ UnsupportedOperationException -> 0x005a }
        if (r6 == 0) goto L_0x0050;
    L_0x0030:
        r6 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x005c }
        r6 = com.google.s.a(r6);	 Catch:{ UnsupportedOperationException -> 0x005c }
        r6 = r6.isPackable();	 Catch:{ UnsupportedOperationException -> 0x005c }
        if (r6 == 0) goto L_0x0050;
    L_0x003e:
        r6 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x005c }
        r6 = r6.d();	 Catch:{ UnsupportedOperationException -> 0x005c }
        r7 = 1;
        r6 = com.google.iI.a(r6, r7);	 Catch:{ UnsupportedOperationException -> 0x005c }
        if (r4 != r6) goto L_0x0050;
    L_0x004d:
        if (r3 == 0) goto L_0x0157;
    L_0x004f:
        r0 = r1;
    L_0x0050:
        r2 = r1;
    L_0x0051:
        if (r2 == 0) goto L_0x0060;
    L_0x0053:
        r1 = r10.d(r12);	 Catch:{ UnsupportedOperationException -> 0x005e }
    L_0x0057:
        return r1;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        if (r0 == 0) goto L_0x00b7;
    L_0x0062:
        r0 = r10.n();
        r0 = r10.b(r0);
        r2 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x00f4 }
        r2 = r2.d();	 Catch:{ UnsupportedOperationException -> 0x00f4 }
        r4 = com.google.eK.ENUM;	 Catch:{ UnsupportedOperationException -> 0x00f4 }
        if (r2 != r4) goto L_0x0097;
    L_0x0076:
        r2 = r10.e();	 Catch:{ UnsupportedOperationException -> 0x00f4 }
        if (r2 <= 0) goto L_0x00b2;
    L_0x007c:
        r2 = r10.b();
        r4 = com.google.fE.a(r5);
        r4 = r4.a();
        r2 = r4.findValueByNumber(r2);
        if (r2 == 0) goto L_0x0057;
    L_0x008e:
        r4 = com.google.fE.a(r5);
        r8.a(r4, r2);
        if (r3 == 0) goto L_0x0076;
    L_0x0097:
        r2 = r10.e();
        if (r2 <= 0) goto L_0x00b2;
    L_0x009d:
        r2 = com.google.fE.a(r5);
        r2 = r2.d();
        r2 = com.google.iI.a(r10, r2);
        r4 = com.google.fE.a(r5);
        r8.a(r4, r2);
        if (r3 == 0) goto L_0x0097;
    L_0x00b2:
        r10.g(r0);	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        if (r3 == 0) goto L_0x0057;
    L_0x00b7:
        r0 = com.google.dS.a;	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        r2 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        r2 = r2.b();	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        r2 = r2.ordinal();	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        r0 = r0[r2];	 Catch:{ UnsupportedOperationException -> 0x00f6 }
        switch(r0) {
            case 1: goto L_0x00f8;
            case 2: goto L_0x013b;
            default: goto L_0x00ca;
        };
    L_0x00ca:
        r0 = com.google.fE.a(r5);
        r0 = r0.d();
        r0 = com.google.iI.a(r10, r0);
    L_0x00d6:
        r2 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x0153 }
        r2 = r2.c();	 Catch:{ UnsupportedOperationException -> 0x0153 }
        if (r2 == 0) goto L_0x00e9;
    L_0x00e0:
        r2 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x00f2 }
        r8.a(r2, r0);	 Catch:{ UnsupportedOperationException -> 0x00f2 }
        if (r3 == 0) goto L_0x0057;
    L_0x00e9:
        r2 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x00f2 }
        r8.b(r2, r0);	 Catch:{ UnsupportedOperationException -> 0x00f2 }
        goto L_0x0057;
    L_0x00f2:
        r0 = move-exception;
        throw r0;
    L_0x00f4:
        r0 = move-exception;
        throw r0;
    L_0x00f6:
        r0 = move-exception;
        throw r0;
    L_0x00f8:
        r2 = 0;
        r0 = com.google.fE.a(r5);
        r0 = r0.c();
        if (r0 != 0) goto L_0x0155;
    L_0x0103:
        r0 = com.google.fE.a(r5);
        r0 = r8.c(r0);
        r0 = (com.google.fO) r0;
        if (r0 == 0) goto L_0x0155;
    L_0x010f:
        r0 = r0.toBuilder();
    L_0x0113:
        if (r0 != 0) goto L_0x011d;
    L_0x0115:
        r0 = com.google.fE.b(r5);
        r0 = r0.newBuilderForType();
    L_0x011d:
        r2 = com.google.fE.a(r5);	 Catch:{ UnsupportedOperationException -> 0x014f }
        r2 = r2.d();	 Catch:{ UnsupportedOperationException -> 0x014f }
        r4 = com.google.eK.GROUP;	 Catch:{ UnsupportedOperationException -> 0x014f }
        if (r2 != r4) goto L_0x0132;
    L_0x0129:
        r2 = r5.b();	 Catch:{ UnsupportedOperationException -> 0x0151 }
        r10.a(r2, r0, r11);	 Catch:{ UnsupportedOperationException -> 0x0151 }
        if (r3 == 0) goto L_0x0135;
    L_0x0132:
        r10.a(r0, r11);	 Catch:{ UnsupportedOperationException -> 0x0151 }
    L_0x0135:
        r0 = r0.build();
        if (r3 == 0) goto L_0x00d6;
    L_0x013b:
        r0 = r10.b();
        r2 = com.google.fE.a(r5);
        r2 = r2.a();
        r0 = r2.findValueByNumber(r0);
        if (r0 != 0) goto L_0x00d6;
    L_0x014d:
        goto L_0x0057;
    L_0x014f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        throw r0;
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00f2 }
    L_0x0155:
        r0 = r2;
        goto L_0x0113;
    L_0x0157:
        r0 = r1;
        goto L_0x0051;
    L_0x015a:
        r2 = r1;
        goto L_0x0051;
    L_0x015d:
        r2 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.cV.a(com.google.iI, com.google.fO, com.google.ad, com.google.h, int):boolean");
    }

    protected cV() {
    }

    protected boolean a(ad adVar, h hVar, int i) {
        return adVar.d(i);
    }

    protected Object writeReplace() {
        return new el(this);
    }

    public static fE a(fO fOVar, fO fOVar2, eR eRVar, int i, eK eKVar, boolean z) {
        return new fE(fOVar, Collections.emptyList(), fOVar2, new s(eRVar, i, eKVar, true, z, null), null);
    }

    protected void a() {
    }
}
