package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValidateAccountRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    final IBinder zzacC;
    private final Scope[] zzacD;
    private final int zzaeq;
    private final Bundle zzaer;
    private final String zzaes;

    static {
        CREATOR = new zzad();
    }

    ValidateAccountRequest(int i, int i2, IBinder iBinder, Scope[] scopeArr, Bundle bundle, String str) {
        this.mVersionCode = i;
        this.zzaeq = i2;
        this.zzacC = iBinder;
        this.zzacD = scopeArr;
        this.zzaer = bundle;
        this.zzaes = str;
    }

    public ValidateAccountRequest(zzp com_google_android_gms_common_internal_zzp, Scope[] scopeArr, String str, Bundle bundle) {
        this(1, GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE, com_google_android_gms_common_internal_zzp == null ? null : com_google_android_gms_common_internal_zzp.asBinder(), scopeArr, bundle, str);
    }

    public int describeContents() {
        return 0;
    }

    public String getCallingPackage() {
        return this.zzaes;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzad.zza(this, parcel, i);
    }

    public int zzoS() {
        return this.zzaeq;
    }

    public Scope[] zzoT() {
        return this.zzacD;
    }

    public Bundle zzoU() {
        return this.zzaer;
    }
}
