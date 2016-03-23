package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zzb;

public class AmsEntityUpdateParcelable implements SafeParcelable, zzb {
    public static final Creator CREATOR;
    private final String mValue;
    final int mVersionCode;
    private byte zzaZu;
    private final byte zzaZv;

    static {
        CREATOR = new zze();
    }

    AmsEntityUpdateParcelable(int i, byte b, byte b2, String str) {
        this.zzaZu = b;
        this.mVersionCode = i;
        this.zzaZv = b2;
        this.mValue = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
        return this.zzaZu != amsEntityUpdateParcelable.zzaZu ? false : this.mVersionCode != amsEntityUpdateParcelable.mVersionCode ? false : this.zzaZv != amsEntityUpdateParcelable.zzaZv ? false : this.mValue.equals(amsEntityUpdateParcelable.mValue);
    }

    public String getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((((this.mVersionCode * 31) + this.zzaZu) * 31) + this.zzaZv) * 31) + this.mValue.hashCode();
    }

    public String toString() {
        return "AmsEntityUpdateParcelable{mVersionCode=" + this.mVersionCode + ", mEntityId=" + this.zzaZu + ", mAttributeId=" + this.zzaZv + ", mValue='" + this.mValue + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }

    public byte zzCu() {
        return this.zzaZu;
    }

    public byte zzCv() {
        return this.zzaZv;
    }
}
