package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

public interface zzav extends IInterface {

    public abstract class zza extends Binder implements zzav {
        public static boolean a;

        class zza implements zzav {
            private IBinder zznI;

            zza(IBinder iBinder) {
                this.zznI = iBinder;
            }

            public IBinder asBinder() {
                return this.zznI;
            }

            public void onConnectedNodes(List list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    obtain.writeTypedList(list);
                    this.zznI.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableListener";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0029 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0029 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0029 }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x0029 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0029 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0029 }
                r2 = 9;
                r3 = 0;
                r4 = 1;
                r0.transact(r2, r1, r3, r4);	 Catch:{ all -> 0x0029 }
                r1.recycle();
                return;
            L_0x0029:
                r0 = move-exception;
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.zza.zza(com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.wearable.internal.AncsNotificationParcelable r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableListener";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0028 }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0028 }
                r2 = 6;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.zza.zza(com.google.android.gms.wearable.internal.AncsNotificationParcelable):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.wearable.internal.CapabilityInfoParcelable r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableListener";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0029 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0029 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0029 }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x0029 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0029 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0029 }
                r2 = 8;
                r3 = 0;
                r4 = 1;
                r0.transact(r2, r1, r3, r4);	 Catch:{ all -> 0x0029 }
                r1.recycle();
                return;
            L_0x0029:
                r0 = move-exception;
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.zza.zza(com.google.android.gms.wearable.internal.CapabilityInfoParcelable):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.wearable.internal.ChannelEventParcelable r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableListener";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0028 }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0028 }
                r2 = 7;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.zza.zza(com.google.android.gms.wearable.internal.ChannelEventParcelable):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.wearable.internal.MessageEventParcelable r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableListener";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0028 }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0028 }
                r2 = 2;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.zza.zza(com.google.android.gms.wearable.internal.MessageEventParcelable):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zza(com.google.android.gms.wearable.internal.NodeParcelable r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableListener";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0028 }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0028 }
                r2 = 3;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.zza.zza(com.google.android.gms.wearable.internal.NodeParcelable):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zzad(com.google.android.gms.common.data.DataHolder r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableListener";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0028 }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x0028 }
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.zza.zzad(com.google.android.gms.common.data.DataHolder):void");
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void zzb(com.google.android.gms.wearable.internal.NodeParcelable r6) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = "com.google.android.gms.wearable.internal.IWearableListener";
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0028 }
                if (r6 == 0) goto L_0x0018;
            L_0x000c:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
                r0 = 0;
                r6.writeToParcel(r1, r0);	 Catch:{ all -> 0x0028 }
                r0 = com.google.android.gms.wearable.internal.zzau.zza.a;	 Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x001c;
            L_0x0018:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0028 }
            L_0x001c:
                r0 = r5.zznI;	 Catch:{ all -> 0x0028 }
                r2 = 4;
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.zza.zzb(com.google.android.gms.wearable.internal.NodeParcelable):void");
            }
        }

        public zza() {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }

        public static zzav zzdZ(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzav)) ? new zza(iBinder) : (zzav) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
            r4 = this;
            r1 = 0;
            r2 = 1;
            r3 = com.google.android.gms.wearable.internal.zzau.zza.a;
            switch(r5) {
                case 1: goto L_0x0014;
                case 2: goto L_0x002e;
                case 3: goto L_0x004a;
                case 4: goto L_0x0066;
                case 5: goto L_0x0082;
                case 6: goto L_0x0094;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00ce;
                case 9: goto L_0x00eb;
                case 1598968902: goto L_0x000c;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = super.onTransact(r5, r6, r7, r8);
        L_0x000b:
            return r0;
        L_0x000c:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r7.writeString(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0014:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0028;
        L_0x0020:
            r0 = com.google.android.gms.common.data.DataHolder.CREATOR;
            r0 = r0.zzaa(r6);
            if (r3 == 0) goto L_0x0029;
        L_0x0028:
            r0 = r1;
        L_0x0029:
            r4.zzad(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x002e:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0044;
        L_0x003a:
            r0 = com.google.android.gms.wearable.internal.MessageEventParcelable.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.MessageEventParcelable) r0;
            if (r3 == 0) goto L_0x0045;
        L_0x0044:
            r0 = r1;
        L_0x0045:
            r4.zza(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x004a:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0060;
        L_0x0056:
            r0 = com.google.android.gms.wearable.internal.NodeParcelable.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.NodeParcelable) r0;
            if (r3 == 0) goto L_0x0061;
        L_0x0060:
            r0 = r1;
        L_0x0061:
            r4.zza(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0066:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x007c;
        L_0x0072:
            r0 = com.google.android.gms.wearable.internal.NodeParcelable.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.NodeParcelable) r0;
            if (r3 == 0) goto L_0x007d;
        L_0x007c:
            r0 = r1;
        L_0x007d:
            r4.zzb(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0082:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = com.google.android.gms.wearable.internal.NodeParcelable.CREATOR;
            r0 = r6.createTypedArrayList(r0);
            r4.onConnectedNodes(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0094:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x00aa;
        L_0x00a0:
            r0 = com.google.android.gms.wearable.internal.AncsNotificationParcelable.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.AncsNotificationParcelable) r0;
            if (r3 == 0) goto L_0x00ab;
        L_0x00aa:
            r0 = r1;
        L_0x00ab:
            r4.zza(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x00b1:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x00c7;
        L_0x00bd:
            r0 = com.google.android.gms.wearable.internal.ChannelEventParcelable.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.ChannelEventParcelable) r0;
            if (r3 == 0) goto L_0x00c8;
        L_0x00c7:
            r0 = r1;
        L_0x00c8:
            r4.zza(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x00ce:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x00e4;
        L_0x00da:
            r0 = com.google.android.gms.wearable.internal.CapabilityInfoParcelable.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.CapabilityInfoParcelable) r0;
            if (r3 == 0) goto L_0x00e5;
        L_0x00e4:
            r0 = r1;
        L_0x00e5:
            r4.zza(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x00eb:
            r0 = "com.google.android.gms.wearable.internal.IWearableListener";
            r6.enforceInterface(r0);
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0101;
        L_0x00f7:
            r0 = com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable) r0;
            if (r3 == 0) goto L_0x0102;
        L_0x0101:
            r0 = r1;
        L_0x0102:
            r4.zza(r0);
            r0 = r2;
            goto L_0x000b;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzav.zza.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void onConnectedNodes(List list);

    void zza(AmsEntityUpdateParcelable amsEntityUpdateParcelable);

    void zza(AncsNotificationParcelable ancsNotificationParcelable);

    void zza(CapabilityInfoParcelable capabilityInfoParcelable);

    void zza(ChannelEventParcelable channelEventParcelable);

    void zza(MessageEventParcelable messageEventParcelable);

    void zza(NodeParcelable nodeParcelable);

    void zzad(DataHolder dataHolder);

    void zzb(NodeParcelable nodeParcelable);
}
