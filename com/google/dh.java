package com.google;

final class dh {
    private static final int[] c;
    private static final int[][] d;
    private final byte a;
    private final hP b;

    public boolean equals(Object obj) {
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        if (this.b == dhVar.b && this.a == dhVar.a) {
            return true;
        }
        return false;
    }

    hP b() {
        return this.b;
    }

    byte a() {
        return this.a;
    }

    public int hashCode() {
        return (this.b.ordinal() << 3) | this.a;
    }

    static dh a(int i, int i2) {
        dh b = b(i, i2);
        if (b != null) {
            return b;
        }
        return b(i ^ 21522, i2 ^ 21522);
    }

    static int c(int i, int i2) {
        int i3 = i ^ i2;
        return c[(i3 >>> 28) & 15] + ((((((c[i3 & 15] + c[(i3 >>> 4) & 15]) + c[(i3 >>> 8) & 15]) + c[(i3 >>> 12) & 15]) + c[(i3 >>> 16) & 15]) + c[(i3 >>> 20) & 15]) + c[(i3 >>> 24) & 15]);
    }

    private dh(int i) {
        this.b = hP.forBits((i >> 3) & 3);
        this.a = (byte) (i & 7);
    }

    static {
        d = new int[][]{new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
        c = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};
    }

    private static dh b(int i, int i2) {
        boolean z = fQ.b;
        int i3 = Integer.MAX_VALUE;
        int[][] iArr = d;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int[] iArr2 = iArr[i4];
            int i6 = iArr2[0];
            if (i6 != i && i6 != i2) {
                int c = c(i, i6);
                if (c < i3) {
                    i5 = iArr2[1];
                } else {
                    c = i3;
                }
                if (i != i2) {
                    i3 = c(i2, i6);
                    if (i3 < c) {
                        i5 = iArr2[1];
                        c = i4 + 1;
                        if (z) {
                            break;
                        }
                        i4 = c;
                    }
                }
                i3 = c;
                c = i4 + 1;
                if (z) {
                    break;
                }
                i4 = c;
            } else {
                return new dh(iArr2[1]);
            }
        }
        return i3 <= 3 ? new dh(i5) : null;
    }
}
