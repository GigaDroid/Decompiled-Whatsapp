package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class d implements Creator {
    public ae[] a(int i) {
        return new ae[i];
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    d() {
    }

    public ae a(Parcel parcel) {
        return new ae(parcel, null);
    }

    public Object[] newArray(int i) {
        return a(i);
    }
}
