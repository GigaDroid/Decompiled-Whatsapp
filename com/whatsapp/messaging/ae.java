package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Encode;

final class ae implements Parcelable {
    public static final Creator CREATOR;
    private final Encode a;

    static {
        CREATOR = new d();
    }

    ae(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    private ae(Parcel parcel) {
        this.a = new Encode((Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()));
    }

    ae(Encode encode, bq bqVar) {
        this(encode);
    }

    private ae(Encode encode) {
        this.a = encode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.complexity);
        parcel.writeValue(this.a.enableConstantBitrate);
        parcel.writeValue(this.a.enableDiscontinuousTransmission);
        parcel.writeValue(this.a.targetBitrate);
        parcel.writeValue(this.a.forwardErrorCorrection);
        parcel.writeValue(this.a.vadThreshold);
        parcel.writeValue(this.a.nonSpeechBitrate);
        parcel.writeValue(this.a.selectivelySkipNonSpeechFrames);
        parcel.writeValue(this.a.frameMs);
    }

    public Encode a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }
}
