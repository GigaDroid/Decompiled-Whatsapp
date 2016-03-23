package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class zzb implements Iterator {
    protected final DataBuffer zzabd;
    protected int zzabe;

    public zzb(DataBuffer dataBuffer) {
        this.zzabd = (DataBuffer) zzx.zzv(dataBuffer);
        this.zzabe = -1;
    }

    public boolean hasNext() {
        try {
            return this.zzabe < this.zzabd.getCount() + -1;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public Object next() {
        try {
            if (hasNext()) {
                DataBuffer dataBuffer = this.zzabd;
                int i = this.zzabe + 1;
                this.zzabe = i;
                return dataBuffer.get(i);
            }
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.zzabe);
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
