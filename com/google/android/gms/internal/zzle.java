package com.google.android.gms.internal;

public class zzle {
    public static final int[] EMPTY_INTS;
    public static final long[] EMPTY_LONGS;
    public static final Object[] EMPTY_OBJECTS;

    static {
        EMPTY_INTS = new int[0];
        EMPTY_LONGS = new long[0];
        EMPTY_OBJECTS = new Object[0];
    }

    public static int binarySearch(int[] iArr, int i, int i2) {
        boolean z = zzkq.a;
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
                if (!z) {
                    i5 = i4;
                    if (z) {
                        break;
                    }
                    i4 = i5;
                }
            }
            i4 = i3;
            if (i6 > i2) {
                i3 = i5 - 1;
                if (!z) {
                    i5 = i3;
                    i3 = i4;
                    if (z) {
                        break;
                    }
                    i4 = i5;
                }
            }
            return i5;
        }
        return i3 ^ -1;
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
