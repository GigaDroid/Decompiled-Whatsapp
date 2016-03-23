package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzd;
import com.google.android.gms.location.zzd.zza;

public class LocationRequestUpdateData implements SafeParcelable {
    public static final zzl CREATOR;
    PendingIntent mPendingIntent;
    private final int mVersionCode;
    int zzaCZ;
    LocationRequestInternal zzaDa;
    zzd zzaDb;
    zzc zzaDc;

    static {
        CREATOR = new zzl();
    }

    LocationRequestUpdateData(int i, int i2, LocationRequestInternal locationRequestInternal, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2) {
        zzc com_google_android_gms_location_zzc = null;
        this.mVersionCode = i;
        this.zzaCZ = i2;
        this.zzaDa = locationRequestInternal;
        this.zzaDb = iBinder == null ? null : zza.zzbX(iBinder);
        this.mPendingIntent = pendingIntent;
        if (iBinder2 != null) {
            com_google_android_gms_location_zzc = zzc.zza.zzbW(iBinder2);
        }
        this.zzaDc = com_google_android_gms_location_zzc;
    }

    public static LocationRequestUpdateData zza(zzc com_google_android_gms_location_zzc) {
        return new LocationRequestUpdateData(1, 2, null, null, null, com_google_android_gms_location_zzc.asBinder());
    }

    public static LocationRequestUpdateData zzb(LocationRequestInternal locationRequestInternal, zzd com_google_android_gms_location_zzd) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal, com_google_android_gms_location_zzd.asBinder(), null, null);
    }

    public static LocationRequestUpdateData zzb(zzd com_google_android_gms_location_zzd) {
        return new LocationRequestUpdateData(1, 2, null, com_google_android_gms_location_zzd.asBinder(), null, null);
    }

    public int describeContents() {
        return 0;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }

    IBinder zzvS() {
        return this.zzaDb == null ? null : this.zzaDb.asBinder();
    }

    IBinder zzvT() {
        return this.zzaDc == null ? null : this.zzaDc.asBinder();
    }
}
