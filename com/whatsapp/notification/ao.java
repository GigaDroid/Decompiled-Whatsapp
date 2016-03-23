package com.whatsapp.notification;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.protocol.co;
import com.whatsapp.wn;
import java.util.HashMap;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public final class ao {
    private static ao c;
    private static final String z;
    long a;
    private c b;
    private final Map d;
    private Handler e;

    static Map a(ao aoVar) {
        return aoVar.d;
    }

    public void a(String str, co coVar) {
        b().post(new j(this, str, coVar));
    }

    public void b(String str) {
        b().post(new a5(this, str));
        wn.D();
    }

    public void a(String str) {
        b(str, null);
    }

    private Handler b() {
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread(z, 10);
            handlerThread.start();
            this.e = new Handler(handlerThread.getLooper());
        }
        return this.e;
    }

    public static ao c() {
        return c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List c(java.lang.String r4) {
        /*
        r3 = this;
        r0 = com.whatsapp.App.z();
        r0 = com.whatsapp.a3b.a(r0);
        r0 = r0.b(r4);
        r0 = r0.a();
        if (r0 == 0) goto L_0x001a;
    L_0x0012:
        r0 = com.whatsapp.App.aK;
        r0 = r0.b(r4);
        if (r0 == 0) goto L_0x0020;
    L_0x001a:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x001f:
        return r0;
    L_0x0020:
        r0 = r3.d;
        r0 = r0.get(r4);
        r0 = (java.util.List) r0;
        if (r0 != 0) goto L_0x001f;
    L_0x002a:
        r0 = com.whatsapp.App.as;
        r0 = r0.b(r4);
        r1 = r0.d;
        if (r1 <= 0) goto L_0x0045;
    L_0x0034:
        r1 = com.whatsapp.App.aK;
        r0 = r0.d;
        r2 = 7;
        r0 = java.lang.Math.min(r0, r2);
        r0 = r1.b(r4, r0);
        r1 = com.whatsapp.notification.PopupNotification.p;
        if (r1 == 0) goto L_0x004a;
    L_0x0045:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x004a:
        r1 = r3.d;
        r1.put(r4, r0);
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.ao.c(java.lang.String):java.util.List");
    }

    public void b(String str, co coVar) {
        b().post(new z(this, coVar, str));
    }

    public ao() {
        this.a = System.currentTimeMillis() - 200;
        this.d = new HashMap();
    }

    static {
        char[] toCharArray = "W,P0Bp E-Mv-W".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 25;
                    break;
                case at.g /*1*/:
                    i2 = 67;
                    break;
                case at.i /*2*/:
                    i2 = 36;
                    break;
                case at.o /*3*/:
                    i2 = 89;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        c = new ao();
    }

    public void a(boolean z, boolean z2, boolean z3, boolean z4) {
        c cVar = new c(this, z, z2, z3, z4);
        if (this.b != null && this.b.equals(cVar)) {
            b().removeCallbacks(this.b);
        }
        this.b = cVar;
        b().post(this.b);
    }

    public void a() {
        b().post(new az(this));
        wn.D();
    }
}
