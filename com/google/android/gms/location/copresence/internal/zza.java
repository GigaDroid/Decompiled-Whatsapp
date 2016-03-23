package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Creator {
    static void zza(CopresenceApiOptions copresenceApiOptions, Parcel parcel, int i) {
        boolean z = false;
        boolean z2 = CopresenceApiOptions.a;
        int zzak = zzb.zzak(parcel);
        try {
            zzb.zzc(parcel, 1, copresenceApiOptions.mVersionCode);
            zzb.zza(parcel, 2, copresenceApiOptions.zzaCq);
            zzb.zza(parcel, 3, copresenceApiOptions.zzaCr, false);
            zzb.zzH(parcel, zzak);
            if (com.google.android.gms.location.internal.zzb.a) {
                if (!z2) {
                    z = true;
                }
                CopresenceApiOptions.a = z;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
            throw e2;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzeu(parcel);
    }

    public Object[] newArray(int i) {
        return zzgO(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.location.copresence.internal.CopresenceApiOptions zzeu(android.os.Parcel r9) {
        /*
        r8 = this;
        r2 = 0;
        r4 = com.google.android.gms.location.copresence.internal.CopresenceApiOptions.a;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r9);
        r0 = 0;
        r1 = r2;
        r3 = r2;
    L_0x000a:
        r6 = r9.dataPosition();
        if (r6 >= r5) goto L_0x0020;
    L_0x0010:
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r9);
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r6);
        switch(r7) {
            case 1: goto L_0x0042;
            case 2: goto L_0x004f;
            case 3: goto L_0x0055;
            default: goto L_0x001b;
        };
    L_0x001b:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r9, r6);	 Catch:{ zza -> 0x0060 }
    L_0x001e:
        if (r4 == 0) goto L_0x000a;
    L_0x0020:
        r2 = r9.dataPosition();	 Catch:{ zza -> 0x0040 }
        if (r2 == r5) goto L_0x0062;
    L_0x0026:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0040 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0040 }
        r1.<init>();	 Catch:{ zza -> 0x0040 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0040 }
        r1 = r1.append(r5);	 Catch:{ zza -> 0x0040 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0040 }
        r0.<init>(r1, r9);	 Catch:{ zza -> 0x0040 }
        throw r0;	 Catch:{ zza -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r6);
        if (r4 == 0) goto L_0x001e;
    L_0x0048:
        r1 = com.google.android.gms.location.internal.zzb.a;	 Catch:{ zza -> 0x005c }
        if (r1 == 0) goto L_0x005e;
    L_0x004c:
        r1 = r2;
    L_0x004d:
        com.google.android.gms.location.internal.zzb.a = r1;
    L_0x004f:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r9, r6);
        if (r4 == 0) goto L_0x001e;
    L_0x0055:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r9, r6);
        if (r4 == 0) goto L_0x001e;
    L_0x005b:
        goto L_0x001b;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r1 = 1;
        goto L_0x004d;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r2 = new com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
        r2.<init>(r3, r1, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.copresence.internal.zza.zzeu(android.os.Parcel):com.google.android.gms.location.copresence.internal.CopresenceApiOptions");
    }

    public CopresenceApiOptions[] zzgO(int i) {
        return new CopresenceApiOptions[i];
    }
}
