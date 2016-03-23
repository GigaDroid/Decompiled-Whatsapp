package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator {
    static void zza(DataHolder dataHolder, Parcel parcel, int i) {
        boolean z = false;
        boolean z2 = DataHolder.a;
        int zzak = zzb.zzak(parcel);
        try {
            zzb.zza(parcel, 1, dataHolder.zznU(), false);
            zzb.zzc(parcel, 1000, dataHolder.getVersionCode());
            zzb.zza(parcel, 2, dataHolder.zznV(), i, false);
            zzb.zzc(parcel, 3, dataHolder.getStatusCode());
            zzb.zza(parcel, 4, dataHolder.zznP(), false);
            zzb.zzH(parcel, zzak);
            if (zza.a != 0) {
                if (!z2) {
                    z = true;
                }
                DataHolder.a = z;
            }
        } catch (zza e) {
            throw e;
        } catch (zza e2) {
            throw e2;
        }
    }

    public Object createFromParcel(Parcel parcel) {
        return zzaa(parcel);
    }

    public Object[] newArray(int i) {
        return zzbq(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.data.DataHolder zzaa(android.os.Parcel r12) {
        /*
        r11 = this;
        r1 = 0;
        r0 = 0;
        r5 = com.google.android.gms.common.data.DataHolder.a;
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r12);
        r2 = r1;
        r3 = r0;
        r4 = r1;
        r1 = r0;
    L_0x000c:
        r7 = r12.dataPosition();
        if (r7 >= r6) goto L_0x0087;
    L_0x0012:
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r12);
        r8 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r7);
        switch(r8) {
            case 1: goto L_0x004f;
            case 2: goto L_0x0061;
            case 3: goto L_0x006b;
            case 4: goto L_0x0071;
            case 1000: goto L_0x005b;
            default: goto L_0x001d;
        };
    L_0x001d:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r12, r7);	 Catch:{ zza -> 0x007c }
        r9 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r9;
    L_0x0024:
        if (r5 == 0) goto L_0x008d;
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
        if (r0 == r6) goto L_0x007e;
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
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzA(r12, r7);
        if (r5 == 0) goto L_0x0077;
    L_0x0055:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zza.a;
        r4 = r4 + 1;
        com.google.android.gms.common.internal.safeparcel.zza.zza.a = r4;
    L_0x005b:
        r4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r12, r7);
        if (r5 == 0) goto L_0x0077;
    L_0x0061:
        r0 = android.database.CursorWindow.CREATOR;
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzb(r12, r7, r0);
        r0 = (android.database.CursorWindow[]) r0;
        if (r5 == 0) goto L_0x0077;
    L_0x006b:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r12, r7);
        if (r5 == 0) goto L_0x0077;
    L_0x0071:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zzq(r12, r7);
        if (r5 != 0) goto L_0x001d;
    L_0x0077:
        r9 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r9;
        goto L_0x0024;
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = new com.google.android.gms.common.data.DataHolder;
        r0.<init>(r1, r2, r3, r4, r5);
        r0.zznT();
        return r0;
    L_0x0087:
        r5 = r1;
        r1 = r4;
        r4 = r2;
        r2 = r3;
        r3 = r0;
        goto L_0x002d;
    L_0x008d:
        r9 = r0;
        r0 = r2;
        r2 = r1;
        r1 = r9;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.zze.zzaa(android.os.Parcel):com.google.android.gms.common.data.DataHolder");
    }

    public DataHolder[] zzbq(int i) {
        return new DataHolder[i];
    }
}
