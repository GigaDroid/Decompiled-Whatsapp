package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator {
    static void zza(LatLng latLng, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, latLng.getVersionCode());
        zzb.zza(parcel, 2, latLng.latitude);
        zzb.zza(parcel, 3, latLng.longitude);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzfa(parcel);
    }

    public Object[] newArray(int i) {
        return zzhA(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.LatLng zzfa(android.os.Parcel r12) {
        /*
        r11 = this;
        r0 = 0;
        r5 = com.google.android.gms.maps.model.LatLng.a;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r12);
        r2 = 0;
        r4 = r2;
        r2 = r0;
    L_0x000b:
        r7 = r12.dataPosition();
        if (r7 >= r6) goto L_0x0021;
    L_0x0011:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r12);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r8) {
            case 1: goto L_0x0046;
            case 2: goto L_0x004c;
            case 3: goto L_0x0052;
            default: goto L_0x001c;
        };
    L_0x001c:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r12, r7);	 Catch:{ zza -> 0x0059 }
    L_0x001f:
        if (r5 == 0) goto L_0x000b;
    L_0x0021:
        r9 = r0;
        r1 = r4;
        r4 = r9;
        r0 = r12.dataPosition();	 Catch:{ zza -> 0x0044 }
        if (r0 == r6) goto L_0x005b;
    L_0x002a:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0044 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0044 }
        r1.<init>();	 Catch:{ zza -> 0x0044 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0044 }
        r1 = r1.append(r6);	 Catch:{ zza -> 0x0044 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0044 }
        r0.<init>(r1, r12);	 Catch:{ zza -> 0x0044 }
        throw r0;	 Catch:{ zza -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x004c:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzm(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x0052:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzm(r12, r7);
        if (r5 == 0) goto L_0x001f;
    L_0x0058:
        goto L_0x001c;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = new com.google.android.gms.maps.model.LatLng;
        r0.<init>(r1, r2, r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zze.zzfa(android.os.Parcel):com.google.android.gms.maps.model.LatLng");
    }

    public LatLng[] zzhA(int i) {
        return new LatLng[i];
    }
}
