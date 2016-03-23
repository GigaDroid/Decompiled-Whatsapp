package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CheckServerAuthResult implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    final boolean zzaOk;
    final List zzaOl;

    static {
        CREATOR = new zzc();
    }

    CheckServerAuthResult(int i, boolean z, List list) {
        this.mVersionCode = i;
        this.zzaOk = z;
        this.zzaOl = list;
    }

    public CheckServerAuthResult(boolean z, Set set) {
        this(1, z, zze(set));
    }

    private static List zze(Set set) {
        return set == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(set));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
