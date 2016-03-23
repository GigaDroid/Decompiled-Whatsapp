package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzp.zza;

public class ResolveAccountResponse implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    private boolean zzZF;
    private ConnectionResult zzaaV;
    IBinder zzacC;
    private boolean zzaen;

    static {
        CREATOR = new zzz();
    }

    public ResolveAccountResponse(int i) {
        this(new ConnectionResult(i, null));
    }

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.mVersionCode = i;
        this.zzacC = iBinder;
        this.zzaaV = connectionResult;
        this.zzZF = z;
        this.zzaen = z2;
    }

    public ResolveAccountResponse(ConnectionResult connectionResult) {
        this(1, null, connectionResult, false, false);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.zzaaV.equals(resolveAccountResponse.zzaaV) && zzoO().equals(resolveAccountResponse.zzoO());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzz.zza(this, parcel, i);
    }

    public zzp zzoO() {
        return zza.zzaH(this.zzacC);
    }

    public ConnectionResult zzoP() {
        return this.zzaaV;
    }

    public boolean zzoQ() {
        return this.zzZF;
    }

    public boolean zzoR() {
        return this.zzaen;
    }
}
