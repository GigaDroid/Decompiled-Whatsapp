package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;

public class InstanceIDListenerService extends Service {
    static String ACTION;
    private static String zzaAX;
    private static String zzaAY;
    private static String zzazM;
    MessengerCompat zzaAV;
    BroadcastReceiver zzaAW;
    int zzaAZ;
    int zzaBa;

    class 1 extends Handler {
        final InstanceIDListenerService zzaBb;

        1(InstanceIDListenerService instanceIDListenerService, Looper looper) {
            this.zzaBb = instanceIDListenerService;
            super(looper);
        }

        public void handleMessage(Message message) {
            InstanceIDListenerService.zza(this.zzaBb, message, MessengerCompat.zzc(message));
        }
    }

    class 2 extends BroadcastReceiver {
        final InstanceIDListenerService zzaBb;

        2(InstanceIDListenerService instanceIDListenerService) {
            this.zzaBb = instanceIDListenerService;
        }

        public void onReceive(Context context, Intent intent) {
            if (Log.isLoggable("InstanceID", 3)) {
                intent.getStringExtra("registration_id");
                Log.d("InstanceID", "Received GSF callback using dynamic receiver: " + intent.getExtras());
            }
            this.zzaBb.zzn(intent);
            this.zzaBb.stop();
        }
    }

    static {
        ACTION = "action";
        zzaAX = "google.com/iid";
        zzaAY = "CMD";
        zzazM = "gcm.googleapis.com/refresh";
    }

    public InstanceIDListenerService() {
        this.zzaAV = new MessengerCompat(new 1(this, Looper.getMainLooper()));
        this.zzaAW = new 2(this);
    }

    static void zza(Context context, zzd com_google_android_gms_iid_zzd) {
        com_google_android_gms_iid_zzd.zzvF();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra(zzaAY, "RST");
        intent.setPackage(context.getPackageName());
        context.startService(intent);
    }

    private void zza(Message message, int i) {
        zzc.zzaD(this);
        getPackageManager();
        if (i == zzc.zzaBh || i == zzc.zzaBg) {
            zzn((Intent) message.obj);
        } else {
            Log.w("InstanceID", "Message from unexpected caller " + i + " mine=" + zzc.zzaBg + " appid=" + zzc.zzaBh);
        }
    }

    static void zza(InstanceIDListenerService instanceIDListenerService, Message message, int i) {
        instanceIDListenerService.zza(message, i);
    }

    static void zzaC(Context context) {
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(zzaAY, "SYNC");
        context.startService(intent);
    }

    public IBinder onBind(Intent intent) {
        return (intent == null || !"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) ? null : this.zzaAV.getBinder();
    }

    public void onCreate() {
        IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentFilter.addCategory(getPackageName());
        registerReceiver(this.zzaAW, intentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public void onDestroy() {
        unregisterReceiver(this.zzaAW);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        zzgz(i2);
        if (intent == null) {
            stop();
            return 2;
        }
        try {
            if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
                if (VERSION.SDK_INT <= 18) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("GSF");
                    if (intent2 != null) {
                        startService(intent2);
                        return 1;
                    }
                }
                zzn(intent);
            }
            stop();
            if (intent.getStringExtra("from") != null) {
                WakefulBroadcastReceiver.completeWakefulIntent(intent);
            }
            return 2;
        } finally {
            stop();
        }
    }

    public void onTokenRefresh() {
    }

    void stop() {
        synchronized (this) {
            this.zzaAZ--;
            if (this.zzaAZ == 0) {
                stopSelf(this.zzaBa);
            }
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Stop " + this.zzaAZ + " " + this.zzaBa);
            }
        }
    }

    public void zzaf(boolean z) {
        onTokenRefresh();
    }

    void zzgz(int i) {
        synchronized (this) {
            this.zzaAZ++;
            if (i > this.zzaBa) {
                this.zzaBa = i;
            }
        }
    }

    public void zzn(Intent intent) {
        InstanceID instance;
        int i = MessengerCompat.a;
        String stringExtra = intent.getStringExtra("subtype");
        if (stringExtra == null) {
            instance = InstanceID.getInstance(this);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("subtype", stringExtra);
            instance = InstanceID.zza(this, bundle);
        }
        String stringExtra2 = intent.getStringExtra(zzaAY);
        try {
            if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) {
                try {
                    if (Log.isLoggable("InstanceID", 3)) {
                        Log.d("InstanceID", "Service command " + stringExtra + " " + stringExtra2 + " " + intent.getExtras());
                    }
                    try {
                        if (intent.getStringExtra("unregistered") != null) {
                            zzd zzvA = instance.zzvA();
                            if (stringExtra == null) {
                                stringExtra = "";
                            }
                            zzvA.zzdt(stringExtra);
                            instance.zzvB().zzr(intent);
                            return;
                        }
                        try {
                            if (zzazM.equals(intent.getStringExtra("from"))) {
                                instance.zzvA().zzdt(stringExtra);
                                zzaf(false);
                                return;
                            }
                            try {
                                if ("RST".equals(stringExtra2)) {
                                    instance.zzvz();
                                    zzaf(true);
                                    if (i == 0) {
                                        return;
                                    }
                                }
                                if ("RST_FULL".equals(stringExtra2)) {
                                    try {
                                        if (!instance.zzvA().isEmpty()) {
                                            try {
                                                instance.zzvA().zzvF();
                                                zzaf(true);
                                                if (i == 0) {
                                                    return;
                                                }
                                            } catch (IOException e) {
                                                throw e;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (IOException e2) {
                                        throw e2;
                                    }
                                }
                                try {
                                    if ("SYNC".equals(stringExtra2)) {
                                        try {
                                            instance.zzvA().zzdt(stringExtra);
                                            zzaf(false);
                                            if (i == 0) {
                                                return;
                                            }
                                        } catch (IOException e22) {
                                            throw e22;
                                        }
                                    }
                                } catch (IOException e222) {
                                    throw e222;
                                }
                                try {
                                    if ("PING".equals(stringExtra2)) {
                                        try {
                                            GoogleCloudMessaging.getInstance(this).send(zzaAX, zzc.zzvE(), 0, intent.getExtras());
                                            return;
                                        } catch (IOException e3) {
                                            Log.w("InstanceID", "Failed to send ping response");
                                            return;
                                        }
                                    }
                                    return;
                                } catch (IOException e2222) {
                                    throw e2222;
                                }
                            } catch (IOException e22222) {
                                throw e22222;
                            } catch (IOException e222222) {
                                throw e222222;
                            }
                        } catch (IOException e2222222) {
                            throw e2222222;
                        }
                    } catch (IOException e22222222) {
                        throw e22222222;
                    } catch (IOException e222222222) {
                        throw e222222222;
                    }
                } catch (IOException e2222222222) {
                    throw e2222222222;
                }
            }
            if (Log.isLoggable("InstanceID", 3)) {
                try {
                    Log.d("InstanceID", "Register result in service " + stringExtra);
                } catch (IOException e22222222222) {
                    throw e22222222222;
                }
            }
            instance.zzvB().zzr(intent);
        } catch (IOException e222222222222) {
            throw e222222222222;
        } catch (IOException e2222222222222) {
            throw e2222222222222;
        }
    }
}
