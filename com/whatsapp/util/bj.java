package com.whatsapp.util;

import android.support.annotation.NonNull;
import com.whatsapp.arj;
import java.io.InputStream;
import org.v;
import org.whispersystems.at;

final class bj extends InputStream {
    private static final String[] z;
    private InputStream a;
    byte[] b;
    private long c;

    static {
        String[] strArr = new String[3];
        String str = "\u0003szNs``q\u001ab4";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 64;
                        break;
                    case at.g /*1*/:
                        i3 = 18;
                        break;
                    case at.i /*2*/:
                        i3 = 20;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0003szNs`\u007fu\u001bl";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000f[GIr.wl\u0019b#fq\r'2w`\u001cu.2b\bk5w.I";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void close() {
        this.a.close();
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        this.c += (long) read;
        return read;
    }

    public int read() {
        int read = read(this.b, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            try {
                return this.b[0] & 255;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        throw new IllegalStateException(z[1] + read);
    }

    public int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public void reset() {
        throw new IllegalStateException(z[0]);
    }

    public int available() {
        return this.a.available();
    }

    public void mark(int i) {
        throw new IllegalStateException(z[2]);
    }

    public bj(InputStream inputStream, long j) {
        this.a = null;
        this.c = 0;
        this.b = new byte[1];
        this.a = inputStream;
        this.c = j;
    }

    public long a() {
        return this.c;
    }

    public boolean markSupported() {
        return false;
    }

    public long skip(long j) {
        long skip = this.a.skip(j);
        this.c += skip;
        return skip;
    }
}
