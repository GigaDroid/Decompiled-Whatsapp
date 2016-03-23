package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b2 implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    b2() {
    }

    public c5[] a(int i) {
        return new c5[i];
    }

    public c5 a(Parcel parcel) {
        return new c5(parcel, null);
    }

    public Object[] newArray(int i) {
        return a(i);
    }
}
