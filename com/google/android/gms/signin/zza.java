package com.google.android.gms.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Creator {
    static void zza(GoogleSignInAccount googleSignInAccount, Parcel parcel, int i) {
        boolean z = zze.a;
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, googleSignInAccount.versionCode);
        zzb.zza(parcel, 2, googleSignInAccount.getId(), false);
        zzb.zza(parcel, 3, googleSignInAccount.zzlv(), false);
        zzb.zza(parcel, 4, googleSignInAccount.getEmail(), false);
        zzb.zza(parcel, 5, googleSignInAccount.getDisplayName(), false);
        zzb.zza(parcel, 6, googleSignInAccount.zzzm(), i, false);
        zzb.zzH(parcel, zzak);
        if (z) {
            com.google.android.gms.common.internal.safeparcel.zza.zza.a++;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzgi(parcel);
    }

    public Object[] newArray(int i) {
        return zziX(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.signin.GoogleSignInAccount zzgi(android.os.Parcel r14) {
        /*
        r13 = this;
        r7 = 0;
        r0 = 0;
        r8 = com.google.android.gms.signin.zze.a;
        r9 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r14);
        r1 = r0;
        r2 = r0;
        r3 = r0;
        r4 = r0;
        r5 = r7;
    L_0x000d:
        r6 = r14.dataPosition();
        if (r6 >= r9) goto L_0x0023;
    L_0x0013:
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r14);
        r10 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r6);
        switch(r10) {
            case 1: goto L_0x004c;
            case 2: goto L_0x0052;
            case 3: goto L_0x0058;
            case 4: goto L_0x005e;
            case 5: goto L_0x0064;
            case 6: goto L_0x006a;
            default: goto L_0x001e;
        };
    L_0x001e:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r14, r6);	 Catch:{ zza -> 0x0075 }
    L_0x0021:
        if (r8 == 0) goto L_0x000d;
    L_0x0023:
        r6 = r0;
        r11 = r1;
        r1 = r5;
        r5 = r11;
        r12 = r4;
        r4 = r2;
        r2 = r12;
        r0 = r14.dataPosition();	 Catch:{ zza -> 0x004a }
        if (r0 == r9) goto L_0x0077;
    L_0x0030:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x004a }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x004a }
        r1.<init>();	 Catch:{ zza -> 0x004a }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x004a }
        r1 = r1.append(r9);	 Catch:{ zza -> 0x004a }
        r1 = r1.toString();	 Catch:{ zza -> 0x004a }
        r0.<init>(r1, r14);	 Catch:{ zza -> 0x004a }
        throw r0;	 Catch:{ zza -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r14, r6);
        if (r8 == 0) goto L_0x0021;
    L_0x0052:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r14, r6);
        if (r8 == 0) goto L_0x0021;
    L_0x0058:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r14, r6);
        if (r8 == 0) goto L_0x0021;
    L_0x005e:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r14, r6);
        if (r8 == 0) goto L_0x0021;
    L_0x0064:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r14, r6);
        if (r8 == 0) goto L_0x0021;
    L_0x006a:
        r0 = android.net.Uri.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zza(r14, r6, r0);
        r0 = (android.net.Uri) r0;
        if (r8 == 0) goto L_0x0021;
    L_0x0074:
        goto L_0x001e;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = new com.google.android.gms.signin.GoogleSignInAccount;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;	 Catch:{ zza -> 0x0085 }
        if (r1 == 0) goto L_0x0084;
    L_0x0080:
        if (r8 == 0) goto L_0x0089;
    L_0x0082:
        com.google.android.gms.signin.zze.a = r7;
    L_0x0084:
        return r0;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ zza -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r7 = 1;
        goto L_0x0082;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.zza.zzgi(android.os.Parcel):com.google.android.gms.signin.GoogleSignInAccount");
    }

    public GoogleSignInAccount[] zziX(int i) {
        return new GoogleSignInAccount[i];
    }
}
