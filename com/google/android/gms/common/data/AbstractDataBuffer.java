package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class AbstractDataBuffer implements DataBuffer {
    protected final DataHolder zzYX;

    protected AbstractDataBuffer(DataHolder dataHolder) {
        this.zzYX = dataHolder;
        if (this.zzYX != null) {
            this.zzYX.zzq(this);
        }
    }

    public abstract Object get(int i);

    public int getCount() {
        return this.zzYX == null ? 0 : this.zzYX.getCount();
    }

    public Iterator iterator() {
        return new zzb(this);
    }

    public void release() {
        if (this.zzYX != null) {
            this.zzYX.close();
        }
    }
}
