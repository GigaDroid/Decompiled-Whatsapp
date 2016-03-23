package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb implements Creator {
    static void zza(StreetViewPanoramaOptions streetViewPanoramaOptions, Parcel parcel, int i) {
        int i2 = MapView.a;
        int zzak = com.google.android.gms.common.internal.safeparcel.zzb.zzak(parcel);
        try {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, streetViewPanoramaOptions.getVersionCode());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, streetViewPanoramaOptions.getStreetViewPanoramaCamera(), i, false);
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, streetViewPanoramaOptions.getPanoramaId(), false);
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, streetViewPanoramaOptions.getPosition(), i, false);
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, streetViewPanoramaOptions.getRadius(), false);
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, streetViewPanoramaOptions.zzwT());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, streetViewPanoramaOptions.zzwJ());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 8, streetViewPanoramaOptions.zzwU());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 9, streetViewPanoramaOptions.zzwV());
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 10, streetViewPanoramaOptions.zzwF());
            com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzak);
            if (GoogleMap.a != 0) {
                MapView.a = i2 + 1;
            }
        } catch (zza e) {
            throw e;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzeV(parcel);
    }

    public Object[] newArray(int i) {
        return zzhv(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.StreetViewPanoramaOptions zzeV(android.os.Parcel r18) {
        /*
        r17 = this;
        r11 = com.google.android.gms.maps.MapView.a;
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r18);
        r10 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1 = 0;
        r15 = r1;
        r1 = r5;
        r5 = r10;
        r10 = r15;
    L_0x0014:
        r13 = r18.dataPosition();
        if (r13 >= r12) goto L_0x0115;
    L_0x001a:
        r13 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r18);
        r14 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r13);
        switch(r14) {
            case 1: goto L_0x0063;
            case 2: goto L_0x006b;
            case 3: goto L_0x0077;
            case 4: goto L_0x007f;
            case 5: goto L_0x0110;
            case 6: goto L_0x00f6;
            case 7: goto L_0x00fc;
            case 8: goto L_0x0101;
            case 9: goto L_0x0106;
            case 10: goto L_0x010b;
            default: goto L_0x0025;
        };
    L_0x0025:
        r15 = r1;
        r1 = r5;
        r5 = r15;
    L_0x0028:
        r0 = r18;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r13);	 Catch:{ zza -> 0x00d8 }
        r15 = r10;
        r10 = r1;
        r1 = r15;
    L_0x0030:
        if (r11 == 0) goto L_0x0120;
    L_0x0032:
        r11 = r1;
        r15 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r2;
        r2 = r10;
        r10 = r15;
        r16 = r5;
        r5 = r3;
        r3 = r16;
    L_0x003f:
        r1 = r18.dataPosition();	 Catch:{ zza -> 0x0061 }
        if (r1 == r12) goto L_0x00da;
    L_0x0045:
        r1 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0061 }
        r2 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0061 }
        r2.<init>();	 Catch:{ zza -> 0x0061 }
        r3 = "Overread allowed size end=";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x0061 }
        r2 = r2.append(r12);	 Catch:{ zza -> 0x0061 }
        r2 = r2.toString();	 Catch:{ zza -> 0x0061 }
        r0 = r18;
        r1.<init>(r2, r0);	 Catch:{ zza -> 0x0061 }
        throw r1;	 Catch:{ zza -> 0x0061 }
    L_0x0061:
        r1 = move-exception;
        throw r1;
    L_0x0063:
        r0 = r18;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r13);
        if (r11 == 0) goto L_0x00f0;
    L_0x006b:
        r1 = com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR;
        r0 = r18;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zza(r0, r13, r1);
        r1 = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) r1;
        if (r11 == 0) goto L_0x00f0;
    L_0x0077:
        r0 = r18;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r13);
        if (r11 == 0) goto L_0x00f0;
    L_0x007f:
        r3 = r1;
        r1 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = r18;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zza(r0, r13, r1);
        r1 = (com.google.android.gms.maps.model.LatLng) r1;
        if (r11 == 0) goto L_0x00e9;
    L_0x008c:
        r2 = r1;
        r15 = r4;
        r4 = r3;
        r3 = r15;
    L_0x0090:
        r0 = r18;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzh(r0, r13);
        if (r11 == 0) goto L_0x00e0;
    L_0x0098:
        r0 = r18;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r13);
        if (r11 == 0) goto L_0x00e0;
    L_0x00a0:
        r15 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r15;
    L_0x00a7:
        r0 = r18;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r13);
        if (r11 == 0) goto L_0x0138;
    L_0x00af:
        r15 = r7;
        r7 = r6;
        r6 = r1;
        r1 = r15;
    L_0x00b3:
        r0 = r18;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r13);
        if (r11 == 0) goto L_0x0132;
    L_0x00bb:
        r15 = r8;
        r8 = r7;
        r7 = r1;
        r1 = r15;
    L_0x00bf:
        r0 = r18;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r13);
        if (r11 == 0) goto L_0x012c;
    L_0x00c7:
        r15 = r9;
        r9 = r8;
        r8 = r1;
        r1 = r15;
    L_0x00cb:
        r0 = r18;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r13);
        if (r11 == 0) goto L_0x0126;
    L_0x00d3:
        r15 = r1;
        r1 = r9;
        r9 = r15;
        goto L_0x0028;
    L_0x00d8:
        r1 = move-exception;
        throw r1;
    L_0x00da:
        r1 = new com.google.android.gms.maps.StreetViewPanoramaOptions;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        return r1;
    L_0x00e0:
        r15 = r10;
        r10 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x00e9:
        r15 = r10;
        r10 = r5;
        r5 = r3;
        r3 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x00f0:
        r15 = r10;
        r10 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x00f6:
        r15 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r1;
        r1 = r15;
        goto L_0x0098;
    L_0x00fc:
        r15 = r6;
        r6 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x00a7;
    L_0x0101:
        r15 = r7;
        r7 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x00b3;
    L_0x0106:
        r15 = r8;
        r8 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x00bf;
    L_0x010b:
        r15 = r9;
        r9 = r5;
        r5 = r1;
        r1 = r15;
        goto L_0x00cb;
    L_0x0110:
        r2 = r3;
        r3 = r4;
        r4 = r1;
        goto L_0x0090;
    L_0x0115:
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r2;
        r2 = r5;
        r5 = r3;
        r3 = r1;
        goto L_0x003f;
    L_0x0120:
        r15 = r1;
        r1 = r5;
        r5 = r10;
        r10 = r15;
        goto L_0x0014;
    L_0x0126:
        r15 = r10;
        r10 = r9;
        r9 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x012c:
        r15 = r10;
        r10 = r8;
        r8 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x0132:
        r15 = r10;
        r10 = r7;
        r7 = r1;
        r1 = r15;
        goto L_0x0030;
    L_0x0138:
        r15 = r10;
        r10 = r6;
        r6 = r1;
        r1 = r15;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.zzb.zzeV(android.os.Parcel):com.google.android.gms.maps.StreetViewPanoramaOptions");
    }

    public StreetViewPanoramaOptions[] zzhv(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
