package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.zzc.zza;

public class zzf implements zzj {
    private final zzi zzZq;

    class 1 extends zzb {
        final zzf zzZr;

        1(zzf com_google_android_gms_common_api_zzf, zzj com_google_android_gms_common_api_zzj) {
            this.zzZr = com_google_android_gms_common_api_zzf;
            super(com_google_android_gms_common_api_zzj);
        }

        public void zznn() {
            this.zzZr.onConnectionSuspended(1);
        }
    }

    public zzf(zzi com_google_android_gms_common_api_zzi) {
        this.zzZq = com_google_android_gms_common_api_zzi;
    }

    private void zza(zze com_google_android_gms_common_api_zzi_zze) {
        this.zzZq.zzb(com_google_android_gms_common_api_zzi_zze);
        zzb zza = this.zzZq.zza(com_google_android_gms_common_api_zzi_zze.zznd());
        if (zza.isConnected() || !this.zzZq.zzaag.containsKey(com_google_android_gms_common_api_zzi_zze.zznd())) {
            com_google_android_gms_common_api_zzi_zze.zzb(zza);
        } else {
            com_google_android_gms_common_api_zzi_zze.zzx(new Status(17));
        }
    }

    public void begin() {
        boolean z = Api.a;
        while (!this.zzZq.zzZZ.isEmpty()) {
            try {
                zza((zze) this.zzZq.zzZZ.remove());
            } catch (Throwable e) {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", e);
                if (z) {
                    return;
                }
            }
        }
    }

    public void connect() {
    }

    public void disconnect() {
        this.zzZq.zzaag.clear();
        this.zzZq.zznx();
        this.zzZq.zzg(null);
        this.zzZq.zzZY.zzoI();
    }

    public String getName() {
        return "CONNECTED";
    }

    public void onConnected(Bundle bundle) {
    }

    public void onConnectionSuspended(int i) {
        boolean z = Api.a;
        if (i == 1) {
            this.zzZq.zznD();
        }
        for (zze zzw : this.zzZq.zzaal) {
            zzw.zzw(new Status(8, "The connection to Google Play services was lost"));
            if (z) {
                break;
            }
        }
        this.zzZq.zzg(null);
        this.zzZq.zzZY.zzbB(i);
        this.zzZq.zzZY.zzoI();
        if (i == 2) {
            this.zzZq.connect();
        }
    }

    public zza zza(zza com_google_android_gms_common_api_zzc_zza) {
        return zzb(com_google_android_gms_common_api_zzc_zza);
    }

    public void zza(ConnectionResult connectionResult, Api api, int i) {
    }

    public zza zzb(zza com_google_android_gms_common_api_zzc_zza) {
        try {
            zza((zze) com_google_android_gms_common_api_zzc_zza);
        } catch (DeadObjectException e) {
            this.zzZq.zza(new 1(this, this));
        }
        return com_google_android_gms_common_api_zzc_zza;
    }
}
