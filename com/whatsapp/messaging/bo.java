package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Decode;

final class bo implements Parcelable {
    public static final Creator CREATOR;
    private final Decode a;

    bo(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    bo(Decode decode, bq bqVar) {
        this(decode);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.gain);
        parcel.writeValue(this.a.forwardErrorCorrection);
        parcel.writeValue(this.a.plc);
    }

    private bo(Parcel parcel) {
        this.a = new Decode((Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()));
    }

    public int describeContents() {
        return 0;
    }

    private bo(Decode decode) {
        this.a = decode;
    }

    public Decode a() {
        return this.a;
    }

    static {
        CREATOR = new f();
    }
}
