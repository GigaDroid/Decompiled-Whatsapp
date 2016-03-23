package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.zzau.zza;
import com.google.android.gms.wearable.zzd;

public class AncsNotificationParcelable implements SafeParcelable, zzd {
    public static final Creator CREATOR;
    private int mId;
    final int mVersionCode;
    private final String zzTZ;
    private final String zzaIs;
    private byte zzaZA;
    private final String zzaZw;
    private byte zzaZx;
    private byte zzaZy;
    private byte zzaZz;
    private final String zzagU;
    private String zzahh;
    private final String zzasq;

    static {
        CREATOR = new zzg();
    }

    AncsNotificationParcelable(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4) {
        this.mId = i2;
        this.mVersionCode = i;
        this.zzaIs = str;
        this.zzaZw = str2;
        this.zzTZ = str3;
        this.zzagU = str4;
        this.zzasq = str5;
        this.zzahh = str6;
        this.zzaZx = b;
        this.zzaZy = b2;
        this.zzaZz = b3;
        this.zzaZA = b4;
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
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        return this.zzaZA != ancsNotificationParcelable.zzaZA ? false : this.zzaZz != ancsNotificationParcelable.zzaZz ? false : this.zzaZy != ancsNotificationParcelable.zzaZy ? false : this.zzaZx != ancsNotificationParcelable.zzaZx ? false : this.mId != ancsNotificationParcelable.mId ? false : this.mVersionCode != ancsNotificationParcelable.mVersionCode ? false : !this.zzaIs.equals(ancsNotificationParcelable.zzaIs) ? false : (this.zzaZw == null ? ancsNotificationParcelable.zzaZw != null : !this.zzaZw.equals(ancsNotificationParcelable.zzaZw)) ? false : !this.zzahh.equals(ancsNotificationParcelable.zzahh) ? false : !this.zzTZ.equals(ancsNotificationParcelable.zzTZ) ? false : !this.zzasq.equals(ancsNotificationParcelable.zzasq) ? false : this.zzagU.equals(ancsNotificationParcelable.zzagU);
    }

    public String getDisplayName() {
        return this.zzahh == null ? this.zzaIs : this.zzahh;
    }

    public int getId() {
        return this.mId;
    }

    public String getTitle() {
        return this.zzagU;
    }

    public int hashCode() {
        boolean z = false;
        int hashCode = (((((((((((((((((this.zzaZw != null ? this.zzaZw.hashCode() : 0) + (((((this.mVersionCode * 31) + this.mId) * 31) + this.zzaIs.hashCode()) * 31)) * 31) + this.zzTZ.hashCode()) * 31) + this.zzagU.hashCode()) * 31) + this.zzasq.hashCode()) * 31) + this.zzahh.hashCode()) * 31) + this.zzaZx) * 31) + this.zzaZy) * 31) + this.zzaZz) * 31) + this.zzaZA;
        if (zza.a) {
            if (!zzav.zza.a) {
                z = true;
            }
            zzav.zza.a = z;
        }
        return hashCode;
    }

    public String toString() {
        boolean z = zza.a;
        String str = "AncsNotificationParcelable{mVersionCode=" + this.mVersionCode + ", mId=" + this.mId + ", mAppId='" + this.zzaIs + '\'' + ", mDateTime='" + this.zzaZw + '\'' + ", mNotificationText='" + this.zzTZ + '\'' + ", mTitle='" + this.zzagU + '\'' + ", mSubtitle='" + this.zzasq + '\'' + ", mDisplayName='" + this.zzahh + '\'' + ", mEventId=" + this.zzaZx + ", mEventFlags=" + this.zzaZy + ", mCategoryId=" + this.zzaZz + ", mCategoryCount=" + this.zzaZA + '}';
        if (zzav.zza.a) {
            zza.a = !z;
        }
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }

    public byte zzCA() {
        return this.zzaZz;
    }

    public byte zzCB() {
        return this.zzaZA;
    }

    public String zzCw() {
        return this.zzaZw;
    }

    public String zzCx() {
        return this.zzTZ;
    }

    public byte zzCy() {
        return this.zzaZx;
    }

    public byte zzCz() {
        return this.zzaZy;
    }

    public String zztW() {
        return this.zzaIs;
    }

    public String zztn() {
        return this.zzasq;
    }
}
