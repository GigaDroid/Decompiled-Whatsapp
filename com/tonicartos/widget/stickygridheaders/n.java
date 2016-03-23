package com.tonicartos.widget.stickygridheaders;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class n implements Creator {
    public Object[] newArray(int i) {
        return a(i);
    }

    public c[] a(int i) {
        return new c[i];
    }

    n() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public c a(Parcel parcel) {
        return new c(parcel, null);
    }
}
