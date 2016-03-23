package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;

public abstract class zzg {
    private final String zzana;
    private Object zzanb;

    public class zza extends Exception {
        public zza(String str) {
            super(str);
        }

        public zza(String str, Throwable th) {
            super(str, th);
        }
    }

    protected zzg(String str) {
        this.zzana = str;
    }

    protected final Object zzar(Context context) {
        if (this.zzanb == null) {
            zzx.zzv(context);
            Context remoteContext = GooglePlayServicesUtil.getRemoteContext(context);
            if (remoteContext == null) {
                try {
                    throw new zza("Could not get remote context.");
                } catch (ClassNotFoundException e) {
                    throw e;
                }
            }
            try {
                this.zzanb = zzd((IBinder) remoteContext.getClassLoader().loadClass(this.zzana).newInstance());
            } catch (Throwable e2) {
                throw new zza("Could not load creator class.", e2);
            } catch (Throwable e22) {
                throw new zza("Could not instantiate creator.", e22);
            } catch (Throwable e222) {
                throw new zza("Could not access creator.", e222);
            }
        }
        return this.zzanb;
    }

    protected abstract Object zzd(IBinder iBinder);
}
