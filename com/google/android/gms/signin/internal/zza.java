package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Creator {
    static void zza(AuthAccountResult authAccountResult, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, authAccountResult.mVersionCode);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzgj(parcel);
    }

    public Object[] newArray(int i) {
        return zziY(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.signin.internal.AuthAccountResult zzgj(android.os.Parcel r6) {
        /*
        r5 = this;
        r1 = com.google.android.gms.signin.internal.zze.zza.a;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r6);
        r0 = 0;
    L_0x0007:
        r3 = r6.dataPosition();
        if (r3 >= r2) goto L_0x001d;
    L_0x000d:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r6);
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r3);
        switch(r4) {
            case 1: goto L_0x003f;
            default: goto L_0x0018;
        };
    L_0x0018:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r6, r3);	 Catch:{ zza -> 0x0046 }
    L_0x001b:
        if (r1 == 0) goto L_0x0007;
    L_0x001d:
        r1 = r6.dataPosition();	 Catch:{ zza -> 0x003d }
        if (r1 == r2) goto L_0x0048;
    L_0x0023:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x003d }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x003d }
        r1.<init>();	 Catch:{ zza -> 0x003d }
        r3 = "Overread allowed size end=";
        r1 = r1.append(r3);	 Catch:{ zza -> 0x003d }
        r1 = r1.append(r2);	 Catch:{ zza -> 0x003d }
        r1 = r1.toString();	 Catch:{ zza -> 0x003d }
        r0.<init>(r1, r6);	 Catch:{ zza -> 0x003d }
        throw r0;	 Catch:{ zza -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r6, r3);
        if (r1 == 0) goto L_0x001b;
    L_0x0045:
        goto L_0x0018;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r1 = new com.google.android.gms.signin.internal.AuthAccountResult;
        r1.<init>(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.zza.zzgj(android.os.Parcel):com.google.android.gms.signin.internal.AuthAccountResult");
    }

    public AuthAccountResult[] zziY(int i) {
        return new AuthAccountResult[i];
    }
}
