package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import de.greenrobot.event.h;
import java.io.InputStream;

class bt extends InputStream {
    final ep a;
    private final Object b;

    public void mark(int i) {
        this.a.b.mark(i);
    }

    public boolean markSupported() {
        return this.a.b.markSupported();
    }

    public synchronized void reset() {
        this.a.b.reset();
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        return this.a.b.read(bArr, i, i2);
    }

    public long skip(long j) {
        return this.a.b.skip(j);
    }

    public int available() {
        return this.a.b.available();
    }

    public int read() {
        return this.a.b.read();
    }

    bt(ep epVar) {
        this.a = epVar;
        this.b = new cz(this);
    }

    public void close() {
        this.a.b.close();
        h.b().c(this.b);
    }

    public int read(@NonNull byte[] bArr) {
        return this.a.b.read(bArr);
    }
}
