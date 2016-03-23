package com.whatsapp;

import org.v;
import org.whispersystems.at;

final class aav extends Thread {
    private static final String[] z;
    final u1 a;

    static {
        String[] strArr = new String[5];
        String str = "z%a\u001f*v5q\u0019/x7k\u001a$v$*\u0012$`.i\u0019*s`";
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
                        i3 = 23;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 5;
                        break;
                    case at.o /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 75;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "7.`\u0013/-";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "z%a\u001f*v5q\u0019/x7k\u001a$v$*\u0018$d0d\u0015.74j\u0002*{z";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "Z%a\u001f*[/d\u0012.e";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "7&w\u0013.-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private aav(u1 u1Var) {
        this.a = u1Var;
        super(z[4]);
    }

    aav(u1 u1Var, aq6 com_whatsapp_aq6) {
        this(u1Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r14 = this;
        r4 = com.whatsapp.DialogToastActivity.f;
    L_0x0002:
        r0 = r14.a;	 Catch:{ InterruptedException -> 0x0133 }
        r0 = com.whatsapp.u1.a(r0);	 Catch:{ InterruptedException -> 0x0133 }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x0133 }
        if (r0 != 0) goto L_0x001f;
    L_0x000e:
        r0 = r14.a;	 Catch:{ InterruptedException -> 0x0133 }
        r1 = com.whatsapp.u1.a(r0);	 Catch:{ InterruptedException -> 0x0133 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0133 }
        r0 = r14.a;	 Catch:{ all -> 0x0130 }
        r0 = com.whatsapp.u1.a(r0);	 Catch:{ all -> 0x0130 }
        r0.wait();	 Catch:{ all -> 0x0130 }
        monitor-exit(r1);	 Catch:{ all -> 0x0130 }
    L_0x001f:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0133 }
        com.whatsapp.Voip.f();	 Catch:{ InterruptedException -> 0x0133 }
        r0 = r14.a;	 Catch:{ InterruptedException -> 0x0133 }
        r0 = com.whatsapp.u1.a(r0);	 Catch:{ InterruptedException -> 0x0133 }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x0133 }
        if (r0 == 0) goto L_0x0129;
    L_0x0033:
        r0 = r14.a;	 Catch:{ InterruptedException -> 0x0133 }
        r1 = com.whatsapp.u1.a(r0);	 Catch:{ InterruptedException -> 0x0133 }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x0133 }
        r0 = r14.a;	 Catch:{ all -> 0x0165 }
        r0 = com.whatsapp.u1.a(r0);	 Catch:{ all -> 0x0165 }
        r0 = r0.pop();	 Catch:{ all -> 0x0165 }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x0165 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0165 }
        r2.<init>();	 Catch:{ all -> 0x0165 }
        r3 = z;	 Catch:{ all -> 0x0165 }
        r5 = 0;
        r3 = r3[r5];	 Catch:{ all -> 0x0165 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0165 }
        r3 = r0.q;	 Catch:{ all -> 0x0165 }
        r3 = com.whatsapp.util.ag.g(r3);	 Catch:{ all -> 0x0165 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0165 }
        r2 = r2.toString();	 Catch:{ all -> 0x0165 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x0165 }
        monitor-exit(r1);	 Catch:{ all -> 0x0165 }
        r1 = r0.c;	 Catch:{ InterruptedException -> 0x0133 }
        if (r1 == 0) goto L_0x0129;
    L_0x006a:
        r6 = com.whatsapp.App.T();	 Catch:{ InterruptedException -> 0x0133 }
        r8 = com.whatsapp.App.ba();	 Catch:{ InterruptedException -> 0x0133 }
        r2 = 0;
        r1 = r0.c;	 Catch:{ InterruptedException -> 0x0168 }
        r5 = 3;
        if (r1 == r5) goto L_0x0083;
    L_0x0079:
        r1 = r0.c;	 Catch:{ InterruptedException -> 0x0168 }
        r5 = 2;
        if (r1 != r5) goto L_0x009b;
    L_0x007e:
        r1 = r0.r;	 Catch:{ InterruptedException -> 0x016a }
        r5 = 1;
        if (r1 == r5) goto L_0x009b;
    L_0x0083:
        r1 = com.whatsapp.a59.e;	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1 * 1024;
        r1 = r1 * 1024;
        r2 = (long) r1;	 Catch:{ InterruptedException -> 0x0133 }
        r10 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r12 = 10;
        r12 = r8 / r12;
        r10 = java.lang.Math.min(r10, r12);	 Catch:{ InterruptedException -> 0x0133 }
        r2 = java.lang.Math.max(r2, r10);	 Catch:{ InterruptedException -> 0x0133 }
        if (r4 == 0) goto L_0x00b6;
    L_0x009b:
        r1 = r0.c;	 Catch:{ InterruptedException -> 0x016c }
        r5 = 1;
        if (r1 != r5) goto L_0x00b6;
    L_0x00a0:
        r1 = com.whatsapp.a59.e;	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1 * 512;
        r1 = r1 * 1024;
        r2 = (long) r1;	 Catch:{ InterruptedException -> 0x0133 }
        r10 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r12 = 20;
        r12 = r8 / r12;
        r10 = java.lang.Math.min(r10, r12);	 Catch:{ InterruptedException -> 0x0133 }
        r2 = java.lang.Math.max(r2, r10);	 Catch:{ InterruptedException -> 0x0133 }
    L_0x00b6:
        r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x00ed;
    L_0x00ba:
        r1 = r0.Q;	 Catch:{ InterruptedException -> 0x0133 }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ InterruptedException -> 0x0133 }
        r5 = r1.downloader;	 Catch:{ InterruptedException -> 0x0133 }
        r10 = r5.isCancelled();	 Catch:{ InterruptedException -> 0x016e }
        if (r10 != 0) goto L_0x00eb;
    L_0x00c6:
        r10 = r5.c();	 Catch:{ InterruptedException -> 0x016e }
        if (r10 == 0) goto L_0x00eb;
    L_0x00cc:
        r10 = 0;
        r10 = new java.lang.Void[r10];	 Catch:{ InterruptedException -> 0x0133 }
        r10 = r5.a(r10);	 Catch:{ InterruptedException -> 0x0133 }
        r11 = r5.isCancelled();	 Catch:{ InterruptedException -> 0x0170 }
        if (r11 != 0) goto L_0x00eb;
    L_0x00d9:
        r11 = r1.downloader;	 Catch:{ InterruptedException -> 0x0170 }
        if (r5 != r11) goto L_0x00eb;
    L_0x00dd:
        r11 = com.whatsapp.App.p;	 Catch:{ InterruptedException -> 0x0172 }
        r11 = r11.M();	 Catch:{ InterruptedException -> 0x0172 }
        r12 = new com.whatsapp.awv;	 Catch:{ InterruptedException -> 0x0172 }
        r12.<init>(r14, r5, r1, r10);	 Catch:{ InterruptedException -> 0x0172 }
        r11.post(r12);	 Catch:{ InterruptedException -> 0x0172 }
    L_0x00eb:
        if (r4 == 0) goto L_0x0129;
    L_0x00ed:
        r1 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0133 }
        r1.<init>();	 Catch:{ InterruptedException -> 0x0133 }
        r5 = z;	 Catch:{ InterruptedException -> 0x0133 }
        r10 = 3;
        r5 = r5[r10];	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1.append(r5);	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1.append(r8);	 Catch:{ InterruptedException -> 0x0133 }
        r5 = z;	 Catch:{ InterruptedException -> 0x0133 }
        r8 = 1;
        r5 = r5[r8];	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1.append(r5);	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1.append(r6);	 Catch:{ InterruptedException -> 0x0133 }
        r5 = z;	 Catch:{ InterruptedException -> 0x0133 }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1.append(r5);	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1.append(r2);	 Catch:{ InterruptedException -> 0x0133 }
        r1 = r1.toString();	 Catch:{ InterruptedException -> 0x0133 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ InterruptedException -> 0x0133 }
        r0 = r0.Q;	 Catch:{ InterruptedException -> 0x0133 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ InterruptedException -> 0x0133 }
        r0 = r0.downloader;	 Catch:{ InterruptedException -> 0x0133 }
        r0.d();	 Catch:{ InterruptedException -> 0x0133 }
    L_0x0129:
        r0 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x0133 }
        if (r0 == 0) goto L_0x0002;
    L_0x012f:
        return;
    L_0x0130:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0130 }
        throw r0;	 Catch:{ InterruptedException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        r0 = r14.a;
        r1 = com.whatsapp.u1.a(r0);
        monitor-enter(r1);
    L_0x013b:
        r0 = r14.a;	 Catch:{ all -> 0x0162 }
        r0 = com.whatsapp.u1.a(r0);	 Catch:{ all -> 0x0162 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0162 }
        if (r0 != 0) goto L_0x0160;
    L_0x0147:
        r0 = r14.a;	 Catch:{ all -> 0x0162 }
        r0 = com.whatsapp.u1.a(r0);	 Catch:{ all -> 0x0162 }
        r0 = r0.pop();	 Catch:{ all -> 0x0162 }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x0162 }
        r0 = r0.Q;	 Catch:{ all -> 0x0162 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ all -> 0x0162 }
        r2 = 0;
        r0.transferring = r2;	 Catch:{ all -> 0x0162 }
        r2 = 0;
        r0.progress = r2;	 Catch:{ all -> 0x0162 }
        if (r4 == 0) goto L_0x013b;
    L_0x0160:
        monitor-exit(r1);	 Catch:{ all -> 0x0162 }
        goto L_0x012f;
    L_0x0162:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0162 }
        throw r0;
    L_0x0165:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0165 }
        throw r0;	 Catch:{ InterruptedException -> 0x0133 }
    L_0x0168:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x016a }
    L_0x016a:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0133 }
    L_0x016c:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0133 }
    L_0x016e:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0133 }
    L_0x0170:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0172 }
    L_0x0172:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0133 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aav.run():void");
    }
}
