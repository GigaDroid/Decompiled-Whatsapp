package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public final class zzy extends zzc implements DataEvent {
    private final int zzasz;

    public zzy(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zzasz = i2;
    }

    public DataItem getDataItem() {
        return new zzae(this.zzYX, this.zzabg, this.zzasz);
    }

    public int getType() {
        return getInteger("event_type");
    }

    public String toString() {
        String str = getType() == 1 ? "changed" : getType() == 2 ? "deleted" : "unknown";
        return "DataEventRef{ type=" + str + ", dataitem=" + getDataItem() + " }";
    }
}
