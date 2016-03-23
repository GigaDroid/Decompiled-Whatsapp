package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetAllCapabilitiesResponse implements SafeParcelable {
    public static final Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    final List zzbar;

    static {
        CREATOR = new zzag();
    }

    GetAllCapabilitiesResponse(int i, int i2, List list) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbar = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzag.zza(this, parcel, i);
    }
}
