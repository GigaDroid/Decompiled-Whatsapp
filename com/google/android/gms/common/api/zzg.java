package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import org.v;
import org.whispersystems.at;

public class zzg implements zzj {
    private final Context mContext;
    private com.google.android.gms.signin.zzd zzZA;
    private int zzZB;
    private boolean zzZC;
    private boolean zzZD;
    private zzp zzZE;
    private boolean zzZF;
    private boolean zzZG;
    private final com.google.android.gms.common.internal.zzf zzZH;
    private final Map zzZI;
    private ArrayList zzZJ;
    private final GoogleApiAvailability zzZi;
    private final com.google.android.gms.common.api.Api.zza zzZj;
    private final zzi zzZq;
    private final Lock zzZs;
    private ConnectionResult zzZt;
    private int zzZu;
    private int zzZv;
    private boolean zzZw;
    private int zzZx;
    private final Bundle zzZy;
    private final Set zzZz;

    class 1 implements Runnable {
        final zzg zzZK;

        1(zzg com_google_android_gms_common_api_zzg) {
            this.zzZK = com_google_android_gms_common_api_zzg;
        }

        public void run() {
            zzg.zzb(this.zzZK).zzac(zzg.zza(this.zzZK));
        }
    }

    class zza extends com.google.android.gms.signin.internal.zzb {
        private final WeakReference zzZL;

        class 1 extends zzb {
            final zzg zzZM;
            final ConnectionResult zzZN;
            final zza zzZO;

            1(zza com_google_android_gms_common_api_zzg_zza, zzj com_google_android_gms_common_api_zzj, zzg com_google_android_gms_common_api_zzg, ConnectionResult connectionResult) {
                this.zzZO = com_google_android_gms_common_api_zzg_zza;
                this.zzZM = com_google_android_gms_common_api_zzg;
                this.zzZN = connectionResult;
                super(com_google_android_gms_common_api_zzj);
            }

            public void zznn() {
                zzg.zzc(this.zzZM, this.zzZN);
            }
        }

        zza(zzg com_google_android_gms_common_api_zzg) {
            this.zzZL = new WeakReference(com_google_android_gms_common_api_zzg);
        }

        public void zza(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
            zzg com_google_android_gms_common_api_zzg = (zzg) this.zzZL.get();
            if (com_google_android_gms_common_api_zzg != null) {
                zzg.zzd(com_google_android_gms_common_api_zzg).zza(new 1(this, com_google_android_gms_common_api_zzg, com_google_android_gms_common_api_zzg, connectionResult));
            }
        }
    }

    class zzb extends com.google.android.gms.common.internal.zzt.zza {
        private final WeakReference zzZL;

        class 1 extends zzb {
            final zzg zzZM;
            final ResolveAccountResponse zzZP;
            final zzb zzZQ;

            1(zzb com_google_android_gms_common_api_zzg_zzb, zzj com_google_android_gms_common_api_zzj, zzg com_google_android_gms_common_api_zzg, ResolveAccountResponse resolveAccountResponse) {
                this.zzZQ = com_google_android_gms_common_api_zzg_zzb;
                this.zzZM = com_google_android_gms_common_api_zzg;
                this.zzZP = resolveAccountResponse;
                super(com_google_android_gms_common_api_zzj);
            }

            public void zznn() {
                zzg.zza(this.zzZM, this.zzZP);
            }
        }

        zzb(zzg com_google_android_gms_common_api_zzg) {
            this.zzZL = new WeakReference(com_google_android_gms_common_api_zzg);
        }

        public void zzb(ResolveAccountResponse resolveAccountResponse) {
            zzg com_google_android_gms_common_api_zzg = (zzg) this.zzZL.get();
            if (com_google_android_gms_common_api_zzg != null) {
                zzg.zzd(com_google_android_gms_common_api_zzg).zza(new 1(this, com_google_android_gms_common_api_zzg, com_google_android_gms_common_api_zzg, resolveAccountResponse));
            }
        }
    }

    abstract class zzi implements Runnable {
        final zzg zzZK;

        private zzi(zzg com_google_android_gms_common_api_zzg) {
            this.zzZK = com_google_android_gms_common_api_zzg;
        }

        zzi(zzg com_google_android_gms_common_api_zzg, 1 1) {
            this(com_google_android_gms_common_api_zzg);
        }

        public void run() {
            zzg.zzc(this.zzZK).lock();
            try {
                if (!Thread.interrupted()) {
                    zznn();
                    zzg.zzc(this.zzZK).unlock();
                }
            } catch (RuntimeException e) {
                zzg.zzd(this.zzZK).zza(e);
            } finally {
                zzg.zzc(this.zzZK).unlock();
            }
        }

        protected abstract void zznn();
    }

    class zzc extends zzi {
        final zzg zzZK;

        private zzc(zzg com_google_android_gms_common_api_zzg) {
            this.zzZK = com_google_android_gms_common_api_zzg;
            super(com_google_android_gms_common_api_zzg, null);
        }

        zzc(zzg com_google_android_gms_common_api_zzg, 1 1) {
            this(com_google_android_gms_common_api_zzg);
        }

        public void zznn() {
            zzg.zzf(this.zzZK).zza(zzg.zzg(this.zzZK), zzg.zzd(this.zzZK).zzaah, new zza(this.zzZK));
        }
    }

    class zzd implements com.google.android.gms.common.api.GoogleApiClient.zza {
        private final WeakReference zzZL;
        private final Api zzZR;
        private final int zzZS;

        public zzd(zzg com_google_android_gms_common_api_zzg, Api api, int i) {
            this.zzZL = new WeakReference(com_google_android_gms_common_api_zzg);
            this.zzZR = api;
            this.zzZS = i;
        }

        public void zza(ConnectionResult connectionResult) {
            boolean z = false;
            zzg com_google_android_gms_common_api_zzg = (zzg) this.zzZL.get();
            if (com_google_android_gms_common_api_zzg != null) {
                if (Looper.myLooper() == zzg.zzd(com_google_android_gms_common_api_zzg).getLooper()) {
                    z = true;
                }
                zzx.zza(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
                zzg.zzc(com_google_android_gms_common_api_zzg).lock();
                try {
                    if (zzg.zza(com_google_android_gms_common_api_zzg, 0)) {
                        if (!connectionResult.isSuccess()) {
                            zzg.zza(com_google_android_gms_common_api_zzg, connectionResult, this.zzZR, this.zzZS);
                        }
                        if (zzg.zzk(com_google_android_gms_common_api_zzg)) {
                            zzg.zzl(com_google_android_gms_common_api_zzg);
                        }
                        zzg.zzc(com_google_android_gms_common_api_zzg).unlock();
                    }
                } finally {
                    zzg.zzc(com_google_android_gms_common_api_zzg).unlock();
                }
            }
        }

        public void zzb(ConnectionResult connectionResult) {
            boolean z = true;
            zzg com_google_android_gms_common_api_zzg = (zzg) this.zzZL.get();
            if (com_google_android_gms_common_api_zzg != null) {
                if (Looper.myLooper() != zzg.zzd(com_google_android_gms_common_api_zzg).getLooper()) {
                    z = false;
                }
                zzx.zza(z, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
                zzg.zzc(com_google_android_gms_common_api_zzg).lock();
                try {
                    if (zzg.zza(com_google_android_gms_common_api_zzg, 1)) {
                        if (!connectionResult.isSuccess()) {
                            zzg.zza(com_google_android_gms_common_api_zzg, connectionResult, this.zzZR, this.zzZS);
                        }
                        if (zzg.zzk(com_google_android_gms_common_api_zzg)) {
                            zzg.zzm(com_google_android_gms_common_api_zzg);
                        }
                        zzg.zzc(com_google_android_gms_common_api_zzg).unlock();
                    }
                } finally {
                    zzg.zzc(com_google_android_gms_common_api_zzg).unlock();
                }
            }
        }
    }

    class zze extends zzi {
        final zzg zzZK;
        private final Map zzZT;

        class 1 extends zzb {
            final ConnectionResult zzZU;
            final zze zzZV;

            1(zze com_google_android_gms_common_api_zzg_zze, zzj com_google_android_gms_common_api_zzj, ConnectionResult connectionResult) {
                this.zzZV = com_google_android_gms_common_api_zzg_zze;
                this.zzZU = connectionResult;
                super(com_google_android_gms_common_api_zzj);
            }

            public void zznn() {
                zzg.zza(this.zzZV.zzZK, this.zzZU);
            }
        }

        public zze(zzg com_google_android_gms_common_api_zzg, Map map) {
            this.zzZK = com_google_android_gms_common_api_zzg;
            super(com_google_android_gms_common_api_zzg, null);
            this.zzZT = map;
        }

        public void zznn() {
            boolean z = Api.a;
            int isGooglePlayServicesAvailable = zzg.zzb(this.zzZK).isGooglePlayServicesAvailable(zzg.zza(this.zzZK));
            if (isGooglePlayServicesAvailable != 0) {
                zzg.zzd(this.zzZK).zza(new 1(this, this.zzZK, new ConnectionResult(isGooglePlayServicesAvailable, null)));
                return;
            }
            if (zzg.zze(this.zzZK)) {
                zzg.zzf(this.zzZK).connect();
            }
            for (com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb : this.zzZT.keySet()) {
                com_google_android_gms_common_api_Api_zzb.zza((com.google.android.gms.common.api.GoogleApiClient.zza) this.zzZT.get(com_google_android_gms_common_api_Api_zzb));
                if (z) {
                    return;
                }
            }
        }
    }

    class zzf extends zzi {
        final zzg zzZK;
        private final ArrayList zzZW;

        public zzf(zzg com_google_android_gms_common_api_zzg, ArrayList arrayList) {
            this.zzZK = com_google_android_gms_common_api_zzg;
            super(com_google_android_gms_common_api_zzg, null);
            this.zzZW = arrayList;
        }

        public void zznn() {
            boolean z = Api.a;
            Set set = zzg.zzd(this.zzZK).zzaah;
            Set zzh = set.isEmpty() ? zzg.zzh(this.zzZK) : set;
            Iterator it = this.zzZW.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.common.api.Api.zzb) it.next()).zza(zzg.zzg(this.zzZK), zzh);
                if (z) {
                    return;
                }
            }
        }
    }

    class zzg implements ConnectionCallbacks, OnConnectionFailedListener {
        final zzg zzZK;

        private zzg(zzg com_google_android_gms_common_api_zzg) {
            this.zzZK = com_google_android_gms_common_api_zzg;
        }

        zzg(zzg com_google_android_gms_common_api_zzg, 1 1) {
            this(com_google_android_gms_common_api_zzg);
        }

        public void onConnected(Bundle bundle) {
            zzg.zzf(this.zzZK).zza(new zzb(this.zzZK));
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onConnectionFailed(com.google.android.gms.common.ConnectionResult r3) {
            /*
            r2 = this;
            r0 = r2.zzZK;
            r0 = com.google.android.gms.common.api.zzg.zzc(r0);
            r0.lock();
            r0 = r2.zzZK;	 Catch:{ all -> 0x002e }
            r0 = com.google.android.gms.common.api.zzg.zzb(r0, r3);	 Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x001f;
        L_0x0011:
            r0 = r2.zzZK;	 Catch:{ all -> 0x002e }
            com.google.android.gms.common.api.zzg.zzi(r0);	 Catch:{ all -> 0x002e }
            r0 = r2.zzZK;	 Catch:{ all -> 0x002e }
            com.google.android.gms.common.api.zzg.zzj(r0);	 Catch:{ all -> 0x002e }
            r0 = com.google.android.gms.common.api.Api.a;	 Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0024;
        L_0x001f:
            r0 = r2.zzZK;	 Catch:{ all -> 0x002e }
            com.google.android.gms.common.api.zzg.zza(r0, r3);	 Catch:{ all -> 0x002e }
        L_0x0024:
            r0 = r2.zzZK;
            r0 = com.google.android.gms.common.api.zzg.zzc(r0);
            r0.unlock();
            return;
        L_0x002e:
            r0 = move-exception;
            r1 = r2.zzZK;
            r1 = com.google.android.gms.common.api.zzg.zzc(r1);
            r1.unlock();
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzg.zzg.onConnectionFailed(com.google.android.gms.common.ConnectionResult):void");
        }

        public void onConnectionSuspended(int i) {
        }
    }

    class zzh extends zzi {
        final zzg zzZK;
        private final ArrayList zzZW;

        public zzh(zzg com_google_android_gms_common_api_zzg, ArrayList arrayList) {
            this.zzZK = com_google_android_gms_common_api_zzg;
            super(com_google_android_gms_common_api_zzg, null);
            this.zzZW = arrayList;
        }

        public void zznn() {
            boolean z = Api.a;
            Iterator it = this.zzZW.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.common.api.Api.zzb) it.next()).zza(zzg.zzg(this.zzZK));
                if (z) {
                    return;
                }
            }
        }
    }

    public zzg(zzi com_google_android_gms_common_api_zzi, com.google.android.gms.common.internal.zzf com_google_android_gms_common_internal_zzf, Map map, GoogleApiAvailability googleApiAvailability, com.google.android.gms.common.api.Api.zza com_google_android_gms_common_api_Api_zza, Lock lock, Context context) {
        this.zzZv = 0;
        this.zzZw = false;
        this.zzZy = new Bundle();
        this.zzZz = new HashSet();
        this.zzZJ = new ArrayList();
        this.zzZq = com_google_android_gms_common_api_zzi;
        this.zzZH = com_google_android_gms_common_internal_zzf;
        this.zzZI = map;
        this.zzZi = googleApiAvailability;
        this.zzZj = com_google_android_gms_common_api_Api_zza;
        this.zzZs = lock;
        this.mContext = context;
    }

    private void zzX(boolean z) {
        try {
            if (this.zzZA != null) {
                if (this.zzZA.isConnected() && z) {
                    try {
                        this.zzZA.zzzn();
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                this.zzZA.disconnect();
                this.zzZE = null;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static Context zza(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.mContext;
    }

    static void zza(zzg com_google_android_gms_common_api_zzg, ConnectionResult connectionResult) {
        com_google_android_gms_common_api_zzg.zzf(connectionResult);
    }

    static void zza(zzg com_google_android_gms_common_api_zzg, ConnectionResult connectionResult, Api api, int i) {
        com_google_android_gms_common_api_zzg.zzb(connectionResult, api, i);
    }

    static void zza(zzg com_google_android_gms_common_api_zzg, ResolveAccountResponse resolveAccountResponse) {
        com_google_android_gms_common_api_zzg.zza(resolveAccountResponse);
    }

    private void zza(ResolveAccountResponse resolveAccountResponse) {
        boolean z = Api.a;
        try {
            if (zzbe(0)) {
                ConnectionResult zzoP = resolveAccountResponse.zzoP();
                try {
                    if (zzoP.isSuccess()) {
                        this.zzZE = resolveAccountResponse.zzoO();
                        this.zzZD = true;
                        this.zzZF = resolveAccountResponse.zzoQ();
                        this.zzZG = resolveAccountResponse.zzoR();
                        zznp();
                        if (!z) {
                            return;
                        }
                    }
                    try {
                        if (zze(zzoP)) {
                            try {
                                zznu();
                                zznp();
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        zzf(zzoP);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    private boolean zza(int i, int i2, ConnectionResult connectionResult) {
        if (i2 == 1) {
            try {
                if (!zzd(connectionResult)) {
                    return false;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (this.zzZt != null) {
                if (i >= this.zzZu) {
                    return false;
                }
            }
            return true;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static boolean zza(zzg com_google_android_gms_common_api_zzg, int i) {
        return com_google_android_gms_common_api_zzg.zzbe(i);
    }

    static GoogleApiAvailability zzb(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.zzZi;
    }

    private void zzb(ConnectionResult connectionResult, Api api, int i) {
        if (i != 2) {
            int priority = api.zznb().getPriority();
            try {
                if (zza(priority, i, connectionResult)) {
                    this.zzZt = connectionResult;
                    this.zzZu = priority;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.zzZq.zzaag.put(api.zznd(), connectionResult);
    }

    static boolean zzb(zzg com_google_android_gms_common_api_zzg, ConnectionResult connectionResult) {
        return com_google_android_gms_common_api_zzg.zze(connectionResult);
    }

    private boolean zzbe(int i) {
        try {
            if (this.zzZv == i) {
                return true;
            }
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + zzbf(this.zzZv) + " but received callback for step " + zzbf(i));
            zzf(new ConnectionResult(8, null));
            return false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private String zzbf(int i) {
        switch (i) {
            case v.m /*0*/:
                try {
                    return "STEP_GETTING_SERVICE_BINDINGS";
                } catch (IllegalStateException e) {
                    throw e;
                }
            case at.g /*1*/:
                return "STEP_VALIDATING_ACCOUNT";
            case at.i /*2*/:
                return "STEP_AUTHENTICATING";
            case at.o /*3*/:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    static Lock zzc(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.zzZs;
    }

    private void zzc(ConnectionResult connectionResult) {
        boolean z = Api.a;
        try {
            if (zzbe(2)) {
                try {
                    if (connectionResult.isSuccess()) {
                        zzns();
                        if (!z) {
                            return;
                        }
                    }
                    try {
                        if (zze(connectionResult)) {
                            try {
                                zznu();
                                zzns();
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        zzf(connectionResult);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    static void zzc(zzg com_google_android_gms_common_api_zzg, ConnectionResult connectionResult) {
        com_google_android_gms_common_api_zzg.zzc(connectionResult);
    }

    static zzi zzd(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.zzZq;
    }

    private boolean zzd(ConnectionResult connectionResult) {
        try {
            if (connectionResult.hasResolution()) {
                return true;
            }
            try {
                return this.zzZi.zzbb(connectionResult.getErrorCode()) != null;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private boolean zze(ConnectionResult connectionResult) {
        try {
            if (this.zzZB == 2) {
                return true;
            }
            if (this.zzZB == 1) {
                try {
                    if (!connectionResult.hasResolution()) {
                        return true;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return false;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static boolean zze(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.zzZC;
    }

    static com.google.android.gms.signin.zzd zzf(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.zzZA;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zzf(com.google.android.gms.common.ConnectionResult r4) {
        /*
        r3 = this;
        r0 = 0;
        r1 = 0;
        r3.zzZw = r1;	 Catch:{ IllegalStateException -> 0x0047 }
        r3.zznv();	 Catch:{ IllegalStateException -> 0x0047 }
        r1 = r4.hasResolution();	 Catch:{ IllegalStateException -> 0x0047 }
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        r0 = 1;
    L_0x000e:
        r3.zzX(r0);	 Catch:{ IllegalStateException -> 0x0049 }
        r0 = r3.zzZq;	 Catch:{ IllegalStateException -> 0x0049 }
        r0 = r0.zzaag;	 Catch:{ IllegalStateException -> 0x0049 }
        r0.clear();	 Catch:{ IllegalStateException -> 0x0049 }
        r0 = r3.zzZq;	 Catch:{ IllegalStateException -> 0x0049 }
        r0.zzg(r4);	 Catch:{ IllegalStateException -> 0x0049 }
        r0 = r3.zzZq;	 Catch:{ IllegalStateException -> 0x0049 }
        r0 = r0.zznB();	 Catch:{ IllegalStateException -> 0x0049 }
        if (r0 == 0) goto L_0x0033;
    L_0x0025:
        r0 = r3.zzZi;	 Catch:{ IllegalStateException -> 0x004b }
        r1 = r3.mContext;	 Catch:{ IllegalStateException -> 0x004b }
        r2 = r4.getErrorCode();	 Catch:{ IllegalStateException -> 0x004b }
        r0 = r0.zzd(r1, r2);	 Catch:{ IllegalStateException -> 0x004b }
        if (r0 != 0) goto L_0x003f;
    L_0x0033:
        r0 = r3.zzZq;	 Catch:{ IllegalStateException -> 0x004b }
        r0.zznE();	 Catch:{ IllegalStateException -> 0x004b }
        r0 = r3.zzZq;	 Catch:{ IllegalStateException -> 0x004b }
        r0 = r0.zzZY;	 Catch:{ IllegalStateException -> 0x004b }
        r0.zzj(r4);	 Catch:{ IllegalStateException -> 0x004b }
    L_0x003f:
        r0 = r3.zzZq;
        r0 = r0.zzZY;
        r0.zzoI();
        return;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzg.zzf(com.google.android.gms.common.ConnectionResult):void");
    }

    static zzp zzg(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.zzZE;
    }

    static Set zzh(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.zznw();
    }

    static void zzi(zzg com_google_android_gms_common_api_zzg) {
        com_google_android_gms_common_api_zzg.zznu();
    }

    static void zzj(zzg com_google_android_gms_common_api_zzg) {
        com_google_android_gms_common_api_zzg.zzns();
    }

    static boolean zzk(zzg com_google_android_gms_common_api_zzg) {
        return com_google_android_gms_common_api_zzg.zzno();
    }

    static void zzl(zzg com_google_android_gms_common_api_zzg) {
        com_google_android_gms_common_api_zzg.zznp();
    }

    static void zzm(zzg com_google_android_gms_common_api_zzg) {
        com_google_android_gms_common_api_zzg.zznr();
    }

    private boolean zzno() {
        try {
            this.zzZx--;
            if (this.zzZx > 0) {
                return false;
            }
            try {
                if (this.zzZx < 0) {
                    Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
                    zzf(new ConnectionResult(8, null));
                    return false;
                }
                try {
                    if (this.zzZt == null) {
                        return true;
                    }
                    zzf(this.zzZt);
                    return false;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private void zznp() {
        try {
            if (this.zzZx == 0) {
                try {
                    if (this.zzZC) {
                        if (this.zzZD) {
                            try {
                                zznq();
                                if (!Api.a) {
                                    return;
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        return;
                    }
                    zzns();
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zznq() {
        /*
        r5 = this;
        r1 = com.google.android.gms.common.api.Api.a;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = 1;
        r5.zzZv = r0;
        r0 = r5.zzZq;
        r0 = r0.zzaaf;
        r0 = r0.size();
        r5.zzZx = r0;
        r0 = r5.zzZq;
        r0 = r0.zzaaf;
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x0020:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x004e;
    L_0x0026:
        r0 = r3.next();
        r0 = (com.google.android.gms.common.api.Api.zzc) r0;
        r4 = r5.zzZq;	 Catch:{ IllegalStateException -> 0x0067 }
        r4 = r4.zzaag;	 Catch:{ IllegalStateException -> 0x0067 }
        r4 = r4.containsKey(r0);	 Catch:{ IllegalStateException -> 0x0067 }
        if (r4 == 0) goto L_0x0041;
    L_0x0036:
        r4 = r5.zzno();	 Catch:{ IllegalStateException -> 0x0069 }
        if (r4 == 0) goto L_0x004c;
    L_0x003c:
        r5.zznr();	 Catch:{ IllegalStateException -> 0x006b }
        if (r1 == 0) goto L_0x004c;
    L_0x0041:
        r4 = r5.zzZq;	 Catch:{ IllegalStateException -> 0x006b }
        r4 = r4.zzaaf;	 Catch:{ IllegalStateException -> 0x006b }
        r0 = r4.get(r0);	 Catch:{ IllegalStateException -> 0x006b }
        r2.add(r0);	 Catch:{ IllegalStateException -> 0x006b }
    L_0x004c:
        if (r1 == 0) goto L_0x0020;
    L_0x004e:
        r0 = r2.isEmpty();	 Catch:{ IllegalStateException -> 0x006d }
        if (r0 != 0) goto L_0x0066;
    L_0x0054:
        r0 = r5.zzZJ;	 Catch:{ IllegalStateException -> 0x006d }
        r1 = com.google.android.gms.common.api.zzk.zznF();	 Catch:{ IllegalStateException -> 0x006d }
        r3 = new com.google.android.gms.common.api.zzg$zzh;	 Catch:{ IllegalStateException -> 0x006d }
        r3.<init>(r5, r2);	 Catch:{ IllegalStateException -> 0x006d }
        r1 = r1.submit(r3);	 Catch:{ IllegalStateException -> 0x006d }
        r0.add(r1);	 Catch:{ IllegalStateException -> 0x006d }
    L_0x0066:
        return;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzg.zznq():void");
    }

    private void zznr() {
        this.zzZv = 2;
        this.zzZq.zzaah = zznw();
        this.zzZJ.add(zzk.zznF().submit(new zzc(this, null)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zzns() {
        /*
        r5 = this;
        r1 = com.google.android.gms.common.api.Api.a;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = 3;
        r5.zzZv = r0;
        r0 = r5.zzZq;
        r0 = r0.zzaaf;
        r0 = r0.size();
        r5.zzZx = r0;
        r0 = r5.zzZq;
        r0 = r0.zzaaf;
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x0020:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x004e;
    L_0x0026:
        r0 = r3.next();
        r0 = (com.google.android.gms.common.api.Api.zzc) r0;
        r4 = r5.zzZq;	 Catch:{ IllegalStateException -> 0x0067 }
        r4 = r4.zzaag;	 Catch:{ IllegalStateException -> 0x0067 }
        r4 = r4.containsKey(r0);	 Catch:{ IllegalStateException -> 0x0067 }
        if (r4 == 0) goto L_0x0041;
    L_0x0036:
        r4 = r5.zzno();	 Catch:{ IllegalStateException -> 0x0069 }
        if (r4 == 0) goto L_0x004c;
    L_0x003c:
        r5.zznt();	 Catch:{ IllegalStateException -> 0x006b }
        if (r1 == 0) goto L_0x004c;
    L_0x0041:
        r4 = r5.zzZq;	 Catch:{ IllegalStateException -> 0x006b }
        r4 = r4.zzaaf;	 Catch:{ IllegalStateException -> 0x006b }
        r0 = r4.get(r0);	 Catch:{ IllegalStateException -> 0x006b }
        r2.add(r0);	 Catch:{ IllegalStateException -> 0x006b }
    L_0x004c:
        if (r1 == 0) goto L_0x0020;
    L_0x004e:
        r0 = r2.isEmpty();	 Catch:{ IllegalStateException -> 0x006d }
        if (r0 != 0) goto L_0x0066;
    L_0x0054:
        r0 = r5.zzZJ;	 Catch:{ IllegalStateException -> 0x006d }
        r1 = com.google.android.gms.common.api.zzk.zznF();	 Catch:{ IllegalStateException -> 0x006d }
        r3 = new com.google.android.gms.common.api.zzg$zzf;	 Catch:{ IllegalStateException -> 0x006d }
        r3.<init>(r5, r2);	 Catch:{ IllegalStateException -> 0x006d }
        r1 = r1.submit(r3);	 Catch:{ IllegalStateException -> 0x006d }
        r0.add(r1);	 Catch:{ IllegalStateException -> 0x006d }
    L_0x0066:
        return;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzg.zzns():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zznt() {
        /*
        r5 = this;
        r4 = 0;
        r1 = com.google.android.gms.common.api.Api.a;
        r0 = r5.zzZq;	 Catch:{ IllegalStateException -> 0x006c }
        r0.zznA();	 Catch:{ IllegalStateException -> 0x006c }
        r0 = com.google.android.gms.common.api.zzk.zznF();	 Catch:{ IllegalStateException -> 0x006c }
        r2 = new com.google.android.gms.common.api.zzg$1;	 Catch:{ IllegalStateException -> 0x006c }
        r2.<init>(r5);	 Catch:{ IllegalStateException -> 0x006c }
        r0.execute(r2);	 Catch:{ IllegalStateException -> 0x006c }
        r0 = r5.zzZA;	 Catch:{ IllegalStateException -> 0x006c }
        if (r0 == 0) goto L_0x0028;
    L_0x0018:
        r0 = r5.zzZF;	 Catch:{ IllegalStateException -> 0x006e }
        if (r0 == 0) goto L_0x0025;
    L_0x001c:
        r0 = r5.zzZA;	 Catch:{ IllegalStateException -> 0x006e }
        r2 = r5.zzZE;	 Catch:{ IllegalStateException -> 0x006e }
        r3 = r5.zzZG;	 Catch:{ IllegalStateException -> 0x006e }
        r0.zza(r2, r3);	 Catch:{ IllegalStateException -> 0x006e }
    L_0x0025:
        r5.zzX(r4);
    L_0x0028:
        r0 = r5.zzZq;
        r0 = r0.zzaag;
        r0 = r0.keySet();
        r2 = r0.iterator();
    L_0x0034:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x004f;
    L_0x003a:
        r0 = r2.next();
        r0 = (com.google.android.gms.common.api.Api.zzc) r0;
        r3 = r5.zzZq;
        r3 = r3.zzaaf;
        r0 = r3.get(r0);
        r0 = (com.google.android.gms.common.api.Api.zzb) r0;
        r0.disconnect();
        if (r1 == 0) goto L_0x0034;
    L_0x004f:
        r0 = r5.zzZw;	 Catch:{ IllegalStateException -> 0x0070 }
        if (r0 == 0) goto L_0x005b;
    L_0x0053:
        r0 = 0;
        r5.zzZw = r0;	 Catch:{ IllegalStateException -> 0x0072 }
        r5.disconnect();	 Catch:{ IllegalStateException -> 0x0072 }
        if (r1 == 0) goto L_0x006b;
    L_0x005b:
        r0 = r5.zzZy;	 Catch:{ IllegalStateException -> 0x0074 }
        r0 = r0.isEmpty();	 Catch:{ IllegalStateException -> 0x0074 }
        if (r0 == 0) goto L_0x0076;
    L_0x0063:
        r0 = 0;
    L_0x0064:
        r1 = r5.zzZq;
        r1 = r1.zzZY;
        r1.zzh(r0);
    L_0x006b:
        return;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r0 = r5.zzZy;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzg.zznt():void");
    }

    private void zznu() {
        boolean z = Api.a;
        this.zzZC = false;
        this.zzZq.zzaah = Collections.emptySet();
        for (com.google.android.gms.common.api.Api.zzc com_google_android_gms_common_api_Api_zzc : this.zzZz) {
            try {
                if (!this.zzZq.zzaag.containsKey(com_google_android_gms_common_api_Api_zzc)) {
                    this.zzZq.zzaag.put(com_google_android_gms_common_api_Api_zzc, new ConnectionResult(17, null));
                    continue;
                }
                if (z) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    private void zznv() {
        boolean z = Api.a;
        Iterator it = this.zzZJ.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
            if (z) {
                break;
            }
        }
        this.zzZJ.clear();
    }

    private Set zznw() {
        boolean z = Api.a;
        Set hashSet = new HashSet(this.zzZH.zzoi());
        Map zzok = this.zzZH.zzok();
        for (Api api : zzok.keySet()) {
            try {
                if (!this.zzZq.zzaag.containsKey(api.zznd())) {
                    hashSet.addAll(((com.google.android.gms.common.internal.zzf.zza) zzok.get(api)).zzZp);
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return hashSet;
    }

    public void begin() {
        int i;
        boolean z = false;
        boolean z2 = Api.a;
        this.zzZq.zzZY.zzoJ();
        this.zzZq.zzaag.clear();
        this.zzZw = false;
        this.zzZC = false;
        this.zzZt = null;
        this.zzZv = 0;
        this.zzZB = 2;
        this.zzZD = false;
        this.zzZF = false;
        Map hashMap = new HashMap();
        int i2 = 0;
        for (Api api : this.zzZI.keySet()) {
            com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb = (com.google.android.gms.common.api.Api.zzb) this.zzZq.zzaaf.get(api.zznd());
            int intValue = ((Integer) this.zzZI.get(api)).intValue();
            try {
                i = (api.zznb().getPriority() == 1 ? 1 : 0) | i2;
                try {
                    if (com_google_android_gms_common_api_Api_zzb.zzlm()) {
                        this.zzZC = true;
                        if (intValue < this.zzZB) {
                            this.zzZB = intValue;
                        }
                        if (intValue != 0) {
                            try {
                                this.zzZz.add(api.zznd());
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                    }
                    hashMap.put(com_google_android_gms_common_api_Api_zzb, new zzd(this, api, intValue));
                    if (z2) {
                        break;
                    }
                    i2 = i;
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
        i = i2;
        if (i != 0) {
            try {
                this.zzZC = false;
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        }
        if (this.zzZC) {
            this.zzZH.zza(Integer.valueOf(this.zzZq.getSessionId()));
            ConnectionCallbacks com_google_android_gms_common_api_zzg_zzg = new zzg(this, null);
            this.zzZA = (com.google.android.gms.signin.zzd) this.zzZj.zza(this.mContext, this.zzZq.getLooper(), this.zzZH, this.zzZH.zzoo(), com_google_android_gms_common_api_zzg_zzg, com_google_android_gms_common_api_zzg_zzg);
        }
        try {
            this.zzZx = this.zzZq.zzaaf.size();
            this.zzZJ.add(zzk.zznF().submit(new zze(this, hashMap)));
            if (com.google.android.gms.common.internal.safeparcel.zza.zza.a != 0) {
                if (!z2) {
                    z = true;
                }
                Api.a = z;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    public void connect() {
        this.zzZw = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void disconnect() {
        /*
        r5 = this;
        r4 = 1;
        r1 = com.google.android.gms.common.api.Api.a;
        r0 = r5.zzZq;
        r0 = r0.zzZZ;
        r2 = r0.iterator();
    L_0x000b:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0025;
    L_0x0011:
        r0 = r2.next();
        r0 = (com.google.android.gms.common.api.zzi.zze) r0;
        r3 = r0.zzng();	 Catch:{ IllegalStateException -> 0x003c }
        if (r3 == r4) goto L_0x0023;
    L_0x001d:
        r0.cancel();	 Catch:{ IllegalStateException -> 0x003c }
        r2.remove();	 Catch:{ IllegalStateException -> 0x003c }
    L_0x0023:
        if (r1 == 0) goto L_0x000b;
    L_0x0025:
        r0 = r5.zzZq;	 Catch:{ IllegalStateException -> 0x003e }
        r0.zznx();	 Catch:{ IllegalStateException -> 0x003e }
        r0 = r5.zzZt;	 Catch:{ IllegalStateException -> 0x003e }
        if (r0 != 0) goto L_0x0042;
    L_0x002e:
        r0 = r5.zzZq;	 Catch:{ IllegalStateException -> 0x0040 }
        r0 = r0.zzZZ;	 Catch:{ IllegalStateException -> 0x0040 }
        r0 = r0.isEmpty();	 Catch:{ IllegalStateException -> 0x0040 }
        if (r0 != 0) goto L_0x0042;
    L_0x0038:
        r0 = 1;
        r5.zzZw = r0;	 Catch:{ IllegalStateException -> 0x0040 }
    L_0x003b:
        return;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r5.zznv();
        r5.zzX(r4);
        r0 = r5.zzZq;
        r0 = r0.zzaag;
        r0.clear();
        r0 = r5.zzZq;
        r1 = 0;
        r0.zzg(r1);
        r0 = r5.zzZq;
        r0 = r0.zzZY;
        r0.zzoI();
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzg.disconnect():void");
    }

    public String getName() {
        return "CONNECTING";
    }

    public void onConnected(Bundle bundle) {
        try {
            if (zzbe(3)) {
                if (bundle != null) {
                    try {
                        this.zzZy.putAll(bundle);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                try {
                    if (zzno()) {
                        zznt();
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void onConnectionSuspended(int i) {
        zzf(new ConnectionResult(8, null));
    }

    public com.google.android.gms.common.api.zzc.zza zza(com.google.android.gms.common.api.zzc.zza com_google_android_gms_common_api_zzc_zza) {
        this.zzZq.zzZZ.add(com_google_android_gms_common_api_zzc_zza);
        return com_google_android_gms_common_api_zzc_zza;
    }

    public void zza(ConnectionResult connectionResult, Api api, int i) {
        try {
            if (zzbe(3)) {
                try {
                    zzb(connectionResult, api, i);
                    if (zzno()) {
                        zznt();
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public com.google.android.gms.common.api.zzc.zza zzb(com.google.android.gms.common.api.zzc.zza com_google_android_gms_common_api_zzc_zza) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
