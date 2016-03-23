package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator {
    static void zza(LocationResult locationResult, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, locationResult.getLocations(), false);
        zzb.zzc(parcel, 1000, locationResult.getVersionCode());
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzeq(parcel);
    }

    public Object[] newArray(int i) {
        return zzgI(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.location.LocationResult zzeq(android.os.Parcel r7) {
        /*
        r6 = this;
        r2 = com.google.android.gms.location.LocationServices.zza.a;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r7);
        r1 = 0;
        r0 = com.google.android.gms.location.LocationResult.zzaCb;
    L_0x0009:
        r4 = r7.dataPosition();
        if (r4 >= r3) goto L_0x001f;
    L_0x000f:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r7);
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r4);
        switch(r5) {
            case 1: goto L_0x0041;
            case 1000: goto L_0x0049;
            default: goto L_0x001a;
        };
    L_0x001a:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r7, r4);	 Catch:{ zza -> 0x0050 }
    L_0x001d:
        if (r2 == 0) goto L_0x0009;
    L_0x001f:
        r2 = r7.dataPosition();	 Catch:{ zza -> 0x003f }
        if (r2 == r3) goto L_0x0052;
    L_0x0025:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x003f }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x003f }
        r1.<init>();	 Catch:{ zza -> 0x003f }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x003f }
        r1 = r1.append(r3);	 Catch:{ zza -> 0x003f }
        r1 = r1.toString();	 Catch:{ zza -> 0x003f }
        r0.<init>(r1, r7);	 Catch:{ zza -> 0x003f }
        throw r0;	 Catch:{ zza -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = android.location.Location.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r7, r4, r0);
        if (r2 == 0) goto L_0x001d;
    L_0x0049:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r7, r4);
        if (r2 == 0) goto L_0x001d;
    L_0x004f:
        goto L_0x001a;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r2 = new com.google.android.gms.location.LocationResult;
        r2.<init>(r1, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.zze.zzeq(android.os.Parcel):com.google.android.gms.location.LocationResult");
    }

    public LocationResult[] zzgI(int i) {
        return new LocationResult[i];
    }
}
