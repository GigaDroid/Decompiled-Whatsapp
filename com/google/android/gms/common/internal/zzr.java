package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface zzr extends IInterface {

    public abstract class zza extends Binder implements zzr {
        public zza() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
            /*
            r6 = this;
            r1 = 0;
            r2 = 1;
            r3 = com.google.android.gms.common.internal.zzx.a;
            switch(r7) {
                case 1: goto L_0x0014;
                case 2: goto L_0x003b;
                case 1598968902: goto L_0x000c;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = super.onTransact(r7, r8, r9, r10);
        L_0x000b:
            return r0;
        L_0x000c:
            r0 = "com.google.android.gms.common.internal.IGmsCallbacks";
            r9.writeString(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0014:
            r0 = "com.google.android.gms.common.internal.IGmsCallbacks";
            r8.enforceInterface(r0);
            r4 = r8.readInt();
            r5 = r8.readStrongBinder();
            r0 = r8.readInt();
            if (r0 == 0) goto L_0x0032;
        L_0x0028:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r8);
            r0 = (android.os.Bundle) r0;
            if (r3 == 0) goto L_0x0033;
        L_0x0032:
            r0 = r1;
        L_0x0033:
            r6.zza(r4, r5, r0);
            r9.writeNoException();
            r0 = r2;
            goto L_0x000b;
        L_0x003b:
            r0 = "com.google.android.gms.common.internal.IGmsCallbacks";
            r8.enforceInterface(r0);
            r4 = r8.readInt();
            r0 = r8.readInt();
            if (r0 == 0) goto L_0x0055;
        L_0x004b:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r8);
            r0 = (android.os.Bundle) r0;
            if (r3 == 0) goto L_0x0056;
        L_0x0055:
            r0 = r1;
        L_0x0056:
            r6.zzb(r4, r0);
            r9.writeNoException();
            r0 = r2;
            goto L_0x000b;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzr.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void zza(int i, IBinder iBinder, Bundle bundle);

    void zzb(int i, Bundle bundle);
}
