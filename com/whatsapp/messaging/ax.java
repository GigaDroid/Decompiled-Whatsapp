package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ax implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    ax() {
    }

    public ac[] a(int i) {
        return new ac[i];
    }

    public ac a(Parcel parcel) {
        return new ac(parcel, null);
    }
}
