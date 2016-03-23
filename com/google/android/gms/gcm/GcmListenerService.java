package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;

public abstract class GcmListenerService extends Service {
    private int zzazD;
    private int zzazE;
    private final Object zzpc;

    class 1 implements Runnable {
        final Intent val$intent;
        final GcmListenerService zzazF;

        1(GcmListenerService gcmListenerService, Intent intent) {
            this.zzazF = gcmListenerService;
            this.val$intent = intent;
        }

        public void run() {
            GcmListenerService.zza(this.zzazF, this.val$intent);
        }
    }

    class 2 extends AsyncTask {
        final Intent val$intent;
        final GcmListenerService zzazF;

        2(GcmListenerService gcmListenerService, Intent intent) {
            this.zzazF = gcmListenerService;
            this.val$intent = intent;
        }

        protected Object doInBackground(Object[] objArr) {
            return zzb((Void[]) objArr);
        }

        protected Void zzb(Void[] voidArr) {
            GcmListenerService.zza(this.zzazF, this.val$intent);
            return null;
        }
    }

    public GcmListenerService() {
        this.zzpc = new Object();
        this.zzazE = 0;
    }

    static void zza(GcmListenerService gcmListenerService, Intent intent) {
        gcmListenerService.zzk(intent);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzk(android.content.Intent r5) {
        /*
        r4 = this;
        r2 = com.google.android.gms.gcm.zzb.zza.a;
        r0 = "com.google.android.c2dm.intent.RECEIVE";
        r1 = r5.getAction();	 Catch:{ all -> 0x00bd }
        r0 = r0.equals(r1);	 Catch:{ all -> 0x00bd }
        if (r0 != 0) goto L_0x0013;
    L_0x000f:
        android.support.v4.content.WakefulBroadcastReceiver.completeWakefulIntent(r5);
    L_0x0012:
        return;
    L_0x0013:
        r0 = "message_type";
        r0 = r5.getStringExtra(r0);	 Catch:{ all -> 0x00bd }
        if (r0 != 0) goto L_0x00c2;
    L_0x001c:
        r0 = "gcm";
        r1 = r0;
    L_0x0020:
        r0 = -1;
        r3 = r1.hashCode();	 Catch:{ all -> 0x00bd }
        switch(r3) {
            case -2062414158: goto L_0x0068;
            case 102161: goto L_0x005c;
            case 814694033: goto L_0x0080;
            case 814800675: goto L_0x0074;
            default: goto L_0x0028;
        };	 Catch:{ all -> 0x00bd }
    L_0x0028:
        switch(r0) {
            case 0: goto L_0x008b;
            case 1: goto L_0x0094;
            case 2: goto L_0x0099;
            case 3: goto L_0x00a5;
            default: goto L_0x002b;
        };	 Catch:{ all -> 0x00bd }
    L_0x002b:
        r0 = "GcmListenerService";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bd }
        r2.<init>();	 Catch:{ all -> 0x00bd }
        r3 = "Received message with unknown type: ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x00bd }
        r1 = r2.append(r1);	 Catch:{ all -> 0x00bd }
        r1 = r1.toString();	 Catch:{ all -> 0x00bd }
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x00bd }
    L_0x0045:
        r1 = r4.zzpc;	 Catch:{ all -> 0x00bd }
        monitor-enter(r1);	 Catch:{ all -> 0x00bd }
        r0 = r4.zzazE;	 Catch:{ all -> 0x00ba }
        r0 = r0 + -1;
        r4.zzazE = r0;	 Catch:{ all -> 0x00ba }
        r0 = r4.zzazE;	 Catch:{ all -> 0x00ba }
        if (r0 != 0) goto L_0x0057;
    L_0x0052:
        r0 = r4.zzazD;	 Catch:{ all -> 0x00ba }
        r4.zzgr(r0);	 Catch:{ all -> 0x00ba }
    L_0x0057:
        monitor-exit(r1);	 Catch:{ all -> 0x00ba }
        android.support.v4.content.WakefulBroadcastReceiver.completeWakefulIntent(r5);
        goto L_0x0012;
    L_0x005c:
        r3 = "gcm";
        r3 = r1.equals(r3);	 Catch:{ all -> 0x00bd }
        if (r3 == 0) goto L_0x0028;
    L_0x0065:
        r0 = 0;
        if (r2 == 0) goto L_0x0028;
    L_0x0068:
        r3 = "deleted_messages";
        r3 = r1.equals(r3);	 Catch:{ all -> 0x00bd }
        if (r3 == 0) goto L_0x0028;
    L_0x0071:
        r0 = 1;
        if (r2 == 0) goto L_0x0028;
    L_0x0074:
        r3 = "send_event";
        r3 = r1.equals(r3);	 Catch:{ all -> 0x00bd }
        if (r3 == 0) goto L_0x0028;
    L_0x007d:
        r0 = 2;
        if (r2 == 0) goto L_0x0028;
    L_0x0080:
        r3 = "send_error";
        r3 = r1.equals(r3);	 Catch:{ all -> 0x00bd }
        if (r3 == 0) goto L_0x0028;
    L_0x0089:
        r0 = 3;
        goto L_0x0028;
    L_0x008b:
        r0 = r5.getExtras();	 Catch:{ all -> 0x00bd }
        r4.zzt(r0);	 Catch:{ all -> 0x00bd }
        if (r2 == 0) goto L_0x0045;
    L_0x0094:
        r4.onDeletedMessages();	 Catch:{ all -> 0x00bd }
        if (r2 == 0) goto L_0x0045;
    L_0x0099:
        r0 = "google.message_id";
        r0 = r5.getStringExtra(r0);	 Catch:{ all -> 0x00bd }
        r4.onMessageSent(r0);	 Catch:{ all -> 0x00bd }
        if (r2 == 0) goto L_0x0045;
    L_0x00a5:
        r0 = "google.message_id";
        r0 = r5.getStringExtra(r0);	 Catch:{ all -> 0x00bd }
        r3 = "error";
        r3 = r5.getStringExtra(r3);	 Catch:{ all -> 0x00bd }
        r4.onSendError(r0, r3);	 Catch:{ all -> 0x00bd }
        if (r2 == 0) goto L_0x0045;
    L_0x00b8:
        goto L_0x002b;
    L_0x00ba:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ba }
        throw r0;	 Catch:{ all -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        android.support.v4.content.WakefulBroadcastReceiver.completeWakefulIntent(r5);
        throw r0;
    L_0x00c2:
        r1 = r0;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmListenerService.zzk(android.content.Intent):void");
    }

    private void zzt(Bundle bundle) {
        bundle.remove("message_type");
        bundle.remove("android.support.content.wakelockid");
        if (zza.zzu(bundle)) {
            zza.zzay(this).zzv(bundle);
            return;
        }
        String string = bundle.getString("from");
        bundle.remove("from");
        onMessageReceived(string, bundle);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(String str, Bundle bundle) {
    }

    public void onMessageSent(String str) {
    }

    public void onSendError(String str, String str2) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r5, int r6, int r7) {
        /*
        r4 = this;
        r0 = 0;
        r1 = com.google.android.gms.gcm.zzb.zza.a;
        r2 = r4.zzpc;
        monitor-enter(r2);
        r4.zzazD = r7;	 Catch:{ all -> 0x0035 }
        r3 = r4.zzazE;	 Catch:{ all -> 0x0035 }
        r3 = r3 + 1;
        r4.zzazE = r3;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 11;
        if (r2 < r3) goto L_0x0021;
    L_0x0015:
        r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR;
        r3 = new com.google.android.gms.gcm.GcmListenerService$1;
        r3.<init>(r4, r5);
        r2.execute(r3);
        if (r1 == 0) goto L_0x002b;
    L_0x0021:
        r2 = new com.google.android.gms.gcm.GcmListenerService$2;
        r2.<init>(r4, r5);
        r3 = new java.lang.Void[r0];
        r2.execute(r3);
    L_0x002b:
        r2 = 3;
        r3 = com.google.android.gms.iid.zzb.zza.a;
        if (r3 == 0) goto L_0x0034;
    L_0x0030:
        if (r1 == 0) goto L_0x0038;
    L_0x0032:
        com.google.android.gms.gcm.zzb.zza.a = r0;
    L_0x0034:
        return r2;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        throw r0;
    L_0x0038:
        r0 = 1;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmListenerService.onStartCommand(android.content.Intent, int, int):int");
    }

    boolean zzgr(int i) {
        return stopSelfResult(i);
    }
}
