package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import org.v;
import org.whispersystems.at;

class kt extends Handler {
    private static final String z;
    final SetStatus a;

    static {
        char[] toCharArray = "w]KO*VZ\u0016Y2G\u0000\u000b]6".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 55;
                    break;
                case at.g /*1*/:
                    i2 = 46;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.o /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 66;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
        r7 = this;
        r3 = 1;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r8.what;
        if (r0 != r3) goto L_0x0062;
    L_0x0008:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = com.whatsapp.App.ad();
        r0 = r0.append(r1);
        r1 = z;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.App.y(r0);
        r0 = r7.a;
        r0 = r0.p;
        r1 = com.whatsapp.App.v;
        r0.a(r1);
        r0 = com.whatsapp.SetStatus.v;
        r5 = r0.iterator();
        r1 = r2;
    L_0x0032:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0087;
    L_0x0038:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r6 = com.whatsapp.App.v;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x0085;
    L_0x0046:
        if (r4 == 0) goto L_0x0083;
    L_0x0048:
        r0 = r3;
    L_0x0049:
        if (r4 == 0) goto L_0x0081;
    L_0x004b:
        if (r0 != 0) goto L_0x0054;
    L_0x004d:
        r0 = com.whatsapp.SetStatus.v;
        r1 = com.whatsapp.App.v;
        r0.add(r2, r1);
    L_0x0054:
        r0 = r7.a;
        r0 = r0.n;
        r0.notifyDataSetInvalidated();
        r0 = r7.a;
        com.whatsapp.SetStatus.d(r0);
        if (r4 == 0) goto L_0x006c;
    L_0x0062:
        r0 = com.whatsapp.App.z();
        r1 = 2131232083; // 0x7f080553 float:1.8080265E38 double:1.0529685555E-314;
        com.whatsapp.App.a(r0, r1, r2);
    L_0x006c:
        r0 = r7.a;
        r1 = 2;
        r0.removeDialog(r1);
        r0 = r7.a;
        r0 = com.whatsapp.SetStatus.c(r0);
        r1 = new com.whatsapp.qk;
        r1.<init>(r7);
        r0.setOnClickListener(r1);
        return;
    L_0x0081:
        r1 = r0;
        goto L_0x0032;
    L_0x0083:
        r0 = r3;
        goto L_0x004b;
    L_0x0085:
        r0 = r1;
        goto L_0x0049;
    L_0x0087:
        r0 = r1;
        goto L_0x004b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kt.handleMessage(android.os.Message):void");
    }

    kt(SetStatus setStatus, Looper looper) {
        this.a = setStatus;
        super(looper);
    }
}
