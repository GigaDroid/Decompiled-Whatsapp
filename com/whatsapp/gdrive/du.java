package com.whatsapp.gdrive;

import android.accounts.AccountManagerFuture;
import org.v;
import org.whispersystems.at;

class du implements Runnable {
    private static final String[] z;
    final AccountManagerFuture a;
    final SettingsGoogleDrive b;

    static {
        String[] strArr = new String[6];
        String str = "%[YRj'MBOE0";
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 45;
                        break;
                    case at.o /*3*/:
                        i3 = 58;
                        break;
                    default:
                        i3 = 43;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "7KYNB*I^\u0017L \\DLNkK_HD6\u0003IOY-@J\u0017J J\u0000[H'AXT_kONYD1@Y\u0017F%@L]N6\u0003___1\\C_OiYDNCi@B\u0017J'MBOE0\u0003C[F!";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "7KYNB*I^\u0017L \\DLNk[^_YiMLTH!BH^\u0006%JI\u0017J'MBOE0\u0003BJN6OYSD*";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "%[YRj'MBOE0";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "7KYNB*I^\u0017L \\DLNk]EU\\iONYD1@YI\u00043ODNB*I\u0000\\D6\u0003L^OiONYD1@Y\u0017J'ZDLB0W\u0000NDi\\HN^6@";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "7KYNB*I^\u0017L \\DLNkK_HD6\u0003IOY-@J\u0017J J\u0000[H'AXT_";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    du(SettingsGoogleDrive settingsGoogleDrive, AccountManagerFuture accountManagerFuture) {
        this.b = settingsGoogleDrive;
        this.a = accountManagerFuture;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4 = this;
        r0 = z;	 Catch:{ OperationCanceledException -> 0x003e, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ OperationCanceledException -> 0x003e, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OperationCanceledException -> 0x003e, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r0 = r4.a;	 Catch:{ OperationCanceledException -> 0x003e, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r0 = r0.getResult();	 Catch:{ OperationCanceledException -> 0x003e, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r0 = (android.os.Bundle) r0;	 Catch:{ OperationCanceledException -> 0x003e, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r1 = z;	 Catch:{ OperationCanceledException -> 0x003a, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ OperationCanceledException -> 0x003a, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r1 = r0.containsKey(r1);	 Catch:{ OperationCanceledException -> 0x003a, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        if (r1 != 0) goto L_0x0027;
    L_0x001b:
        r1 = z;	 Catch:{ OperationCanceledException -> 0x003a, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ OperationCanceledException -> 0x003a, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ OperationCanceledException -> 0x003a, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r1 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ OperationCanceledException -> 0x003a, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        if (r1 == 0) goto L_0x0039;
    L_0x0027:
        r1 = r4.b;	 Catch:{ OperationCanceledException -> 0x003c, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r2 = z;	 Catch:{ OperationCanceledException -> 0x003c, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ OperationCanceledException -> 0x003c, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r0 = r0.get(r2);	 Catch:{ OperationCanceledException -> 0x003c, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ OperationCanceledException -> 0x003c, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
        com.whatsapp.gdrive.SettingsGoogleDrive.a(r1, r0);	 Catch:{ OperationCanceledException -> 0x003c, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ OperationCanceledException -> 0x003c, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ OperationCanceledException -> 0x003e, AuthenticatorException -> 0x0048, IOException -> 0x0052 }
    L_0x003e:
        r0 = move-exception;
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.a(r1, r0);
        goto L_0x0039;
    L_0x0048:
        r0 = move-exception;
    L_0x0049:
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0039;
    L_0x0052:
        r0 = move-exception;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.du.run():void");
    }
}
