package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.NoiseSuppression;

final class ac implements Parcelable {
    public static final Creator CREATOR;
    private final NoiseSuppression a;

    ac(NoiseSuppression noiseSuppression, bq bqVar) {
        this(noiseSuppression);
    }

    public int describeContents() {
        return 0;
    }

    private ac(NoiseSuppression noiseSuppression) {
        this.a = noiseSuppression;
    }

    private ac(Parcel parcel) {
        this.a = new NoiseSuppression((Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()));
    }

    static {
        CREATOR = new ax();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.mode);
        parcel.writeValue(this.a.builtinEnabled);
        parcel.writeValue(this.a.suppressThreshold);
    }

    ac(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    public NoiseSuppression a() {
        return this.a;
    }
}
