package com.whatsapp;

/* synthetic */ class ar1 {
    static final int[] a;

    static {
        a = new int[ao1.values().length];
        try {
            a[ao1.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[ao1.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[ao1.MISSED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[ao1.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
