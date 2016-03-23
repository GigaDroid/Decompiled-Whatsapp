package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq implements Creator {
    static void zza(ChannelReceiveFileResponse channelReceiveFileResponse, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, channelReceiveFileResponse.versionCode);
        zzb.zzc(parcel, 2, channelReceiveFileResponse.statusCode);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhv(parcel);
    }

    public Object[] newArray(int i) {
        return zzkG(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.ChannelReceiveFileResponse zzhv(android.os.Parcel r7) {
        /*
        r6 = this;
        r0 = 0;
        r2 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r7);
        r1 = r0;
    L_0x0008:
        r4 = r7.dataPosition();
        if (r4 >= r3) goto L_0x001e;
    L_0x000e:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r7);
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r4);
        switch(r5) {
            case 1: goto L_0x0040;
            case 2: goto L_0x0046;
            default: goto L_0x0019;
        };
    L_0x0019:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r7, r4);	 Catch:{ zza -> 0x004d }
    L_0x001c:
        if (r2 == 0) goto L_0x0008;
    L_0x001e:
        r2 = r7.dataPosition();	 Catch:{ zza -> 0x003e }
        if (r2 == r3) goto L_0x004f;
    L_0x0024:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x003e }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x003e }
        r1.<init>();	 Catch:{ zza -> 0x003e }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x003e }
        r1 = r1.append(r3);	 Catch:{ zza -> 0x003e }
        r1 = r1.toString();	 Catch:{ zza -> 0x003e }
        r0.<init>(r1, r7);	 Catch:{ zza -> 0x003e }
        throw r0;	 Catch:{ zza -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r7, r4);
        if (r2 == 0) goto L_0x001c;
    L_0x0046:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r7, r4);
        if (r2 == 0) goto L_0x001c;
    L_0x004c:
        goto L_0x0019;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r2 = new com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
        r2.<init>(r1, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzq.zzhv(android.os.Parcel):com.google.android.gms.wearable.internal.ChannelReceiveFileResponse");
    }

    public ChannelReceiveFileResponse[] zzkG(int i) {
        return new ChannelReceiveFileResponse[i];
    }
}
