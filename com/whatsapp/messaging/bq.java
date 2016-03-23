package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bq implements Creator {
    public bj[] a(int i) {
        return new bj[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    bq() {
    }

    public bj a(Parcel parcel) {
        return new bj(parcel, null);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
