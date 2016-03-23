package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bs implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public bp a(Parcel parcel) {
        return new bp(parcel, null);
    }

    bs() {
    }

    public bp[] a(int i) {
        return new bp[i];
    }
}
