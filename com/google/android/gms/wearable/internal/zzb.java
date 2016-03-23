package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class zzb implements Creator {
    static void zza(AddListenerRequest addListenerRequest, Parcel parcel, int i) {
        int zzak = com.google.android.gms.common.internal.safeparcel.zzb.zzak(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, addListenerRequest.mVersionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, addListenerRequest.zzCt(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, addListenerRequest.zzaZr, i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, addListenerRequest.zzaZs, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, addListenerRequest.zzaZt, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzho(parcel);
    }

    public Object[] newArray(int i) {
        return zzkw(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.AddListenerRequest zzho(android.os.Parcel r12) {
        /*
        r11 = this;
        r0 = 0;
        r5 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r12);
        r1 = 0;
        r2 = r0;
        r3 = r0;
        r4 = r1;
        r1 = r0;
    L_0x000c:
        r7 = r12.dataPosition();
        if (r7 >= r6) goto L_0x007e;
    L_0x0012:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r12);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r8) {
            case 1: goto L_0x004f;
            case 2: goto L_0x0055;
            case 3: goto L_0x005b;
            case 4: goto L_0x0065;
            case 5: goto L_0x006b;
            default: goto L_0x001d;
        };
    L_0x001d:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r12, r7);	 Catch:{ zza -> 0x0076 }
        r9 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r9;
    L_0x0024:
        if (r5 == 0) goto L_0x0084;
    L_0x0026:
        r5 = r0;
        r9 = r1;
        r1 = r4;
        r4 = r9;
        r10 = r3;
        r3 = r2;
        r2 = r10;
    L_0x002d:
        r0 = r12.dataPosition();	 Catch:{ zza -> 0x004d }
        if (r0 == r6) goto L_0x0078;
    L_0x0033:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x004d }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x004d }
        r1.<init>();	 Catch:{ zza -> 0x004d }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x004d }
        r1 = r1.append(r6);	 Catch:{ zza -> 0x004d }
        r1 = r1.toString();	 Catch:{ zza -> 0x004d }
        r0.<init>(r1, r12);	 Catch:{ zza -> 0x004d }
        throw r0;	 Catch:{ zza -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r12, r7);
        if (r5 == 0) goto L_0x0071;
    L_0x0055:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(r12, r7);
        if (r5 == 0) goto L_0x0071;
    L_0x005b:
        r0 = android.content.IntentFilter.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzb(r12, r7, r0);
        r0 = (android.content.IntentFilter[]) r0;
        if (r5 == 0) goto L_0x0071;
    L_0x0065:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r12, r7);
        if (r5 == 0) goto L_0x0071;
    L_0x006b:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r12, r7);
        if (r5 != 0) goto L_0x001d;
    L_0x0071:
        r9 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r9;
        goto L_0x0024;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = new com.google.android.gms.wearable.internal.AddListenerRequest;
        r0.<init>(r1, r2, r3, r4, r5);
        return r0;
    L_0x007e:
        r5 = r1;
        r1 = r4;
        r4 = r2;
        r2 = r3;
        r3 = r0;
        goto L_0x002d;
    L_0x0084:
        r9 = r0;
        r0 = r2;
        r2 = r1;
        r1 = r9;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzb.zzho(android.os.Parcel):com.google.android.gms.wearable.internal.AddListenerRequest");
    }

    public AddListenerRequest[] zzkw(int i) {
        return new AddListenerRequest[i];
    }
}
