package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AddListenerRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    public final zzav zzaZq;
    public final IntentFilter[] zzaZr;
    public final String zzaZs;
    public final String zzaZt;

    static {
        CREATOR = new zzb();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    AddListenerRequest(int r2, android.os.IBinder r3, android.content.IntentFilter[] r4, java.lang.String r5, java.lang.String r6) {
        /*
        r1 = this;
        r1.<init>();
        r1.mVersionCode = r2;
        if (r3 == 0) goto L_0x0011;
    L_0x0007:
        r0 = com.google.android.gms.wearable.internal.zzav.zza.zzdZ(r3);
        r1.zzaZq = r0;
        r0 = com.google.android.gms.wearable.internal.zzau.zza.a;
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r0 = 0;
        r1.zzaZq = r0;
    L_0x0014:
        r1.zzaZr = r4;
        r1.zzaZs = r5;
        r1.zzaZt = r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.AddListenerRequest.<init>(int, android.os.IBinder, android.content.IntentFilter[], java.lang.String, java.lang.String):void");
    }

    public AddListenerRequest(zzbo com_google_android_gms_wearable_internal_zzbo) {
        this.mVersionCode = 1;
        this.zzaZq = com_google_android_gms_wearable_internal_zzbo;
        this.zzaZr = com_google_android_gms_wearable_internal_zzbo.zzCJ();
        this.zzaZs = com_google_android_gms_wearable_internal_zzbo.zzCK();
        this.zzaZt = com_google_android_gms_wearable_internal_zzbo.zzCL();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    IBinder zzCt() {
        return this.zzaZq == null ? null : this.zzaZq.asBinder();
    }
}
