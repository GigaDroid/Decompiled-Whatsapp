package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import com.whatsapp.amd;
import java.io.InputStream;

class dr extends InputStream {
    final c6 a;
    final InputStream b;

    dr(c6 c6Var, InputStream inputStream) {
        this.a = c6Var;
        this.b = inputStream;
    }

    public synchronized void reset() {
        this.b.reset();
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int read = this.b.read(bArr, i, i2);
        if (read > 0) {
            amd.b((long) read, d2.a(this.a.a));
        }
        return read;
    }

    public long skip(long j) {
        long skip = this.b.skip(j);
        amd.b(skip, d2.a(this.a.a));
        return skip;
    }

    public int read() {
        int read = this.b.read();
        if (read >= 0) {
            amd.b(1, d2.a(this.a.a));
        }
        return read;
    }

    public int available() {
        return this.b.available();
    }

    public void close() {
        this.b.close();
    }

    public int read(@NonNull byte[] bArr) {
        int read = this.b.read(bArr);
        if (read > 0) {
            amd.b((long) read, d2.a(this.a.a));
        }
        return read;
    }

    public void mark(int i) {
        this.b.mark(i);
    }

    public boolean markSupported() {
        return this.b.markSupported();
    }
}
