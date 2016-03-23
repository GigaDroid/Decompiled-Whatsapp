package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class zzb {
    private static int zzF(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzG(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void zzH(Parcel parcel, int i) {
        zzG(parcel, i);
    }

    public static void zza(Parcel parcel, int i, byte b) {
        zzb(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void zza(Parcel parcel, int i, double d) {
        zzb(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void zza(Parcel parcel, int i, float f) {
        zzb(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void zza(Parcel parcel, int i, long j) {
        zzb(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void zza(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int zzF = zzF(parcel, i);
            parcel.writeBundle(bundle);
            zzG(parcel, zzF);
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    public static void zza(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int zzF = zzF(parcel, i);
            parcel.writeStrongBinder(iBinder);
            zzG(parcel, zzF);
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    public static void zza(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int zzF = zzF(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            zzG(parcel, zzF);
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    public static void zza(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            zzb(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    public static void zza(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int zzF = zzF(parcel, i);
            parcel.writeString(str);
            zzG(parcel, zzF);
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    public static void zza(Parcel parcel, int i, List list, boolean z) {
        boolean z2 = zza.a;
        if (list != null) {
            int zzF = zzF(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            int i2 = 0;
            while (i2 < size) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
                int i3 = i2 + 1;
                if (z2) {
                    break;
                }
                i2 = i3;
            }
            zzG(parcel, zzF);
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    public static void zza(Parcel parcel, int i, boolean z) {
        zzb(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void zza(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int zzF = zzF(parcel, i);
            parcel.writeByteArray(bArr);
            zzG(parcel, zzF);
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zza(android.os.Parcel r6, int r7, android.os.Parcelable[] r8, int r9, boolean r10) {
        /*
        r1 = 0;
        r2 = com.google.android.gms.common.internal.safeparcel.zza.a;
        if (r8 != 0) goto L_0x000b;
    L_0x0005:
        if (r10 == 0) goto L_0x000a;
    L_0x0007:
        zzb(r6, r7, r1);
    L_0x000a:
        return;
    L_0x000b:
        r3 = zzF(r6, r7);
        r4 = r8.length;
        r6.writeInt(r4);
        r0 = r1;
    L_0x0014:
        if (r0 >= r4) goto L_0x0026;
    L_0x0016:
        r5 = r8[r0];
        if (r5 != 0) goto L_0x001f;
    L_0x001a:
        r6.writeInt(r1);
        if (r2 == 0) goto L_0x0022;
    L_0x001f:
        zza(r6, r5, r9);
    L_0x0022:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0014;
    L_0x0026:
        zzG(r6, r3);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.zzb.zza(android.os.Parcel, int, android.os.Parcelable[], int, boolean):void");
    }

    public static void zza(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int zzF = zzF(parcel, i);
            parcel.writeStringArray(strArr);
            zzG(parcel, zzF);
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    private static void zza(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int zzak(Parcel parcel) {
        return zzF(parcel, 20293);
    }

    private static void zzb(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            if (!zza.a) {
                return;
            }
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static void zzb(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int zzF = zzF(parcel, i);
            parcel.writeStringList(list);
            zzG(parcel, zzF);
        } else if (z) {
            zzb(parcel, i, 0);
        }
    }

    public static void zzc(Parcel parcel, int i, int i2) {
        zzb(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzc(android.os.Parcel r6, int r7, java.util.List r8, boolean r9) {
        /*
        r2 = 0;
        r3 = com.google.android.gms.common.internal.safeparcel.zza.a;
        if (r8 != 0) goto L_0x000b;
    L_0x0005:
        if (r9 == 0) goto L_0x000a;
    L_0x0007:
        zzb(r6, r7, r2);
    L_0x000a:
        return;
    L_0x000b:
        r4 = zzF(r6, r7);
        r5 = r8.size();
        r6.writeInt(r5);
        r1 = r2;
    L_0x0017:
        if (r1 >= r5) goto L_0x002d;
    L_0x0019:
        r0 = r8.get(r1);
        r0 = (android.os.Parcelable) r0;
        if (r0 != 0) goto L_0x0026;
    L_0x0021:
        r6.writeInt(r2);
        if (r3 == 0) goto L_0x0029;
    L_0x0026:
        zza(r6, r0, r2);
    L_0x0029:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x0031;
    L_0x002d:
        zzG(r6, r4);
        goto L_0x000a;
    L_0x0031:
        r1 = r0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.zzb.zzc(android.os.Parcel, int, java.util.List, boolean):void");
    }
}
