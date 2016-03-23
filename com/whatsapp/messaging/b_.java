package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.ABTest;

public final class b_ implements Parcelable {
    public static final Creator CREATOR;
    private final ABTest a;

    private b_(ABTest aBTest) {
        this.a = aBTest;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name);
    }

    public ABTest a() {
        return this.a;
    }

    private b_(Parcel parcel) {
        this.a = new ABTest(parcel.readString());
    }

    static {
        CREATOR = new e();
    }

    public int describeContents() {
        return 0;
    }

    b_(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    b_(ABTest aBTest, bq bqVar) {
        this(aBTest);
    }
}
