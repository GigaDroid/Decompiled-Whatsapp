package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CopresenceApiOptions implements SafeParcelable {
    public static final Creator CREATOR;
    public static boolean a;
    public static final CopresenceApiOptions zzaCp;
    final int mVersionCode;
    public final boolean zzaCq;
    public final String zzaCr;

    static {
        CREATOR = new zza();
        zzaCp = new CopresenceApiOptions(true, null);
    }

    CopresenceApiOptions(int i, boolean z, String str) {
        this.mVersionCode = i;
        this.zzaCq = z;
        this.zzaCr = str;
    }

    public CopresenceApiOptions(boolean z, String str) {
        this(1, z, str);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
