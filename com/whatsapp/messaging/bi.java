package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bi implements Creator {
    public ay a(Parcel parcel) {
        return new ay(parcel, null);
    }

    public ay[] a(int i) {
        return new ay[i];
    }

    bi() {
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
