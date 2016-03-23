package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Agc;

final class s implements Parcelable {
    public static final Creator CREATOR;
    private final Agc a;

    private s(Parcel parcel) {
        this.a = new Agc((Short) parcel.readValue(Short.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()));
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new bl();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.targetLevel);
        parcel.writeValue(this.a.compressionGain);
        parcel.writeValue(this.a.enableLimiter);
        parcel.writeValue(this.a.mode);
        parcel.writeValue(this.a.builtinEnabled);
        parcel.writeValue(this.a.strengthThreshold);
    }

    s(Agc agc, bq bqVar) {
        this(agc);
    }

    s(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    private s(Agc agc) {
        this.a = agc;
    }

    public Agc a() {
        return this.a;
    }
}
