package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.gcm.zzb.zza;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleCloudMessaging {
    public static int zzazR;
    public static int zzazS;
    public static int zzazT;
    static GoogleCloudMessaging zzazU;
    private static final AtomicInteger zzazX;
    private Context context;
    private PendingIntent zzazV;
    private Map zzazW;
    private final BlockingQueue zzazY;
    final Messenger zzazZ;

    class 1 extends Handler {
        final GoogleCloudMessaging zzaAa;

        1(GoogleCloudMessaging googleCloudMessaging, Looper looper) {
            this.zzaAa = googleCloudMessaging;
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message == null || !(message.obj instanceof Intent)) {
                Log.w("GCM", "Dropping invalid message");
            }
            Intent intent = (Intent) message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
                GoogleCloudMessaging.zza(this.zzaAa).add(intent);
                if (!zza.a) {
                    return;
                }
            }
            if (!GoogleCloudMessaging.zza(this.zzaAa, intent)) {
                intent.setPackage(GoogleCloudMessaging.zzb(this.zzaAa).getPackageName());
                GoogleCloudMessaging.zzb(this.zzaAa).sendBroadcast(intent);
            }
        }
    }

    static {
        zzazR = 5000000;
        zzazS = 6500000;
        zzazT = 7000000;
        zzazX = new AtomicInteger(1);
    }

    public GoogleCloudMessaging() {
        this.zzazY = new LinkedBlockingQueue();
        this.zzazW = Collections.synchronizedMap(new HashMap());
        this.zzazZ = new Messenger(new 1(this, Looper.getMainLooper()));
    }

    public static synchronized GoogleCloudMessaging getInstance(Context context) {
        GoogleCloudMessaging googleCloudMessaging;
        synchronized (GoogleCloudMessaging.class) {
            try {
                if (zzazU == null) {
                    zzazU = new GoogleCloudMessaging();
                    zzazU.context = context.getApplicationContext();
                }
                googleCloudMessaging = zzazU;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return googleCloudMessaging;
    }

    static BlockingQueue zza(GoogleCloudMessaging googleCloudMessaging) {
        return googleCloudMessaging.zzazY;
    }

    private void zza(String str, String str2, long j, int i, Bundle bundle) {
        boolean z = zza.a;
        if (str == null) {
            try {
                throw new IllegalArgumentException("Missing 'to'");
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            try {
                intent.putExtras(bundle);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        zzm(intent);
        intent.setPackage(zzaz(this.context));
        intent.putExtra("google.to", str);
        intent.putExtra("google.message_id", str2);
        intent.putExtra("google.ttl", Long.toString(j));
        intent.putExtra("google.delay", Integer.toString(i));
        if (zzaz(this.context).contains(".gsf")) {
            Bundle bundle2 = new Bundle();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                try {
                    if (obj instanceof String) {
                        bundle2.putString("gcm." + str3, (String) obj);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            bundle2.putString("google.to", str);
            bundle2.putString("google.message_id", str2);
            InstanceID.getInstance(this.context).zzc("GCM", "upstream", bundle2);
            return;
        }
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    static boolean zza(GoogleCloudMessaging googleCloudMessaging, Intent intent) {
        return googleCloudMessaging.zzl(intent);
    }

    public static int zzaA(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(zzaz(context), 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    public static String zzaz(Context context) {
        return zzc.zzaD(context);
    }

    static Context zzb(GoogleCloudMessaging googleCloudMessaging) {
        return googleCloudMessaging.context;
    }

    private boolean zzl(Intent intent) {
        Object stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null) {
            try {
                if (intent.hasExtra("error")) {
                    stringExtra = intent.getStringExtra("google.message_id");
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (stringExtra != null) {
            Handler handler = (Handler) this.zzazW.remove(stringExtra);
            if (handler != null) {
                Message obtain = Message.obtain();
                obtain.obj = intent;
                return handler.sendMessage(obtain);
            }
        }
        return false;
    }

    public void send(String str, String str2, long j, Bundle bundle) {
        zza(str, str2, j, -1, bundle);
    }

    synchronized void zzm(Intent intent) {
        if (this.zzazV == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.zzazV = PendingIntent.getBroadcast(this.context, 0, intent2, 0);
        }
        intent.putExtra("app", this.zzazV);
    }
}
