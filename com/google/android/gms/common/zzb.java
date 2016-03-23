package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class zzb implements Creator {
    static void zza(ConnectionResult connectionResult, Parcel parcel, int i) {
        int zzak = com.google.android.gms.common.internal.safeparcel.zzb.zzak(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, connectionResult.mVersionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 2, connectionResult.getErrorCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, connectionResult.getResolution(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzW(parcel);
    }

    public Object[] newArray(int i) {
        return zzba(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.ConnectionResult zzW(android.os.Parcel r9) {
        /*
        r8 = this;
        r2 = 0;
        r4 = com.google.android.gms.common.GooglePlayServicesUtil.a;
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
            case 2: goto L_0x0048;
            case 3: goto L_0x004e;
            default: goto L_0x001b;
        };
    L_0x001b:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r9, r6);	 Catch:{ zza -> 0x0059 }
    L_0x001e:
        if (r4 == 0) goto L_0x000a;
    L_0x0020:
        r6 = r9.dataPosition();	 Catch:{ zza -> 0x0040 }
        if (r6 == r5) goto L_0x005b;
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
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r6);
        if (r4 == 0) goto L_0x001e;
    L_0x004e:
        r0 = android.app.PendingIntent.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r9, r6, r0);
        r0 = (android.app.PendingIntent) r0;
        if (r4 == 0) goto L_0x001e;
    L_0x0058:
        goto L_0x001b;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r5 = new com.google.android.gms.common.ConnectionResult;
        r5.<init>(r3, r1, r0);
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;	 Catch:{ zza -> 0x0069 }
        if (r0 == 0) goto L_0x0068;
    L_0x0064:
        if (r4 == 0) goto L_0x006d;
    L_0x0066:
        com.google.android.gms.common.GooglePlayServicesUtil.a = r2;
    L_0x0068:
        return r5;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ zza -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r2 = 1;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzb.zzW(android.os.Parcel):com.google.android.gms.common.ConnectionResult");
    }

    public ConnectionResult[] zzba(int i) {
        return new ConnectionResult[i];
    }
}
