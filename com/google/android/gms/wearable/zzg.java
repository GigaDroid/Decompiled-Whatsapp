package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wearable.internal.zzav.zza;

public class zzg implements Creator {
    static void zza(ConnectionConfiguration connectionConfiguration, Parcel parcel, int i) {
        int i2 = WearableListenerService.a;
        int zzak = zzb.zzak(parcel);
        try {
            zzb.zzc(parcel, 1, connectionConfiguration.mVersionCode);
            zzb.zza(parcel, 2, connectionConfiguration.getName(), false);
            zzb.zza(parcel, 3, connectionConfiguration.getAddress(), false);
            zzb.zzc(parcel, 4, connectionConfiguration.getType());
            zzb.zzc(parcel, 5, connectionConfiguration.getRole());
            zzb.zza(parcel, 6, connectionConfiguration.isEnabled());
            zzb.zza(parcel, 7, connectionConfiguration.isConnected());
            zzb.zza(parcel, 8, connectionConfiguration.zzCp(), false);
            zzb.zza(parcel, 9, connectionConfiguration.zzCq());
            zzb.zza(parcel, 10, connectionConfiguration.getNodeId(), false);
            zzb.zzH(parcel, zzak);
            if (zza.a) {
                WearableListenerService.a = i2 + 1;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhm(parcel);
    }

    public Object[] newArray(int i) {
        return zzku(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.ConnectionConfiguration zzhm(android.os.Parcel r20) {
        /*
        r19 = this;
        r11 = com.google.android.gms.wearable.WearableListenerService.a;
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r20);
        r10 = 0;
        r9 = 0;
        r8 = 0;
        r7 = 0;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r1 = 0;
    L_0x0010:
        r13 = r20.dataPosition();
        if (r13 >= r12) goto L_0x0028;
    L_0x0016:
        r13 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r20);
        r14 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r13);
        switch(r14) {
            case 1: goto L_0x005f;
            case 2: goto L_0x0067;
            case 3: goto L_0x006f;
            case 4: goto L_0x0077;
            case 5: goto L_0x007f;
            case 6: goto L_0x0087;
            case 7: goto L_0x008f;
            case 8: goto L_0x0097;
            case 9: goto L_0x009f;
            case 10: goto L_0x00a7;
            default: goto L_0x0021;
        };
    L_0x0021:
        r0 = r20;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r13);	 Catch:{ zza -> 0x00b1 }
    L_0x0026:
        if (r11 == 0) goto L_0x0010;
    L_0x0028:
        r11 = r1;
        r15 = r2;
        r2 = r10;
        r10 = r15;
        r16 = r4;
        r4 = r8;
        r8 = r16;
        r17 = r7;
        r7 = r5;
        r5 = r17;
        r18 = r9;
        r9 = r3;
        r3 = r18;
        r1 = r20.dataPosition();	 Catch:{ zza -> 0x005d }
        if (r1 == r12) goto L_0x00b3;
    L_0x0041:
        r1 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x005d }
        r2 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x005d }
        r2.<init>();	 Catch:{ zza -> 0x005d }
        r3 = "Overread allowed size end=";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x005d }
        r2 = r2.append(r12);	 Catch:{ zza -> 0x005d }
        r2 = r2.toString();	 Catch:{ zza -> 0x005d }
        r0 = r20;
        r1.<init>(r2, r0);	 Catch:{ zza -> 0x005d }
        throw r1;	 Catch:{ zza -> 0x005d }
    L_0x005d:
        r1 = move-exception;
        throw r1;
    L_0x005f:
        r0 = r20;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x0067:
        r0 = r20;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x006f:
        r0 = r20;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x0077:
        r0 = r20;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x007f:
        r0 = r20;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x0087:
        r0 = r20;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x008f:
        r0 = r20;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x0097:
        r0 = r20;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x009f:
        r0 = r20;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x00a7:
        r0 = r20;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r13);
        if (r11 == 0) goto L_0x0026;
    L_0x00af:
        goto L_0x0021;
    L_0x00b1:
        r1 = move-exception;
        throw r1;
    L_0x00b3:
        r1 = new com.google.android.gms.wearable.ConnectionConfiguration;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.zzg.zzhm(android.os.Parcel):com.google.android.gms.wearable.ConnectionConfiguration");
    }

    public ConnectionConfiguration[] zzku(int i) {
        return new ConnectionConfiguration[i];
    }
}
