package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public abstract class GcmTaskService extends Service {
    private final Set zzazN;
    private int zzazO;

    class zza extends Thread {
        private final Bundle mExtras;
        private final String mTag;
        private final zzb zzazP;
        final GcmTaskService zzazQ;

        zza(GcmTaskService gcmTaskService, String str, IBinder iBinder, Bundle bundle) {
            this.zzazQ = gcmTaskService;
            this.mTag = str;
            this.zzazP = com.google.android.gms.gcm.zzb.zza.zzbR(iBinder);
            this.mExtras = bundle;
        }

        public void run() {
            try {
                this.zzazP.zzgs(this.zzazQ.onRunTask(new TaskParams(this.mTag, this.mExtras)));
            } catch (RemoteException e) {
                Log.e("GcmTaskService", "Error reporting result of operation to scheduler for " + this.mTag);
            } finally {
                GcmTaskService.zza(this.zzazQ, this.mTag);
            }
        }
    }

    public GcmTaskService() {
        this.zzazN = new HashSet();
    }

    static void zza(GcmTaskService gcmTaskService, String str) {
        gcmTaskService.zzdn(str);
    }

    private void zzdn(String str) {
        synchronized (this.zzazN) {
            this.zzazN.remove(str);
            if (this.zzazN.size() == 0) {
                stopSelf(this.zzazO);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(TaskParams taskParams);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
        r6 = this;
        r5 = 2;
        r0 = com.google.android.gms.gcm.PendingCallback.class;
        r0 = r0.getClassLoader();
        r7.setExtrasClassLoader(r0);
        r0 = "com.google.android.gms.gcm.ACTION_TASK_READY";
        r1 = r7.getAction();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0080;
    L_0x0017:
        r0 = "tag";
        r2 = r7.getStringExtra(r0);
        r0 = "callback";
        r1 = r7.getParcelableExtra(r0);
        r0 = "extras";
        r0 = r7.getParcelableExtra(r0);
        r0 = (android.os.Bundle) r0;
        if (r1 == 0) goto L_0x0034;
    L_0x0030:
        r3 = r1 instanceof com.google.android.gms.gcm.PendingCallback;
        if (r3 != 0) goto L_0x005e;
    L_0x0034:
        r0 = "GcmTaskService";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r6.getPackageName();
        r1 = r1.append(r3);
        r3 = " ";
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r2 = ": Could not process request, invalid callback.";
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
    L_0x005d:
        return r5;
    L_0x005e:
        r3 = r6.zzazN;
        monitor-enter(r3);
        r4 = r6.zzazN;	 Catch:{ all -> 0x00a7 }
        r4.add(r2);	 Catch:{ all -> 0x00a7 }
        r4 = r6.zzazO;	 Catch:{ all -> 0x00a7 }
        r6.stopSelf(r4);	 Catch:{ all -> 0x00a7 }
        r6.zzazO = r9;	 Catch:{ all -> 0x00a7 }
        monitor-exit(r3);	 Catch:{ all -> 0x00a7 }
        r3 = new com.google.android.gms.gcm.GcmTaskService$zza;
        r1 = (com.google.android.gms.gcm.PendingCallback) r1;
        r1 = r1.getIBinder();
        r3.<init>(r6, r2, r1, r0);
        r3.start();
        r0 = com.google.android.gms.gcm.zzb.zza.a;
        if (r0 == 0) goto L_0x005d;
    L_0x0080:
        r0 = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
        r1 = r7.getAction();
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x005d;
    L_0x008d:
        r6.onInitializeTasks();
        r1 = r6.zzazN;
        monitor-enter(r1);
        r6.zzazO = r9;	 Catch:{ all -> 0x00a4 }
        r0 = r6.zzazN;	 Catch:{ all -> 0x00a4 }
        r0 = r0.size();	 Catch:{ all -> 0x00a4 }
        if (r0 != 0) goto L_0x00a2;
    L_0x009d:
        r0 = r6.zzazO;	 Catch:{ all -> 0x00a4 }
        r6.stopSelf(r0);	 Catch:{ all -> 0x00a4 }
    L_0x00a2:
        monitor-exit(r1);	 Catch:{ all -> 0x00a4 }
        goto L_0x005d;
    L_0x00a4:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00a4 }
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00a7 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmTaskService.onStartCommand(android.content.Intent, int, int):int");
    }
}
