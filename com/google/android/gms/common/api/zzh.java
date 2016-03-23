package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.zzc.zza;
import java.util.Collections;

public class zzh implements zzj {
    private final zzi zzZq;

    public zzh(zzi com_google_android_gms_common_api_zzi) {
        this.zzZq = com_google_android_gms_common_api_zzi;
    }

    public void begin() {
        this.zzZq.zzny();
        this.zzZq.zzaah = Collections.emptySet();
    }

    public void connect() {
        this.zzZq.zznz();
    }

    public void disconnect() {
        boolean z = Api.a;
        for (zze cancel : this.zzZq.zzZZ) {
            cancel.cancel();
            if (z) {
                break;
            }
        }
        this.zzZq.zzZZ.clear();
        this.zzZq.zzaag.clear();
        this.zzZq.zznx();
    }

    public String getName() {
        return "DISCONNECTED";
    }

    public void onConnected(Bundle bundle) {
    }

    public void onConnectionSuspended(int i) {
    }

    public zza zza(zza com_google_android_gms_common_api_zzc_zza) {
        this.zzZq.zzZZ.add(com_google_android_gms_common_api_zzc_zza);
        return com_google_android_gms_common_api_zzc_zza;
    }

    public void zza(ConnectionResult connectionResult, Api api, int i) {
    }

    public zza zzb(zza com_google_android_gms_common_api_zzc_zza) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
