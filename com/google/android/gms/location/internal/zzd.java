package com.google.android.gms.location.internal;

import android.location.Location;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class zzd implements FusedLocationProviderApi {

    abstract class zza extends com.google.android.gms.location.LocationServices.zza {
        public zza(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Result zzb(Status status) {
            return zzd(status);
        }

        public Status zzd(Status status) {
            return status;
        }
    }

    class 1 extends zza {
        final LocationRequest zzaCA;
        final LocationListener zzaCB;
        final zzd zzaCC;

        1(zzd com_google_android_gms_location_internal_zzd, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            this.zzaCC = com_google_android_gms_location_internal_zzd;
            this.zzaCA = locationRequest;
            this.zzaCB = locationListener;
            super(googleApiClient);
        }

        protected void zza(zzb com_google_android_gms_common_api_Api_zzb) {
            zza((zzj) com_google_android_gms_common_api_Api_zzb);
        }

        protected void zza(zzj com_google_android_gms_location_internal_zzj) {
            com_google_android_gms_location_internal_zzj.zza(this.zzaCA, this.zzaCB, null);
            zza(Status.zzaaD);
        }
    }

    class 7 extends zza {
        final LocationListener zzaCB;
        final zzd zzaCC;

        7(zzd com_google_android_gms_location_internal_zzd, GoogleApiClient googleApiClient, LocationListener locationListener) {
            this.zzaCC = com_google_android_gms_location_internal_zzd;
            this.zzaCB = locationListener;
            super(googleApiClient);
        }

        protected void zza(zzb com_google_android_gms_common_api_Api_zzb) {
            zza((zzj) com_google_android_gms_common_api_Api_zzb);
        }

        protected void zza(zzj com_google_android_gms_location_internal_zzj) {
            com_google_android_gms_location_internal_zzj.zza(this.zzaCB);
            zza(Status.zzaaD);
        }
    }

    public Location getLastLocation(GoogleApiClient googleApiClient) {
        try {
            return LocationServices.zze(googleApiClient).getLastLocation();
        } catch (Exception e) {
            return null;
        }
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.zzb(new 7(this, googleApiClient, locationListener));
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        return googleApiClient.zzb(new 1(this, googleApiClient, locationRequest, locationListener));
    }
}
