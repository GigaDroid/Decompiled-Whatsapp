package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzy implements Creator {
    static void zza(ResolveAccountRequest resolveAccountRequest, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, resolveAccountRequest.mVersionCode);
        zzb.zza(parcel, 2, resolveAccountRequest.getAccount(), i, false);
        zzb.zzc(parcel, 3, resolveAccountRequest.getSessionId());
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzaf(parcel);
    }

    public Object[] newArray(int i) {
        return zzbE(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.ResolveAccountRequest zzaf(android.os.Parcel r9) {
        /*
        r8 = this;
        r0 = 0;
        r3 = com.google.android.gms.common.internal.zzx.a;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r9);
        r1 = 0;
        r2 = r0;
        r7 = r1;
        r1 = r0;
        r0 = r7;
    L_0x000c:
        r5 = r9.dataPosition();
        if (r5 >= r4) goto L_0x006b;
    L_0x0012:
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r9);
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r5);
        switch(r6) {
            case 1: goto L_0x0048;
            case 2: goto L_0x004e;
            case 3: goto L_0x0058;
            default: goto L_0x001d;
        };
    L_0x001d:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r9, r5);	 Catch:{ zza -> 0x0063 }
        r7 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r7;
    L_0x0024:
        if (r3 == 0) goto L_0x0070;
    L_0x0026:
        r3 = r9.dataPosition();	 Catch:{ zza -> 0x0046 }
        if (r3 == r4) goto L_0x0065;
    L_0x002c:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0046 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0046 }
        r1.<init>();	 Catch:{ zza -> 0x0046 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0046 }
        r1 = r1.append(r4);	 Catch:{ zza -> 0x0046 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0046 }
        r0.<init>(r1, r9);	 Catch:{ zza -> 0x0046 }
        throw r0;	 Catch:{ zza -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r5);
        if (r3 == 0) goto L_0x005e;
    L_0x004e:
        r0 = android.accounts.Account.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r9, r5, r0);
        r0 = (android.accounts.Account) r0;
        if (r3 == 0) goto L_0x005e;
    L_0x0058:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r5);
        if (r3 != 0) goto L_0x001d;
    L_0x005e:
        r7 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0024;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r3 = new com.google.android.gms.common.internal.ResolveAccountRequest;
        r3.<init>(r2, r1, r0);
        return r3;
    L_0x006b:
        r7 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0026;
    L_0x0070:
        r7 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r7;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzy.zzaf(android.os.Parcel):com.google.android.gms.common.internal.ResolveAccountRequest");
    }

    public ResolveAccountRequest[] zzbE(int i) {
        return new ResolveAccountRequest[i];
    }
}
