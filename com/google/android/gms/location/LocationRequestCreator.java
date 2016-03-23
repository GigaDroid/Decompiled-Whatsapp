package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.LocationServices.zza;

public class LocationRequestCreator implements Creator {
    static void zza(LocationRequest locationRequest, Parcel parcel, int i) {
        int i2 = zza.a;
        int zzak = zzb.zzak(parcel);
        try {
            zzb.zzc(parcel, 1, locationRequest.mPriority);
            zzb.zzc(parcel, 1000, locationRequest.getVersionCode());
            zzb.zza(parcel, 2, locationRequest.zzaBW);
            zzb.zza(parcel, 3, locationRequest.zzaBX);
            zzb.zza(parcel, 4, locationRequest.zzaqs);
            zzb.zza(parcel, 5, locationRequest.zzaBB);
            zzb.zzc(parcel, 6, locationRequest.zzaBY);
            zzb.zza(parcel, 7, locationRequest.zzaBZ);
            zzb.zza(parcel, 8, locationRequest.zzaCa);
            zzb.zzH(parcel, zzak);
            if (com.google.android.gms.location.internal.zzb.a) {
                zza.a = i2 + 1;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.location.LocationRequest createFromParcel(android.os.Parcel r25) {
        /*
        r24 = this;
        r15 = com.google.android.gms.location.LocationServices.zza.a;
        r16 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r25);
        r14 = 0;
        r9 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r12 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r10 = 600000; // 0x927c0 float:8.40779E-40 double:2.964394E-318;
        r8 = 0;
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4 = 0;
        r2 = 0;
    L_0x001b:
        r17 = r25.dataPosition();
        r0 = r17;
        r1 = r16;
        if (r0 >= r1) goto L_0x0039;
    L_0x0025:
        r17 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r25);
        r18 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r17);
        switch(r18) {
            case 1: goto L_0x0073;
            case 2: goto L_0x0087;
            case 3: goto L_0x0091;
            case 4: goto L_0x009b;
            case 5: goto L_0x00a5;
            case 6: goto L_0x00af;
            case 7: goto L_0x00b9;
            case 8: goto L_0x00c3;
            case 1000: goto L_0x007d;
            default: goto L_0x0030;
        };
    L_0x0030:
        r0 = r25;
        r1 = r17;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r1);	 Catch:{ zza -> 0x00cf }
    L_0x0037:
        if (r15 == 0) goto L_0x001b;
    L_0x0039:
        r19 = r2;
        r3 = r14;
        r14 = r19;
        r21 = r5;
        r22 = r6;
        r5 = r12;
        r12 = r21;
        r13 = r4;
        r4 = r9;
        r9 = r8;
        r7 = r10;
        r10 = r22;
        r2 = r25.dataPosition();	 Catch:{ zza -> 0x0071 }
        r0 = r16;
        if (r2 == r0) goto L_0x00d1;
    L_0x0053:
        r2 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0071 }
        r3 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0071 }
        r3.<init>();	 Catch:{ zza -> 0x0071 }
        r4 = "Overread allowed size end=";
        r3 = r3.append(r4);	 Catch:{ zza -> 0x0071 }
        r0 = r16;
        r3 = r3.append(r0);	 Catch:{ zza -> 0x0071 }
        r3 = r3.toString();	 Catch:{ zza -> 0x0071 }
        r0 = r25;
        r2.<init>(r3, r0);	 Catch:{ zza -> 0x0071 }
        throw r2;	 Catch:{ zza -> 0x0071 }
    L_0x0071:
        r2 = move-exception;
        throw r2;
    L_0x0073:
        r0 = r25;
        r1 = r17;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x007d:
        r0 = r25;
        r1 = r17;
        r14 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x0087:
        r0 = r25;
        r1 = r17;
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x0091:
        r0 = r25;
        r1 = r17;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x009b:
        r0 = r25;
        r1 = r17;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00a5:
        r0 = r25;
        r1 = r17;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00af:
        r0 = r25;
        r1 = r17;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00b9:
        r0 = r25;
        r1 = r17;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzl(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00c3:
        r0 = r25;
        r1 = r17;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r0, r1);
        if (r15 == 0) goto L_0x0037;
    L_0x00cd:
        goto L_0x0030;
    L_0x00cf:
        r2 = move-exception;
        throw r2;
    L_0x00d1:
        r2 = new com.google.android.gms.location.LocationRequest;
        r2.<init>(r3, r4, r5, r7, r9, r10, r12, r13, r14);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequestCreator.createFromParcel(android.os.Parcel):com.google.android.gms.location.LocationRequest");
    }

    public Object m119createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }

    public Object[] m120newArray(int i) {
        return newArray(i);
    }
}
