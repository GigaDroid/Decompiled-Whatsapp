package com.whatsapp.gdrive;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class dp implements Runnable {
    private static final String[] z;
    final b8 a;

    static {
        String[] strArr = new String[9];
        String str = "Y\u0012\u001a|\r[\u0004\u0001a\"L";
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 110;
                        break;
                    case at.o /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 76;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "K\u0002\u001a`%V\u0000\u001d9+\\\u0015\u0007b)\u0017\u0002\u001cf#JJ\na>Q\t\t9!]\u0003\u0007uaJ\u0002\u001d`#J\u0002Au/[\b\u001bz8\u0015\n\u000fz-_\u0002\u001c49K\u0002\u001c4-\\\u0003\u000bpl";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Y\u0012\u001a|\r[\u0004\u0001a\"L";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0018\u000e\u0000g8]\u0006\n4#^G";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "[\b\u0003:+W\b\tx)";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "K\u0002\u001a`%V\u0000\u001d9+\\\u0015\u0007b)\u0017\u0002\u001cf#JJ\na>Q\t\t9!]\u0003\u0007uaJ\u0002\u001d`#J\u0002Au/[\b\u001bz8\u0015\n\u000fz-_\u0002\u001c9>]\u0013\u001bf\"]\u0003Cc%L\u000fCz#\u0015\u0006\rw#M\t\u001a9\"Y\n\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Y\u0012\u001a|\r[\u0004\u0001a\"L";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "K\u0002\u001a`%V\u0000\u001d9+\\\u0015\u0007b)\u0017\u0002\u001cf#JJ\na>Q\t\t9!]\u0003\u0007uaJ\u0002\u001d`#J\u0002";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "[\b\u0003:+W\b\tx)";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    dp(b8 b8Var) {
        this.a = b8Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r9 = this;
        r1 = 1;
        r0 = 0;
        r2 = 0;
        r8 = com.whatsapp.gdrive.GoogleDriveService.c;
        r3 = r9.a;
        r3 = r3.a;
        r3 = android.accounts.AccountManager.get(r3);
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r4 = r3.getAccountsByType(r4);
        r5 = r4.length;
        r3 = r0;
    L_0x0018:
        if (r3 >= r5) goto L_0x002f;
    L_0x001a:
        r6 = r4[r3];
        r6 = r6.name;
        r7 = r9.a;
        r7 = r7.b;
        r6 = android.text.TextUtils.equals(r6, r7);
        if (r6 == 0) goto L_0x002b;
    L_0x0028:
        if (r8 == 0) goto L_0x00ea;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r3 = r3 + 1;
        if (r8 == 0) goto L_0x0018;
    L_0x002f:
        if (r0 == 0) goto L_0x003e;
    L_0x0031:
        r0 = r9.a;	 Catch:{ AuthenticatorException -> 0x00d1 }
        r0 = r0.a;	 Catch:{ AuthenticatorException -> 0x00d1 }
        r3 = r9.a;	 Catch:{ AuthenticatorException -> 0x00d1 }
        r3 = r3.b;	 Catch:{ AuthenticatorException -> 0x00d1 }
        com.whatsapp.gdrive.SettingsGoogleDrive.a(r0, r3);	 Catch:{ AuthenticatorException -> 0x00d1 }
        if (r8 == 0) goto L_0x00d0;
    L_0x003e:
        r0 = r9.a;
        r0 = r0.a;
        r0 = android.accounts.AccountManager.get(r0);
        r3 = z;
        r1 = r3[r1];
        r3 = r9.a;
        r5 = r3.a;
        r3 = r2;
        r4 = r2;
        r6 = r2;
        r7 = r2;
        r0 = r0.addAccount(r1, r2, r3, r4, r5, r6, r7);
        r0 = r0.getResult();	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = (android.os.Bundle) r0;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = z;	 Catch:{ AuthenticatorException -> 0x00d3, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x00d3, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = r0.containsKey(r1);	 Catch:{ AuthenticatorException -> 0x00d3, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        if (r1 != 0) goto L_0x0071;
    L_0x0067:
        r1 = z;	 Catch:{ AuthenticatorException -> 0x00d3, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x00d3, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ AuthenticatorException -> 0x00d3, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        if (r8 == 0) goto L_0x00d0;
    L_0x0071:
        r1 = r9.a;	 Catch:{ AuthenticatorException -> 0x00d5, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = r1.b;	 Catch:{ AuthenticatorException -> 0x00d5, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r2 = z;	 Catch:{ AuthenticatorException -> 0x00d5, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ AuthenticatorException -> 0x00d5, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r2 = r0.get(r2);	 Catch:{ AuthenticatorException -> 0x00d5, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = r1.equals(r2);	 Catch:{ AuthenticatorException -> 0x00d5, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        if (r1 != 0) goto L_0x00b9;
    L_0x0084:
        r1 = new java.lang.StringBuilder;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1.<init>();	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r2 = z;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = r1.append(r2);	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r2 = z;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = r0.get(r2);	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = r1.append(r0);	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = z;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = r0.append(r1);	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = r9.a;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = r1.b;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = r0.append(r1);	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = r0.toString();	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        if (r8 == 0) goto L_0x00d0;
    L_0x00b9:
        r0 = r9.a;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = r0.a;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = new com.whatsapp.gdrive.c;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1.<init>(r9);	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0.runOnUiThread(r1);	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = r9.a;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r0 = r0.a;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = r9.a;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        r1 = r1.b;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
        com.whatsapp.gdrive.SettingsGoogleDrive.a(r0, r1);	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
    L_0x00d0:
        return;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x00d5, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x00d7, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x00d9, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ AuthenticatorException -> 0x00db, OperationCanceledException -> 0x00e6, IOException -> 0x00e8 }
    L_0x00db:
        r0 = move-exception;
    L_0x00dc:
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00d0;
    L_0x00e6:
        r0 = move-exception;
        goto L_0x00dc;
    L_0x00e8:
        r0 = move-exception;
        goto L_0x00dc;
    L_0x00ea:
        r0 = r1;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.dp.run():void");
    }
}
