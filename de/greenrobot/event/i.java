package de.greenrobot.event;

import org.v;
import org.whispersystems.at;

final class i implements Runnable {
    private static final String[] z;
    private final h a;
    private final f b;
    private volatile boolean c;

    static {
        String[] strArr = new String[2];
        String str = "\u000eK8a\u0014GR-wF\\I)b@KX";
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
                        i3 = 46;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 52;
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
                    str = "kJ<|@";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r5 = 0;
    L_0x0001:
        r0 = r6.b;	 Catch:{ InterruptedException -> 0x0022 }
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0.a(r1);	 Catch:{ InterruptedException -> 0x0022 }
        if (r0 != 0) goto L_0x001c;
    L_0x000b:
        monitor-enter(r6);	 Catch:{ InterruptedException -> 0x0022 }
        r0 = r6.b;	 Catch:{ all -> 0x004c }
        r0 = r0.a();	 Catch:{ all -> 0x004c }
        if (r0 != 0) goto L_0x001b;
    L_0x0014:
        r0 = 0;
        r6.c = r0;	 Catch:{ all -> 0x004c }
        monitor-exit(r6);	 Catch:{ all -> 0x004c }
        r6.c = r5;
    L_0x001a:
        return;
    L_0x001b:
        monitor-exit(r6);	 Catch:{ all -> 0x004c }
    L_0x001c:
        r1 = r6.a;	 Catch:{ InterruptedException -> 0x0022 }
        r1.a(r0);	 Catch:{ InterruptedException -> 0x0022 }
        goto L_0x0001;
    L_0x0022:
        r0 = move-exception;
        r1 = z;	 Catch:{ all -> 0x004f }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ all -> 0x004f }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004f }
        r2.<init>();	 Catch:{ all -> 0x004f }
        r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x004f }
        r3 = r3.getName();	 Catch:{ all -> 0x004f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x004f }
        r3 = z;	 Catch:{ all -> 0x004f }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ all -> 0x004f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x004f }
        r2 = r2.toString();	 Catch:{ all -> 0x004f }
        android.util.Log.w(r1, r2, r0);	 Catch:{ all -> 0x004f }
        r6.c = r5;
        goto L_0x001a;
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x004c }
        throw r0;	 Catch:{ InterruptedException -> 0x0022 }
    L_0x004f:
        r0 = move-exception;
        r6.c = r5;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.i.run():void");
    }

    public void a(k kVar, Object obj) {
        b a = b.a(kVar, obj);
        synchronized (this) {
            this.b.a(a);
            if (!this.c) {
                this.c = true;
                this.a.a().execute(this);
            }
        }
    }

    i(h hVar) {
        this.a = hVar;
        this.b = new f();
    }
}
