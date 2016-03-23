package com.whatsapp.util.undobar;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class g implements Creator {
    g() {
    }

    public f[] a(int i) {
        return new f[i];
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public f a(Parcel parcel) {
        return new f(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }
}
