package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator {
    static void zza(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, latLngBounds.getVersionCode());
        zzb.zza(parcel, 2, latLngBounds.southwest, i, false);
        zzb.zza(parcel, 3, latLngBounds.northeast, i, false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzeZ(parcel);
    }

    public Object[] newArray(int i) {
        return zzhz(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.LatLngBounds zzeZ(android.os.Parcel r9) {
        /*
        r8 = this;
        r0 = 0;
        r3 = com.google.android.gms.maps.model.LatLng.a;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r9);
        r1 = 0;
        r2 = r1;
        r1 = r0;
    L_0x000a:
        r5 = r9.dataPosition();
        if (r5 >= r4) goto L_0x006d;
    L_0x0010:
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r9);
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r5);
        switch(r6) {
            case 1: goto L_0x0045;
            case 2: goto L_0x004b;
            case 3: goto L_0x0055;
            default: goto L_0x001b;
        };
    L_0x001b:
        r7 = r1;
        r1 = r0;
        r0 = r7;
    L_0x001e:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r9, r5);	 Catch:{ zza -> 0x0061 }
    L_0x0021:
        if (r3 == 0) goto L_0x0071;
    L_0x0023:
        r3 = r9.dataPosition();	 Catch:{ zza -> 0x0043 }
        if (r3 == r4) goto L_0x0063;
    L_0x0029:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0043 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0043 }
        r1.<init>();	 Catch:{ zza -> 0x0043 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0043 }
        r1 = r1.append(r4);	 Catch:{ zza -> 0x0043 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0043 }
        r0.<init>(r1, r9);	 Catch:{ zza -> 0x0043 }
        throw r0;	 Catch:{ zza -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r5);
        if (r3 == 0) goto L_0x0069;
    L_0x004b:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r9, r5, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r3 == 0) goto L_0x0069;
    L_0x0055:
        r1 = r0;
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r9, r5, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r3 == 0) goto L_0x0021;
    L_0x0060:
        goto L_0x001e;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r3 = new com.google.android.gms.maps.model.LatLngBounds;
        r3.<init>(r2, r1, r0);
        return r3;
    L_0x0069:
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0021;
    L_0x006d:
        r7 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x0023;
    L_0x0071:
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzd.zzeZ(android.os.Parcel):com.google.android.gms.maps.model.LatLngBounds");
    }

    public LatLngBounds[] zzhz(int i) {
        return new LatLngBounds[i];
    }
}
