package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMapOptions;

public interface IMapFragmentDelegate extends IInterface {

    public abstract class zza extends Binder implements IMapFragmentDelegate {

        class zza implements IMapFragmentDelegate {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            public void getMapAsync(zzl com_google_android_gms_maps_internal_zzl) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    obtain.writeStrongBinder(com_google_android_gms_maps_internal_zzl != null ? com_google_android_gms_maps_internal_zzl.asBinder() : null);
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
                r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate";
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IMapFragmentDelegate.zza.zza.onCreate(android.os.Bundle):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.zzd onCreateView(com.google.android.gms.dynamic.zzd r9, com.google.android.gms.dynamic.zzd r10, android.os.Bundle r11) {
                /*
                r8 = this;
                r2 = 0;
                r1 = 1;
                r0 = 0;
                r4 = com.google.android.gms.maps.internal.zzl.zza.a;
                r5 = android.os.Parcel.obtain();
                r6 = android.os.Parcel.obtain();
                r3 = "com.google.android.gms.maps.internal.IMapFragmentDelegate";
                r5.writeInterfaceToken(r3);	 Catch:{ all -> 0x0058 }
                if (r9 == 0) goto L_0x0056;
            L_0x0015:
                r3 = r9.asBinder();	 Catch:{ all -> 0x0058 }
            L_0x0019:
                r5.writeStrongBinder(r3);	 Catch:{ all -> 0x0058 }
                if (r10 == 0) goto L_0x0022;
            L_0x001e:
                r2 = r10.asBinder();	 Catch:{ all -> 0x0058 }
            L_0x0022:
                r5.writeStrongBinder(r2);	 Catch:{ all -> 0x0058 }
                if (r11 == 0) goto L_0x0031;
            L_0x0027:
                r2 = 1;
                r5.writeInt(r2);	 Catch:{ all -> 0x0058 }
                r2 = 0;
                r11.writeToParcel(r5, r2);	 Catch:{ all -> 0x0058 }
                if (r4 == 0) goto L_0x0035;
            L_0x0031:
                r2 = 0;
                r5.writeInt(r2);	 Catch:{ all -> 0x0058 }
            L_0x0035:
                r2 = r8.zznI;	 Catch:{ all -> 0x0058 }
                r3 = 4;
                r7 = 0;
                r2.transact(r3, r5, r6, r7);	 Catch:{ all -> 0x0058 }
                r6.readException();	 Catch:{ all -> 0x0058 }
                r2 = r6.readStrongBinder();	 Catch:{ all -> 0x0058 }
                r2 = com.google.android.gms.dynamic.zzd.zza.zzbk(r2);	 Catch:{ all -> 0x0058 }
                r6.recycle();
                r5.recycle();
                r3 = com.google.android.gms.maps.GoogleMap.a;
                if (r3 == 0) goto L_0x0055;
            L_0x0051:
                if (r4 == 0) goto L_0x0060;
            L_0x0053:
                com.google.android.gms.maps.internal.zzl.zza.a = r0;
            L_0x0055:
                return r2;
            L_0x0056:
                r3 = r2;
                goto L_0x0019;
            L_0x0058:
                r0 = move-exception;
                r6.recycle();
                r5.recycle();
                throw r0;
            L_0x0060:
                r0 = r1;
                goto L_0x0053;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IMapFragmentDelegate.zza.zza.onCreateView(com.google.android.gms.dynamic.zzd, com.google.android.gms.dynamic.zzd, android.os.Bundle):com.google.android.gms.dynamic.zzd");
            }

            public void onDestroy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
                    this.zznI.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onInflate(com.google.android.gms.dynamic.zzd r6, com.google.android.gms.maps.GoogleMapOptions r7, android.os.Bundle r8) {
                /*
                r5 = this;
                r1 = com.google.android.gms.maps.internal.zzl.zza.a;
                r2 = android.os.Parcel.obtain();
                r3 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate";
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IMapFragmentDelegate.zza.zza.onInflate(com.google.android.gms.dynamic.zzd, com.google.android.gms.maps.GoogleMapOptions, android.os.Bundle):void");
            }

            public void onLowMemory() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
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
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IMapFragmentDelegate");
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
                r0 = "com.google.android.gms.maps.internal.IMapFragmentDelegate";
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IMapFragmentDelegate.zza.zza.onSaveInstanceState(android.os.Bundle):void");
            }
        }

        public static IMapFragmentDelegate zzco(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMapFragmentDelegate)) ? new zza(iBinder) : (IMapFragmentDelegate) queryLocalInterface;
        }
    }

    void getMapAsync(zzl com_google_android_gms_maps_internal_zzl);

    void onCreate(Bundle bundle);

    zzd onCreateView(zzd com_google_android_gms_dynamic_zzd, zzd com_google_android_gms_dynamic_zzd2, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onInflate(zzd com_google_android_gms_dynamic_zzd, GoogleMapOptions googleMapOptions, Bundle bundle);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);
}
