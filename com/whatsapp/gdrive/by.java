package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class by {
    private static final Set a;
    private static final String[] z;

    private static void a(@NonNull Thread thread) {
        synchronized (a) {
            a.add(thread);
        }
    }

    private static void b(@NonNull Thread thread) {
        synchronized (a) {
            a.remove(thread);
        }
    }

    public static void a() {
        boolean z = GoogleDriveService.c;
        synchronized (a) {
            for (Thread interrupt : a) {
                interrupt.interrupt();
                if (z) {
                    break;
                }
            }
        }
        Log.i(z[0] + a.size());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object a(@android.support.annotation.Nullable com.whatsapp.gdrive.bs r7, @android.support.annotation.NonNull com.whatsapp.gdrive.g r8, @android.support.annotation.Nullable java.lang.String r9) {
        /*
        r2 = 0;
        r0 = 0;
        r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0035 }
        a(r1);	 Catch:{ all -> 0x0035 }
        r3 = r2;
    L_0x000a:
        if (r7 == 0) goto L_0x003e;
    L_0x000c:
        r1 = r7.a();	 Catch:{ e3 -> 0x0033 }
        if (r1 != 0) goto L_0x003e;
    L_0x0012:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0035 }
        r1.<init>();	 Catch:{ all -> 0x0035 }
        r2 = z;	 Catch:{ all -> 0x0035 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ all -> 0x0035 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0035 }
        r1 = r1.append(r7);	 Catch:{ all -> 0x0035 }
        r1 = r1.toString();	 Catch:{ all -> 0x0035 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x0035 }
        r1 = java.lang.Thread.currentThread();
        b(r1);
    L_0x0032:
        return r0;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        r1 = java.lang.Thread.currentThread();
        b(r1);
        throw r0;
    L_0x003e:
        r1 = r8.a();	 Catch:{ e3 -> 0x0077 }
        if (r1 == 0) goto L_0x00b9;
    L_0x0044:
        if (r3 <= 0) goto L_0x006c;
    L_0x0046:
        r4 = new java.lang.StringBuilder;	 Catch:{ e3 -> 0x0075 }
        r4.<init>();	 Catch:{ e3 -> 0x0075 }
        r5 = z;	 Catch:{ e3 -> 0x0075 }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ e3 -> 0x0075 }
        r4 = r4.append(r5);	 Catch:{ e3 -> 0x0075 }
        r4 = r4.append(r3);	 Catch:{ e3 -> 0x0075 }
        r5 = z;	 Catch:{ e3 -> 0x0075 }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ e3 -> 0x0075 }
        r4 = r4.append(r5);	 Catch:{ e3 -> 0x0075 }
        r4 = r4.append(r9);	 Catch:{ e3 -> 0x0075 }
        r4 = r4.toString();	 Catch:{ e3 -> 0x0075 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ e3 -> 0x0075 }
    L_0x006c:
        r0 = java.lang.Thread.currentThread();
        b(r0);
        r0 = r1;
        goto L_0x0032;
    L_0x0075:
        r1 = move-exception;
        throw r1;	 Catch:{ e3 -> 0x0077 }
    L_0x0077:
        r1 = move-exception;
        r2 = r2 + 1;
        r4 = z;	 Catch:{ all -> 0x0035 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ all -> 0x0035 }
        com.whatsapp.util.Log.b(r4, r1);	 Catch:{ all -> 0x0035 }
        r1 = r2;
    L_0x0083:
        r2 = new java.lang.StringBuilder;	 Catch:{ e3 -> 0x00bb }
        r2.<init>();	 Catch:{ e3 -> 0x00bb }
        r4 = z;	 Catch:{ e3 -> 0x00bb }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ e3 -> 0x00bb }
        r2 = r2.append(r4);	 Catch:{ e3 -> 0x00bb }
        r2 = r2.append(r3);	 Catch:{ e3 -> 0x00bb }
        r4 = z;	 Catch:{ e3 -> 0x00bb }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ e3 -> 0x00bb }
        r2 = r2.append(r4);	 Catch:{ e3 -> 0x00bb }
        r2 = r2.append(r9);	 Catch:{ e3 -> 0x00bb }
        r2 = r2.toString();	 Catch:{ e3 -> 0x00bb }
        com.whatsapp.util.Log.i(r2);	 Catch:{ e3 -> 0x00bb }
        r2 = r3 + 1;
        r3 = com.whatsapp.gdrive.ci.a(r2);	 Catch:{ e3 -> 0x00bb }
        if (r3 == 0) goto L_0x00cf;
    L_0x00b2:
        com.whatsapp.gdrive.ci.b(r2);	 Catch:{ InterruptedException -> 0x00bd }
        r3 = r2;
        r2 = r1;
        goto L_0x000a;
    L_0x00b9:
        r1 = r2;
        goto L_0x0083;
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0035 }
    L_0x00bd:
        r1 = move-exception;
        r2 = z;	 Catch:{ all -> 0x0035 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ all -> 0x0035 }
        com.whatsapp.util.Log.a(r2, r1);	 Catch:{ all -> 0x0035 }
        r1 = java.lang.Thread.currentThread();
        b(r1);
        goto L_0x0032;
    L_0x00cf:
        if (r1 <= 0) goto L_0x00fa;
    L_0x00d1:
        r0 = new com.whatsapp.gdrive.et;	 Catch:{ e3 -> 0x00f8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ e3 -> 0x00f8 }
        r3.<init>();	 Catch:{ e3 -> 0x00f8 }
        r4 = z;	 Catch:{ e3 -> 0x00f8 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ e3 -> 0x00f8 }
        r3 = r3.append(r4);	 Catch:{ e3 -> 0x00f8 }
        r1 = r3.append(r1);	 Catch:{ e3 -> 0x00f8 }
        r3 = "/";
        r1 = r1.append(r3);	 Catch:{ e3 -> 0x00f8 }
        r1 = r1.append(r2);	 Catch:{ e3 -> 0x00f8 }
        r1 = r1.toString();	 Catch:{ e3 -> 0x00f8 }
        r0.<init>(r1);	 Catch:{ e3 -> 0x00f8 }
        throw r0;	 Catch:{ e3 -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0035 }
    L_0x00fa:
        r1 = java.lang.Thread.currentThread();
        b(r1);
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.by.a(com.whatsapp.gdrive.bs, com.whatsapp.gdrive.g, java.lang.String):java.lang.Object");
    }

    static {
        String[] strArr = new String[9];
        String str = "\u0003\u0011N%_\u0001XN)]\u0016\f\u00118H\u0017\u001e\u0013%G\u0010\u0010N>\\\u0014\u0001\u0011-J\u0010\u001cJ)\u0004\u0010\u0014O'ZK\u0006U6LK";
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
                        i3 = 100;
                        break;
                    case at.g /*1*/:
                        i3 = 117;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 76;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "#\u001aS+E\u0001Ux>@\u0012\u0010\u001c*H\r\u0019I>L\u0017ZH#]\u0005\u0019\u001c-]\u0010\u0010Q<]\u0017O\u001c";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0003\u0011N%_\u0001XN)]\u0016\f\u00118H\u0017\u001e\u0013/F\n\u0011U8@\u000b\u001b\u0011*H\r\u0019Y(\u0006";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0003\u0011N%_\u0001XN)]\u0016\f\u00118H\u0017\u001e\u0013)Q\u0001\u0016I8LK\u0014H8L\t\u0005Ha";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "K\u0006I/J\u0001\u0006Ov\t";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0003\u0011N%_\u0001XN)]\u0016\f\u00118H\u0017\u001e\u0013)Q\u0001\u0016I8L";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0003\u0011N%_\u0001XN)]\u0016\f\u00118H\u0017\u001e\u0013%G\u0010\u0010N>\\\u0014\u0001Y(";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0003\u0011N%_\u0001XN)]\u0016\f\u00118H\u0017\u001e\u0013)Q\u0001\u0016I8LK\u0014H8L\t\u0005Ha";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new HashSet();
                    return;
                default:
                    strArr2[i] = str;
                    str = "K\u0013]%E\u0001\u0011\u0006l";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
