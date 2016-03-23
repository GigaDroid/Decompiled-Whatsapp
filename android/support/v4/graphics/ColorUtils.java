package android.support.v4.graphics;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import org.v;
import org.whispersystems.at;

public class ColorUtils {
    public static boolean a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0000\u0012?\u0010:\u0010\u001c)\u00159B\u0010=\u0015}\f\u001c([?\u0007S(\t<\f\u00000\u000e>\u0007\u001d(A}A";
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
                        i3 = 98;
                        break;
                    case at.g /*1*/:
                        i3 = 115;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 123;
                        break;
                    default:
                        i3 = 93;
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
                    str = "\u0003\u001f,\u0013<B\u001e)\b)B\u00119[?\u0007\u0007+\u001e8\fSl[<\f\u0017|IhW]";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0000\u0012?\u0010:\u0010\u001c)\u00159B\u0010=\u0015}\f\u001c([?\u0007S(\t<\f\u00000\u000e>\u0007\u001d(A}A";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void colorToHSL(@ColorInt int i, @NonNull float[] fArr) {
        RGBToHSL(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    private static int compositeComponent(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? 0 : (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    public static double calculateContrast(@ColorInt int i, @ColorInt int i2) {
        try {
            if (Color.alpha(i2) != 255) {
                throw new IllegalArgumentException(z[0] + Integer.toHexString(i2));
            }
            if (Color.alpha(i) < 255) {
                i = compositeColors(i, i2);
            }
            double calculateLuminance = calculateLuminance(i) + 0.05d;
            double calculateLuminance2 = calculateLuminance(i2) + 0.05d;
            return Math.max(calculateLuminance, calculateLuminance2) / Math.min(calculateLuminance, calculateLuminance2);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static int compositeAlpha(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void RGBToHSL(@android.support.annotation.IntRange(from = 0, to = 255) int r9, @android.support.annotation.IntRange(from = 0, to = 255) int r10, @android.support.annotation.IntRange(from = 0, to = 255) int r11, @android.support.annotation.NonNull float[] r12) {
        /*
        r1 = a;
        r0 = (float) r9;
        r2 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r2 = r0 / r2;
        r0 = (float) r10;
        r3 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r3 = r0 / r3;
        r0 = (float) r11;
        r4 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r4 = r0 / r4;
        r0 = java.lang.Math.max(r3, r4);
        r5 = java.lang.Math.max(r2, r0);
        r0 = java.lang.Math.min(r3, r4);
        r0 = java.lang.Math.min(r2, r0);
        r6 = r5 - r0;
        r7 = r5 + r0;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r7 / r8;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0035;
    L_0x002c:
        r0 = 0;
        if (r1 == 0) goto L_0x008f;
    L_0x002f:
        r0 = android.support.v4.app.FragmentActivity.a;
        r0 = r0 + 1;
        android.support.v4.app.FragmentActivity.a = r0;
    L_0x0035:
        r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0041;
    L_0x0039:
        r0 = r3 - r4;
        r0 = r0 / r6;
        r8 = 1086324736; // 0x40c00000 float:6.0 double:5.367157323E-315;
        r0 = r0 % r8;
        if (r1 == 0) goto L_0x0053;
    L_0x0041:
        r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r0 != 0) goto L_0x004d;
    L_0x0045:
        r0 = r4 - r2;
        r0 = r0 / r6;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 + r4;
        if (r1 == 0) goto L_0x0053;
    L_0x004d:
        r0 = r2 - r3;
        r0 = r0 / r6;
        r1 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r0 = r0 + r1;
    L_0x0053:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 * r7;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r2 - r3;
        r2 = java.lang.Math.abs(r2);
        r1 = r1 - r2;
        r1 = r6 / r1;
    L_0x0062:
        r2 = 1114636288; // 0x42700000 float:60.0 double:5.507034975E-315;
        r0 = r0 * r2;
        r2 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r0 = r0 % r2;
        r2 = 0;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x0070;
    L_0x006d:
        r2 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r0 = r0 + r2;
    L_0x0070:
        r2 = 0;
        r3 = 0;
        r4 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r0 = constrain(r0, r3, r4);
        r12[r2] = r0;
        r0 = 1;
        r2 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = constrain(r1, r2, r3);
        r12[r0] = r1;
        r0 = 2;
        r1 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = constrain(r7, r1, r2);
        r12[r0] = r1;
        return;
    L_0x008f:
        r1 = r0;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.ColorUtils.RGBToHSL(int, int, int, float[]):void");
    }

    private static int constrain(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static int compositeColors(@ColorInt int i, @ColorInt int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(i), alpha2, Color.red(i2), alpha, compositeAlpha), compositeComponent(Color.green(i), alpha2, Color.green(i2), alpha, compositeAlpha), compositeComponent(Color.blue(i), alpha2, Color.blue(i2), alpha, compositeAlpha));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.ColorInt
    public static int HSLToColor(@android.support.annotation.NonNull float[] r11) {
        /*
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = 0;
        r8 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r4 = a;
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
            case 0: goto L_0x0052;
            case 1: goto L_0x0068;
            case 2: goto L_0x007e;
            case 3: goto L_0x0094;
            case 4: goto L_0x00aa;
            case 5: goto L_0x00c0;
            case 6: goto L_0x00c0;
            default: goto L_0x0036;
        };
    L_0x0036:
        r0 = r1;
        r2 = r1;
        r3 = r1;
    L_0x0039:
        r3 = constrain(r3, r1, r9);
        r2 = constrain(r2, r1, r9);
        r0 = constrain(r0, r1, r9);
        r0 = android.graphics.Color.rgb(r3, r2, r0);	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r2 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        if (r2 == 0) goto L_0x0051;
    L_0x004d:
        if (r4 == 0) goto L_0x00da;
    L_0x004f:
        a = r1;
    L_0x0051:
        return r0;
    L_0x0052:
        r0 = r5 + r6;
        r0 = r0 * r8;
        r3 = java.lang.Math.round(r0);
        r0 = r7 + r6;
        r0 = r0 * r8;
        r2 = java.lang.Math.round(r0);
        r0 = r8 * r6;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x0068:
        r0 = r7 + r6;
        r0 = r0 * r8;
        r3 = java.lang.Math.round(r0);
        r0 = r5 + r6;
        r0 = r0 * r8;
        r2 = java.lang.Math.round(r0);
        r0 = r8 * r6;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x007e:
        r0 = r8 * r6;
        r3 = java.lang.Math.round(r0);
        r0 = r5 + r6;
        r0 = r0 * r8;
        r2 = java.lang.Math.round(r0);
        r0 = r7 + r6;
        r0 = r0 * r8;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x0094:
        r0 = r8 * r6;
        r3 = java.lang.Math.round(r0);
        r0 = r7 + r6;
        r0 = r0 * r8;
        r2 = java.lang.Math.round(r0);
        r0 = r5 + r6;
        r0 = r0 * r8;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x00aa:
        r0 = r7 + r6;
        r0 = r0 * r8;
        r3 = java.lang.Math.round(r0);
        r0 = r8 * r6;
        r2 = java.lang.Math.round(r0);
        r0 = r5 + r6;
        r0 = r0 * r8;
        r0 = java.lang.Math.round(r0);
        if (r4 == 0) goto L_0x0039;
    L_0x00c0:
        r0 = r5 + r6;
        r0 = r0 * r8;
        r3 = java.lang.Math.round(r0);
        r0 = r8 * r6;
        r2 = java.lang.Math.round(r0);
        r0 = r7 + r6;
        r0 = r0 * r8;
        r0 = java.lang.Math.round(r0);
        goto L_0x0039;
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r1 = 1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.ColorUtils.HSLToColor(float[]):int");
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double calculateLuminance(@ColorInt int i) {
        double red = ((double) Color.red(i)) / 255.0d;
        if (red < 0.03928d) {
            red /= 12.92d;
        } else {
            red = Math.pow((red + 0.055d) / 1.055d, 2.4d);
        }
        double green = ((double) Color.green(i)) / 255.0d;
        if (green < 0.03928d) {
            green /= 12.92d;
        } else {
            green = Math.pow((green + 0.055d) / 1.055d, 2.4d);
        }
        double blue = ((double) Color.blue(i)) / 255.0d;
        if (blue < 0.03928d) {
            blue /= 12.92d;
        } else {
            blue = Math.pow((blue + 0.055d) / 1.055d, 2.4d);
        }
        return ((red * 0.2126d) + (green * 0.7152d)) + (0.0722d * blue);
    }

    private static float constrain(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int calculateMinimumAlpha(@ColorInt int i, @ColorInt int i2, float f) {
        int i3 = 0;
        int i4 = 255;
        boolean z = a;
        try {
            if (Color.alpha(i2) != 255) {
                throw new IllegalArgumentException(z[1] + Integer.toHexString(i2));
            } else if (calculateContrast(setAlphaComponent(i, 255), i2) < ((double) f)) {
                return -1;
            } else {
                int i5 = 0;
                while (i5 <= 10 && i4 - i3 > 1) {
                    int i6 = (i3 + i4) / 2;
                    if (calculateContrast(setAlphaComponent(i, i6), i2) < ((double) f)) {
                        if (z) {
                            i3 = i6;
                        } else {
                            i3 = i4;
                            i4 = i5 + 1;
                            if (!z) {
                                return i3;
                            }
                            i5 = i4;
                            i4 = i3;
                            i3 = i6;
                        }
                    }
                    int i7 = i6;
                    i6 = i3;
                    i3 = i7;
                    i4 = i5 + 1;
                    if (!z) {
                        return i3;
                    }
                    i5 = i4;
                    i4 = i3;
                    i3 = i6;
                }
                return i4;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i, @IntRange(from = 0, to = 255) int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (16777215 & i) | (i2 << 24);
        }
        try {
            throw new IllegalArgumentException(z[2]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
