package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator {
    static void zza(PasswordSpecification passwordSpecification, Parcel parcel, int i) {
        boolean z = PasswordSpecification.a;
        int zzak = zzb.zzak(parcel);
        zzb.zza(parcel, 1, passwordSpecification.zzRq, false);
        zzb.zzc(parcel, 1000, passwordSpecification.mVersionCode);
        zzb.zzb(parcel, 2, passwordSpecification.zzRr, false);
        zzb.zza(parcel, 3, passwordSpecification.zzRs, false);
        zzb.zzc(parcel, 4, passwordSpecification.zzRt);
        zzb.zzc(parcel, 5, passwordSpecification.zzRu);
        zzb.zzH(parcel, zzak);
        if (z) {
            zza.a++;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzH(parcel);
    }

    public Object[] newArray(int i) {
        return zzax(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.auth.api.credentials.PasswordSpecification zzH(android.os.Parcel r14) {
        /*
        r13 = this;
        r0 = 0;
        r7 = 0;
        r8 = com.google.android.gms.auth.api.credentials.PasswordSpecification.a;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r14);
        r5 = r7;
        r4 = r7;
        r1 = r0;
        r2 = r0;
        r3 = r7;
    L_0x000d:
        r6 = r14.dataPosition();
        if (r6 >= r9) goto L_0x00a1;
    L_0x0013:
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r14);
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r6);
        switch(r10) {
            case 1: goto L_0x0053;
            case 2: goto L_0x005f;
            case 3: goto L_0x0065;
            case 4: goto L_0x006b;
            case 5: goto L_0x0071;
            case 1000: goto L_0x0059;
            default: goto L_0x001e;
        };
    L_0x001e:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r14, r6);	 Catch:{ zza -> 0x0084 }
        r11 = r5;
        r5 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r11;
    L_0x0027:
        if (r8 == 0) goto L_0x00a8;
    L_0x0029:
        r6 = r0;
        r11 = r4;
        r4 = r1;
        r1 = r5;
        r5 = r11;
        r12 = r3;
        r3 = r2;
        r2 = r12;
    L_0x0031:
        r0 = r14.dataPosition();	 Catch:{ zza -> 0x0051 }
        if (r0 == r9) goto L_0x0086;
    L_0x0037:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0051 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0051 }
        r1.<init>();	 Catch:{ zza -> 0x0051 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0051 }
        r1 = r1.append(r9);	 Catch:{ zza -> 0x0051 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0051 }
        r0.<init>(r1, r14);	 Catch:{ zza -> 0x0051 }
        throw r0;	 Catch:{ zza -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r14, r6);
        if (r8 == 0) goto L_0x009a;
    L_0x0059:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r14, r6);
        if (r8 == 0) goto L_0x009a;
    L_0x005f:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzC(r14, r6);
        if (r8 == 0) goto L_0x009a;
    L_0x0065:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzB(r14, r6);
        if (r8 == 0) goto L_0x009a;
    L_0x006b:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r14, r6);
        if (r8 == 0) goto L_0x009a;
    L_0x0071:
        r11 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r11;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r14, r6);
        if (r8 == 0) goto L_0x00b0;
    L_0x007d:
        r11 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r11;
        goto L_0x001e;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = new com.google.android.gms.auth.api.credentials.PasswordSpecification;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;	 Catch:{ zza -> 0x0094 }
        if (r1 == 0) goto L_0x0093;
    L_0x008f:
        if (r8 == 0) goto L_0x0098;
    L_0x0091:
        com.google.android.gms.auth.api.credentials.PasswordSpecification.a = r7;
    L_0x0093:
        return r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ zza -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r7 = 1;
        goto L_0x0091;
    L_0x009a:
        r11 = r5;
        r5 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r11;
        goto L_0x0027;
    L_0x00a1:
        r6 = r5;
        r5 = r4;
        r4 = r0;
        r11 = r1;
        r1 = r3;
        r3 = r11;
        goto L_0x0031;
    L_0x00a8:
        r11 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r5;
        r5 = r11;
        goto L_0x000d;
    L_0x00b0:
        r11 = r5;
        r5 = r4;
        r4 = r0;
        r0 = r11;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.zze.zzH(android.os.Parcel):com.google.android.gms.auth.api.credentials.PasswordSpecification");
    }

    public PasswordSpecification[] zzax(int i) {
        return new PasswordSpecification[i];
    }
}
