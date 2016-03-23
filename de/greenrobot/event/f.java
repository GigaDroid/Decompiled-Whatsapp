package de.greenrobot.event;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class f {
    private static final String[] z;
    private b a;
    private b b;

    static {
        String[] strArr = new String[2];
        String str = "e\u0002:B|]\u0015>U9C\u0013w\u0006>X\u0013{H3\r\u0013:O0";
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
                        i3 = 45;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 92;
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
                    str = "C\u00127J|N\u00065H3YG9C|H\t*S9X\u0002?";
                    obj = null;
            }
        }
    }

    synchronized b a() {
        b bVar;
        bVar = this.a;
        try {
            if (this.a != null) {
                this.a = this.a.b;
                if (this.a == null) {
                    this.b = null;
                }
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
        return bVar;
    }

    f() {
    }

    synchronized b a(int i) {
        try {
            if (this.a == null) {
                wait((long) i);
            }
        } catch (NullPointerException e) {
            throw e;
        }
        return a();
    }

    synchronized void a(de.greenrobot.event.b r4) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:de.greenrobot.event.f.a(de.greenrobot.event.b):void. bs: [B:2:0x0003, B:11:0x0013, B:22:0x0024]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r3 = this;
        monitor-enter(r3);
        if (r4 != 0) goto L_0x0013;
    L_0x0003:
        r0 = new java.lang.NullPointerException;	 Catch:{ NullPointerException -> 0x000e }
        r1 = z;	 Catch:{ NullPointerException -> 0x000e }
        r2 = 1;	 Catch:{ NullPointerException -> 0x000e }
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x000e }
        r0.<init>(r1);	 Catch:{ NullPointerException -> 0x000e }
        throw r0;	 Catch:{ NullPointerException -> 0x000e }
    L_0x000e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
    L_0x0013:
        r0 = r3.b;	 Catch:{ NullPointerException -> 0x0022 }
        if (r0 == 0) goto L_0x0024;	 Catch:{ NullPointerException -> 0x0022 }
    L_0x0017:
        r0 = r3.b;	 Catch:{ NullPointerException -> 0x0022 }
        r0.b = r4;	 Catch:{ NullPointerException -> 0x0022 }
        r3.b = r4;	 Catch:{ NullPointerException -> 0x0022 }
    L_0x001d:
        r3.notifyAll();	 Catch:{ all -> 0x0010 }
        monitor-exit(r3);
        return;
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0010 }
    L_0x0024:
        r0 = r3.a;	 Catch:{ NullPointerException -> 0x002d }
        if (r0 != 0) goto L_0x002f;	 Catch:{ NullPointerException -> 0x002d }
    L_0x0028:
        r3.b = r4;	 Catch:{ NullPointerException -> 0x002d }
        r3.a = r4;	 Catch:{ NullPointerException -> 0x002d }
        goto L_0x001d;
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0010 }
    L_0x002f:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0010 }
        r1 = z;	 Catch:{ all -> 0x0010 }
        r2 = 0;	 Catch:{ all -> 0x0010 }
        r1 = r1[r2];	 Catch:{ all -> 0x0010 }
        r0.<init>(r1);	 Catch:{ all -> 0x0010 }
        throw r0;	 Catch:{ all -> 0x0010 }
        */
        throw new UnsupportedOperationException("Method not decompiled: de.greenrobot.event.f.a(de.greenrobot.event.b):void");
    }
}
