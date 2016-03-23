package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Creator {
    static void zza(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, getServiceRequest.version);
        zzb.zzc(parcel, 2, getServiceRequest.zzadn);
        zzb.zzc(parcel, 3, getServiceRequest.zzado);
        zzb.zza(parcel, 4, getServiceRequest.zzadp, false);
        zzb.zza(parcel, 5, getServiceRequest.zzadq, false);
        zzb.zza(parcel, 6, getServiceRequest.zzadr, i, false);
        zzb.zza(parcel, 7, getServiceRequest.zzads, false);
        zzb.zza(parcel, 8, getServiceRequest.zzadt, i, false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzae(parcel);
    }

    public Object[] newArray(int i) {
        return zzby(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.GetServiceRequest zzae(android.os.Parcel r17) {
        /*
        r16 = this;
        r9 = com.google.android.gms.common.internal.zzx.a;
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r17);
        r8 = 0;
        r7 = 0;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r1 = 0;
        r13 = r1;
        r1 = r3;
        r3 = r2;
        r2 = r13;
    L_0x0012:
        r11 = r17.dataPosition();
        if (r11 >= r10) goto L_0x00b8;
    L_0x0018:
        r11 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r17);
        r12 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r11);
        switch(r12) {
            case 1: goto L_0x005c;
            case 2: goto L_0x0064;
            case 3: goto L_0x006c;
            case 4: goto L_0x0074;
            case 5: goto L_0x007c;
            case 6: goto L_0x0084;
            case 7: goto L_0x0090;
            case 8: goto L_0x0098;
            default: goto L_0x0023;
        };
    L_0x0023:
        r0 = r17;
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r11);	 Catch:{ zza -> 0x00aa }
        r13 = r2;
        r2 = r3;
        r3 = r1;
        r1 = r13;
    L_0x002c:
        if (r9 == 0) goto L_0x00c2;
    L_0x002e:
        r9 = r1;
        r13 = r2;
        r2 = r8;
        r8 = r13;
        r14 = r4;
        r4 = r6;
        r6 = r14;
        r15 = r7;
        r7 = r3;
        r3 = r15;
    L_0x0038:
        r1 = r17.dataPosition();	 Catch:{ zza -> 0x005a }
        if (r1 == r10) goto L_0x00ac;
    L_0x003e:
        r1 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x005a }
        r2 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x005a }
        r2.<init>();	 Catch:{ zza -> 0x005a }
        r3 = "Overread allowed size end=";
        r2 = r2.append(r3);	 Catch:{ zza -> 0x005a }
        r2 = r2.append(r10);	 Catch:{ zza -> 0x005a }
        r2 = r2.toString();	 Catch:{ zza -> 0x005a }
        r0 = r17;
        r1.<init>(r2, r0);	 Catch:{ zza -> 0x005a }
        throw r1;	 Catch:{ zza -> 0x005a }
    L_0x005a:
        r1 = move-exception;
        throw r1;
    L_0x005c:
        r0 = r17;
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r11);
        if (r9 == 0) goto L_0x00b2;
    L_0x0064:
        r0 = r17;
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r11);
        if (r9 == 0) goto L_0x00b2;
    L_0x006c:
        r0 = r17;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r0, r11);
        if (r9 == 0) goto L_0x00b2;
    L_0x0074:
        r0 = r17;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r0, r11);
        if (r9 == 0) goto L_0x00b2;
    L_0x007c:
        r0 = r17;
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzp(r0, r11);
        if (r9 == 0) goto L_0x00b2;
    L_0x0084:
        r1 = com.google.android.gms.common.api.Scope.CREATOR;
        r0 = r17;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzb(r0, r11, r1);
        r1 = (com.google.android.gms.common.api.Scope[]) r1;
        if (r9 == 0) goto L_0x00b2;
    L_0x0090:
        r0 = r17;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzq(r0, r11);
        if (r9 == 0) goto L_0x00b2;
    L_0x0098:
        r2 = r1;
        r1 = android.accounts.Account.CREATOR;
        r0 = r17;
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zza(r0, r11, r1);
        r1 = (android.accounts.Account) r1;
        if (r9 == 0) goto L_0x00c8;
    L_0x00a5:
        r13 = r1;
        r1 = r2;
        r2 = r13;
        goto L_0x0023;
    L_0x00aa:
        r1 = move-exception;
        throw r1;
    L_0x00ac:
        r1 = new com.google.android.gms.common.internal.GetServiceRequest;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        return r1;
    L_0x00b2:
        r13 = r2;
        r2 = r3;
        r3 = r1;
        r1 = r13;
        goto L_0x002c;
    L_0x00b8:
        r9 = r2;
        r2 = r8;
        r8 = r3;
        r3 = r7;
        r7 = r1;
        r13 = r4;
        r4 = r6;
        r6 = r13;
        goto L_0x0038;
    L_0x00c2:
        r13 = r1;
        r1 = r3;
        r3 = r2;
        r2 = r13;
        goto L_0x0012;
    L_0x00c8:
        r13 = r3;
        r3 = r2;
        r2 = r13;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzi.zzae(android.os.Parcel):com.google.android.gms.common.internal.GetServiceRequest");
    }

    public GetServiceRequest[] zzby(int i) {
        return new GetServiceRequest[i];
    }
}
