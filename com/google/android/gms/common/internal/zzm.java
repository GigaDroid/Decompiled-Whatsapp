package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.v;

final class zzm extends zzl implements Callback {
    private final Handler mHandler;
    private final HashMap zzadV;
    private final com.google.android.gms.common.stats.zzb zzadW;
    private final long zzadX;
    private final Context zzqO;

    final class zza {
        private final String zzOj;
        private final ComponentName zzadY;

        public zza(ComponentName componentName) {
            this.zzOj = null;
            this.zzadY = (ComponentName) zzx.zzv(componentName);
        }

        public zza(String str) {
            this.zzOj = zzx.zzcs(str);
            this.zzadY = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza com_google_android_gms_common_internal_zzm_zza = (zza) obj;
            return zzw.equal(this.zzOj, com_google_android_gms_common_internal_zzm_zza.zzOj) && zzw.equal(this.zzadY, com_google_android_gms_common_internal_zzm_zza.zzadY);
        }

        public int hashCode() {
            return zzw.hashCode(new Object[]{this.zzOj, this.zzadY});
        }

        public String toString() {
            return this.zzOj == null ? this.zzadY.flattenToString() : this.zzOj;
        }

        public Intent zzoK() {
            if (this.zzOj != null) {
                Intent intent = new Intent(this.zzOj).setPackage("com.google.android.gms");
                if (!zzx.a) {
                    return intent;
                }
            }
            return new Intent().setComponent(this.zzadY);
        }
    }

    final class zzb {
        private int mState;
        private IBinder zzacE;
        private ComponentName zzadY;
        private final zza zzadZ;
        private final Set zzaea;
        private boolean zzaeb;
        private final zza zzaec;
        final zzm zzaed;

        public class zza implements ServiceConnection {
            final zzb zzaee;

            public zza(zzb com_google_android_gms_common_internal_zzm_zzb) {
                this.zzaee = com_google_android_gms_common_internal_zzm_zzb;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                boolean z = zzx.a;
                synchronized (zzm.zza(this.zzaee.zzaed)) {
                    zzb.zza(this.zzaee, iBinder);
                    zzb.zza(this.zzaee, componentName);
                    for (ServiceConnection onServiceConnected : zzb.zzb(this.zzaee)) {
                        onServiceConnected.onServiceConnected(componentName, iBinder);
                        if (z) {
                            break;
                        }
                    }
                    zzb.zza(this.zzaee, 1);
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                boolean z = zzx.a;
                synchronized (zzm.zza(this.zzaee.zzaed)) {
                    zzb.zza(this.zzaee, null);
                    zzb.zza(this.zzaee, componentName);
                    for (ServiceConnection onServiceDisconnected : zzb.zzb(this.zzaee)) {
                        onServiceDisconnected.onServiceDisconnected(componentName);
                        if (z) {
                            break;
                        }
                    }
                    zzb.zza(this.zzaee, 2);
                }
            }
        }

        public zzb(zzm com_google_android_gms_common_internal_zzm, zza com_google_android_gms_common_internal_zzm_zza) {
            this.zzaed = com_google_android_gms_common_internal_zzm;
            this.zzaec = com_google_android_gms_common_internal_zzm_zza;
            this.zzadZ = new zza(this);
            this.zzaea = new HashSet();
            this.mState = 2;
        }

        static int zza(zzb com_google_android_gms_common_internal_zzm_zzb, int i) {
            com_google_android_gms_common_internal_zzm_zzb.mState = i;
            return i;
        }

        static ComponentName zza(zzb com_google_android_gms_common_internal_zzm_zzb, ComponentName componentName) {
            com_google_android_gms_common_internal_zzm_zzb.zzadY = componentName;
            return componentName;
        }

        static IBinder zza(zzb com_google_android_gms_common_internal_zzm_zzb, IBinder iBinder) {
            com_google_android_gms_common_internal_zzm_zzb.zzacE = iBinder;
            return iBinder;
        }

        static zza zza(zzb com_google_android_gms_common_internal_zzm_zzb) {
            return com_google_android_gms_common_internal_zzm_zzb.zzaec;
        }

        static Set zzb(zzb com_google_android_gms_common_internal_zzm_zzb) {
            return com_google_android_gms_common_internal_zzm_zzb.zzaea;
        }

        public IBinder getBinder() {
            return this.zzacE;
        }

        public ComponentName getComponentName() {
            return this.zzadY;
        }

        public int getState() {
            return this.mState;
        }

        public boolean isBound() {
            return this.zzaeb;
        }

        public void zza(ServiceConnection serviceConnection, String str) {
            zzm.zzc(this.zzaed).zza(zzm.zzb(this.zzaed), serviceConnection, str, this.zzaec.zzoK());
            this.zzaea.add(serviceConnection);
        }

        public boolean zza(ServiceConnection serviceConnection) {
            return this.zzaea.contains(serviceConnection);
        }

        public void zzb(ServiceConnection serviceConnection, String str) {
            zzm.zzc(this.zzaed).zzb(zzm.zzb(this.zzaed), serviceConnection);
            this.zzaea.remove(serviceConnection);
        }

        public void zzcl(String str) {
            try {
                this.zzaeb = zzm.zzc(this.zzaed).zza(zzm.zzb(this.zzaed), str, this.zzaec.zzoK(), this.zzadZ, 129);
                if (this.zzaeb) {
                    this.mState = 3;
                    if (!zzx.a) {
                        return;
                    }
                }
                try {
                    zzm.zzc(this.zzaed).zza(zzm.zzb(this.zzaed), this.zzadZ);
                } catch (IllegalArgumentException e) {
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        public void zzcm(String str) {
            zzm.zzc(this.zzaed).zza(zzm.zzb(this.zzaed), this.zzadZ);
            this.zzaeb = false;
            this.mState = 2;
        }

        public boolean zzoL() {
            return this.zzaea.isEmpty();
        }
    }

    zzm(Context context) {
        this.zzadV = new HashMap();
        this.zzqO = context.getApplicationContext();
        this.mHandler = new Handler(context.getMainLooper(), this);
        this.zzadW = com.google.android.gms.common.stats.zzb.zzpD();
        this.zzadX = 5000;
    }

    static HashMap zza(zzm com_google_android_gms_common_internal_zzm) {
        return com_google_android_gms_common_internal_zzm.zzadV;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean zza(com.google.android.gms.common.internal.zzm.zza r6, android.content.ServiceConnection r7, java.lang.String r8) {
        /*
        r5 = this;
        r1 = com.google.android.gms.common.internal.zzx.a;
        r0 = "ServiceConnection must not be null";
        com.google.android.gms.common.internal.zzx.zzb(r7, r0);
        r2 = r5.zzadV;
        monitor-enter(r2);
        r0 = r5.zzadV;	 Catch:{ all -> 0x004f }
        r0 = r0.get(r6);	 Catch:{ all -> 0x004f }
        r0 = (com.google.android.gms.common.internal.zzm.zzb) r0;	 Catch:{ all -> 0x004f }
        if (r0 != 0) goto L_0x0027;
    L_0x0015:
        r0 = new com.google.android.gms.common.internal.zzm$zzb;	 Catch:{ all -> 0x004f }
        r0.<init>(r5, r6);	 Catch:{ all -> 0x004f }
        r0.zza(r7, r8);	 Catch:{ IllegalStateException -> 0x0052 }
        r0.zzcl(r8);	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r5.zzadV;	 Catch:{ IllegalStateException -> 0x0052 }
        r3.put(r6, r0);	 Catch:{ IllegalStateException -> 0x0052 }
        if (r1 == 0) goto L_0x005e;
    L_0x0027:
        r3 = r5.mHandler;	 Catch:{ IllegalStateException -> 0x0052 }
        r4 = 0;
        r3.removeMessages(r4, r0);	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r0.zza(r7);	 Catch:{ IllegalStateException -> 0x0052 }
        if (r3 == 0) goto L_0x0054;
    L_0x0033:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x004d }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x004d }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x004d }
        r3 = "Trying to bind a GmsServiceConnection that was already connected before.  config=";
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.append(r6);	 Catch:{ IllegalStateException -> 0x004d }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x004d }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x004d }
        throw r0;	 Catch:{ IllegalStateException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x004f }
        throw r0;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004d }
    L_0x0054:
        r0.zza(r7, r8);	 Catch:{ IllegalStateException -> 0x0077 }
        r3 = r0.getState();	 Catch:{ IllegalStateException -> 0x0077 }
        switch(r3) {
            case 1: goto L_0x0064;
            case 2: goto L_0x0071;
            default: goto L_0x005e;
        };
    L_0x005e:
        r0 = r0.isBound();	 Catch:{ all -> 0x004f }
        monitor-exit(r2);	 Catch:{ all -> 0x004f }
        return r0;
    L_0x0064:
        r3 = r0.getComponentName();	 Catch:{ IllegalStateException -> 0x0077 }
        r4 = r0.getBinder();	 Catch:{ IllegalStateException -> 0x0077 }
        r7.onServiceConnected(r3, r4);	 Catch:{ IllegalStateException -> 0x0077 }
        if (r1 == 0) goto L_0x005e;
    L_0x0071:
        r0.zzcl(r8);	 Catch:{ IllegalStateException -> 0x0075 }
        goto L_0x005e;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0075 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzm.zza(com.google.android.gms.common.internal.zzm$zza, android.content.ServiceConnection, java.lang.String):boolean");
    }

    static Context zzb(zzm com_google_android_gms_common_internal_zzm) {
        return com_google_android_gms_common_internal_zzm.zzqO;
    }

    private void zzb(com.google.android.gms.common.internal.zzm.zza r7, android.content.ServiceConnection r8, java.lang.String r9) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.google.android.gms.common.internal.zzm.zzb(com.google.android.gms.common.internal.zzm$zza, android.content.ServiceConnection, java.lang.String):void. bs: [B:5:0x0013, B:14:0x0032]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r6 = this;
        r0 = "ServiceConnection must not be null";
        com.google.android.gms.common.internal.zzx.zzb(r8, r0);
        r1 = r6.zzadV;
        monitor-enter(r1);
        r0 = r6.zzadV;	 Catch:{ all -> 0x002f }
        r0 = r0.get(r7);	 Catch:{ all -> 0x002f }
        r0 = (com.google.android.gms.common.internal.zzm.zzb) r0;	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x0032;
    L_0x0013:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x002d }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x002d }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x002d }
        r3 = "Nonexistent connection status for service config: ";	 Catch:{ IllegalStateException -> 0x002d }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x002d }
        r2 = r2.append(r7);	 Catch:{ IllegalStateException -> 0x002d }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x002d }
        r0.<init>(r2);	 Catch:{ IllegalStateException -> 0x002d }
        throw r0;	 Catch:{ IllegalStateException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002f }
    L_0x002f:
        r0 = move-exception;	 Catch:{ all -> 0x002f }
        monitor-exit(r1);	 Catch:{ all -> 0x002f }
        throw r0;
    L_0x0032:
        r2 = r0.zza(r8);	 Catch:{ IllegalStateException -> 0x0052 }
        if (r2 != 0) goto L_0x0054;	 Catch:{ IllegalStateException -> 0x0052 }
    L_0x0038:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0052 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0052 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config=";	 Catch:{ IllegalStateException -> 0x0052 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0052 }
        r2 = r2.append(r7);	 Catch:{ IllegalStateException -> 0x0052 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0052 }
        r0.<init>(r2);	 Catch:{ IllegalStateException -> 0x0052 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002f }
    L_0x0054:
        r0.zzb(r8, r9);	 Catch:{ all -> 0x002f }
        r2 = r0.zzoL();	 Catch:{ all -> 0x002f }
        if (r2 == 0) goto L_0x006b;	 Catch:{ all -> 0x002f }
    L_0x005d:
        r2 = r6.mHandler;	 Catch:{ all -> 0x002f }
        r3 = 0;	 Catch:{ all -> 0x002f }
        r0 = r2.obtainMessage(r3, r0);	 Catch:{ all -> 0x002f }
        r2 = r6.mHandler;	 Catch:{ all -> 0x002f }
        r4 = r6.zzadX;	 Catch:{ all -> 0x002f }
        r2.sendMessageDelayed(r0, r4);	 Catch:{ all -> 0x002f }
    L_0x006b:
        monitor-exit(r1);	 Catch:{ all -> 0x002f }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzm.zzb(com.google.android.gms.common.internal.zzm$zza, android.content.ServiceConnection, java.lang.String):void");
    }

    static com.google.android.gms.common.stats.zzb zzc(zzm com_google_android_gms_common_internal_zzm) {
        return com_google_android_gms_common_internal_zzm.zzadW;
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case v.m /*0*/:
                zzb com_google_android_gms_common_internal_zzm_zzb = (zzb) message.obj;
                synchronized (this.zzadV) {
                    if (com_google_android_gms_common_internal_zzm_zzb.zzoL()) {
                        try {
                            if (com_google_android_gms_common_internal_zzm_zzb.isBound()) {
                                com_google_android_gms_common_internal_zzm_zzb.zzcm("GmsClientSupervisor");
                            }
                            this.zzadV.remove(zzb.zza(com_google_android_gms_common_internal_zzm_zzb));
                            break;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }

    public boolean zza(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zza(new zza(componentName), serviceConnection, str);
    }

    public boolean zza(String str, ServiceConnection serviceConnection, String str2) {
        return zza(new zza(str), serviceConnection, str2);
    }

    public void zzb(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zzb(new zza(componentName), serviceConnection, str);
    }

    public void zzb(String str, ServiceConnection serviceConnection, String str2) {
        zzb(new zza(str), serviceConnection, str2);
    }
}
