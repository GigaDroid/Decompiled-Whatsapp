package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    private final Account zzOY;
    private final int zzaem;

    static {
        CREATOR = new zzy();
    }

    ResolveAccountRequest(int i, Account account, int i2) {
        this.mVersionCode = i;
        this.zzOY = account;
        this.zzaem = i2;
    }

    public ResolveAccountRequest(Account account, int i) {
        this(1, account, i);
    }

    public int describeContents() {
        return 0;
    }

    public Account getAccount() {
        return this.zzOY;
    }

    public int getSessionId() {
        return this.zzaem;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzy.zza(this, parcel, i);
    }
}
