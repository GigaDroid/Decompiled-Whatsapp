package com.whatsapp;

import android.support.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import org.whispersystems.aw;

public class cz extends InputStream {
    private final Mac a;
    private boolean b;
    private final Cipher c;
    private final InputStream d;
    private ByteArrayInputStream e;

    public cz(InputStream inputStream, vq vqVar) {
        this.d = inputStream;
        this.c = mt.a(vqVar.b(), vqVar.a(), 1);
        this.a = mt.a(vqVar.b(), vqVar.d());
    }

    public int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read() {
        byte[] bArr = new byte[1];
        while (true) {
            int read = read(bArr, 0, bArr.length);
            if (read == -1) {
                return -1;
            }
            if (read != 0) {
                return bArr[0];
            }
            Thread.yield();
        }
    }

    public void close() {
        this.d.close();
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int read;
        if (this.e != null) {
            read = this.e.read(bArr, i, i2);
            if (read > 0) {
                return read;
            }
            try {
                this.e = null;
                if (this.b) {
                    return -1;
                }
            } catch (IllegalBlockSizeException e) {
                throw e;
            }
        }
        read = this.d.read(bArr, i, i2);
        Object e2;
        if (read == -1) {
            ByteBuffer allocate = ByteBuffer.allocate(42);
            try {
                byte[] doFinal = this.c.doFinal();
                allocate.put(doFinal);
                allocate.put(aw.d(this.a.doFinal(doFinal), 10));
                allocate.flip();
                doFinal = new byte[allocate.remaining()];
                allocate.get(doFinal);
                this.e = new ByteArrayInputStream(doFinal);
                this.b = true;
                return this.e.read(bArr, i, i2);
            } catch (IllegalBlockSizeException e3) {
                e2 = e3;
                throw new AssertionError(e2);
            } catch (BadPaddingException e4) {
                e2 = e4;
                throw new AssertionError(e2);
            }
        } else if (read <= 0) {
            return read;
        } else {
            e2 = this.c.update(bArr, i, read);
            try {
                this.a.update(e2);
                if (e2.length <= i2) {
                    System.arraycopy(e2, 0, bArr, i, e2.length);
                    return e2.length;
                }
                System.arraycopy(e2, 0, bArr, i, i2);
                this.e = new ByteArrayInputStream(e2, i2, e2.length - i2);
                return i2;
            } catch (IllegalBlockSizeException e5) {
                throw e5;
            }
        }
    }
}
