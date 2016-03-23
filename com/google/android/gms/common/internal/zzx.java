package com.google.android.gms.common.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class zzx {
    public static boolean a;

    public static void zzY(boolean z) {
        if (!z) {
            try {
                throw new IllegalStateException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void zzZ(boolean z) {
        if (!z) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void zza(boolean z, Object obj) {
        if (!z) {
            try {
                throw new IllegalStateException(String.valueOf(obj));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void zza(boolean z, String str, Object[] objArr) {
        if (!z) {
            try {
                throw new IllegalStateException(String.format(str, objArr));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static Object zzb(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        try {
            throw new NullPointerException(String.valueOf(obj2));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static void zzb(boolean z, Object obj) {
        if (!z) {
            try {
                throw new IllegalArgumentException(String.valueOf(obj));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void zzb(boolean z, String str, Object[] objArr) {
        if (!z) {
            try {
                throw new IllegalArgumentException(String.format(str, objArr));
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static void zzch(String str) {
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException(str);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static void zzci(String str) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException(str);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static String zzcs(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static String zzh(String str, Object obj) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            throw new IllegalArgumentException(String.valueOf(obj));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static Object zzv(Object obj) {
        if (obj != null) {
            return obj;
        }
        try {
            throw new NullPointerException("null reference");
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
