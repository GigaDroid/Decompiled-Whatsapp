package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PendingCallback implements Parcelable {
    public static final Creator CREATOR;
    final IBinder zzacE;

    final class 1 implements Creator {
        1() {
        }

        public Object createFromParcel(Parcel parcel) {
            return zzei(parcel);
        }

        public Object[] newArray(int i) {
            return zzgu(i);
        }

        public PendingCallback zzei(Parcel parcel) {
            return new PendingCallback(parcel);
        }

        public PendingCallback[] zzgu(int i) {
            return new PendingCallback[i];
        }
    }

    static {
        CREATOR = new 1();
    }

    public PendingCallback(Parcel parcel) {
        this.zzacE = parcel.readStrongBinder();
    }

    public int describeContents() {
        return 0;
    }

    public IBinder getIBinder() {
        return this.zzacE;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zzacE);
    }
}
