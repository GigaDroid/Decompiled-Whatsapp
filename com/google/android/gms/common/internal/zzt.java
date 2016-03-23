package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface zzt extends IInterface {

    public abstract class zza extends Binder implements zzt {
        public zza() {
            attachInterface(this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
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
                case 2: goto L_0x0011;
                case 1598968902: goto L_0x0009;
                default: goto L_0x0004;
            };
        L_0x0004:
            r0 = super.onTransact(r4, r5, r6, r7);
        L_0x0008:
            return r0;
        L_0x0009:
            r0 = "com.google.android.gms.common.internal.IResolveAccountCallbacks";
            r6.writeString(r0);
            r0 = r1;
            goto L_0x0008;
        L_0x0011:
            r0 = "com.google.android.gms.common.internal.IResolveAccountCallbacks";
            r5.enforceInterface(r0);
            r0 = r5.readInt();
            if (r0 == 0) goto L_0x0029;
        L_0x001d:
            r0 = com.google.android.gms.common.internal.ResolveAccountResponse.CREATOR;
            r0 = r0.createFromParcel(r5);
            r0 = (com.google.android.gms.common.internal.ResolveAccountResponse) r0;
            r2 = com.google.android.gms.common.internal.zzx.a;
            if (r2 == 0) goto L_0x002a;
        L_0x0029:
            r0 = 0;
        L_0x002a:
            r3.zzb(r0);
            r6.writeNoException();
            r0 = r1;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzt.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void zzb(ResolveAccountResponse resolveAccountResponse);
}
