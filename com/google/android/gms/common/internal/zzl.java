package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class zzl {
    private static final Object zzadT;
    private static zzl zzadU;

    static {
        zzadT = new Object();
    }

    public static zzl zzak(Context context) {
        synchronized (zzadT) {
            if (zzadU == null) {
                zzadU = new zzm(context.getApplicationContext());
            }
        }
        return zzadU;
    }

    public abstract boolean zza(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract boolean zza(String str, ServiceConnection serviceConnection, String str2);

    public abstract void zzb(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract void zzb(String str, ServiceConnection serviceConnection, String str2);
}
