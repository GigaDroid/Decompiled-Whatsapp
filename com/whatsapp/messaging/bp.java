package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.ct;

final class bp implements Parcelable {
    public static final Creator CREATOR;
    private final ct a;

    static {
        CREATOR = new bs();
    }

    public ct a() {
        return this.a;
    }

    private bp(Parcel parcel) {
        this.a = new ct();
        this.a.e = parcel.readString();
        this.a.a = parcel.readString();
        this.a.b = parcel.readString();
        this.a.c = parcel.readString();
        this.a.d = parcel.readString();
    }

    bp(Parcel parcel, bs bsVar) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.e);
        parcel.writeString(this.a.a);
        parcel.writeString(this.a.b);
        parcel.writeString(this.a.c);
        parcel.writeString(this.a.d);
    }

    public bp(ct ctVar) {
        this.a = ctVar;
    }

    public int describeContents() {
        return 0;
    }
}
