package com.whatsapp;

import com.whatsapp.contact.o;
import org.v;
import org.whispersystems.at;

final class kz implements Runnable {
    private static final String[] z;
    final o a;

    static {
        String[] strArr = new String[7];
        String str = "hp}G\u001chjcH\nwql\u000b\u000eb0}A\u0015k~|A";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = 31;
                        break;
                    case at.i /*2*/:
                        i3 = 15;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "hp}G\u001chjcH\nwql\u000b\u000eb0}A\u0015k~|A";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "hp}G\u001chjcH\nwql\u000b\u000eb0}A\u0015k~|A";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "hp}G\u001chjcH\nwql\u000b\u000eb0nG\b{v}A";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "hp}G\u001chjcH\nwql\u000b\u001c|m`V";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~pxA\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "hjcH\nwql";
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
        r4 = this;
        r3 = 1;
        r0 = com.whatsapp.App.z();
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.os.PowerManager) r0;
        r1 = 0;
        if (r0 == 0) goto L_0x001c;
    L_0x0013:
        r1 = z;
        r1 = r1[r3];
        r0 = r0.newWakeLock(r3, r1);
        r1 = r0;
    L_0x001c:
        if (r1 == 0) goto L_0x0029;
    L_0x001e:
        r1.acquire();	 Catch:{ Exception -> 0x006a }
        r0 = z;	 Catch:{ Exception -> 0x006a }
        r2 = 4;
        r0 = r0[r2];	 Catch:{ Exception -> 0x006a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x006a }
    L_0x0029:
        r0 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x006c }
        r2 = r4.a;	 Catch:{ Exception -> 0x006c }
        r0 = com.whatsapp.contact.i.b(r0, r2);	 Catch:{ Exception -> 0x006c }
        r2 = r0.isSuccess();	 Catch:{ Exception -> 0x008b }
        if (r2 == 0) goto L_0x004a;
    L_0x0039:
        r2 = com.whatsapp.App.aA;	 Catch:{ Exception -> 0x008b }
        r3 = 1;
        r2.b(r3);	 Catch:{ Exception -> 0x008b }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x008b }
        com.whatsapp.App.c(r2);	 Catch:{ Exception -> 0x008b }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ Exception -> 0x008b }
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r0 = r0.isFailure();	 Catch:{ Exception -> 0x008d }
        if (r0 == 0) goto L_0x0056;
    L_0x0050:
        r0 = com.whatsapp.App.aA;	 Catch:{ Exception -> 0x008f }
        r2 = 1;
        r0.a(r2);	 Catch:{ Exception -> 0x008f }
    L_0x0056:
        if (r1 == 0) goto L_0x0069;
    L_0x0058:
        r0 = r1.isHeld();	 Catch:{ Exception -> 0x00a6 }
        if (r0 == 0) goto L_0x0069;
    L_0x005e:
        r1.release();	 Catch:{ Exception -> 0x00a8 }
        r0 = z;	 Catch:{ Exception -> 0x00a8 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00a8 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00a8 }
    L_0x0069:
        return;
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        r2 = z;	 Catch:{ all -> 0x0091 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ all -> 0x0091 }
        com.whatsapp.util.Log.c(r2, r0);	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x0069;
    L_0x0077:
        r0 = r1.isHeld();	 Catch:{ Exception -> 0x0089 }
        if (r0 == 0) goto L_0x0069;
    L_0x007d:
        r1.release();	 Catch:{ Exception -> 0x0089 }
        r0 = z;	 Catch:{ Exception -> 0x0089 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0089 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0089 }
        goto L_0x0069;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x006c }
    L_0x0091:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00a5;
    L_0x0094:
        r2 = r1.isHeld();	 Catch:{ Exception -> 0x00aa }
        if (r2 == 0) goto L_0x00a5;
    L_0x009a:
        r1.release();	 Catch:{ Exception -> 0x00aa }
        r1 = z;	 Catch:{ Exception -> 0x00aa }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ Exception -> 0x00aa }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x00aa }
    L_0x00a5:
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kz.run():void");
    }

    kz(o oVar) {
        this.a = oVar;
    }
}
