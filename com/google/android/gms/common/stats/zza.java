package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Creator {
    static void zza(ConnectionEvent connectionEvent, Parcel parcel, int i) {
        boolean z = zzd.a;
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, connectionEvent.mVersionCode);
        zzb.zza(parcel, 2, connectionEvent.getTimeMillis());
        zzb.zza(parcel, 4, connectionEvent.zzpv(), false);
        zzb.zza(parcel, 5, connectionEvent.zzpw(), false);
        zzb.zza(parcel, 6, connectionEvent.zzpx(), false);
        zzb.zza(parcel, 7, connectionEvent.zzpy(), false);
        zzb.zza(parcel, 8, connectionEvent.zzpz(), false);
        zzb.zza(parcel, 10, connectionEvent.zzpC());
        zzb.zza(parcel, 11, connectionEvent.zzpB());
        zzb.zzc(parcel, 12, connectionEvent.getEventType());
        zzb.zza(parcel, 13, connectionEvent.zzpA(), false);
        zzb.zzH(parcel, zzak);
        if (z) {
            com.google.android.gms.common.internal.safeparcel.zza.zza.a++;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzau(parcel);
    }

    public Object[] newArray(int i) {
        return zzbT(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.stats.ConnectionEvent zzau(android.os.Parcel r26) {
        /*
        r25 = this;
        r18 = com.google.android.gms.common.stats.zzd.a;
        r19 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r26);
        r13 = 0;
        r14 = 0;
        r12 = 0;
        r11 = 0;
        r10 = 0;
        r9 = 0;
        r8 = 0;
        r7 = 0;
        r6 = 0;
        r4 = 0;
        r2 = 0;
    L_0x0014:
        r16 = r26.dataPosition();
        r0 = r16;
        r1 = r19;
        if (r0 >= r1) goto L_0x0032;
    L_0x001e:
        r16 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r26);
        r17 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r16);
        switch(r17) {
            case 1: goto L_0x0072;
            case 2: goto L_0x007c;
            case 3: goto L_0x0029;
            case 4: goto L_0x0086;
            case 5: goto L_0x0090;
            case 6: goto L_0x009a;
            case 7: goto L_0x00a4;
            case 8: goto L_0x00ae;
            case 9: goto L_0x0029;
            case 10: goto L_0x00b8;
            case 11: goto L_0x00c2;
            case 12: goto L_0x00cc;
            case 13: goto L_0x00d6;
            default: goto L_0x0029;
        };
    L_0x0029:
        r0 = r26;
        r1 = r16;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r1);	 Catch:{ zza -> 0x00e2 }
    L_0x0030:
        if (r18 == 0) goto L_0x0014;
    L_0x0032:
        r16 = r2;
        r20 = r4;
        r4 = r13;
        r13 = r6;
        r5 = r14;
        r14 = r20;
        r22 = r9;
        r9 = r10;
        r10 = r22;
        r23 = r11;
        r11 = r8;
        r8 = r23;
        r24 = r7;
        r7 = r12;
        r12 = r24;
        r2 = r26.dataPosition();	 Catch:{ zza -> 0x0070 }
        r0 = r19;
        if (r2 == r0) goto L_0x00e4;
    L_0x0052:
        r2 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0070 }
        r3 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0070 }
        r3.<init>();	 Catch:{ zza -> 0x0070 }
        r4 = "Overread allowed size end=";
        r3 = r3.append(r4);	 Catch:{ zza -> 0x0070 }
        r0 = r19;
        r3 = r3.append(r0);	 Catch:{ zza -> 0x0070 }
        r3 = r3.toString();	 Catch:{ zza -> 0x0070 }
        r0 = r26;
        r2.<init>(r3, r0);	 Catch:{ zza -> 0x0070 }
        throw r2;	 Catch:{ zza -> 0x0070 }
    L_0x0070:
        r2 = move-exception;
        throw r2;
    L_0x0072:
        r0 = r26;
        r1 = r16;
        r13 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x007c:
        r0 = r26;
        r1 = r16;
        r14 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x0086:
        r0 = r26;
        r1 = r16;
        r11 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x0090:
        r0 = r26;
        r1 = r16;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x009a:
        r0 = r26;
        r1 = r16;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x00a4:
        r0 = r26;
        r1 = r16;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x00ae:
        r0 = r26;
        r1 = r16;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x00b8:
        r0 = r26;
        r1 = r16;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x00c2:
        r0 = r26;
        r1 = r16;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x00cc:
        r0 = r26;
        r1 = r16;
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x00d6:
        r0 = r26;
        r1 = r16;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r1);
        if (r18 == 0) goto L_0x0030;
    L_0x00e0:
        goto L_0x0029;
    L_0x00e2:
        r2 = move-exception;
        throw r2;
    L_0x00e4:
        r3 = new com.google.android.gms.common.stats.ConnectionEvent;
        r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r16);
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;	 Catch:{ zza -> 0x00f3 }
        if (r2 == 0) goto L_0x00f2;
    L_0x00ed:
        if (r18 == 0) goto L_0x00f7;
    L_0x00ef:
        r2 = 0;
    L_0x00f0:
        com.google.android.gms.common.stats.zzd.a = r2;
    L_0x00f2:
        return r3;
    L_0x00f3:
        r2 = move-exception;
        throw r2;	 Catch:{ zza -> 0x00f5 }
    L_0x00f5:
        r2 = move-exception;
        throw r2;
    L_0x00f7:
        r2 = 1;
        goto L_0x00f0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.stats.zza.zzau(android.os.Parcel):com.google.android.gms.common.stats.ConnectionEvent");
    }

    public ConnectionEvent[] zzbT(int i) {
        return new ConnectionEvent[i];
    }
}
