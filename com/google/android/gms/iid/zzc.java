package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.zzb.zza;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class zzc {
    static String zzaBf;
    static int zzaBg;
    static int zzaBh;
    static int zzaBi;
    Context context;
    Map zzaBj;
    Messenger zzaBk;
    MessengerCompat zzaBl;
    long zzaBm;
    long zzaBn;
    int zzaBo;
    int zzaBp;
    long zzaBq;
    PendingIntent zzazV;
    Messenger zzazZ;

    class 1 extends Handler {
        final zzc zzaBr;

        1(zzc com_google_android_gms_iid_zzc, Looper looper) {
            this.zzaBr = com_google_android_gms_iid_zzc;
            super(looper);
        }

        public void handleMessage(Message message) {
            this.zzaBr.zze(message);
        }
    }

    static {
        zzaBf = null;
        zzaBg = 0;
        zzaBh = 0;
        zzaBi = 0;
    }

    public zzc(Context context) {
        this.zzaBj = new HashMap();
        this.context = context;
    }

    static String zza(KeyPair keyPair, String[] strArr) {
        String str = null;
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes("UTF-8");
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature instance = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                str = InstanceID.zzm(instance.sign());
            } catch (UnsupportedEncodingException e) {
                throw e;
            } catch (Throwable e2) {
                Log.e("InstanceID/Rpc", "Unable to sign registration request", e2);
            }
        } catch (Throwable e22) {
            Log.e("InstanceID/Rpc", "Unable to encode string", e22);
        }
        return str;
    }

    public static String zzaD(Context context) {
        ApplicationInfo applicationInfo;
        int i = MessengerCompat.a;
        try {
            if (zzaBf != null) {
                return zzaBf;
            }
            zzaBg = Process.myUid();
            PackageManager packageManager = context.getPackageManager();
            for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
                if (packageManager.checkPermission("com.google.android.c2dm.permission.RECEIVE", resolveInfo.serviceInfo.packageName) == 0) {
                    try {
                        ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(resolveInfo.serviceInfo.packageName, 0);
                        Log.w("InstanceID/Rpc", "Found " + applicationInfo2.uid);
                        zzaBh = applicationInfo2.uid;
                        zzaBf = resolveInfo.serviceInfo.packageName;
                        return zzaBf;
                    } catch (NameNotFoundException e) {
                        if (i == 0) {
                            continue;
                        }
                    }
                }
                try {
                    Log.w("InstanceID/Rpc", "Possible malicious package " + resolveInfo.serviceInfo.packageName + " declares " + "com.google.android.c2dm.intent.REGISTER" + " without permission");
                    if (i != 0) {
                        break;
                    }
                } catch (NameNotFoundException e2) {
                    throw e2;
                }
            }
            Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
            try {
                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                zzaBf = applicationInfo.packageName;
                zzaBh = applicationInfo.uid;
                return zzaBf;
            } catch (NameNotFoundException e3) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gsf", 0);
                    zzaBf = applicationInfo.packageName;
                    zzaBh = applicationInfo.uid;
                    return zzaBf;
                } catch (NameNotFoundException e4) {
                    Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                    return null;
                }
            }
        } catch (NameNotFoundException e22) {
            throw e22;
        }
    }

    private Intent zzb(Bundle bundle, KeyPair keyPair) {
        Intent intent;
        ConditionVariable conditionVariable = new ConditionVariable();
        String zzvE = zzvE();
        synchronized (getClass()) {
            this.zzaBj.put(zzvE, conditionVariable);
        }
        zza(bundle, keyPair, zzvE);
        conditionVariable.block(30000);
        synchronized (getClass()) {
            Object remove = this.zzaBj.remove(zzvE);
            if (remove instanceof Intent) {
                intent = (Intent) remove;
            } else if (remove instanceof String) {
                throw new IOException((String) remove);
            } else {
                Log.w("InstanceID/Rpc", "No response " + remove);
                throw new IOException("TIMEOUT");
            }
        }
        return intent;
    }

    private void zzdo(String str) {
        if ("com.google.android.gsf".equals(zzaBf)) {
            this.zzaBo++;
            if (this.zzaBo >= 3) {
                if (this.zzaBo == 3) {
                    this.zzaBp = new Random().nextInt(1000) + 1000;
                }
                this.zzaBp *= 2;
                this.zzaBq = SystemClock.elapsedRealtime() + ((long) this.zzaBp);
                Log.w("InstanceID/Rpc", "Backoff due to " + str + " for " + this.zzaBp);
            }
        }
    }

    private void zze(Object obj, Object obj2) {
        try {
            if (obj instanceof ConditionVariable) {
                ((ConditionVariable) obj).open();
            }
            if (obj instanceof Messenger) {
                Messenger messenger = (Messenger) obj;
                Message obtain = Message.obtain();
                obtain.obj = obj2;
                try {
                    messenger.send(obtain);
                } catch (RemoteException e) {
                    Log.w("InstanceID/Rpc", "Failed to send response " + e);
                }
            }
        } catch (RemoteException e2) {
            throw e2;
        }
    }

    private void zzi(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.zzaBj.get(str);
            this.zzaBj.put(str, obj);
            zze(obj2, obj);
        }
    }

    public static synchronized String zzvE() {
        String num;
        synchronized (zzc.class) {
            int i = zzaBi;
            zzaBi = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private void zzz(Object obj) {
        int i = MessengerCompat.a;
        synchronized (getClass()) {
            for (String str : this.zzaBj.keySet()) {
                Object obj2 = this.zzaBj.get(str);
                this.zzaBj.put(str, obj);
                zze(obj2, obj);
                if (i != 0) {
                    break;
                }
            }
        }
    }

    Intent zza(Bundle bundle, KeyPair keyPair) {
        Intent zzb = zzb(bundle, keyPair);
        return (zzb == null || !zzb.hasExtra("google.messenger")) ? zzb : zzb(bundle, keyPair);
    }

    void zza(Bundle bundle, KeyPair keyPair, String str) {
        boolean z = false;
        int i = MessengerCompat.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzaBq == 0 || elapsedRealtime > this.zzaBq) {
            zzvD();
            if (zzaBf == null) {
                throw new IOException("MISSING_INSTANCEID_SERVICE");
            }
            this.zzaBm = SystemClock.elapsedRealtime();
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(zzaBf);
            bundle.putString("gmsv", Integer.toString(GoogleCloudMessaging.zzaA(this.context)));
            bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
            bundle.putString("app_ver", Integer.toString(InstanceID.zzaB(this.context)));
            bundle.putString("cliv", "1");
            bundle.putString("appid", InstanceID.zza(keyPair));
            bundle.putString("pub2", InstanceID.zzm(keyPair.getPublic().getEncoded()));
            bundle.putString("sig", zza(keyPair, new String[]{this.context.getPackageName(), r4}));
            intent.putExtras(bundle);
            zzo(intent);
            zzb(intent, str);
            if (i != 0) {
                if (!zza.a) {
                    z = true;
                }
                zza.a = z;
                return;
            }
            return;
        }
        Log.w("InstanceID/Rpc", "Backoff mode, next request attempt: " + (this.zzaBq - elapsedRealtime) + " interval: " + this.zzaBp);
        throw new IOException("RETRY_LATER");
    }

    protected void zzb(Intent intent, String str) {
        this.zzaBm = SystemClock.elapsedRealtime();
        intent.putExtra("kid", "|ID|" + str + "|");
        intent.putExtra("X-kid", "|ID|" + str + "|");
        boolean equals = "com.google.android.gsf".equals(zzaBf);
        String stringExtra = intent.getStringExtra("useGsf");
        if (stringExtra != null) {
            equals = "1".equals(stringExtra);
        }
        try {
            if (Log.isLoggable("InstanceID/Rpc", 3)) {
                Log.d("InstanceID/Rpc", "Sending " + intent.getExtras());
            }
            if (this.zzaBk != null) {
                intent.putExtra("google.messenger", this.zzazZ);
                Message obtain = Message.obtain();
                obtain.obj = intent;
                try {
                    this.zzaBk.send(obtain);
                    return;
                } catch (RemoteException e) {
                    try {
                        if (Log.isLoggable("InstanceID/Rpc", 3)) {
                            Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                        }
                    } catch (RemoteException e2) {
                        throw e2;
                    }
                }
            }
            if (equals) {
                Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID");
                try {
                    intent2.setPackage(this.context.getPackageName());
                    intent2.putExtra("GSF", intent);
                    this.context.startService(intent2);
                    if (MessengerCompat.a == 0) {
                        return;
                    }
                } catch (RemoteException e22) {
                    throw e22;
                }
            }
            intent.putExtra("google.messenger", this.zzazZ);
            intent.putExtra("messenger2", "1");
            if (this.zzaBl != null) {
                Message obtain2 = Message.obtain();
                obtain2.obj = intent;
                try {
                    this.zzaBl.send(obtain2);
                    return;
                } catch (RemoteException e3) {
                    try {
                        if (Log.isLoggable("InstanceID/Rpc", 3)) {
                            Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                        }
                    } catch (RemoteException e222) {
                        throw e222;
                    }
                }
            }
            this.context.startService(intent);
        } catch (RemoteException e2222) {
            throw e2222;
        }
    }

    public void zze(Message message) {
        if (message != null) {
            if (message.obj instanceof Intent) {
                Intent intent = (Intent) message.obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.zzaBl = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.zzaBk = (Messenger) parcelableExtra;
                    }
                }
                zzr((Intent) message.obj);
                if (MessengerCompat.a == 0) {
                    return;
                }
            }
            Log.w("InstanceID/Rpc", "Dropping invalid message");
        }
    }

    synchronized void zzo(Intent intent) {
        if (this.zzazV == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.zzazV = PendingIntent.getBroadcast(this.context, 0, intent2, 0);
        }
        intent.putExtra("app", this.zzazV);
    }

    String zzp(Intent intent) {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        intent.getLongExtra("Retry-After", 0);
        if (stringExtra != null) {
            if (stringExtra == null) {
                return stringExtra;
            }
            stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                throw new IOException(stringExtra);
            }
            Log.w("InstanceID/Rpc", "Unexpected response from GCM " + intent.getExtras(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } else if (stringExtra == null) {
            return stringExtra;
        } else {
            stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                Log.w("InstanceID/Rpc", "Unexpected response from GCM " + intent.getExtras(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException(stringExtra);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void zzq(android.content.Intent r13) {
        /*
        r12 = this;
        r10 = 0;
        r9 = 3;
        r8 = 2;
        r7 = 1;
        r2 = com.google.android.gms.iid.MessengerCompat.a;
        r0 = "error";
        r1 = r13.getStringExtra(r0);
        if (r1 != 0) goto L_0x002f;
    L_0x0010:
        r0 = "InstanceID/Rpc";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected response, no error or registration id ";
        r1 = r1.append(r2);
        r2 = r13.getExtras();
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
    L_0x002e:
        return;
    L_0x002f:
        r0 = "InstanceID/Rpc";
        r0 = android.util.Log.isLoggable(r0, r9);
        if (r0 == 0) goto L_0x0052;
    L_0x0038:
        r0 = "InstanceID/Rpc";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Received InstanceID error ";
        r3 = r3.append(r4);
        r3 = r3.append(r1);
        r3 = r3.toString();
        android.util.Log.d(r0, r3);
    L_0x0052:
        r0 = 0;
        r3 = "|";
        r3 = r1.startsWith(r3);
        if (r3 == 0) goto L_0x00a2;
    L_0x005c:
        r3 = "\\|";
        r3 = r1.split(r3);
        r4 = "ID";
        r5 = r3[r7];
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x0088;
    L_0x006e:
        r4 = "InstanceID/Rpc";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Unexpected structured response ";
        r5 = r5.append(r6);
        r1 = r5.append(r1);
        r1 = r1.toString();
        android.util.Log.w(r4, r1);
    L_0x0088:
        r1 = r3.length;
        if (r1 <= r8) goto L_0x0101;
    L_0x008b:
        r0 = r3[r8];
        r1 = r3[r9];
        r3 = ":";
        r3 = r1.startsWith(r3);
        if (r3 == 0) goto L_0x009c;
    L_0x0098:
        r1 = r1.substring(r7);
    L_0x009c:
        r3 = "error";
        r13.putExtra(r3, r1);
    L_0x00a2:
        if (r0 != 0) goto L_0x00a9;
    L_0x00a4:
        r12.zzz(r1);
        if (r2 == 0) goto L_0x00ac;
    L_0x00a9:
        r12.zzi(r0, r1);
    L_0x00ac:
        r0 = "Retry-After";
        r4 = r13.getLongExtra(r0, r10);
        r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x00ea;
    L_0x00b7:
        r6 = android.os.SystemClock.elapsedRealtime();
        r12.zzaBn = r6;
        r0 = (int) r4;
        r0 = r0 * 1000;
        r12.zzaBp = r0;
        r4 = android.os.SystemClock.elapsedRealtime();
        r0 = r12.zzaBp;
        r6 = (long) r0;
        r4 = r4 + r6;
        r12.zzaBq = r4;
        r0 = "InstanceID/Rpc";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Explicit request from server to backoff: ";
        r3 = r3.append(r4);
        r4 = r12.zzaBp;
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.w(r0, r3);
        if (r2 == 0) goto L_0x002e;
    L_0x00ea:
        r0 = "SERVICE_NOT_AVAILABLE";
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x00fc;
    L_0x00f3:
        r0 = "AUTHENTICATION_FAILED";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x002e;
    L_0x00fc:
        r12.zzdo(r1);
        goto L_0x002e;
    L_0x0101:
        r1 = "UNKNOWN";
        goto L_0x009c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzc.zzq(android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void zzr(android.content.Intent r9) {
        /*
        r8 = this;
        r7 = 1;
        r3 = 0;
        r6 = 3;
        r2 = com.google.android.gms.iid.MessengerCompat.a;
        if (r9 != 0) goto L_0x001a;
    L_0x0007:
        r0 = "InstanceID/Rpc";
        r0 = android.util.Log.isLoggable(r0, r6);
        if (r0 == 0) goto L_0x0019;
    L_0x0010:
        r0 = "InstanceID/Rpc";
        r1 = "Unexpected response: null";
        android.util.Log.d(r0, r1);
    L_0x0019:
        return;
    L_0x001a:
        r0 = r9.getAction();
        r1 = "com.google.android.c2dm.intent.REGISTRATION";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0058;
    L_0x0027:
        r1 = "com.google.android.gms.iid.InstanceID";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0058;
    L_0x0030:
        r0 = "InstanceID/Rpc";
        r0 = android.util.Log.isLoggable(r0, r6);
        if (r0 == 0) goto L_0x0019;
    L_0x0039:
        r0 = "InstanceID/Rpc";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected response ";
        r1 = r1.append(r2);
        r2 = r9.getAction();
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
        goto L_0x0019;
    L_0x0058:
        r0 = "registration_id";
        r0 = r9.getStringExtra(r0);
        if (r0 != 0) goto L_0x0148;
    L_0x0061:
        r0 = "unregistered";
        r0 = r9.getStringExtra(r0);
        r1 = r0;
    L_0x0069:
        if (r1 != 0) goto L_0x006f;
    L_0x006b:
        r8.zzq(r9);
        goto L_0x0019;
    L_0x006f:
        r4 = android.os.SystemClock.elapsedRealtime();
        r8.zzaBm = r4;
        r4 = 0;
        r8.zzaBq = r4;
        r8.zzaBo = r3;
        r8.zzaBp = r3;
        r0 = "InstanceID/Rpc";
        r0 = android.util.Log.isLoggable(r0, r6);
        if (r0 == 0) goto L_0x00af;
    L_0x0086:
        r0 = "InstanceID/Rpc";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "AppIDResponse: ";
        r3 = r3.append(r4);
        r3 = r3.append(r1);
        r4 = " ";
        r3 = r3.append(r4);
        r4 = r9.getExtras();
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.d(r0, r3);
    L_0x00af:
        r0 = 0;
        r3 = "|";
        r3 = r1.startsWith(r3);
        if (r3 == 0) goto L_0x013c;
    L_0x00b9:
        r0 = "\\|";
        r0 = r1.split(r0);
        r3 = "ID";
        r4 = r0[r7];
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x00e5;
    L_0x00cb:
        r3 = "InstanceID/Rpc";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Unexpected structured response ";
        r4 = r4.append(r5);
        r1 = r4.append(r1);
        r1 = r1.toString();
        android.util.Log.w(r3, r1);
    L_0x00e5:
        r1 = 2;
        r1 = r0[r1];
        r3 = r0.length;
        r4 = 4;
        if (r3 <= r4) goto L_0x0123;
    L_0x00ec:
        r3 = "SYNC";
        r4 = r0[r6];
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00fe;
    L_0x00f7:
        r3 = r8.context;
        com.google.android.gms.iid.InstanceIDListenerService.zzaC(r3);
        if (r2 == 0) goto L_0x0123;
    L_0x00fe:
        r3 = "RST";
        r4 = r0[r6];
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0123;
    L_0x0109:
        r0 = r8.context;
        r2 = r8.context;
        r2 = com.google.android.gms.iid.InstanceID.getInstance(r2);
        r2 = r2.zzvA();
        com.google.android.gms.iid.InstanceIDListenerService.zza(r0, r2);
        r0 = "registration_id";
        r9.removeExtra(r0);
        r8.zzi(r1, r9);
        goto L_0x0019;
    L_0x0123:
        r3 = r0.length;
        r3 = r3 + -1;
        r0 = r0[r3];
        r3 = ":";
        r3 = r0.startsWith(r3);
        if (r3 == 0) goto L_0x0135;
    L_0x0131:
        r0 = r0.substring(r7);
    L_0x0135:
        r3 = "registration_id";
        r9.putExtra(r3, r0);
        r0 = r1;
    L_0x013c:
        if (r0 != 0) goto L_0x0143;
    L_0x013e:
        r8.zzz(r9);
        if (r2 == 0) goto L_0x0019;
    L_0x0143:
        r8.zzi(r0, r9);
        goto L_0x0019;
    L_0x0148:
        r1 = r0;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzc.zzr(android.content.Intent):void");
    }

    void zzvD() {
        if (this.zzazZ == null) {
            zzaD(this.context);
            this.zzazZ = new Messenger(new 1(this, Looper.getMainLooper()));
        }
    }
}
