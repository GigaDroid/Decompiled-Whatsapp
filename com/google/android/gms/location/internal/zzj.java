package com.google.android.gms.location.internal;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import com.google.android.gms.location.copresence.internal.zzb;

public class zzj extends zzb {
    public static boolean b;
    private final zzi zzaCQ;
    private final zzb zzaCR;

    public zzj(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzf com_google_android_gms_common_internal_zzf) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, str, com_google_android_gms_common_internal_zzf, CopresenceApiOptions.zzaCp);
    }

    public zzj(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, zzf com_google_android_gms_common_internal_zzf, CopresenceApiOptions copresenceApiOptions) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, com_google_android_gms_common_internal_zzf);
        this.zzaCQ = new zzi(context, this.zzaCs);
        this.zzaCR = zzb.zza(context, com_google_android_gms_common_internal_zzf.getAccountName(), com_google_android_gms_common_internal_zzf.zzol(), this.zzaCs, copresenceApiOptions);
    }

    public void disconnect() {
        synchronized (this.zzaCQ) {
            if (isConnected()) {
                try {
                    this.zzaCQ.removeAllListeners();
                    this.zzaCQ.zzvR();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    public Location getLastLocation() {
        return this.zzaCQ.getLastLocation();
    }

    public void zza(LocationListener locationListener) {
        this.zzaCQ.zza(locationListener);
    }

    public void zza(LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        synchronized (this.zzaCQ) {
            this.zzaCQ.zza(locationRequest, locationListener, looper);
        }
    }

    public boolean zzoC() {
        return true;
    }
}
