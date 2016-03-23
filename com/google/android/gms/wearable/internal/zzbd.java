package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbd implements Creator {
    static void zza(PackageStorageInfo packageStorageInfo, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, packageStorageInfo.versionCode);
        zzb.zza(parcel, 2, packageStorageInfo.packageName, false);
        zzb.zza(parcel, 3, packageStorageInfo.label, false);
        zzb.zza(parcel, 4, packageStorageInfo.zzbaQ);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhR(parcel);
    }

    public Object[] newArray(int i) {
        return zzlc(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.PackageStorageInfo zzhR(android.os.Parcel r13) {
        /*
        r12 = this;
        r2 = 0;
        r6 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r13);
        r3 = 0;
        r0 = 0;
        r4 = r0;
        r0 = r2;
        r1 = r2;
        r2 = r3;
    L_0x000e:
        r3 = r13.dataPosition();
        if (r3 >= r7) goto L_0x0077;
    L_0x0014:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r13);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r3);
        switch(r8) {
            case 1: goto L_0x0051;
            case 2: goto L_0x0057;
            case 3: goto L_0x005d;
            case 4: goto L_0x0063;
            default: goto L_0x001f;
        };
    L_0x001f:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r13, r3);	 Catch:{ zza -> 0x006f }
        r3 = r1;
        r9 = r0;
        r0 = r4;
        r4 = r2;
        r2 = r9;
    L_0x0027:
        if (r6 == 0) goto L_0x007c;
    L_0x0029:
        r9 = r0;
        r1 = r4;
        r4 = r9;
        r11 = r3;
        r3 = r2;
        r2 = r11;
    L_0x002f:
        r0 = r13.dataPosition();	 Catch:{ zza -> 0x004f }
        if (r0 == r7) goto L_0x0071;
    L_0x0035:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x004f }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x004f }
        r1.<init>();	 Catch:{ zza -> 0x004f }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x004f }
        r1 = r1.append(r7);	 Catch:{ zza -> 0x004f }
        r1 = r1.toString();	 Catch:{ zza -> 0x004f }
        r0.<init>(r1, r13);	 Catch:{ zza -> 0x004f }
        throw r0;	 Catch:{ zza -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r3);
        if (r6 == 0) goto L_0x0069;
    L_0x0057:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r13, r3);
        if (r6 == 0) goto L_0x0069;
    L_0x005d:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r13, r3);
        if (r6 == 0) goto L_0x0069;
    L_0x0063:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r13, r3);
        if (r6 != 0) goto L_0x001f;
    L_0x0069:
        r3 = r1;
        r9 = r0;
        r0 = r4;
        r4 = r2;
        r2 = r9;
        goto L_0x0027;
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = new com.google.android.gms.wearable.internal.PackageStorageInfo;
        r0.<init>(r1, r2, r3, r4);
        return r0;
    L_0x0077:
        r3 = r0;
        r9 = r1;
        r1 = r2;
        r2 = r9;
        goto L_0x002f;
    L_0x007c:
        r9 = r0;
        r0 = r2;
        r1 = r3;
        r2 = r4;
        r4 = r9;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzbd.zzhR(android.os.Parcel):com.google.android.gms.wearable.internal.PackageStorageInfo");
    }

    public PackageStorageInfo[] zzlc(int i) {
        return new PackageStorageInfo[i];
    }
}
