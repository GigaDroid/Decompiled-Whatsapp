package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LatLng implements SafeParcelable {
    public static final zze CREATOR;
    public static int a;
    public final double latitude;
    public final double longitude;
    private final int mVersionCode;

    static {
        CREATOR = new zze();
    }

    public LatLng(double d, double d2) {
        this(1, d, d2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    LatLng(int r7, double r8, double r10) {
        /*
        r6 = this;
        r4 = 4645040803167600640; // 0x4076800000000000 float:0.0 double:360.0;
        r2 = 4640537203540230144; // 0x4066800000000000 float:0.0 double:180.0;
        r6.<init>();
        r6.mVersionCode = r7;
        r0 = -4582834833314545664; // 0xc066800000000000 float:0.0 double:-180.0;
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 > 0) goto L_0x0022;
    L_0x0018:
        r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0022;
    L_0x001c:
        r6.longitude = r10;
        r0 = a;
        if (r0 == 0) goto L_0x002a;
    L_0x0022:
        r0 = r10 - r2;
        r0 = r0 % r4;
        r0 = r0 + r4;
        r0 = r0 % r4;
        r0 = r0 - r2;
        r6.longitude = r0;
    L_0x002a:
        r0 = -4587338432941916160; // 0xc056800000000000 float:0.0 double:-90.0;
        r2 = 4636033603912859648; // 0x4056800000000000 float:0.0 double:90.0;
        r2 = java.lang.Math.min(r2, r8);
        r0 = java.lang.Math.max(r0, r2);
        r6.latitude = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.LatLng.<init>(int, double, double):void");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(latLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(latLng.longitude);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
