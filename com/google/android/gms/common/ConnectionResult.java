package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class ConnectionResult implements SafeParcelable {
    public static final Creator CREATOR;
    public static final ConnectionResult zzYi;
    private final PendingIntent mPendingIntent;
    final int mVersionCode;
    private final int zzWu;

    static {
        zzYi = new ConnectionResult(0, null);
        CREATOR = new zzb();
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent) {
        this.mVersionCode = i;
        this.zzWu = i2;
        this.mPendingIntent = pendingIntent;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent);
    }

    static String getStatusString(int i) {
        switch (i) {
            case v.m /*0*/:
                return "SUCCESS";
            case at.g /*1*/:
                return "SERVICE_MISSING";
            case at.i /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case at.o /*3*/:
                return "SERVICE_DISABLED";
            case at.p /*4*/:
                return "SIGN_IN_REQUIRED";
            case at.m /*5*/:
                return "INVALID_ACCOUNT";
            case Y.f /*6*/:
                return "RESOLUTION_REQUIRED";
            case aF.v /*7*/:
                return "NETWORK_ERROR";
            case aF.u /*8*/:
                return "INTERNAL_ERROR";
            case Y.l /*9*/:
                return "SERVICE_INVALID";
            case Y.t /*10*/:
                return "DEVELOPER_ERROR";
            case Y.j /*11*/:
                return "LICENSE_CHECK_FAILED";
            case Y.q /*13*/:
                return "CANCELED";
            case arj.Toolbar_titleMarginEnd /*14*/:
                return "TIMEOUT";
            case arj.Toolbar_titleMarginTop /*15*/:
                return "INTERRUPTED";
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                return "API_UNAVAILABLE";
            case arj.Toolbar_maxButtonHeight /*17*/:
                return "SIGN_IN_FAILED";
            case arj.Toolbar_collapseIcon /*18*/:
                return "SERVICE_UPDATING";
            default:
                return "UNKNOWN_ERROR_CODE(" + i + ")";
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.zzWu == connectionResult.zzWu && zzw.equal(this.mPendingIntent, connectionResult.mPendingIntent);
    }

    public int getErrorCode() {
        return this.zzWu;
    }

    public PendingIntent getResolution() {
        return this.mPendingIntent;
    }

    public boolean hasResolution() {
        return (this.zzWu == 0 || this.mPendingIntent == null) ? false : true;
    }

    public int hashCode() {
        return zzw.hashCode(new Object[]{Integer.valueOf(this.zzWu), this.mPendingIntent});
    }

    public boolean isSuccess() {
        return this.zzWu == 0;
    }

    public void startResolutionForResult(Activity activity, int i) {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public String toString() {
        return zzw.zzu(this).zzg("statusCode", getStatusString(this.zzWu)).zzg("resolution", this.mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
