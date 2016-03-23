package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class x implements Creator {
    public aq a(Parcel parcel) {
        return new aq(parcel, null);
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    x() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public aq[] a(int i) {
        return new aq[i];
    }
}
