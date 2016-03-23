package com.whatsapp.observablelistview;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class i implements Creator {
    public f[] a(int i) {
        return new f[i];
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    i() {
    }

    public Object[] newArray(int i) {
        return a(i);
    }

    public f a(Parcel parcel) {
        return new f(parcel, null);
    }
}
