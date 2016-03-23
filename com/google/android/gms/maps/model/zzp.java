package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzp implements Creator {
    static void zza(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, visibleRegion.getVersionCode());
        zzb.zza(parcel, 2, visibleRegion.nearLeft, i, false);
        zzb.zza(parcel, 3, visibleRegion.nearRight, i, false);
        zzb.zza(parcel, 4, visibleRegion.farLeft, i, false);
        zzb.zza(parcel, 5, visibleRegion.farRight, i, false);
        zzb.zza(parcel, 6, visibleRegion.latLngBounds, i, false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzfl(parcel);
    }

    public Object[] newArray(int i) {
        return zzhL(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.maps.model.VisibleRegion zzfl(android.os.Parcel r13) {
        /*
        r12 = this;
        r0 = 0;
        r6 = com.google.android.gms.maps.model.LatLng.a;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r13);
        r1 = 0;
        r2 = r0;
        r3 = r0;
        r4 = r0;
        r5 = r1;
        r1 = r0;
    L_0x000d:
        r8 = r13.dataPosition();
        if (r8 >= r7) goto L_0x00c3;
    L_0x0013:
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r13);
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r8);
        switch(r9) {
            case 1: goto L_0x0052;
            case 2: goto L_0x0058;
            case 3: goto L_0x0062;
            case 4: goto L_0x00bd;
            case 5: goto L_0x00bf;
            case 6: goto L_0x00c1;
            default: goto L_0x001e;
        };
    L_0x001e:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r13, r8);	 Catch:{ zza -> 0x0095 }
        r10 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r0;
        r0 = r10;
    L_0x0027:
        if (r6 == 0) goto L_0x00cc;
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
        if (r0 == r7) goto L_0x0097;
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
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r13, r8);
        if (r6 == 0) goto L_0x00b5;
    L_0x0058:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r6 == 0) goto L_0x00b5;
    L_0x0062:
        r4 = r0;
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r6 == 0) goto L_0x00ae;
    L_0x006d:
        r3 = r4;
        r4 = r0;
    L_0x006f:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r6 == 0) goto L_0x00a5;
    L_0x0079:
        r2 = r3;
        r3 = r0;
    L_0x007b:
        r0 = com.google.android.gms.maps.model.LatLng.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLng) r0;
        if (r6 == 0) goto L_0x009d;
    L_0x0085:
        r1 = r2;
        r2 = r0;
    L_0x0087:
        r0 = com.google.android.gms.maps.model.LatLngBounds.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r13, r8, r0);
        r0 = (com.google.android.gms.maps.model.LatLngBounds) r0;
        if (r6 == 0) goto L_0x00d4;
    L_0x0091:
        r10 = r0;
        r0 = r1;
        r1 = r10;
        goto L_0x001e;
    L_0x0095:
        r0 = move-exception;
        throw r0;
    L_0x0097:
        r0 = new com.google.android.gms.maps.model.VisibleRegion;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r0;
    L_0x009d:
        r10 = r1;
        r1 = r0;
        r0 = r10;
        r11 = r3;
        r3 = r4;
        r4 = r2;
        r2 = r11;
        goto L_0x0027;
    L_0x00a5:
        r10 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r10;
        r11 = r4;
        r4 = r3;
        r3 = r11;
        goto L_0x0027;
    L_0x00ae:
        r10 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r0;
        r0 = r10;
        goto L_0x0027;
    L_0x00b5:
        r10 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r0;
        r0 = r10;
        goto L_0x0027;
    L_0x00bd:
        r3 = r0;
        goto L_0x006f;
    L_0x00bf:
        r2 = r0;
        goto L_0x007b;
    L_0x00c1:
        r1 = r0;
        goto L_0x0087;
    L_0x00c3:
        r6 = r1;
        r1 = r5;
        r5 = r2;
        r2 = r0;
        r10 = r4;
        r4 = r3;
        r3 = r10;
        goto L_0x0030;
    L_0x00cc:
        r10 = r0;
        r0 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r10;
        goto L_0x000d;
    L_0x00d4:
        r10 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r1;
        r1 = r10;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.zzp.zzfl(android.os.Parcel):com.google.android.gms.maps.model.VisibleRegion");
    }

    public VisibleRegion[] zzhL(int i) {
        return new VisibleRegion[i];
    }
}
