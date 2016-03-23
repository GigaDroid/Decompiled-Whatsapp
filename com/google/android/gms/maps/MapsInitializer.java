package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class MapsInitializer {
    private static boolean zznp;

    static {
        zznp = false;
    }

    public static synchronized int initialize(Context context) {
        int i = 0;
        synchronized (MapsInitializer.class) {
            try {
                zzx.zzb((Object) context, (Object) "Context is null");
                if (!zznp) {
                    try {
                        zza(zzy.zzaF(context));
                        zznp = true;
                    } catch (GooglePlayServicesNotAvailableException e) {
                        i = e.errorCode;
                    }
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                throw e2;
            }
        }
        return i;
    }

    public static void zza(zzc com_google_android_gms_maps_internal_zzc) {
        try {
            CameraUpdateFactory.zza(com_google_android_gms_maps_internal_zzc.zzwX());
            BitmapDescriptorFactory.zza(com_google_android_gms_maps_internal_zzc.zzwY());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
