package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzad implements Creator {
    static void zza(ValidateAccountRequest validateAccountRequest, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, validateAccountRequest.mVersionCode);
        zzb.zzc(parcel, 2, validateAccountRequest.zzoS());
        zzb.zza(parcel, 3, validateAccountRequest.zzacC, false);
        zzb.zza(parcel, 4, validateAccountRequest.zzoT(), i, false);
        zzb.zza(parcel, 5, validateAccountRequest.zzoU(), false);
        zzb.zza(parcel, 6, validateAccountRequest.getCallingPackage(), false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzah(parcel);
    }

    public Object[] newArray(int i) {
        return zzbG(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.ValidateAccountRequest zzah(android.os.Parcel r13) {
        /*
        r12 = this;
        r1 = 0;
        r0 = 0;
        r6 = com.google.android.gms.common.internal.zzx.a;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r13);
        r2 = r0;
        r3 = r0;
        r4 = r1;
        r5 = r1;
        r1 = r0;
    L_0x000d:
        r8 = r13.dataPosition();
        if (r8 >= r7) goto L_0x0085;
    L_0x0013:
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r13);
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r8);
        switch(r9) {
            case 1: goto L_0x0050;
            case 2: goto L_0x0056;
            case 3: goto L_0x005c;
            case 4: goto L_0x0062;
            case 5: goto L_0x006c;
            case 6: goto L_0x0072;
            default: goto L_0x001e;
        };
    L_0x001e:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r13, r8);	 Catch:{ zza -> 0x007d }
        r10 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r10;
    L_0x0025:
        if (r6 == 0) goto L_0x008b;
    L_0x0027:
        r6 = r0;
        r10 = r1;
        r1 = r5;
        r5 = r10;
        r11 = r4;
        r4 = r2;
        r2 = r11;
    L_0x002e:
        r0 = r13.dataPosition();	 Catch:{ zza -> 0x004e }
        if (r0 == r7) goto L_0x007f;
    L_0x0034:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x004e }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x004e }
        r1.<init>();	 Catch:{ zza -> 0x004e }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x004e }
        r1 = r1.append(r7);	 Catch:{ zza -> 0x004e }
        r1 = r1.toString();	 Catch:{ zza -> 0x004e }
        r0.<init>(r1, r13);	 Catch:{ zza -> 0x004e }
        throw r0;	 Catch:{ zza -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r8);
        if (r6 == 0) goto L_0x0078;
    L_0x0056:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r8);
        if (r6 == 0) goto L_0x0078;
    L_0x005c:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(r13, r8);
        if (r6 == 0) goto L_0x0078;
    L_0x0062:
        r0 = com.google.android.gms.common.api.Scope.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzb(r13, r8, r0);
        r0 = (com.google.android.gms.common.api.Scope[]) r0;
        if (r6 == 0) goto L_0x0078;
    L_0x006c:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzq(r13, r8);
        if (r6 == 0) goto L_0x0078;
    L_0x0072:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r13, r8);
        if (r6 != 0) goto L_0x001e;
    L_0x0078:
        r10 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r10;
        goto L_0x0025;
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = new com.google.android.gms.common.internal.ValidateAccountRequest;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r0;
    L_0x0085:
        r6 = r1;
        r1 = r5;
        r5 = r2;
        r2 = r4;
        r4 = r0;
        goto L_0x002e;
    L_0x008b:
        r10 = r0;
        r0 = r2;
        r2 = r1;
        r1 = r10;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzad.zzah(android.os.Parcel):com.google.android.gms.common.internal.ValidateAccountRequest");
    }

    public ValidateAccountRequest[] zzbG(int i) {
        return new ValidateAccountRequest[i];
    }
}
