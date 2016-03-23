package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable implements SafeParcelable, CapabilityInfo {
    public static final Creator CREATOR;
    private final String mName;
    final int mVersionCode;
    private Set zzaZG;
    private final List zzaZJ;
    private final Object zzpc;

    static {
        CREATOR = new zzj();
    }

    CapabilityInfoParcelable(int i, String str, List list) {
        this.zzpc = new Object();
        this.mVersionCode = i;
        this.mName = str;
        this.zzaZJ = list;
        this.zzaZG = null;
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
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        if (this.mVersionCode != capabilityInfoParcelable.mVersionCode) {
            return false;
        }
        if (this.mName == null ? capabilityInfoParcelable.mName != null : !this.mName.equals(capabilityInfoParcelable.mName)) {
            return false;
        }
        if (this.zzaZJ != null) {
            if (this.zzaZJ.equals(capabilityInfoParcelable.zzaZJ)) {
                return true;
            }
        } else if (capabilityInfoParcelable.zzaZJ == null) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.mName != null ? this.mName.hashCode() : 0) + (this.mVersionCode * 31)) * 31;
        if (this.zzaZJ != null) {
            i = this.zzaZJ.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CapabilityInfo{" + this.mName + ", " + this.zzaZJ + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }

    public List zzCC() {
        return this.zzaZJ;
    }
}
