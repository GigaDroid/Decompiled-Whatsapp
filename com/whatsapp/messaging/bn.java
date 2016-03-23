package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bn implements Creator {
    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    bn() {
    }

    public b8 a(Parcel parcel) {
        return new b8(parcel, null);
    }

    public b8[] a(int i) {
        return new b8[i];
    }
}
