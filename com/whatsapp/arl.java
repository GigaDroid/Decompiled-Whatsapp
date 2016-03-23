package com.whatsapp;

import com.whatsapp.fieldstats.a3;

/* synthetic */ class arl {
    static final int[] a;

    static {
        a = new int[a3.values().length];
        try {
            a[a3.OK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[a3.FAILED_COMMUNICATION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[a3.FAILED_OUT_OF_QUOTA.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[a3.FAILED_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[a3.CANCEL.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
