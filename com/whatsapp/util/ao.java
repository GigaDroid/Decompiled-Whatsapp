package com.whatsapp.util;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.os.Debug;
import java.io.Closeable;
import org.v;
import org.whispersystems.at;

public class ao {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "nx~muravf?h`k'\u007fa8ro}hgf0";
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
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = 10;
                        break;
                    default:
                        i3 = 16;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "'~]";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(float[] r11) {
        /*
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = 0;
        r8 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r4 = com.whatsapp.util.Log.h;
        r0 = r11[r1];
        r2 = 1;
        r2 = r11[r2];
        r3 = 2;
        r3 = r11[r3];
        r5 = r10 * r3;
        r5 = r5 - r7;
        r5 = java.lang.Math.abs(r5);
        r5 = r7 - r5;
        r5 = r5 * r2;
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = r2 * r5;
        r6 = r3 - r2;
        r2 = 1114636288; // 0x42700000 float:60.0 double:5.507034975E-315;
        r2 = r0 / r2;
        r2 = r2 % r10;
        r2 = r2 - r7;
        r2 = java.lang.Math.abs(r2);
        r2 = r7 - r2;
        r7 = r5 * r2;
        r0 = (int) r0;
        r0 = r0 / 60;
        switch(r0) {
            case 0: goto L_0x0056;
            case 1: goto L_0x0072;
            case 2: goto L_0x0088;
            case 3: goto L_0x009e;
            case 4: goto L_0x00b4;
            case 5: goto L_0x00ca;
            case 6: goto L_0x00ca;
            default: goto L_0x0036;
        };
    L_0x0036:
        r0 = r1;
        r2 = r1;
        r3 = r1;
    L_0x0039:
        r3 = java.lang.Math.min(r9, r3);
        r3 = java.lang.Math.max(r1, r3);
        r2 = java.lang.Math.min(r9, r2);
        r2 = java.lang.Math.max(r1, r2);
        r0 = java.lang.Math.min(r9, r0);
        r0 = java.lang.Math.max(r1, r0);
        r0 = android.graphics.Color.rgb(r3, r2, r0);
        return r0;
    L_0x0056:
        r0 = r5 + r6;
        r0 = r0 * r8;
        r3 = java.lang.Math.round(r0);
        r0 = r7 + r6;
        r0 = r0 * r8;
        r2 = java.lang.Math.round(r0);
        r0 = r8 * r6;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x006c:
        r0 = com.whatsapp.WAAppCompatActivity.c;
        r0 = r0 + 1;
        com.whatsapp.WAAppCompatActivity.c = r0;
    L_0x0072:
        r0 = r7 + r6;
        r0 = r0 * r8;
        r3 = java.lang.Math.round(r0);
        r0 = r5 + r6;
        r0 = r0 * r8;
        r2 = java.lang.Math.round(r0);
        r0 = r8 * r6;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x0088:
        r0 = r8 * r6;
        r3 = java.lang.Math.round(r0);
        r0 = r5 + r6;
        r0 = r0 * r8;
        r2 = java.lang.Math.round(r0);
        r0 = r7 + r6;
        r0 = r0 * r8;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x009e:
        r0 = r8 * r6;
        r3 = java.lang.Math.round(r0);
        r0 = r7 + r6;
        r0 = r0 * r8;
        r2 = java.lang.Math.round(r0);
        r0 = r5 + r6;
        r0 = r0 * r8;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x00b4:
        r0 = r7 + r6;
        r0 = r0 * r8;
        r3 = java.lang.Math.round(r0);
        r0 = r8 * r6;
        r2 = java.lang.Math.round(r0);
        r0 = r5 + r6;
        r0 = r0 * r8;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x00ca:
        r0 = r5 + r6;
        r0 = r0 * r8;
        r3 = java.lang.Math.round(r0);
        r0 = r8 * r6;
        r2 = java.lang.Math.round(r0);
        r0 = r7 + r6;
        r0 = r0 * r8;
        r0 = java.lang.Math.round(r0);
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ao.a(float[]):int");
    }

    public static int a(Bitmap bitmap) {
        return VERSION.SDK_INT < 12 ? bitmap.getRowBytes() * bitmap.getHeight() : bitmap.getByteCount();
    }

    public static void a(int i, float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.e(th.toString());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r12, int r13, int r14, float[] r15) {
        /*
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = com.whatsapp.util.Log.h;
        r0 = (float) r12;
        r2 = r0 / r4;
        r0 = (float) r13;
        r3 = r0 / r4;
        r0 = (float) r14;
        r4 = r0 / r4;
        r0 = java.lang.Math.max(r3, r4);
        r5 = java.lang.Math.max(r2, r0);
        r0 = java.lang.Math.min(r3, r4);
        r0 = java.lang.Math.min(r2, r0);
        r6 = r5 - r0;
        r7 = r5 + r0;
        r7 = r7 / r9;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x002d;
    L_0x002a:
        r0 = 0;
        if (r1 == 0) goto L_0x0067;
    L_0x002d:
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0039;
    L_0x0031:
        r0 = r3 - r4;
        r0 = r0 / r6;
        r8 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
        r0 = r0 % r8;
        if (r1 == 0) goto L_0x0049;
    L_0x0039:
        r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r0 != 0) goto L_0x0043;
    L_0x003d:
        r0 = r4 - r2;
        r0 = r0 / r6;
        r0 = r0 + r9;
        if (r1 == 0) goto L_0x0049;
    L_0x0043:
        r0 = r2 - r3;
        r0 = r0 / r6;
        r1 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r0 = r0 + r1;
    L_0x0049:
        r1 = r9 * r7;
        r1 = r1 - r10;
        r1 = java.lang.Math.abs(r1);
        r1 = r10 - r1;
        r1 = r6 / r1;
        r11 = r1;
        r1 = r0;
        r0 = r11;
    L_0x0057:
        r2 = 0;
        r3 = 1114636288; // 0x42700000 float:60.0 double:5.507034975E-315;
        r1 = r1 * r3;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r1 = r1 % r3;
        r15[r2] = r1;
        r1 = 1;
        r15[r1] = r0;
        r0 = 2;
        r15[r0] = r7;
        return;
    L_0x0067:
        r1 = r0;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ao.a(int, int, int, float[]):void");
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmap == createBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            Log.e(z[0] + (Debug.getNativeHeapAllocatedSize() / 1024) + z[1]);
            return bitmap;
        }
    }
}
