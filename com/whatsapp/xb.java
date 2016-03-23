package com.whatsapp;

import org.v;
import org.whispersystems.at;

class xb extends Thread {
    private static final String[] z;
    final tw a;

    static {
        String[] strArr = new String[3];
        String str = "@{\t\u0007\u0012Yl\f\u0000\u0000Nq\t\u000b\u0002X{\u0018\u000b\\Zw\u0001\u0002SZ\u007f\u0004\u001a";
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
                        i3 = 30;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 115;
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
                    str = "@{\t\u0007\u0012Yl\f\u0000\u0000Nq\t\u000b\u0002X{\u0018\u000b\\]l\u0002\r\u0016^mM";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "@{\t\u0007\u0012Yl\f\u0000\u0000Nq\t\u000b\u0002X{\u0018\u000b\\_k\u0003";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    xb(tw twVar) {
        this.a = twVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = z;	 Catch:{ InterruptedException -> 0x007c }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ InterruptedException -> 0x007c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x007c }
    L_0x000a:
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x007c }
        r0 = com.whatsapp.tw.a(r0);	 Catch:{ InterruptedException -> 0x007c }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x007c }
        if (r0 != 0) goto L_0x002f;
    L_0x0016:
        r0 = z;	 Catch:{ InterruptedException -> 0x007c }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ InterruptedException -> 0x007c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x007c }
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x007c }
        r2 = com.whatsapp.tw.a(r0);	 Catch:{ InterruptedException -> 0x007c }
        monitor-enter(r2);	 Catch:{ InterruptedException -> 0x007c }
        r0 = r6.a;	 Catch:{ all -> 0x0079 }
        r0 = com.whatsapp.tw.a(r0);	 Catch:{ all -> 0x0079 }
        r0.wait();	 Catch:{ all -> 0x0079 }
        monitor-exit(r2);	 Catch:{ all -> 0x0079 }
    L_0x002f:
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x007c }
        r0 = com.whatsapp.tw.a(r0);	 Catch:{ InterruptedException -> 0x007c }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x007c }
        if (r0 == 0) goto L_0x0072;
    L_0x003b:
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x007c }
        r2 = com.whatsapp.tw.a(r0);	 Catch:{ InterruptedException -> 0x007c }
        monitor-enter(r2);	 Catch:{ InterruptedException -> 0x007c }
        r0 = r6.a;	 Catch:{ all -> 0x00af }
        r0 = com.whatsapp.tw.a(r0);	 Catch:{ all -> 0x00af }
        r3 = 0;
        r0 = r0.remove(r3);	 Catch:{ all -> 0x00af }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x00af }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00af }
        r3.<init>();	 Catch:{ all -> 0x00af }
        r4 = z;	 Catch:{ all -> 0x00af }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ all -> 0x00af }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00af }
        r4 = r0.k;	 Catch:{ all -> 0x00af }
        r4 = r4.b;	 Catch:{ all -> 0x00af }
        r3 = r3.append(r4);	 Catch:{ all -> 0x00af }
        r3 = r3.toString();	 Catch:{ all -> 0x00af }
        com.whatsapp.util.Log.i(r3);	 Catch:{ all -> 0x00af }
        monitor-exit(r2);	 Catch:{ all -> 0x00af }
        r2 = r0.c;	 Catch:{ InterruptedException -> 0x00c1 }
        switch(r2) {
            case 2: goto L_0x00b9;
            case 3: goto L_0x00b2;
            default: goto L_0x0072;
        };
    L_0x0072:
        r0 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x007c }
        if (r0 == 0) goto L_0x000a;
    L_0x0078:
        return;
    L_0x0079:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0079 }
        throw r0;	 Catch:{ InterruptedException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        r0 = r6.a;
        r2 = com.whatsapp.tw.a(r0);
        monitor-enter(r2);
    L_0x0084:
        r0 = r6.a;	 Catch:{ all -> 0x00ac }
        r0 = com.whatsapp.tw.a(r0);	 Catch:{ all -> 0x00ac }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00ac }
        if (r0 != 0) goto L_0x00aa;
    L_0x0090:
        r0 = r6.a;	 Catch:{ all -> 0x00ac }
        r0 = com.whatsapp.tw.a(r0);	 Catch:{ all -> 0x00ac }
        r3 = 0;
        r0 = r0.remove(r3);	 Catch:{ all -> 0x00ac }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x00ac }
        r0 = r0.Q;	 Catch:{ all -> 0x00ac }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ all -> 0x00ac }
        r3 = 0;
        r0.transferring = r3;	 Catch:{ all -> 0x00ac }
        r4 = 0;
        r0.progress = r4;	 Catch:{ all -> 0x00ac }
        if (r1 == 0) goto L_0x0084;
    L_0x00aa:
        monitor-exit(r2);	 Catch:{ all -> 0x00ac }
        goto L_0x0078;
    L_0x00ac:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00ac }
        throw r0;
    L_0x00af:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00af }
        throw r0;	 Catch:{ InterruptedException -> 0x007c }
    L_0x00b2:
        r2 = r6.a;	 Catch:{ InterruptedException -> 0x00c1 }
        com.whatsapp.tw.a(r2, r0);	 Catch:{ InterruptedException -> 0x00c1 }
        if (r1 == 0) goto L_0x0072;
    L_0x00b9:
        r2 = r6.a;	 Catch:{ InterruptedException -> 0x00bf }
        com.whatsapp.tw.b(r2, r0);	 Catch:{ InterruptedException -> 0x00bf }
        goto L_0x0072;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x007c }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00bf }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xb.run():void");
    }
}
