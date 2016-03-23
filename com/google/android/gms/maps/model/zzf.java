package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.GoogleMap;

public class zzf implements Creator {
    static void zza(MarkerOptions markerOptions, Parcel parcel, int i) {
        int i2 = LatLng.a;
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, markerOptions.getVersionCode());
        zzb.zza(parcel, 2, markerOptions.getPosition(), i, false);
        zzb.zza(parcel, 3, markerOptions.getTitle(), false);
        zzb.zza(parcel, 4, markerOptions.getSnippet(), false);
        zzb.zza(parcel, 5, markerOptions.zzxd(), false);
        zzb.zza(parcel, 6, markerOptions.getAnchorU());
        zzb.zza(parcel, 7, markerOptions.getAnchorV());
        zzb.zza(parcel, 8, markerOptions.isDraggable());
        zzb.zza(parcel, 9, markerOptions.isVisible());
        zzb.zza(parcel, 10, markerOptions.isFlat());
        zzb.zza(parcel, 11, markerOptions.getRotation());
        zzb.zza(parcel, 12, markerOptions.getInfoWindowAnchorU());
        zzb.zza(parcel, 13, markerOptions.getInfoWindowAnchorV());
        zzb.zza(parcel, 14, markerOptions.getAlpha());
        zzb.zzH(parcel, zzak);
        if (i2 != 0) {
            GoogleMap.a++;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzfb(parcel);
    }

    public Object[] newArray(int i) {
        return zzhB(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.MarkerOptions zzfb(android.os.Parcel r23) {
        /*
        r22 = this;
        r16 = com.google.android.gms.maps.model.LatLng.a;
        r17 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r23);
        r15 = 0;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r14 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r20 = r2;
        r2 = r6;
        r6 = r15;
        r15 = r20;
    L_0x001c:
        r18 = r23.dataPosition();
        r0 = r18;
        r1 = r17;
        if (r0 >= r1) goto L_0x01af;
    L_0x0026:
        r18 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r23);
        r19 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r18);
        switch(r19) {
            case 1: goto L_0x0080;
            case 2: goto L_0x008a;
            case 3: goto L_0x0098;
            case 4: goto L_0x00a2;
            case 5: goto L_0x00ac;
            case 6: goto L_0x0168;
            case 7: goto L_0x0171;
            case 8: goto L_0x0179;
            case 9: goto L_0x0181;
            case 10: goto L_0x0189;
            case 11: goto L_0x0191;
            case 12: goto L_0x0199;
            case 13: goto L_0x01a1;
            case 14: goto L_0x01a8;
            default: goto L_0x0031;
        };
    L_0x0031:
        r20 = r2;
        r2 = r6;
        r6 = r20;
    L_0x0036:
        r0 = r23;
        r1 = r18;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r1);	 Catch:{ zza -> 0x014d }
        r20 = r15;
        r15 = r2;
        r2 = r20;
    L_0x0042:
        if (r16 == 0) goto L_0x01bf;
    L_0x0044:
        r16 = r2;
        r20 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r3;
        r3 = r15;
        r15 = r20;
        r21 = r6;
        r6 = r4;
        r4 = r21;
    L_0x0058:
        r2 = r23.dataPosition();	 Catch:{ zza -> 0x007e }
        r0 = r17;
        if (r2 == r0) goto L_0x014f;
    L_0x0060:
        r2 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x007e }
        r3 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x007e }
        r3.<init>();	 Catch:{ zza -> 0x007e }
        r4 = "Overread allowed size end=";
        r3 = r3.append(r4);	 Catch:{ zza -> 0x007e }
        r0 = r17;
        r3 = r3.append(r0);	 Catch:{ zza -> 0x007e }
        r3 = r3.toString();	 Catch:{ zza -> 0x007e }
        r0 = r23;
        r2.<init>(r3, r0);	 Catch:{ zza -> 0x007e }
        throw r2;	 Catch:{ zza -> 0x007e }
    L_0x007e:
        r2 = move-exception;
        throw r2;
    L_0x0080:
        r0 = r23;
        r1 = r18;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r1);
        if (r16 == 0) goto L_0x0160;
    L_0x008a:
        r2 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = r23;
        r1 = r18;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zza(r0, r1, r2);
        r2 = (com.google.android.gms.maps.model.LatLng) r2;
        if (r16 == 0) goto L_0x0160;
    L_0x0098:
        r0 = r23;
        r1 = r18;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r1);
        if (r16 == 0) goto L_0x0160;
    L_0x00a2:
        r0 = r23;
        r1 = r18;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r1);
        if (r16 == 0) goto L_0x0160;
    L_0x00ac:
        r3 = r4;
        r4 = r5;
        r5 = r2;
        r0 = r23;
        r1 = r18;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(r0, r1);
        if (r16 == 0) goto L_0x0155;
    L_0x00b9:
        r0 = r23;
        r1 = r18;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r0, r1);
        if (r16 == 0) goto L_0x0155;
    L_0x00c3:
        r20 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r20;
    L_0x00cc:
        r0 = r23;
        r1 = r18;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r0, r1);
        if (r16 == 0) goto L_0x01ff;
    L_0x00d6:
        r20 = r8;
        r8 = r7;
        r7 = r2;
        r2 = r20;
    L_0x00dc:
        r0 = r23;
        r1 = r18;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r1);
        if (r16 == 0) goto L_0x01f7;
    L_0x00e6:
        r20 = r9;
        r9 = r8;
        r8 = r2;
        r2 = r20;
    L_0x00ec:
        r0 = r23;
        r1 = r18;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r1);
        if (r16 == 0) goto L_0x01ef;
    L_0x00f6:
        r20 = r10;
        r10 = r9;
        r9 = r2;
        r2 = r20;
    L_0x00fc:
        r0 = r23;
        r1 = r18;
        r11 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r1);
        if (r16 == 0) goto L_0x01e7;
    L_0x0106:
        r20 = r11;
        r11 = r10;
        r10 = r2;
        r2 = r20;
    L_0x010c:
        r0 = r23;
        r1 = r18;
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r0, r1);
        if (r16 == 0) goto L_0x01df;
    L_0x0116:
        r20 = r12;
        r12 = r11;
        r11 = r2;
        r2 = r20;
    L_0x011c:
        r0 = r23;
        r1 = r18;
        r13 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r0, r1);
        if (r16 == 0) goto L_0x01d7;
    L_0x0126:
        r20 = r13;
        r13 = r12;
        r12 = r2;
        r2 = r20;
    L_0x012c:
        r0 = r23;
        r1 = r18;
        r14 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r0, r1);
        if (r16 == 0) goto L_0x01cf;
    L_0x0136:
        r20 = r14;
        r14 = r13;
        r13 = r2;
        r2 = r20;
    L_0x013c:
        r0 = r23;
        r1 = r18;
        r15 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r0, r1);
        if (r16 == 0) goto L_0x01c7;
    L_0x0146:
        r20 = r2;
        r2 = r14;
        r14 = r20;
        goto L_0x0036;
    L_0x014d:
        r2 = move-exception;
        throw r2;
    L_0x014f:
        r2 = new com.google.android.gms.maps.model.MarkerOptions;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        return r2;
    L_0x0155:
        r20 = r15;
        r15 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x0160:
        r20 = r15;
        r15 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x0168:
        r20 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r2;
        r2 = r20;
        goto L_0x00b9;
    L_0x0171:
        r20 = r7;
        r7 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x00cc;
    L_0x0179:
        r20 = r8;
        r8 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x00dc;
    L_0x0181:
        r20 = r9;
        r9 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x00ec;
    L_0x0189:
        r20 = r10;
        r10 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x00fc;
    L_0x0191:
        r20 = r11;
        r11 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x010c;
    L_0x0199:
        r20 = r12;
        r12 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x011c;
    L_0x01a1:
        r20 = r13;
        r13 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x012c;
    L_0x01a8:
        r20 = r14;
        r14 = r6;
        r6 = r2;
        r2 = r20;
        goto L_0x013c;
    L_0x01af:
        r16 = r15;
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r3;
        r3 = r6;
        r6 = r4;
        r4 = r2;
        goto L_0x0058;
    L_0x01bf:
        r20 = r2;
        r2 = r6;
        r6 = r15;
        r15 = r20;
        goto L_0x001c;
    L_0x01c7:
        r20 = r15;
        r15 = r14;
        r14 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01cf:
        r20 = r15;
        r15 = r13;
        r13 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01d7:
        r20 = r15;
        r15 = r12;
        r12 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01df:
        r20 = r15;
        r15 = r11;
        r11 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01e7:
        r20 = r15;
        r15 = r10;
        r10 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01ef:
        r20 = r15;
        r15 = r9;
        r9 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01f7:
        r20 = r15;
        r15 = r8;
        r8 = r2;
        r2 = r20;
        goto L_0x0042;
    L_0x01ff:
        r20 = r15;
        r15 = r7;
        r7 = r2;
        r2 = r20;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzf.zzfb(android.os.Parcel):com.google.android.gms.maps.model.MarkerOptions");
    }

    public MarkerOptions[] zzhB(int i) {
        return new MarkerOptions[i];
    }
}
