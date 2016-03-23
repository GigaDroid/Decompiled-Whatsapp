package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.BandwidthEstimator;

final class ci implements Parcelable {
    public static final Creator CREATOR;
    private final BandwidthEstimator a;

    public int describeContents() {
        return 0;
    }

    ci(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    static {
        CREATOR = new b();
    }

    private ci(BandwidthEstimator bandwidthEstimator) {
        this.a = bandwidthEstimator;
    }

    private ci(Parcel parcel) {
        this.a = new BandwidthEstimator((Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()));
    }

    ci(BandwidthEstimator bandwidthEstimator, bq bqVar) {
        this(bandwidthEstimator);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.maxUnknownOnRateIncrease);
        parcel.writeValue(this.a.useAudioPacketRate);
        parcel.writeValue(this.a.resetRccOnBweReset);
        parcel.writeValue(this.a.resetOudTimestampOnBweReset);
        parcel.writeValue(this.a.actionOnRtpMarker);
    }

    public BandwidthEstimator a() {
        return this.a;
    }
}
