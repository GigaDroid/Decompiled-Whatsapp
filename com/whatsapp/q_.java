package com.whatsapp;

import com.whatsapp.protocol.bz;
import org.v;
import org.whispersystems.at;

class q_ implements Runnable {
    private static final String[] z;
    final byte[] a;
    final byte[] b;
    final byte c;
    final i1 d;
    final bz e;
    final String f;
    final bz g;

    static {
        String[] strArr = new String[3];
        String str = "q./<Rq$y.W\u007f.<9\u001eh2<}U}9y/[l5+3[|`?/Qu`*8Ln%+}Zm203Y80+8\u001es% }X}4:5\u001e~/+}";
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
                        i3 = 24;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 62;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "q./<Rq$y-L}`28G82<)Kj.<9\u001e~260\u001ek%++[j`=(Lq.>}Nj%y6[a`?8J{(y;Qj`";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "q./<Rq$y4Z}.-4Ja`28G82<)Kj.<9\u001e~260\u001ek%++[j`=(Lq.>}Nj%y6[a`?8J{(y;Qj`34Z8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    q_(i1 i1Var, String str, byte[] bArr, byte b, bz bzVar, bz bzVar2, byte[] bArr2) {
        this.d = i1Var;
        this.f = str;
        this.b = bArr;
        this.c = b;
        this.g = bzVar;
        this.e = bzVar2;
        this.a = bArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r11 = this;
        r6 = 0;
        r7 = 1;
        r10 = 0;
        r0 = r11.f;
        r5 = com.whatsapp.awc.e(r0);
        r0 = r11.b;	 Catch:{ av -> 0x00ae }
        r0 = r0.length;	 Catch:{ av -> 0x00ae }
        r0 = r0 + 1;
        r0 = new byte[r0];	 Catch:{ av -> 0x00ae }
        r1 = 0;
        r2 = r11.c;	 Catch:{ av -> 0x00ae }
        r0[r1] = r2;	 Catch:{ av -> 0x00ae }
        r1 = r11.b;	 Catch:{ av -> 0x00ae }
        r2 = 0;
        r3 = 1;
        r4 = r11.b;	 Catch:{ av -> 0x00ae }
        r4 = r4.length;	 Catch:{ av -> 0x00ae }
        java.lang.System.arraycopy(r1, r2, r0, r3, r4);	 Catch:{ av -> 0x00ae }
        r9 = new org.whispersystems.bp;	 Catch:{ av -> 0x00ae }
        r1 = 0;
        r9.<init>(r0, r1);	 Catch:{ av -> 0x00ae }
    L_0x0025:
        r0 = new org.whispersystems.n;
        r1 = r11.d;
        r1 = com.whatsapp.i1.a(r1);
        r2 = r11.d;
        r2 = com.whatsapp.i1.a(r2);
        r3 = r11.d;
        r3 = com.whatsapp.i1.a(r3);
        r3 = r3.i();
        r4 = r11.d;
        r4 = com.whatsapp.i1.a(r4);
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = r11.g;	 Catch:{ av -> 0x00cc }
        if (r1 == 0) goto L_0x0050;
    L_0x004a:
        r1 = r11.g;	 Catch:{ av -> 0x00cc }
        r1 = r1.c;	 Catch:{ av -> 0x00cc }
        if (r1 != 0) goto L_0x00ce;
    L_0x0050:
        r5 = r6;
    L_0x0051:
        r1 = r11.e;	 Catch:{ av -> 0x0110 }
        r1 = r1.c;	 Catch:{ av -> 0x0110 }
        r1 = r1.length;	 Catch:{ av -> 0x0110 }
        r1 = r1 + 1;
        r1 = new byte[r1];	 Catch:{ av -> 0x0110 }
        r2 = 0;
        r3 = r11.c;	 Catch:{ av -> 0x0110 }
        r1[r2] = r3;	 Catch:{ av -> 0x0110 }
        r2 = r11.e;	 Catch:{ av -> 0x0110 }
        r2 = r2.c;	 Catch:{ av -> 0x0110 }
        r3 = 0;
        r4 = 1;
        r7 = r11.e;	 Catch:{ av -> 0x0110 }
        r7 = r7.c;	 Catch:{ av -> 0x0110 }
        r7 = r7.length;	 Catch:{ av -> 0x0110 }
        java.lang.System.arraycopy(r2, r3, r1, r4, r7);	 Catch:{ av -> 0x0110 }
        r2 = 0;
        r7 = org.whispersystems.bx.a(r1, r2);	 Catch:{ av -> 0x0110 }
    L_0x0072:
        r1 = r11.a;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r2 = org.whispersystems.aw.a(r1);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r1 = r11.g;	 Catch:{ av -> 0x012e, b1 -> 0x0153 }
        if (r1 != 0) goto L_0x0148;
    L_0x007c:
        r4 = -1;
    L_0x007d:
        r1 = r11.e;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r1 = r1.a;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r3 = 0;
        r6 = org.whispersystems.aw.a(r1, r3);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r1 = new org.whispersystems.bM;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r3 = 0;
        r8 = r11.e;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r8 = r8.b;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r0.a(r1);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r0 = r11.d;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r0 = com.whatsapp.i1.b(r0);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r0 = r0.M();	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r1 = new com.whatsapp.anj;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r2 = com.whatsapp.App.aK;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r3 = r11.f;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r2 = r2.E(r3);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r1.<init>(r11, r2);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r0.post(r1);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
    L_0x00ad:
        return;
    L_0x00ae:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r7];
        r1 = r1.append(r2);
        r2 = r11.f;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        r9 = r6;
        goto L_0x0025;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r1 = r11.g;	 Catch:{ av -> 0x00f2 }
        r1 = r1.c;	 Catch:{ av -> 0x00f2 }
        r1 = r1.length;	 Catch:{ av -> 0x00f2 }
        r1 = r1 + 1;
        r1 = new byte[r1];	 Catch:{ av -> 0x00f2 }
        r2 = 0;
        r3 = r11.c;	 Catch:{ av -> 0x00f2 }
        r1[r2] = r3;	 Catch:{ av -> 0x00f2 }
        r2 = r11.g;	 Catch:{ av -> 0x00f2 }
        r2 = r2.c;	 Catch:{ av -> 0x00f2 }
        r3 = 0;
        r4 = 1;
        r5 = r11.g;	 Catch:{ av -> 0x00f2 }
        r5 = r5.c;	 Catch:{ av -> 0x00f2 }
        r5 = r5.length;	 Catch:{ av -> 0x00f2 }
        java.lang.System.arraycopy(r2, r3, r1, r4, r5);	 Catch:{ av -> 0x00f2 }
        r2 = 0;
        r1 = org.whispersystems.bx.a(r1, r2);	 Catch:{ av -> 0x00f2 }
    L_0x00ef:
        r5 = r1;
        goto L_0x0051;
    L_0x00f2:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r11.f;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.b(r2, r1);
        r1 = r6;
        goto L_0x00ef;
    L_0x0110:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r10];
        r2 = r2.append(r3);
        r3 = r11.f;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.b(r2, r1);
        r7 = r6;
        goto L_0x0072;
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
    L_0x0130:
        r0 = move-exception;
    L_0x0131:
        com.whatsapp.util.Log.a(r0);
        r0 = r11.d;
        r0 = com.whatsapp.i1.b(r0);
        r0 = r0.M();
        r1 = new com.whatsapp.anj;
        r1.<init>(r11, r10);
        r0.post(r1);
        goto L_0x00ad;
    L_0x0148:
        r1 = r11.g;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r1 = r1.a;	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        r3 = 0;
        r4 = org.whispersystems.aw.a(r1, r3);	 Catch:{ av -> 0x0130, b1 -> 0x0153 }
        goto L_0x007d;
    L_0x0153:
        r0 = move-exception;
        goto L_0x0131;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.q_.run():void");
    }
}
