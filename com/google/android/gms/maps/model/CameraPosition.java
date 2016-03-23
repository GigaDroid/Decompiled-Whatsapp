package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public final class CameraPosition implements SafeParcelable {
    public static final zza CREATOR;
    public final float bearing;
    private final int mVersionCode;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public final class Builder {
        private LatLng zzaGP;
        private float zzaGQ;
        private float zzaGR;
        private float zzaGS;

        public Builder bearing(float f) {
            this.zzaGS = f;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.zzaGP, this.zzaGQ, this.zzaGR, this.zzaGS);
        }

        public Builder target(LatLng latLng) {
            this.zzaGP = latLng;
            return this;
        }

        public Builder tilt(float f) {
            this.zzaGR = f;
            return this;
        }

        public Builder zoom(float f) {
            this.zzaGQ = f;
            return this;
        }
    }

    static {
        CREATOR = new zza();
    }

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        zzx.zzb((Object) latLng, (Object) "null camera target");
        boolean z = 0.0f <= f2 && f2 <= 90.0f;
        zzx.zzb(z, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[]{Float.valueOf(f2)});
        this.mVersionCode = i;
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.bearing = f3 % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, c.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(c.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(c.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(c.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(c.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        Builder builder = builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(c.MapAttrs_cameraZoom)) {
            builder.zoom(obtainAttributes.getFloat(c.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(c.MapAttrs_cameraBearing)) {
            builder.bearing(obtainAttributes.getFloat(c.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(c.MapAttrs_cameraTilt)) {
            builder.tilt(obtainAttributes.getFloat(c.MapAttrs_cameraTilt, 0.0f));
        }
        return builder.build();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzw.hashCode(new Object[]{this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public String toString() {
        return zzw.zzu(this).zzg("target", this.target).zzg("zoom", Float.valueOf(this.zoom)).zzg("tilt", Float.valueOf(this.tilt)).zzg("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
