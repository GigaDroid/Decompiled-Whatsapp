package com.whatsapp.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.bg;

final class m implements Creator {
    public n a(Parcel parcel) {
        bg bgVar = new bg();
        bgVar.b = parcel.readString();
        bgVar.c = parcel.readString();
        bgVar.a = parcel.readInt();
        return new n(bgVar);
    }

    public n[] a(int i) {
        return new n[i];
    }

    m() {
    }

    public Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public Object[] newArray(int i) {
        return a(i);
    }
}
