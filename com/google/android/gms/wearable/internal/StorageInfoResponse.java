package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class StorageInfoResponse implements SafeParcelable {
    public static final Creator CREATOR;
    public final int statusCode;
    public final int versionCode;
    public final long zzbaQ;
    public final List zzbaS;

    static {
        CREATOR = new zzbk();
    }

    StorageInfoResponse(int i, int i2, long j, List list) {
        this.versionCode = i;
        this.statusCode = i2;
        this.zzbaQ = j;
        this.zzbaS = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbk.zza(this, parcel, i);
    }
}
