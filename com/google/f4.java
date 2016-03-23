package com.google;

/* synthetic */ class f4 {
    static final int[] a;

    static {
        a = new int[bu.values().length];
        try {
            a[bu.ALPHA.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[bu.LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[bu.MIXED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[bu.PUNCT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[bu.ALPHA_SHIFT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[bu.PUNCT_SHIFT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
    }
}
