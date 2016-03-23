package com.google;

/* synthetic */ class fP {
    static final int[] a;

    static {
        a = new int[fS.values().length];
        try {
            a[fS.GROUP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[fS.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[fS.ENUM.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
