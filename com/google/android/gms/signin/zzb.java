package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.signin.internal.zzh;
import com.google.android.gms.signin.internal.zzi;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

public final class zzb {
    public static final Api API;
    public static final zzc zzQf;
    public static final zza zzQg;
    static final zza zzaNZ;
    public static final Scope zzaOa;
    public static final Scope zzaOb;
    public static final zzc zzaOc;
    public static final Api zzagz;
    public static final zzc zzanf;

    final class 1 extends zza {
        1() {
        }

        public com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zza(context, looper, com_google_android_gms_common_internal_zzf, (zze) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzi zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, zze com_google_android_gms_signin_zze, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzi(context, looper, true, com_google_android_gms_common_internal_zzf, com_google_android_gms_signin_zze, connectionCallbacks, onConnectionFailedListener, Executors.newSingleThreadExecutor());
        }

        public List zza(zze com_google_android_gms_signin_zze) {
            return Arrays.asList(new Scope[]{zzb.zzaOa, zzb.zzaOb});
        }

        public List zzl(Object obj) {
            return zza((zze) obj);
        }
    }

    final class 2 extends zza {
        2() {
        }

        public com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return zzt(context, looper, com_google_android_gms_common_internal_zzf, (NoOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }

        public zzi zzt(Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new zzi(context, looper, false, com_google_android_gms_common_internal_zzf, zze.zzaOd, connectionCallbacks, onConnectionFailedListener, Executors.newSingleThreadExecutor());
        }
    }

    static {
        zzQf = new zzc();
        zzanf = new zzc();
        zzQg = new 1();
        zzaNZ = new 2();
        zzaOa = new Scope("profile");
        zzaOb = new Scope("email");
        API = new Api("SignIn.API", zzQg, zzQf);
        zzagz = new Api("SignIn.INTERNAL_API", zzaNZ, zzanf);
        zzaOc = new zzh();
    }
}
