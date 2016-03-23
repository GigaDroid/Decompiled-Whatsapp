package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Creator {
    static void zza(LocationRequestUpdateData locationRequestUpdateData, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, locationRequestUpdateData.zzaCZ);
        zzb.zzc(parcel, 1000, locationRequestUpdateData.getVersionCode());
        zzb.zza(parcel, 2, locationRequestUpdateData.zzaDa, i, false);
        zzb.zza(parcel, 3, locationRequestUpdateData.zzvS(), false);
        zzb.zza(parcel, 4, locationRequestUpdateData.mPendingIntent, i, false);
        zzb.zza(parcel, 5, locationRequestUpdateData.zzvT(), false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzex(parcel);
    }

    public Object[] newArray(int i) {
        return zzgS(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.location.internal.LocationRequestUpdateData zzex(android.os.Parcel r13) {
        /*
        r12 = this;
        r0 = 0;
        r6 = com.google.android.gms.location.internal.zzj.b;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r13);
        r2 = 0;
        r1 = 1;
        r3 = r0;
        r4 = r1;
        r5 = r2;
        r2 = r0;
        r1 = r0;
    L_0x000e:
        r8 = r13.dataPosition();
        if (r8 >= r7) goto L_0x009c;
    L_0x0014:
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r13);
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r8);
        switch(r9) {
            case 1: goto L_0x0052;
            case 2: goto L_0x005e;
            case 3: goto L_0x0068;
            case 4: goto L_0x006e;
            case 5: goto L_0x0098;
            case 1000: goto L_0x0058;
            default: goto L_0x001f;
        };
    L_0x001f:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r13, r8);	 Catch:{ zza -> 0x0083 }
        r10 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r0;
        r0 = r10;
    L_0x0027:
        if (r6 == 0) goto L_0x00a3;
    L_0x0029:
        r6 = r0;
        r10 = r1;
        r1 = r5;
        r5 = r10;
        r11 = r4;
        r4 = r2;
        r2 = r11;
    L_0x0030:
        r0 = r13.dataPosition();	 Catch:{ zza -> 0x0050 }
        if (r0 == r7) goto L_0x0085;
    L_0x0036:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0050 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0050 }
        r1.<init>();	 Catch:{ zza -> 0x0050 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0050 }
        r1 = r1.append(r7);	 Catch:{ zza -> 0x0050 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0050 }
        r0.<init>(r1, r13);	 Catch:{ zza -> 0x0050 }
        throw r0;	 Catch:{ zza -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r8);
        if (r6 == 0) goto L_0x0092;
    L_0x0058:
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r8);
        if (r6 == 0) goto L_0x0092;
    L_0x005e:
        r0 = com.google.android.gms.location.internal.LocationRequestInternal.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r13, r8, r0);
        r0 = (com.google.android.gms.location.internal.LocationRequestInternal) r0;
        if (r6 == 0) goto L_0x0092;
    L_0x0068:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(r13, r8);
        if (r6 == 0) goto L_0x0092;
    L_0x006e:
        r2 = r0;
        r0 = android.app.PendingIntent.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r13, r8, r0);
        r0 = (android.app.PendingIntent) r0;
        if (r6 == 0) goto L_0x008b;
    L_0x0079:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(r13, r8);
        if (r6 == 0) goto L_0x008b;
    L_0x007f:
        r10 = r0;
        r0 = r2;
        r2 = r10;
        goto L_0x001f;
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = new com.google.android.gms.location.internal.LocationRequestUpdateData;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r0;
    L_0x008b:
        r10 = r1;
        r1 = r0;
        r0 = r10;
        r11 = r3;
        r3 = r2;
        r2 = r11;
        goto L_0x0027;
    L_0x0092:
        r10 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r0;
        r0 = r10;
        goto L_0x0027;
    L_0x0098:
        r10 = r2;
        r2 = r0;
        r0 = r10;
        goto L_0x0079;
    L_0x009c:
        r6 = r1;
        r1 = r5;
        r5 = r2;
        r2 = r4;
        r4 = r3;
        r3 = r0;
        goto L_0x0030;
    L_0x00a3:
        r10 = r0;
        r0 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r10;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.zzl.zzex(android.os.Parcel):com.google.android.gms.location.internal.LocationRequestUpdateData");
    }

    public LocationRequestUpdateData[] zzgS(int i) {
        return new LocationRequestUpdateData[i];
    }
}
