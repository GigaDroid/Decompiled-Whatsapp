package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b implements Creator {
    public ci a(Parcel parcel) {
        return new ci(parcel, null);
    }

    public ci[] a(int i) {
        return new ci[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    b() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
