package com.whatsapp;

import com.whatsapp.protocol.ay;
import com.whatsapp.protocol.b5;
import com.whatsapp.protocol.bb;
import com.whatsapp.util.Log;
import java.util.Timer;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

public class a3i implements b5, ay, Runnable {
    private static Timer g;
    private static final String[] z;
    public bb a;
    private ra b;
    public boolean c;
    public String d;
    public int e;
    public String f;
    private boolean h;
    public Vector i;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r6 = this;
        r5 = 3;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r2 = r6.e;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 1;
        r6.c = r1;
        r1 = r6.e;
        switch(r1) {
            case 14: goto L_0x003c;
            case 15: goto L_0x004d;
            case 16: goto L_0x006f;
            case 17: goto L_0x0080;
            case 30: goto L_0x0055;
            case 92: goto L_0x005d;
            case 93: goto L_0x0066;
            case 94: goto L_0x0077;
            default: goto L_0x0025;
        };
    L_0x0025:
        r0 = r6.a;
        if (r0 == 0) goto L_0x0032;
    L_0x0029:
        r0 = r6.a;
        r0 = r0.b;
        r1 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        com.whatsapp.wn.a(r0, r1);
    L_0x0032:
        r0 = r6.d;
        r1 = 0;
        com.whatsapp.App.c(r0, r1);
        r6.a();
        return;
    L_0x003c:
        r1 = com.whatsapp.App.aK;
        r2 = r6.d;
        r3 = r6.f;
        r4 = r6.i;
        r2 = com.whatsapp.qm.a(r2, r3, r4, r5);
        r1.a(r2);
        if (r0 == 0) goto L_0x0025;
    L_0x004d:
        r1 = 6;
        r2 = r6.d;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0055:
        r1 = 7;
        r2 = r6.d;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x005d:
        r1 = 9;
        r2 = r6.d;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0066:
        r1 = 10;
        r2 = r6.d;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x006f:
        r1 = 5;
        r2 = r6.d;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0077:
        r1 = 8;
        r2 = r6.d;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0025;
    L_0x0080:
        r0 = 11;
        r1 = r6.d;
        com.whatsapp.qm.a(r0, r1);
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3i.b():void");
    }

    static void b(a3i com_whatsapp_a3i) {
        com_whatsapp_a3i.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r9) {
        /*
        r8 = this;
        r7 = 0;
        r6 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r7];
        r1 = r1.append(r2);
        r1 = r1.append(r9);
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r8.d;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r8.e;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        r1 = r8.b;
        r1.cancel();
        r1 = r8.e;
        switch(r1) {
            case 14: goto L_0x0058;
            case 15: goto L_0x007e;
            case 16: goto L_0x009c;
            case 17: goto L_0x0074;
            case 30: goto L_0x0088;
            case 92: goto L_0x0092;
            case 93: goto L_0x0092;
            case 94: goto L_0x00a6;
            default: goto L_0x0044;
        };
    L_0x0044:
        r0 = r8.a;
        if (r0 == 0) goto L_0x004f;
    L_0x0048:
        r0 = r8.a;
        r0 = r0.b;
        com.whatsapp.wn.a(r0, r9);
    L_0x004f:
        r0 = r8.d;
        com.whatsapp.App.c(r0, r7);
        r8.a();
        return;
    L_0x0058:
        switch(r9) {
            case 406: goto L_0x00b5;
            case 500: goto L_0x00ac;
            default: goto L_0x005b;
        };
    L_0x005b:
        r1 = 12;
        r2 = r8.f;
        com.whatsapp.qm.a(r1, r2);
    L_0x0062:
        r1 = com.whatsapp.App.aK;
        r2 = r8.d;
        r3 = r8.f;
        r4 = r8.i;
        r5 = 3;
        r2 = com.whatsapp.qm.a(r2, r3, r4, r5);
        r1.a(r2);
        if (r0 == 0) goto L_0x0044;
    L_0x0074:
        switch(r9) {
            case 401: goto L_0x00bf;
            case 402: goto L_0x0077;
            case 403: goto L_0x00c6;
            case 404: goto L_0x00cd;
            case 405: goto L_0x0077;
            case 406: goto L_0x00d4;
            default: goto L_0x0077;
        };
    L_0x0077:
        r1 = 15;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x007e:
        switch(r9) {
            case 401: goto L_0x00de;
            case 402: goto L_0x0081;
            case 403: goto L_0x00e5;
            case 404: goto L_0x00ec;
            default: goto L_0x0081;
        };
    L_0x0081:
        r1 = 20;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x0088:
        switch(r9) {
            case 401: goto L_0x00f4;
            case 402: goto L_0x008b;
            case 403: goto L_0x00fb;
            case 404: goto L_0x0102;
            default: goto L_0x008b;
        };
    L_0x008b:
        r1 = 24;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x0092:
        switch(r9) {
            case 401: goto L_0x010a;
            case 402: goto L_0x0095;
            case 403: goto L_0x0111;
            case 404: goto L_0x0118;
            default: goto L_0x0095;
        };
    L_0x0095:
        r1 = 28;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x009c:
        switch(r9) {
            case 403: goto L_0x0121;
            case 404: goto L_0x0128;
            default: goto L_0x009f;
        };
    L_0x009f:
        r1 = 32;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x00a6:
        r0 = 35;
        com.whatsapp.qm.a(r0, r6);
        goto L_0x0044;
    L_0x00ac:
        r1 = 13;
        r2 = r8.f;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0062;
    L_0x00b5:
        r1 = 14;
        r2 = r8.f;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0062;
    L_0x00be:
        goto L_0x005b;
    L_0x00bf:
        r1 = 16;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x00c6:
        r1 = 17;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x00cd:
        r1 = 18;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x00d4:
        r1 = 19;
        r2 = r8.f;
        com.whatsapp.qm.a(r1, r2);
        if (r0 == 0) goto L_0x0044;
    L_0x00dd:
        goto L_0x0077;
    L_0x00de:
        r1 = 21;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x00e5:
        r1 = 22;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x00ec:
        r1 = 23;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x00f3:
        goto L_0x0081;
    L_0x00f4:
        r1 = 25;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x00fb:
        r1 = 26;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x0102:
        r1 = 27;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x0109:
        goto L_0x008b;
    L_0x010a:
        r1 = 29;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x0111:
        r1 = 30;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x0118:
        r1 = 31;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x011f:
        goto L_0x0095;
    L_0x0121:
        r1 = 33;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x0128:
        r1 = 34;
        com.whatsapp.qm.a(r1, r6);
        if (r0 == 0) goto L_0x0044;
    L_0x012f:
        goto L_0x009f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3i.a(int):void");
    }

    static boolean a(a3i com_whatsapp_a3i) {
        return com_whatsapp_a3i.h;
    }

    public void a() {
    }

    static {
        String[] strArr = new String[7];
        String str = "Z%\u0011\u0013gP0\fIeX&\u000b\u0003dIw\u0018\u0007~Q2\u001aF-\u001d";
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
                        i3 = 61;
                        break;
                    case at.g /*1*/:
                        i3 = 87;
                        break;
                    case at.i /*2*/:
                        i3 = 126;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001d+^";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Z%\u0011\u0013gP0\fIpO8\u000b\u0016HO2\u000f\u0013rN#Q\u0012~P2\u0011\u0013c\u0012#\u0007\u0016r\u0007";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Z%\u0011\u0013gP0\fIeX&\u000b\u0003dIw\r\u0013t^2\r\u00158";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Z%\u0011\u0013gP0\fIeX&\u000b\u0003dIw\r\u0013t^2\r\u00157\u0007w";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001d+^";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    g = new Timer();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001d+^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str) {
        this.b.cancel();
        this.h = true;
        Log.i(z[5] + str + z[6] + this.e);
        if (this.a != null) {
            wn.a(this.a.b, 200);
        }
        App.c(this.d, false);
        a();
    }

    public a3i(String str, String str2, Vector vector, int i) {
        boolean z = false;
        this.c = false;
        this.h = false;
        if (str != null) {
            z = true;
        }
        Log.b(z);
        this.d = str;
        this.f = str2;
        this.i = vector;
        this.e = i;
        this.b = new ra(this);
        g.schedule(this.b, 20000);
    }

    public a3i(String str, String str2, Vector vector, int i, bb bbVar) {
        this(str, str2, vector, i);
        this.a = bbVar;
    }

    public void run() {
        this.b.cancel();
        Log.i(z[4] + this.e);
        a();
    }
}
