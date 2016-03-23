package com.whatsapp.gdrive;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class d implements Runnable {
    private static final String[] z;
    final fa a;

    static {
        String[] strArr = new String[9];
        String str = "\u001c\u0011\u001c\u001c\u0006Y\u0019\u0016O\u001dZX";
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
                        i3 = 60;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 114;
                        break;
                    case at.o /*3*/:
                        i3 = 111;
                        break;
                    default:
                        i3 = 114;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "]\r\u0006\u00073_\u001b\u001d\u001a\u001cH";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "]\r\u0006\u00073_\u001b\u001d\u001a\u001cH";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "_\u0017\u001fA\u0015S\u0017\u0015\u0003\u0017";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "_\u0017\u001fA\u0015S\u0017\u0015\u0003\u0017";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "]\r\u0006\u00073_\u001b\u001d\u001a\u001cH";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "[\u001c\u0000\u0006\u0004YU\u0013\f\u0006U\u000e\u001b\u001b\u000b\u0013\u001d\u0000\u001d\u001dNU\u0016\u001a\u0000U\u0016\u0015B\u001fO\u001f\u0001\u001b\u001dN\u001d_\u000b\u001dK\u0016\u001e\u0000\u0013XW\u0013\f\u0011S\r\u001c\u001b_Q\u0019\u001c\u000e\u0015Y\n_\u001d\u0017H\r\u0000\u0001\u0017XU\u0005\u0006\u0006TU\u001c\u0000_]\u001b\u0011\u0000\u0007R\f_\u0001\u0013Q\u001d";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "[\u001c\u0000\u0006\u0004YU\u0013\f\u0006U\u000e\u001b\u001b\u000b\u0013\u001d\u0000\u001d\u001dNU\u0016\u001a\u0000U\u0016\u0015B\u001fO\u001f\u0001\u001b\u001dN\u001d_\u000b\u001dK\u0016\u001e\u0000\u0013XW\u0013\f\u0011S\r\u001c\u001b_Q\u0019\u001c\u000e\u0015Y\nR\u001a\u0001Y\nR\u000e\u0016X\u001d\u0016O";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "[\u001c\u0000\u0006\u0004YU\u0013\f\u0006U\u000e\u001b\u001b\u000b\u0013\u001d\u0000\u001d\u001dNU\u0016\u001a\u0000U\u0016\u0015B\u001fO\u001f\u0001\u001b\u001dN\u001d_\u000b\u001dK\u0016\u001e\u0000\u0013X";
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
        r10 = this;
        r0 = 0;
        r8 = 1;
        r2 = 0;
        r9 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = r10.a;
        r1 = r1.b;
        r1 = android.accounts.AccountManager.get(r1);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r3 = r1.getAccountsByType(r3);
        r4 = r3.length;
        r1 = r0;
    L_0x0018:
        if (r1 >= r4) goto L_0x002f;
    L_0x001a:
        r5 = r3[r1];
        r5 = r5.name;
        r6 = r10.a;
        r6 = r6.a;
        r5 = android.text.TextUtils.equals(r5, r6);
        if (r5 == 0) goto L_0x002b;
    L_0x0028:
        if (r9 == 0) goto L_0x00ec;
    L_0x002a:
        r0 = r8;
    L_0x002b:
        r1 = r1 + 1;
        if (r9 == 0) goto L_0x0018;
    L_0x002f:
        if (r0 == 0) goto L_0x003f;
    L_0x0031:
        r0 = r10.a;	 Catch:{ AuthenticatorException -> 0x00d5 }
        r0 = r0.b;	 Catch:{ AuthenticatorException -> 0x00d5 }
        r1 = r10.a;	 Catch:{ AuthenticatorException -> 0x00d5 }
        r1 = r1.a;	 Catch:{ AuthenticatorException -> 0x00d5 }
        r3 = 1;
        com.whatsapp.gdrive.GoogleDriveActivity.a(r0, r1, r3);	 Catch:{ AuthenticatorException -> 0x00d5 }
        if (r9 == 0) goto L_0x00d4;
    L_0x003f:
        r0 = r10.a;
        r0 = r0.b;
        r0 = android.accounts.AccountManager.get(r0);
        r1 = z;
        r3 = 5;
        r1 = r1[r3];
        r3 = r10.a;
        r5 = r3.b;
        r3 = r2;
        r4 = r2;
        r6 = r2;
        r7 = r2;
        r0 = r0.addAccount(r1, r2, r3, r4, r5, r6, r7);
        r0 = r0.getResult();	 Catch:{ AuthenticatorException -> 0x00df, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = (android.os.Bundle) r0;	 Catch:{ AuthenticatorException -> 0x00df, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = z;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = r0.containsKey(r1);	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        if (r1 != 0) goto L_0x0073;
    L_0x0069:
        r1 = z;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        com.whatsapp.util.Log.e(r1);	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        if (r9 == 0) goto L_0x00d4;
    L_0x0073:
        r1 = z;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = r0.get(r1);	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = r10.a;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = r2.a;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = r1.equals(r2);	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        if (r1 != 0) goto L_0x00bc;
    L_0x0086:
        r1 = new java.lang.StringBuilder;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1.<init>();	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = z;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = r1.append(r2);	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = z;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = r0.get(r2);	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = r1.append(r0);	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = z;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = r0.append(r1);	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = r10.a;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = r1.a;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = r0.append(r1);	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = r0.toString();	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        com.whatsapp.util.Log.e(r0);	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        if (r9 == 0) goto L_0x00d4;
    L_0x00bc:
        r0 = r10.a;	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = r0.b;	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = new com.whatsapp.gdrive.bj;	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1.<init>(r10);	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0.runOnUiThread(r1);	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = r10.a;	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r0 = r0.b;	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = r10.a;	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r1 = r1.a;	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
        r2 = 1;
        com.whatsapp.gdrive.GoogleDriveActivity.a(r0, r1, r2);	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
    L_0x00d4:
        return;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x00dd, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x00df, OperationCanceledException -> 0x00e8, IOException -> 0x00ea }
    L_0x00df:
        r0 = move-exception;
    L_0x00e0:
        r1 = z;
        r1 = r1[r8];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00d4;
    L_0x00e8:
        r0 = move-exception;
        goto L_0x00e0;
    L_0x00ea:
        r0 = move-exception;
        goto L_0x00e0;
    L_0x00ec:
        r0 = r8;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.d.run():void");
    }

    d(fa faVar) {
        this.a = faVar;
    }
}
