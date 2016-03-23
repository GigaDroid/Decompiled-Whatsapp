package com.whatsapp;

import com.whatsapp.contact.j;

/* synthetic */ class g {
    static final int[] a;

    static {
        a = new int[j.values().length];
        try {
            a[j.UP_TO_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[j.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[j.DELAYED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[j.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[j.NETWORK_UNAVAILABLE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
