package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;

public class ChannelImpl implements SafeParcelable, Channel {
    public static final Creator CREATOR;
    private final String mPath;
    final int mVersionCode;
    private final String zzaYR;
    private final String zzaZM;

    static {
        CREATOR = new zzn();
    }

    ChannelImpl(int i, String str, String str2, String str3) {
        this.mVersionCode = i;
        this.zzaZM = (String) zzx.zzv(str);
        this.zzaYR = (String) zzx.zzv(str2);
        this.mPath = (String) zzx.zzv(str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.zzaZM.equals(channelImpl.zzaZM) && zzw.equal(channelImpl.zzaYR, this.zzaYR) && zzw.equal(channelImpl.mPath, this.mPath) && channelImpl.mVersionCode == this.mVersionCode;
    }

    public String getNodeId() {
        return this.zzaYR;
    }

    public String getPath() {
        return this.mPath;
    }

    public String getToken() {
        return this.zzaZM;
    }

    public int hashCode() {
        return this.zzaZM.hashCode();
    }

    public String toString() {
        return "ChannelImpl{versionCode=" + this.mVersionCode + ", token='" + this.zzaZM + '\'' + ", nodeId='" + this.zzaYR + '\'' + ", path='" + this.mPath + '\'' + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }
}
