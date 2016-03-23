package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import de.greenrobot.event.h;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicLong;

class fi extends OutputStream {
    final AtomicLong a;
    final as b;
    final HttpURLConnection c;
    private final Object d;
    final bc e;
    final FileOutputStream f;

    public void write(@NonNull byte[] bArr, int i, int i2) {
        if (this.b == null || this.b.a()) {
            if (this.b != null) {
                this.b.a((long) i2);
            }
            this.a.addAndGet((long) i2);
            this.f.write(bArr, i, i2);
            return;
        }
        this.c.disconnect();
    }

    fi(bc bcVar, HttpURLConnection httpURLConnection, FileOutputStream fileOutputStream, as asVar, AtomicLong atomicLong) {
        this.e = bcVar;
        this.c = httpURLConnection;
        this.f = fileOutputStream;
        this.b = asVar;
        this.a = atomicLong;
        this.d = new cu(this);
    }

    public void close() {
        this.f.close();
        h.b().c(this.d);
    }

    public void write(int i) {
        if (this.b == null || this.b.a()) {
            if (this.b != null) {
                this.b.a(1);
            }
            this.a.addAndGet(1);
            this.f.write(i);
            return;
        }
        this.c.disconnect();
    }

    public void write(@NonNull byte[] bArr) {
        if (this.b == null || this.b.a()) {
            if (this.b != null) {
                this.b.a((long) bArr.length);
            }
            this.a.addAndGet((long) bArr.length);
            this.f.write(bArr);
            return;
        }
        this.c.disconnect();
    }

    public void flush() {
        this.f.flush();
    }
}
