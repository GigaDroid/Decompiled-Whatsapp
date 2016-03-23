package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

public abstract class zzc {
    protected final DataHolder zzYX;
    protected int zzabg;
    private int zzabh;

    public zzc(DataHolder dataHolder, int i) {
        this.zzYX = (DataHolder) zzx.zzv(dataHolder);
        zzbm(i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc com_google_android_gms_common_data_zzc = (zzc) obj;
        return zzw.equal(Integer.valueOf(com_google_android_gms_common_data_zzc.zzabg), Integer.valueOf(this.zzabg)) && zzw.equal(Integer.valueOf(com_google_android_gms_common_data_zzc.zzabh), Integer.valueOf(this.zzabh)) && com_google_android_gms_common_data_zzc.zzYX == this.zzYX;
    }

    protected byte[] getByteArray(String str) {
        return this.zzYX.zzg(str, this.zzabg, this.zzabh);
    }

    protected int getInteger(String str) {
        return this.zzYX.zzc(str, this.zzabg, this.zzabh);
    }

    protected String getString(String str) {
        return this.zzYX.zzd(str, this.zzabg, this.zzabh);
    }

    public int hashCode() {
        return zzw.hashCode(new Object[]{Integer.valueOf(this.zzabg), Integer.valueOf(this.zzabh), this.zzYX});
    }

    protected void zzbm(int i) {
        boolean z = i >= 0 && i < this.zzYX.getCount();
        zzx.zzY(z);
        this.zzabg = i;
        this.zzabh = this.zzYX.zzbo(this.zzabg);
    }
}
