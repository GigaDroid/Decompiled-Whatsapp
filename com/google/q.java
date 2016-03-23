package com.google;

/* synthetic */ class q {
    static final int[] a;

    static {
        a = new int[S.values().length];
        try {
            a[S.UPPER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[S.LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[S.MIXED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[S.PUNCT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[S.DIGIT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
