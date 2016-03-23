package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.zzc.zzb;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.wearable.internal.zzau.zza;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zzbn extends zzj {
    private final ExecutorService zzaRv;
    private final zzax zzbaU;
    private final zzax zzbaV;
    private final zzax zzbaW;
    private final zzax zzbaX;
    private final zzax zzbaY;
    private final zzax zzbaZ;
    private final zzax zzbba;
    private final Map zzbbb;

    public zzbn(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzf com_google_android_gms_common_internal_zzf) {
        super(context, looper, 14, com_google_android_gms_common_internal_zzf, connectionCallbacks, onConnectionFailedListener);
        this.zzaRv = Executors.newCachedThreadPool();
        this.zzbaU = new zzax();
        this.zzbaV = new zzax();
        this.zzbaW = new zzax();
        this.zzbaX = new zzax();
        this.zzbaY = new zzax();
        this.zzbaZ = new zzax();
        this.zzbba = new zzax();
        this.zzbbb = new HashMap();
    }

    public void disconnect() {
        boolean z = zza.a;
        this.zzbaU.zzb(this);
        this.zzbaV.zzb(this);
        this.zzbaX.zzb(this);
        this.zzbaY.zzb(this);
        this.zzbaZ.zzb(this);
        this.zzbba.zzb(this);
        synchronized (this.zzbbb) {
            for (zzax zzb : this.zzbbb.values()) {
                zzb.zzb(this);
                if (z) {
                    break;
                }
            }
        }
        super.disconnect();
    }

    protected IInterface zzV(IBinder iBinder) {
        return zzec(iBinder);
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        boolean z = zza.a;
        if (Log.isLoggable("WearableClient", 2)) {
            Log.d("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.zzbaU.zzeb(iBinder);
            this.zzbaV.zzeb(iBinder);
            this.zzbaX.zzeb(iBinder);
            this.zzbaY.zzeb(iBinder);
            this.zzbaZ.zzeb(iBinder);
            this.zzbba.zzeb(iBinder);
            synchronized (this.zzbbb) {
                for (zzax zzeb : this.zzbbb.values()) {
                    zzeb.zzeb(iBinder);
                    if (z) {
                        break;
                    }
                }
            }
        }
        super.zza(i, iBinder, bundle, i2);
    }

    protected zzaw zzec(IBinder iBinder) {
        return zzaw.zza.zzea(iBinder);
    }

    protected String zzfA() {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String zzfB() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public void zzp(zzb com_google_android_gms_common_api_zzc_zzb) {
        ((zzaw) zzoA()).zzd(new zzj(com_google_android_gms_common_api_zzc_zzb));
    }
}
