package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface zzs extends IInterface {

    public abstract class zza extends Binder implements zzs {

        class zza implements zzs {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.common.internal.zzr r6, com.google.android.gms.common.internal.GetServiceRequest r7) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.common.internal.IGmsServiceBroker";
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
                r0 = com.google.android.gms.common.internal.zzx.a;	 Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x0029;
            L_0x0025:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003d }
            L_0x0029:
                r0 = r5.zznI;	 Catch:{ all -> 0x003d }
                r3 = 46;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzs.zza.zza.zza(com.google.android.gms.common.internal.zzr, com.google.android.gms.common.internal.GetServiceRequest):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.common.internal.zzr r6, com.google.android.gms.common.internal.ValidateAccountRequest r7) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.common.internal.IGmsServiceBroker";
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
                r0 = com.google.android.gms.common.internal.zzx.a;	 Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x0029;
            L_0x0025:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x003d }
            L_0x0029:
                r0 = r5.zznI;	 Catch:{ all -> 0x003d }
                r3 = 47;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzs.zza.zza.zza(com.google.android.gms.common.internal.zzr, com.google.android.gms.common.internal.ValidateAccountRequest):void");
            }
        }

        public static zzs zzaK(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzs)) ? new zza(iBinder) : (zzs) queryLocalInterface;
        }
    }

    void zza(zzr com_google_android_gms_common_internal_zzr, GetServiceRequest getServiceRequest);

    void zza(zzr com_google_android_gms_common_internal_zzr, ValidateAccountRequest validateAccountRequest);
}
