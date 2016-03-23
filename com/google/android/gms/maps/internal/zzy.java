package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.zzc.zza;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import org.v;

public class zzy {
    private static Context zzaGM;
    private static zzc zzaGN;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Context getRemoteContext(android.content.Context r1) {
        /*
        r0 = zzaGM;	 Catch:{ RuntimeRemoteException -> 0x001d }
        if (r0 != 0) goto L_0x001a;
    L_0x0004:
        r0 = zzwZ();	 Catch:{ RuntimeRemoteException -> 0x001f }
        if (r0 == 0) goto L_0x0014;
    L_0x000a:
        r0 = r1.getApplicationContext();	 Catch:{ RuntimeRemoteException -> 0x0021 }
        zzaGM = r0;	 Catch:{ RuntimeRemoteException -> 0x0021 }
        r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ RuntimeRemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteContext(r1);	 Catch:{ RuntimeRemoteException -> 0x0021 }
        zzaGM = r0;	 Catch:{ RuntimeRemoteException -> 0x0021 }
    L_0x001a:
        r0 = zzaGM;
        return r0;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeRemoteException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeRemoteException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzy.getRemoteContext(android.content.Context):android.content.Context");
    }

    private static Object zza(ClassLoader classLoader, String str) {
        try {
            return zzc(((ClassLoader) zzx.zzv(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    public static zzc zzaF(Context context) {
        try {
            zzx.zzv(context);
            if (zzaGN != null) {
                return zzaGN;
            }
            zzaG(context);
            zzaGN = zzaH(context);
            try {
                zzaGN.zzd(zze.zzx(getRemoteContext(context).getResources()), GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                return zzaGN;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } catch (RemoteException e2) {
            throw e2;
        }
    }

    private static void zzaG(Context context) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        switch (isGooglePlayServicesAvailable) {
            case v.m /*0*/:
            default:
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    private static zzc zzaH(Context context) {
        if (zzwZ()) {
            Log.i(zzy.class.getSimpleName(), "Making Creator statically");
            return (zzc) zzc(zzxa());
        }
        Log.i(zzy.class.getSimpleName(), "Making Creator dynamically");
        return zza.zzck((IBinder) zza(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
    }

    private static Object zzc(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        }
    }

    public static boolean zzwZ() {
        return false;
    }

    private static Class zzxa() {
        try {
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
