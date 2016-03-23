package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.signin.zzb;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public interface GoogleApiClient {

    public final class Builder {
        private final Context mContext;
        private Account zzOY;
        private String zzQl;
        private Looper zzYV;
        private final Set zzYY;
        private int zzYZ;
        private View zzZa;
        private String zzZb;
        private final Map zzZc;
        private final Map zzZd;
        private FragmentActivity zzZe;
        private int zzZf;
        private int zzZg;
        private OnConnectionFailedListener zzZh;
        private GoogleApiAvailability zzZi;
        private com.google.android.gms.common.api.Api.zza zzZj;
        private final ArrayList zzZk;
        private final ArrayList zzZl;
        private com.google.android.gms.signin.zze.zza zzZm;

        class 1 implements Runnable {
            final GoogleApiClient zzVc;
            final Builder zzZn;

            1(Builder builder, GoogleApiClient googleApiClient) {
                this.zzZn = builder;
                this.zzVc = googleApiClient;
            }

            public void run() {
                if (!Builder.zza(this.zzZn).isFinishing() && !Builder.zza(this.zzZn).getSupportFragmentManager().isDestroyed()) {
                    Builder.zza(this.zzZn, zzp.zzb(Builder.zza(this.zzZn)), this.zzVc);
                }
            }
        }

        public Builder(Context context) {
            this.zzYY = new HashSet();
            this.zzZc = new zzld();
            this.zzZd = new zzld();
            this.zzZf = -1;
            this.zzZg = -1;
            this.zzZi = GoogleApiAvailability.getInstance();
            this.zzZj = zzb.zzQg;
            this.zzZk = new ArrayList();
            this.zzZl = new ArrayList();
            this.zzZm = new com.google.android.gms.signin.zze.zza();
            this.mContext = context;
            this.zzYV = context.getMainLooper();
            this.zzQl = context.getPackageName();
            this.zzZb = context.getClass().getName();
        }

        static FragmentActivity zza(Builder builder) {
            return builder.zzZe;
        }

        static void zza(Builder builder, zzp com_google_android_gms_common_api_zzp, GoogleApiClient googleApiClient) {
            builder.zza(com_google_android_gms_common_api_zzp, googleApiClient);
        }

        private void zza(zzp com_google_android_gms_common_api_zzp, GoogleApiClient googleApiClient) {
            com_google_android_gms_common_api_zzp.zza(this.zzZf, googleApiClient, this.zzZh);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.google.android.gms.common.api.GoogleApiClient zznj() {
            /*
            r11 = this;
            r0 = new com.google.android.gms.common.api.zzi;
            r1 = r11.mContext;
            r1 = r1.getApplicationContext();
            r2 = r11.zzYV;
            r3 = r11.zzni();
            r4 = r11.zzZi;
            r5 = r11.zzZj;
            r6 = r11.zzZd;
            r7 = r11.zzZk;
            r8 = r11.zzZl;
            r9 = r11.zzZf;
            r10 = -1;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
            r1 = r11.zzZe;
            r1 = com.google.android.gms.common.api.zzp.zza(r1);
            if (r1 != 0) goto L_0x003d;
        L_0x0026:
            r2 = new android.os.Handler;
            r3 = r11.mContext;
            r3 = r3.getMainLooper();
            r2.<init>(r3);
            r3 = new com.google.android.gms.common.api.GoogleApiClient$Builder$1;
            r3.<init>(r11, r0);
            r2.post(r3);
            r2 = com.google.android.gms.common.api.Api.a;
            if (r2 == 0) goto L_0x0040;
        L_0x003d:
            r11.zza(r1, r0);
        L_0x0040:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiClient.Builder.zznj():com.google.android.gms.common.api.GoogleApiClient");
        }

        private GoogleApiClient zznk() {
            zzq zzc = zzq.zzc(this.zzZe);
            GoogleApiClient zzbj = zzc.zzbj(this.zzZg);
            if (zzbj == null) {
                zzbj = new zzi(this.mContext.getApplicationContext(), this.zzYV, zzni(), this.zzZi, this.zzZj, this.zzZd, this.zzZk, this.zzZl, -1, this.zzZg);
            }
            zzc.zza(this.zzZg, zzbj, this.zzZh);
            return zzbj;
        }

        public Builder addApi(Api api) {
            this.zzZd.put(api, null);
            this.zzYY.addAll(api.zznb().zzl(null));
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            this.zzZk.add(connectionCallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            this.zzZl.add(onConnectionFailedListener);
            return this;
        }

        public GoogleApiClient build() {
            zzx.zzb(!this.zzZd.isEmpty(), (Object) "must call addApi() to add at least one API");
            return this.zzZf >= 0 ? zznj() : this.zzZg >= 0 ? zznk() : new zzi(this.mContext, this.zzYV, zzni(), this.zzZi, this.zzZj, this.zzZd, this.zzZk, this.zzZl, -1, -1);
        }

        public zzf zzni() {
            return new zzf(this.zzOY, this.zzYY, this.zzZc, this.zzYZ, this.zzZa, this.zzQl, this.zzZb, this.zzZm.zzzr());
        }
    }

    public interface ConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public interface ServerAuthCodeCallbacks {

        public class CheckResult {
            private boolean zzZo;
            private Set zzZp;

            public boolean zznl() {
                return this.zzZo;
            }

            public Set zznm() {
                return this.zzZp;
            }
        }

        CheckResult onCheckServerAuthorization(String str, Set set);

        boolean onUploadServerAuthCode(String str, String str2);
    }

    public interface zza {
        void zza(ConnectionResult connectionResult);

        void zzb(ConnectionResult connectionResult);
    }

    void connect();

    void disconnect();

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    Looper getLooper();

    boolean isConnected();

    boolean isConnecting();

    void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    Api.zzb zza(zzc com_google_android_gms_common_api_Api_zzc);

    com.google.android.gms.common.api.zzc.zza zza(com.google.android.gms.common.api.zzc.zza com_google_android_gms_common_api_zzc_zza);

    com.google.android.gms.common.api.zzc.zza zzb(com.google.android.gms.common.api.zzc.zza com_google_android_gms_common_api_zzc_zza);
}
