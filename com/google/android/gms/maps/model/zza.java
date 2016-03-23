package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Creator {
    static void zza(CameraPosition cameraPosition, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, cameraPosition.getVersionCode());
        zzb.zza(parcel, 2, cameraPosition.target, i, false);
        zzb.zza(parcel, 3, cameraPosition.zoom);
        zzb.zza(parcel, 4, cameraPosition.tilt);
        zzb.zza(parcel, 5, cameraPosition.bearing);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzeW(parcel);
    }

    public Object[] newArray(int i) {
        return zzhw(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.CameraPosition zzeW(android.os.Parcel r11) {
        /*
        r10 = this;
        r0 = 0;
        r5 = com.google.android.gms.maps.model.LatLng.a;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r11);
        r2 = 0;
        r1 = 0;
        r4 = r0;
        r3 = r0;
        r9 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r9;
    L_0x000f:
        r7 = r11.dataPosition();
        if (r7 >= r6) goto L_0x0093;
    L_0x0015:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r11);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r8) {
            case 1: goto L_0x0053;
            case 2: goto L_0x0059;
            case 3: goto L_0x0063;
            case 4: goto L_0x0069;
            case 5: goto L_0x008e;
            default: goto L_0x0020;
        };
    L_0x0020:
        r9 = r0;
        r0 = r1;
        r1 = r9;
    L_0x0023:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r11, r7);	 Catch:{ zza -> 0x0081 }
        r9 = r4;
        r4 = r0;
        r0 = r9;
    L_0x0029:
        if (r5 == 0) goto L_0x0098;
    L_0x002b:
        r5 = r0;
        r9 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r4;
        r4 = r9;
    L_0x0031:
        r0 = r11.dataPosition();	 Catch:{ zza -> 0x0051 }
        if (r0 == r6) goto L_0x0083;
    L_0x0037:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0051 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0051 }
        r1.<init>();	 Catch:{ zza -> 0x0051 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0051 }
        r1 = r1.append(r6);	 Catch:{ zza -> 0x0051 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0051 }
        r0.<init>(r1, r11);	 Catch:{ zza -> 0x0051 }
        throw r0;	 Catch:{ zza -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r11, r7);
        if (r5 == 0) goto L_0x0089;
    L_0x0059:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r11, r7, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r5 == 0) goto L_0x0089;
    L_0x0063:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r11, r7);
        if (r5 == 0) goto L_0x0089;
    L_0x0069:
        r9 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r11, r7);
        if (r5 == 0) goto L_0x00a3;
    L_0x0073:
        r9 = r3;
        r3 = r2;
        r2 = r0;
        r0 = r9;
    L_0x0077:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r11, r7);
        if (r5 == 0) goto L_0x009e;
    L_0x007d:
        r9 = r0;
        r0 = r3;
        r3 = r9;
        goto L_0x0023;
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = new com.google.android.gms.maps.model.CameraPosition;
        r0.<init>(r1, r2, r3, r4, r5);
        return r0;
    L_0x0089:
        r9 = r4;
        r4 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0029;
    L_0x008e:
        r9 = r3;
        r3 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0077;
    L_0x0093:
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r0;
        goto L_0x0031;
    L_0x0098:
        r9 = r0;
        r0 = r1;
        r1 = r4;
        r4 = r9;
        goto L_0x000f;
    L_0x009e:
        r9 = r4;
        r4 = r3;
        r3 = r0;
        r0 = r9;
        goto L_0x0029;
    L_0x00a3:
        r9 = r4;
        r4 = r2;
        r2 = r0;
        r0 = r9;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zza.zzeW(android.os.Parcel):com.google.android.gms.maps.model.CameraPosition");
    }

    public CameraPosition[] zzhw(int i) {
        return new CameraPosition[i];
    }
}
