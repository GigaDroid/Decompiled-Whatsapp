package com.google;

/* synthetic */ class ez {
    static final int[] a;
    static final int[] b;
    static final int[] c;

    static {
        a = new int[bw.values().length];
        try {
            a[bw.PREMIUM_RATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[bw.TOLL_FREE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[bw.MOBILE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[bw.FIXED_LINE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[bw.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[bw.SHARED_COST.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[bw.VOIP.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            a[bw.PERSONAL_NUMBER.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
        try {
            a[bw.PAGER.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
        }
        try {
            a[bw.UAN.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
        }
        try {
            a[bw.VOICEMAIL.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
        }
        c = new int[e5.values().length];
        try {
            c[e5.E164.ordinal()] = 1;
        } catch (NoSuchFieldError e12) {
        }
        try {
            c[e5.INTERNATIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError e13) {
        }
        try {
            c[e5.RFC3966.ordinal()] = 3;
        } catch (NoSuchFieldError e14) {
        }
        try {
            c[e5.NATIONAL.ordinal()] = 4;
        } catch (NoSuchFieldError e15) {
        }
        b = new int[aw.values().length];
        try {
            b[aw.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
        } catch (NoSuchFieldError e16) {
        }
        try {
            b[aw.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
        } catch (NoSuchFieldError e17) {
        }
        try {
            b[aw.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
        } catch (NoSuchFieldError e18) {
        }
        try {
            b[aw.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
        } catch (NoSuchFieldError e19) {
        }
    }
}
