package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface zzc extends IInterface {

    public abstract class zza extends Binder implements zzc {

        class zza implements zzc {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.internal.IMapViewDelegate zza(com.google.android.gms.dynamic.zzd r6, com.google.android.gms.maps.GoogleMapOptions r7) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICreator";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0044 }
                if (r6 == 0) goto L_0x0042;
            L_0x0010:
                r0 = r6.asBinder();	 Catch:{ all -> 0x0044 }
            L_0x0014:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x0044 }
                if (r7 == 0) goto L_0x0025;
            L_0x0019:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0044 }
                r0 = 0;
                r7.writeToParcel(r1, r0);	 Catch:{ all -> 0x0044 }
                r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x0044 }
                if (r0 == 0) goto L_0x0029;
            L_0x0025:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0044 }
            L_0x0029:
                r0 = r5.zznI;	 Catch:{ all -> 0x0044 }
                r3 = 3;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0044 }
                r2.readException();	 Catch:{ all -> 0x0044 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0044 }
                r0 = com.google.android.gms.maps.internal.IMapViewDelegate.zza.zzcp(r0);	 Catch:{ all -> 0x0044 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0042:
                r0 = 0;
                goto L_0x0014;
            L_0x0044:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzc.zza.zza.zza(com.google.android.gms.dynamic.zzd, com.google.android.gms.maps.GoogleMapOptions):com.google.android.gms.maps.internal.IMapViewDelegate");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zza(com.google.android.gms.dynamic.zzd r6, com.google.android.gms.maps.StreetViewPanoramaOptions r7) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.ICreator";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0044 }
                if (r6 == 0) goto L_0x0042;
            L_0x0010:
                r0 = r6.asBinder();	 Catch:{ all -> 0x0044 }
            L_0x0014:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x0044 }
                if (r7 == 0) goto L_0x0025;
            L_0x0019:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0044 }
                r0 = 0;
                r7.writeToParcel(r1, r0);	 Catch:{ all -> 0x0044 }
                r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x0044 }
                if (r0 == 0) goto L_0x0029;
            L_0x0025:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0044 }
            L_0x0029:
                r0 = r5.zznI;	 Catch:{ all -> 0x0044 }
                r3 = 7;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0044 }
                r2.readException();	 Catch:{ all -> 0x0044 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0044 }
                r0 = com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate.zza.zzcM(r0);	 Catch:{ all -> 0x0044 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0042:
                r0 = 0;
                goto L_0x0014;
            L_0x0044:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzc.zza.zza.zza(com.google.android.gms.dynamic.zzd, com.google.android.gms.maps.StreetViewPanoramaOptions):com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            }

            public void zzd(zzd com_google_android_gms_dynamic_zzd, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    obtain.writeInt(i);
                    this.zznI.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IMapFragmentDelegate zzt(zzd com_google_android_gms_dynamic_zzd) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    this.zznI.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    IMapFragmentDelegate zzco = com.google.android.gms.maps.internal.IMapFragmentDelegate.zza.zzco(obtain2.readStrongBinder());
                    return zzco;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IStreetViewPanoramaFragmentDelegate zzu(zzd com_google_android_gms_dynamic_zzd) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    this.zznI.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    IStreetViewPanoramaFragmentDelegate zzcL = com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.zza.zzcL(obtain2.readStrongBinder());
                    return zzcL;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ICameraUpdateFactoryDelegate zzwX() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.zznI.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    ICameraUpdateFactoryDelegate zzci = com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza.zzci(obtain2.readStrongBinder());
                    return zzci;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public com.google.android.gms.maps.model.internal.zza zzwY() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.zznI.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    com.google.android.gms.maps.model.internal.zza zzcO = com.google.android.gms.maps.model.internal.zza.zza.zzcO(obtain2.readStrongBinder());
                    return zzcO;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzc zzck(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzc)) ? new zza(iBinder) : (zzc) queryLocalInterface;
        }
    }

    IMapViewDelegate zza(zzd com_google_android_gms_dynamic_zzd, GoogleMapOptions googleMapOptions);

    IStreetViewPanoramaViewDelegate zza(zzd com_google_android_gms_dynamic_zzd, StreetViewPanoramaOptions streetViewPanoramaOptions);

    void zzd(zzd com_google_android_gms_dynamic_zzd, int i);

    IMapFragmentDelegate zzt(zzd com_google_android_gms_dynamic_zzd);

    IStreetViewPanoramaFragmentDelegate zzu(zzd com_google_android_gms_dynamic_zzd);

    ICameraUpdateFactoryDelegate zzwX();

    com.google.android.gms.maps.model.internal.zza zzwY();
}
