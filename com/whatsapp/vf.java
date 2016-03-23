package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.InputStream;
import org.v;
import org.whispersystems.at;

public class vf extends InputStream {
    private static final String[] z;
    final InputStream a;
    @ak2
    final int b;

    static {
        String[] strArr = new String[2];
        String str = "\u0007$He\u0001\t$VbD\u000eeS`\u0001' I}@\r s`Q\u001f1izS\u000f$W";
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 69;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0018 IkUJ&[bM\u000f!\u001agOJ\b_}R\u000b\"_GO\u001a0N]U\u0018 [c";
                    obj = null;
            }
        }
    }

    public int read(byte[] bArr) {
        int read = this.a.read(bArr);
        if (read > 0) {
            amd.a((long) read, this.b);
        }
        return read;
    }

    public int read() {
        int read = this.a.read();
        if (read != -1) {
            amd.a(1, this.b);
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            amd.a((long) read, this.b);
        }
        return read;
    }

    public boolean markSupported() {
        return false;
    }

    public void mark(int i) {
        Log.w(z[0]);
    }

    public vf(InputStream inputStream, @ak2 int i) {
        this.a = inputStream;
        this.b = i;
    }

    public long skip(long j) {
        long skip = this.a.skip(j);
        amd.a(skip, this.b);
        return skip;
    }

    public synchronized void reset() {
        Log.w(z[1]);
    }
}
