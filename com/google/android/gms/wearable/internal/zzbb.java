package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbb implements Creator {
    static void zza(NodeParcelable nodeParcelable, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, nodeParcelable.mVersionCode);
        zzb.zza(parcel, 2, nodeParcelable.getId(), false);
        zzb.zza(parcel, 3, nodeParcelable.getDisplayName(), false);
        zzb.zzc(parcel, 4, nodeParcelable.getHopCount());
        zzb.zza(parcel, 5, nodeParcelable.isNearby());
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhP(parcel);
    }

    public Object[] newArray(int i) {
        return zzla(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.NodeParcelable zzhP(android.os.Parcel r11) {
        /*
        r10 = this;
        r1 = 0;
        r0 = 0;
        r5 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r11);
        r4 = r0;
        r3 = r0;
        r2 = r0;
        r0 = r1;
    L_0x000c:
        r7 = r11.dataPosition();
        if (r7 >= r6) goto L_0x0085;
    L_0x0012:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r11);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r8) {
            case 1: goto L_0x004e;
            case 2: goto L_0x0054;
            case 3: goto L_0x005a;
            case 4: goto L_0x0060;
            case 5: goto L_0x0066;
            default: goto L_0x001d;
        };
    L_0x001d:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r11, r7);	 Catch:{ zza -> 0x0077 }
        r9 = r4;
        r4 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
    L_0x0025:
        if (r5 == 0) goto L_0x008c;
    L_0x0027:
        r5 = r0;
        r9 = r3;
        r3 = r1;
        r1 = r4;
        r4 = r9;
    L_0x002c:
        r0 = r11.dataPosition();	 Catch:{ zza -> 0x004c }
        if (r0 == r6) goto L_0x0079;
    L_0x0032:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x004c }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x004c }
        r1.<init>();	 Catch:{ zza -> 0x004c }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x004c }
        r1 = r1.append(r6);	 Catch:{ zza -> 0x004c }
        r1 = r1.toString();	 Catch:{ zza -> 0x004c }
        r0.<init>(r1, r11);	 Catch:{ zza -> 0x004c }
        throw r0;	 Catch:{ zza -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r11, r7);
        if (r5 == 0) goto L_0x007f;
    L_0x0054:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r11, r7);
        if (r5 == 0) goto L_0x007f;
    L_0x005a:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r11, r7);
        if (r5 == 0) goto L_0x007f;
    L_0x0060:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r11, r7);
        if (r5 == 0) goto L_0x007f;
    L_0x0066:
        r9 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r11, r7);
        if (r5 == 0) goto L_0x0093;
    L_0x0071:
        r9 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r9;
        goto L_0x001d;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = new com.google.android.gms.wearable.internal.NodeParcelable;
        r0.<init>(r1, r2, r3, r4, r5);
        return r0;
    L_0x007f:
        r9 = r4;
        r4 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0025;
    L_0x0085:
        r5 = r4;
        r4 = r3;
        r3 = r0;
        r9 = r1;
        r1 = r2;
        r2 = r9;
        goto L_0x002c;
    L_0x008c:
        r9 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r4;
        r4 = r9;
        goto L_0x000c;
    L_0x0093:
        r9 = r4;
        r4 = r3;
        r3 = r0;
        r0 = r9;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzbb.zzhP(android.os.Parcel):com.google.android.gms.wearable.internal.NodeParcelable");
    }

    public NodeParcelable[] zzla(int i) {
        return new NodeParcelable[i];
    }
}
