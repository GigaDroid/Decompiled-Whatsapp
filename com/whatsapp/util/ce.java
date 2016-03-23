package com.whatsapp.util;

import com.whatsapp.WAAppCompatActivity;
import java.io.RandomAccessFile;
import org.v;
import org.whispersystems.at;

public class ce extends ca {
    private static final String[] z;
    double d;
    int e;
    cl f;
    long g;
    long h;
    long i;
    double j;

    static {
        String[] strArr = new String[3];
        String str = "Z\u0004O<?\u000e\tU d";
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
                        i3 = 122;
                        break;
                    case at.g /*1*/:
                        i3 = 96;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 78;
                        break;
                    default:
                        i3 = 94;
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
                    str = "Z\u0012U:?\u000e\tU d";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000f\u000eS:-Z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return super.toString() + "[" + ck.a(this.g) + "/" + ck.a(this.i) + z[0] + this.h + z[1] + this.f + " " + this.j + "x" + this.d + z[2] + this.f.b() + "]";
    }

    public ce(long j, String str, RandomAccessFile randomAccessFile) {
        int i = co.a;
        super(j, str, randomAccessFile);
        this.f = cl.g;
        this.e = ck.e(randomAccessFile);
        ck.a(randomAccessFile);
        this.g = ck.d(randomAccessFile);
        this.i = ck.d(randomAccessFile);
        ck.d(randomAccessFile);
        ck.d(randomAccessFile);
        this.h = ck.d(randomAccessFile);
        ck.d(randomAccessFile);
        ck.d(randomAccessFile);
        ck.f(randomAccessFile);
        ck.f(randomAccessFile);
        ck.f(randomAccessFile);
        ck.f(randomAccessFile);
        this.f = cl.a(randomAccessFile);
        this.j = ck.c(randomAccessFile);
        this.d = ck.c(randomAccessFile);
        if (WAAppCompatActivity.c != 0) {
            co.a = i + 1;
        }
    }
}
