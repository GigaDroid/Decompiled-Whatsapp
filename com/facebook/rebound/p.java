package com.facebook.rebound;

import android.os.Build.VERSION;

abstract class p {
    public static g a() {
        if (VERSION.SDK_INT >= 16) {
            return h.a();
        }
        return i.a();
    }
}
