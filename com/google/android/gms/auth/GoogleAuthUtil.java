package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.zzl;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzau;
import com.google.android.gms.internal.zzkc;
import java.io.IOException;

public final class GoogleAuthUtil {
    public static final String KEY_ANDROID_PACKAGE_NAME;
    public static final String KEY_CALLER_UID;
    private static final ComponentName zzQI;
    private static final ComponentName zzQJ;

    static {
        try {
            try {
                KEY_CALLER_UID = VERSION.SDK_INT >= 11 ? "callerUid" : "callerUid";
                KEY_ANDROID_PACKAGE_NAME = VERSION.SDK_INT >= 14 ? "androidPackageName" : "androidPackageName";
                zzQI = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
                zzQJ = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
            } catch (zza e) {
                throw e;
            }
        } catch (zza e2) {
            throw e2;
        }
    }

    public static void clearToken(Context context, String str) {
        boolean z = GoogleAuthException.a;
        Context applicationContext = context.getApplicationContext();
        zzx.zzci("Calling this from your main thread can lead to deadlock");
        zzaa(applicationContext);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        try {
            bundle.putString("clientPackageName", str2);
            if (!bundle.containsKey(KEY_ANDROID_PACKAGE_NAME)) {
                bundle.putString(KEY_ANDROID_PACKAGE_NAME, str2);
            }
            ServiceConnection com_google_android_gms_common_zza = new com.google.android.gms.common.zza();
            zzl zzak = zzl.zzak(applicationContext);
            if (zzak.zza(zzQI, com_google_android_gms_common_zza, "GoogleAuthUtil")) {
                try {
                    bundle = zzau.zza.zza(com_google_android_gms_common_zza.zzmS()).zza(str, bundle);
                    String string = bundle.getString("Error");
                    if (bundle.getBoolean("booleanResult")) {
                        zzak.zzb(zzQI, com_google_android_gms_common_zza, "GoogleAuthUtil");
                        if (!z) {
                            try {
                                if (zza.a != 0) {
                                    GoogleAuthException.a = !z;
                                    return;
                                }
                                return;
                            } catch (RemoteException e) {
                                throw e;
                            } catch (RemoteException e2) {
                                throw e2;
                            }
                        }
                    }
                    throw new GoogleAuthException(string);
                } catch (RemoteException e22) {
                    throw e22;
                } catch (InterruptedException e3) {
                    throw new GoogleAuthException("Interrupted");
                } catch (Throwable e4) {
                    try {
                        Log.i("GoogleAuthUtil", "GMS remote exception ", e4);
                        throw new IOException("remote exception");
                    } catch (Throwable th) {
                        zzak.zzb(zzQI, com_google_android_gms_common_zza, "GoogleAuthUtil");
                    }
                }
            }
            try {
                throw new IOException("Could not bind to service with the given context.");
            } catch (RemoteException e222) {
                throw e222;
            }
        } catch (RemoteException e2222) {
            throw e2222;
        }
    }

    public static String getToken(Context context, Account account, String str, Bundle bundle) {
        return zza(context, account, str, bundle).getString("authtoken");
    }

    @Deprecated
    public static String getToken(Context context, String str, String str2, Bundle bundle) {
        return getToken(context, new Account(str, "com.google"), str2, bundle);
    }

    public static Bundle zza(Context context, Account account, String str, Bundle bundle) {
        String str2;
        ServiceConnection com_google_android_gms_common_zza;
        zzl zzak;
        Bundle zza;
        String string;
        Intent intent;
        boolean z = GoogleAuthException.a;
        Context applicationContext = context.getApplicationContext();
        zzx.zzci("Calling this from your main thread can lead to deadlock");
        zzaa(applicationContext);
        if (bundle == null) {
            bundle = new Bundle();
            if (z) {
                zza.a++;
            }
            str2 = context.getApplicationInfo().packageName;
            bundle.putString("clientPackageName", str2);
            if (TextUtils.isEmpty(bundle.getString(KEY_ANDROID_PACKAGE_NAME))) {
                bundle.putString(KEY_ANDROID_PACKAGE_NAME, str2);
            }
            com_google_android_gms_common_zza = new com.google.android.gms.common.zza();
            zzak = zzl.zzak(applicationContext);
            if (zzak.zza(zzQI, com_google_android_gms_common_zza, "GoogleAuthUtil")) {
                throw new IOException("Could not bind to service with the given context.");
            }
            try {
                zza = zzau.zza.zza(com_google_android_gms_common_zza.zzmS()).zza(account, str, bundle);
                if (zza == null) {
                    Log.w("GoogleAuthUtil", "Binder call returned null.");
                    throw new GoogleAuthException("ServiceUnavailable");
                } else if (TextUtils.isEmpty(zza.getString("authtoken"))) {
                    zzak.zzb(zzQI, com_google_android_gms_common_zza, "GoogleAuthUtil");
                    return zza;
                } else {
                    string = zza.getString("Error");
                    intent = (Intent) zza.getParcelable("userRecoveryIntent");
                    if (zzbC(string)) {
                        throw new UserRecoverableAuthException(string, intent);
                    } else if (zzbB(string)) {
                        throw new GoogleAuthException(string);
                    } else {
                        throw new IOException(string);
                    }
                }
            } catch (RemoteException e) {
                throw e;
            } catch (InterruptedException e2) {
                throw new GoogleAuthException("Interrupted");
            } catch (RemoteException e3) {
                throw e3;
            } catch (RemoteException e32) {
                throw e32;
            } catch (Throwable e4) {
                Log.i("GoogleAuthUtil", "GMS remote exception ", e4);
                throw new IOException("remote exception");
            } catch (Throwable th) {
                zzak.zzb(zzQI, com_google_android_gms_common_zza, "GoogleAuthUtil");
            }
        }
        bundle = new Bundle(bundle);
        str2 = context.getApplicationInfo().packageName;
        try {
            bundle.putString("clientPackageName", str2);
            if (TextUtils.isEmpty(bundle.getString(KEY_ANDROID_PACKAGE_NAME))) {
                bundle.putString(KEY_ANDROID_PACKAGE_NAME, str2);
            }
            com_google_android_gms_common_zza = new com.google.android.gms.common.zza();
            zzak = zzl.zzak(applicationContext);
            if (zzak.zza(zzQI, com_google_android_gms_common_zza, "GoogleAuthUtil")) {
                throw new IOException("Could not bind to service with the given context.");
            }
            zza = zzau.zza.zza(com_google_android_gms_common_zza.zzmS()).zza(account, str, bundle);
            if (zza == null) {
                Log.w("GoogleAuthUtil", "Binder call returned null.");
                throw new GoogleAuthException("ServiceUnavailable");
            } else if (TextUtils.isEmpty(zza.getString("authtoken"))) {
                string = zza.getString("Error");
                intent = (Intent) zza.getParcelable("userRecoveryIntent");
                if (zzbC(string)) {
                    throw new UserRecoverableAuthException(string, intent);
                } else if (zzbB(string)) {
                    throw new GoogleAuthException(string);
                } else {
                    throw new IOException(string);
                }
            } else {
                zzak.zzb(zzQI, com_google_android_gms_common_zza, "GoogleAuthUtil");
                return zza;
            }
        } catch (RemoteException e322) {
            throw e322;
        }
    }

    private static void zzaa(Context context) {
        try {
            GooglePlayServicesUtil.zzaa(context);
        } catch (GooglePlayServicesRepairableException e) {
            throw new GooglePlayServicesAvailabilityException(e.getConnectionStatusCode(), e.getMessage(), e.getIntent());
        } catch (GooglePlayServicesNotAvailableException e2) {
            throw new GoogleAuthException(e2.getMessage());
        }
    }

    private static boolean zzbB(String str) {
        try {
            if (!"NetworkError".equals(str)) {
                if (!"ServiceUnavailable".equals(str)) {
                    try {
                        if (!"Timeout".equals(str)) {
                            return false;
                        }
                    } catch (zza e) {
                        throw e;
                    }
                }
            }
            return true;
        } catch (zza e2) {
            throw e2;
        } catch (zza e22) {
            throw e22;
        }
    }

    private static boolean zzbC(String str) {
        try {
            if (!"BadAuthentication".equals(str)) {
                if (!"CaptchaRequired".equals(str)) {
                    try {
                        if (!"DeviceManagementRequiredOrSyncDisabled".equals(str)) {
                            try {
                                if (!"NeedPermission".equals(str)) {
                                    try {
                                        if (!"NeedsBrowser".equals(str)) {
                                            try {
                                                if (!"UserCancel".equals(str)) {
                                                    try {
                                                        if (!"AppDownloadRequired".equals(str)) {
                                                            try {
                                                                if (!zzkc.DM_SYNC_DISABLED.zzlL().equals(str)) {
                                                                    try {
                                                                        if (!zzkc.DM_ADMIN_BLOCKED.zzlL().equals(str)) {
                                                                            try {
                                                                                if (!zzkc.DM_ADMIN_PENDING_APPROVAL.zzlL().equals(str)) {
                                                                                    try {
                                                                                        if (!zzkc.DM_STALE_SYNC_REQUIRED.zzlL().equals(str)) {
                                                                                            try {
                                                                                                if (!zzkc.DM_DEACTIVATED.zzlL().equals(str)) {
                                                                                                    try {
                                                                                                        if (!zzkc.DM_REQUIRED.zzlL().equals(str)) {
                                                                                                            try {
                                                                                                                if (!zzkc.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.zzlL().equals(str)) {
                                                                                                                    return false;
                                                                                                                }
                                                                                                            } catch (zza e) {
                                                                                                                throw e;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (zza e2) {
                                                                                                        throw e2;
                                                                                                    }
                                                                                                }
                                                                                            } catch (zza e22) {
                                                                                                throw e22;
                                                                                            }
                                                                                        }
                                                                                    } catch (zza e222) {
                                                                                        throw e222;
                                                                                    }
                                                                                }
                                                                            } catch (zza e2222) {
                                                                                throw e2222;
                                                                            }
                                                                        }
                                                                    } catch (zza e22222) {
                                                                        throw e22222;
                                                                    }
                                                                }
                                                            } catch (zza e222222) {
                                                                throw e222222;
                                                            }
                                                        }
                                                    } catch (zza e2222222) {
                                                        throw e2222222;
                                                    }
                                                }
                                            } catch (zza e22222222) {
                                                throw e22222222;
                                            }
                                        }
                                    } catch (zza e222222222) {
                                        throw e222222222;
                                    }
                                }
                            } catch (zza e2222222222) {
                                throw e2222222222;
                            }
                        }
                    } catch (zza e22222222222) {
                        throw e22222222222;
                    }
                }
            }
            return true;
        } catch (zza e222222222222) {
            throw e222222222222;
        } catch (zza e2222222222222) {
            throw e2222222222222;
        }
    }
}
