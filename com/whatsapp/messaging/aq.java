package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.b4;

public final class aq implements Parcelable {
    public static final Creator CREATOR;
    private final b4 a;

    public int describeContents() {
        return 0;
    }

    aq(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    aq(b4 b4Var, bq bqVar) {
        this(b4Var);
    }

    private aq(Parcel parcel) {
        this.a = new b4((Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
    }

    private aq(b4 b4Var) {
        this.a = b4Var;
    }

    public b4 a() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.b);
        parcel.writeValue(this.a.a);
    }

    static {
        CREATOR = new x();
    }
}
