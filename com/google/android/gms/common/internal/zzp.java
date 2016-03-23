package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface zzp extends IInterface {

    public abstract class zza extends Binder implements zzp {

        class zza implements zzp {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.accounts.Account getAccount() {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.common.internal.IAccountAccessor";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0032 }
                r0 = r5.zznI;	 Catch:{ all -> 0x0032 }
                r3 = 2;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0032 }
                r2.readException();	 Catch:{ all -> 0x0032 }
                r0 = r2.readInt();	 Catch:{ all -> 0x0032 }
                if (r0 == 0) goto L_0x002a;
            L_0x001e:
                r0 = android.accounts.Account.CREATOR;	 Catch:{ all -> 0x0032 }
                r0 = r0.createFromParcel(r2);	 Catch:{ all -> 0x0032 }
                r0 = (android.accounts.Account) r0;	 Catch:{ all -> 0x0032 }
                r3 = com.google.android.gms.common.internal.zzx.a;	 Catch:{ all -> 0x0032 }
                if (r3 == 0) goto L_0x002b;
            L_0x002a:
                r0 = 0;
            L_0x002b:
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0032:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzp.zza.zza.getAccount():android.accounts.Account");
            }
        }

        public static zzp zzaH(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzp)) ? new zza(iBinder) : (zzp) queryLocalInterface;
        }
    }

    Account getAccount();
}
