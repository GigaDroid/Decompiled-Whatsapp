package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ai5 implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public aov a(Parcel parcel) {
        return new aov(parcel, null);
    }

    public aov[] a(int i) {
        return new aov[i];
    }

    ai5() {
    }
}
