package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.wearable.internal.zzav.zza;

public class ConnectionConfiguration implements SafeParcelable {
    public static final Creator CREATOR;
    private final String mName;
    final int mVersionCode;
    private boolean zzOq;
    private final int zzUS;
    private final boolean zzaYO;
    private String zzaYP;
    private boolean zzaYQ;
    private String zzaYR;
    private final int zzahc;
    private final String zzanu;

    static {
        CREATOR = new zzg();
    }

    ConnectionConfiguration(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.mVersionCode = i;
        this.mName = str;
        this.zzanu = str2;
        this.zzUS = i2;
        this.zzahc = i3;
        this.zzaYO = z;
        this.zzOq = z2;
        this.zzaYP = str3;
        this.zzaYQ = z3;
        this.zzaYR = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return zzw.equal(Integer.valueOf(this.mVersionCode), Integer.valueOf(connectionConfiguration.mVersionCode)) && zzw.equal(this.mName, connectionConfiguration.mName) && zzw.equal(this.zzanu, connectionConfiguration.zzanu) && zzw.equal(Integer.valueOf(this.zzUS), Integer.valueOf(connectionConfiguration.zzUS)) && zzw.equal(Integer.valueOf(this.zzahc), Integer.valueOf(connectionConfiguration.zzahc)) && zzw.equal(Boolean.valueOf(this.zzaYO), Boolean.valueOf(connectionConfiguration.zzaYO)) && zzw.equal(Boolean.valueOf(this.zzaYQ), Boolean.valueOf(connectionConfiguration.zzaYQ));
    }

    public String getAddress() {
        return this.zzanu;
    }

    public String getName() {
        return this.mName;
    }

    public String getNodeId() {
        return this.zzaYR;
    }

    public int getRole() {
        return this.zzahc;
    }

    public int getType() {
        return this.zzUS;
    }

    public int hashCode() {
        return zzw.hashCode(new Object[]{Integer.valueOf(this.mVersionCode), this.mName, this.zzanu, Integer.valueOf(this.zzUS), Integer.valueOf(this.zzahc), Boolean.valueOf(this.zzaYO), Boolean.valueOf(this.zzaYQ)});
    }

    public boolean isConnected() {
        return this.zzOq;
    }

    public boolean isEnabled() {
        return this.zzaYO;
    }

    public String toString() {
        int i = WearableListenerService.a;
        StringBuilder stringBuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringBuilder.append("mName=" + this.mName);
        stringBuilder.append(", mAddress=" + this.zzanu);
        stringBuilder.append(", mType=" + this.zzUS);
        stringBuilder.append(", mRole=" + this.zzahc);
        stringBuilder.append(", mEnabled=" + this.zzaYO);
        stringBuilder.append(", mIsConnected=" + this.zzOq);
        stringBuilder.append(", mPeerNodeId=" + this.zzaYP);
        stringBuilder.append(", mBtlePriority=" + this.zzaYQ);
        stringBuilder.append(", mNodeId=" + this.zzaYR);
        stringBuilder.append("]");
        String stringBuilder2 = stringBuilder.toString();
        if (i != 0) {
            zza.a = !zza.a;
        }
        return stringBuilder2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }

    public String zzCp() {
        return this.zzaYP;
    }

    public boolean zzCq() {
        return this.zzaYQ;
    }
}
