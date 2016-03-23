package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.Y;

public abstract class zzj implements com.google.android.gms.common.api.Api.zzb, com.google.android.gms.common.internal.zzk.zza {
    public static final String[] zzadF;
    private final Context mContext;
    final Handler mHandler;
    private final Account zzOY;
    private final Looper zzYV;
    private final zzf zzZH;
    private final GoogleApiAvailability zzZi;
    private final Set zzZp;
    private int zzadA;
    private final ConnectionCallbacks zzadB;
    private final OnConnectionFailedListener zzadC;
    private final int zzadD;
    protected AtomicInteger zzadE;
    private final zzl zzadu;
    private zzs zzadv;
    private com.google.android.gms.common.api.GoogleApiClient.zza zzadw;
    private IInterface zzadx;
    private final ArrayList zzady;
    private zze zzadz;
    private final Object zzpc;

    public abstract class zzc {
        private Object mListener;
        final zzj zzadH;
        private boolean zzadI;

        public zzc(zzj com_google_android_gms_common_internal_zzj, Object obj) {
            this.zzadH = com_google_android_gms_common_internal_zzj;
            this.mListener = obj;
            this.zzadI = false;
        }

        public void unregister() {
            zzoG();
            synchronized (zzj.zzc(this.zzadH)) {
                zzj.zzc(this.zzadH).remove(this);
            }
        }

        protected abstract void zzoE();

        public void zzoF() {
            synchronized (this) {
                Object obj = this.mListener;
                try {
                    if (this.zzadI) {
                        Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            if (obj != null) {
                try {
                    zzs(obj);
                } catch (RuntimeException e2) {
                    zzoE();
                    throw e2;
                }
            }
            zzoE();
            synchronized (this) {
                this.zzadI = true;
            }
            unregister();
        }

        public void zzoG() {
            synchronized (this) {
                this.mListener = null;
            }
        }

        protected abstract void zzs(Object obj);
    }

    abstract class zza extends zzc {
        public final int statusCode;
        public final Bundle zzadG;
        final zzj zzadH;

        protected zza(zzj com_google_android_gms_common_internal_zzj, int i, Bundle bundle) {
            this.zzadH = com_google_android_gms_common_internal_zzj;
            super(com_google_android_gms_common_internal_zzj, Boolean.valueOf(true));
            this.statusCode = i;
            this.zzadG = bundle;
        }

        protected void zzc(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                try {
                    zzj.zza(this.zzadH, 1, null);
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            try {
                switch (this.statusCode) {
                    case v.m /*0*/:
                        if (!zzoD()) {
                            try {
                                zzj.zza(this.zzadH, 1, null);
                                zzi(new ConnectionResult(8, null));
                                if (!zzx.a) {
                                    return;
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                        return;
                        break;
                    case Y.t /*10*/:
                        break;
                    default:
                        zzj.zza(this.zzadH, 1, null);
                        if (this.zzadG != null) {
                            pendingIntent = (PendingIntent) this.zzadG.getParcelable("pendingIntent");
                        }
                        zzi(new ConnectionResult(this.statusCode, pendingIntent));
                        return;
                }
                zzj.zza(this.zzadH, 1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }

        protected abstract void zzi(ConnectionResult connectionResult);

        protected abstract boolean zzoD();

        protected void zzoE() {
        }

        protected void zzs(Object obj) {
            zzc((Boolean) obj);
        }
    }

    final class zzb extends Handler {
        final zzj zzadH;

        public zzb(zzj com_google_android_gms_common_internal_zzj, Looper looper) {
            this.zzadH = com_google_android_gms_common_internal_zzj;
            super(looper);
        }

        private void zza(Message message) {
            zzc com_google_android_gms_common_internal_zzj_zzc = (zzc) message.obj;
            com_google_android_gms_common_internal_zzj_zzc.zzoE();
            com_google_android_gms_common_internal_zzj_zzc.unregister();
        }

        private boolean zzb(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
        }

        public void handleMessage(Message message) {
            if (this.zzadH.zzadE.get() != message.arg1) {
                if (zzb(message)) {
                    zza(message);
                }
            } else if ((message.what == 1 || message.what == 5 || message.what == 6) && !this.zzadH.isConnecting()) {
                zza(message);
            } else if (message.what == 3) {
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, null);
                zzj.zza(this.zzadH).zza(connectionResult);
                this.zzadH.onConnectionFailed(connectionResult);
            } else if (message.what == 4) {
                zzj.zza(this.zzadH, 4, null);
                if (zzj.zzb(this.zzadH) != null) {
                    zzj.zzb(this.zzadH).onConnectionSuspended(message.arg2);
                }
                this.zzadH.onConnectionSuspended(message.arg2);
                zzj.zza(this.zzadH, 4, 1, null);
            } else if (message.what == 2 && !this.zzadH.isConnected()) {
                zza(message);
            } else if (zzb(message)) {
                ((zzc) message.obj).zzoF();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
            }
        }
    }

    public final class zzd extends com.google.android.gms.common.internal.zzr.zza {
        private zzj zzadJ;
        private final int zzadK;

        public zzd(zzj com_google_android_gms_common_internal_zzj, int i) {
            this.zzadJ = com_google_android_gms_common_internal_zzj;
            this.zzadK = i;
        }

        private void zzoH() {
            this.zzadJ = null;
        }

        public void zza(int i, IBinder iBinder, Bundle bundle) {
            zzx.zzb(this.zzadJ, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.zzadJ.zza(i, iBinder, bundle, this.zzadK);
            zzoH();
        }

        public void zzb(int i, Bundle bundle) {
            zzx.zzb(this.zzadJ, (Object) "onAccountValidationComplete can be called only once per call to validateAccount");
            this.zzadJ.zza(i, bundle, this.zzadK);
            zzoH();
        }
    }

    public final class zze implements ServiceConnection {
        final zzj zzadH;
        private final int zzadK;

        public zze(zzj com_google_android_gms_common_internal_zzj, int i) {
            this.zzadH = com_google_android_gms_common_internal_zzj;
            this.zzadK = i;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            zzx.zzb((Object) iBinder, (Object) "Expecting a valid IBinder");
            zzj.zza(this.zzadH, com.google.android.gms.common.internal.zzs.zza.zzaK(iBinder));
            this.zzadH.zzbA(this.zzadK);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.zzadH.mHandler.sendMessage(this.zzadH.mHandler.obtainMessage(4, this.zzadK, 1));
        }
    }

    public class zzf implements com.google.android.gms.common.api.GoogleApiClient.zza {
        final zzj zzadH;

        public zzf(zzj com_google_android_gms_common_internal_zzj) {
            this.zzadH = com_google_android_gms_common_internal_zzj;
        }

        public void zza(ConnectionResult connectionResult) {
            try {
                if (connectionResult.isSuccess()) {
                    this.zzadH.zza(null, zzj.zzd(this.zzadH));
                    if (!zzx.a) {
                        return;
                    }
                }
                try {
                    if (zzj.zze(this.zzadH) != null) {
                        zzj.zze(this.zzadH).onConnectionFailed(connectionResult);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }

        public void zzb(ConnectionResult connectionResult) {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }
    }

    public final class zzg extends zza {
        final zzj zzadH;
        public final IBinder zzadL;

        public zzg(zzj com_google_android_gms_common_internal_zzj, int i, IBinder iBinder, Bundle bundle) {
            this.zzadH = com_google_android_gms_common_internal_zzj;
            super(com_google_android_gms_common_internal_zzj, i, bundle);
            this.zzadL = iBinder;
        }

        protected void zzi(ConnectionResult connectionResult) {
            if (zzj.zze(this.zzadH) != null) {
                zzj.zze(this.zzadH).onConnectionFailed(connectionResult);
            }
            this.zzadH.onConnectionFailed(connectionResult);
        }

        protected boolean zzoD() {
            try {
                String interfaceDescriptor = this.zzadL.getInterfaceDescriptor();
                try {
                    if (this.zzadH.zzfB().equals(interfaceDescriptor)) {
                        IInterface zzV = this.zzadH.zzV(this.zzadL);
                        if (zzV == null) {
                            return false;
                        }
                        try {
                            if (!zzj.zza(this.zzadH, 2, 3, zzV)) {
                                return false;
                            }
                            Bundle zzmw = this.zzadH.zzmw();
                            try {
                                if (zzj.zzb(this.zzadH) != null) {
                                    zzj.zzb(this.zzadH).onConnected(zzmw);
                                }
                                return true;
                            } catch (RemoteException e) {
                                throw e;
                            }
                        } catch (RemoteException e2) {
                            throw e2;
                        }
                    }
                    Log.e("GmsClient", "service descriptor mismatch: " + this.zzadH.zzfB() + " vs. " + interfaceDescriptor);
                    return false;
                } catch (RemoteException e22) {
                    throw e22;
                }
            } catch (RemoteException e3) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    public final class zzh extends zza {
        final zzj zzadH;

        public zzh(zzj com_google_android_gms_common_internal_zzj) {
            this.zzadH = com_google_android_gms_common_internal_zzj;
            super(com_google_android_gms_common_internal_zzj, 0, null);
        }

        protected void zzi(ConnectionResult connectionResult) {
            zzj.zza(this.zzadH).zza(connectionResult);
            this.zzadH.onConnectionFailed(connectionResult);
        }

        protected boolean zzoD() {
            zzj.zza(this.zzadH).zza(ConnectionResult.zzYi);
            return true;
        }
    }

    public final class zzi extends zza {
        final zzj zzadH;

        public zzi(zzj com_google_android_gms_common_internal_zzj, int i, Bundle bundle) {
            this.zzadH = com_google_android_gms_common_internal_zzj;
            super(com_google_android_gms_common_internal_zzj, i, bundle);
        }

        protected void zzi(ConnectionResult connectionResult) {
            zzj.zza(this.zzadH).zzb(connectionResult);
            this.zzadH.onConnectionFailed(connectionResult);
        }

        protected boolean zzoD() {
            zzj.zza(this.zzadH).zzb(ConnectionResult.zzYi);
            return true;
        }
    }

    static {
        zzadF = new String[]{"service_esmobile", "service_googleme"};
    }

    protected zzj(Context context, Looper looper, int i, zzf com_google_android_gms_common_internal_zzf, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, zzl.zzak(context), GoogleApiAvailability.getInstance(), i, com_google_android_gms_common_internal_zzf, (ConnectionCallbacks) zzx.zzv(connectionCallbacks), (OnConnectionFailedListener) zzx.zzv(onConnectionFailedListener));
    }

    protected zzj(Context context, Looper looper, zzl com_google_android_gms_common_internal_zzl, GoogleApiAvailability googleApiAvailability, int i, zzf com_google_android_gms_common_internal_zzf, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        boolean z = zzx.a;
        this.zzpc = new Object();
        this.zzady = new ArrayList();
        this.zzadA = 1;
        this.zzadE = new AtomicInteger(0);
        this.mContext = (Context) zzx.zzb((Object) context, (Object) "Context must not be null");
        this.zzYV = (Looper) zzx.zzb((Object) looper, (Object) "Looper must not be null");
        this.zzadu = (zzl) zzx.zzb((Object) com_google_android_gms_common_internal_zzl, (Object) "Supervisor must not be null");
        this.zzZi = (GoogleApiAvailability) zzx.zzb((Object) googleApiAvailability, (Object) "API availability must not be null");
        this.mHandler = new zzb(this, looper);
        this.zzadD = i;
        this.zzZH = (zzf) zzx.zzv(com_google_android_gms_common_internal_zzf);
        this.zzOY = com_google_android_gms_common_internal_zzf.getAccount();
        this.zzZp = zzb(com_google_android_gms_common_internal_zzf.zzoj());
        this.zzadB = connectionCallbacks;
        this.zzadC = onConnectionFailedListener;
        if (z) {
            com.google.android.gms.common.internal.safeparcel.zza.zza.a++;
        }
    }

    static com.google.android.gms.common.api.GoogleApiClient.zza zza(zzj com_google_android_gms_common_internal_zzj) {
        return com_google_android_gms_common_internal_zzj.zzadw;
    }

    static zzs zza(zzj com_google_android_gms_common_internal_zzj, zzs com_google_android_gms_common_internal_zzs) {
        com_google_android_gms_common_internal_zzj.zzadv = com_google_android_gms_common_internal_zzs;
        return com_google_android_gms_common_internal_zzs;
    }

    static void zza(zzj com_google_android_gms_common_internal_zzj, int i, IInterface iInterface) {
        com_google_android_gms_common_internal_zzj.zzb(i, iInterface);
    }

    private boolean zza(int i, int i2, IInterface iInterface) {
        boolean z;
        synchronized (this.zzpc) {
            if (this.zzadA != i) {
                z = false;
            } else {
                zzb(i2, iInterface);
                z = true;
            }
        }
        return z;
    }

    static boolean zza(zzj com_google_android_gms_common_internal_zzj, int i, int i2, IInterface iInterface) {
        return com_google_android_gms_common_internal_zzj.zza(i, i2, iInterface);
    }

    static ConnectionCallbacks zzb(zzj com_google_android_gms_common_internal_zzj) {
        return com_google_android_gms_common_internal_zzj.zzadB;
    }

    private Set zzb(Set set) {
        boolean z = zzx.a;
        Set<Scope> zza = zza(set);
        if (zza == null) {
            return zza;
        }
        for (Scope contains : zza) {
            try {
                if (set.contains(contains)) {
                    if (z) {
                        break;
                    }
                }
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return zza;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zzb(int r6, android.os.IInterface r7) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r4 = com.google.android.gms.common.internal.zzx.a;
        r2 = 3;
        if (r6 != r2) goto L_0x001f;
    L_0x0007:
        r3 = r0;
    L_0x0008:
        if (r7 == 0) goto L_0x0021;
    L_0x000a:
        r2 = r0;
    L_0x000b:
        if (r3 != r2) goto L_0x0023;
    L_0x000d:
        com.google.android.gms.common.internal.zzx.zzZ(r0);
        r1 = r5.zzpc;
        monitor-enter(r1);
        r5.zzadA = r6;	 Catch:{ all -> 0x0035 }
        r5.zzadx = r7;	 Catch:{ all -> 0x0035 }
        r5.zzc(r6, r7);	 Catch:{ all -> 0x0035 }
        switch(r6) {
            case 1: goto L_0x002f;
            case 2: goto L_0x0025;
            case 3: goto L_0x002a;
            default: goto L_0x001d;
        };	 Catch:{ all -> 0x0035 }
    L_0x001d:
        monitor-exit(r1);	 Catch:{ all -> 0x0035 }
        return;
    L_0x001f:
        r3 = r1;
        goto L_0x0008;
    L_0x0021:
        r2 = r1;
        goto L_0x000b;
    L_0x0023:
        r0 = r1;
        goto L_0x000d;
    L_0x0025:
        r5.zzov();	 Catch:{ IllegalStateException -> 0x0038 }
        if (r4 == 0) goto L_0x001d;
    L_0x002a:
        r5.zzou();	 Catch:{ IllegalStateException -> 0x0038 }
        if (r4 == 0) goto L_0x001d;
    L_0x002f:
        r5.zzow();	 Catch:{ IllegalStateException -> 0x0033 }
        goto L_0x001d;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0035 }
        throw r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0033 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzj.zzb(int, android.os.IInterface):void");
    }

    static ArrayList zzc(zzj com_google_android_gms_common_internal_zzj) {
        return com_google_android_gms_common_internal_zzj.zzady;
    }

    static Set zzd(zzj com_google_android_gms_common_internal_zzj) {
        return com_google_android_gms_common_internal_zzj.zzZp;
    }

    static OnConnectionFailedListener zze(zzj com_google_android_gms_common_internal_zzj) {
        return com_google_android_gms_common_internal_zzj.zzadC;
    }

    private void zzov() {
        try {
            if (this.zzadz != null) {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + zzfA());
                this.zzadu.zzb(zzfA(), this.zzadz, zzot());
                this.zzadE.incrementAndGet();
            }
            this.zzadz = new zze(this, this.zzadE.get());
            if (!this.zzadu.zza(zzfA(), this.zzadz, zzot())) {
                try {
                    Log.e("GmsClient", "unable to connect to service: " + zzfA());
                    this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.zzadE.get(), 9));
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void zzow() {
        try {
            if (this.zzadz != null) {
                this.zzadu.zzb(zzfA(), this.zzadz, zzot());
                this.zzadz = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void disconnect() {
        boolean z = zzx.a;
        this.zzadE.incrementAndGet();
        synchronized (this.zzady) {
            int size = this.zzady.size();
            int i = 0;
            while (i < size) {
                ((zzc) this.zzady.get(i)).zzoG();
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            this.zzady.clear();
        }
        zzb(1, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
        r5 = this;
        r0 = com.google.android.gms.common.internal.zzx.a;
        r1 = r5.zzpc;
        monitor-enter(r1);
        r2 = r5.zzadA;	 Catch:{ all -> 0x004c }
        r3 = r5.zzadx;	 Catch:{ all -> 0x004c }
        monitor-exit(r1);	 Catch:{ all -> 0x004c }
        r1 = r8.append(r6);	 Catch:{ IllegalStateException -> 0x0070 }
        r4 = "mConnectState=";
        r1.append(r4);	 Catch:{ IllegalStateException -> 0x0070 }
        switch(r2) {
            case 1: goto L_0x0067;
            case 2: goto L_0x004f;
            case 3: goto L_0x0057;
            case 4: goto L_0x005f;
            default: goto L_0x0017;
        };
    L_0x0017:
        r1 = "UNKNOWN";
        r8.print(r1);	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x001d:
        r1 = " mService=";
        r8.append(r1);	 Catch:{ IllegalStateException -> 0x007a }
        if (r3 != 0) goto L_0x002d;
    L_0x0025:
        r1 = "null";
        r8.println(r1);	 Catch:{ IllegalStateException -> 0x007c }
        if (r0 == 0) goto L_0x004b;
    L_0x002d:
        r0 = r5.zzfB();	 Catch:{ IllegalStateException -> 0x007c }
        r0 = r8.append(r0);	 Catch:{ IllegalStateException -> 0x007c }
        r1 = "@";
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x007c }
        r1 = r3.asBinder();	 Catch:{ IllegalStateException -> 0x007c }
        r1 = java.lang.System.identityHashCode(r1);	 Catch:{ IllegalStateException -> 0x007c }
        r1 = java.lang.Integer.toHexString(r1);	 Catch:{ IllegalStateException -> 0x007c }
        r0.println(r1);	 Catch:{ IllegalStateException -> 0x007c }
    L_0x004b:
        return;
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004c }
        throw r0;
    L_0x004f:
        r1 = "CONNECTING";
        r8.print(r1);	 Catch:{ IllegalStateException -> 0x0072 }
        if (r0 == 0) goto L_0x001d;
    L_0x0057:
        r1 = "CONNECTED";
        r8.print(r1);	 Catch:{ IllegalStateException -> 0x0074 }
        if (r0 == 0) goto L_0x001d;
    L_0x005f:
        r1 = "DISCONNECTING";
        r8.print(r1);	 Catch:{ IllegalStateException -> 0x0076 }
        if (r0 == 0) goto L_0x001d;
    L_0x0067:
        r1 = "DISCONNECTED";
        r8.print(r1);	 Catch:{ IllegalStateException -> 0x0078 }
        if (r0 == 0) goto L_0x001d;
    L_0x006f:
        goto L_0x0017;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzj.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final Context getContext() {
        return this.mContext;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzpc) {
            z = this.zzadA == 3;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzpc) {
            z = this.zzadA == 2;
        }
        return z;
    }

    protected void onConnectionFailed(ConnectionResult connectionResult) {
    }

    protected void onConnectionSuspended(int i) {
    }

    protected abstract IInterface zzV(IBinder iBinder);

    protected Set zza(Set set) {
        return set;
    }

    protected void zza(int i, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(5, i2, -1, new zzi(this, i, bundle)));
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, i2, -1, new zzg(this, i, iBinder, bundle)));
    }

    public void zza(com.google.android.gms.common.api.GoogleApiClient.zza com_google_android_gms_common_api_GoogleApiClient_zza) {
        this.zzadw = (com.google.android.gms.common.api.GoogleApiClient.zza) zzx.zzb((Object) com_google_android_gms_common_api_GoogleApiClient_zza, (Object) "Connection progress callbacks cannot be null.");
        zzb(2, null);
    }

    public void zza(zzp com_google_android_gms_common_internal_zzp) {
        try {
            this.zzadv.zza(new zzd(this, this.zzadE.get()), new ValidateAccountRequest(com_google_android_gms_common_internal_zzp, (Scope[]) this.zzZp.toArray(new Scope[this.zzZp.size()]), this.mContext.getPackageName(), zzoB()));
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            zzbz(1);
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zza(com.google.android.gms.common.internal.zzp r5, java.util.Set r6) {
        /*
        r4 = this;
        r0 = r4.zzli();	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r1 = new com.google.android.gms.common.internal.GetServiceRequest;	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r2 = r4.zzadD;	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r1.<init>(r2);	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r2 = r4.mContext;	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r2 = r2.getPackageName();	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r1 = r1.zzck(r2);	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r0 = r1.zzg(r0);	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        if (r6 == 0) goto L_0x001e;
    L_0x001b:
        r0.zzd(r6);	 Catch:{ DeadObjectException -> 0x004f, RemoteException -> 0x0066 }
    L_0x001e:
        r1 = r4.zzlm();	 Catch:{ DeadObjectException -> 0x0060, RemoteException -> 0x0066 }
        if (r1 == 0) goto L_0x0033;
    L_0x0024:
        r1 = r4.zzog();	 Catch:{ DeadObjectException -> 0x0060, RemoteException -> 0x0066 }
        r1 = r0.zzb(r1);	 Catch:{ DeadObjectException -> 0x0060, RemoteException -> 0x0066 }
        r1.zzc(r5);	 Catch:{ DeadObjectException -> 0x0060, RemoteException -> 0x0066 }
        r1 = com.google.android.gms.common.internal.zzx.a;	 Catch:{ DeadObjectException -> 0x0060, RemoteException -> 0x0066 }
        if (r1 == 0) goto L_0x003e;
    L_0x0033:
        r1 = r4.zzoC();	 Catch:{ DeadObjectException -> 0x0062, RemoteException -> 0x0066 }
        if (r1 == 0) goto L_0x003e;
    L_0x0039:
        r1 = r4.zzOY;	 Catch:{ DeadObjectException -> 0x0064, RemoteException -> 0x0066 }
        r0.zzb(r1);	 Catch:{ DeadObjectException -> 0x0064, RemoteException -> 0x0066 }
    L_0x003e:
        r1 = r4.zzadv;	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r2 = new com.google.android.gms.common.internal.zzj$zzd;	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r3 = r4.zzadE;	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r3 = r3.get();	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r2.<init>(r4, r3);	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
        r1.zza(r2, r0);	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
    L_0x004e:
        return;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
    L_0x0051:
        r0 = move-exception;
        r0 = "GmsClient";
        r1 = "service died";
        android.util.Log.w(r0, r1);
        r0 = 1;
        r4.zzbz(r0);
        goto L_0x004e;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ DeadObjectException -> 0x0062, RemoteException -> 0x0066 }
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ DeadObjectException -> 0x0064, RemoteException -> 0x0066 }
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ DeadObjectException -> 0x0051, RemoteException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        r1 = "GmsClient";
        r2 = "Remote exception occurred";
        android.util.Log.w(r1, r2, r0);
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzj.zza(com.google.android.gms.common.internal.zzp, java.util.Set):void");
    }

    protected void zzbA(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6, i, -1, new zzh(this)));
    }

    public void zzbz(int i) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(4, this.zzadE.get(), i));
    }

    protected void zzc(int i, IInterface iInterface) {
    }

    protected abstract String zzfA();

    protected abstract String zzfB();

    protected Bundle zzli() {
        return new Bundle();
    }

    public boolean zzlm() {
        return false;
    }

    public Bundle zzmw() {
        return null;
    }

    public final IInterface zzoA() {
        IInterface iInterface;
        synchronized (this.zzpc) {
            if (this.zzadA == 4) {
                throw new DeadObjectException();
            }
            try {
                zzoz();
                zzx.zza(this.zzadx != null, "Client is connected but service is null");
                iInterface = this.zzadx;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return iInterface;
    }

    protected Bundle zzoB() {
        return null;
    }

    public boolean zzoC() {
        return false;
    }

    public final Account zzog() {
        try {
            return this.zzOY != null ? this.zzOY : new Account("<<default account>>", "com.google");
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected final String zzot() {
        return this.zzZH.zzom();
    }

    protected void zzou() {
    }

    protected final void zzoz() {
        try {
            if (!isConnected()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
