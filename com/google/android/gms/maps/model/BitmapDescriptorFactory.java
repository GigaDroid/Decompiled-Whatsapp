package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zza;

public final class BitmapDescriptorFactory {
    private static zza zzaGO;

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        try {
            return new BitmapDescriptor(zzxb().zzb(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromResource(int i) {
        try {
            return new BitmapDescriptor(zzxb().zzhM(i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static void zza(zza com_google_android_gms_maps_model_internal_zza) {
        try {
            if (zzaGO == null) {
                zzaGO = (zza) zzx.zzv(com_google_android_gms_maps_model_internal_zza);
            }
        } catch (RuntimeRemoteException e) {
            throw e;
        }
    }

    private static zza zzxb() {
        return (zza) zzx.zzb(zzaGO, (Object) "IBitmapDescriptorFactory is not initialized");
    }
}
