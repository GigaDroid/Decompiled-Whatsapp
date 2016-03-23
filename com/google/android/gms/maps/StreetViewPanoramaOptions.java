package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class StreetViewPanoramaOptions implements SafeParcelable {
    public static final zzb CREATOR;
    private final int mVersionCode;
    private Boolean zzaFJ;
    private Boolean zzaFP;
    private Boolean zzaGA;
    private Boolean zzaGB;
    private StreetViewPanoramaCamera zzaGv;
    private String zzaGw;
    private LatLng zzaGx;
    private Integer zzaGy;
    private Boolean zzaGz;

    static {
        CREATOR = new zzb();
    }

    public StreetViewPanoramaOptions() {
        this.zzaGz = Boolean.valueOf(true);
        this.zzaFP = Boolean.valueOf(true);
        this.zzaGA = Boolean.valueOf(true);
        this.zzaGB = Boolean.valueOf(true);
        this.mVersionCode = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.zzaGz = Boolean.valueOf(true);
        this.zzaFP = Boolean.valueOf(true);
        this.zzaGA = Boolean.valueOf(true);
        this.zzaGB = Boolean.valueOf(true);
        this.mVersionCode = i;
        this.zzaGv = streetViewPanoramaCamera;
        this.zzaGx = latLng;
        this.zzaGy = num;
        this.zzaGw = str;
        this.zzaGz = zza.zza(b);
        this.zzaFP = zza.zza(b2);
        this.zzaGA = zza.zza(b3);
        this.zzaGB = zza.zza(b4);
        this.zzaFJ = zza.zza(b5);
    }

    public int describeContents() {
        return 0;
    }

    public String getPanoramaId() {
        return this.zzaGw;
    }

    public LatLng getPosition() {
        return this.zzaGx;
    }

    public Integer getRadius() {
        return this.zzaGy;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zzaGv;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    byte zzwF() {
        return zza.zze(this.zzaFJ);
    }

    byte zzwJ() {
        return zza.zze(this.zzaFP);
    }

    byte zzwT() {
        return zza.zze(this.zzaGz);
    }

    byte zzwU() {
        return zza.zze(this.zzaGA);
    }

    byte zzwV() {
        return zza.zze(this.zzaGB);
    }
}
