package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class InstanceID {
    static Map zzaAO;
    private static zzd zzaAP;
    private static zzc zzaAQ;
    static String zzaAU;
    Context mContext;
    KeyPair zzaAR;
    String zzaAS;
    long zzaAT;

    static {
        zzaAO = new HashMap();
    }

    protected InstanceID(Context context, String str, Bundle bundle) {
        this.zzaAS = "";
        this.mContext = context.getApplicationContext();
        this.zzaAS = str;
    }

    public static InstanceID getInstance(Context context) {
        return zza(context, null);
    }

    public static synchronized InstanceID zza(Context context, Bundle bundle) {
        InstanceID instanceID;
        synchronized (InstanceID.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            String str = string == null ? "" : string;
            Context applicationContext = context.getApplicationContext();
            if (zzaAP == null) {
                zzaAP = new zzd(applicationContext);
                zzaAQ = new zzc(applicationContext);
            }
            zzaAU = Integer.toString(zzaB(applicationContext));
            instanceID = (InstanceID) zzaAO.get(str);
            if (instanceID == null) {
                instanceID = new InstanceID(applicationContext, str, bundle);
                zzaAO.put(str, instanceID);
            }
        }
        return instanceID;
    }

    static String zza(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }

    static int zzaB(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.w("InstanceID", "Never happens: can't find own package " + e);
            return i;
        }
    }

    static String zzm(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public String getToken(String str, String str2) {
        return getToken(str, str2, null);
    }

    public String getToken(String str, String str2, Bundle bundle) {
        Object obj = null;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        Object obj2 = 1;
        String zzg = zzvC() ? null : zzaAP.zzg(this.zzaAS, str, str2);
        if (zzg == null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.getString("ttl") != null) {
                obj2 = null;
            }
            if (!"jwt".equals(bundle.getString("type"))) {
                obj = obj2;
            }
            zzg = zzc(str, str2, bundle);
            Log.w("InstanceID", "token: " + zzg);
            if (!(zzg == null || r1 == null)) {
                zzaAP.zza(this.zzaAS, str, str2, zzg, zzaAU);
            }
        }
        return zzg;
    }

    public String zzc(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.zzaAS) ? str : this.zzaAS;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        return zzaAQ.zzp(zzaAQ.zza(bundle, zzvy()));
    }

    zzd zzvA() {
        return zzaAP;
    }

    zzc zzvB() {
        return zzaAQ;
    }

    boolean zzvC() {
        String str = zzaAP.get("appVersion");
        if (str == null || !str.equals(zzaAU)) {
            return true;
        }
        str = zzaAP.get("lastToken");
        if (str == null) {
            return true;
        }
        return (System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(str)).longValue() > 604800;
    }

    KeyPair zzvy() {
        if (this.zzaAR == null) {
            this.zzaAR = zzaAP.zzdr(this.zzaAS);
        }
        if (this.zzaAR == null) {
            this.zzaAT = System.currentTimeMillis();
            this.zzaAR = zzaAP.zze(this.zzaAS, this.zzaAT);
        }
        return this.zzaAR;
    }

    void zzvz() {
        this.zzaAT = 0;
        zzaAP.zzds(this.zzaAS);
        this.zzaAR = null;
    }
}
