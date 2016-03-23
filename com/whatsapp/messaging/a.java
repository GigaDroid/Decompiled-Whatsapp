package com.whatsapp.messaging;

import com.whatsapp.protocol.by;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class a extends Thread {
    private static final String[] z;
    private final by a;
    private final j b;

    static {
        String[] strArr = new String[12];
        String str = "\u000eo#wn\u0004g2c$\u0004-6u3\u0019p";
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
                        i3 = 118;
                        break;
                    case at.g /*1*/:
                        i3 = 2;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 65;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000eo#wn\u0004g2c$\u0004-?h&\u0019w'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u000eo#wn\u0004g2c$\u0004-0h3\u0004w#sl\u0005v!b \u001b/6u3\u0019p";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u000eo#wn\u0004g2c$\u0004-6u3\u0019p";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u000eo#wn\u0004g2c$\u0004-?h&\u0019w'";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000eo#wn\u0004g2c$\u0004-0h3\u0004w#sl\u0005v!b \u001b/6u3\u0019p|t5\u0017l)fa";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "\u000eo#wn\u0004g2c$\u0004-6u3\u0019p";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "\u000eo#wn\u0004g2c$\u0004-6u3\u0019p";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000eo#wn\u0004g2c$\u0004-?h&\u0019w'";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000eo#wn\u0004g2c$\u0004-:hl\u0013p!h3";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "$g2c$\u0004V;u$\u0017f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000eo#wn\u0004g2c$\u0004-?h&\u0019w'";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.messaging.a.run():void. bs: [B:11:0x001c, B:23:0x0048]
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
        r6 = this;
        r5 = 3;
        r1 = com.whatsapp.messaging.co.a;
    L_0x0003:
        r0 = r6.a;	 Catch:{ IOException -> 0x0019, cz -> 0x0047 }
        r0 = r0.d();	 Catch:{ IOException -> 0x0019, cz -> 0x0047 }
        if (r0 != 0) goto L_0x0003;
    L_0x000b:
        r0 = z;	 Catch:{ IOException -> 0x0045 }
        r1 = 1;	 Catch:{ IOException -> 0x0045 }
        r0 = r0[r1];	 Catch:{ IOException -> 0x0045 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0045 }
        r0 = r6.b;	 Catch:{ IOException -> 0x0045 }
        r0.a();	 Catch:{ IOException -> 0x0045 }
    L_0x0018:
        return;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x001b, cz -> 0x0047 }
    L_0x001b:
        r0 = move-exception;
        r2 = z;	 Catch:{ all -> 0x0079 }
        r3 = 10;	 Catch:{ all -> 0x0079 }
        r2 = r2[r3];	 Catch:{ all -> 0x0079 }
        com.whatsapp.util.Log.a(r2, r0);	 Catch:{ all -> 0x0079 }
        r0 = z;	 Catch:{ IOException -> 0x0043 }
        r2 = 8;	 Catch:{ IOException -> 0x0043 }
        r0 = r0[r2];	 Catch:{ IOException -> 0x0043 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0043 }
        r0 = r6.b;	 Catch:{ IOException -> 0x0043 }
        r0.b();	 Catch:{ IOException -> 0x0043 }
        if (r1 == 0) goto L_0x0018;	 Catch:{ IOException -> 0x0043 }
    L_0x0035:
        r0 = z;	 Catch:{ IOException -> 0x0043 }
        r1 = 2;	 Catch:{ IOException -> 0x0043 }
        r0 = r0[r1];	 Catch:{ IOException -> 0x0043 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0043 }
        r0 = r6.b;	 Catch:{ IOException -> 0x0043 }
        r0.a();	 Catch:{ IOException -> 0x0043 }
        goto L_0x0018;
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0077 }
        r2.<init>();	 Catch:{ IOException -> 0x0077 }
        r3 = z;	 Catch:{ IOException -> 0x0077 }
        r4 = 6;	 Catch:{ IOException -> 0x0077 }
        r3 = r3[r4];	 Catch:{ IOException -> 0x0077 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0077 }
        r3 = r0.a();	 Catch:{ IOException -> 0x0077 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0077 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0077 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x0077 }
        r2 = z;	 Catch:{ IOException -> 0x0077 }
        r3 = 3;	 Catch:{ IOException -> 0x0077 }
        r2 = r2[r3];	 Catch:{ IOException -> 0x0077 }
        com.whatsapp.util.Log.a(r2, r0);	 Catch:{ IOException -> 0x0077 }
        r2 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x0077 }
        if (r2 < r5) goto L_0x0097;	 Catch:{ IOException -> 0x0077 }
    L_0x0071:
        r2 = new java.lang.RuntimeException;	 Catch:{ IOException -> 0x0077 }
        r2.<init>(r0);	 Catch:{ IOException -> 0x0077 }
        throw r2;	 Catch:{ IOException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        r2 = z;	 Catch:{ IOException -> 0x00b8 }
        r3 = 0;	 Catch:{ IOException -> 0x00b8 }
        r2 = r2[r3];	 Catch:{ IOException -> 0x00b8 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x00b8 }
        r2 = r6.b;	 Catch:{ IOException -> 0x00b8 }
        r2.b();	 Catch:{ IOException -> 0x00b8 }
        if (r1 == 0) goto L_0x0096;	 Catch:{ IOException -> 0x00b8 }
    L_0x0089:
        r1 = z;	 Catch:{ IOException -> 0x00b8 }
        r2 = 5;	 Catch:{ IOException -> 0x00b8 }
        r1 = r1[r2];	 Catch:{ IOException -> 0x00b8 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x00b8 }
        r1 = r6.b;	 Catch:{ IOException -> 0x00b8 }
        r1.a();	 Catch:{ IOException -> 0x00b8 }
    L_0x0096:
        throw r0;
    L_0x0097:
        r0 = z;	 Catch:{ IOException -> 0x00b6 }
        r2 = 7;	 Catch:{ IOException -> 0x00b6 }
        r0 = r0[r2];	 Catch:{ IOException -> 0x00b6 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x00b6 }
        r0 = r6.b;	 Catch:{ IOException -> 0x00b6 }
        r0.b();	 Catch:{ IOException -> 0x00b6 }
        if (r1 == 0) goto L_0x0018;	 Catch:{ IOException -> 0x00b6 }
    L_0x00a6:
        r0 = z;	 Catch:{ IOException -> 0x00b6 }
        r1 = 9;	 Catch:{ IOException -> 0x00b6 }
        r0 = r0[r1];	 Catch:{ IOException -> 0x00b6 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x00b6 }
        r0 = r6.b;	 Catch:{ IOException -> 0x00b6 }
        r0.a();	 Catch:{ IOException -> 0x00b6 }
        goto L_0x0018;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.a.run():void");
    }

    public a(j jVar, by byVar) {
        super(z[11]);
        this.b = jVar;
        this.a = byVar;
    }
}
