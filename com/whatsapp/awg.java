package com.whatsapp;

/* synthetic */ class awg {
    static final int[] a;

    static {
        a = new int[ro.values().length];
        try {
            a[ro.WRONG_CONTACT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[ro.WRONG_YOU.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[ro.MISMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[ro.OK.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
