package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ICameraUpdateFactoryDelegate extends IInterface {

    public abstract class zza extends Binder implements ICameraUpdateFactoryDelegate {

        class zza implements ICameraUpdateFactoryDelegate {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.zzd newCameraPosition(com.google.android.gms.maps.model.CameraPosition r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0039 }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0039 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0039 }
                r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x0039 }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0039 }
            L_0x0020:
                r0 = r5.zznI;	 Catch:{ all -> 0x0039 }
                r3 = 7;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0039 }
                r2.readException();	 Catch:{ all -> 0x0039 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0039 }
                r0 = com.google.android.gms.dynamic.zzd.zza.zzbk(r0);	 Catch:{ all -> 0x0039 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0039:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza.zza.newCameraPosition(com.google.android.gms.maps.model.CameraPosition):com.google.android.gms.dynamic.zzd");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.zzd newLatLng(com.google.android.gms.maps.model.LatLng r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x003a }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x003a }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x003a }
                r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003a }
            L_0x0020:
                r0 = r5.zznI;	 Catch:{ all -> 0x003a }
                r3 = 8;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003a }
                r2.readException();	 Catch:{ all -> 0x003a }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x003a }
                r0 = com.google.android.gms.dynamic.zzd.zza.zzbk(r0);	 Catch:{ all -> 0x003a }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x003a:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza.zza.newLatLng(com.google.android.gms.maps.model.LatLng):com.google.android.gms.dynamic.zzd");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.zzd newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds r6, int r7) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x003d }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x003d }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x003d }
                r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003d }
            L_0x0020:
                r1.writeInt(r7);	 Catch:{ all -> 0x003d }
                r0 = r5.zznI;	 Catch:{ all -> 0x003d }
                r3 = 10;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003d }
                r2.readException();	 Catch:{ all -> 0x003d }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x003d }
                r0 = com.google.android.gms.dynamic.zzd.zza.zzbk(r0);	 Catch:{ all -> 0x003d }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x003d:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza.zza.newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds, int):com.google.android.gms.dynamic.zzd");
            }

            public zzd zoomBy(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    this.zznI.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    zzd zzbk = com.google.android.gms.dynamic.zzd.zza.zzbk(obtain2.readStrongBinder());
                    return zzbk;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzd zoomTo(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                    obtain.writeFloat(f);
                    this.zznI.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    zzd zzbk = com.google.android.gms.dynamic.zzd.zza.zzbk(obtain2.readStrongBinder());
                    return zzbk;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ICameraUpdateFactoryDelegate zzci(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICameraUpdateFactoryDelegate)) ? new zza(iBinder) : (ICameraUpdateFactoryDelegate) queryLocalInterface;
        }
    }

    zzd newCameraPosition(CameraPosition cameraPosition);

    zzd newLatLng(LatLng latLng);

    zzd newLatLngBounds(LatLngBounds latLngBounds, int i);

    zzd zoomBy(float f);

    zzd zoomTo(float f);
}
