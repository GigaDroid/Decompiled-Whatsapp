package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class Scope implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    private final String zzaaC;

    static {
        CREATOR = new zzm();
    }

    Scope(int i, String str) {
        zzx.zzh(str, "scopeUri must not be null or empty");
        this.mVersionCode = i;
        this.zzaaC = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.zzaaC.equals(((Scope) obj).zzaaC);
    }

    public int hashCode() {
        return this.zzaaC.hashCode();
    }

    public String toString() {
        return this.zzaaC;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    public String zznG() {
        return this.zzaaC;
    }
}
