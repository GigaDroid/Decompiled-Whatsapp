package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    private final long zzafj;
    private int zzafk;
    private final String zzafl;
    private final String zzafm;
    private final String zzafn;
    private final String zzafo;
    private final String zzafp;
    private final String zzafq;
    private final long zzafr;
    private final long zzafs;
    private long zzaft;

    static {
        CREATOR = new zza();
    }

    ConnectionEvent(int i, long j, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this.mVersionCode = i;
        this.zzafj = j;
        this.zzafk = i2;
        this.zzafl = str;
        this.zzafm = str2;
        this.zzafn = str3;
        this.zzafo = str4;
        this.zzaft = -1;
        this.zzafp = str5;
        this.zzafq = str6;
        this.zzafr = j2;
        this.zzafs = j3;
    }

    public ConnectionEvent(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this(1, j, i, str, str2, str3, str4, str5, str6, j2, j3);
    }

    public int describeContents() {
        return 0;
    }

    public int getEventType() {
        return this.zzafk;
    }

    public long getTimeMillis() {
        return this.zzafj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public String zzpA() {
        return this.zzafq;
    }

    public long zzpB() {
        return this.zzafs;
    }

    public long zzpC() {
        return this.zzafr;
    }

    public String zzpv() {
        return this.zzafl;
    }

    public String zzpw() {
        return this.zzafm;
    }

    public String zzpx() {
        return this.zzafn;
    }

    public String zzpy() {
        return this.zzafo;
    }

    public String zzpz() {
        return this.zzafp;
    }
}
