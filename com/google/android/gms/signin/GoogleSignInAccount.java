package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class GoogleSignInAccount implements SafeParcelable {
    public static final Creator CREATOR;
    final int versionCode;
    private String zzRn;
    private String zzaNX;
    private Uri zzaNY;
    private String zzahh;
    private String zzwj;

    static {
        CREATOR = new zza();
    }

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri) {
        this.versionCode = i;
        this.zzwj = zzx.zzcs(str);
        this.zzRn = str2;
        this.zzaNX = str3;
        this.zzahh = str4;
        this.zzaNY = uri;
    }

    public int describeContents() {
        return 0;
    }

    public String getDisplayName() {
        return this.zzahh;
    }

    public String getEmail() {
        return this.zzaNX;
    }

    public String getId() {
        return this.zzwj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public String zzlv() {
        return this.zzRn;
    }

    public Uri zzzm() {
        return this.zzaNY;
    }
}
