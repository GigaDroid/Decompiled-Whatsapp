package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import com.google.android.gms.gcm.zzb.zza;
import com.google.android.gms.iid.zzb;

public class GcmReceiver extends WakefulBroadcastReceiver {
    private static String zzazM;

    static {
        zzazM = "gcm.googleapis.com/refresh";
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        boolean z2 = zza.a;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("from");
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction()) || "google.com/iid".equals(stringExtra) || zzazM.equals(stringExtra)) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            zzd(context, intent);
            if (z2) {
                if (!zzb.zza.a) {
                    z = true;
                }
                zzb.zza.a = z;
            }
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        }
        WakefulBroadcastReceiver.startWakefulService(context, intent);
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    public void zzd(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }
}
