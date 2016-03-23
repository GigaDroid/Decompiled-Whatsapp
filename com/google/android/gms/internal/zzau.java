package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface zzau extends IInterface {

    public abstract class zza extends Binder implements zzau {

        class zza implements zzau {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.os.Bundle zza(android.accounts.Account r7, java.lang.String r8, android.os.Bundle r9) {
                /*
                r6 = this;
                r1 = com.google.android.gms.internal.zzkq.a;
                r2 = android.os.Parcel.obtain();
                r3 = android.os.Parcel.obtain();
                r0 = "com.google.android.auth.IAuthManagerService";
                r2.writeInterfaceToken(r0);	 Catch:{ zza -> 0x005b }
                if (r7 == 0) goto L_0x0022;
            L_0x0012:
                r0 = 1;
                r2.writeInt(r0);	 Catch:{ zza -> 0x005b }
                r0 = 0;
                r7.writeToParcel(r2, r0);	 Catch:{ zza -> 0x005b }
                if (r1 == 0) goto L_0x0026;
            L_0x001c:
                r0 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;	 Catch:{ all -> 0x005d }
                r0 = r0 + 1;
                com.google.android.gms.common.internal.safeparcel.zza.zza.a = r0;	 Catch:{ all -> 0x005d }
            L_0x0022:
                r0 = 0;
                r2.writeInt(r0);	 Catch:{ all -> 0x005d }
            L_0x0026:
                r2.writeString(r8);	 Catch:{ zza -> 0x0065 }
                if (r9 == 0) goto L_0x0035;
            L_0x002b:
                r0 = 1;
                r2.writeInt(r0);	 Catch:{ zza -> 0x0065 }
                r0 = 0;
                r9.writeToParcel(r2, r0);	 Catch:{ zza -> 0x0065 }
                if (r1 == 0) goto L_0x0039;
            L_0x0035:
                r0 = 0;
                r2.writeInt(r0);	 Catch:{ zza -> 0x0067 }
            L_0x0039:
                r0 = r6.zznI;	 Catch:{ all -> 0x005d }
                r4 = 5;
                r5 = 0;
                r0.transact(r4, r2, r3, r5);	 Catch:{ all -> 0x005d }
                r3.readException();	 Catch:{ all -> 0x005d }
                r0 = r3.readInt();	 Catch:{ all -> 0x005d }
                if (r0 == 0) goto L_0x0053;
            L_0x0049:
                r0 = android.os.Bundle.CREATOR;	 Catch:{ all -> 0x005d }
                r0 = r0.createFromParcel(r3);	 Catch:{ all -> 0x005d }
                r0 = (android.os.Bundle) r0;	 Catch:{ all -> 0x005d }
                if (r1 == 0) goto L_0x0054;
            L_0x0053:
                r0 = 0;
            L_0x0054:
                r3.recycle();
                r2.recycle();
                return r0;
            L_0x005b:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x005d }
            L_0x005d:
                r0 = move-exception;
                r3.recycle();
                r2.recycle();
                throw r0;
            L_0x0065:
                r0 = move-exception;
                throw r0;	 Catch:{ zza -> 0x0067 }
            L_0x0067:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x005d }
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzau.zza.zza.zza(android.accounts.Account, java.lang.String, android.os.Bundle):android.os.Bundle");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.os.Bundle zza(java.lang.String r9, android.os.Bundle r10) {
                /*
                r8 = this;
                r2 = 1;
                r1 = 0;
                r3 = com.google.android.gms.internal.zzkq.a;
                r4 = android.os.Parcel.obtain();
                r5 = android.os.Parcel.obtain();
                r0 = "com.google.android.auth.IAuthManagerService";
                r4.writeInterfaceToken(r0);	 Catch:{ zza -> 0x004f }
                r4.writeString(r9);	 Catch:{ zza -> 0x004f }
                if (r10 == 0) goto L_0x0021;
            L_0x0017:
                r0 = 1;
                r4.writeInt(r0);	 Catch:{ zza -> 0x004f }
                r0 = 0;
                r10.writeToParcel(r4, r0);	 Catch:{ zza -> 0x004f }
                if (r3 == 0) goto L_0x0025;
            L_0x0021:
                r0 = 0;
                r4.writeInt(r0);	 Catch:{ zza -> 0x0051 }
            L_0x0025:
                r0 = r8.zznI;	 Catch:{ all -> 0x0053 }
                r6 = 2;
                r7 = 0;
                r0.transact(r6, r4, r5, r7);	 Catch:{ all -> 0x0053 }
                r5.readException();	 Catch:{ all -> 0x0053 }
                r0 = r5.readInt();	 Catch:{ all -> 0x0053 }
                if (r0 == 0) goto L_0x003f;
            L_0x0035:
                r0 = android.os.Bundle.CREATOR;	 Catch:{ all -> 0x0053 }
                r0 = r0.createFromParcel(r5);	 Catch:{ all -> 0x0053 }
                r0 = (android.os.Bundle) r0;	 Catch:{ all -> 0x0053 }
                if (r3 == 0) goto L_0x0040;
            L_0x003f:
                r0 = 0;
            L_0x0040:
                r5.recycle();
                r4.recycle();
                r4 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;	 Catch:{ zza -> 0x005b }
                if (r4 == 0) goto L_0x004e;
            L_0x004a:
                if (r3 == 0) goto L_0x005f;
            L_0x004c:
                com.google.android.gms.internal.zzkq.a = r1;
            L_0x004e:
                return r0;
            L_0x004f:
                r0 = move-exception;
                throw r0;	 Catch:{ zza -> 0x0051 }
            L_0x0051:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x0053 }
            L_0x0053:
                r0 = move-exception;
                r5.recycle();
                r4.recycle();
                throw r0;
            L_0x005b:
                r0 = move-exception;
                throw r0;	 Catch:{ zza -> 0x005d }
            L_0x005d:
                r0 = move-exception;
                throw r0;
            L_0x005f:
                r1 = r2;
                goto L_0x004c;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzau.zza.zza.zza(java.lang.String, android.os.Bundle):android.os.Bundle");
            }
        }

        public static zzau zza(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzau)) ? new zza(iBinder) : (zzau) queryLocalInterface;
        }
    }

    Bundle zza(Account account, String str, Bundle bundle);

    Bundle zza(String str, Bundle bundle);
}
