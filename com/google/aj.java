package com.google;

import org.v;
import org.whispersystems.at;

public final class aj {
    public static final aj a;
    public static final aj b;
    public static final aj d;
    public static final aj g;
    public static final aj i;
    public static int l;
    public static final aj n;
    public static final aj o;
    public static final aj p;
    private static final String z;
    private final ht c;
    private final int e;
    private final int f;
    private final int h;
    private final int[] j;
    private final ht k;
    private final int[] m;

    int c(int i) {
        return this.j[i];
    }

    ht d() {
        return this.c;
    }

    public int c() {
        return this.f;
    }

    public aj(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.h = i3;
        this.j = new int[i2];
        this.m = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.j[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        i4 = 0;
        while (i4 < i2 - 1) {
            try {
                this.m[this.j[i4]] = i4;
                i4++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.k = new ht(this, new int[]{0});
        this.c = new ht(this, new int[]{1});
    }

    ht a(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.k;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new ht(this, iArr);
        }
    }

    int b(int i) {
        if (i != 0) {
            return this.j[(this.f - this.m[i]) - 1];
        }
        try {
            throw new ArithmeticException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int c(int i, int i2) {
        return i ^ i2;
    }

    static {
        char[] toCharArray = "\b)'\bZ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 79;
                    break;
                case at.g /*1*/:
                    i2 = 111;
                    break;
                case at.i /*2*/:
                    i2 = 15;
                    break;
                case at.o /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = new aj(4201, 4096, 1);
        p = new aj(1033, 1024, 1);
        o = new aj(67, 64, 1);
        d = new aj(19, 16, 1);
        g = new aj(285, 256, 0);
        n = new aj(301, 256, 1);
        b = n;
        i = o;
    }

    public int a() {
        return this.h;
    }

    ht b() {
        return this.k;
    }

    int a(int i) {
        if (i != 0) {
            return this.m[i];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        return this.j[(this.m[i] + this.m[i2]) % (this.f - 1)];
    }

    public String toString() {
        return z + Integer.toHexString(this.e) + ',' + this.f + ')';
    }
}
