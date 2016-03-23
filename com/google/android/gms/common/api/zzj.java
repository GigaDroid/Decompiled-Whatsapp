package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.zzc.zza;

public interface zzj {
    void begin();

    void connect();

    void disconnect();

    String getName();

    void onConnected(Bundle bundle);

    void onConnectionSuspended(int i);

    zza zza(zza com_google_android_gms_common_api_zzc_zza);

    void zza(ConnectionResult connectionResult, Api api, int i);

    zza zzb(zza com_google_android_gms_common_api_zzc_zza);
}
