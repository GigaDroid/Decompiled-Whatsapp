package com.whatsapp.util;

import java.io.RandomAccessFile;
import org.v;
import org.whispersystems.at;

public class cw extends ca {
    private static final String[] z;
    int d;
    long e;
    long f;
    cl g;
    long h;
    long i;

    static {
        String[] strArr = new String[3];
        String str = "^+";
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
                        i3 = 119;
                        break;
                    case at.g /*1*/:
                        i3 = 11;
                        break;
                    case at.i /*2*/:
                        i3 = 114;
                        break;
                    case at.o /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 38;
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
                    str = "\u0004n\u0011-\u000e";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Wo\u0007\u007fG\u0003b\u001dc\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public cw(long j, String str, RandomAccessFile randomAccessFile) {
        super(j, str, randomAccessFile);
        this.g = cl.g;
        this.d = ck.e(randomAccessFile);
        ck.a(randomAccessFile);
        this.f = ck.d(randomAccessFile);
        this.i = ck.d(randomAccessFile);
        this.e = ck.d(randomAccessFile);
        this.h = ck.d(randomAccessFile);
        ck.d(randomAccessFile);
        ck.f(randomAccessFile);
        ck.f(randomAccessFile);
        ck.d(randomAccessFile);
        ck.d(randomAccessFile);
        this.g = cl.a(randomAccessFile);
    }

    public String toString() {
        return super.toString() + "[" + ck.a(this.f) + "/" + ck.a(this.i) + z[1] + (this.h / this.e) + z[2] + this.h + z[0] + this.g + "]";
    }
}
