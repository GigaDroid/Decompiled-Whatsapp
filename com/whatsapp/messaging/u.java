package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Aec;

final class u implements Parcelable {
    public static final Creator CREATOR;
    private final Aec a;

    u(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    private u(Aec aec) {
        this.a = aec;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.algorithm);
        parcel.writeValue(this.a.offset);
        parcel.writeValue(this.a.length);
        parcel.writeValue(this.a.mode);
        parcel.writeValue(this.a.echoDetectorImpl);
        parcel.writeValue(this.a.echoDetectorMode);
        parcel.writeValue(this.a.ecThreshold);
        parcel.writeValue(this.a.ecOffThreshold);
        parcel.writeValue(this.a.strengthThreshold);
        parcel.writeValue(this.a.builtinEnabled);
        parcel.writeValue(this.a.disableSwEcWhenBuiltinAvailable);
        parcel.writeValue(this.a.toneDetectorEnabled);
        parcel.writeValue(this.a.disableAgc);
        parcel.writeValue(this.a.useCleanCapture);
        parcel.writeValue(this.a.aecmDynamicQ);
        parcel.writeValue(this.a.aecmAdaptStepSize);
        parcel.writeValue(this.a.aecmSupgainScale);
        parcel.writeValue(this.a.aecmDataWidth);
    }

    public Aec a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new bh();
    }

    private u(Parcel parcel) {
        this.a = new Aec(parcel.readString(), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()));
    }

    u(Aec aec, bq bqVar) {
        this(aec);
    }
}
