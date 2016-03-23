package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface zzg extends IInterface {

    public abstract class zza extends Binder implements zzg {

        class zza implements zzg {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.location.internal.LocationRequestUpdateData r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0032 }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0032 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0032 }
                r0 = com.google.android.gms.location.internal.zzj.b;	 Catch:{ all -> 0x0032 }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0032 }
            L_0x0020:
                r0 = r5.zznI;	 Catch:{ all -> 0x0032 }
                r3 = 59;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0032 }
                r2.readException();	 Catch:{ all -> 0x0032 }
                r2.recycle();
                r1.recycle();
                return;
            L_0x0032:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.zzg.zza.zza.zza(com.google.android.gms.location.internal.LocationRequestUpdateData):void");
            }

            public void zzag(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.zznI.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.location.Location zzdw(java.lang.String r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.location.internal.IGoogleLocationManagerService";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0036 }
                r1.writeString(r6);	 Catch:{ all -> 0x0036 }
                r0 = r5.zznI;	 Catch:{ all -> 0x0036 }
                r3 = 21;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0036 }
                r2.readException();	 Catch:{ all -> 0x0036 }
                r0 = r2.readInt();	 Catch:{ all -> 0x0036 }
                if (r0 == 0) goto L_0x002e;
            L_0x0022:
                r0 = android.location.Location.CREATOR;	 Catch:{ all -> 0x0036 }
                r0 = r0.createFromParcel(r2);	 Catch:{ all -> 0x0036 }
                r0 = (android.location.Location) r0;	 Catch:{ all -> 0x0036 }
                r3 = com.google.android.gms.location.internal.zzj.b;	 Catch:{ all -> 0x0036 }
                if (r3 == 0) goto L_0x002f;
            L_0x002e:
                r0 = 0;
            L_0x002f:
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0036:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.zzg.zza.zza.zzdw(java.lang.String):android.location.Location");
            }
        }

        public static zzg zzca(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzg)) ? new zza(iBinder) : (zzg) queryLocalInterface;
        }
    }

    void zza(LocationRequestUpdateData locationRequestUpdateData);

    void zzag(boolean z);

    Location zzdw(String str);
}
