package com.whatsapp.gdrive;

import android.accounts.AccountManagerFuture;
import org.v;
import org.whispersystems.at;

class ft implements Runnable {
    private static final String[] z;
    final AccountManagerFuture a;
    final GoogleDriveActivity b;

    static {
        String[] strArr = new String[4];
        String str = "&qKVS$gPK|3";
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
                        i3 = 71;
                        break;
                    case at.g /*1*/:
                        i3 = 4;
                        break;
                    case at.i /*2*/:
                        i3 = 63;
                        break;
                    case at.o /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 18;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = " `MWd\")^]f.rVJkhaML}5)[K`.jX\u0013s#`\u0012_q$kJPfhe\\]}2jK\u0013\u007f&j^Yw5)M[f2vQ[vjsVJzjjP\u0013s$gPK|3)Q_\u007f\"";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = " `MWd\")^]f.rVJkhaML}5)[K`.jX\u0013s#`\u0012_q$kJPf";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "&qKVS$gPK|3";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ft(GoogleDriveActivity googleDriveActivity, AccountManagerFuture accountManagerFuture) {
        this.b = googleDriveActivity;
        this.a = accountManagerFuture;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4 = this;
        r0 = r4.a;	 Catch:{ AuthenticatorException -> 0x0037, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r0 = r0.getResult();	 Catch:{ AuthenticatorException -> 0x0037, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r0 = (android.os.Bundle) r0;	 Catch:{ AuthenticatorException -> 0x0037, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r1 = z;	 Catch:{ AuthenticatorException -> 0x0033, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x0033, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r1 = r0.containsKey(r1);	 Catch:{ AuthenticatorException -> 0x0033, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        if (r1 != 0) goto L_0x001f;
    L_0x0013:
        r1 = z;	 Catch:{ AuthenticatorException -> 0x0033, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x0033, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ AuthenticatorException -> 0x0033, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r1 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ AuthenticatorException -> 0x0033, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        if (r1 == 0) goto L_0x0032;
    L_0x001f:
        r1 = r4.b;	 Catch:{ AuthenticatorException -> 0x0035, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r2 = z;	 Catch:{ AuthenticatorException -> 0x0035, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ AuthenticatorException -> 0x0035, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r0 = r0.get(r2);	 Catch:{ AuthenticatorException -> 0x0035, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ AuthenticatorException -> 0x0035, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
        r2 = 4;
        com.whatsapp.gdrive.GoogleDriveActivity.a(r1, r0, r2);	 Catch:{ AuthenticatorException -> 0x0035, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
    L_0x0032:
        return;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x0035, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x0037, OperationCanceledException -> 0x0046, IOException -> 0x0048 }
    L_0x0037:
        r0 = move-exception;
    L_0x0038:
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r4.b;
        com.whatsapp.gdrive.GoogleDriveActivity.u(r0);
        goto L_0x0032;
    L_0x0046:
        r0 = move-exception;
        goto L_0x0038;
    L_0x0048:
        r0 = move-exception;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.ft.run():void");
    }
}
