package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzap implements Creator {
    static void zza(GetConnectedNodesResponse getConnectedNodesResponse, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, getConnectedNodesResponse.versionCode);
        zzb.zzc(parcel, 2, getConnectedNodesResponse.statusCode);
        zzb.zzc(parcel, 3, getConnectedNodesResponse.zzbaz, false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhK(parcel);
    }

    public Object[] newArray(int i) {
        return zzkV(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.GetConnectedNodesResponse zzhK(android.os.Parcel r8) {
        /*
        r7 = this;
        r1 = 0;
        r3 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r8);
        r0 = 0;
        r2 = r1;
    L_0x0009:
        r5 = r8.dataPosition();
        if (r5 >= r4) goto L_0x001f;
    L_0x000f:
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r8);
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r5);
        switch(r6) {
            case 1: goto L_0x0041;
            case 2: goto L_0x0047;
            case 3: goto L_0x004d;
            default: goto L_0x001a;
        };
    L_0x001a:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r8, r5);	 Catch:{ zza -> 0x0056 }
    L_0x001d:
        if (r3 == 0) goto L_0x0009;
    L_0x001f:
        r3 = r8.dataPosition();	 Catch:{ zza -> 0x003f }
        if (r3 == r4) goto L_0x0058;
    L_0x0025:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x003f }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x003f }
        r1.<init>();	 Catch:{ zza -> 0x003f }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x003f }
        r1 = r1.append(r4);	 Catch:{ zza -> 0x003f }
        r1 = r1.toString();	 Catch:{ zza -> 0x003f }
        r0.<init>(r1, r8);	 Catch:{ zza -> 0x003f }
        throw r0;	 Catch:{ zza -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r8, r5);
        if (r3 == 0) goto L_0x001d;
    L_0x0047:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r8, r5);
        if (r3 == 0) goto L_0x001d;
    L_0x004d:
        r0 = com.google.android.gms.wearable.internal.NodeParcelable.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(r8, r5, r0);
        if (r3 == 0) goto L_0x001d;
    L_0x0055:
        goto L_0x001a;
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r3 = new com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
        r3.<init>(r2, r1, r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzap.zzhK(android.os.Parcel):com.google.android.gms.wearable.internal.GetConnectedNodesResponse");
    }

    public GetConnectedNodesResponse[] zzkV(int i) {
        return new GetConnectedNodesResponse[i];
    }
}
