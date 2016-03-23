package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

public class MessageEventParcelable implements SafeParcelable, MessageEvent {
    public static final Creator CREATOR;
    private final String mPath;
    final int mVersionCode;
    private final String zzaDI;
    private final int zzagq;
    private final byte[] zzayG;

    static {
        CREATOR = new zzaz();
    }

    MessageEventParcelable(int i, int i2, String str, byte[] bArr, String str2) {
        this.mVersionCode = i;
        this.zzagq = i2;
        this.mPath = str;
        this.zzayG = bArr;
        this.zzaDI = str2;
    }

    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.zzayG;
    }

    public String getPath() {
        return this.mPath;
    }

    public int getRequestId() {
        return this.zzagq;
    }

    public String getSourceNodeId() {
        return this.zzaDI;
    }

    public String toString() {
        return "MessageEventParcelable[" + this.zzagq + "," + this.mPath + ", size=" + (this.zzayG == null ? "null" : Integer.valueOf(this.zzayG.length)) + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzaz.zza(this, parcel, i);
    }
}
