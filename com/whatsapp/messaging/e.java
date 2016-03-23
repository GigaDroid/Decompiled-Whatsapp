package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e implements Creator {
    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    e() {
    }

    public b_ a(Parcel parcel) {
        return new b_(parcel, null);
    }

    public b_[] a(int i) {
        return new b_[i];
    }
}
