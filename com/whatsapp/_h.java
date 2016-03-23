package com.whatsapp;

import org.v;
import org.whispersystems.at;

class _h implements Runnable {
    private static final String[] z;
    final byte[] a;
    final byte[][] b;
    final byte[] c;
    final i1 d;
    final byte[] e;
    final byte f;

    static {
        String[] strArr = new String[4];
        String str = "Coy1mV{6-pG7}8{\u0002s\u007f:gQc6>jGt}}dC~z8f";
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
                        i3 = 34;
                        break;
                    case at.g /*1*/:
                        i3 = 23;
                        break;
                    case at.i /*2*/:
                        i3 = 22;
                        break;
                    case at.o /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 2;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "q_Wl";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "Coy1mV{6-pG7}8{\u0002s\u007f:gQc6>jGt}}rCde8f";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Coy1mV{6-pG7}8{\u0002s\u007f:gQc6\u000eJc&6<nExd4vJz6(lIyy*l";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7 = this;
        r1 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.f;	 Catch:{ NoSuchAlgorithmException -> 0x0012 }
        r3 = 5;
        if (r0 == r3) goto L_0x0014;
    L_0x0008:
        r0 = r7.d;	 Catch:{ NoSuchAlgorithmException -> 0x0012 }
        com.whatsapp.i1.c(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0012 }
        r0 = 0;
        com.whatsapp.App.g(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0012 }
    L_0x0011:
        return;
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r0 = r7.c;
        r0 = org.whispersystems.aw.a(r0);
        r3 = r7.d;	 Catch:{ NoSuchAlgorithmException -> 0x0030 }
        r3 = com.whatsapp.i1.a(r3);	 Catch:{ NoSuchAlgorithmException -> 0x0030 }
        r3 = r3.a();	 Catch:{ NoSuchAlgorithmException -> 0x0030 }
        if (r0 == r3) goto L_0x0032;
    L_0x0026:
        r0 = r7.d;	 Catch:{ NoSuchAlgorithmException -> 0x0030 }
        com.whatsapp.i1.c(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0030 }
        r0 = 0;
        com.whatsapp.App.g(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0030 }
        goto L_0x0011;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = r7.d;
        r0 = com.whatsapp.i1.a(r0);
        r0 = r0.f();
        r3 = r7.d;
        r3 = com.whatsapp.i1.a(r3);
        r3 = r3.i();
        r3 = r3.b();
        r4 = r3.a;	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        r5 = r7.e;	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        r4 = java.util.Arrays.equals(r4, r5);	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        if (r4 != 0) goto L_0x0060;
    L_0x0054:
        r0 = r7.d;	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        com.whatsapp.i1.c(r0);	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        r0 = 0;
        com.whatsapp.App.g(r0);	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        goto L_0x0011;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r4 = r7.d;
        r5 = r7.b;
        r4 = com.whatsapp.i1.a(r4, r5);
        r5 = r7.d;
        r5 = com.whatsapp.i1.a(r5);
        r4 = r5.a(r4);
        if (r4 == 0) goto L_0x007a;
    L_0x0074:
        r5 = r4.length;	 Catch:{ NoSuchAlgorithmException -> 0x0086 }
        r6 = r7.b;	 Catch:{ NoSuchAlgorithmException -> 0x0086 }
        r6 = r6.length;	 Catch:{ NoSuchAlgorithmException -> 0x0086 }
        if (r5 == r6) goto L_0x0088;
    L_0x007a:
        r0 = r7.d;	 Catch:{ NoSuchAlgorithmException -> 0x0084 }
        com.whatsapp.i1.c(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0084 }
        r0 = 0;
        com.whatsapp.App.g(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0084 }
        goto L_0x0011;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x0084 }
    L_0x0088:
        r5 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00d5 }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ NoSuchAlgorithmException -> 0x00d5 }
        r5 = java.security.MessageDigest.getInstance(r5);	 Catch:{ NoSuchAlgorithmException -> 0x00d5 }
        r5.update(r0);
        r0 = r3.c;
        r5.update(r0);
        r0 = r3.b;
        r5.update(r0);
        r3 = r4.length;
        r0 = r1;
    L_0x00a0:
        if (r0 >= r3) goto L_0x00ad;
    L_0x00a2:
        r6 = r4[r0];
        r6 = r6.c;
        r5.update(r6);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x00a0;
    L_0x00ad:
        r0 = r5.digest();
        r3 = r7.a;	 Catch:{ NoSuchAlgorithmException -> 0x00e8 }
        r0 = java.util.Arrays.equals(r0, r3);	 Catch:{ NoSuchAlgorithmException -> 0x00e8 }
        if (r0 != 0) goto L_0x00c8;
    L_0x00b9:
        r0 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
        r3 = 0;
        r0 = r0[r3];	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
        r0 = r7.d;	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
        com.whatsapp.i1.c(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
        if (r2 == 0) goto L_0x00d0;
    L_0x00c8:
        r0 = z;	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
        r2 = 3;
        r0 = r0[r2];	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
    L_0x00d0:
        com.whatsapp.App.g(r1);
        goto L_0x0011;
    L_0x00d5:
        r0 = move-exception;
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        com.whatsapp.util.Log.c(r2, r0);
        r0 = r7.d;
        com.whatsapp.i1.c(r0);
        com.whatsapp.App.g(r1);
        goto L_0x0011;
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._h.run():void");
    }

    _h(i1 i1Var, byte b, byte[] bArr, byte[] bArr2, byte[][] bArr3, byte[] bArr4) {
        this.d = i1Var;
        this.f = b;
        this.c = bArr;
        this.e = bArr2;
        this.b = bArr3;
        this.a = bArr4;
    }
}
