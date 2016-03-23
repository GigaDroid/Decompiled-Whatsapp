package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface IStreetViewPanoramaFragmentDelegate extends IInterface {

    public abstract class zza extends Binder implements IStreetViewPanoramaFragmentDelegate {

        class zza implements IStreetViewPanoramaFragmentDelegate {
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    obtain.writeStrongBinder(com_google_android_gms_maps_internal_zzv != null ? com_google_android_gms_maps_internal_zzv.asBinder() : null);
                    this.zznI.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
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
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
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
                r3 = 3;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.zza.zza.onCreate(android.os.Bundle):void");
            }

            public zzd onCreateView(zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2, Bundle bundle) {
                IBinder iBinder = null;
                boolean z = com.google.android.gms.maps.internal.zzl.zza.a;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    zzd zzbk;
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    obtain.writeStrongBinder(com_google_android_gms_dynamic_zzd != null ? com_google_android_gms_dynamic_zzd.asBinder() : null);
                    if (com_google_android_gms_dynamic_zzd2 != null) {
                        iBinder = com_google_android_gms_dynamic_zzd2.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                        if (z) {
                            GoogleMap.a++;
                        }
                        this.zznI.transact(4, obtain, obtain2, 0);
                        obtain2.readException();
                        zzbk = com.google.android.gms.dynamic.zzd.zza.zzbk(obtain2.readStrongBinder());
                        return zzbk;
                    }
                    obtain.writeInt(0);
                    this.zznI.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    zzbk = com.google.android.gms.dynamic.zzd.zza.zzbk(obtain2.readStrongBinder());
                    return zzbk;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDestroy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznI.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void onDestroyView() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznI.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onInflate(com.google.android.gms.dynamic.zzd r6, com.google.android.gms.maps.StreetViewPanoramaOptions r7, android.os.Bundle r8) {
                /*
                r5 = this;
                r1 = com.google.android.gms.maps.internal.zzl.zza.a;
                r2 = android.os.Parcel.obtain();
                r3 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
                r2.writeInterfaceToken(r0);	 Catch:{ all -> 0x004c }
                if (r6 == 0) goto L_0x004a;
            L_0x0012:
                r0 = r6.asBinder();	 Catch:{ all -> 0x004c }
            L_0x0016:
                r2.writeStrongBinder(r0);	 Catch:{ all -> 0x004c }
                if (r7 == 0) goto L_0x0025;
            L_0x001b:
                r0 = 1;
                r2.writeInt(r0);	 Catch:{ all -> 0x004c }
                r0 = 0;
                r7.writeToParcel(r2, r0);	 Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x0029;
            L_0x0025:
                r0 = 0;
                r2.writeInt(r0);	 Catch:{ all -> 0x004c }
            L_0x0029:
                if (r8 == 0) goto L_0x0035;
            L_0x002b:
                r0 = 1;
                r2.writeInt(r0);	 Catch:{ all -> 0x004c }
                r0 = 0;
                r8.writeToParcel(r2, r0);	 Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x0039;
            L_0x0035:
                r0 = 0;
                r2.writeInt(r0);	 Catch:{ all -> 0x004c }
            L_0x0039:
                r0 = r5.zznI;	 Catch:{ all -> 0x004c }
                r1 = 2;
                r4 = 0;
                r0.transact(r1, r2, r3, r4);	 Catch:{ all -> 0x004c }
                r3.readException();	 Catch:{ all -> 0x004c }
                r3.recycle();
                r2.recycle();
                return;
            L_0x004a:
                r0 = 0;
                goto L_0x0016;
            L_0x004c:
                r0 = move-exception;
                r3.recycle();
                r2.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.zza.zza.onInflate(com.google.android.gms.dynamic.zzd, com.google.android.gms.maps.StreetViewPanoramaOptions, android.os.Bundle):void");
            }

            public void onLowMemory() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznI.transact(9, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznI.transact(6, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznI.transact(5, obtain, obtain2, 0);
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
                r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x003b }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x003b }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x003b }
                r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x003b }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003b }
            L_0x0020:
                r0 = r5.zznI;	 Catch:{ all -> 0x003b }
                r3 = 10;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003b }
                r2.readException();	 Catch:{ all -> 0x003b }
                r0 = r2.readInt();	 Catch:{ all -> 0x003b }
                if (r0 == 0) goto L_0x0034;
            L_0x0031:
                r6.readFromParcel(r2);	 Catch:{ all -> 0x003b }
            L_0x0034:
                r2.recycle();
                r1.recycle();
                return;
            L_0x003b:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.zza.zza.onSaveInstanceState(android.os.Bundle):void");
            }
        }

        public static IStreetViewPanoramaFragmentDelegate zzcL(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStreetViewPanoramaFragmentDelegate)) ? new zza(iBinder) : (IStreetViewPanoramaFragmentDelegate) queryLocalInterface;
        }
    }

    void getStreetViewPanoramaAsync(zzv com_google_android_gms_maps_internal_zzv);

    void onCreate(Bundle bundle);

    zzd onCreateView(zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onInflate(zzd com_google_android_gms_dynamic_zzd, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);
}
