package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class LocationAvailabilityCreator implements Creator {
    static void zza(LocationAvailability locationAvailability, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, locationAvailability.zzaBS);
        zzb.zzc(parcel, 1000, locationAvailability.getVersionCode());
        zzb.zzc(parcel, 2, locationAvailability.zzaBT);
        zzb.zza(parcel, 3, locationAvailability.zzaBU);
        zzb.zzc(parcel, 4, locationAvailability.zzaBV);
        zzb.zzH(parcel, zzak);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.location.LocationAvailability createFromParcel(android.os.Parcel r13) {
        /*
        r12 = this;
        r2 = 1;
        r6 = com.google.android.gms.location.LocationServices.zza.a;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r13);
        r4 = 0;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = 0;
        r5 = r4;
        r4 = r3;
        r3 = r2;
    L_0x000f:
        r7 = r13.dataPosition();
        if (r7 >= r8) goto L_0x0025;
    L_0x0015:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r13);
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r9) {
            case 1: goto L_0x004e;
            case 2: goto L_0x005a;
            case 3: goto L_0x0060;
            case 4: goto L_0x0066;
            case 1000: goto L_0x0054;
            default: goto L_0x0020;
        };
    L_0x0020:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r13, r7);	 Catch:{ zza -> 0x006d }
    L_0x0023:
        if (r6 == 0) goto L_0x000f;
    L_0x0025:
        r6 = r0;
        r10 = r2;
        r2 = r5;
        r5 = r10;
        r11 = r4;
        r4 = r3;
        r3 = r11;
        r0 = r13.dataPosition();	 Catch:{ zza -> 0x004c }
        if (r0 == r8) goto L_0x006f;
    L_0x0032:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x004c }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x004c }
        r1.<init>();	 Catch:{ zza -> 0x004c }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x004c }
        r1 = r1.append(r8);	 Catch:{ zza -> 0x004c }
        r1 = r1.toString();	 Catch:{ zza -> 0x004c }
        r0.<init>(r1, r13);	 Catch:{ zza -> 0x004c }
        throw r0;	 Catch:{ zza -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r7);
        if (r6 == 0) goto L_0x0023;
    L_0x0054:
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r7);
        if (r6 == 0) goto L_0x0023;
    L_0x005a:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r7);
        if (r6 == 0) goto L_0x0023;
    L_0x0060:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r13, r7);
        if (r6 == 0) goto L_0x0023;
    L_0x0066:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r7);
        if (r6 == 0) goto L_0x0023;
    L_0x006c:
        goto L_0x0020;
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r1 = new com.google.android.gms.location.LocationAvailability;
        r1.<init>(r2, r3, r4, r5, r6);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationAvailabilityCreator.createFromParcel(android.os.Parcel):com.google.android.gms.location.LocationAvailability");
    }

    public Object m117createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    public LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }

    public Object[] m118newArray(int i) {
        return newArray(i);
    }
}
