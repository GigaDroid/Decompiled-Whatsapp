package com.whatsapp;

import com.whatsapp.Voip.DebugTapType;

/* synthetic */ class jg {
    static final int[] a;

    static {
        a = new int[DebugTapType.values().length];
        try {
            a[DebugTapType.CAPTURED_AND_POST_PROCESSED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[DebugTapType.OUTGOING_ENCODED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[DebugTapType.RECEIVED_AND_DECODED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[DebugTapType.RAW_CAPTURED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[DebugTapType.RAW_PLAYBACK.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
