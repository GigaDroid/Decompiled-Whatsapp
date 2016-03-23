package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BinderWrapper implements Parcelable {
    public static final Creator CREATOR;
    private IBinder zzacE;

    final class 1 implements Creator {
        1() {
        }

        public Object createFromParcel(Parcel parcel) {
            return zzad(parcel);
        }

        public Object[] newArray(int i) {
            return zzbx(i);
        }

        public BinderWrapper zzad(Parcel parcel) {
            return new BinderWrapper(parcel, null);
        }

        public BinderWrapper[] zzbx(int i) {
            return new BinderWrapper[i];
        }
    }

    static {
        CREATOR = new 1();
    }

    public BinderWrapper() {
        this.zzacE = null;
    }

    public BinderWrapper(IBinder iBinder) {
        this.zzacE = null;
        this.zzacE = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.zzacE = null;
        this.zzacE = parcel.readStrongBinder();
    }

    BinderWrapper(Parcel parcel, 1 1) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zzacE);
    }
}
