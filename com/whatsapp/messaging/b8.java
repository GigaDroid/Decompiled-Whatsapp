package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.RelayElection;

final class b8 implements Parcelable {
    public static final Creator CREATOR;
    private final RelayElection a;

    b8(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    b8(RelayElection relayElection, bq bqVar) {
        this(relayElection);
    }

    private b8(Parcel parcel) {
        this.a = new RelayElection((Short) parcel.readValue(Short.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()), (Short) parcel.readValue(Short.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()), (Integer) parcel.readValue(Integer.class.getClassLoader()));
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new bn();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a.mode);
        parcel.writeValue(this.a.timestampSource);
        parcel.writeValue(this.a.pingCalcMode);
        parcel.writeValue(this.a.pingInterval);
        parcel.writeValue(this.a.pingRounds);
        parcel.writeValue(this.a.pingUpdateInterval);
        parcel.writeValue(this.a.p2pRequestTimeout);
    }

    private b8(RelayElection relayElection) {
        this.a = relayElection;
    }

    public RelayElection a() {
        return this.a;
    }
}
