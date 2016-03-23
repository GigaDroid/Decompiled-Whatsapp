package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bh implements Creator {
    public u[] a(int i) {
        return new u[i];
    }

    bh() {
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public u a(Parcel parcel) {
        return new u(parcel, null);
    }
}
