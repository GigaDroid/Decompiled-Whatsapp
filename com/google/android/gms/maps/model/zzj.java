package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Creator {
    static void zza(StreetViewPanoramaCamera streetViewPanoramaCamera, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, streetViewPanoramaCamera.getVersionCode());
        zzb.zza(parcel, 2, streetViewPanoramaCamera.zoom);
        zzb.zza(parcel, 3, streetViewPanoramaCamera.tilt);
        zzb.zza(parcel, 4, streetViewPanoramaCamera.bearing);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzff(parcel);
    }

    public Object[] newArray(int i) {
        return zzhF(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.StreetViewPanoramaCamera zzff(android.os.Parcel r9) {
        /*
        r8 = this;
        r0 = 0;
        r4 = com.google.android.gms.maps.model.LatLng.a;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r9);
        r1 = 0;
        r2 = r0;
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
            case 2: goto L_0x0049;
            case 3: goto L_0x004f;
            case 4: goto L_0x0055;
            default: goto L_0x001c;
        };
    L_0x001c:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r9, r6);	 Catch:{ zza -> 0x005c }
    L_0x001f:
        if (r4 == 0) goto L_0x000b;
    L_0x0021:
        r4 = r9.dataPosition();	 Catch:{ zza -> 0x0041 }
        if (r4 == r5) goto L_0x005e;
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
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x0049:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x004f:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x0055:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r9, r6);
        if (r4 == 0) goto L_0x001f;
    L_0x005b:
        goto L_0x001c;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r4 = new com.google.android.gms.maps.model.StreetViewPanoramaCamera;
        r4.<init>(r3, r2, r1, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzj.zzff(android.os.Parcel):com.google.android.gms.maps.model.StreetViewPanoramaCamera");
    }

    public StreetViewPanoramaCamera[] zzhF(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
