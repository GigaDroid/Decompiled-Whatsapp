package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class zzi implements GoogleApiClient {
    private final Context mContext;
    private final Looper zzYV;
    final zzf zzZH;
    final Map zzZI;
    private final Condition zzZX;
    final zzk zzZY;
    final Queue zzZZ;
    private final int zzZf;
    private final int zzZg;
    private final GoogleApiAvailability zzZi;
    final com.google.android.gms.common.api.Api.zza zzZj;
    private final Lock zzZs;
    private volatile boolean zzaaa;
    private long zzaab;
    private long zzaac;
    private final zza zzaad;
    BroadcastReceiver zzaae;
    final Map zzaaf;
    final Map zzaag;
    Set zzaah;
    private volatile zzj zzaai;
    private ConnectionResult zzaaj;
    private final Set zzaak;
    final Set zzaal;
    private final zzd zzaam;
    private final ConnectionCallbacks zzaan;
    private final com.google.android.gms.common.internal.zzk.zza zzaao;

    interface zze {
        void cancel();

        void zza(zzd com_google_android_gms_common_api_zzi_zzd);

        void zzb(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb);

        com.google.android.gms.common.api.Api.zzc zznd();

        int zzng();

        void zzw(Status status);

        void zzx(Status status);
    }

    abstract class zzb {
        private final zzj zzaaw;

        protected zzb(zzj com_google_android_gms_common_api_zzj) {
            this.zzaaw = com_google_android_gms_common_api_zzj;
        }

        public final void zzf(zzi com_google_android_gms_common_api_zzi) {
            zzi.zza(com_google_android_gms_common_api_zzi).lock();
            try {
                if (zzi.zzb(com_google_android_gms_common_api_zzi) == this.zzaaw) {
                    zznn();
                    zzi.zza(com_google_android_gms_common_api_zzi).unlock();
                }
            } finally {
                zzi.zza(com_google_android_gms_common_api_zzi).unlock();
            }
        }

        protected abstract void zznn();
    }

    interface zzd {
        void zzc(zze com_google_android_gms_common_api_zzi_zze);
    }

    class 1 implements zzd {
        final zzi zzaap;

        1(zzi com_google_android_gms_common_api_zzi) {
            this.zzaap = com_google_android_gms_common_api_zzi;
        }

        public void zzc(zze com_google_android_gms_common_api_zzi_zze) {
            this.zzaap.zzaal.remove(com_google_android_gms_common_api_zzi_zze);
        }
    }

    class 2 implements ConnectionCallbacks {
        final zzi zzaap;

        2(zzi com_google_android_gms_common_api_zzi) {
            this.zzaap = com_google_android_gms_common_api_zzi;
        }

        public void onConnected(Bundle bundle) {
            zzi.zza(this.zzaap).lock();
            try {
                zzi.zzb(this.zzaap).onConnected(bundle);
            } finally {
                zzi.zza(this.zzaap).unlock();
            }
        }

        public void onConnectionSuspended(int i) {
            zzi.zza(this.zzaap).lock();
            try {
                zzi.zzb(this.zzaap).onConnectionSuspended(i);
            } finally {
                zzi.zza(this.zzaap).unlock();
            }
        }
    }

    class 3 implements com.google.android.gms.common.internal.zzk.zza {
        final zzi zzaap;

        3(zzi com_google_android_gms_common_api_zzi) {
            this.zzaap = com_google_android_gms_common_api_zzi;
        }

        public boolean isConnected() {
            return this.zzaap.isConnected();
        }

        public Bundle zzmw() {
            return null;
        }
    }

    class 4 implements OnConnectionFailedListener {
        final zzi zzaap;
        final Api zzaaq;
        final int zzaar;

        4(zzi com_google_android_gms_common_api_zzi, Api api, int i) {
            this.zzaap = com_google_android_gms_common_api_zzi;
            this.zzaaq = api;
            this.zzaar = i;
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            zzi.zza(this.zzaap).lock();
            try {
                zzi.zzb(this.zzaap).zza(connectionResult, this.zzaaq, this.zzaar);
            } finally {
                zzi.zza(this.zzaap).unlock();
            }
        }
    }

    final class zza extends Handler {
        final zzi zzaap;

        zza(zzi com_google_android_gms_common_api_zzi, Looper looper) {
            this.zzaap = com_google_android_gms_common_api_zzi;
            super(looper);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r4) {
            /*
            r3 = this;
            r1 = com.google.android.gms.common.api.Api.a;
            r0 = r4.what;	 Catch:{ RuntimeException -> 0x0042 }
            switch(r0) {
                case 1: goto L_0x0024;
                case 2: goto L_0x002b;
                case 3: goto L_0x0032;
                case 4: goto L_0x003d;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = "GoogleApiClientImpl";
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "Unknown message id: ";
            r1 = r1.append(r2);
            r2 = r4.what;
            r1 = r1.append(r2);
            r1 = r1.toString();
            android.util.Log.w(r0, r1);
        L_0x0023:
            return;
        L_0x0024:
            r0 = r3.zzaap;	 Catch:{ RuntimeException -> 0x0044 }
            com.google.android.gms.common.api.zzi.zzd(r0);	 Catch:{ RuntimeException -> 0x0044 }
            if (r1 == 0) goto L_0x0023;
        L_0x002b:
            r0 = r3.zzaap;	 Catch:{ RuntimeException -> 0x0044 }
            com.google.android.gms.common.api.zzi.zzc(r0);	 Catch:{ RuntimeException -> 0x0044 }
            if (r1 == 0) goto L_0x0023;
        L_0x0032:
            r0 = r4.obj;
            r0 = (com.google.android.gms.common.api.zzi.zzb) r0;
            r2 = r3.zzaap;
            r0.zzf(r2);
            if (r1 == 0) goto L_0x0023;
        L_0x003d:
            r0 = r4.obj;
            r0 = (java.lang.RuntimeException) r0;
            throw r0;
        L_0x0042:
            r0 = move-exception;
            throw r0;	 Catch:{ RuntimeException -> 0x0044 }
        L_0x0044:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzi.zza.handleMessage(android.os.Message):void");
        }
    }

    class zzc extends BroadcastReceiver {
        private WeakReference zzaax;

        zzc(zzi com_google_android_gms_common_api_zzi) {
            this.zzaax = new WeakReference(com_google_android_gms_common_api_zzi);
        }

        public void onReceive(Context context, Intent intent) {
            Uri data = intent.getData();
            String str = null;
            if (data != null) {
                str = data.getSchemeSpecificPart();
            }
            if (str != null && str.equals("com.google.android.gms")) {
                zzi com_google_android_gms_common_api_zzi = (zzi) this.zzaax.get();
                if (com_google_android_gms_common_api_zzi != null) {
                    zzi.zzc(com_google_android_gms_common_api_zzi);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzi(android.content.Context r15, android.os.Looper r16, com.google.android.gms.common.internal.zzf r17, com.google.android.gms.common.GoogleApiAvailability r18, com.google.android.gms.common.api.Api.zza r19, java.util.Map r20, java.util.ArrayList r21, java.util.ArrayList r22, int r23, int r24) {
        /*
        r14 = this;
        r11 = com.google.android.gms.common.api.Api.a;
        r14.<init>();
        r2 = new java.util.concurrent.locks.ReentrantLock;
        r2.<init>();
        r14.zzZs = r2;
        r2 = new java.util.LinkedList;
        r2.<init>();
        r14.zzZZ = r2;
        r2 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;
        r14.zzaab = r2;
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r14.zzaac = r2;
        r2 = new java.util.HashMap;
        r2.<init>();
        r14.zzaaf = r2;
        r2 = new java.util.HashMap;
        r2.<init>();
        r14.zzaag = r2;
        r2 = new java.util.HashSet;
        r2.<init>();
        r14.zzaah = r2;
        r2 = 0;
        r14.zzaaj = r2;
        r2 = new java.util.WeakHashMap;
        r2.<init>();
        r2 = java.util.Collections.newSetFromMap(r2);
        r14.zzaak = r2;
        r2 = new java.util.concurrent.ConcurrentHashMap;
        r3 = 16;
        r4 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        r5 = 2;
        r2.<init>(r3, r4, r5);
        r2 = java.util.Collections.newSetFromMap(r2);
        r14.zzaal = r2;
        r2 = new com.google.android.gms.common.api.zzi$1;
        r2.<init>(r14);
        r14.zzaam = r2;
        r2 = new com.google.android.gms.common.api.zzi$2;
        r2.<init>(r14);
        r14.zzaan = r2;
        r2 = new com.google.android.gms.common.api.zzi$3;
        r2.<init>(r14);
        r14.zzaao = r2;
        r14.mContext = r15;
        r2 = new com.google.android.gms.common.internal.zzk;
        r3 = r14.zzaao;
        r0 = r16;
        r2.<init>(r0, r3);
        r14.zzZY = r2;
        r0 = r16;
        r14.zzYV = r0;
        r2 = new com.google.android.gms.common.api.zzi$zza;
        r0 = r16;
        r2.<init>(r14, r0);
        r14.zzaad = r2;
        r0 = r18;
        r14.zzZi = r0;
        r0 = r23;
        r14.zzZf = r0;
        r0 = r24;
        r14.zzZg = r0;
        r2 = new java.util.HashMap;
        r2.<init>();
        r14.zzZI = r2;
        r2 = r14.zzZs;
        r2 = r2.newCondition();
        r14.zzZX = r2;
        r2 = new com.google.android.gms.common.api.zzh;
        r2.<init>(r14);
        r14.zzaai = r2;
        r3 = r21.iterator();
    L_0x00a4:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x00bd;
    L_0x00aa:
        r2 = r3.next();
        r2 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r2;
        r4 = r14.zzZY;
        r4.registerConnectionCallbacks(r2);
        if (r11 == 0) goto L_0x00a4;
    L_0x00b7:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;
        r2 = r2 + 1;
        com.google.android.gms.common.internal.safeparcel.zza.zza.a = r2;
    L_0x00bd:
        r3 = r22.iterator();
    L_0x00c1:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x00d4;
    L_0x00c7:
        r2 = r3.next();
        r2 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r2;
        r4 = r14.zzZY;
        r4.registerConnectionFailedListener(r2);
        if (r11 == 0) goto L_0x00c1;
    L_0x00d4:
        r12 = r17.zzok();
        r2 = r20.keySet();
        r13 = r2.iterator();
    L_0x00e0:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0148;
    L_0x00e6:
        r2 = r13.next();
        r9 = r2;
        r9 = (com.google.android.gms.common.api.Api) r9;
        r0 = r20;
        r3 = r0.get(r9);
        r2 = 0;
        r4 = r12.get(r9);	 Catch:{ zza -> 0x0151 }
        if (r4 == 0) goto L_0x0157;
    L_0x00fa:
        r2 = r12.get(r9);	 Catch:{ zza -> 0x0153 }
        r2 = (com.google.android.gms.common.internal.zzf.zza) r2;	 Catch:{ zza -> 0x0153 }
        r2 = r2.zzadg;	 Catch:{ zza -> 0x0153 }
        if (r2 == 0) goto L_0x0155;
    L_0x0104:
        r2 = 1;
    L_0x0105:
        r10 = r2;
    L_0x0106:
        r2 = r14.zzZI;
        r4 = java.lang.Integer.valueOf(r10);
        r2.put(r9, r4);
        r2 = r9.zzne();
        if (r2 == 0) goto L_0x012a;
    L_0x0115:
        r2 = r9.zznc();
        r7 = r14.zzaan;
        r8 = r14.zza(r9, r10);
        r4 = r15;
        r5 = r16;
        r6 = r17;
        r2 = zza(r2, r3, r4, r5, r6, r7, r8);
        if (r11 == 0) goto L_0x013d;
    L_0x012a:
        r2 = r9.zznb();
        r7 = r14.zzaan;
        r8 = r14.zza(r9, r10);
        r4 = r15;
        r5 = r16;
        r6 = r17;
        r2 = zza(r2, r3, r4, r5, r6, r7, r8);
    L_0x013d:
        r3 = r14.zzaaf;
        r4 = r9.zznd();
        r3.put(r4, r2);
        if (r11 == 0) goto L_0x00e0;
    L_0x0148:
        r0 = r17;
        r14.zzZH = r0;
        r0 = r19;
        r14.zzZj = r0;
        return;
    L_0x0151:
        r2 = move-exception;
        throw r2;	 Catch:{ zza -> 0x0153 }
    L_0x0153:
        r2 = move-exception;
        throw r2;
    L_0x0155:
        r2 = 2;
        goto L_0x0105;
    L_0x0157:
        r10 = r2;
        goto L_0x0106;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzi.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.zzf, com.google.android.gms.common.GoogleApiAvailability, com.google.android.gms.common.api.Api$zza, java.util.Map, java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void resume() {
        this.zzZs.lock();
        try {
            if (zznB()) {
                connect();
            }
            this.zzZs.unlock();
        } catch (Throwable th) {
            this.zzZs.unlock();
        }
    }

    private static com.google.android.gms.common.api.Api.zzb zza(com.google.android.gms.common.api.Api.zza com_google_android_gms_common_api_Api_zza, Object obj, Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return com_google_android_gms_common_api_Api_zza.zza(context, looper, com_google_android_gms_common_internal_zzf, obj, connectionCallbacks, onConnectionFailedListener);
    }

    private final OnConnectionFailedListener zza(Api api, int i) {
        return new 4(this, api, i);
    }

    private static zzac zza(com.google.android.gms.common.api.Api.zze com_google_android_gms_common_api_Api_zze, Object obj, Context context, Looper looper, zzf com_google_android_gms_common_internal_zzf, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zzac(context, looper, com_google_android_gms_common_api_Api_zze.zznf(), connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzf, com_google_android_gms_common_api_Api_zze.zzm(obj));
    }

    static Lock zza(zzi com_google_android_gms_common_api_zzi) {
        return com_google_android_gms_common_api_zzi.zzZs;
    }

    static zzj zzb(zzi com_google_android_gms_common_api_zzi) {
        return com_google_android_gms_common_api_zzi.zzaai;
    }

    static void zzc(zzi com_google_android_gms_common_api_zzi) {
        com_google_android_gms_common_api_zzi.resume();
    }

    static void zzd(zzi com_google_android_gms_common_api_zzi) {
        com_google_android_gms_common_api_zzi.zznC();
    }

    private void zznC() {
        this.zzZs.lock();
        try {
            if (zznE()) {
                connect();
            }
            this.zzZs.unlock();
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        } catch (Throwable th) {
            this.zzZs.unlock();
        }
    }

    public void connect() {
        this.zzZs.lock();
        try {
            this.zzaai.connect();
        } finally {
            this.zzZs.unlock();
        }
    }

    public void disconnect() {
        this.zzZs.lock();
        try {
            zznE();
            this.zzaai.disconnect();
        } finally {
            this.zzZs.unlock();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z = Api.a;
        printWriter.append(str).append("mState=").append(this.zzaai.getName());
        printWriter.append(" mResuming=").print(this.zzaaa);
        printWriter.append(" mWorkQueue.size()=").print(this.zzZZ.size());
        printWriter.append(" mUnconsumedRunners.size()=").println(this.zzaal.size());
        String str2 = str + "  ";
        for (Api api : this.zzZI.keySet()) {
            printWriter.append(str).append(api.getName()).println(":");
            ((com.google.android.gms.common.api.Api.zzb) this.zzaaf.get(api.zznd())).dump(str2, fileDescriptor, printWriter, strArr);
            if (z) {
                return;
            }
        }
    }

    public Looper getLooper() {
        return this.zzYV;
    }

    public int getSessionId() {
        return System.identityHashCode(this);
    }

    public boolean isConnected() {
        return this.zzaai instanceof zzf;
    }

    public boolean isConnecting() {
        return this.zzaai instanceof zzg;
    }

    public void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.zzZY.registerConnectionCallbacks(connectionCallbacks);
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.zzZY.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.zzZY.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.zzZY.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    public com.google.android.gms.common.api.Api.zzb zza(com.google.android.gms.common.api.Api.zzc com_google_android_gms_common_api_Api_zzc) {
        Object obj = (com.google.android.gms.common.api.Api.zzb) this.zzaaf.get(com_google_android_gms_common_api_Api_zzc);
        zzx.zzb(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public com.google.android.gms.common.api.zzc.zza zza(com.google.android.gms.common.api.zzc.zza com_google_android_gms_common_api_zzc_zza) {
        try {
            zzx.zzb(com_google_android_gms_common_api_zzc_zza.zznd() != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
            zzx.zzb(this.zzaaf.containsKey(com_google_android_gms_common_api_zzc_zza.zznd()), (Object) "GoogleApiClient is not configured to use the API required for this call.");
            this.zzZs.lock();
            try {
                com.google.android.gms.common.api.zzc.zza zza = this.zzaai.zza(com_google_android_gms_common_api_zzc_zza);
                return zza;
            } finally {
                this.zzZs.unlock();
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        }
    }

    void zza(zzb com_google_android_gms_common_api_zzi_zzb) {
        this.zzaad.sendMessage(this.zzaad.obtainMessage(3, com_google_android_gms_common_api_zzi_zzb));
    }

    void zza(RuntimeException runtimeException) {
        this.zzaad.sendMessage(this.zzaad.obtainMessage(4, runtimeException));
    }

    public com.google.android.gms.common.api.zzc.zza zzb(com.google.android.gms.common.api.zzc.zza com_google_android_gms_common_api_zzc_zza) {
        boolean z = Api.a;
        try {
            zzx.zzb(com_google_android_gms_common_api_zzc_zza.zznd() != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
            this.zzZs.lock();
            try {
                if (zznB()) {
                    this.zzZZ.add(com_google_android_gms_common_api_zzc_zza);
                    while (!this.zzZZ.isEmpty()) {
                        zze com_google_android_gms_common_api_zzi_zze = (zze) this.zzZZ.remove();
                        zzb(com_google_android_gms_common_api_zzi_zze);
                        com_google_android_gms_common_api_zzi_zze.zzx(Status.zzaaF);
                        if (z) {
                            break;
                        }
                    }
                    this.zzZs.unlock();
                } else {
                    com_google_android_gms_common_api_zzc_zza = this.zzaai.zzb(com_google_android_gms_common_api_zzc_zza);
                    this.zzZs.unlock();
                }
                return com_google_android_gms_common_api_zzc_zza;
            } catch (Throwable th) {
                this.zzZs.unlock();
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        }
    }

    void zzb(zze com_google_android_gms_common_api_zzi_zze) {
        this.zzaal.add(com_google_android_gms_common_api_zzi_zze);
        com_google_android_gms_common_api_zzi_zze.zza(this.zzaam);
    }

    void zzg(ConnectionResult connectionResult) {
        this.zzZs.lock();
        try {
            this.zzaaj = connectionResult;
            this.zzaai = new zzh(this);
            this.zzaai.begin();
            this.zzZX.signalAll();
        } finally {
            this.zzZs.unlock();
        }
    }

    void zznA() {
        this.zzZs.lock();
        try {
            zznE();
            this.zzaai = new zzf(this);
            this.zzaai.begin();
            this.zzZX.signalAll();
        } finally {
            this.zzZs.unlock();
        }
    }

    boolean zznB() {
        return this.zzaaa;
    }

    void zznD() {
        try {
            if (!zznB()) {
                this.zzaaa = true;
                if (this.zzaae == null) {
                    this.zzaae = new zzc(this);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    this.mContext.getApplicationContext().registerReceiver(this.zzaae, intentFilter);
                }
                this.zzaad.sendMessageDelayed(this.zzaad.obtainMessage(1), this.zzaab);
                this.zzaad.sendMessageDelayed(this.zzaad.obtainMessage(2), this.zzaac);
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        }
    }

    boolean zznE() {
        try {
            if (!zznB()) {
                return false;
            }
            try {
                this.zzaaa = false;
                this.zzaad.removeMessages(2);
                this.zzaad.removeMessages(1);
                if (this.zzaae != null) {
                    this.mContext.getApplicationContext().unregisterReceiver(this.zzaae);
                    this.zzaae = null;
                }
                return true;
            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                throw e;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
            throw e2;
        }
    }

    void zznx() {
        boolean z = Api.a;
        for (zze com_google_android_gms_common_api_zzi_zze : this.zzaal) {
            com_google_android_gms_common_api_zzi_zze.zza(null);
            com_google_android_gms_common_api_zzi_zze.cancel();
            if (z) {
                break;
            }
        }
        this.zzaal.clear();
        for (zzl clear : this.zzaak) {
            clear.clear();
            if (z) {
                break;
            }
        }
        this.zzaak.clear();
    }

    void zzny() {
        boolean z = Api.a;
        for (com.google.android.gms.common.api.Api.zzb disconnect : this.zzaaf.values()) {
            disconnect.disconnect();
            if (z) {
                return;
            }
        }
    }

    void zznz() {
        this.zzZs.lock();
        try {
            this.zzaai = new zzg(this, this.zzZH, this.zzZI, this.zzZi, this.zzZj, this.zzZs, this.mContext);
            this.zzaai.begin();
            this.zzZX.signalAll();
        } finally {
            this.zzZs.unlock();
        }
    }
}
