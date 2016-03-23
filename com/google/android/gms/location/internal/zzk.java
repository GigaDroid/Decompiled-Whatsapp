package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Creator {
    static void zza(LocationRequestInternal locationRequestInternal, Parcel parcel, int i) {
        boolean z = false;
        boolean z2 = zzj.b;
        int zzak = zzb.zzak(parcel);
        try {
            zzb.zza(parcel, 1, locationRequestInternal.zzaqq, i, false);
            zzb.zzc(parcel, 1000, locationRequestInternal.getVersionCode());
            zzb.zza(parcel, 2, locationRequestInternal.zzaCU);
            zzb.zza(parcel, 3, locationRequestInternal.zzaCV);
            zzb.zza(parcel, 4, locationRequestInternal.zzaCW);
            zzb.zzc(parcel, 5, locationRequestInternal.zzaCX, false);
            zzb.zza(parcel, 6, locationRequestInternal.mTag, false);
            zzb.zza(parcel, 7, locationRequestInternal.zzaCY);
            zzb.zzH(parcel, zzak);
            if (zzb.a) {
                if (!z2) {
                    z = true;
                }
                zzj.b = z;
            }
        } catch (zza e) {
            throw e;
        } catch (zza e2) {
            throw e2;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzew(parcel);
    }

    public Object[] newArray(int i) {
        return zzgR(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.location.internal.LocationRequestInternal zzew(android.os.Parcel r17) {
        /*
        r16 = this;
        r9 = com.google.android.gms.location.internal.zzj.b;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r17);
        r8 = 0;
        r7 = 0;
        r6 = 0;
        r5 = 1;
        r4 = 1;
        r3 = com.google.android.gms.location.internal.LocationRequestInternal.zzaCT;
        r2 = 0;
        r1 = 0;
        r13 = r1;
        r1 = r7;
        r7 = r8;
        r8 = r13;
    L_0x0013:
        r11 = r17.dataPosition();
        if (r11 >= r10) goto L_0x00d8;
    L_0x0019:
        r11 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r17);
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r11);
        switch(r12) {
            case 1: goto L_0x005d;
            case 2: goto L_0x0071;
            case 3: goto L_0x0079;
            case 4: goto L_0x0081;
            case 5: goto L_0x0089;
            case 6: goto L_0x00d2;
            case 7: goto L_0x00ca;
            case 1000: goto L_0x0069;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = r17;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r11);	 Catch:{ zza -> 0x00b1 }
        r13 = r8;
        r8 = r7;
        r7 = r1;
        r1 = r13;
    L_0x002d:
        if (r9 == 0) goto L_0x00e2;
    L_0x002f:
        r9 = r1;
        r13 = r2;
        r2 = r8;
        r8 = r13;
        r14 = r4;
        r4 = r6;
        r6 = r14;
        r15 = r7;
        r7 = r3;
        r3 = r15;
    L_0x0039:
        r1 = r17.dataPosition();	 Catch:{ zza -> 0x005b }
        if (r1 == r10) goto L_0x00b3;
    L_0x003f:
        r1 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x005b }
        r2 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x005b }
        r2.<init>();	 Catch:{ zza -> 0x005b }
        r3 = "Overread allowed size end=";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x005b }
        r2 = r2.append(r10);	 Catch:{ zza -> 0x005b }
        r2 = r2.toString();	 Catch:{ zza -> 0x005b }
        r0 = r17;
        r1.<init>(r2, r0);	 Catch:{ zza -> 0x005b }
        throw r1;	 Catch:{ zza -> 0x005b }
    L_0x005b:
        r1 = move-exception;
        throw r1;
    L_0x005d:
        r1 = com.google.android.gms.location.LocationRequest.CREATOR;
        r0 = r17;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zza(r0, r11, r1);
        r1 = (com.google.android.gms.location.LocationRequest) r1;
        if (r9 == 0) goto L_0x00c4;
    L_0x0069:
        r0 = r17;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r11);
        if (r9 == 0) goto L_0x00c4;
    L_0x0071:
        r0 = r17;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r11);
        if (r9 == 0) goto L_0x00c4;
    L_0x0079:
        r0 = r17;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r11);
        if (r9 == 0) goto L_0x00c4;
    L_0x0081:
        r0 = r17;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r11);
        if (r9 == 0) goto L_0x00c4;
    L_0x0089:
        r3 = com.google.android.gms.location.internal.ClientIdentity.CREATOR;
        r0 = r17;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r11, r3);
        if (r9 == 0) goto L_0x00c4;
    L_0x0093:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r1;
    L_0x0098:
        r0 = r17;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r11);
        if (r9 == 0) goto L_0x00b9;
    L_0x00a0:
        r0 = r17;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r0, r11);
        if (r9 == 0) goto L_0x00e8;
    L_0x00a8:
        r13 = r1;
        r1 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r13;
        goto L_0x0024;
    L_0x00b1:
        r1 = move-exception;
        throw r1;
    L_0x00b3:
        r1 = new com.google.android.gms.location.internal.LocationRequestInternal;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        return r1;
    L_0x00b9:
        r13 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r13;
        goto L_0x002d;
    L_0x00c4:
        r13 = r8;
        r8 = r7;
        r7 = r1;
        r1 = r13;
        goto L_0x002d;
    L_0x00ca:
        r13 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r1;
        r1 = r13;
        goto L_0x00a0;
    L_0x00d2:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r1;
        goto L_0x0098;
    L_0x00d8:
        r9 = r8;
        r8 = r2;
        r2 = r7;
        r7 = r3;
        r3 = r1;
        r13 = r6;
        r6 = r4;
        r4 = r13;
        goto L_0x0039;
    L_0x00e2:
        r13 = r1;
        r1 = r7;
        r7 = r8;
        r8 = r13;
        goto L_0x0013;
    L_0x00e8:
        r13 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r13;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.zzk.zzew(android.os.Parcel):com.google.android.gms.location.internal.LocationRequestInternal");
    }

    public LocationRequestInternal[] zzgR(int i) {
        return new LocationRequestInternal[i];
    }
}
