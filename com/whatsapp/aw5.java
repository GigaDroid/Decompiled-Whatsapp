package com.whatsapp;

import android.support.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.v;
import org.whispersystems.at;

public class aw5 extends FilterInputStream {
    private static final String z;
    private final MessageDigest a;
    private byte[] b;
    private final byte[] c;

    static {
        char[] toCharArray = "=2\u00044\u0012[L".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 110;
                    break;
                case at.g /*1*/:
                    i2 = 122;
                    break;
                case at.i /*2*/:
                    i2 = 69;
                    break;
                case at.o /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
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

    public aw5(InputStream inputStream) {
        super(inputStream);
        try {
            this.a = MessageDigest.getInstance(z);
            this.c = new byte[8192];
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public byte[] a() {
        if (this.b == null) {
            this.b = this.a.digest();
        }
        return this.b;
    }

    public long skip(long j) {
        return (long) read(this.c, 0, (int) Math.min((long) this.c.length, j));
    }

    public int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.a.update(bArr, i, read);
        }
        return read;
    }
}
