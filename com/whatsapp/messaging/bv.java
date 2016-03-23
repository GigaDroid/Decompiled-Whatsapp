package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bv implements Creator {
    bv() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public aw[] a(int i) {
        return new aw[i];
    }

    public aw a(Parcel parcel) {
        return new aw(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }
}
