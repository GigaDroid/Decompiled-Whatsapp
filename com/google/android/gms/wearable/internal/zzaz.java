package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzaz implements Creator {
    static void zza(MessageEventParcelable messageEventParcelable, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, messageEventParcelable.mVersionCode);
        zzb.zzc(parcel, 2, messageEventParcelable.getRequestId());
        zzb.zza(parcel, 3, messageEventParcelable.getPath(), false);
        zzb.zza(parcel, 4, messageEventParcelable.getData(), false);
        zzb.zza(parcel, 5, messageEventParcelable.getSourceNodeId(), false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhO(parcel);
    }

    public Object[] newArray(int i) {
        return zzkZ(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.MessageEventParcelable zzhO(android.os.Parcel r12) {
        /*
        r11 = this;
        r1 = 0;
        r0 = 0;
        r5 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r12);
        r2 = r0;
        r3 = r1;
        r4 = r1;
        r1 = r0;
    L_0x000c:
        r7 = r12.dataPosition();
        if (r7 >= r6) goto L_0x0022;
    L_0x0012:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r12);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r8) {
            case 1: goto L_0x004b;
            case 2: goto L_0x0051;
            case 3: goto L_0x0057;
            case 4: goto L_0x005d;
            case 5: goto L_0x0063;
            default: goto L_0x001d;
        };
    L_0x001d:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r12, r7);	 Catch:{ zza -> 0x006a }
    L_0x0020:
        if (r5 == 0) goto L_0x000c;
    L_0x0022:
        r5 = r0;
        r9 = r1;
        r1 = r4;
        r4 = r9;
        r10 = r3;
        r3 = r2;
        r2 = r10;
        r0 = r12.dataPosition();	 Catch:{ zza -> 0x0049 }
        if (r0 == r6) goto L_0x006c;
    L_0x002f:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0049 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0049 }
        r1.<init>();	 Catch:{ zza -> 0x0049 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0049 }
        r1 = r1.append(r6);	 Catch:{ zza -> 0x0049 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0049 }
        r0.<init>(r1, r12);	 Catch:{ zza -> 0x0049 }
        throw r0;	 Catch:{ zza -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r12, r7);
        if (r5 == 0) goto L_0x0020;
    L_0x0051:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r12, r7);
        if (r5 == 0) goto L_0x0020;
    L_0x0057:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r12, r7);
        if (r5 == 0) goto L_0x0020;
    L_0x005d:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzr(r12, r7);
        if (r5 == 0) goto L_0x0020;
    L_0x0063:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r12, r7);
        if (r5 == 0) goto L_0x0020;
    L_0x0069:
        goto L_0x001d;
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        r0 = new com.google.android.gms.wearable.internal.MessageEventParcelable;
        r0.<init>(r1, r2, r3, r4, r5);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzaz.zzhO(android.os.Parcel):com.google.android.gms.wearable.internal.MessageEventParcelable");
    }

    public MessageEventParcelable[] zzkZ(int i) {
        return new MessageEventParcelable[i];
    }
}
