package android.support.v4.util;

class ContainerHelpers {
    static final int[] EMPTY_INTS;
    static final long[] EMPTY_LONGS;
    static final Object[] EMPTY_OBJECTS;

    public static int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public static int idealLongArraySize(int i) {
        return idealByteArraySize(i * 8) / 8;
    }

    public static int idealByteArraySize(int i) {
        boolean z = LruCache.a;
        int i2 = 4;
        while (i2 < 32) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
            i2++;
            if (z) {
                return i;
            }
        }
        return i;
    }

    static int binarySearch(int[] iArr, int i, int i2) {
        boolean z = LruCache.a;
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

    static int binarySearch(long[] jArr, int i, long j) {
        boolean z = LruCache.a;
        int i2 = 0;
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i2 = i4 + 1;
                if (!z) {
                    i4 = i3;
                    if (z) {
                        break;
                    }
                    i3 = i4;
                }
            }
            i3 = i2;
            if (j2 > j) {
                i2 = i4 - 1;
                if (!z) {
                    i4 = i2;
                    i2 = i3;
                    if (z) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return i4;
        }
        return i2 ^ -1;
    }

    static {
        EMPTY_INTS = new int[0];
        EMPTY_LONGS = new long[0];
        EMPTY_OBJECTS = new Object[0];
    }
}
