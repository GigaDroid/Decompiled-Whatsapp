package com.google.android.gms.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

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
            public void onLocationAvailability(com.google.android.gms.location.LocationAvailability r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.location.ILocationCallback";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0028 }
                r0 = com.google.android.gms.location.LocationServices.zza.a;	 Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0028 }
                r2 = 2;
                r3 = 0;
                r4 = 1;
                r0.transact(r2, r1, r3, r4);	 Catch:{ all -> 0x0028 }
                r1.recycle();
                return;
            L_0x0028:
                r0 = move-exception;
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzc.zza.zza.onLocationAvailability(com.google.android.gms.location.LocationAvailability):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onLocationResult(com.google.android.gms.location.LocationResult r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.location.ILocationCallback";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0028 }
                r0 = com.google.android.gms.location.LocationServices.zza.a;	 Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0028 }
                r2 = 1;
                r3 = 0;
                r4 = 1;
                r0.transact(r2, r1, r3, r4);	 Catch:{ all -> 0x0028 }
                r1.recycle();
                return;
            L_0x0028:
                r0 = move-exception;
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzc.zza.zza.onLocationResult(com.google.android.gms.location.LocationResult):void");
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.location.ILocationCallback");
        }

        public static zzc zzbW(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzc)) ? new zza(iBinder) : (zzc) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
            r4 = this;
            r1 = 0;
            r2 = 1;
            r3 = com.google.android.gms.location.LocationServices.zza.a;
            switch(r5) {
                case 1: goto L_0x0014;
                case 2: goto L_0x0030;
                case 1598968902: goto L_0x000c;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = super.onTransact(r5, r6, r7, r8);
        L_0x000b:
            return r0;
        L_0x000c:
            r0 = "com.google.android.gms.location.ILocationCallback";
            r7.writeString(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0014:
            r0 = "com.google.android.gms.location.ILocationCallback";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x002a;
        L_0x0020:
            r0 = com.google.android.gms.location.LocationResult.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.location.LocationResult) r0;
            if (r3 == 0) goto L_0x002b;
        L_0x002a:
            r0 = r1;
        L_0x002b:
            r4.onLocationResult(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0030:
            r0 = "com.google.android.gms.location.ILocationCallback";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0044;
        L_0x003c:
            r0 = com.google.android.gms.location.LocationAvailability.CREATOR;
            r0 = r0.createFromParcel(r6);
            if (r3 == 0) goto L_0x0049;
        L_0x0044:
            r4.onLocationAvailability(r1);
            r0 = r2;
            goto L_0x000b;
        L_0x0049:
            r1 = r0;
            goto L_0x0044;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzc.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onLocationAvailability(LocationAvailability locationAvailability);

    void onLocationResult(LocationResult locationResult);
}
