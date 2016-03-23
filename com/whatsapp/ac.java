package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ac implements Creator {
    ac() {
    }

    public a4p[] a(int i) {
        return new a4p[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public a4p a(Parcel parcel) {
        return new a4p(parcel);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
