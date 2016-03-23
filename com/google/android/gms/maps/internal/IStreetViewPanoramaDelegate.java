package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface IStreetViewPanoramaDelegate extends IInterface {

    public abstract class zza extends Binder implements IStreetViewPanoramaDelegate {

        class zza implements IStreetViewPanoramaDelegate {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }
        }

        public static IStreetViewPanoramaDelegate zzcK(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStreetViewPanoramaDelegate)) ? new zza(iBinder) : (IStreetViewPanoramaDelegate) queryLocalInterface;
        }
    }
}
