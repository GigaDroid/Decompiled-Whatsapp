package com.facebook.buck.android.support.exopackage;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a {
    private static final String[] z;

    static {
        String[] strArr = new String[11];
        String str = "\u00158b\u007fU\u00150lhUVswfD\u00159{dD[?hjS_s";
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
                        i3 = 58;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 52;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "_$l{UY7blQe8fskU,w";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "W9wjP[(b%@B(";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u00148fs";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "|=jgQ^|wd\u0014^9on@_|p\u007fUV9#dP_$9+";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0015/fh[T8byM\u00178fs";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u007f$l{UY7blQ~9{G[[8fy";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u007f$l{UY7blQ~9{G[[8fy";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "frijF\u001e";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u00148fs\u001aP=q";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "i7j{DS2d+AT9{{QY(fo\u0014\\5on\u0014S2#nLU,bh_[;f+PS.fh@U.z1\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r12) {
        /*
        r2 = 1;
        r1 = 0;
        r4 = com.facebook.buck.android.support.exopackage.d.d;
        r0 = new java.io.File;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = z;
        r5 = r5[r1];
        r3 = r3.append(r5);
        r5 = r12.getPackageName();
        r3 = r3.append(r5);
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r3 = r3.toString();
        r0.<init>(r3);
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = new java.util.HashSet;
        r6.<init>();
        r7 = r0.listFiles();
        if (r7 == 0) goto L_0x00a9;
    L_0x003b:
        r8 = r7.length;
        r3 = r1;
    L_0x003d:
        if (r3 >= r8) goto L_0x00a9;
    L_0x003f:
        r9 = r7[r3];
        r0 = r9.getName();
        r10 = z;
        r11 = 3;
        r10 = r10[r11];
        r0 = r0.equals(r10);
        if (r0 == 0) goto L_0x0059;
    L_0x0050:
        if (r4 == 0) goto L_0x00a5;
    L_0x0052:
        r0 = com.facebook.buck.android.support.exopackage.c.a;
        if (r0 == 0) goto L_0x00fc;
    L_0x0056:
        r0 = r1;
    L_0x0057:
        com.facebook.buck.android.support.exopackage.c.a = r0;
    L_0x0059:
        r0 = r9.getName();
        r10 = z;
        r11 = 10;
        r10 = r10[r11];
        r0 = r0.endsWith(r10);
        if (r0 != 0) goto L_0x008c;
    L_0x0069:
        r0 = z;
        r10 = 7;
        r0 = r0[r10];
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = z;
        r11 = r11[r2];
        r10 = r10.append(r11);
        r11 = r9.getName();
        r10 = r10.append(r11);
        r10 = r10.toString();
        android.util.Log.w(r0, r10);
        if (r4 == 0) goto L_0x00a5;
    L_0x008c:
        r5.add(r9);
        r0 = r9.getName();
        r9 = z;
        r10 = 9;
        r9 = r9[r10];
        r10 = z;
        r11 = 4;
        r10 = r10[r11];
        r0 = r0.replaceFirst(r9, r10);
        r6.add(r0);
    L_0x00a5:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x00ff;
    L_0x00a9:
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        r0 = r12.getDir(r0, r1);
        r2 = r12.getClassLoader();
        com.facebook.buck.android.support.exopackage.e.a(r2, r0, r5);
        r0 = r0.listFiles();
        if (r0 == 0) goto L_0x00fb;
    L_0x00bf:
        r2 = r0.length;
    L_0x00c0:
        if (r1 >= r2) goto L_0x00fb;
    L_0x00c2:
        r3 = r0[r1];
        r5 = r3.getName();
        r5 = r6.contains(r5);
        if (r5 != 0) goto L_0x00f7;
    L_0x00ce:
        r5 = r3.delete();
        if (r5 != 0) goto L_0x00f7;
    L_0x00d4:
        r5 = z;
        r7 = 8;
        r5 = r5[r7];
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 5;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r3 = r3.getAbsolutePath();
        r3 = r7.append(r3);
        r3 = r3.toString();
        android.util.Log.w(r5, r3);
    L_0x00f7:
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x00c0;
    L_0x00fb:
        return;
    L_0x00fc:
        r0 = r2;
        goto L_0x0057;
    L_0x00ff:
        r3 = r0;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.buck.android.support.exopackage.a.a(android.content.Context):void");
    }
}
