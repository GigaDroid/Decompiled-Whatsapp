package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.GoogleSignInAccount;

public interface zze extends IInterface {

    public abstract class zza extends Binder implements zze {
        public static boolean a;

        public zza() {
            attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            /*
            r5 = this;
            r3 = 1;
            r2 = 0;
            r4 = a;
            switch(r6) {
                case 3: goto L_0x0014;
                case 4: goto L_0x0044;
                case 6: goto L_0x0063;
                case 7: goto L_0x0082;
                case 1598968902: goto L_0x000c;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = super.onTransact(r6, r7, r8, r9);
        L_0x000b:
            return r0;
        L_0x000c:
            r0 = "com.google.android.gms.signin.internal.ISignInCallbacks";
            r8.writeString(r0);
            r0 = r3;
            goto L_0x000b;
        L_0x0014:
            r0 = "com.google.android.gms.signin.internal.ISignInCallbacks";
            r7.enforceInterface(r0);
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x002a;
        L_0x0020:
            r0 = com.google.android.gms.common.ConnectionResult.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (com.google.android.gms.common.ConnectionResult) r0;
            if (r4 == 0) goto L_0x00b5;
        L_0x002a:
            r1 = r2;
        L_0x002b:
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x003b;
        L_0x0031:
            r0 = com.google.android.gms.signin.internal.AuthAccountResult.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (com.google.android.gms.signin.internal.AuthAccountResult) r0;
            if (r4 == 0) goto L_0x003c;
        L_0x003b:
            r0 = r2;
        L_0x003c:
            r5.zza(r1, r0);
            r8.writeNoException();
            r0 = r3;
            goto L_0x000b;
        L_0x0044:
            r0 = "com.google.android.gms.signin.internal.ISignInCallbacks";
            r7.enforceInterface(r0);
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x005a;
        L_0x0050:
            r0 = com.google.android.gms.common.api.Status.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (com.google.android.gms.common.api.Status) r0;
            if (r4 == 0) goto L_0x005b;
        L_0x005a:
            r0 = r2;
        L_0x005b:
            r5.zzbe(r0);
            r8.writeNoException();
            r0 = r3;
            goto L_0x000b;
        L_0x0063:
            r0 = "com.google.android.gms.signin.internal.ISignInCallbacks";
            r7.enforceInterface(r0);
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x0079;
        L_0x006f:
            r0 = com.google.android.gms.common.api.Status.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (com.google.android.gms.common.api.Status) r0;
            if (r4 == 0) goto L_0x007a;
        L_0x0079:
            r0 = r2;
        L_0x007a:
            r5.zzbf(r0);
            r8.writeNoException();
            r0 = r3;
            goto L_0x000b;
        L_0x0082:
            r0 = "com.google.android.gms.signin.internal.ISignInCallbacks";
            r7.enforceInterface(r0);
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x0098;
        L_0x008e:
            r0 = com.google.android.gms.common.api.Status.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (com.google.android.gms.common.api.Status) r0;
            if (r4 == 0) goto L_0x00b3;
        L_0x0098:
            r1 = r2;
        L_0x0099:
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x00a9;
        L_0x009f:
            r0 = com.google.android.gms.signin.GoogleSignInAccount.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (com.google.android.gms.signin.GoogleSignInAccount) r0;
            if (r4 == 0) goto L_0x00aa;
        L_0x00a9:
            r0 = r2;
        L_0x00aa:
            r5.zza(r1, r0);
            r8.writeNoException();
            r0 = r3;
            goto L_0x000b;
        L_0x00b3:
            r1 = r0;
            goto L_0x0099;
        L_0x00b5:
            r1 = r0;
            goto L_0x002b;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.zze.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void zza(ConnectionResult connectionResult, AuthAccountResult authAccountResult);

    void zza(Status status, GoogleSignInAccount googleSignInAccount);

    void zzbe(Status status);

    void zzbf(Status status);
}
