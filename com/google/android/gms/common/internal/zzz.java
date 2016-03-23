package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzz implements Creator {
    static void zza(ResolveAccountResponse resolveAccountResponse, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, resolveAccountResponse.mVersionCode);
        zzb.zza(parcel, 2, resolveAccountResponse.zzacC, false);
        zzb.zza(parcel, 3, resolveAccountResponse.zzoP(), i, false);
        zzb.zza(parcel, 4, resolveAccountResponse.zzoQ());
        zzb.zza(parcel, 5, resolveAccountResponse.zzoR());
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzag(parcel);
    }

    public Object[] newArray(int i) {
        return zzbF(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.ResolveAccountResponse zzag(android.os.Parcel r11) {
        /*
        r10 = this;
        r1 = 0;
        r0 = 0;
        r5 = com.google.android.gms.common.internal.zzx.a;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r11);
        r4 = r0;
        r3 = r0;
        r2 = r0;
        r0 = r1;
    L_0x000c:
        r7 = r11.dataPosition();
        if (r7 >= r6) goto L_0x008f;
    L_0x0012:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r11);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r8) {
            case 1: goto L_0x004e;
            case 2: goto L_0x0054;
            case 3: goto L_0x005a;
            case 4: goto L_0x0064;
            case 5: goto L_0x0089;
            default: goto L_0x001d;
        };
    L_0x001d:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r11, r7);	 Catch:{ zza -> 0x007b }
        r9 = r4;
        r4 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
    L_0x0025:
        if (r5 == 0) goto L_0x0096;
    L_0x0027:
        r5 = r0;
        r9 = r3;
        r3 = r1;
        r1 = r4;
        r4 = r9;
    L_0x002c:
        r0 = r11.dataPosition();	 Catch:{ zza -> 0x004c }
        if (r0 == r6) goto L_0x007d;
    L_0x0032:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x004c }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x004c }
        r1.<init>();	 Catch:{ zza -> 0x004c }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x004c }
        r1 = r1.append(r6);	 Catch:{ zza -> 0x004c }
        r1 = r1.toString();	 Catch:{ zza -> 0x004c }
        r0.<init>(r1, r11);	 Catch:{ zza -> 0x004c }
        throw r0;	 Catch:{ zza -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r11, r7);
        if (r5 == 0) goto L_0x0083;
    L_0x0054:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(r11, r7);
        if (r5 == 0) goto L_0x0083;
    L_0x005a:
        r0 = com.google.android.gms.common.ConnectionResult.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r11, r7, r0);
        r0 = (com.google.android.gms.common.ConnectionResult) r0;
        if (r5 == 0) goto L_0x0083;
    L_0x0064:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r11, r7);
        if (r5 == 0) goto L_0x0083;
    L_0x006a:
        r9 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
    L_0x006f:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r11, r7);
        if (r5 == 0) goto L_0x009d;
    L_0x0075:
        r9 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r9;
        goto L_0x001d;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = new com.google.android.gms.common.internal.ResolveAccountResponse;
        r0.<init>(r1, r2, r3, r4, r5);
        return r0;
    L_0x0083:
        r9 = r4;
        r4 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0025;
    L_0x0089:
        r9 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x006f;
    L_0x008f:
        r5 = r4;
        r4 = r3;
        r3 = r0;
        r9 = r1;
        r1 = r2;
        r2 = r9;
        goto L_0x002c;
    L_0x0096:
        r9 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r4;
        r4 = r9;
        goto L_0x000c;
    L_0x009d:
        r9 = r4;
        r4 = r3;
        r3 = r0;
        r0 = r9;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzz.zzag(android.os.Parcel):com.google.android.gms.common.internal.ResolveAccountResponse");
    }

    public ResolveAccountResponse[] zzbF(int i) {
        return new ResolveAccountResponse[i];
    }
}
