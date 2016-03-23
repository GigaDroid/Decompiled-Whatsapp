package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface zzaw extends IInterface {

    public abstract class zza extends Binder implements zzaw {

        class zza implements zzaw {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.wearable.internal.zzau r6, com.google.android.gms.wearable.internal.AddListenerRequest r7) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableService";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x003d }
                if (r6 == 0) goto L_0x003b;
            L_0x0010:
                r0 = r6.asBinder();	 Catch:{ all -> 0x003d }
            L_0x0014:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x003d }
                if (r7 == 0) goto L_0x0025;
            L_0x0019:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x003d }
                r0 = 0;
                r7.writeToParcel(r1, r0);	 Catch:{ all -> 0x003d }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x0029;
            L_0x0025:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003d }
            L_0x0029:
                r0 = r5.zznI;	 Catch:{ all -> 0x003d }
                r3 = 16;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003d }
                r2.readException();	 Catch:{ all -> 0x003d }
                r2.recycle();
                r1.recycle();
                return;
            L_0x003b:
                r0 = 0;
                goto L_0x0014;
            L_0x003d:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzaw.zza.zza.zza(com.google.android.gms.wearable.internal.zzau, com.google.android.gms.wearable.internal.AddListenerRequest):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.wearable.internal.zzau r6, com.google.android.gms.wearable.internal.RemoveListenerRequest r7) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableService";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x003d }
                if (r6 == 0) goto L_0x003b;
            L_0x0010:
                r0 = r6.asBinder();	 Catch:{ all -> 0x003d }
            L_0x0014:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x003d }
                if (r7 == 0) goto L_0x0025;
            L_0x0019:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x003d }
                r0 = 0;
                r7.writeToParcel(r1, r0);	 Catch:{ all -> 0x003d }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x0029;
            L_0x0025:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003d }
            L_0x0029:
                r0 = r5.zznI;	 Catch:{ all -> 0x003d }
                r3 = 17;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003d }
                r2.readException();	 Catch:{ all -> 0x003d }
                r2.recycle();
                r1.recycle();
                return;
            L_0x003b:
                r0 = 0;
                goto L_0x0014;
            L_0x003d:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzaw.zza.zza.zza(com.google.android.gms.wearable.internal.zzau, com.google.android.gms.wearable.internal.RemoveListenerRequest):void");
            }

            public void zzd(zzau com_google_android_gms_wearable_internal_zzau) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
                    obtain.writeStrongBinder(com_google_android_gms_wearable_internal_zzau != null ? com_google_android_gms_wearable_internal_zzau.asBinder() : null);
                    this.zznI.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzaw zzea(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzaw)) ? new zza(iBinder) : (zzaw) queryLocalInterface;
        }
    }

    void zza(zzau com_google_android_gms_wearable_internal_zzau, AddListenerRequest addListenerRequest);

    void zza(zzau com_google_android_gms_wearable_internal_zzau, RemoveListenerRequest removeListenerRequest);

    void zzd(zzau com_google_android_gms_wearable_internal_zzau);
}
