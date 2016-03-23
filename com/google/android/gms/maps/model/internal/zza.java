package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

public interface zza extends IInterface {

    public abstract class zza extends Binder implements zza {

        class zza implements zza {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.zzd zzb(android.graphics.Bitmap r9) {
                /*
                r8 = this;
                r1 = 1;
                r0 = 0;
                r2 = com.google.android.gms.maps.model.internal.zzf.zza.a;
                r3 = android.os.Parcel.obtain();
                r4 = android.os.Parcel.obtain();
                r5 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate";
                r3.writeInterfaceToken(r5);	 Catch:{ all -> 0x0043 }
                if (r9 == 0) goto L_0x001e;
            L_0x0014:
                r5 = 1;
                r3.writeInt(r5);	 Catch:{ all -> 0x0043 }
                r5 = 0;
                r9.writeToParcel(r3, r5);	 Catch:{ all -> 0x0043 }
                if (r2 == 0) goto L_0x0022;
            L_0x001e:
                r5 = 0;
                r3.writeInt(r5);	 Catch:{ all -> 0x0043 }
            L_0x0022:
                r5 = r8.zznI;	 Catch:{ all -> 0x0043 }
                r6 = 6;
                r7 = 0;
                r5.transact(r6, r3, r4, r7);	 Catch:{ all -> 0x0043 }
                r4.readException();	 Catch:{ all -> 0x0043 }
                r5 = r4.readStrongBinder();	 Catch:{ all -> 0x0043 }
                r5 = com.google.android.gms.dynamic.zzd.zza.zzbk(r5);	 Catch:{ all -> 0x0043 }
                r4.recycle();
                r3.recycle();
                r3 = com.google.android.gms.maps.GoogleMap.a;
                if (r3 == 0) goto L_0x0042;
            L_0x003e:
                if (r2 == 0) goto L_0x004b;
            L_0x0040:
                com.google.android.gms.maps.model.internal.zzf.zza.a = r0;
            L_0x0042:
                return r5;
            L_0x0043:
                r0 = move-exception;
                r4.recycle();
                r3.recycle();
                throw r0;
            L_0x004b:
                r0 = r1;
                goto L_0x0040;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.internal.zza.zza.zza.zzb(android.graphics.Bitmap):com.google.android.gms.dynamic.zzd");
            }

            public zzd zzhM(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeInt(i);
                    this.zznI.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    zzd zzbk = com.google.android.gms.dynamic.zzd.zza.zzbk(obtain2.readStrongBinder());
                    return zzbk;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zza zzcO(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zza)) ? new zza(iBinder) : (zza) queryLocalInterface;
        }
    }

    zzd zzb(Bitmap bitmap);

    zzd zzhM(int i);
}
