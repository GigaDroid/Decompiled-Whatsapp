package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api {
    public static boolean a;
    private final String mName;
    private final zzc zzXW;
    private final zza zzYL;
    private final zze zzYM;
    private final zzf zzYN;

    public interface ApiOptions {

        public interface HasOptions extends ApiOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
            }
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    public abstract class zza {
        public int getPriority() {
            return Integer.MAX_VALUE;
        }

        public abstract zzb zza(Context context, Looper looper, com.google.android.gms.common.internal.zzf com_google_android_gms_common_internal_zzf, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener);

        public List zzl(Object obj) {
            return Collections.emptyList();
        }
    }

    public interface zzb {
        void disconnect();

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean isConnected();

        void zza(com.google.android.gms.common.api.GoogleApiClient.zza com_google_android_gms_common_api_GoogleApiClient_zza);

        void zza(zzp com_google_android_gms_common_internal_zzp);

        void zza(zzp com_google_android_gms_common_internal_zzp, Set set);

        boolean zzlm();
    }

    public final class zzc {
    }

    public interface zzd {
        IInterface zzV(IBinder iBinder);

        void zza(int i, IInterface iInterface);

        String zzfA();

        String zzfB();
    }

    public interface zze {
        zzd zzm(Object obj);

        int zznf();
    }

    public final class zzf {
    }

    public Api(String str, zza com_google_android_gms_common_api_Api_zza, zzc com_google_android_gms_common_api_Api_zzc) {
        zzx.zzb((Object) com_google_android_gms_common_api_Api_zza, (Object) "Cannot construct an Api with a null ClientBuilder");
        zzx.zzb((Object) com_google_android_gms_common_api_Api_zzc, (Object) "Cannot construct an Api with a null ClientKey");
        this.mName = str;
        this.zzYL = com_google_android_gms_common_api_Api_zza;
        this.zzYM = null;
        this.zzXW = com_google_android_gms_common_api_Api_zzc;
        this.zzYN = null;
    }

    public String getName() {
        return this.mName;
    }

    public zza zznb() {
        zzx.zza(this.zzYL != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.zzYL;
    }

    public zze zznc() {
        zzx.zza(this.zzYM != null, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return this.zzYM;
    }

    public zzc zznd() {
        zzx.zza(this.zzXW != null, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return this.zzXW;
    }

    public boolean zzne() {
        return this.zzYN != null;
    }
}
