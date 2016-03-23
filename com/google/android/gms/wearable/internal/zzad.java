package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzad implements Creator {
    static void zza(DataItemParcelable dataItemParcelable, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, dataItemParcelable.mVersionCode);
        zzb.zza(parcel, 2, dataItemParcelable.getUri(), i, false);
        zzb.zza(parcel, 4, dataItemParcelable.zzCr(), false);
        zzb.zza(parcel, 5, dataItemParcelable.getData(), false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhz(parcel);
    }

    public Object[] newArray(int i) {
        return zzkK(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.DataItemParcelable zzhz(android.os.Parcel r10) {
        /*
        r9 = this;
        r0 = 0;
        r4 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r10);
        r1 = 0;
        r2 = r0;
        r3 = r1;
        r1 = r0;
    L_0x000b:
        r6 = r10.dataPosition();
        if (r6 >= r5) goto L_0x0070;
    L_0x0011:
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r10);
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r6);
        switch(r7) {
            case 1: goto L_0x0047;
            case 2: goto L_0x004d;
            case 3: goto L_0x001c;
            case 4: goto L_0x0057;
            case 5: goto L_0x005d;
            default: goto L_0x001c;
        };
    L_0x001c:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r10, r6);	 Catch:{ zza -> 0x0068 }
        r8 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r8;
    L_0x0023:
        if (r4 == 0) goto L_0x0075;
    L_0x0025:
        r4 = r10.dataPosition();	 Catch:{ zza -> 0x0045 }
        if (r4 == r5) goto L_0x006a;
    L_0x002b:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0045 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0045 }
        r1.<init>();	 Catch:{ zza -> 0x0045 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0045 }
        r1 = r1.append(r5);	 Catch:{ zza -> 0x0045 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0045 }
        r0.<init>(r1, r10);	 Catch:{ zza -> 0x0045 }
        throw r0;	 Catch:{ zza -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r10, r6);
        if (r4 == 0) goto L_0x0063;
    L_0x004d:
        r0 = android.net.Uri.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r10, r6, r0);
        r0 = (android.net.Uri) r0;
        if (r4 == 0) goto L_0x0063;
    L_0x0057:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzq(r10, r6);
        if (r4 == 0) goto L_0x0063;
    L_0x005d:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzr(r10, r6);
        if (r4 != 0) goto L_0x001c;
    L_0x0063:
        r8 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r8;
        goto L_0x0023;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r4 = new com.google.android.gms.wearable.internal.DataItemParcelable;
        r4.<init>(r3, r2, r1, r0);
        return r4;
    L_0x0070:
        r8 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r8;
        goto L_0x0025;
    L_0x0075:
        r8 = r0;
        r0 = r2;
        r2 = r1;
        r1 = r8;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzad.zzhz(android.os.Parcel):com.google.android.gms.wearable.internal.DataItemParcelable");
    }

    public DataItemParcelable[] zzkK(int i) {
        return new DataItemParcelable[i];
    }
}
