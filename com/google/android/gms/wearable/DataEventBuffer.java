package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzy;

public class DataEventBuffer extends zzf implements Result {
    private final Status zzQA;

    public DataEventBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzQA = new Status(dataHolder.getStatusCode());
    }

    public Status getStatus() {
        return this.zzQA;
    }

    protected /* synthetic */ Object zzk(int i, int i2) {
        return zzv(i, i2);
    }

    protected String zznW() {
        return "path";
    }

    protected DataEvent zzv(int i, int i2) {
        return new zzy(this.zzYX, i, i2);
    }
}
