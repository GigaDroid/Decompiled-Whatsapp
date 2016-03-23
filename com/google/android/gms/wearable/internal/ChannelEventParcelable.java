package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.v;
import org.whispersystems.at;

public final class ChannelEventParcelable implements SafeParcelable {
    public static final Creator CREATOR;
    final int mVersionCode;
    final int type;
    final int zzaZP;
    final int zzaZQ;
    final ChannelImpl zzaZR;

    static {
        CREATOR = new zzm();
    }

    ChannelEventParcelable(int i, ChannelImpl channelImpl, int i2, int i3, int i4) {
        this.mVersionCode = i;
        this.zzaZR = channelImpl;
        this.type = i2;
        this.zzaZP = i3;
        this.zzaZQ = i4;
    }

    private static String zzkB(int i) {
        switch (i) {
            case at.g /*1*/:
                return "CHANNEL_OPENED";
            case at.i /*2*/:
                return "CHANNEL_CLOSED";
            case at.o /*3*/:
                return "INPUT_CLOSED";
            case at.p /*4*/:
                return "OUTPUT_CLOSED";
            default:
                return Integer.toString(i);
        }
    }

    private static String zzkC(int i) {
        switch (i) {
            case v.m /*0*/:
                return "CLOSE_REASON_NORMAL";
            case at.g /*1*/:
                return "CLOSE_REASON_DISCONNECTED";
            case at.i /*2*/:
                return "CLOSE_REASON_REMOTE_CLOSE";
            case at.o /*3*/:
                return "CLOSE_REASON_LOCAL_CLOSE";
            default:
                return Integer.toString(i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ChannelEventParcelable[versionCode=" + this.mVersionCode + ", channel=" + this.zzaZR + ", type=" + zzkB(this.type) + ", closeReason=" + zzkC(this.zzaZP) + ", appErrorCode=" + this.zzaZQ + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zza(com.google.android.gms.wearable.ChannelApi.ChannelListener r5) {
        /*
        r4 = this;
        r0 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r1 = r4.type;
        switch(r1) {
            case 1: goto L_0x0024;
            case 2: goto L_0x002b;
            case 3: goto L_0x0036;
            case 4: goto L_0x0041;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = "ChannelEventParcelable";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unknown type: ";
        r1 = r1.append(r2);
        r2 = r4.type;
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
    L_0x0023:
        return;
    L_0x0024:
        r1 = r4.zzaZR;
        r5.onChannelOpened(r1);
        if (r0 == 0) goto L_0x0023;
    L_0x002b:
        r1 = r4.zzaZR;
        r2 = r4.zzaZP;
        r3 = r4.zzaZQ;
        r5.onChannelClosed(r1, r2, r3);
        if (r0 == 0) goto L_0x0023;
    L_0x0036:
        r1 = r4.zzaZR;
        r2 = r4.zzaZP;
        r3 = r4.zzaZQ;
        r5.onInputClosed(r1, r2, r3);
        if (r0 == 0) goto L_0x0023;
    L_0x0041:
        r1 = r4.zzaZR;
        r2 = r4.zzaZP;
        r3 = r4.zzaZQ;
        r5.onOutputClosed(r1, r2, r3);
        if (r0 == 0) goto L_0x0023;
    L_0x004c:
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.ChannelEventParcelable.zza(com.google.android.gms.wearable.ChannelApi$ChannelListener):void");
    }
}
