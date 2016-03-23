package com.google;

import java.io.FilterInputStream;
import java.io.InputStream;

final class bX extends FilterInputStream {
    private int a;

    public int available() {
        return Math.min(super.available(), this.a);
    }

    public long skip(long j) {
        long skip = super.skip(Math.min(j, (long) this.a));
        if (skip >= 0) {
            this.a = (int) (((long) this.a) - skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.a <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, this.a));
        if (read < 0) {
            return read;
        }
        this.a -= read;
        return read;
    }

    bX(InputStream inputStream, int i) {
        super(inputStream);
        this.a = i;
    }

    public int read() {
        if (this.a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read < 0) {
            return read;
        }
        this.a--;
        return read;
    }
}
