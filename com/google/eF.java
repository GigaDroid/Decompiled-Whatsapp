package com.google;

public final class eF {
    public static final eF c;
    public static boolean e;
    private final int[] a;
    private final int[] b;
    private final ey d;
    private final int f;
    private final ey g;

    static {
        c = new eF(929, 3);
    }

    int b(int i, int i2) {
        return ((this.f + i) - i2) % this.f;
    }

    ey c() {
        return this.d;
    }

    ey b() {
        return this.g;
    }

    int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        return this.a[(this.b[i] + this.b[i2]) % (this.f - 1)];
    }

    int a(int i) {
        if (i != 0) {
            return this.a[(this.f - this.b[i]) - 1];
        }
        try {
            throw new ArithmeticException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private eF(int i, int i2) {
        int i3;
        this.f = i;
        this.a = new int[i];
        this.b = new int[i];
        int i4 = 1;
        for (i3 = 0; i3 < i; i3++) {
            this.a[i3] = i4;
            i4 = (i4 * i2) % i;
        }
        i3 = 0;
        while (i3 < i - 1) {
            try {
                this.b[this.a[i3]] = i3;
                i3++;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.g = new ey(this, new int[]{0});
        this.d = new ey(this, new int[]{1});
    }

    int b(int i) {
        return this.a[i];
    }

    int a(int i, int i2) {
        return (i + i2) % this.f;
    }

    ey d(int i, int i2) {
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.g;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new ey(this, iArr);
        }
    }

    int a() {
        return this.f;
    }

    int c(int i) {
        if (i != 0) {
            return this.b[i];
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
