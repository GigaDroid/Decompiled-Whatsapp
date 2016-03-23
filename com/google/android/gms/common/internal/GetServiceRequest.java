package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzp.zza;
import java.util.Collection;

public class GetServiceRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int version;
    final int zzadn;
    int zzado;
    String zzadp;
    IBinder zzadq;
    Scope[] zzadr;
    Bundle zzads;
    Account zzadt;

    static {
        CREATOR = new zzi();
    }

    public GetServiceRequest(int i) {
        this.version = 2;
        this.zzado = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzadn = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    GetServiceRequest(int r2, int r3, int r4, java.lang.String r5, android.os.IBinder r6, com.google.android.gms.common.api.Scope[] r7, android.os.Bundle r8, android.accounts.Account r9) {
        /*
        r1 = this;
        r1.<init>();
        r1.version = r2;
        r1.zzadn = r3;
        r1.zzado = r4;
        r1.zzadp = r5;
        r0 = 2;
        if (r2 >= r0) goto L_0x0018;
    L_0x000e:
        r0 = r1.zzaG(r6);
        r1.zzadt = r0;
        r0 = com.google.android.gms.common.internal.zzx.a;
        if (r0 == 0) goto L_0x001c;
    L_0x0018:
        r1.zzadq = r6;
        r1.zzadt = r9;
    L_0x001c:
        r1.zzadr = r7;
        r1.zzads = r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GetServiceRequest.<init>(int, int, int, java.lang.String, android.os.IBinder, com.google.android.gms.common.api.Scope[], android.os.Bundle, android.accounts.Account):void");
    }

    private Account zzaG(IBinder iBinder) {
        return iBinder != null ? zza.zzb(zza.zzaH(iBinder)) : null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }

    public GetServiceRequest zzb(Account account) {
        this.zzadt = account;
        return this;
    }

    public GetServiceRequest zzc(zzp com_google_android_gms_common_internal_zzp) {
        if (com_google_android_gms_common_internal_zzp != null) {
            this.zzadq = com_google_android_gms_common_internal_zzp.asBinder();
        }
        return this;
    }

    public GetServiceRequest zzck(String str) {
        this.zzadp = str;
        return this;
    }

    public GetServiceRequest zzd(Collection collection) {
        this.zzadr = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public GetServiceRequest zzg(Bundle bundle) {
        this.zzads = bundle;
        return this;
    }
}
