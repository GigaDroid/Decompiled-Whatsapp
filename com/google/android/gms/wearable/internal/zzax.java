package com.google.android.gms.wearable.internal;

import java.util.HashMap;
import java.util.Map;

final class zzax {
    private final Map zzaot;

    zzax() {
        this.zzaot = new HashMap();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzb(com.google.android.gms.wearable.internal.zzbn r10) {
        /*
        r9 = this;
        r3 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r4 = r9.zzaot;
        monitor-enter(r4);
        r5 = new com.google.android.gms.wearable.internal.zzbm$zzo;	 Catch:{ all -> 0x00a6 }
        r5.<init>();	 Catch:{ all -> 0x00a6 }
        r0 = r9.zzaot;	 Catch:{ all -> 0x00a6 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00a6 }
        r6 = r0.iterator();	 Catch:{ all -> 0x00a6 }
    L_0x0014:
        r0 = r6.hasNext();	 Catch:{ all -> 0x00a6 }
        if (r0 == 0) goto L_0x0074;
    L_0x001a:
        r0 = r6.next();	 Catch:{ all -> 0x00a6 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00a6 }
        r1 = r0.getValue();	 Catch:{ all -> 0x00a6 }
        r1 = (com.google.android.gms.wearable.internal.zzbo) r1;	 Catch:{ all -> 0x00a6 }
        if (r1 == 0) goto L_0x0014;
    L_0x0028:
        r1.clear();	 Catch:{ all -> 0x00a6 }
        r2 = r10.isConnected();	 Catch:{ all -> 0x00a6 }
        if (r2 == 0) goto L_0x0072;
    L_0x0031:
        r2 = r10.zzoA();	 Catch:{ RemoteException -> 0x007b }
        r2 = (com.google.android.gms.wearable.internal.zzaw) r2;	 Catch:{ RemoteException -> 0x007b }
        r7 = new com.google.android.gms.wearable.internal.RemoveListenerRequest;	 Catch:{ RemoteException -> 0x007b }
        r7.<init>(r1);	 Catch:{ RemoteException -> 0x007b }
        r2.zza(r5, r7);	 Catch:{ RemoteException -> 0x007b }
        r2 = "WearableClient";
        r7 = 2;
        r2 = android.util.Log.isLoggable(r2, r7);	 Catch:{ RemoteException -> 0x007b }
        if (r2 == 0) goto L_0x0072;
    L_0x0049:
        r2 = "WearableClient";
        r7 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x007b }
        r7.<init>();	 Catch:{ RemoteException -> 0x007b }
        r8 = "disconnect: removed: ";
        r7 = r7.append(r8);	 Catch:{ RemoteException -> 0x007b }
        r8 = r0.getKey();	 Catch:{ RemoteException -> 0x007b }
        r7 = r7.append(r8);	 Catch:{ RemoteException -> 0x007b }
        r8 = "/";
        r7 = r7.append(r8);	 Catch:{ RemoteException -> 0x007b }
        r7 = r7.append(r1);	 Catch:{ RemoteException -> 0x007b }
        r7 = r7.toString();	 Catch:{ RemoteException -> 0x007b }
        android.util.Log.d(r2, r7);	 Catch:{ RemoteException -> 0x007b }
    L_0x0072:
        if (r3 == 0) goto L_0x0014;
    L_0x0074:
        r0 = r9.zzaot;	 Catch:{ all -> 0x00a6 }
        r0.clear();	 Catch:{ all -> 0x00a6 }
        monitor-exit(r4);	 Catch:{ all -> 0x00a6 }
        return;
    L_0x007b:
        r2 = move-exception;
        r2 = "WearableClient";
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a6 }
        r7.<init>();	 Catch:{ all -> 0x00a6 }
        r8 = "disconnect: Didn't remove: ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x00a6 }
        r0 = r0.getKey();	 Catch:{ all -> 0x00a6 }
        r0 = r7.append(r0);	 Catch:{ all -> 0x00a6 }
        r7 = "/";
        r0 = r0.append(r7);	 Catch:{ all -> 0x00a6 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00a6 }
        r0 = r0.toString();	 Catch:{ all -> 0x00a6 }
        android.util.Log.w(r2, r0);	 Catch:{ all -> 0x00a6 }
        goto L_0x0072;
    L_0x00a6:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00a6 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzax.zzb(com.google.android.gms.wearable.internal.zzbn):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzeb(android.os.IBinder r11) {
        /*
        r10 = this;
        r2 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r3 = r10.zzaot;
        monitor-enter(r3);
        r4 = com.google.android.gms.wearable.internal.zzaw.zza.zzea(r11);	 Catch:{ all -> 0x0094 }
        r5 = new com.google.android.gms.wearable.internal.zzbm$zzo;	 Catch:{ all -> 0x0094 }
        r5.<init>();	 Catch:{ all -> 0x0094 }
        r0 = r10.zzaot;	 Catch:{ all -> 0x0094 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0094 }
        r6 = r0.iterator();	 Catch:{ all -> 0x0094 }
    L_0x0018:
        r0 = r6.hasNext();	 Catch:{ all -> 0x0094 }
        if (r0 == 0) goto L_0x0067;
    L_0x001e:
        r0 = r6.next();	 Catch:{ all -> 0x0094 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0094 }
        r1 = r0.getValue();	 Catch:{ all -> 0x0094 }
        r1 = (com.google.android.gms.wearable.internal.zzbo) r1;	 Catch:{ all -> 0x0094 }
        r7 = new com.google.android.gms.wearable.internal.AddListenerRequest;	 Catch:{ RemoteException -> 0x0069 }
        r7.<init>(r1);	 Catch:{ RemoteException -> 0x0069 }
        r4.zza(r5, r7);	 Catch:{ RemoteException -> 0x0069 }
        r7 = "WearableClient";
        r8 = 2;
        r7 = android.util.Log.isLoggable(r7, r8);	 Catch:{ RemoteException -> 0x0069 }
        if (r7 == 0) goto L_0x0065;
    L_0x003c:
        r7 = "WearableClient";
        r8 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0069 }
        r8.<init>();	 Catch:{ RemoteException -> 0x0069 }
        r9 = "onPostInitHandler: added: ";
        r8 = r8.append(r9);	 Catch:{ RemoteException -> 0x0069 }
        r9 = r0.getKey();	 Catch:{ RemoteException -> 0x0069 }
        r8 = r8.append(r9);	 Catch:{ RemoteException -> 0x0069 }
        r9 = "/";
        r8 = r8.append(r9);	 Catch:{ RemoteException -> 0x0069 }
        r8 = r8.append(r1);	 Catch:{ RemoteException -> 0x0069 }
        r8 = r8.toString();	 Catch:{ RemoteException -> 0x0069 }
        android.util.Log.d(r7, r8);	 Catch:{ RemoteException -> 0x0069 }
    L_0x0065:
        if (r2 == 0) goto L_0x0018;
    L_0x0067:
        monitor-exit(r3);	 Catch:{ all -> 0x0094 }
        return;
    L_0x0069:
        r7 = move-exception;
        r7 = "WearableClient";
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0094 }
        r8.<init>();	 Catch:{ all -> 0x0094 }
        r9 = "onPostInitHandler: Didn't add: ";
        r8 = r8.append(r9);	 Catch:{ all -> 0x0094 }
        r0 = r0.getKey();	 Catch:{ all -> 0x0094 }
        r0 = r8.append(r0);	 Catch:{ all -> 0x0094 }
        r8 = "/";
        r0 = r0.append(r8);	 Catch:{ all -> 0x0094 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0094 }
        r0 = r0.toString();	 Catch:{ all -> 0x0094 }
        android.util.Log.d(r7, r0);	 Catch:{ all -> 0x0094 }
        goto L_0x0065;
    L_0x0094:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0094 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzax.zzeb(android.os.IBinder):void");
    }
}
