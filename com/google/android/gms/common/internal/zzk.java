package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzk implements Callback {
    private final Handler mHandler;
    private final zza zzadM;
    private final ArrayList zzadN;
    final ArrayList zzadO;
    private final ArrayList zzadP;
    private volatile boolean zzadQ;
    private final AtomicInteger zzadR;
    private boolean zzadS;
    private final Object zzpc;

    public interface zza {
        boolean isConnected();

        Bundle zzmw();
    }

    public zzk(Looper looper, zza com_google_android_gms_common_internal_zzk_zza) {
        this.zzadN = new ArrayList();
        this.zzadO = new ArrayList();
        this.zzadP = new ArrayList();
        this.zzadQ = false;
        this.zzadR = new AtomicInteger(0);
        this.zzadS = false;
        this.zzpc = new Object();
        this.zzadM = com_google_android_gms_common_internal_zzk_zza;
        this.mHandler = new Handler(looper, this);
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) message.obj;
            synchronized (this.zzpc) {
                if (this.zzadQ) {
                    try {
                        if (this.zzadM.isConnected() && this.zzadN.contains(connectionCallbacks)) {
                            connectionCallbacks.onConnected(this.zzadM.zzmw());
                        }
                    } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                        throw e;
                    }
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5) {
        /*
        r4 = this;
        com.google.android.gms.common.internal.zzx.zzv(r5);
        r1 = r4.zzpc;
        monitor-enter(r1);
        r0 = r4.zzadN;	 Catch:{ all -> 0x0050 }
        r0 = r0.contains(r5);	 Catch:{ all -> 0x0050 }
        if (r0 == 0) goto L_0x0033;
    L_0x000e:
        r0 = "GmsClientEvents";
        r2 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x004e }
        r2.<init>();	 Catch:{ zza -> 0x004e }
        r3 = "registerConnectionCallbacks(): listener ";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x004e }
        r2 = r2.append(r5);	 Catch:{ zza -> 0x004e }
        r3 = " is already registered";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x004e }
        r2 = r2.toString();	 Catch:{ zza -> 0x004e }
        android.util.Log.w(r0, r2);	 Catch:{ zza -> 0x004e }
        r0 = com.google.android.gms.common.internal.zzx.a;	 Catch:{ zza -> 0x004e }
        if (r0 == 0) goto L_0x0038;
    L_0x0033:
        r0 = r4.zzadN;	 Catch:{ zza -> 0x004e }
        r0.add(r5);	 Catch:{ zza -> 0x004e }
    L_0x0038:
        monitor-exit(r1);	 Catch:{ all -> 0x0050 }
        r0 = r4.zzadM;	 Catch:{ zza -> 0x0053 }
        r0 = r0.isConnected();	 Catch:{ zza -> 0x0053 }
        if (r0 == 0) goto L_0x004d;
    L_0x0041:
        r0 = r4.mHandler;	 Catch:{ zza -> 0x0053 }
        r1 = r4.mHandler;	 Catch:{ zza -> 0x0053 }
        r2 = 1;
        r1 = r1.obtainMessage(r2, r5);	 Catch:{ zza -> 0x0053 }
        r0.sendMessage(r1);	 Catch:{ zza -> 0x0053 }
    L_0x004d:
        return;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0050 }
        throw r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzk.registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r5) {
        /*
        r4 = this;
        com.google.android.gms.common.internal.zzx.zzv(r5);
        r1 = r4.zzpc;
        monitor-enter(r1);
        r0 = r4.zzadP;	 Catch:{ all -> 0x003c }
        r0 = r0.contains(r5);	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x0033;
    L_0x000e:
        r0 = "GmsClientEvents";
        r2 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x003a }
        r2.<init>();	 Catch:{ zza -> 0x003a }
        r3 = "registerConnectionFailedListener(): listener ";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x003a }
        r2 = r2.append(r5);	 Catch:{ zza -> 0x003a }
        r3 = " is already registered";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x003a }
        r2 = r2.toString();	 Catch:{ zza -> 0x003a }
        android.util.Log.w(r0, r2);	 Catch:{ zza -> 0x003a }
        r0 = com.google.android.gms.common.internal.zzx.a;	 Catch:{ zza -> 0x003a }
        if (r0 == 0) goto L_0x0038;
    L_0x0033:
        r0 = r4.zzadP;	 Catch:{ zza -> 0x003a }
        r0.add(r5);	 Catch:{ zza -> 0x003a }
    L_0x0038:
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        return;
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzk.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5) {
        /*
        r4 = this;
        com.google.android.gms.common.internal.zzx.zzv(r5);
        r1 = r4.zzpc;
        monitor-enter(r1);
        r0 = r4.zzadN;	 Catch:{ all -> 0x0044 }
        r0 = r0.remove(r5);	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0033;
    L_0x000e:
        r0 = "GmsClientEvents";
        r2 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x003e }
        r2.<init>();	 Catch:{ zza -> 0x003e }
        r3 = "unregisterConnectionCallbacks(): listener ";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x003e }
        r2 = r2.append(r5);	 Catch:{ zza -> 0x003e }
        r3 = " not found";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x003e }
        r2 = r2.toString();	 Catch:{ zza -> 0x003e }
        android.util.Log.w(r0, r2);	 Catch:{ zza -> 0x003e }
        r0 = com.google.android.gms.common.internal.zzx.a;	 Catch:{ zza -> 0x003e }
        if (r0 == 0) goto L_0x003c;
    L_0x0033:
        r0 = r4.zzadS;	 Catch:{ zza -> 0x0040 }
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r0 = r4.zzadO;	 Catch:{ zza -> 0x0042 }
        r0.add(r5);	 Catch:{ zza -> 0x0042 }
    L_0x003c:
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        return;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ zza -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ zza -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzk.unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks):void");
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        zzx.zzv(onConnectionFailedListener);
        synchronized (this.zzpc) {
            if (!this.zzadP.remove(onConnectionFailedListener)) {
                try {
                    Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + onConnectionFailedListener + " not found");
                } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                    throw e;
                }
            }
        }
    }

    public void zzbB(int i) {
        boolean z = false;
        boolean z2 = zzx.a;
        try {
            if (Looper.myLooper() == this.mHandler.getLooper()) {
                z = true;
            }
            zzx.zza(z, "onUnintentionalDisconnection must only be called on the Handler thread");
            this.mHandler.removeMessages(1);
            synchronized (this.zzpc) {
                this.zzadS = true;
                ArrayList arrayList = new ArrayList(this.zzadN);
                int i2 = this.zzadR.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) it.next();
                    try {
                        if (this.zzadQ && this.zzadR.get() == i2) {
                            try {
                                if (this.zzadN.contains(connectionCallbacks)) {
                                    connectionCallbacks.onConnectionSuspended(i);
                                    continue;
                                }
                                if (z2) {
                                    break;
                                }
                            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                                throw e;
                            }
                        }
                    } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
                        throw e2;
                    } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e22) {
                        throw e22;
                    }
                }
                this.zzadO.clear();
                this.zzadS = false;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e222) {
            throw e222;
        }
    }

    public void zzh(Bundle bundle) {
        boolean z = false;
        boolean z2 = zzx.a;
        try {
            zzx.zza(Looper.myLooper() == this.mHandler.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
            synchronized (this.zzpc) {
                try {
                    zzx.zzY(!this.zzadS);
                    this.mHandler.removeMessages(1);
                    this.zzadS = true;
                    zzx.zzY(this.zzadO.size() == 0);
                    ArrayList arrayList = new ArrayList(this.zzadN);
                    int i = this.zzadR.get();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) it.next();
                        try {
                            if (this.zzadQ && this.zzadM.isConnected()) {
                                if (this.zzadR.get() == i) {
                                    if (!this.zzadO.contains(connectionCallbacks)) {
                                        connectionCallbacks.onConnected(bundle);
                                        continue;
                                    }
                                    if (z2) {
                                        break;
                                    }
                                }
                            }
                        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                            throw e;
                        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
                            try {
                                throw e2;
                            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e22) {
                                throw e22;
                            }
                        }
                    }
                    this.zzadO.clear();
                    this.zzadS = false;
                } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e222) {
                    throw e222;
                } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2222) {
                    throw e2222;
                }
            }
            try {
                if (com.google.android.gms.common.internal.safeparcel.zza.zza.a != 0) {
                    if (!z2) {
                        z = true;
                    }
                    zzx.a = z;
                }
            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e22222) {
                throw e22222;
            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e222222) {
                throw e222222;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2222222) {
            throw e2222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzj(com.google.android.gms.common.ConnectionResult r7) {
        /*
        r6 = this;
        r1 = 1;
        r2 = com.google.android.gms.common.internal.zzx.a;
        r0 = android.os.Looper.myLooper();	 Catch:{ zza -> 0x0049 }
        r3 = r6.mHandler;	 Catch:{ zza -> 0x0049 }
        r3 = r3.getLooper();	 Catch:{ zza -> 0x0049 }
        if (r0 != r3) goto L_0x004b;
    L_0x000f:
        r0 = r1;
    L_0x0010:
        r3 = "onConnectionFailure must only be called on the Handler thread";
        com.google.android.gms.common.internal.zzx.zza(r0, r3);
        r0 = r6.mHandler;
        r0.removeMessages(r1);
        r1 = r6.zzpc;
        monitor-enter(r1);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x004f }
        r3 = r6.zzadP;	 Catch:{ all -> 0x004f }
        r0.<init>(r3);	 Catch:{ all -> 0x004f }
        r3 = r6.zzadR;	 Catch:{ all -> 0x004f }
        r3 = r3.get();	 Catch:{ all -> 0x004f }
        r4 = r0.iterator();	 Catch:{ all -> 0x004f }
    L_0x002f:
        r0 = r4.hasNext();	 Catch:{ all -> 0x004f }
        if (r0 == 0) goto L_0x005f;
    L_0x0035:
        r0 = r4.next();	 Catch:{ all -> 0x004f }
        r0 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r0;	 Catch:{ all -> 0x004f }
        r5 = r6.zzadQ;	 Catch:{ zza -> 0x004d }
        if (r5 == 0) goto L_0x0047;
    L_0x003f:
        r5 = r6.zzadR;	 Catch:{ zza -> 0x004d }
        r5 = r5.get();	 Catch:{ zza -> 0x004d }
        if (r5 == r3) goto L_0x0052;
    L_0x0047:
        monitor-exit(r1);	 Catch:{ all -> 0x004f }
    L_0x0048:
        return;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r0 = 0;
        goto L_0x0010;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x004f }
        throw r0;
    L_0x0052:
        r5 = r6.zzadP;	 Catch:{ zza -> 0x0061 }
        r5 = r5.contains(r0);	 Catch:{ zza -> 0x0061 }
        if (r5 == 0) goto L_0x005d;
    L_0x005a:
        r0.onConnectionFailed(r7);	 Catch:{ zza -> 0x0061 }
    L_0x005d:
        if (r2 == 0) goto L_0x002f;
    L_0x005f:
        monitor-exit(r1);	 Catch:{ all -> 0x004f }
        goto L_0x0048;
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzk.zzj(com.google.android.gms.common.ConnectionResult):void");
    }

    public void zzoI() {
        this.zzadQ = false;
        this.zzadR.incrementAndGet();
    }

    public void zzoJ() {
        this.zzadQ = true;
    }
}
