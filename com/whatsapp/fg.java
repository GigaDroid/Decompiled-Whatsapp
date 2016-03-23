package com.whatsapp;

import android.os.AsyncTask;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class fg extends AsyncTask {
    private static final String[] z;
    final sx a;
    aki b;

    static {
        String[] strArr = new String[8];
        String str = "I\u0011s$rf\u001d6";
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
                        i3 = 7;
                        break;
                    case at.g /*1*/:
                        i3 = 126;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 2;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "j\u001b7>cr\u000e?8ccQ:9ob\u001a:6dh\u001272p(^";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "j\u001b7>cr\u000e?8ccQ!2sr\u001b #ww\u0012<6f(\u0018:;g*\u0010<#/a\u0011&9f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "j\u001b7>cr\u000e?8ccQ#%gw\u001f!2kj\u001f42-'";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "j\u001b7>cr\u000e?8ccQ#%gw\u001f!2kj\u001f42-'";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "j\u001b7>cr\u000e?8ccQ!2sr\u001b #ww\u0012<6f(\u001d<'{*\u00182>nb\u001a";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "j\u001b7>cr\u000e?8ccQ#%gw\u001f!2kj\u001f42-'";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "j\u001b7>cr\u000e?8ccQ#%gw\u001f!2kj\u001f42-'";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str) {
        if (str == null) {
            try {
                aki com_whatsapp_aki;
                sx sxVar = this.a;
                if (this.b != aki.SUCCESS) {
                    com_whatsapp_aki = this.b;
                } else {
                    com_whatsapp_aki = aki.FAILED_GENERIC;
                }
                sxVar.a(com_whatsapp_aki);
                return;
            } catch (SecurityException e) {
                throw e;
            }
        }
        sx.a(this.a, str);
    }

    fg(sx sxVar) {
        this.a = sxVar;
        this.b = aki.SUCCESS;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String a(java.lang.Void[] r11) {
        /*
        r10 = this;
        r2 = 0;
        r1 = 0;
        r9 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.a;	 Catch:{ IOException -> 0x00df }
        r0 = r0.p;	 Catch:{ IOException -> 0x00df }
        r0 = r0.c;	 Catch:{ IOException -> 0x00df }
        if (r0 != r9) goto L_0x0091;
    L_0x000d:
        r0 = r10.a;	 Catch:{ IOException -> 0x00df }
        r0 = com.whatsapp.sx.c(r0);	 Catch:{ IOException -> 0x00df }
        r0 = r0.file;	 Catch:{ IOException -> 0x00df }
        if (r0 != 0) goto L_0x0091;
    L_0x0017:
        r0 = r10.a;
        r0 = r0.p;
        r0 = r0.A;
        r0 = android.net.Uri.parse(r0);
        r4 = com.whatsapp.sx.c();	 Catch:{ IOException -> 0x00e4, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        monitor-enter(r4);	 Catch:{ IOException -> 0x00e4, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r5 = com.whatsapp.App.z();	 Catch:{ all -> 0x00e1 }
        r6 = r10.a;	 Catch:{ all -> 0x00e1 }
        r6 = com.whatsapp.sx.c(r6);	 Catch:{ all -> 0x00e1 }
        r0 = com.whatsapp.util.ag.a(r5, r0, r6);	 Catch:{ all -> 0x00e1 }
        r5 = r10.a;	 Catch:{ all -> 0x00e1 }
        r5 = r5.p;	 Catch:{ all -> 0x00e1 }
        r5.a(r0);	 Catch:{ all -> 0x00e1 }
        r0 = r10.a;	 Catch:{ all -> 0x00e1 }
        r0 = r0.p;	 Catch:{ all -> 0x00e1 }
        r5 = r10.a;	 Catch:{ all -> 0x00e1 }
        r5 = com.whatsapp.sx.c(r5);	 Catch:{ all -> 0x00e1 }
        r5 = r5.file;	 Catch:{ all -> 0x00e1 }
        r5 = r5.getName();	 Catch:{ all -> 0x00e1 }
        r0.A = r5;	 Catch:{ all -> 0x00e1 }
        r0 = r10.a;	 Catch:{ all -> 0x00e1 }
        r0 = r0.p;	 Catch:{ all -> 0x00e1 }
        r5 = r10.a;	 Catch:{ all -> 0x00e1 }
        r5 = com.whatsapp.sx.c(r5);	 Catch:{ all -> 0x00e1 }
        r5 = r5.file;	 Catch:{ all -> 0x00e1 }
        r6 = r5.length();	 Catch:{ all -> 0x00e1 }
        r0.z = r6;	 Catch:{ all -> 0x00e1 }
        r0 = r10.a;	 Catch:{ all -> 0x00e1 }
        r0 = com.whatsapp.sx.c(r0);	 Catch:{ all -> 0x00e1 }
        r5 = r10.a;	 Catch:{ all -> 0x00e1 }
        r5 = r5.p;	 Catch:{ all -> 0x00e1 }
        r6 = r5.z;	 Catch:{ all -> 0x00e1 }
        r0.fileSize = r6;	 Catch:{ all -> 0x00e1 }
        monitor-exit(r4);	 Catch:{ all -> 0x00e1 }
        r0 = r10.a;	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r0 = r0.p;	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        com.whatsapp.util.bd.b(r0);	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r0 = r10.a;	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r0 = com.whatsapp.sx.c(r0);	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r4 = 1;
        r0.autodownloadRetryEnabled = r4;	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r0 = r10.a;	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r0 = com.whatsapp.sx.b(r0);	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        if (r0 != 0) goto L_0x0091;
    L_0x0086:
        r0 = com.whatsapp.App.aK;	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r4 = r10.a;	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r4 = r4.p;	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
        r5 = 1;
        r6 = -1;
        r0.a(r4, r5, r6);	 Catch:{ IOException -> 0x0125, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
    L_0x0091:
        r0 = r10.b;	 Catch:{ IOException -> 0x0196 }
        r4 = com.whatsapp.aki.SUCCESS;	 Catch:{ IOException -> 0x0196 }
        if (r0 != r4) goto L_0x01f3;
    L_0x0097:
        r0 = r10.a;	 Catch:{ IOException -> 0x0196 }
        r0 = com.whatsapp.sx.c(r0);	 Catch:{ IOException -> 0x0196 }
        r0 = r0.file;	 Catch:{ IOException -> 0x0196 }
        if (r0 == 0) goto L_0x019a;
    L_0x00a1:
        r0 = r10.a;	 Catch:{ IOException -> 0x0198 }
        r0 = r0.h();	 Catch:{ IOException -> 0x0198 }
    L_0x00a7:
        r4 = r10.a;
        r4 = r4.l();
        r4 = r4.file;
        r2 = com.whatsapp.dg.d(r4);	 Catch:{ IOException -> 0x019d }
    L_0x00b3:
        if (r2 != 0) goto L_0x00de;
    L_0x00b5:
        if (r0 == 0) goto L_0x00bd;
    L_0x00b7:
        r1 = com.whatsapp.App.aK;	 Catch:{ IOException -> 0x01bd }
        r1 = r1.a(r0);	 Catch:{ IOException -> 0x01bd }
    L_0x00bd:
        if (r1 != 0) goto L_0x01da;
    L_0x00bf:
        r1 = com.whatsapp.App.z();
        r2 = r10.a;
        r2 = r2.p;
        r2 = r2.c;
        r5 = r10.a;
        r5 = r5.p;
        r5 = r5.r;
        r2 = com.whatsapp.util.ag.a(r1, r4, r2, r5, r9);
        com.whatsapp.util.ag.a(r4, r2);	 Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x01ce }
        r1 = r10.a;	 Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x01ce }
        r1 = com.whatsapp.sx.c(r1);	 Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x01ce }
        r1.file = r2;	 Catch:{ FileNotFoundException -> 0x01bf, IOException -> 0x01ce }
    L_0x00de:
        return r0;
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00e1 }
        throw r0;	 Catch:{ IOException -> 0x00e4, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
    L_0x00e4:
        r0 = move-exception;
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x014a }
        r4.<init>();	 Catch:{ IOException -> 0x014a }
        r5 = z;	 Catch:{ IOException -> 0x014a }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ IOException -> 0x014a }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x014a }
        r5 = r0.toString();	 Catch:{ IOException -> 0x014a }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x014a }
        r4 = r4.toString();	 Catch:{ IOException -> 0x014a }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IOException -> 0x014a }
        r4 = r0.getMessage();	 Catch:{ IOException -> 0x014a }
        if (r4 == 0) goto L_0x011d;
    L_0x0108:
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x014a }
        r4 = z;	 Catch:{ IOException -> 0x014a }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ IOException -> 0x014a }
        r0 = r0.contains(r4);	 Catch:{ IOException -> 0x014a }
        if (r0 == 0) goto L_0x011d;
    L_0x0117:
        r0 = com.whatsapp.aki.FAILED_INSUFFICIENT_SPACE;	 Catch:{ IOException -> 0x014c }
        r10.b = r0;	 Catch:{ IOException -> 0x014c }
        if (r3 == 0) goto L_0x0091;
    L_0x011d:
        r0 = com.whatsapp.aki.FAILED_IO;	 Catch:{ IOException -> 0x0123 }
        r10.b = r0;	 Catch:{ IOException -> 0x0123 }
        goto L_0x0091;
    L_0x0123:
        r0 = move-exception;
        throw r0;
    L_0x0125:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e4, c_ -> 0x0127, OutOfMemoryError -> 0x014e, SecurityException -> 0x0172 }
    L_0x0127:
        r0 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r5 = r5[r9];
        r4 = r4.append(r5);
        r0 = r0.toString();
        r0 = r4.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.aki.FAILED_BAD_MEDIA;
        r10.b = r0;
        goto L_0x0091;
    L_0x014a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x014c }
    L_0x014c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0123 }
    L_0x014e:
        r0 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 5;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r0.toString();
        r0 = r4.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.aki.FAILED_OOM;
        r10.b = r0;
        goto L_0x0091;
    L_0x0172:
        r0 = move-exception;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r0.toString();
        r0 = r4.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.aki.FAILED_NO_PERMISSIONS;
        r10.b = r0;
        goto L_0x0091;
    L_0x0196:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0198 }
    L_0x0198:
        r0 = move-exception;
        throw r0;
    L_0x019a:
        r0 = r1;
        goto L_0x00a7;
    L_0x019d:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 2;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        r5 = com.whatsapp.aki.FAILED_IO;
        r10.b = r5;
        goto L_0x00b3;
    L_0x01bd:
        r0 = move-exception;
        throw r0;
    L_0x01bf:
        r1 = move-exception;
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        r1 = com.whatsapp.aki.FAILED_FNF;
        r10.b = r1;
        goto L_0x00de;
    L_0x01ce:
        r1 = move-exception;
        r4 = z;	 Catch:{ IOException -> 0x01f1 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01f1 }
        com.whatsapp.util.Log.b(r4, r1);	 Catch:{ IOException -> 0x01f1 }
        if (r3 == 0) goto L_0x00de;
    L_0x01d9:
        r1 = r2;
    L_0x01da:
        r2 = r10.a;	 Catch:{ IOException -> 0x01f1 }
        r2 = com.whatsapp.sx.c(r2);	 Catch:{ IOException -> 0x01f1 }
        r2.file = r1;	 Catch:{ IOException -> 0x01f1 }
        r2 = com.whatsapp.App.aK;	 Catch:{ IOException -> 0x01f1 }
        r1 = r1.getAbsolutePath();	 Catch:{ IOException -> 0x01f1 }
        r3 = r10.a;	 Catch:{ IOException -> 0x01f1 }
        r3 = r3.p;	 Catch:{ IOException -> 0x01f1 }
        r2.b(r1, r3);	 Catch:{ IOException -> 0x01f1 }
        goto L_0x00de;
    L_0x01f1:
        r0 = move-exception;
        throw r0;
    L_0x01f3:
        r0 = r1;
        goto L_0x00de;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fg.a(java.lang.Void[]):java.lang.String");
    }

    public void onPostExecute(Object obj) {
        a((String) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
