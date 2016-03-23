package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class arw implements Runnable {
    private static final String[] z;

    static {
        String[] strArr = new String[13];
        String str = "\u0004\u001f8)V\u000b\u001dgvE\u0000\tg`V\f\u0003-b";
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
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "J\u000b)rVJ\u000e&t\u0018";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0011\u001d)eR\u0016A<~C";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0004\u001f8)V\u000b\u001dg`V\f\u0003-b\u0017";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0004\u0001,tX\f\u000b\u0017gY\u0017";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "\u0006\u0000%(@\r\u000e<uV\u0015\u001f\u0017vE\u0000\t-tR\u000b\f-u";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "\u0006\u0000%(@\r\u000e<uV\u0015\u001f";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0004\u001f8)V\u000b\u001dgtX\u0004\u0002!hP\n\u001d=h\\\u000b\u0000?h\u0018\u0016\u0004!v";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0004\u0001:YQ\f\u0003-YC\f\u0002-uC\u0004\u00028";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "&\u0002,&[\f\u0001-<\u0017M3\u001b-\u001e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0004\u0001:YQ\f\u0003-YC\f\u0002-uC\u0004\u00028";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0004\u001f8)V\u000b\u001dgiC\r\n:)G\u0017\n.)Q\u0004\u0006$cS";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0004\u0001:YQ\f\u0003-YC\f\u0002-uC\u0004\u00028";
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
        r14 = this;
        r0 = 0;
        r5 = 0;
        r8 = com.whatsapp.DialogToastActivity.f;
        r1 = new java.io.File;
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r1.<init>(r2, r3);
        r2 = r1.exists();
        if (r2 == 0) goto L_0x0040;
    L_0x0019:
        r10 = r1.lastModified();
        r2 = com.whatsapp.App.z();
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.getSharedPreferences(r3, r5);
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r4 = -1;
        r4 = r2.getLong(r3, r4);
        r6 = 0;
        r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r3 == 0) goto L_0x0040;
    L_0x003c:
        r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r3 != 0) goto L_0x0041;
    L_0x0040:
        return;
    L_0x0041:
        r3 = z;	 Catch:{ IOException -> 0x012c, all -> 0x0125 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ IOException -> 0x012c, all -> 0x0125 }
        r3 = java.util.regex.Pattern.compile(r3);	 Catch:{ IOException -> 0x012c, all -> 0x0125 }
        r7 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x012c, all -> 0x0125 }
        r4 = new java.io.FileReader;	 Catch:{ IOException -> 0x012c, all -> 0x0125 }
        r4.<init>(r1);	 Catch:{ IOException -> 0x012c, all -> 0x0125 }
        r7.<init>(r4);	 Catch:{ IOException -> 0x012c, all -> 0x0125 }
    L_0x0055:
        r4 = r7.readLine();	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        if (r4 == 0) goto L_0x0118;
    L_0x005b:
        r4 = r3.matcher(r4);	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r5 = r4.find();	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        if (r5 == 0) goto L_0x0055;
    L_0x0065:
        r9 = r2.edit();	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r2 = z;	 Catch:{ IOException -> 0x0098, all -> 0x00c1 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0098, all -> 0x00c1 }
        r3 = 1;
        r3 = r4.group(r3);	 Catch:{ IOException -> 0x0098, all -> 0x00c1 }
        r2 = r2.equals(r3);	 Catch:{ IOException -> 0x0098, all -> 0x00c1 }
        if (r2 == 0) goto L_0x0100;
    L_0x0079:
        r2 = com.whatsapp.App.ad;	 Catch:{ IOException -> 0x0098, all -> 0x00c1 }
        if (r2 == 0) goto L_0x0083;
    L_0x007d:
        r0 = com.whatsapp.App.ad;	 Catch:{ IOException -> 0x009a, all -> 0x00c1 }
        r0 = r0.getActiveNetworkInfo();	 Catch:{ IOException -> 0x009a, all -> 0x00c1 }
    L_0x0083:
        if (r0 == 0) goto L_0x008b;
    L_0x0085:
        r0 = r0.isRoaming();	 Catch:{ IOException -> 0x00bf, all -> 0x00c1 }
        if (r0 == 0) goto L_0x00c6;
    L_0x008b:
        r0 = z;	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r1 = 8;
        r0 = r0[r1];	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        com.whatsapp.util.ao.a(r7);
        goto L_0x0040;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009a, all -> 0x00c1 }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
    L_0x009c:
        r0 = move-exception;
        r1 = r7;
    L_0x009e:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0129 }
        r2.<init>();	 Catch:{ all -> 0x0129 }
        r3 = z;	 Catch:{ all -> 0x0129 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ all -> 0x0129 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0129 }
        r0 = r0.toString();	 Catch:{ all -> 0x0129 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0129 }
        r0 = r0.toString();	 Catch:{ all -> 0x0129 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0129 }
        com.whatsapp.util.ao.a(r1);
        goto L_0x0040;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
    L_0x00c2:
        com.whatsapp.util.ao.a(r7);
        throw r0;
    L_0x00c6:
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r0 = com.whatsapp.App.x(r0);	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r5 = com.whatsapp.util.a1.a(r1);	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r1 = 1;
        r2 = 0;
        r3 = 0;
        r4 = com.whatsapp.av3.ANR;	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r4 = java.util.EnumSet.of(r4);	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r6 = z;	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r12 = 5;
        r6 = r6[r12];	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        r0 = com.whatsapp.App.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
        if (r0 == 0) goto L_0x00fe;
    L_0x00e6:
        r0 = z;	 Catch:{ IOException -> 0x011d, all -> 0x00c1 }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ IOException -> 0x011d, all -> 0x00c1 }
        r0 = r9.putLong(r0, r10);	 Catch:{ IOException -> 0x011d, all -> 0x00c1 }
        r0 = r0.commit();	 Catch:{ IOException -> 0x011d, all -> 0x00c1 }
        if (r0 != 0) goto L_0x00fe;
    L_0x00f6:
        r0 = z;	 Catch:{ IOException -> 0x011f, all -> 0x00c1 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IOException -> 0x011f, all -> 0x00c1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x011f, all -> 0x00c1 }
    L_0x00fe:
        if (r8 == 0) goto L_0x0118;
    L_0x0100:
        r0 = z;	 Catch:{ IOException -> 0x0121, all -> 0x00c1 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0121, all -> 0x00c1 }
        r0 = r9.putLong(r0, r10);	 Catch:{ IOException -> 0x0121, all -> 0x00c1 }
        r0 = r0.commit();	 Catch:{ IOException -> 0x0121, all -> 0x00c1 }
        if (r0 != 0) goto L_0x0118;
    L_0x010f:
        r0 = z;	 Catch:{ IOException -> 0x0123, all -> 0x00c1 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0123, all -> 0x00c1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0123, all -> 0x00c1 }
    L_0x0118:
        com.whatsapp.util.ao.a(r7);
        goto L_0x0040;
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011f, all -> 0x00c1 }
    L_0x011f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0123, all -> 0x00c1 }
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009c, all -> 0x00c1 }
    L_0x0125:
        r1 = move-exception;
        r7 = r0;
        r0 = r1;
        goto L_0x00c2;
    L_0x0129:
        r0 = move-exception;
        r7 = r1;
        goto L_0x00c2;
    L_0x012c:
        r1 = move-exception;
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.arw.run():void");
    }

    arw() {
    }
}
