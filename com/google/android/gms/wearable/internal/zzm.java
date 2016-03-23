package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Creator {
    static void zza(ChannelEventParcelable channelEventParcelable, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, channelEventParcelable.mVersionCode);
        zzb.zza(parcel, 2, channelEventParcelable.zzaZR, i, false);
        zzb.zzc(parcel, 3, channelEventParcelable.type);
        zzb.zzc(parcel, 4, channelEventParcelable.zzaZP);
        zzb.zzc(parcel, 5, channelEventParcelable.zzaZQ);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzht(parcel);
    }

    public Object[] newArray(int i) {
        return zzkD(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.ChannelEventParcelable zzht(android.os.Parcel r11) {
        /*
        r10 = this;
        r0 = 0;
        r5 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r11);
        r1 = 0;
        r4 = r0;
        r3 = r0;
        r2 = r0;
        r9 = r1;
        r1 = r0;
        r0 = r9;
    L_0x000e:
        r7 = r11.dataPosition();
        if (r7 >= r6) goto L_0x0092;
    L_0x0014:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r11);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r8) {
            case 1: goto L_0x0052;
            case 2: goto L_0x0058;
            case 3: goto L_0x0062;
            case 4: goto L_0x0068;
            case 5: goto L_0x008d;
            default: goto L_0x001f;
        };
    L_0x001f:
        r9 = r0;
        r0 = r1;
        r1 = r9;
    L_0x0022:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r11, r7);	 Catch:{ zza -> 0x0080 }
        r9 = r4;
        r4 = r0;
        r0 = r9;
    L_0x0028:
        if (r5 == 0) goto L_0x0097;
    L_0x002a:
        r5 = r0;
        r9 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r4;
        r4 = r9;
    L_0x0030:
        r0 = r11.dataPosition();	 Catch:{ zza -> 0x0050 }
        if (r0 == r6) goto L_0x0082;
    L_0x0036:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0050 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0050 }
        r1.<init>();	 Catch:{ zza -> 0x0050 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0050 }
        r1 = r1.append(r6);	 Catch:{ zza -> 0x0050 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0050 }
        r0.<init>(r1, r11);	 Catch:{ zza -> 0x0050 }
        throw r0;	 Catch:{ zza -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r11, r7);
        if (r5 == 0) goto L_0x0088;
    L_0x0058:
        r0 = com.google.android.gms.wearable.internal.ChannelImpl.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r11, r7, r0);
        r0 = (com.google.android.gms.wearable.internal.ChannelImpl) r0;
        if (r5 == 0) goto L_0x0088;
    L_0x0062:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r11, r7);
        if (r5 == 0) goto L_0x0088;
    L_0x0068:
        r9 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r9;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r11, r7);
        if (r5 == 0) goto L_0x00a2;
    L_0x0072:
        r9 = r3;
        r3 = r2;
        r2 = r0;
        r0 = r9;
    L_0x0076:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r11, r7);
        if (r5 == 0) goto L_0x009d;
    L_0x007c:
        r9 = r0;
        r0 = r3;
        r3 = r9;
        goto L_0x0022;
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = new com.google.android.gms.wearable.internal.ChannelEventParcelable;
        r0.<init>(r1, r2, r3, r4, r5);
        return r0;
    L_0x0088:
        r9 = r4;
        r4 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0028;
    L_0x008d:
        r9 = r3;
        r3 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0076;
    L_0x0092:
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r0;
        goto L_0x0030;
    L_0x0097:
        r9 = r0;
        r0 = r1;
        r1 = r4;
        r4 = r9;
        goto L_0x000e;
    L_0x009d:
        r9 = r4;
        r4 = r3;
        r3 = r0;
        r0 = r9;
        goto L_0x0028;
    L_0x00a2:
        r9 = r4;
        r4 = r2;
        r2 = r0;
        r0 = r9;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzm.zzht(android.os.Parcel):com.google.android.gms.wearable.internal.ChannelEventParcelable");
    }

    public ChannelEventParcelable[] zzkD(int i) {
        return new ChannelEventParcelable[i];
    }
}
