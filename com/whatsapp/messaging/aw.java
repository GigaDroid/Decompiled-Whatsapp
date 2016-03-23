package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.bz;

final class aw implements Parcelable {
    public static final Creator CREATOR;
    private final bz a;

    public aw(bz bzVar) {
        this.a = bzVar;
    }

    static {
        CREATOR = new bv();
    }

    public bz a() {
        return this.a;
    }

    public static aw[] a(bz[] bzVarArr) {
        int i = co.a;
        aw[] awVarArr = new aw[bzVarArr.length];
        int i2 = 0;
        while (i2 < bzVarArr.length) {
            awVarArr[i2] = new aw(bzVarArr[i2]);
            i2++;
            if (i != 0) {
                break;
            }
        }
        return awVarArr;
    }

    public static bz[] a(aw[] awVarArr) {
        int i = co.a;
        bz[] bzVarArr = new bz[awVarArr.length];
        int i2 = 0;
        while (i2 < awVarArr.length) {
            bzVarArr[i2] = awVarArr[i2].a();
            i2++;
            if (i != 0) {
                break;
            }
        }
        return bzVarArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.a);
        parcel.writeByteArray(this.a.c);
        parcel.writeByteArray(this.a.b);
    }

    public int describeContents() {
        return 0;
    }

    public aw(Parcel parcel) {
        this.a = new bz(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
    }
}
