package com.whatsapp.messaging;

import android.annotation.SuppressLint;
import android.os.Handler;
import com.whatsapp.VoiceService;
import com.whatsapp.protocol.c3;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

@SuppressLint({"HandlerLeak"})
final class q extends Handler {
    private static final String[] z;
    final ah a;

    static {
        String[] strArr = new String[5];
        String str = "z?t:&z$s;-91y *o5: *t5u!796s&&}";
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
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\"p|\u0019&j#{3&7#n57l#'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "z1v8cv6|119$s9&v%nt%p\"\u007f0";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "a=j$lz?t:&z$s;-66s&&4<u3,l$7 *t5u!7";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "t5i'\"~5:&&z5s$79$s9&v%nt%p\"\u007f0x9=\u007f'0x7\u007f\u001f&`m";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void f() {
        removeMessages(0);
    }

    public void i() {
        sendEmptyMessageDelayed(2, 32000);
    }

    public void b() {
        sendEmptyMessageDelayed(3, (long) VoiceService.e());
    }

    public void g() {
        sendEmptyMessageDelayed(0, 10000);
    }

    public void d() {
        removeMessages(3);
    }

    public boolean h() {
        return hasMessages(0);
    }

    public void a(c3 c3Var) {
        sendMessageDelayed(obtainMessage(1, c3Var), 45000);
    }

    public void e() {
        Log.w(z[4]);
        sendEmptyMessage(0);
    }

    public void a() {
        removeMessages(2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r7) {
        /*
        r6 = this;
        r5 = 1;
        r1 = com.whatsapp.messaging.co.a;
        r0 = r7.what;
        switch(r0) {
            case 0: goto L_0x0009;
            case 1: goto L_0x0010;
            case 2: goto L_0x0056;
            case 3: goto L_0x0068;
            default: goto L_0x0008;
        };
    L_0x0008:
        return;
    L_0x0009:
        r0 = r6.a;
        com.whatsapp.messaging.ah.j(r0);
        if (r1 == 0) goto L_0x0008;
    L_0x0010:
        r0 = r7.obj;
        r0 = (com.whatsapp.protocol.c3) r0;
        r2 = com.whatsapp.App.aK;
        r2 = r2.a(r0);
        if (r2 == 0) goto L_0x0008;
    L_0x001c:
        r3 = r2.d;
        r4 = 4;
        r3 = com.whatsapp.protocol.b7.a(r3, r4);
        if (r3 >= 0) goto L_0x0008;
    L_0x0025:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r2 = r2.d;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r6.removeMessages(r5);
        r0 = r6.a;
        com.whatsapp.messaging.ah.a(r0, r5);
        if (r1 == 0) goto L_0x0008;
    L_0x0056:
        r0 = z;
        r2 = 0;
        r0 = r0[r2];
        com.whatsapp.util.Log.w(r0);
        r6.a();
        r0 = r6.a;
        com.whatsapp.messaging.ah.a(r0, r5);
        if (r1 == 0) goto L_0x0008;
    L_0x0068:
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r6.d();
        r0 = r6.a;
        com.whatsapp.messaging.ah.a(r0, r5);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.q.handleMessage(android.os.Message):void");
    }

    public void c() {
        removeCallbacksAndMessages(null);
    }

    public q(ah ahVar) {
        this.a = ahVar;
        super(ahVar.getLooper());
    }
}
