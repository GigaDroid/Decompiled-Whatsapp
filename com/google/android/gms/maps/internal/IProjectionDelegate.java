package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public interface IProjectionDelegate extends IInterface {

    public abstract class zza extends Binder implements IProjectionDelegate {

        class zza implements IProjectionDelegate {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IProjectionDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0030 }
                r0 = r5.zznI;	 Catch:{ all -> 0x0030 }
                r3 = 3;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0030 }
                r2.readException();	 Catch:{ all -> 0x0030 }
                r0 = r2.readInt();	 Catch:{ all -> 0x0030 }
                if (r0 == 0) goto L_0x0028;
            L_0x001e:
                r0 = com.google.android.gms.maps.model.VisibleRegion.CREATOR;	 Catch:{ all -> 0x0030 }
                r0 = r0.zzfl(r2);	 Catch:{ all -> 0x0030 }
                r3 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x0030 }
                if (r3 == 0) goto L_0x0029;
            L_0x0028:
                r0 = 0;
            L_0x0029:
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0030:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IProjectionDelegate.zza.zza.getVisibleRegion():com.google.android.gms.maps.model.VisibleRegion");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.google.android.gms.dynamic.zzd toScreenLocation(com.google.android.gms.maps.model.LatLng r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r2 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.maps.internal.IProjectionDelegate";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0039 }
                if (r6 == 0) goto L_0x001c;
            L_0x0010:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0039 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0039 }
                r0 = com.google.android.gms.maps.internal.zzl.zza.a;	 Catch:{ all -> 0x0039 }
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0039 }
            L_0x0020:
                r0 = r5.zznI;	 Catch:{ all -> 0x0039 }
                r3 = 2;
                r4 = 0;
                r0.transact(r3, r1, r2, r4);	 Catch:{ all -> 0x0039 }
                r2.readException();	 Catch:{ all -> 0x0039 }
                r0 = r2.readStrongBinder();	 Catch:{ all -> 0x0039 }
                r0 = com.google.android.gms.dynamic.zzd.zza.zzbk(r0);	 Catch:{ all -> 0x0039 }
                r2.recycle();
                r1.recycle();
                return r0;
            L_0x0039:
                r0 = move-exception;
                r2.recycle();
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.IProjectionDelegate.zza.zza.toScreenLocation(com.google.android.gms.maps.model.LatLng):com.google.android.gms.dynamic.zzd");
            }
        }

        public static IProjectionDelegate zzcI(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IProjectionDelegate)) ? new zza(iBinder) : (IProjectionDelegate) queryLocalInterface;
        }
    }

    VisibleRegion getVisibleRegion();

    zzd toScreenLocation(LatLng latLng);
}
