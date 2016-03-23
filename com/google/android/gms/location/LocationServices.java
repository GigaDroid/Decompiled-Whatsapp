package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.location.internal.zze;
import com.google.android.gms.location.internal.zzj;
import com.google.android.gms.location.internal.zzo;

public class LocationServices {
    public static final Api API;
    public static final FusedLocationProviderApi FusedLocationApi;
    public static final GeofencingApi GeofencingApi;
    public static final SettingsApi SettingsApi;
    private static final zzc zzQf;
    private static final com.google.android.gms.common.api.Api.zza zzQg;

    final class 1 extends com.google.android.gms.common.api.Api.zza {
        1() {
        }

        public zzb zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzm(context, looper, com_google_android_gms_common_internal_zzf, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzj zzm(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzj(context, looper, connectionCallbacks, onConnectionFailedListener, "locationServices", com_google_android_gms_common_internal_zzf);
        }
    }

    public abstract class zza extends com.google.android.gms.common.api.zzc.zza {
        public static int a;

        public zza(GoogleApiClient googleApiClient) {
            super(LocationServices.zzvG(), googleApiClient);
        }
    }

    static {
        zzQf = new zzc();
        zzQg = new 1();
        API = new Api("LocationServices.API", zzQg, zzQf);
        FusedLocationApi = new zzd();
        GeofencingApi = new zze();
        SettingsApi = new zzo();
    }

    public static zzj zze(GoogleApiClient googleApiClient) {
        boolean z = true;
        zzx.zzb(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        zzj com_google_android_gms_location_internal_zzj = (zzj) googleApiClient.zza(zzQf);
        if (com_google_android_gms_location_internal_zzj == null) {
            z = false;
        }
        zzx.zza(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return com_google_android_gms_location_internal_zzj;
    }

    static zzc zzvG() {
        return zzQf;
    }
}
