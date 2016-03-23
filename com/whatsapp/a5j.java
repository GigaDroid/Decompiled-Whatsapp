package com.whatsapp;

import java.lang.Thread.UncaughtExceptionHandler;
import org.v;
import org.whispersystems.at;

final class a5j implements UncaughtExceptionHandler {
    private static final String[] z;
    private final UncaughtExceptionHandler a;

    static {
        String[] strArr = new String[3];
        String str = "*iSHj\u001a'FE&\u001cuWKr\u001a'QXg\fo\u0012Yc\u0011s[Dc\u0013'TCj\u001a";
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
                        i3 = 127;
                        break;
                    case at.g /*1*/:
                        i3 = 7;
                        break;
                    case at.i /*2*/:
                        i3 = 50;
                        break;
                    case at.o /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 6;
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
                    str = "\u001a\u007fQOv\u000bn]D)\u001bh\\O+\bf[^o\u0011`";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "*IqkS8Of\nC'DwzR6H|";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a5j() {
        this.a = Thread.getDefaultUncaughtExceptionHandler();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r6, java.lang.Throwable r7) {
        /*
        r5 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = z;	 Catch:{ Exception -> 0x005b, all -> 0x0083 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ Exception -> 0x005b, all -> 0x0083 }
        com.whatsapp.util.Log.b(r0, r7);	 Catch:{ Exception -> 0x005b, all -> 0x0083 }
        r0 = com.whatsapp.App.t();	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
        r0.createNewFile();	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
        r1 = com.whatsapp.App.al();	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
        monitor-enter(r1);	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
        r0 = z;	 Catch:{ all -> 0x004e }
        r3 = 2;
        r0 = r0[r3];	 Catch:{ all -> 0x004e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x004e }
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        r0 = new com.whatsapp.memory.dump.p;	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
        r1 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
        r0.b(r7);	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
    L_0x002b:
        r0 = r7 instanceof com.whatsapp.protocol.b_;
        if (r0 == 0) goto L_0x0048;
    L_0x002f:
        r0 = r7;
        r0 = (com.whatsapp.protocol.b_) r0;
        r1 = r0.getMessage();	 Catch:{ Exception -> 0x0081 }
        r3 = r0.a();	 Catch:{ Exception -> 0x0081 }
        com.whatsapp.util.Log.b(r1, r3);	 Catch:{ Exception -> 0x0081 }
        r1 = r5.a;	 Catch:{ Exception -> 0x0081 }
        r0 = r0.a();	 Catch:{ Exception -> 0x0081 }
        r1.uncaughtException(r6, r0);	 Catch:{ Exception -> 0x0081 }
        if (r2 == 0) goto L_0x004d;
    L_0x0048:
        r0 = r5.a;	 Catch:{ Exception -> 0x0081 }
        r0.uncaughtException(r6, r7);	 Catch:{ Exception -> 0x0081 }
    L_0x004d:
        return;
    L_0x004e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004e }
        throw r0;	 Catch:{ Exception -> 0x0051, all -> 0x0083 }
    L_0x0051:
        r0 = move-exception;
        r1 = z;	 Catch:{ Exception -> 0x005b, all -> 0x0083 }
        r3 = 0;
        r1 = r1[r3];	 Catch:{ Exception -> 0x005b, all -> 0x0083 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ Exception -> 0x005b, all -> 0x0083 }
        goto L_0x002b;
    L_0x005b:
        r0 = move-exception;
        r0 = r7 instanceof com.whatsapp.protocol.b_;
        if (r0 == 0) goto L_0x0079;
    L_0x0060:
        r0 = r7;
        r0 = (com.whatsapp.protocol.b_) r0;
        r1 = r0.getMessage();	 Catch:{ Exception -> 0x007f }
        r3 = r0.a();	 Catch:{ Exception -> 0x007f }
        com.whatsapp.util.Log.b(r1, r3);	 Catch:{ Exception -> 0x007f }
        r1 = r5.a;	 Catch:{ Exception -> 0x007f }
        r0 = r0.a();	 Catch:{ Exception -> 0x007f }
        r1.uncaughtException(r6, r0);	 Catch:{ Exception -> 0x007f }
        if (r2 == 0) goto L_0x004d;
    L_0x0079:
        r0 = r5.a;	 Catch:{ Exception -> 0x007f }
        r0.uncaughtException(r6, r7);	 Catch:{ Exception -> 0x007f }
        goto L_0x004d;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        r1 = r0;
        r0 = r7 instanceof com.whatsapp.protocol.b_;
        if (r0 == 0) goto L_0x00a2;
    L_0x0089:
        r0 = r7;
        r0 = (com.whatsapp.protocol.b_) r0;
        r3 = r0.getMessage();	 Catch:{ Exception -> 0x00a8 }
        r4 = r0.a();	 Catch:{ Exception -> 0x00a8 }
        com.whatsapp.util.Log.b(r3, r4);	 Catch:{ Exception -> 0x00a8 }
        r3 = r5.a;	 Catch:{ Exception -> 0x00a8 }
        r0 = r0.a();	 Catch:{ Exception -> 0x00a8 }
        r3.uncaughtException(r6, r0);	 Catch:{ Exception -> 0x00a8 }
        if (r2 == 0) goto L_0x00a7;
    L_0x00a2:
        r0 = r5.a;	 Catch:{ Exception -> 0x00a8 }
        r0.uncaughtException(r6, r7);	 Catch:{ Exception -> 0x00a8 }
    L_0x00a7:
        throw r1;
    L_0x00a8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5j.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
