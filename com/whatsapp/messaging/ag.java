package com.whatsapp.messaging;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.protocol.ct;
import org.v;
import org.whispersystems.at;

@SuppressLint({"HandlerLeak"})
final class ag extends Handler implements j {
    private static final String[] z;
    private boolean a;
    final ah b;

    static {
        String[] strArr = new String[2];
        String str = "m8qoAm0qz";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 50;
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
                    str = "m8qoAm0qz";
                    obj = null;
            }
        }
    }

    public void c() {
        this.a = true;
    }

    public void a(String str) {
        obtainMessage(4, str).sendToTarget();
    }

    public ag(ah ahVar) {
        this.b = ahVar;
        super(ahVar.getLooper());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r5) {
        /*
        r4 = this;
        r1 = com.whatsapp.messaging.co.a;
        r0 = r5.what;
        switch(r0) {
            case 0: goto L_0x0008;
            case 1: goto L_0x000f;
            case 2: goto L_0x001a;
            case 3: goto L_0x0034;
            case 4: goto L_0x0047;
            case 5: goto L_0x0056;
            default: goto L_0x0007;
        };
    L_0x0007:
        return;
    L_0x0008:
        r0 = r4.b;
        com.whatsapp.messaging.ah.b(r0, r5);
        if (r1 == 0) goto L_0x0007;
    L_0x000f:
        r0 = r4.a;
        if (r0 != 0) goto L_0x0007;
    L_0x0013:
        r0 = r4.b;
        com.whatsapp.messaging.ah.c(r0);
        if (r1 == 0) goto L_0x0007;
    L_0x001a:
        r0 = r4.a;
        if (r0 != 0) goto L_0x0007;
    L_0x001e:
        r0 = r4.b;
        r0 = com.whatsapp.messaging.ah.f(r0);
        if (r0 == 0) goto L_0x002d;
    L_0x0026:
        r0 = r4.b;
        com.whatsapp.messaging.ah.c(r0);
        if (r1 == 0) goto L_0x0007;
    L_0x002d:
        r0 = r4.b;
        com.whatsapp.messaging.ah.i(r0);
        if (r1 == 0) goto L_0x0007;
    L_0x0034:
        r0 = r5.getData();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r0.getLong(r2);
        r0 = r4.b;
        com.whatsapp.messaging.ah.l(r0);
        if (r1 == 0) goto L_0x0007;
    L_0x0047:
        r0 = r4.b;
        r2 = com.whatsapp.messaging.ah.k(r0);
        r0 = r5.obj;
        r0 = (java.lang.String) r0;
        r2.a(r0);
        if (r1 == 0) goto L_0x0007;
    L_0x0056:
        r0 = r4.b;
        r1 = com.whatsapp.messaging.ah.k(r0);
        r0 = r5.obj;
        r0 = (com.whatsapp.protocol.ct) r0;
        r1.a(r0);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ag.handleMessage(android.os.Message):void");
    }

    public void b() {
        sendEmptyMessage(2);
    }

    public void a(ct ctVar) {
        obtainMessage(5, ctVar).sendToTarget();
    }

    public void a() {
        sendEmptyMessage(1);
    }

    public void a(long j) {
        Message obtainMessage = obtainMessage(3);
        obtainMessage.getData().putLong(z[0], j);
        obtainMessage.sendToTarget();
    }

    public void a(Message message) {
        message.what = 0;
        sendMessage(message);
    }
}
