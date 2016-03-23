package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationServices.zza;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult implements SafeParcelable {
    public static final Creator CREATOR;
    static final List zzaCb;
    private final int mVersionCode;
    private final List zzaCc;

    static {
        zzaCb = Collections.emptyList();
        CREATOR = new zze();
    }

    LocationResult(int i, List list) {
        this.mVersionCode = i;
        this.zzaCc = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i = zza.a;
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.zzaCc.size() != this.zzaCc.size()) {
            return false;
        }
        Iterator it = this.zzaCc.iterator();
        for (Location time : locationResult.zzaCc) {
            if (((Location) it.next()).getTime() == time.getTime()) {
                if (i != 0) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public List getLocations() {
        return this.zzaCc;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        int i = zza.a;
        int i2 = 17;
        for (Location time : this.zzaCc) {
            long time2 = time.getTime();
            int i3 = ((int) (time2 ^ (time2 >>> 32))) + (i2 * 31);
            if (i != 0) {
                return i3;
            }
            i2 = i3;
        }
        return i2;
    }

    public String toString() {
        return "LocationResult[locations: " + this.zzaCc + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
