package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.Resend;

public final class y implements Parcelable {
    public static final Creator CREATOR;
    private final Resend a;

    private y(Parcel parcel) {
        this.a = new Resend((Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
    }

    public Resend a() {
        return this.a;
    }

    y(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    y(Resend resend, bq bqVar) {
        this(resend);
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new c9();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.packetLossThreshold);
        parcel.writeValue(this.a.bweThreshold);
        parcel.writeValue(this.a.maxBitrate);
        parcel.writeValue(this.a.delayPackets);
        parcel.writeValue(this.a.forceDtx);
        parcel.writeValue(this.a.dryRun);
    }

    private y(Resend resend) {
        this.a = resend;
    }
}
