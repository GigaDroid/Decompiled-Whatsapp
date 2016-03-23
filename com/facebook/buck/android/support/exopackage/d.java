package com.facebook.buck.android.support.exopackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class d {
    private static Map a;
    private static File b;
    private static boolean c;
    public static boolean d;
    private static Map e;
    private static String f;
    private static final String[] z;

    private static void b(Context context) {
        int i = 0;
        boolean z = d;
        b = context.getDir(z[0], 0);
        File[] listFiles = b.listFiles();
        int length = listFiles.length;
        while (i < length) {
            listFiles[i].delete();
            i++;
            if (z) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r6, java.util.Map r7) {
        /*
        r0 = d;
        if (r6 == 0) goto L_0x000a;
    L_0x0004:
        r1 = r6.exists();	 Catch:{ IOException -> 0x000b }
        if (r1 != 0) goto L_0x000f;
    L_0x000a:
        return;
    L_0x000b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x000d }
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r1 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x0057 }
        r2 = new java.io.FileReader;	 Catch:{ IOException -> 0x0057 }
        r2.<init>(r6);	 Catch:{ IOException -> 0x0057 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x0057 }
    L_0x0019:
        r2 = r1.readLine();	 Catch:{ all -> 0x0052 }
        if (r2 == 0) goto L_0x0070;
    L_0x001f:
        r2 = r2.trim();	 Catch:{ all -> 0x0052 }
        r3 = r2.isEmpty();	 Catch:{ IOException -> 0x005e }
        if (r3 == 0) goto L_0x002b;
    L_0x0029:
        if (r0 == 0) goto L_0x0019;
    L_0x002b:
        r3 = 32;
        r3 = r2.indexOf(r3);	 Catch:{ all -> 0x0052 }
        r4 = -1;
        if (r3 != r4) goto L_0x0060;
    L_0x0034:
        r0 = new java.lang.RuntimeException;	 Catch:{ IOException -> 0x0050 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0050 }
        r3.<init>();	 Catch:{ IOException -> 0x0050 }
        r4 = z;	 Catch:{ IOException -> 0x0050 }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0050 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0050 }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x0050 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0050 }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0050 }
        throw r0;	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0057 }
        throw r0;	 Catch:{ IOException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0052 }
    L_0x0060:
        r4 = 0;
        r4 = r2.substring(r4, r3);	 Catch:{ all -> 0x0052 }
        r3 = r3 + 1;
        r2 = r2.substring(r3);	 Catch:{ all -> 0x0052 }
        r7.put(r4, r2);	 Catch:{ all -> 0x0052 }
        if (r0 == 0) goto L_0x0019;
    L_0x0070:
        r1.close();	 Catch:{ IOException -> 0x0057 }
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.buck.android.support.exopackage.d.a(java.io.File, java.util.Map):void");
    }

    private static File c() {
        try {
            if (Build.CPU_ABI2.equals(z[1])) {
                return null;
            }
            return new File(f + Build.CPU_ABI2 + z[2]);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[10];
        String str = "]E:z\u0016Q_&";
        boolean z = true;
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
                        i3 = 61;
                        break;
                    case at.i /*2*/:
                        i3 = 85;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 122;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0017P0#\u001b\\\\!6TLE!";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "}O'8\b\u0018M4%\tQS2w\u0017]I43\u001bL\\{#\u0002L\u0006u>\u0014N\\9>\u001e\u0018Q<9\u001f\u0002\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "QS<#R\u0011\u001d4;\b]\\1.Z[\\9;\u001f\\\u0011u$\u0015\u0018S:#\u0012QS2w\u000eW\u001d18T";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0017Y4#\u001b\u0017Q:4\u001bT\u0012!:\n\u0017X-8\nY^>6\u001d]\u0012";
                    z = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "}E:'\u001b[V40\u001fkR\u00198\u001b\\X'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0017S4#\u0013NXx;\u0013ZNz";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0017P0#\u001b\\\\!6TLE!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "}T!?\u001fJ\u001dr9\u001bLT#2]\u0018X-8\nY^>6\u001d]\u001d<$ZVR!w\u000eMO;2\u001e\u0018R;w\u001cWOu#\u0012QNu5\u000fQQ1{ZWOu#\u0012]\u001d<9\tL\\9;\u001bLT:9Z\\T1w\u0014WIu4\u0015UM92\u000e]\u001d&\"\u0019[X&$\u001cMQ9.T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = false;
                    f = null;
                    b = null;
                    a = new HashMap();
                    e = new HashMap();
                    return;
                default:
                    strArr2[i] = str;
                    str = "MS>9\u0015OS";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static void a(Context context) {
        try {
            if (c) {
                Log.d(z[6], z[4]);
                return;
            }
            f = z[5] + context.getPackageName() + z[7];
            a();
            b(context);
            d();
            c = true;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private static File b() {
        return new File(f + Build.CPU_ABI + z[8]);
    }

    private static void a() {
        try {
            if (!b().exists()) {
                File c = c();
                if (c != null) {
                    try {
                        if (!c.exists()) {
                            throw new RuntimeException(z[9]);
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private static void d() {
        a(b(), a);
        a(c(), e);
    }
}
