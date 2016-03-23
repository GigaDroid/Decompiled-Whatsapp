package com.whatsapp.gdrive;

import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.at;

class cv implements Runnable {
    private static final String z;
    final boolean a;
    final File b;
    final CountDownLatch c;
    final AtomicReference d;
    final List e;
    final fs f;
    final GoogleDriveService g;
    final String h;
    final AtomicBoolean i;

    static {
        char[] toCharArray = "eCn\u0017(g\no\u001b,tN\u007f\u001bqeBhS8kKy\rsvH1\u001c;/Cs\t0nH}\u001a;f\u0007n\u001b=gNj\u001b:\"\u00009\ry\"An\u00113\"@x\f7tB<\u00187nB<\u0013?r\u0007k\u00167aO<\u001a1gT<\u00101v\u0007y\u00067qS2".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 2;
                    break;
                case at.g /*1*/:
                    i2 = 39;
                    break;
                case at.i /*2*/:
                    i2 = 28;
                    break;
                case at.o /*3*/:
                    i2 = 126;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    cv(GoogleDriveService googleDriveService, AtomicBoolean atomicBoolean, boolean z, File file, fs fsVar, String str, List list, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.g = googleDriveService;
        this.i = atomicBoolean;
        this.a = z;
        this.b = file;
        this.f = fsVar;
        this.h = str;
        this.e = list;
        this.d = atomicReference;
        this.c = countDownLatch;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = r6.g;	 Catch:{ ez -> 0x003c }
        r1 = com.whatsapp.gdrive.GoogleDriveService.c(r1);	 Catch:{ ez -> 0x003c }
        r1 = r1.a();	 Catch:{ ez -> 0x003c }
        if (r1 != 0) goto L_0x001a;
    L_0x000e:
        r0 = r6.i;	 Catch:{ ez -> 0x003c }
        r1 = 0;
        r0.set(r1);	 Catch:{ ez -> 0x003c }
        r0 = r6.c;
        r0.countDown();
    L_0x0019:
        return;
    L_0x001a:
        r1 = r6.a;	 Catch:{ ez -> 0x0038 }
        if (r1 != 0) goto L_0x0048;
    L_0x001e:
        r1 = r6.b;	 Catch:{ ez -> 0x0038 }
        r1 = r1.exists();	 Catch:{ ez -> 0x0038 }
        if (r1 == 0) goto L_0x0048;
    L_0x0026:
        r1 = r6.b;	 Catch:{ ez -> 0x003a }
        r2 = r1.length();	 Catch:{ ez -> 0x003a }
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0048;
    L_0x0032:
        r0 = r6.c;
        r0.countDown();
        goto L_0x0019;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ ez -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ ez -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        r1 = r6.d;	 Catch:{ all -> 0x0090 }
        r1.set(r0);	 Catch:{ all -> 0x0090 }
        r0 = r6.c;
        r0.countDown();
        goto L_0x0019;
    L_0x0048:
        r1 = r6.g;	 Catch:{ ez -> 0x003c }
        r1 = com.whatsapp.gdrive.GoogleDriveService.d(r1);	 Catch:{ ez -> 0x003c }
        r2 = r6.b;	 Catch:{ ez -> 0x003c }
        r2 = r2.getAbsolutePath();	 Catch:{ ez -> 0x003c }
        r3 = r6.f;	 Catch:{ ez -> 0x003c }
        r1 = r1.a(r2, r3);	 Catch:{ ez -> 0x003c }
        switch(r1) {
            case 1: goto L_0x0086;
            case 2: goto L_0x0073;
            case 3: goto L_0x0063;
            case 4: goto L_0x0086;
            default: goto L_0x005d;
        };
    L_0x005d:
        r0 = r6.c;
        r0.countDown();
        goto L_0x0019;
    L_0x0063:
        r1 = r6.g;	 Catch:{ ez -> 0x0097 }
        r1 = com.whatsapp.gdrive.GoogleDriveService.b(r1);	 Catch:{ ez -> 0x0097 }
        r2 = 0;
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ ez -> 0x0097 }
        r1.g = r2;	 Catch:{ ez -> 0x0097 }
        if (r0 == 0) goto L_0x005d;
    L_0x0073:
        r1 = z;	 Catch:{ ez -> 0x0099 }
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ ez -> 0x0099 }
        r3 = 0;
        r4 = r6.h;	 Catch:{ ez -> 0x0099 }
        r2[r3] = r4;	 Catch:{ ez -> 0x0099 }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ ez -> 0x0099 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ez -> 0x0099 }
        if (r0 == 0) goto L_0x005d;
    L_0x0086:
        r0 = r6.e;	 Catch:{ ez -> 0x008e }
        r1 = r6.h;	 Catch:{ ez -> 0x008e }
        r0.add(r1);	 Catch:{ ez -> 0x008e }
        goto L_0x005d;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ ez -> 0x003c }
    L_0x0090:
        r0 = move-exception;
        r1 = r6.c;
        r1.countDown();
        throw r0;
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ ez -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ ez -> 0x008e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.cv.run():void");
    }
}
