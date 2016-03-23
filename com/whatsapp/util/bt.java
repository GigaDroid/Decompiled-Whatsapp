package com.whatsapp.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public class bt {
    private static float a(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static void a(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        int i5 = Log.h;
        int i6 = 0;
        while (i6 < i4) {
            a(iArr, iArr2, i, i2, i3);
            a(iArr2, iArr, i2, i, i3);
            i6++;
            if (i5 != 0) {
                return;
            }
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        int[] iArr = new int[(bitmap.getWidth() * bitmap.getHeight())];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        a(iArr, new int[(bitmap.getWidth() * bitmap.getHeight())], bitmap.getWidth(), bitmap.getHeight(), i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return createBitmap;
    }

    private static void a(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4 = Log.h;
        int i5 = i - 1;
        int i6 = (i3 * 2) + 1;
        int[] iArr3 = new int[(i6 * 256)];
        int i7 = 0;
        while (i7 < i6 * 256) {
            iArr3[i7] = i7 / i6;
            i7++;
            if (i4 != 0) {
                break;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i2) {
            int i10;
            i7 = 0;
            i6 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = -i3;
            while (i13 <= i3) {
                i10 = iArr[((int) a((float) i13, 0.0f, (float) (i - 1))) + i9];
                i12 += (i10 >> 24) & 255;
                i11 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i13++;
                if (i4 != 0) {
                    break;
                }
            }
            i10 = i11;
            int i14 = i12;
            int i15 = i8;
            i11 = 0;
            i12 = i7;
            i13 = i6;
            while (i11 < i) {
                iArr2[i15] = (((iArr3[i14] << 24) | (iArr3[i10] << 16)) | (iArr3[i13] << 8)) | iArr3[i12];
                i7 = (i11 + i3) + 1;
                if (i7 > i5) {
                    i6 = i5;
                } else {
                    i6 = i7;
                }
                i7 = i11 - i3;
                if (i7 < 0) {
                    i7 = 0;
                }
                i6 = iArr[i6 + i9];
                i7 = iArr[i7 + i9];
                i14 += ((i6 >> 24) & 255) - ((i7 >> 24) & 255);
                i10 += ((16711680 & i6) - (16711680 & i7)) >> 16;
                i13 += ((65280 & i6) - (65280 & i7)) >> 8;
                i6 = i12 + ((i6 & 255) - (i7 & 255));
                i12 = i15 + i2;
                i7 = i11 + 1;
                if (i4 != 0) {
                    break;
                }
                i11 = i7;
                i15 = i12;
                i12 = i6;
            }
            i7 = i9 + i;
            i8++;
            if (i4 == 0) {
                i9 = i7;
            } else {
                return;
            }
        }
    }
}
