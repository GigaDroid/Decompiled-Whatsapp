package com.whatsapp.gallerypicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class x implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public bw a(Parcel parcel) {
        return new bw(parcel, null);
    }

    public bw[] a(int i) {
        return new bw[i];
    }

    x() {
    }

    public Object[] newArray(int i) {
        return a(i);
    }
}
