package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Creator {
    static void zza(AncsNotificationParcelable ancsNotificationParcelable, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, ancsNotificationParcelable.mVersionCode);
        zzb.zzc(parcel, 2, ancsNotificationParcelable.getId());
        zzb.zza(parcel, 3, ancsNotificationParcelable.zztW(), false);
        zzb.zza(parcel, 4, ancsNotificationParcelable.zzCw(), false);
        zzb.zza(parcel, 5, ancsNotificationParcelable.zzCx(), false);
        zzb.zza(parcel, 6, ancsNotificationParcelable.getTitle(), false);
        zzb.zza(parcel, 7, ancsNotificationParcelable.zztn(), false);
        zzb.zza(parcel, 8, ancsNotificationParcelable.getDisplayName(), false);
        zzb.zza(parcel, 9, ancsNotificationParcelable.zzCy());
        zzb.zza(parcel, 10, ancsNotificationParcelable.zzCz());
        zzb.zza(parcel, 11, ancsNotificationParcelable.zzCA());
        zzb.zza(parcel, 12, ancsNotificationParcelable.zzCB());
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhr(parcel);
    }

    public Object[] newArray(int i) {
        return zzkz(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.AncsNotificationParcelable zzhr(android.os.Parcel r22) {
        /*
        r21 = this;
        r13 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r14 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r22);
        r12 = 0;
        r8 = 0;
        r7 = 0;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r1 = 0;
        r17 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r12;
        r12 = r17;
    L_0x001e:
        r15 = r22.dataPosition();
        if (r15 >= r14) goto L_0x0141;
    L_0x0024:
        r15 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r22);
        r16 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r15);
        switch(r16) {
            case 1: goto L_0x007e;
            case 2: goto L_0x0086;
            case 3: goto L_0x008e;
            case 4: goto L_0x0096;
            case 5: goto L_0x009e;
            case 6: goto L_0x00a6;
            case 7: goto L_0x00ae;
            case 8: goto L_0x00b6;
            case 9: goto L_0x00be;
            case 10: goto L_0x011a;
            case 11: goto L_0x0127;
            case 12: goto L_0x0134;
            default: goto L_0x002f;
        };
    L_0x002f:
        r0 = r22;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r15);	 Catch:{ zza -> 0x0104 }
        r17 = r12;
        r12 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r17;
    L_0x0040:
        if (r13 == 0) goto L_0x0157;
    L_0x0042:
        r13 = r1;
        r17 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r2;
        r2 = r12;
        r12 = r17;
        r18 = r4;
        r4 = r7;
        r7 = r18;
        r19 = r6;
        r6 = r5;
        r5 = r19;
        r20 = r8;
        r8 = r3;
        r3 = r20;
    L_0x005a:
        r1 = r22.dataPosition();	 Catch:{ zza -> 0x007c }
        if (r1 == r14) goto L_0x0106;
    L_0x0060:
        r1 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x007c }
        r2 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x007c }
        r2.<init>();	 Catch:{ zza -> 0x007c }
        r3 = "Overread allowed size end=";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x007c }
        r2 = r2.append(r14);	 Catch:{ zza -> 0x007c }
        r2 = r2.toString();	 Catch:{ zza -> 0x007c }
        r0 = r22;
        r1.<init>(r2, r0);	 Catch:{ zza -> 0x007c }
        throw r1;	 Catch:{ zza -> 0x007c }
    L_0x007c:
        r1 = move-exception;
        throw r1;
    L_0x007e:
        r0 = r22;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x0086:
        r0 = r22;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x008e:
        r0 = r22;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x0096:
        r0 = r22;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x009e:
        r0 = r22;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x00a6:
        r0 = r22;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x00ae:
        r0 = r22;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x00b6:
        r0 = r22;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x00be:
        r0 = r22;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r15);
        if (r13 == 0) goto L_0x010c;
    L_0x00c6:
        r17 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r17;
    L_0x00d2:
        r0 = r22;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r15);
        if (r13 == 0) goto L_0x0175;
    L_0x00da:
        r17 = r10;
        r10 = r9;
        r9 = r1;
        r1 = r17;
    L_0x00e0:
        r0 = r22;
        r11 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r15);
        if (r13 == 0) goto L_0x016d;
    L_0x00e8:
        r17 = r11;
        r11 = r10;
        r10 = r1;
        r1 = r17;
    L_0x00ee:
        r0 = r22;
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zze(r0, r15);
        if (r13 == 0) goto L_0x0165;
    L_0x00f6:
        r17 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r11;
        r11 = r17;
        goto L_0x002f;
    L_0x0104:
        r1 = move-exception;
        throw r1;
    L_0x0106:
        r1 = new com.google.android.gms.wearable.internal.AncsNotificationParcelable;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
        return r1;
    L_0x010c:
        r17 = r12;
        r12 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r17;
        goto L_0x0040;
    L_0x011a:
        r17 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r17;
        goto L_0x00d2;
    L_0x0127:
        r17 = r10;
        r10 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r17;
        goto L_0x00e0;
    L_0x0134:
        r17 = r11;
        r11 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r17;
        goto L_0x00ee;
    L_0x0141:
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r1;
        r17 = r2;
        r2 = r8;
        r8 = r17;
        r18 = r4;
        r4 = r6;
        r6 = r18;
        r19 = r7;
        r7 = r3;
        r3 = r19;
        goto L_0x005a;
    L_0x0157:
        r17 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r12;
        r12 = r17;
        goto L_0x001e;
    L_0x0165:
        r17 = r12;
        r12 = r11;
        r11 = r1;
        r1 = r17;
        goto L_0x0040;
    L_0x016d:
        r17 = r12;
        r12 = r10;
        r10 = r1;
        r1 = r17;
        goto L_0x0040;
    L_0x0175:
        r17 = r12;
        r12 = r9;
        r9 = r1;
        r1 = r17;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzg.zzhr(android.os.Parcel):com.google.android.gms.wearable.internal.AncsNotificationParcelable");
    }

    public AncsNotificationParcelable[] zzkz(int i) {
        return new AncsNotificationParcelable[i];
    }
}
