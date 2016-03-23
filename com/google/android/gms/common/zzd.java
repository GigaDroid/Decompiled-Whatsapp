package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;

public class zzd {
    private static final zzd zzYA;

    static {
        zzYA = new zzd();
    }

    private zzd() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean zza(android.content.pm.PackageInfo r6, boolean r7) {
        /*
        r5 = this;
        r2 = 1;
        r1 = 0;
        r0 = r6.signatures;
        r0 = r0.length;
        if (r0 == r2) goto L_0x0012;
    L_0x0007:
        r0 = "GoogleSignatureVerifier";
        r2 = "Package has more than one signature.";
        android.util.Log.w(r0, r2);
        r0 = r1;
    L_0x0011:
        return r0;
    L_0x0012:
        r3 = new com.google.android.gms.common.zzc$zzb;
        r0 = r6.signatures;
        r0 = r0[r1];
        r0 = r0.toByteArray();
        r3.<init>(r0);
        if (r7 == 0) goto L_0x0029;
    L_0x0021:
        r0 = com.google.android.gms.common.zzc.zzmT();
        r4 = com.google.android.gms.common.GooglePlayServicesUtil.a;
        if (r4 == 0) goto L_0x002d;
    L_0x0029:
        r0 = com.google.android.gms.common.zzc.zzmU();
    L_0x002d:
        r0 = r0.contains(r3);
        if (r0 == 0) goto L_0x0035;
    L_0x0033:
        r0 = r2;
        goto L_0x0011;
    L_0x0035:
        r0 = "GoogleSignatureVerifier";
        r2 = 2;
        r0 = android.util.Log.isLoggable(r0, r2);
        if (r0 == 0) goto L_0x0061;
    L_0x003f:
        r0 = "GoogleSignatureVerifier";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "Signature not valid.  Found: \n";
        r2 = r2.append(r4);
        r3 = r3.getBytes();
        r3 = android.util.Base64.encodeToString(r3, r1);
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.v(r0, r2);
    L_0x0061:
        r0 = r1;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzd.zza(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static zzd zzmY() {
        return zzYA;
    }

    zza zza(PackageInfo packageInfo, zza[] com_google_android_gms_common_zzc_zzaArr) {
        boolean z = GooglePlayServicesUtil.a;
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zza com_google_android_gms_common_zzc_zzb = new zzb(packageInfo.signatures[0].toByteArray());
        int i = 0;
        while (i < com_google_android_gms_common_zzc_zzaArr.length) {
            if (!com_google_android_gms_common_zzc_zzaArr[i].equals(com_google_android_gms_common_zzc_zzb)) {
                i++;
                if (z) {
                    break;
                }
            }
            return com_google_android_gms_common_zzc_zzaArr[i];
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(com_google_android_gms_common_zzc_zzb.getBytes(), 0));
        }
        return null;
    }

    public boolean zza(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (GooglePlayServicesUtil.zzc(packageManager)) {
            return zza(packageInfo, true);
        }
        boolean zza = zza(packageInfo, false);
        if (zza || !zza(packageInfo, true)) {
            return zza;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return zza;
    }

    public boolean zzb(PackageManager packageManager, String str) {
        try {
            return zza(packageManager, packageManager.getPackageInfo(str, 64));
        } catch (NameNotFoundException e) {
            try {
                if (Log.isLoggable("GoogleSignatureVerifier", 3)) {
                    Log.d("GoogleSignatureVerifier", "Package manager can't find package " + str + ", defaulting to false");
                }
                return false;
            } catch (NameNotFoundException e2) {
                throw e2;
            }
        }
    }
}
