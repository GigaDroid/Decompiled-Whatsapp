package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.LocationServices.zza;
import com.google.android.gms.location.internal.zzb;
import com.whatsapp.arj;

public final class LocationRequest implements SafeParcelable {
    public static final LocationRequestCreator CREATOR;
    int mPriority;
    private final int mVersionCode;
    long zzaBB;
    long zzaBW;
    long zzaBX;
    int zzaBY;
    float zzaBZ;
    long zzaCa;
    boolean zzaqs;

    static {
        CREATOR = new LocationRequestCreator();
    }

    public LocationRequest() {
        this.mVersionCode = 1;
        this.mPriority = arj.Theme_checkboxStyle;
        this.zzaBW = 3600000;
        this.zzaBX = 600000;
        this.zzaqs = false;
        this.zzaBB = Long.MAX_VALUE;
        this.zzaBY = Integer.MAX_VALUE;
        this.zzaBZ = 0.0f;
        this.zzaCa = 0;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f, long j4) {
        this.mVersionCode = i;
        this.mPriority = i2;
        this.zzaBW = j;
        this.zzaBX = j2;
        this.zzaqs = z;
        this.zzaBB = j3;
        this.zzaBY = i3;
        this.zzaBZ = f;
        this.zzaCa = j4;
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    private static void zzK(long j) {
        if (j < 0) {
            try {
                throw new IllegalArgumentException("invalid interval: " + j);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private static void zzd(float f) {
        if (f < 0.0f) {
            try {
                throw new IllegalArgumentException("invalid displacement: " + f);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private static void zzgG(int i) {
        switch (i) {
            case arj.Theme_buttonStyle /*100*/:
            case arj.Theme_checkboxStyle /*102*/:
            case arj.Theme_editTextStyle /*104*/:
            case arj.Theme_radioButtonStyle /*105*/:
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    public static String zzgH(int i) {
        switch (i) {
            case arj.Theme_buttonStyle /*100*/:
                try {
                    return "PRIORITY_HIGH_ACCURACY";
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case arj.Theme_checkboxStyle /*102*/:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case arj.Theme_editTextStyle /*104*/:
                return "PRIORITY_LOW_POWER";
            case arj.Theme_radioButtonStyle /*105*/:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof LocationRequest)) {
                return false;
            }
            LocationRequest locationRequest = (LocationRequest) obj;
            try {
                if (this.mPriority == locationRequest.mPriority) {
                    if (this.zzaBW == locationRequest.zzaBW) {
                        try {
                            if (this.zzaBX == locationRequest.zzaBX) {
                                try {
                                    if (this.zzaqs == locationRequest.zzaqs) {
                                        try {
                                            if (this.zzaBB == locationRequest.zzaBB) {
                                                try {
                                                    if (this.zzaBY == locationRequest.zzaBY) {
                                                        try {
                                                            if (this.zzaBZ == locationRequest.zzaBZ) {
                                                                return true;
                                                            }
                                                        } catch (IllegalArgumentException e) {
                                                            throw e;
                                                        }
                                                    }
                                                } catch (IllegalArgumentException e2) {
                                                    throw e2;
                                                }
                                            }
                                        } catch (IllegalArgumentException e22) {
                                            throw e22;
                                        }
                                    }
                                } catch (IllegalArgumentException e222) {
                                    throw e222;
                                }
                            }
                        } catch (IllegalArgumentException e2222) {
                            throw e2222;
                        }
                    }
                }
                return false;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        }
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzw.hashCode(new Object[]{Integer.valueOf(this.mPriority), Long.valueOf(this.zzaBW), Long.valueOf(this.zzaBX), Boolean.valueOf(this.zzaqs), Long.valueOf(this.zzaBB), Integer.valueOf(this.zzaBY), Float.valueOf(this.zzaBZ)});
    }

    public LocationRequest setFastestInterval(long j) {
        zzK(j);
        this.zzaqs = true;
        this.zzaBX = j;
        return this;
    }

    public LocationRequest setInterval(long j) {
        try {
            zzK(j);
            this.zzaBW = j;
            if (!this.zzaqs) {
                this.zzaBX = (long) (((double) this.zzaBW) / 6.0d);
            }
            return this;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public LocationRequest setPriority(int i) {
        zzgG(i);
        this.mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        zzd(f);
        this.zzaBZ = f;
        return this;
    }

    public String toString() {
        int i = zza.a;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("Request[").append(zzgH(this.mPriority));
            if (this.mPriority != arj.Theme_radioButtonStyle) {
                stringBuilder.append(" requested=");
                stringBuilder.append(this.zzaBW + "ms");
            }
            try {
                stringBuilder.append(" fastest=");
                stringBuilder.append(this.zzaBX + "ms");
                if (this.zzaCa > this.zzaBW) {
                    stringBuilder.append(" maxWait=");
                    stringBuilder.append(this.zzaCa + "ms");
                }
                if (this.zzaBB != Long.MAX_VALUE) {
                    long elapsedRealtime = this.zzaBB - SystemClock.elapsedRealtime();
                    stringBuilder.append(" expireIn=");
                    stringBuilder.append(elapsedRealtime + "ms");
                }
                try {
                    if (this.zzaBY != Integer.MAX_VALUE) {
                        stringBuilder.append(" num=").append(this.zzaBY);
                    }
                    try {
                        stringBuilder.append(']');
                        String stringBuilder2 = stringBuilder.toString();
                        if (i != 0) {
                            zzb.a = !zzb.a;
                        }
                        return stringBuilder2;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        LocationRequestCreator.zza(this, parcel, i);
    }
}
