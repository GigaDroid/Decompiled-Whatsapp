package com.google.android.gms.internal;

import android.os.Build.VERSION;

public final class zzlv {
    private static boolean zzbZ(int i) {
        return VERSION.SDK_INT >= i;
    }

    public static boolean zzpO() {
        return zzbZ(11);
    }

    public static boolean zzpQ() {
        return zzbZ(13);
    }

    public static boolean zzpR() {
        return zzbZ(14);
    }

    public static boolean zzpV() {
        return zzbZ(19);
    }

    public static boolean zzpX() {
        return zzbZ(21);
    }
}
