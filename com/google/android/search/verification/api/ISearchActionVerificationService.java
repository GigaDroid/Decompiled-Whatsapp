package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public interface ISearchActionVerificationService extends IInterface {

    public abstract class Stub extends Binder implements ISearchActionVerificationService {
        public static int a;

        class Proxy implements ISearchActionVerificationService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean isSearchAction(android.content.Intent r8, android.os.Bundle r9) {
                /*
                r7 = this;
                r0 = 1;
                r1 = 0;
                r2 = com.google.android.search.verification.api.ISearchActionVerificationService.Stub.a;
                r3 = android.os.Parcel.obtain();
                r4 = android.os.Parcel.obtain();
                r5 = "com.google.android.search.verification.api.ISearchActionVerificationService";
                r3.writeInterfaceToken(r5);	 Catch:{ all -> 0x0051 }
                if (r8 == 0) goto L_0x0024;
            L_0x0014:
                r5 = 1;
                r3.writeInt(r5);	 Catch:{ all -> 0x0051 }
                r5 = 0;
                r8.writeToParcel(r3, r5);	 Catch:{ all -> 0x0051 }
                if (r2 == 0) goto L_0x0028;
            L_0x001e:
                r5 = com.google.android.search.verification.client.SearchActionVerificationClientService.a;	 Catch:{ all -> 0x0051 }
                r5 = r5 + 1;
                com.google.android.search.verification.client.SearchActionVerificationClientService.a = r5;	 Catch:{ all -> 0x0051 }
            L_0x0024:
                r5 = 0;
                r3.writeInt(r5);	 Catch:{ all -> 0x0051 }
            L_0x0028:
                if (r9 == 0) goto L_0x0034;
            L_0x002a:
                r5 = 1;
                r3.writeInt(r5);	 Catch:{ all -> 0x0051 }
                r5 = 0;
                r9.writeToParcel(r3, r5);	 Catch:{ all -> 0x0051 }
                if (r2 == 0) goto L_0x0038;
            L_0x0034:
                r2 = 0;
                r3.writeInt(r2);	 Catch:{ all -> 0x0051 }
            L_0x0038:
                r2 = r7.mRemote;	 Catch:{ all -> 0x0051 }
                r5 = 1;
                r6 = 0;
                r2.transact(r5, r3, r4, r6);	 Catch:{ all -> 0x0051 }
                r4.readException();	 Catch:{ all -> 0x0051 }
                r2 = r4.readInt();	 Catch:{ all -> 0x0051 }
                if (r2 == 0) goto L_0x004f;
            L_0x0048:
                r4.recycle();
                r3.recycle();
                return r0;
            L_0x004f:
                r0 = r1;
                goto L_0x0048;
            L_0x0051:
                r0 = move-exception;
                r4.recycle();
                r3.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.api.ISearchActionVerificationService.Stub.Proxy.isSearchAction(android.content.Intent, android.os.Bundle):boolean");
            }

            public int getVersion() {
                int i = Stub.a;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    if (SearchActionVerificationClientService.a != 0) {
                        Stub.a = i + 1;
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ISearchActionVerificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISearchActionVerificationService)) {
                return new Proxy(iBinder);
            }
            return (ISearchActionVerificationService) queryLocalInterface;
        }
    }

    int getVersion();

    boolean isSearchAction(Intent intent, Bundle bundle);
}
