package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.RateControl;

final class am implements Parcelable {
    public static final Creator CREATOR;
    private final RateControl a;

    am(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    private am(RateControl rateControl) {
        this.a = rateControl;
    }

    am(RateControl rateControl, bq bqVar) {
        this(rateControl);
    }

    static {
        CREATOR = new ce();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.disableRateControl);
        parcel.writeValue(this.a.framesPerPacket);
        parcel.writeValue(this.a.minRTT);
        parcel.writeValue(this.a.maxRTT);
        parcel.writeValue(this.a.initBitrate);
        parcel.writeValue(this.a.minFramesPerPacket);
        parcel.writeValue(this.a.maxFramesPerPacket);
        parcel.writeValue(this.a.maxFramesPerPacketDuration);
        parcel.writeValue(this.a.cellularBitrate);
        parcel.writeValue(this.a.pktSizeThresholdBitrate);
        parcel.writeValue(this.a.lowDataUsageBitrate);
        parcel.writeValue(this.a.maxrttRateIncrease);
        parcel.writeValue(this.a.initBitrateOnCellular);
        parcel.writeValue(this.a.maxrttBitrateCap);
        parcel.writeValue(this.a.maxBWE);
        parcel.writeValue(this.a.maxrttPauseOnRttIncrease);
        parcel.writeValue(this.a.earlyRtt);
        parcel.writeValue(this.a.sendEarlyBWE);
        parcel.writeValue(this.a.dtxRttThreshold);
        parcel.writeValue(this.a.dtxBweThreshold);
        parcel.writeValue(this.a.dtxWaitPeriod);
        parcel.writeValue(this.a.fppRttThreshold);
    }

    public RateControl a() {
        return this.a;
    }

    private am(Parcel parcel) {
        this.a = new RateControl((Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()));
    }
}
