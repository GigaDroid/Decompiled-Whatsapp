package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class bj extends aX {
    private static final String z;

    static {
        char[] toCharArray = "=i\u0013Y=\u0010!\u0012\u0015.\fo\u0012Py".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = 6;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.o /*3*/:
                    i2 = 53;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.eE r5, com.google.hH r6) {
        /*
        r4 = this;
        r2 = com.google.bG.l;
        if (r6 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r6.c();	 Catch:{ IllegalArgumentException -> 0x00c0 }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r5.b();	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r2 == 0) goto L_0x00d0;
    L_0x000f:
        r0 = r6.b();	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r0 == 0) goto L_0x0040;
    L_0x0015:
        r0 = r6.d();
        r1 = r0.j();	 Catch:{ IllegalArgumentException -> 0x00c4 }
        if (r1 == 0) goto L_0x0028;
    L_0x001f:
        r1 = r0.a();	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r5.a(r1);	 Catch:{ IllegalArgumentException -> 0x00c6 }
        if (r2 == 0) goto L_0x003e;
    L_0x0028:
        r1 = r0.d();	 Catch:{ IllegalArgumentException -> 0x00c8 }
        if (r1 == 0) goto L_0x0037;
    L_0x002e:
        r1 = r0.g();	 Catch:{ IllegalArgumentException -> 0x00ca }
        r5.a(r1);	 Catch:{ IllegalArgumentException -> 0x00ca }
        if (r2 == 0) goto L_0x003e;
    L_0x0037:
        r0 = r0.i();	 Catch:{ IllegalArgumentException -> 0x00ca }
        r5.b(r0);	 Catch:{ IllegalArgumentException -> 0x00ca }
    L_0x003e:
        if (r2 == 0) goto L_0x00d0;
    L_0x0040:
        r0 = r6.f();	 Catch:{ IllegalArgumentException -> 0x00cc }
        if (r0 == 0) goto L_0x0067;
    L_0x0046:
        r5.c();
        r0 = r6.a();
        r1 = r0.iterator();
    L_0x0051:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0062;
    L_0x0057:
        r0 = r1.next();
        r0 = (com.google.hH) r0;
        r4.a(r5, r0);
        if (r2 == 0) goto L_0x0051;
    L_0x0062:
        r5.e();	 Catch:{ IllegalArgumentException -> 0x00ce }
        if (r2 == 0) goto L_0x00d0;
    L_0x0067:
        r0 = r6.e();	 Catch:{ IllegalArgumentException -> 0x00ce }
        if (r0 == 0) goto L_0x00a1;
    L_0x006d:
        r5.a();
        r0 = r6.g();
        r0 = r0.a();
        r3 = r0.iterator();
    L_0x007c:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x009c;
    L_0x0082:
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r5.c(r1);
        r0 = r0.getValue();
        r0 = (com.google.hH) r0;
        r4.a(r5, r0);
        if (r2 == 0) goto L_0x007c;
    L_0x009c:
        r5.g();	 Catch:{ IllegalArgumentException -> 0x00be }
        if (r2 == 0) goto L_0x00d0;
    L_0x00a1:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00be }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00be }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x00be }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00be }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00be }
        r2 = r6.getClass();	 Catch:{ IllegalArgumentException -> 0x00be }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00be }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00be }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x00be }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bj.a(com.google.eE, com.google.hH):void");
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (hH) obj);
    }

    bj() {
    }
}
