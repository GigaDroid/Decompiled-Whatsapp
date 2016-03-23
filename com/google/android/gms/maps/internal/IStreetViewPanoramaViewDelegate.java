package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

public interface IStreetViewPanoramaViewDelegate extends IInterface {

    public abstract class zza extends Binder implements IStreetViewPanoramaViewDelegate {

        class zza implements IStreetViewPanoramaViewDelegate {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            public void getStreetViewPanoramaAsync(zzv com_google_android_gms_maps_internal_zzv) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    obtain.writeStrongBinder(com_google_android_gms_maps_internal_zzv != null ? com_google_android_gms_maps_internal_zzv.asBinder() : null);
                    this.zznI.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public zzd getView() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.zznI.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    zzd zzbk = com.google.android.gms.dynamic.zzd.zza.zzbk(obtain2.readStrongBinder());
                    return zzbk;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCreate(android.os.Bundle r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0031 }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0031 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0031 }
                r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x0031 }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0031 }
            L_0x0020:
                r0 = r5.zznI;	 Catch:{ all -> 0x0031 }
                r3 = 2;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0031 }
                r2.readException();	 Catch:{ all -> 0x0031 }
                r2.recycle();
                r1.recycle();
                return;
            L_0x0031:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate.zza.zza.onCreate(android.os.Bundle):void");
            }

            public void onDestroy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.zznI.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onLowMemory() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.zznI.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onPause() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.zznI.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onResume() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
                    this.zznI.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onSaveInstanceState(android.os.Bundle r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate";
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
                r3 = 7;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003a }
                r2.readException();	 Catch:{ all -> 0x003a }
                r0 = r2.readInt();	 Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x0033;
            L_0x0030:
                r6.readFromParcel(r2);	 Catch:{ all -> 0x003a }
            L_0x0033:
                r2.recycle();
                r1.recycle();
                return;
            L_0x003a:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate.zza.zza.onSaveInstanceState(android.os.Bundle):void");
            }
        }

        public static IStreetViewPanoramaViewDelegate zzcM(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStreetViewPanoramaViewDelegate)) ? new zza(iBinder) : (IStreetViewPanoramaViewDelegate) queryLocalInterface;
        }
    }

    void getStreetViewPanoramaAsync(zzv com_google_android_gms_maps_internal_zzv);

    zzd getView();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);
}
