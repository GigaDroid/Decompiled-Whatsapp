package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bl implements Creator {
    public Object[] newArray(int i) {
        return a(i);
    }

    public s a(Parcel parcel) {
        return new s(parcel, null);
    }

    bl() {
    }

    public s[] a(int i) {
        return new s[i];
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
