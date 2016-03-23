package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn implements Creator {
    static void zza(Status status, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, status.getStatusCode());
        zzb.zzc(parcel, 1000, status.getVersionCode());
        zzb.zza(parcel, 2, status.getStatusMessage(), false);
        zzb.zza(parcel, 3, status.zznH(), i, false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzY(parcel);
    }

    public Object[] newArray(int i) {
        return zzbh(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.api.Status zzY(android.os.Parcel r9) {
        /*
        r8 = this;
        r0 = 0;
        r1 = 0;
        r4 = com.google.android.gms.common.api.Api.a;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r9);
        r2 = r1;
        r3 = r1;
        r1 = r0;
    L_0x000b:
        r6 = r9.dataPosition();
        if (r6 >= r5) goto L_0x0021;
    L_0x0011:
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r9);
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r6);
        switch(r7) {
            case 1: goto L_0x0043;
            case 2: goto L_0x004f;
            case 3: goto L_0x0055;
            case 1000: goto L_0x0049;
            default: goto L_0x001c;
        };
    L_0x001c:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r9, r6);	 Catch:{ zza -> 0x0060 }
    L_0x001f:
        if (r4 == 0) goto L_0x000b;
    L_0x0021:
        r4 = r9.dataPosition();	 Catch:{ zza -> 0x0041 }
        if (r4 == r5) goto L_0x0062;
    L_0x0027:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0041 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0041 }
        r1.<init>();	 Catch:{ zza -> 0x0041 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0041 }
        r1 = r1.append(r5);	 Catch:{ zza -> 0x0041 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0041 }
        r0.<init>(r1, r9);	 Catch:{ zza -> 0x0041 }
        throw r0;	 Catch:{ zza -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x0049:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x004f:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x0055:
        r0 = android.app.PendingIntent.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r9, r6, r0);
        r0 = (android.app.PendingIntent) r0;
        if (r4 == 0) goto L_0x001f;
    L_0x005f:
        goto L_0x001c;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r4 = new com.google.android.gms.common.api.Status;
        r4.<init>(r3, r2, r1, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzn.zzY(android.os.Parcel):com.google.android.gms.common.api.Status");
    }

    public Status[] zzbh(int i) {
        return new Status[i];
    }
}
