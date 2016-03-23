package com.whatsapp;

import android.support.annotation.NonNull;
import java.io.InputStream;
import org.v;
import org.whispersystems.at;

class ad5 extends InputStream {
    private static final String z;
    private final ad2 a;
    private final InputStream b;

    static {
        char[] toCharArray = "j\u0019\u0017".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 94;
                    break;
                case at.o /*3*/:
                    i2 = 64;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public zc b() {
        return this.a.a();
    }

    private ad5(InputStream inputStream, ad2 com_whatsapp_ad2) {
        this.b = inputStream;
        this.a = com_whatsapp_ad2;
    }

    public long a() {
        return this.a.b();
    }

    public int read() {
        throw new AssertionError(z);
    }

    ad5(InputStream inputStream, ad2 com_whatsapp_ad2, xk xkVar) {
        this(inputStream, com_whatsapp_ad2);
    }

    public void close() {
        this.b.close();
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int read = this.b.read(bArr, i, i2);
        if (read > 0) {
            this.a.a((long) read);
        }
        return read;
    }
}
