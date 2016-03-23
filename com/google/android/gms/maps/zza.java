package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Creator {
    static void zza(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int i2 = MapView.a;
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, googleMapOptions.getVersionCode());
        zzb.zza(parcel, 2, googleMapOptions.zzwE());
        zzb.zza(parcel, 3, googleMapOptions.zzwF());
        zzb.zzc(parcel, 4, googleMapOptions.getMapType());
        zzb.zza(parcel, 5, googleMapOptions.getCamera(), i, false);
        zzb.zza(parcel, 6, googleMapOptions.zzwG());
        zzb.zza(parcel, 7, googleMapOptions.zzwH());
        zzb.zza(parcel, 8, googleMapOptions.zzwI());
        zzb.zza(parcel, 9, googleMapOptions.zzwJ());
        zzb.zza(parcel, 10, googleMapOptions.zzwK());
        zzb.zza(parcel, 11, googleMapOptions.zzwL());
        zzb.zza(parcel, 12, googleMapOptions.zzwM());
        zzb.zza(parcel, 14, googleMapOptions.zzwN());
        zzb.zzH(parcel, zzak);
        if (i2 != 0) {
            GoogleMap.a++;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzeU(parcel);
    }

    public Object[] newArray(int i) {
        return zzhu(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.GoogleMapOptions zzeU(android.os.Parcel r22) {
        /*
        r21 = this;
        r15 = com.google.android.gms.maps.MapView.a;
        r16 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r22);
        r14 = 0;
        r6 = -1;
        r5 = -1;
        r4 = 0;
        r3 = 0;
        r7 = -1;
        r8 = -1;
        r9 = -1;
        r10 = -1;
        r11 = -1;
        r12 = -1;
        r13 = -1;
        r2 = -1;
        r19 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r14;
        r14 = r19;
    L_0x001c:
        r17 = r22.dataPosition();
        r0 = r17;
        r1 = r16;
        if (r0 >= r1) goto L_0x01b1;
    L_0x0026:
        r17 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r22);
        r18 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r17);
        switch(r18) {
            case 1: goto L_0x0081;
            case 2: goto L_0x008b;
            case 3: goto L_0x0095;
            case 4: goto L_0x009f;
            case 5: goto L_0x00a9;
            case 6: goto L_0x00b7;
            case 7: goto L_0x0164;
            case 8: goto L_0x016f;
            case 9: goto L_0x017a;
            case 10: goto L_0x0185;
            case 11: goto L_0x0190;
            case 12: goto L_0x019b;
            case 13: goto L_0x0031;
            case 14: goto L_0x01a6;
            default: goto L_0x0031;
        };
    L_0x0031:
        r19 = r2;
        r2 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r19;
    L_0x0039:
        r0 = r22;
        r1 = r17;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r1);	 Catch:{ zza -> 0x013b }
        r19 = r14;
        r14 = r2;
        r2 = r19;
    L_0x0045:
        if (r15 == 0) goto L_0x01c6;
    L_0x0047:
        r15 = r2;
        r19 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r3;
        r3 = r14;
        r14 = r19;
        r20 = r6;
        r6 = r4;
        r4 = r20;
    L_0x0059:
        r2 = r22.dataPosition();	 Catch:{ zza -> 0x007f }
        r0 = r16;
        if (r2 == r0) goto L_0x013d;
    L_0x0061:
        r2 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x007f }
        r3 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x007f }
        r3.<init>();	 Catch:{ zza -> 0x007f }
        r4 = "Overread allowed size end=";
        r3 = r3.append(r4);	 Catch:{ zza -> 0x007f }
        r0 = r16;
        r3 = r3.append(r0);	 Catch:{ zza -> 0x007f }
        r3 = r3.toString();	 Catch:{ zza -> 0x007f }
        r0 = r22;
        r2.<init>(r3, r0);	 Catch:{ zza -> 0x007f }
        throw r2;	 Catch:{ zza -> 0x007f }
    L_0x007f:
        r2 = move-exception;
        throw r2;
    L_0x0081:
        r0 = r22;
        r1 = r17;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r1);
        if (r15 == 0) goto L_0x0143;
    L_0x008b:
        r0 = r22;
        r1 = r17;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x0159;
    L_0x0095:
        r0 = r22;
        r1 = r17;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x014e;
    L_0x009f:
        r0 = r22;
        r1 = r17;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r1);
        if (r15 == 0) goto L_0x0143;
    L_0x00a9:
        r2 = com.google.android.gms.maps.model.CameraPosition.CREATOR;
        r0 = r22;
        r1 = r17;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zza(r0, r1, r2);
        r2 = (com.google.android.gms.maps.model.CameraPosition) r2;
        if (r15 == 0) goto L_0x0143;
    L_0x00b7:
        r0 = r22;
        r1 = r17;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x0143;
    L_0x00c1:
        r19 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
    L_0x00ca:
        r0 = r22;
        r1 = r17;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x0201;
    L_0x00d4:
        r19 = r8;
        r8 = r7;
        r7 = r2;
        r2 = r19;
    L_0x00da:
        r0 = r22;
        r1 = r17;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x01f9;
    L_0x00e4:
        r19 = r9;
        r9 = r8;
        r8 = r2;
        r2 = r19;
    L_0x00ea:
        r0 = r22;
        r1 = r17;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x01f1;
    L_0x00f4:
        r19 = r10;
        r10 = r9;
        r9 = r2;
        r2 = r19;
    L_0x00fa:
        r0 = r22;
        r1 = r17;
        r11 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x01e9;
    L_0x0104:
        r19 = r11;
        r11 = r10;
        r10 = r2;
        r2 = r19;
    L_0x010a:
        r0 = r22;
        r1 = r17;
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x01e1;
    L_0x0114:
        r19 = r12;
        r12 = r11;
        r11 = r2;
        r2 = r19;
    L_0x011a:
        r0 = r22;
        r1 = r17;
        r13 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x01d9;
    L_0x0124:
        r19 = r13;
        r13 = r12;
        r12 = r2;
        r2 = r19;
    L_0x012a:
        r0 = r22;
        r1 = r17;
        r14 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r1);
        if (r15 == 0) goto L_0x01d1;
    L_0x0134:
        r19 = r2;
        r2 = r13;
        r13 = r19;
        goto L_0x0039;
    L_0x013b:
        r2 = move-exception;
        throw r2;
    L_0x013d:
        r2 = new com.google.android.gms.maps.GoogleMapOptions;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        return r2;
    L_0x0143:
        r19 = r14;
        r14 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x014e:
        r19 = r14;
        r14 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x0159:
        r19 = r14;
        r14 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x0164:
        r19 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x00ca;
    L_0x016f:
        r19 = r8;
        r8 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x00da;
    L_0x017a:
        r19 = r9;
        r9 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x00ea;
    L_0x0185:
        r19 = r10;
        r10 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x00fa;
    L_0x0190:
        r19 = r11;
        r11 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x010a;
    L_0x019b:
        r19 = r12;
        r12 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x011a;
    L_0x01a6:
        r19 = r13;
        r13 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x012a;
    L_0x01b1:
        r15 = r14;
        r14 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r2;
        r19 = r3;
        r3 = r6;
        r6 = r19;
        r20 = r5;
        r5 = r4;
        r4 = r20;
        goto L_0x0059;
    L_0x01c6:
        r19 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r14;
        r14 = r19;
        goto L_0x001c;
    L_0x01d1:
        r19 = r14;
        r14 = r13;
        r13 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01d9:
        r19 = r14;
        r14 = r12;
        r12 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01e1:
        r19 = r14;
        r14 = r11;
        r11 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01e9:
        r19 = r14;
        r14 = r10;
        r10 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01f1:
        r19 = r14;
        r14 = r9;
        r9 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x01f9:
        r19 = r14;
        r14 = r8;
        r8 = r2;
        r2 = r19;
        goto L_0x0045;
    L_0x0201:
        r19 = r14;
        r14 = r7;
        r7 = r2;
        r2 = r19;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.zza.zzeU(android.os.Parcel):com.google.android.gms.maps.GoogleMapOptions");
    }

    public GoogleMapOptions[] zzhu(int i) {
        return new GoogleMapOptions[i];
    }
}
