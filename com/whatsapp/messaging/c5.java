package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.VoipOptions.AudioRestrict;

final class c5 implements Parcelable {
    public static final Creator CREATOR;
    private final AudioRestrict a;

    private c5(Parcel parcel) {
        this.a = new AudioRestrict(parcel.readString(), (Integer) parcel.readValue(Integer.class.getClassLoader()));
    }

    c5(AudioRestrict audioRestrict, bq bqVar) {
        this(audioRestrict);
    }

    c5(Parcel parcel, bq bqVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new b2();
    }

    public AudioRestrict a() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.encoding);
        parcel.writeValue(this.a.rate);
    }

    private c5(AudioRestrict audioRestrict) {
        this.a = audioRestrict;
    }
}
