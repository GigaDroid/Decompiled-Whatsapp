package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

public class NodeParcelable implements SafeParcelable, Node {
    public static final Creator CREATOR;
    final int mVersionCode;
    private final String zzahh;
    private final int zzbaO;
    private final boolean zzbaP;
    private final String zzwj;

    static {
        CREATOR = new zzbb();
    }

    NodeParcelable(int i, String str, String str2, int i2, boolean z) {
        this.mVersionCode = i;
        this.zzwj = str;
        this.zzahh = str2;
        this.zzbaO = i2;
        this.zzbaP = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof NodeParcelable) ? false : ((NodeParcelable) obj).zzwj.equals(this.zzwj);
    }

    public String getDisplayName() {
        return this.zzahh;
    }

    public int getHopCount() {
        return this.zzbaO;
    }

    public String getId() {
        return this.zzwj;
    }

    public int hashCode() {
        return this.zzwj.hashCode();
    }

    public boolean isNearby() {
        return this.zzbaP;
    }

    public String toString() {
        return "Node{" + this.zzahh + ", id=" + this.zzwj + ", hops=" + this.zzbaO + ", isNearby=" + this.zzbaP + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbb.zza(this, parcel, i);
    }
}
