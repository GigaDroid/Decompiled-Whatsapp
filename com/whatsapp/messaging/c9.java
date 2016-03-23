package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class c9 implements Creator {
    public Object[] newArray(int i) {
        return a(i);
    }

    c9() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public y a(Parcel parcel) {
        return new y(parcel, null);
    }

    public y[] a(int i) {
        return new y[i];
    }
}
