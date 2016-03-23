package com.whatsapp;

import com.whatsapp.protocol.c2;
import org.v;
import org.whispersystems.at;

class ou implements Runnable {
    private static final String[] z;
    final int a;
    final String b;
    final c2 c;
    final String d;
    final kd e;

    static {
        String[] strArr = new String[3];
        String str = "n\u0006|";
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
                        i3 = 99;
                        break;
                    case at.i /*2*/:
                        i3 = 30;
                        break;
                    case at.o /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 3;
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
                    str = "x\u0013n%{t\u0013n%q|\u0000h%t|\u0001A{v|\u0011g%sk\u0006hcfnC";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "6\u0005\u007fco|\u0007";
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
        r11 = this;
        r4 = 0;
        r10 = -1;
        r1 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r6 = new com.whatsapp.protocol.c2;
        r6.<init>();
        r0 = com.whatsapp.App.as;
        r2 = r11.c;
        r2 = r2.n;
        r7 = r0.f(r2);
        if (r7 == 0) goto L_0x0069;
    L_0x0016:
        r0 = r7.r();
        r2 = r7.o;	 Catch:{ IOException -> 0x007c }
        r2 = java.lang.Integer.toString(r2);	 Catch:{ IOException -> 0x007c }
        r3 = r11.c;	 Catch:{ IOException -> 0x007c }
        r3 = r3.i;	 Catch:{ IOException -> 0x007c }
        r2 = r2.equals(r3);	 Catch:{ IOException -> 0x007c }
        if (r2 == 0) goto L_0x0032;
    L_0x002a:
        r2 = r11.c;	 Catch:{ IOException -> 0x007c }
        r2 = r2.i;	 Catch:{ IOException -> 0x007c }
        r6.i = r2;	 Catch:{ IOException -> 0x007c }
        if (r5 == 0) goto L_0x0069;
    L_0x0032:
        r2 = r7.o;	 Catch:{ IOException -> 0x007e }
        if (r2 == r10) goto L_0x0067;
    L_0x0036:
        r2 = r0.exists();	 Catch:{ IOException -> 0x007e }
        if (r2 == 0) goto L_0x0067;
    L_0x003c:
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0080, all -> 0x00b2 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0080, all -> 0x00b2 }
        r8 = r0.length();	 Catch:{ IOException -> 0x00c0 }
        r0 = (int) r8;	 Catch:{ IOException -> 0x00c0 }
        r0 = new byte[r0];	 Catch:{ IOException -> 0x00c0 }
        r3 = r4;
    L_0x0049:
        r8 = r0.length;	 Catch:{ IOException -> 0x00c0 }
        if (r3 >= r8) goto L_0x0059;
    L_0x004c:
        r8 = r0.length;	 Catch:{ IOException -> 0x00c0 }
        r8 = r8 - r3;
        r8 = r2.read(r0, r3, r8);	 Catch:{ IOException -> 0x00c0 }
        if (r8 != r10) goto L_0x0056;
    L_0x0054:
        if (r5 == 0) goto L_0x0059;
    L_0x0056:
        r3 = r3 + r8;
        if (r5 == 0) goto L_0x0049;
    L_0x0059:
        if (r2 == 0) goto L_0x005e;
    L_0x005b:
        r2.close();	 Catch:{ IOException -> 0x00ba }
    L_0x005e:
        r1 = r7.o;
        r1 = java.lang.Integer.toString(r1);
        r6.i = r1;
        r1 = r0;
    L_0x0067:
        r6.t = r1;
    L_0x0069:
        r0 = r11.b;
        r1 = r11.a;
        com.whatsapp.App.a(r0, r6, r1);
        r0 = r11.b;
        r1 = r11.d;
        r2 = z;
        r2 = r2[r4];
        com.whatsapp.App.c(r0, r1, r2);
        return;
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = move-exception;
        r2 = r1;
    L_0x0082:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00be }
        r3.<init>();	 Catch:{ all -> 0x00be }
        r5 = z;	 Catch:{ all -> 0x00be }
        r8 = 2;
        r5 = r5[r8];	 Catch:{ all -> 0x00be }
        r3 = r3.append(r5);	 Catch:{ all -> 0x00be }
        r5 = r11.c;	 Catch:{ all -> 0x00be }
        r5 = r5.n;	 Catch:{ all -> 0x00be }
        r3 = r3.append(r5);	 Catch:{ all -> 0x00be }
        r5 = z;	 Catch:{ all -> 0x00be }
        r8 = 1;
        r5 = r5[r8];	 Catch:{ all -> 0x00be }
        r3 = r3.append(r5);	 Catch:{ all -> 0x00be }
        r3 = r3.toString();	 Catch:{ all -> 0x00be }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ all -> 0x00be }
        if (r2 == 0) goto L_0x00c2;
    L_0x00aa:
        r2.close();	 Catch:{ IOException -> 0x00af }
        r0 = r1;
        goto L_0x005e;
    L_0x00af:
        r0 = move-exception;
        r0 = r1;
        goto L_0x005e;
    L_0x00b2:
        r0 = move-exception;
        r2 = r1;
    L_0x00b4:
        if (r2 == 0) goto L_0x00b9;
    L_0x00b6:
        r2.close();	 Catch:{ IOException -> 0x00bc }
    L_0x00b9:
        throw r0;
    L_0x00ba:
        r1 = move-exception;
        goto L_0x005e;
    L_0x00bc:
        r1 = move-exception;
        goto L_0x00b9;
    L_0x00be:
        r0 = move-exception;
        goto L_0x00b4;
    L_0x00c0:
        r0 = move-exception;
        goto L_0x0082;
    L_0x00c2:
        r0 = r1;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ou.run():void");
    }

    ou(kd kdVar, c2 c2Var, String str, int i, String str2) {
        this.e = kdVar;
        this.c = c2Var;
        this.b = str;
        this.a = i;
        this.d = str2;
    }
}
