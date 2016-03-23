package com.whatsapp;

import org.v;
import org.whispersystems.at;

class ae implements Runnable {
    private static final String[] z;
    final rp a;
    private long b;
    private long c;

    static {
        String[] strArr = new String[2];
        String str = "1\u0005E-91\u001e\u00046:!\u000fY/= ED7;:\u000bE>=}\u001cN++;\u0005Ed";
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
                        i3 = 82;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = 88;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "r\u0019J/=6W";
                    obj = null;
            }
        }
    }

    ae(rp rpVar) {
        this.a = rpVar;
        this.b = 5000;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.as;
        r0 = r0.b();
        r2 = r6.a;
        r2 = r2.a();
        r3 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0037 }
        r3.<init>();	 Catch:{ InterruptedException -> 0x0037 }
        r4 = z;	 Catch:{ InterruptedException -> 0x0037 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ InterruptedException -> 0x0037 }
        r3 = r3.append(r4);	 Catch:{ InterruptedException -> 0x0037 }
        r3 = r3.append(r0);	 Catch:{ InterruptedException -> 0x0037 }
        r4 = z;	 Catch:{ InterruptedException -> 0x0037 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ InterruptedException -> 0x0037 }
        r3 = r3.append(r4);	 Catch:{ InterruptedException -> 0x0037 }
        r3 = r3.append(r2);	 Catch:{ InterruptedException -> 0x0037 }
        r3 = r3.toString();	 Catch:{ InterruptedException -> 0x0037 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ InterruptedException -> 0x0037 }
        if (r2 != r0) goto L_0x0039;
    L_0x0036:
        return;
    L_0x0037:
        r0 = move-exception;
        throw r0;
    L_0x0039:
        r0 = com.whatsapp.App.p;	 Catch:{ InterruptedException -> 0x00aa }
        r0 = r0.M();	 Catch:{ InterruptedException -> 0x00aa }
        r2 = r6.a;	 Catch:{ InterruptedException -> 0x00aa }
        r2 = com.whatsapp.rp.b(r2);	 Catch:{ InterruptedException -> 0x00aa }
        r0.post(r2);	 Catch:{ InterruptedException -> 0x00aa }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00aa }
        r4 = r6.c;	 Catch:{ InterruptedException -> 0x00aa }
        r2 = r2 - r4;
        r4 = r6.b;	 Catch:{ InterruptedException -> 0x00aa }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x005b;
    L_0x0055:
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r6.b = r2;	 Catch:{ InterruptedException -> 0x00aa }
        if (r1 == 0) goto L_0x0069;
    L_0x005b:
        r2 = r6.b;	 Catch:{ InterruptedException -> 0x00ac }
        r4 = 2;
        r2 = r2 * r4;
        r4 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ InterruptedException -> 0x00ac }
        r6.b = r2;	 Catch:{ InterruptedException -> 0x00ac }
    L_0x0069:
        r2 = com.whatsapp.App.z();	 Catch:{ InterruptedException -> 0x00ae }
        r0 = com.whatsapp.App.q();	 Catch:{ InterruptedException -> 0x00ae }
        if (r0 == 0) goto L_0x00b0;
    L_0x0073:
        r0 = com.whatsapp.contact.o.INTERACTIVE_DELTA;	 Catch:{ InterruptedException -> 0x00ae }
    L_0x0075:
        r0 = com.whatsapp.contact.i.b(r2, r0);
        r2 = r0.isFailure();	 Catch:{ InterruptedException -> 0x00b3 }
        if (r2 == 0) goto L_0x0087;
    L_0x007f:
        r2 = r6.a;	 Catch:{ InterruptedException -> 0x00b3 }
        r3 = 0;
        r2.a(r3);	 Catch:{ InterruptedException -> 0x00b3 }
        if (r1 == 0) goto L_0x0093;
    L_0x0087:
        r1 = r0.isSuccess();	 Catch:{ InterruptedException -> 0x00b5 }
        if (r1 == 0) goto L_0x0093;
    L_0x008d:
        r1 = r6.a;	 Catch:{ InterruptedException -> 0x00b7 }
        r2 = 0;
        r1.b(r2);	 Catch:{ InterruptedException -> 0x00b7 }
    L_0x0093:
        r2 = r6.b;	 Catch:{ InterruptedException -> 0x00b9 }
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x00b9 }
    L_0x0098:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00a8 }
        r6.c = r2;	 Catch:{ InterruptedException -> 0x00a8 }
        r1 = com.whatsapp.contact.j.IN_PROGRESS;	 Catch:{ InterruptedException -> 0x00a8 }
        if (r0 != r1) goto L_0x0036;
    L_0x00a2:
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x00a8 }
        com.whatsapp.rp.a(r0);	 Catch:{ InterruptedException -> 0x00a8 }
        goto L_0x0036;
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = com.whatsapp.contact.o.BACKGROUND_DELTA;
        goto L_0x0075;
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r1 = move-exception;
        goto L_0x0098;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ae.run():void");
    }
}
