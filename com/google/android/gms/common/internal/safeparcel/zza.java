package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class zza {
    public static boolean a;

    public class zza extends RuntimeException {
        public static int a;

        public zza(String str, Parcel parcel) {
            boolean z = zza.a;
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
            if (a != 0) {
                zza.a = !z;
            }
        }
    }

    public static String[] zzA(Parcel parcel, int i) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(zza + dataPosition);
        return createStringArray;
    }

    public static ArrayList zzB(Parcel parcel, int i) {
        boolean z = a;
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        int i2 = 0;
        while (i2 < readInt) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
            i2++;
            if (z) {
                break;
            }
        }
        parcel.setDataPosition(dataPosition + zza);
        return arrayList;
    }

    public static ArrayList zzC(Parcel parcel, int i) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(zza + dataPosition);
        return createStringArrayList;
    }

    public static int zza(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static Parcelable zza(Parcel parcel, int i, Creator creator) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(zza + dataPosition);
        return parcelable;
    }

    private static void zza(Parcel parcel, int i, int i2) {
        int zza = zza(parcel, i);
        if (zza != i2) {
            try {
                throw new zza("Expected size " + i2 + " got " + zza + " (0x" + Integer.toHexString(zza) + ")", parcel);
            } catch (zza e) {
                throw e;
            }
        }
    }

    private static void zza(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            try {
                throw new zza("Expected size " + i3 + " got " + i2 + " (0x" + Integer.toHexString(i2) + ")", parcel);
            } catch (zza e) {
                throw e;
            }
        }
    }

    public static int zzai(Parcel parcel) {
        return parcel.readInt();
    }

    public static int zzaj(Parcel parcel) {
        boolean z = a;
        int zzai = zzai(parcel);
        int zza = zza(parcel, zzai);
        int dataPosition = parcel.dataPosition();
        try {
            if (zzbH(zzai) != 20293) {
                throw new zza("Expected object header. Got 0x" + Integer.toHexString(zzai), parcel);
            }
            zzai = dataPosition + zza;
            if (zzai >= dataPosition) {
                try {
                    if (zzai <= parcel.dataSize()) {
                        if (z) {
                            zza.a++;
                        }
                        return zzai;
                    }
                } catch (zza e) {
                    throw e;
                }
            }
            throw new zza("Size read is invalid start=" + dataPosition + " end=" + zzai, parcel);
        } catch (zza e2) {
            throw e2;
        }
    }

    public static void zzb(Parcel parcel, int i) {
        parcel.setDataPosition(zza(parcel, i) + parcel.dataPosition());
    }

    public static Object[] zzb(Parcel parcel, int i, Creator creator) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(zza + dataPosition);
        return createTypedArray;
    }

    public static int zzbH(int i) {
        return 65535 & i;
    }

    public static ArrayList zzc(Parcel parcel, int i, Creator creator) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(zza + dataPosition);
        return createTypedArrayList;
    }

    public static boolean zzc(Parcel parcel, int i) {
        try {
            zza(parcel, i, 4);
            return parcel.readInt() != 0;
        } catch (zza e) {
            throw e;
        }
    }

    public static byte zze(Parcel parcel, int i) {
        zza(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static int zzg(Parcel parcel, int i) {
        zza(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer zzh(Parcel parcel, int i) {
        int zza = zza(parcel, i);
        if (zza == 0) {
            return null;
        }
        zza(parcel, i, zza, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long zzi(Parcel parcel, int i) {
        zza(parcel, i, 8);
        return parcel.readLong();
    }

    public static float zzl(Parcel parcel, int i) {
        zza(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double zzm(Parcel parcel, int i) {
        zza(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String zzo(Parcel parcel, int i) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(zza + dataPosition);
        return readString;
    }

    public static IBinder zzp(Parcel parcel, int i) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(zza + dataPosition);
        return readStrongBinder;
    }

    public static Bundle zzq(Parcel parcel, int i) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(zza + dataPosition);
        return readBundle;
    }

    public static byte[] zzr(Parcel parcel, int i) {
        int zza = zza(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (zza == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(zza + dataPosition);
        return createByteArray;
    }
}
