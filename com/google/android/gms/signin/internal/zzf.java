package com.google.android.gms.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzt;

public interface zzf extends IInterface {

    public abstract class zza extends Binder implements zzf {

        class zza implements zzf {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.common.internal.AuthAccountRequest r6, com.google.android.gms.signin.internal.zze r7) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.signin.internal.ISignInService";
                r1.writeInterfaceToken(r0);	 Catch:{ zza -> 0x003a }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ zza -> 0x003a }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ zza -> 0x003a }
                r0 = com.google.android.gms.signin.internal.zze.zza.a;	 Catch:{ zza -> 0x003a }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ zza -> 0x003c }
            L_0x0020:
                if (r7 == 0) goto L_0x0048;
            L_0x0022:
                r0 = r7.asBinder();	 Catch:{ zza -> 0x0046 }
            L_0x0026:
                r1.writeStrongBinder(r0);	 Catch:{ all -> 0x003e }
                r0 = r5.zznI;	 Catch:{ all -> 0x003e }
                r3 = 2;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x003e }
                r2.readException();	 Catch:{ all -> 0x003e }
                r2.recycle();
                r1.recycle();
                return;
            L_0x003a:
                r0 = move-exception;
                throw r0;	 Catch:{ zza -> 0x003c }
            L_0x003c:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x003e }
            L_0x003e:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
            L_0x0046:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x003e }
            L_0x0048:
                r0 = 0;
                goto L_0x0026;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.zzf.zza.zza.zza(com.google.android.gms.common.internal.AuthAccountRequest, com.google.android.gms.signin.internal.zze):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.common.internal.ResolveAccountRequest r9, com.google.android.gms.common.internal.zzt r10) {
                /*
                r8 = this;
                r1 = 1;
                r0 = 0;
                r3 = com.google.android.gms.signin.internal.zze.zza.a;
                r4 = android.os.Parcel.obtain();
                r5 = android.os.Parcel.obtain();
                r2 = "com.google.android.gms.signin.internal.ISignInService";
                r4.writeInterfaceToken(r2);	 Catch:{ zza -> 0x0044 }
                if (r9 == 0) goto L_0x001e;
            L_0x0014:
                r2 = 1;
                r4.writeInt(r2);	 Catch:{ zza -> 0x0044 }
                r2 = 0;
                r9.writeToParcel(r4, r2);	 Catch:{ zza -> 0x0044 }
                if (r3 == 0) goto L_0x0022;
            L_0x001e:
                r2 = 0;
                r4.writeInt(r2);	 Catch:{ zza -> 0x0046 }
            L_0x0022:
                if (r10 == 0) goto L_0x0052;
            L_0x0024:
                r2 = r10.asBinder();	 Catch:{ zza -> 0x0050 }
            L_0x0028:
                r4.writeStrongBinder(r2);	 Catch:{ all -> 0x0048 }
                r2 = r8.zznI;	 Catch:{ all -> 0x0048 }
                r6 = 5;
                r7 = 0;
                r2.transact(r6, r4, r5, r7);	 Catch:{ all -> 0x0048 }
                r5.readException();	 Catch:{ all -> 0x0048 }
                r5.recycle();
                r4.recycle();
                r2 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;	 Catch:{ zza -> 0x0054 }
                if (r2 == 0) goto L_0x0043;
            L_0x003f:
                if (r3 == 0) goto L_0x0058;
            L_0x0041:
                com.google.android.gms.signin.internal.zze.zza.a = r0;
            L_0x0043:
                return;
            L_0x0044:
                r0 = move-exception;
                throw r0;	 Catch:{ zza -> 0x0046 }
            L_0x0046:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x0048 }
            L_0x0048:
                r0 = move-exception;
                r5.recycle();
                r4.recycle();
                throw r0;
            L_0x0050:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x0048 }
            L_0x0052:
                r2 = 0;
                goto L_0x0028;
            L_0x0054:
                r0 = move-exception;
                throw r0;	 Catch:{ zza -> 0x0056 }
            L_0x0056:
                r0 = move-exception;
                throw r0;
            L_0x0058:
                r0 = r1;
                goto L_0x0041;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.zzf.zza.zza.zza(com.google.android.gms.common.internal.ResolveAccountRequest, com.google.android.gms.common.internal.zzt):void");
            }

            public void zza(zzp com_google_android_gms_common_internal_zzp, int i, boolean z) {
                int i2 = 0;
                boolean z2 = com.google.android.gms.signin.internal.zze.zza.a;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeStrongBinder(com_google_android_gms_common_internal_zzp != null ? com_google_android_gms_common_internal_zzp.asBinder() : null);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.zznI.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                    if (z2) {
                        com.google.android.gms.common.internal.safeparcel.zza.zza.a++;
                    }
                } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                    throw e;
                } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
                    throw e2;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.signin.internal.CheckServerAuthResult r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.signin.internal.ISignInService";
                r1.writeInterfaceToken(r0);	 Catch:{ zza -> 0x0031 }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ zza -> 0x0031 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ zza -> 0x0031 }
                r0 = com.google.android.gms.signin.internal.zze.zza.a;	 Catch:{ zza -> 0x0031 }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ zza -> 0x0033 }
            L_0x0020:
                r0 = r5.zznI;	 Catch:{ all -> 0x0035 }
                r3 = 3;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0035 }
                r2.readException();	 Catch:{ all -> 0x0035 }
                r2.recycle();
                r1.recycle();
                return;
            L_0x0031:
                r0 = move-exception;
                throw r0;	 Catch:{ zza -> 0x0033 }
            L_0x0033:
                r0 = move-exception;
                throw r0;	 Catch:{ all -> 0x0035 }
            L_0x0035:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.zzf.zza.zza.zza(com.google.android.gms.signin.internal.CheckServerAuthResult):void");
            }

            public void zzaq(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.zznI.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                    throw e;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void zzja(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    this.zznI.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzf zzdH(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzf)) ? new zza(iBinder) : (zzf) queryLocalInterface;
        }
    }

    void zza(AuthAccountRequest authAccountRequest, zze com_google_android_gms_signin_internal_zze);

    void zza(ResolveAccountRequest resolveAccountRequest, zzt com_google_android_gms_common_internal_zzt);

    void zza(zzp com_google_android_gms_common_internal_zzp, int i, boolean z);

    void zza(CheckServerAuthResult checkServerAuthResult);

    void zzaq(boolean z);

    void zzja(int i);
}
