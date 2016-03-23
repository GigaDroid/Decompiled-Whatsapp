package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zzd;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class zzac extends zzj {
    private final zzd zzaep;

    public zzac(Context context, Looper looper, int i, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzf com_google_android_gms_common_internal_zzf, zzd com_google_android_gms_common_api_Api_zzd) {
        super(context, looper, i, com_google_android_gms_common_internal_zzf, connectionCallbacks, onConnectionFailedListener);
        this.zzaep = com_google_android_gms_common_api_Api_zzd;
    }

    protected IInterface zzV(IBinder iBinder) {
        return this.zzaep.zzV(iBinder);
    }

    protected void zzc(int i, IInterface iInterface) {
        this.zzaep.zza(i, iInterface);
    }

    protected String zzfA() {
        return this.zzaep.zzfA();
    }

    protected String zzfB() {
        return this.zzaep.zzfB();
    }
}
