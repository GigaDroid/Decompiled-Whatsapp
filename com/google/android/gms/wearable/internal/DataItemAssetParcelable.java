package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.DataItemAsset;

public class DataItemAssetParcelable implements SafeParcelable, DataItemAsset {
    public static final Creator CREATOR;
    final int mVersionCode;
    private final String zztP;
    private final String zzwj;

    static {
        CREATOR = new zzaa();
    }

    DataItemAssetParcelable(int i, String str, String str2) {
        this.mVersionCode = i;
        this.zzwj = str;
        this.zztP = str2;
    }

    public DataItemAssetParcelable(DataItemAsset dataItemAsset) {
        this.mVersionCode = 1;
        this.zzwj = (String) zzx.zzv(dataItemAsset.getId());
        this.zztP = (String) zzx.zzv(dataItemAsset.getDataItemKey());
    }

    public int describeContents() {
        return 0;
    }

    public String getDataItemKey() {
        return this.zztP;
    }

    public String getId() {
        return this.zzwj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r2 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "DataItemAssetParcelable[";
        r0.append(r1);
        r1 = "@";
        r0.append(r1);
        r1 = r2.hashCode();
        r1 = java.lang.Integer.toHexString(r1);
        r0.append(r1);
        r1 = r2.zzwj;
        if (r1 != 0) goto L_0x002a;
    L_0x0020:
        r1 = ",noid";
        r0.append(r1);
        r1 = com.google.android.gms.wearable.internal.zzau.zza.a;
        if (r1 == 0) goto L_0x0035;
    L_0x002a:
        r1 = ",";
        r0.append(r1);
        r1 = r2.zzwj;
        r0.append(r1);
    L_0x0035:
        r1 = ", key=";
        r0.append(r1);
        r1 = r2.zztP;
        r0.append(r1);
        r1 = "]";
        r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.DataItemAssetParcelable.toString():java.lang.String");
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaa.zza(this, parcel, i);
    }
}
