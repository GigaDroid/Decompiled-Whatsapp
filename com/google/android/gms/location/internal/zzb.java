package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.location.internal.zzg.zza;

public class zzb extends zzj {
    public static boolean a;
    protected final zzn zzaCs;
    private final String zzaCy;

    class 1 implements zzn {
        final zzb zzaCz;

        1(zzb com_google_android_gms_location_internal_zzb) {
            this.zzaCz = com_google_android_gms_location_internal_zzb;
        }

        public IInterface zzoA() {
            return zzvN();
        }

        public void zzoz() {
            zzb.zza(this.zzaCz);
        }

        public zzg zzvN() {
            return (zzg) this.zzaCz.zzoA();
        }
    }

    public zzb(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzf com_google_android_gms_common_internal_zzf) {
        super(context, looper, 23, com_google_android_gms_common_internal_zzf, connectionCallbacks, onConnectionFailedListener);
        this.zzaCs = new 1(this);
        this.zzaCy = str;
    }

    static void zza(zzb com_google_android_gms_location_internal_zzb) {
        com_google_android_gms_location_internal_zzb.zzoz();
    }

    protected IInterface zzV(IBinder iBinder) {
        return zzbY(iBinder);
    }

    protected zzg zzbY(IBinder iBinder) {
        return zza.zzca(iBinder);
    }

    protected String zzfA() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String zzfB() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle zzli() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzaCy);
        return bundle;
    }
}
