package com.google.android.gms.common;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.d;
import com.google.android.gms.internal.zzlk;
import com.google.android.gms.internal.zzlv;
import com.whatsapp.arj;
import java.util.concurrent.atomic.AtomicBoolean;
import org.whispersystems.Y;
import org.whispersystems.at;

public final class GooglePlayServicesUtil {
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static boolean a;
    public static boolean zzYu;
    public static boolean zzYv;
    private static int zzYw;
    private static String zzYx;
    private static Integer zzYy;
    static final AtomicBoolean zzYz;
    private static final Object zzpm;

    static {
        GOOGLE_PLAY_SERVICES_VERSION_CODE = zzmW();
        zzYu = false;
        zzYv = false;
        zzYw = -1;
        zzpm = new Object();
        zzYx = null;
        zzYy = null;
        zzYz = new AtomicBoolean();
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        return zza(i, activity, null, i2, onCancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        Intent zzbc = zzbc(i);
        return zzbc == null ? null : PendingIntent.getActivity(context, i2, zzbc, 268435456);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        if (zzd.zzacF) {
            return 0;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(d.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            zzad(context);
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            zzd zzmY = zzd.zzmY();
            if (!zzlk.zzbX(packageInfo.versionCode) && !zzlk.zzao(context)) {
                try {
                    if (zzmY.zza(packageManager.getPackageInfo("com.android.vending", 64), zzbu.zzYt) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                        return 9;
                    }
                    try {
                        if (zzmY.zza(packageInfo, new zza[]{zzmY.zza(packageManager.getPackageInfo("com.android.vending", 64), zzbu.zzYt)}) == null) {
                            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                            return 9;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (NameNotFoundException e2) {
                    if (zzh(context, "com.android.vending")) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                        if (zzmY.zza(packageInfo, zzbu.zzYt) == null) {
                            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                            return 9;
                        }
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                    return 9;
                }
            } else if (zzmY.zza(packageInfo, zzbu.zzYt) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (zzlk.zzbV(packageInfo.versionCode) < zzlk.zzbV(GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + GOOGLE_PLAY_SERVICES_VERSION_CODE + " but found " + packageInfo.versionCode);
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (NameNotFoundException e3) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                    e3.printStackTrace();
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        switch (i) {
            case at.g /*1*/:
            case at.i /*2*/:
            case at.o /*3*/:
            case Y.l /*9*/:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean showErrorDialogFragment(int r5, android.app.Activity r6, android.support.v4.app.Fragment r7, int r8, android.content.DialogInterface.OnCancelListener r9) {
        /*
        r0 = 0;
        r1 = a;
        r2 = zza(r5, r6, r7, r8, r9);
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = r6 instanceof android.support.v4.app.FragmentActivity;	 Catch:{ NoClassDefFoundError -> 0x0046 }
    L_0x000c:
        if (r0 == 0) goto L_0x0021;
    L_0x000e:
        r0 = r6;
        r0 = (android.support.v4.app.FragmentActivity) r0;
        r0 = r0.getSupportFragmentManager();
        r3 = com.google.android.gms.common.SupportErrorDialogFragment.newInstance(r2, r9);
        r4 = "GooglePlayServicesErrorDialog";
        r3.show(r0, r4);	 Catch:{ NoClassDefFoundError -> 0x0042 }
        if (r1 == 0) goto L_0x0044;
    L_0x0021:
        r0 = com.google.android.gms.internal.zzlv.zzpO();	 Catch:{ NoClassDefFoundError -> 0x0042 }
        if (r0 == 0) goto L_0x0037;
    L_0x0027:
        r0 = r6.getFragmentManager();
        r2 = com.google.android.gms.common.ErrorDialogFragment.newInstance(r2, r9);
        r3 = "GooglePlayServicesErrorDialog";
        r2.show(r0, r3);	 Catch:{ NoClassDefFoundError -> 0x0040 }
        if (r1 == 0) goto L_0x0044;
    L_0x0037:
        r0 = new java.lang.RuntimeException;	 Catch:{ NoClassDefFoundError -> 0x0040 }
        r1 = "This Activity does not support Fragments.";
        r0.<init>(r1);	 Catch:{ NoClassDefFoundError -> 0x0040 }
        throw r0;	 Catch:{ NoClassDefFoundError -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = 1;
        goto L_0x0009;
    L_0x0046:
        r3 = move-exception;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(int, android.app.Activity, android.support.v4.app.Fragment, int, android.content.DialogInterface$OnCancelListener):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.app.Dialog zza(int r5, android.app.Activity r6, android.support.v4.app.Fragment r7, int r8, android.content.DialogInterface.OnCancelListener r9) {
        /*
        r0 = 0;
        if (r5 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = com.google.android.gms.internal.zzlk.zzao(r6);	 Catch:{ IllegalArgumentException -> 0x0080 }
        if (r1 == 0) goto L_0x000f;
    L_0x000a:
        r1 = 2;
        if (r5 != r1) goto L_0x000f;
    L_0x000d:
        r5 = 42;
    L_0x000f:
        r1 = com.google.android.gms.internal.zzlv.zzpR();
        if (r1 == 0) goto L_0x003e;
    L_0x0015:
        r1 = new android.util.TypedValue;
        r1.<init>();
        r2 = r6.getTheme();
        r3 = 16843529; // 0x1010309 float:2.3695736E-38 double:8.321809E-317;
        r4 = 1;
        r2.resolveAttribute(r3, r1, r4);
        r2 = r6.getResources();
        r1 = r1.resourceId;
        r1 = r2.getResourceEntryName(r1);
        r2 = "Theme.Dialog.Alert";
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x003e;
    L_0x0038:
        r0 = new android.app.AlertDialog$Builder;
        r1 = 5;
        r0.<init>(r6, r1);
    L_0x003e:
        if (r0 != 0) goto L_0x0045;
    L_0x0040:
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r6);
    L_0x0045:
        r1 = zzaf(r6);
        r1 = com.google.android.gms.common.internal.zzg.zzb(r6, r5, r1);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r0.setMessage(r1);	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r9 == 0) goto L_0x0055;
    L_0x0052:
        r0.setOnCancelListener(r9);	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0055:
        r2 = zzbc(r5);
        if (r7 != 0) goto L_0x0064;
    L_0x005b:
        r1 = new com.google.android.gms.common.internal.zzh;
        r1.<init>(r6, r2, r8);
        r3 = a;
        if (r3 == 0) goto L_0x0069;
    L_0x0064:
        r1 = new com.google.android.gms.common.internal.zzh;
        r1.<init>(r7, r2, r8);
    L_0x0069:
        r2 = com.google.android.gms.common.internal.zzg.zzh(r6, r5);
        if (r2 == 0) goto L_0x0072;
    L_0x006f:
        r0.setPositiveButton(r2, r1);	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0072:
        r1 = com.google.android.gms.common.internal.zzg.zzg(r6, r5);
        if (r1 == 0) goto L_0x007b;
    L_0x0078:
        r0.setTitle(r1);	 Catch:{ IllegalArgumentException -> 0x0086 }
    L_0x007b:
        r0 = r0.create();
        goto L_0x0003;
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.zza(int, android.app.Activity, android.support.v4.app.Fragment, int, android.content.DialogInterface$OnCancelListener):android.app.Dialog");
    }

    public static boolean zza(Context context, int i, String str) {
        boolean z = a;
        if (zzlv.zzpV()) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        int i2 = 0;
        while (i2 < packagesForUid.length) {
            try {
                if (str.equals(packagesForUid[i2])) {
                    return true;
                }
                i2++;
                if (z) {
                    return false;
                }
            } catch (SecurityException e2) {
                throw e2;
            }
        }
        return false;
    }

    @Deprecated
    public static void zzaa(Context context) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 0) {
            Intent zzbc = zzbc(isGooglePlayServicesAvailable);
            try {
                Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + isGooglePlayServicesAvailable);
                if (zzbc == null) {
                    throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
                }
                throw new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", zzbc);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    @Deprecated
    public static void zzac(Context context) {
        try {
            if (!zzYz.getAndSet(true)) {
                try {
                    ((NotificationManager) context.getSystemService("notification")).cancel(10436);
                } catch (SecurityException e) {
                }
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzad(android.content.Context r5) {
        /*
        r1 = a;
        r2 = zzpm;
        monitor-enter(r2);
        r0 = zzYx;	 Catch:{ all -> 0x0093 }
        if (r0 != 0) goto L_0x0053;
    L_0x0009:
        r0 = r5.getPackageName();	 Catch:{ all -> 0x0093 }
        zzYx = r0;	 Catch:{ all -> 0x0093 }
        r0 = r5.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0047 }
        r3 = r5.getPackageName();	 Catch:{ NameNotFoundException -> 0x0047 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r0 = r0.getApplicationInfo(r3, r4);	 Catch:{ NameNotFoundException -> 0x0047 }
        r0 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0047 }
        if (r0 == 0) goto L_0x0030;
    L_0x0021:
        r3 = "com.google.android.gms.version";
        r0 = r0.getInt(r3);	 Catch:{ NameNotFoundException -> 0x0043 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NameNotFoundException -> 0x0043 }
        zzYy = r0;	 Catch:{ NameNotFoundException -> 0x0043 }
        if (r1 == 0) goto L_0x0033;
    L_0x0030:
        r0 = 0;
        zzYy = r0;	 Catch:{ NameNotFoundException -> 0x0045 }
    L_0x0033:
        r0 = zzYy;	 Catch:{ all -> 0x0093 }
        monitor-exit(r2);	 Catch:{ all -> 0x0093 }
        if (r0 != 0) goto L_0x0098;
    L_0x0038:
        r0 = new java.lang.IllegalStateException;	 Catch:{ NameNotFoundException -> 0x0041 }
        r1 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />";
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x0041 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        r3 = "GooglePlayServicesUtil";
        r4 = "This should never happen.";
        android.util.Log.wtf(r3, r4, r0);	 Catch:{ NameNotFoundException -> 0x0096 }
        if (r1 == 0) goto L_0x0033;
    L_0x0053:
        r0 = zzYx;	 Catch:{ NameNotFoundException -> 0x0096 }
        r1 = r5.getPackageName();	 Catch:{ NameNotFoundException -> 0x0096 }
        r0 = r0.equals(r1);	 Catch:{ NameNotFoundException -> 0x0096 }
        if (r0 != 0) goto L_0x0033;
    L_0x005f:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ NameNotFoundException -> 0x0091 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x0091 }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x0091 }
        r3 = "isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '";
        r1 = r1.append(r3);	 Catch:{ NameNotFoundException -> 0x0091 }
        r3 = zzYx;	 Catch:{ NameNotFoundException -> 0x0091 }
        r1 = r1.append(r3);	 Catch:{ NameNotFoundException -> 0x0091 }
        r3 = "' and this call used package '";
        r1 = r1.append(r3);	 Catch:{ NameNotFoundException -> 0x0091 }
        r3 = r5.getPackageName();	 Catch:{ NameNotFoundException -> 0x0091 }
        r1 = r1.append(r3);	 Catch:{ NameNotFoundException -> 0x0091 }
        r3 = "'.";
        r1 = r1.append(r3);	 Catch:{ NameNotFoundException -> 0x0091 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0091 }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x0091 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0093 }
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x0091 }
    L_0x0098:
        r1 = r0.intValue();	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2 = GOOGLE_PLAY_SERVICES_VERSION_CODE;	 Catch:{ NameNotFoundException -> 0x00f1 }
        if (r1 == r2) goto L_0x00f3;
    L_0x00a0:
        r1 = new java.lang.IllegalStateException;	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2.<init>();	 Catch:{ NameNotFoundException -> 0x00f1 }
        r3 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ";
        r2 = r2.append(r3);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r3 = GOOGLE_PLAY_SERVICES_VERSION_CODE;	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2 = r2.append(r3);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r3 = " but";
        r2 = r2.append(r3);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r3 = " found ";
        r2 = r2.append(r3);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r0 = r2.append(r0);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2 = ".  You must have the";
        r0 = r0.append(r2);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2 = " following declaration within the <application> element: ";
        r0 = r0.append(r2);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2 = "    <meta-data android:name=\"";
        r0 = r0.append(r2);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2 = "com.google.android.gms.version";
        r0 = r0.append(r2);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r2 = "\" android:value=\"@integer/google_play_services_version\" />";
        r0 = r0.append(r2);	 Catch:{ NameNotFoundException -> 0x00f1 }
        r0 = r0.toString();	 Catch:{ NameNotFoundException -> 0x00f1 }
        r1.<init>(r0);	 Catch:{ NameNotFoundException -> 0x00f1 }
        throw r1;	 Catch:{ NameNotFoundException -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.zzad(android.content.Context):void");
    }

    public static String zzaf(Context context) {
        Object obj = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(obj)) {
            return obj;
        }
        ApplicationInfo applicationInfo;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            applicationInfo = null;
        }
        return applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo).toString() : packageName;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzb(android.content.pm.PackageManager r9) {
        /*
        r0 = 1;
        r1 = 0;
        r3 = zzpm;
        monitor-enter(r3);
        r2 = zzYw;	 Catch:{ all -> 0x0041 }
        r4 = -1;
        if (r2 != r4) goto L_0x0032;
    L_0x000a:
        r2 = "com.google.android.gms";
        r4 = 64;
        r2 = r9.getPackageInfo(r2, r4);	 Catch:{ NameNotFoundException -> 0x003c }
        r4 = com.google.android.gms.common.zzd.zzmY();	 Catch:{ NameNotFoundException -> 0x0038 }
        r5 = 1;
        r5 = new com.google.android.gms.common.zzc.zza[r5];	 Catch:{ NameNotFoundException -> 0x0038 }
        r6 = 0;
        r7 = com.google.android.gms.common.zzc.zzYm;	 Catch:{ NameNotFoundException -> 0x0038 }
        r8 = 1;
        r7 = r7[r8];	 Catch:{ NameNotFoundException -> 0x0038 }
        r5[r6] = r7;	 Catch:{ NameNotFoundException -> 0x0038 }
        r2 = r4.zza(r2, r5);	 Catch:{ NameNotFoundException -> 0x0038 }
        if (r2 == 0) goto L_0x002f;
    L_0x0028:
        r2 = 1;
        zzYw = r2;	 Catch:{ NameNotFoundException -> 0x0038 }
        r2 = a;	 Catch:{ NameNotFoundException -> 0x0038 }
        if (r2 == 0) goto L_0x0032;
    L_0x002f:
        r2 = 0;
        zzYw = r2;	 Catch:{ NameNotFoundException -> 0x003a }
    L_0x0032:
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        r2 = zzYw;	 Catch:{ NameNotFoundException -> 0x0044 }
        if (r2 == 0) goto L_0x0046;
    L_0x0037:
        return r0;
    L_0x0038:
        r2 = move-exception;
        throw r2;	 Catch:{ NameNotFoundException -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        throw r2;	 Catch:{ NameNotFoundException -> 0x003c }
    L_0x003c:
        r2 = move-exception;
        r2 = 0;
        zzYw = r2;	 Catch:{ all -> 0x0041 }
        goto L_0x0032;
    L_0x0041:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0041 }
        throw r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = r1;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.zzb(android.content.pm.PackageManager):boolean");
    }

    @Deprecated
    public static boolean zzb(PackageManager packageManager, String str) {
        return zzd.zzmY().zzb(packageManager, str);
    }

    @Deprecated
    public static Intent zzbc(int i) {
        switch (i) {
            case at.g /*1*/:
            case at.i /*2*/:
                try {
                    return zzn.zzcp("com.google.android.gms");
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case at.o /*3*/:
                return zzn.zzcn("com.google.android.gms");
            case arj.Theme_dialogTheme /*42*/:
                return zzn.zzoM();
            default:
                return null;
        }
    }

    public static boolean zzc(PackageManager packageManager) {
        try {
            if (!zzb(packageManager)) {
                if (zzmX()) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    @Deprecated
    public static boolean zzd(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        try {
            return zzh(context, "com.google.android.gms");
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static boolean zze(Context context, int i) {
        try {
            if (zza(context, i, "com.google.android.gms")) {
                if (zzb(context.getPackageManager(), "com.google.android.gms")) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzh(android.content.Context r4, java.lang.String r5) {
        /*
        r1 = 1;
        r2 = a;
        r0 = com.google.android.gms.internal.zzlv.zzpX();
        if (r0 == 0) goto L_0x0037;
    L_0x0009:
        r0 = r4.getPackageManager();
        r0 = r0.getPackageInstaller();
        r0 = r0.getAllSessions();
        r3 = r0.iterator();
    L_0x0019:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0035;
    L_0x001f:
        r0 = r3.next();
        r0 = (android.content.pm.PackageInstaller.SessionInfo) r0;
        r0 = r0.getAppPackageName();	 Catch:{ NameNotFoundException -> 0x0031 }
        r0 = r5.equals(r0);	 Catch:{ NameNotFoundException -> 0x0031 }
        if (r0 == 0) goto L_0x0033;
    L_0x002f:
        r0 = r1;
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        if (r2 == 0) goto L_0x0019;
    L_0x0035:
        if (r2 == 0) goto L_0x004a;
    L_0x0037:
        r0 = r4.getPackageManager();
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r0 = r0.getApplicationInfo(r5, r2);	 Catch:{ NameNotFoundException -> 0x0049, IllegalArgumentException -> 0x0047 }
        r0 = r0.enabled;	 Catch:{ NameNotFoundException -> 0x0049, IllegalArgumentException -> 0x0047 }
        if (r0 == 0) goto L_0x004a;
    L_0x0045:
        r0 = r1;
        goto L_0x0030;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = move-exception;
    L_0x004a:
        r0 = 0;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.zzh(android.content.Context, java.lang.String):boolean");
    }

    private static int zzmW() {
        return 7895000;
    }

    public static boolean zzmX() {
        try {
            return zzYu ? zzYv : "user".equals(Build.TYPE);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
