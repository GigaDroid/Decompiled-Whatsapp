package com.whatsapp.util;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;

class ay extends CipherInputStream {
    private final AtomicLong a;

    public int read() {
        int read = super.read();
        if (read > 0) {
            this.a.incrementAndGet();
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.a.addAndGet((long) read);
        }
        return read;
    }

    public ay(InputStream inputStream, Cipher cipher, AtomicLong atomicLong) {
        super(inputStream, cipher);
        this.a = atomicLong;
    }
}
