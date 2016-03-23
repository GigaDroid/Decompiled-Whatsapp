package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.zzav.zza;

public class RemoveListenerRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    public final zzav zzaZq;

    static {
        CREATOR = new zzbf();
    }

    RemoveListenerRequest(int i, IBinder iBinder) {
        this.mVersionCode = i;
        if (iBinder != null) {
            this.zzaZq = zza.zzdZ(iBinder);
            if (!zzau.zza.a) {
                return;
            }
        }
        this.zzaZq = null;
    }

    public RemoveListenerRequest(zzav com_google_android_gms_wearable_internal_zzav) {
        this.mVersionCode = 1;
        this.zzaZq = com_google_android_gms_wearable_internal_zzav;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbf.zza(this, parcel, i);
    }

    IBinder zzCt() {
        return this.zzaZq == null ? null : this.zzaZq.asBinder();
    }
}
