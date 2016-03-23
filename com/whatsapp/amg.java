package com.whatsapp;

/* synthetic */ class amg {
    static final int[] a;

    static {
        a = new int[ns.values().length];
        try {
            a[ns.SUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[ns.UNSUPPORTED_OLD_API.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[ns.UNSUPPORTED_BAD_DEVICE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[ns.UNSUPPORTED_NO_ENCODER.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
