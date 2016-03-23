package com.google;

public enum hP {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final hP H;
    public static final hP L;
    public static final hP M;
    public static final hP Q;
    private static final hP[] b;
    private final int a;

    private hP(int i) {
        this.a = i;
    }

    static {
        b = new hP[]{M, L, H, Q};
    }

    public static hP forBits(int i) {
        if (i >= 0) {
            try {
                if (i < b.length) {
                    return b[i];
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.a;
    }
}
