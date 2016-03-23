package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class f implements Creator {
    f() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public bo[] a(int i) {
        return new bo[i];
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public bo a(Parcel parcel) {
        return new bo(parcel, null);
    }
}
