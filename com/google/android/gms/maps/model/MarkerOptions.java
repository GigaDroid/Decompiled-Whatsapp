package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.maps.GoogleMap;

public final class MarkerOptions implements SafeParcelable {
    public static final zzf CREATOR;
    private float mAlpha;
    private final int mVersionCode;
    private LatLng zzaGx;
    private boolean zzaHa;
    private float zzaHi;
    private float zzaHj;
    private String zzaHr;
    private BitmapDescriptor zzaHs;
    private boolean zzaHt;
    private boolean zzaHu;
    private float zzaHv;
    private float zzaHw;
    private float zzaHx;
    private String zzagU;

    static {
        CREATOR = new zzf();
    }

    public MarkerOptions() {
        this.zzaHi = 0.5f;
        this.zzaHj = 1.0f;
        this.zzaHa = true;
        this.zzaHu = false;
        this.zzaHv = 0.0f;
        this.zzaHw = 0.5f;
        this.zzaHx = 0.0f;
        this.mAlpha = 1.0f;
        this.mVersionCode = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6) {
        int i2 = LatLng.a;
        this.zzaHi = 0.5f;
        this.zzaHj = 1.0f;
        this.zzaHa = true;
        this.zzaHu = false;
        this.zzaHv = 0.0f;
        this.zzaHw = 0.5f;
        this.zzaHx = 0.0f;
        this.mAlpha = 1.0f;
        this.mVersionCode = i;
        this.zzaGx = latLng;
        this.zzagU = str;
        this.zzaHr = str2;
        this.zzaHs = iBinder == null ? null : new BitmapDescriptor(zza.zzbk(iBinder));
        this.zzaHi = f;
        this.zzaHj = f2;
        this.zzaHt = z;
        this.zzaHa = z2;
        this.zzaHu = z3;
        this.zzaHv = f3;
        this.zzaHw = f4;
        this.zzaHx = f5;
        this.mAlpha = f6;
        if (GoogleMap.a != 0) {
            LatLng.a = i2 + 1;
        }
    }

    public MarkerOptions anchor(float f, float f2) {
        this.zzaHi = f;
        this.zzaHj = f2;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public float getAnchorU() {
        return this.zzaHi;
    }

    public float getAnchorV() {
        return this.zzaHj;
    }

    public float getInfoWindowAnchorU() {
        return this.zzaHw;
    }

    public float getInfoWindowAnchorV() {
        return this.zzaHx;
    }

    public LatLng getPosition() {
        return this.zzaGx;
    }

    public float getRotation() {
        return this.zzaHv;
    }

    public String getSnippet() {
        return this.zzaHr;
    }

    public String getTitle() {
        return this.zzagU;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.zzaHs = bitmapDescriptor;
        return this;
    }

    public boolean isDraggable() {
        return this.zzaHt;
    }

    public boolean isFlat() {
        return this.zzaHu;
    }

    public boolean isVisible() {
        return this.zzaHa;
    }

    public MarkerOptions position(LatLng latLng) {
        this.zzaGx = latLng;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.zzaHr = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.zzagU = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    IBinder zzxd() {
        return this.zzaHs == null ? null : this.zzaHs.zzwB().asBinder();
    }
}
