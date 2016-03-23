package com.whatsapp.gdrive;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.at;

class f2 implements Runnable {
    private static final String[] z;
    final CountDownLatch a;
    final ArrayList b;
    final String c;
    final GoogleDriveService d;
    final AtomicReference e;
    final fs f;

    static {
        String[] strArr = new String[4];
        String str = "ymQ5#{$P9'h`@9zllP(:ll\u000e:<rlP";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 35;
                        break;
                    case at.o /*3*/:
                        i3 = 92;
                        break;
                    default:
                        i3 = 85;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ymQ5#{$P9'h`@9zllP(:ll\u000e:<rlPs;keOq9qjB0xnhW4ullO=!w\u007fF|%\u007f}Kf";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "ymQ5#{$P9'h`@9zllP(:ll\u000e:<rlP|'{zj8u}hM2:j)A9up|O0y>zH5%n`M;{";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "ymQ5#{$P9'h`@9zllP(:ll\u000e:<rlP|1q~M0:\u007fme59{)J/up|O0y>zH5%n`M;{";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    f2(GoogleDriveService googleDriveService, fs fsVar, String str, AtomicReference atomicReference, ArrayList arrayList, CountDownLatch countDownLatch) {
        this.d = googleDriveService;
        this.f = fsVar;
        this.c = str;
        this.e = atomicReference;
        this.b = arrayList;
        this.a = countDownLatch;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8 = this;
        r1 = 0;
        r0 = r8.f;	 Catch:{ all -> 0x004f }
        if (r0 != 0) goto L_0x0013;
    L_0x0005:
        r0 = z;	 Catch:{ all -> 0x004f }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ all -> 0x004f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x004f }
        r0 = r8.a;
        r0.countDown();
    L_0x0012:
        return;
    L_0x0013:
        r0 = r8.c;	 Catch:{ all -> 0x004f }
        r2 = com.whatsapp.gdrive.fn.c(r0);	 Catch:{ all -> 0x004f }
        if (r2 != 0) goto L_0x0036;
    L_0x001b:
        r0 = new java.lang.StringBuilder;	 Catch:{ ei -> 0x004d }
        r0.<init>();	 Catch:{ ei -> 0x004d }
        r3 = z;	 Catch:{ ei -> 0x004d }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ ei -> 0x004d }
        r0 = r0.append(r3);	 Catch:{ ei -> 0x004d }
        r3 = r8.c;	 Catch:{ ei -> 0x004d }
        r0 = r0.append(r3);	 Catch:{ ei -> 0x004d }
        r0 = r0.toString();	 Catch:{ ei -> 0x004d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ei -> 0x004d }
    L_0x0036:
        if (r2 == 0) goto L_0x0058;
    L_0x0038:
        r0 = new java.io.File;	 Catch:{ ei -> 0x0056 }
        r0.<init>(r2);	 Catch:{ ei -> 0x0056 }
    L_0x003d:
        if (r0 != 0) goto L_0x005a;
    L_0x003f:
        r0 = z;	 Catch:{ all -> 0x004f }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ all -> 0x004f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x004f }
        r0 = r8.a;
        r0.countDown();
        goto L_0x0012;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        r1 = r8.a;
        r1.countDown();
        throw r0;
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
    L_0x0058:
        r0 = 0;
        goto L_0x003d;
    L_0x005a:
        r2 = r8.d;	 Catch:{ all -> 0x004f }
        r2 = com.whatsapp.gdrive.GoogleDriveService.c(r2);	 Catch:{ all -> 0x004f }
        r2 = r2.a();	 Catch:{ all -> 0x004f }
        if (r2 != 0) goto L_0x006c;
    L_0x0066:
        r0 = r8.a;
        r0.countDown();
        goto L_0x0012;
    L_0x006c:
        r2 = r8.e;	 Catch:{ all -> 0x004f }
        r2 = r2.get();	 Catch:{ all -> 0x004f }
        if (r2 == 0) goto L_0x007a;
    L_0x0074:
        r0 = r8.a;
        r0.countDown();
        goto L_0x0012;
    L_0x007a:
        r2 = r8.d;	 Catch:{ ei -> 0x00f0, ea -> 0x010e, ee -> 0x010c, eu -> 0x010a, et -> 0x0108, ez -> 0x0106 }
        r3 = r8.f;	 Catch:{ ei -> 0x00f0, ea -> 0x010e, ee -> 0x010c, eu -> 0x010a, et -> 0x0108, ez -> 0x0106 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.a(r2, r0, r3);	 Catch:{ ei -> 0x00f0, ea -> 0x010e, ee -> 0x010c, eu -> 0x010a, et -> 0x0108, ez -> 0x0106 }
    L_0x0082:
        if (r0 == 0) goto L_0x00a4;
    L_0x0084:
        r0 = r8.d;	 Catch:{ ei -> 0x0100 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.p(r0);	 Catch:{ ei -> 0x0100 }
        r1 = r8.f;	 Catch:{ ei -> 0x0100 }
        r2 = r1.b();	 Catch:{ ei -> 0x0100 }
        r0.addAndGet(r2);	 Catch:{ ei -> 0x0100 }
        r0 = r8.d;	 Catch:{ ei -> 0x0100 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.p(r0);	 Catch:{ ei -> 0x0100 }
        r0 = r0.get();	 Catch:{ ei -> 0x0100 }
        com.whatsapp.gdrive.GoogleDriveService.e(r0);	 Catch:{ ei -> 0x0100 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ ei -> 0x0100 }
        if (r0 == 0) goto L_0x00ba;
    L_0x00a4:
        r0 = r8.d;	 Catch:{ ei -> 0x0102 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.l(r0);	 Catch:{ ei -> 0x0102 }
        r1 = r8.f;	 Catch:{ ei -> 0x0102 }
        r2 = r1.b();	 Catch:{ ei -> 0x0102 }
        r0.addAndGet(r2);	 Catch:{ ei -> 0x0102 }
        r0 = r8.b;	 Catch:{ ei -> 0x0102 }
        r1 = r8.f;	 Catch:{ ei -> 0x0102 }
        r0.add(r1);	 Catch:{ ei -> 0x0102 }
    L_0x00ba:
        r0 = r8.a;
        r0.countDown();
        r0 = r8.d;	 Catch:{ ei -> 0x0104 }
        r0 = com.whatsapp.gdrive.GoogleDriveService.c(r0);	 Catch:{ ei -> 0x0104 }
        r0 = r0.a();	 Catch:{ ei -> 0x0104 }
        if (r0 == 0) goto L_0x0012;
    L_0x00cb:
        r0 = r8.d;
        r1 = com.whatsapp.gdrive.GoogleDriveService.f(r0);
        r0 = r8.d;
        r0 = com.whatsapp.gdrive.GoogleDriveService.p(r0);
        r2 = r0.get();
        r0 = r8.d;
        r0 = com.whatsapp.gdrive.GoogleDriveService.l(r0);
        r4 = r0.get();
        r0 = r8.d;
        r6 = com.whatsapp.gdrive.GoogleDriveService.e(r0);
        r1.a(r2, r4, r6);
        goto L_0x0012;
    L_0x00f0:
        r0 = move-exception;
    L_0x00f1:
        r2 = z;	 Catch:{ all -> 0x004f }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ all -> 0x004f }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x004f }
        r2 = r8.e;	 Catch:{ all -> 0x004f }
        r2.set(r0);	 Catch:{ all -> 0x004f }
        r0 = r1;
        goto L_0x0082;
    L_0x0100:
        r0 = move-exception;
        throw r0;	 Catch:{ ei -> 0x0102 }
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = move-exception;
        goto L_0x00f1;
    L_0x0108:
        r0 = move-exception;
        goto L_0x00f1;
    L_0x010a:
        r0 = move-exception;
        goto L_0x00f1;
    L_0x010c:
        r0 = move-exception;
        goto L_0x00f1;
    L_0x010e:
        r0 = move-exception;
        goto L_0x00f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.f2.run():void");
    }
}
