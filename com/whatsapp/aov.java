package com.whatsapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class aov extends BaseSavedState {
    public static final Creator CREATOR;
    int a;

    static {
        CREATOR = new ai5();
    }

    public aov(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    private aov(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    aov(Parcel parcel, a56 com_whatsapp_a56) {
        this(parcel);
    }
}
