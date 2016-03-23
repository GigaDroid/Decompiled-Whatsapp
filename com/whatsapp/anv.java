package com.whatsapp;

import android.app.Activity;
import com.whatsapp.protocol.b5;
import com.whatsapp.protocol.bb;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Timer;
import org.v;
import org.whispersystems.at;

public class anv implements b5, Runnable {
    private static Timer f;
    public static HashMap g;
    private static final String[] z;
    public Hashtable a;
    public String b;
    private Runnable c;
    public boolean d;
    public Activity e;
    public boolean h;
    public Long i;
    public boolean j;
    private Runnable k;
    private p5 l;
    public bb m;

    public void a(int i) {
        Log.i(z[2] + i + z[1] + this.b);
        a();
        App.p.M().post(this.c);
        if (this.m != null) {
            wn.a(this.m.b, i);
        }
    }

    private void a() {
        anv com_whatsapp_anv;
        if (this.b == null) {
            com_whatsapp_anv = (anv) g.remove(this.i);
        } else {
            com_whatsapp_anv = (anv) g.remove(this.b);
        }
        if (com_whatsapp_anv != null) {
            com_whatsapp_anv.l.cancel();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r2 = this;
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = 1;
        r2.h = r0;
        r0 = r2.d;
        if (r0 == 0) goto L_0x0018;
    L_0x000f:
        r0 = r2.b;
        com.whatsapp.aup.c(r0);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x001d;
    L_0x0018:
        r0 = r2.b;
        com.whatsapp.aup.b(r0);
    L_0x001d:
        r2.a();
        r0 = com.whatsapp.App.p;
        r0 = r0.M();
        r1 = r2.c;
        r0.post(r1);
        r0 = r2.m;
        if (r0 == 0) goto L_0x0038;
    L_0x002f:
        r0 = r2.m;
        r0 = r0.b;
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        com.whatsapp.wn.a(r0, r1);
    L_0x0038:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anv.run():void");
    }

    static {
        String[] strArr = new String[3];
        String str = "f\u0010WK{`\u0019f\\lp\u0000\\]}^\u0006LMjd\u0006J\u0001";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 57;
                        break;
                    case at.o /*3*/:
                        i3 = 46;
                        break;
                    default:
                        i3 = 9;
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
                    str = "f\u0010WK{`\u0019f\\lp\u0000\\]}^\u0013XGed\u0011\u0019\u0014)";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    g = new HashMap();
                    f = new Timer();
                    return;
                default:
                    strArr2[i] = str;
                    str = "!\t\u0019";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public anv(android.app.Activity r5, java.lang.String r6, java.util.Hashtable r7, boolean r8, com.whatsapp.protocol.bb r9) {
        /*
        r4 = this;
        r0 = 0;
        r4.<init>();
        r4.d = r0;
        r4.j = r0;
        r4.h = r0;
        r0 = new com.whatsapp.w5;
        r0.<init>(r4);
        r4.k = r0;
        r0 = new com.whatsapp.t1;
        r0.<init>(r4);
        r4.c = r0;
        r4.b = r6;
        r4.e = r5;
        r4.d = r8;
        r4.a = r7;
        r4.m = r9;
        if (r6 != 0) goto L_0x004d;
    L_0x0024:
        r0 = java.lang.System.currentTimeMillis();
        r0 = java.lang.Long.valueOf(r0);
        r4.i = r0;
        r0 = g;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "";
        r1 = r1.append(r2);
        r2 = r4.i;
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.put(r1, r4);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0052;
    L_0x004d:
        r0 = g;
        r0.put(r6, r4);
    L_0x0052:
        r0 = new com.whatsapp.p5;
        r0.<init>(r4);
        r4.l = r0;
        r0 = f;
        r1 = r4.l;
        r2 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0.schedule(r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anv.<init>(android.app.Activity, java.lang.String, java.util.Hashtable, boolean, com.whatsapp.protocol.bb):void");
    }

    static Runnable a(anv com_whatsapp_anv) {
        return com_whatsapp_anv.k;
    }
}
