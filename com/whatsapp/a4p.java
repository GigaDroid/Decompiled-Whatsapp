package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.c3;

public class a4p implements Parcelable {
    public static final Creator CREATOR;
    c3 a;

    public a4p(Parcel parcel) {
        boolean z = true;
        String readString = parcel.readString();
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.a = new c3(readString, z, parcel.readString());
    }

    static {
        CREATOR = new ac();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.a.c);
        if (this.a.a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        parcel.writeString(this.a.b);
    }

    public a4p(c3 c3Var) {
        this.a = c3Var;
    }
}
