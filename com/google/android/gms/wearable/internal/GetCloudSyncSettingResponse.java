package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCloudSyncSettingResponse implements SafeParcelable {
    public static final Creator CREATOR;
    public final boolean enabled;
    public final int statusCode;
    public final int versionCode;

    static {
        CREATOR = new zzam();
    }

    GetCloudSyncSettingResponse(int i, int i2, boolean z) {
        this.versionCode = i;
        this.statusCode = i2;
        this.enabled = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzam.zza(this, parcel, i);
    }
}
