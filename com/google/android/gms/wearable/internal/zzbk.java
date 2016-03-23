package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbk implements Creator {
    static void zza(StorageInfoResponse storageInfoResponse, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, storageInfoResponse.versionCode);
        zzb.zzc(parcel, 2, storageInfoResponse.statusCode);
        zzb.zza(parcel, 3, storageInfoResponse.zzbaQ);
        zzb.zzc(parcel, 4, storageInfoResponse.zzbaS, false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhW(parcel);
    }

    public Object[] newArray(int i) {
        return zzlh(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.StorageInfoResponse zzhW(android.os.Parcel r12) {
        /*
        r11 = this;
        r1 = 0;
        r5 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r12);
        r2 = 0;
        r0 = 0;
        r4 = r1;
    L_0x000b:
        r6 = r12.dataPosition();
        if (r6 >= r7) goto L_0x0021;
    L_0x0011:
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r12);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r6);
        switch(r8) {
            case 1: goto L_0x0048;
            case 2: goto L_0x004e;
            case 3: goto L_0x0054;
            case 4: goto L_0x005a;
            default: goto L_0x001c;
        };
    L_0x001c:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r12, r6);	 Catch:{ zza -> 0x0063 }
    L_0x001f:
        if (r5 == 0) goto L_0x000b;
    L_0x0021:
        r6 = r0;
        r9 = r2;
        r3 = r1;
        r2 = r4;
        r4 = r9;
        r0 = r12.dataPosition();	 Catch:{ zza -> 0x0046 }
        if (r0 == r7) goto L_0x0065;
    L_0x002c:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0046 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0046 }
        r1.<init>();	 Catch:{ zza -> 0x0046 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0046 }
        r1 = r1.append(r7);	 Catch:{ zza -> 0x0046 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0046 }
        r0.<init>(r1, r12);	 Catch:{ zza -> 0x0046 }
        throw r0;	 Catch:{ zza -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r12, r6);
        if (r5 == 0) goto L_0x001f;
    L_0x004e:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r12, r6);
        if (r5 == 0) goto L_0x001f;
    L_0x0054:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r12, r6);
        if (r5 == 0) goto L_0x001f;
    L_0x005a:
        r0 = com.google.android.gms.wearable.internal.PackageStorageInfo.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r12, r6, r0);
        if (r5 == 0) goto L_0x001f;
    L_0x0062:
        goto L_0x001c;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r1 = new com.google.android.gms.wearable.internal.StorageInfoResponse;
        r1.<init>(r2, r3, r4, r6);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzbk.zzhW(android.os.Parcel):com.google.android.gms.wearable.internal.StorageInfoResponse");
    }

    public StorageInfoResponse[] zzlh(int i) {
        return new StorageInfoResponse[i];
    }
}
