package com.google.android.gms.location;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface zzd extends IInterface {

    public abstract class zza extends Binder implements zzd {

        class zza implements zzd {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onLocationChanged(android.location.Location r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.location.ILocationListener";
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzd.zza.zza.onLocationChanged(android.location.Location):void");
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }

        public static zzd zzbX(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzd)) ? new zza(iBinder) : (zzd) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
            r3 = this;
            r1 = 1;
            switch(r4) {
                case 1: goto L_0x0011;
                case 1598968902: goto L_0x0009;
                default: goto L_0x0004;
            };
        L_0x0004:
            r0 = super.onTransact(r4, r5, r6, r7);
        L_0x0008:
            return r0;
        L_0x0009:
            r0 = "com.google.android.gms.location.ILocationListener";
            r6.writeString(r0);
            r0 = r1;
            goto L_0x0008;
        L_0x0011:
            r0 = "com.google.android.gms.location.ILocationListener";
            r5.enforceInterface(r0);
            r0 = r5.readInt();
            if (r0 == 0) goto L_0x0029;
        L_0x001d:
            r0 = android.location.Location.CREATOR;
            r0 = r0.createFromParcel(r5);
            r0 = (android.location.Location) r0;
            r2 = com.google.android.gms.location.LocationServices.zza.a;
            if (r2 == 0) goto L_0x002a;
        L_0x0029:
            r0 = 0;
        L_0x002a:
            r3.onLocationChanged(r0);
            r0 = r1;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zzd.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onLocationChanged(Location location);
}
