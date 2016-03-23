package com.whatsapp.util;

import com.whatsapp.WAAppCompatActivity;
import java.io.RandomAccessFile;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class cl {
    public static final cl a;
    public static final cl d;
    public static final cl g;
    public static final cl k;
    private static final String[] z;
    double b;
    double c;
    double e;
    double f;
    double h;
    double i;
    double j;
    double l;
    double m;

    public cl(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.l = d5;
        this.m = d6;
        this.j = d7;
        this.f = d;
        this.h = d2;
        this.e = d3;
        this.c = d4;
        this.i = d8;
        this.b = d9;
    }

    public int hashCode() {
        int i = co.a;
        long doubleToLongBits = Double.doubleToLongBits(this.l);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        doubleToLongBits = Double.doubleToLongBits(this.m);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.j);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.f);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.h);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.e);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.c);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.i);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        doubleToLongBits = Double.doubleToLongBits(this.b);
        i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
        return i2;
    }

    static {
        String[] strArr = new String[13];
        int i = 0;
        String str = "\u007f`!)vJz f";
        Object obj = -1;
        String[] strArr2 = strArr;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 50;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 85;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr[i] = str;
                    i = 2;
                    str = "\u001e!\"f";
                    obj = 1;
                    strArr = strArr2;
                    break;
                case at.g /*1*/:
                    strArr[i] = str;
                    i = 3;
                    str = "\u001e!!\"\"";
                    obj = 2;
                    strArr = strArr2;
                    break;
                case at.i /*2*/:
                    strArr[i] = str;
                    i = 4;
                    str = "`n!:kW!dc/\u0082";
                    obj = 3;
                    strArr = strArr2;
                    break;
                case at.o /*3*/:
                    strArr[i] = str;
                    i = 5;
                    str = "\u001e!7f";
                    obj = 4;
                    strArr = strArr2;
                    break;
                case at.p /*4*/:
                    strArr[i] = str;
                    i = 6;
                    str = "`n!:kW!gl/\u0082";
                    obj = 5;
                    strArr = strArr2;
                    break;
                case at.m /*5*/:
                    strArr[i] = str;
                    i = 7;
                    str = "\u001e!1f";
                    obj = 6;
                    strArr = strArr2;
                    break;
                case Y.f /*6*/:
                    strArr[i] = str;
                    i = 8;
                    str = "\u001e!!#\"";
                    obj = 7;
                    strArr = strArr2;
                    break;
                case aF.v /*7*/:
                    strArr[i] = str;
                    i = 9;
                    str = "\u001e!#f";
                    obj = 8;
                    strArr = strArr2;
                    break;
                case aF.u /*8*/:
                    strArr[i] = str;
                    i = 10;
                    str = "`n!:kW!e\u00eb";
                    obj = 9;
                    strArr = strArr2;
                    break;
                case Y.l /*9*/:
                    strArr[i] = str;
                    i = 11;
                    str = "`n!:kW!lk\u00af";
                    obj = 10;
                    strArr = strArr2;
                    break;
                case Y.t /*10*/:
                    strArr[i] = str;
                    i = 12;
                    str = "\u001e!4f";
                    obj = 11;
                    strArr = strArr2;
                    break;
                case Y.j /*11*/:
                    strArr[i] = str;
                    z = strArr2;
                    g = new cl(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
                    k = new cl(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
                    a = new cl(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
                    d = new cl(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
                    return;
                default:
                    strArr[i] = str;
                    i = 1;
                    str = "\u001e!6f";
                    obj = null;
                    strArr = strArr2;
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cl clVar = (cl) obj;
        if (Double.compare(clVar.f, this.f) != 0) {
            return false;
        }
        if (Double.compare(clVar.h, this.h) != 0) {
            return false;
        }
        if (Double.compare(clVar.e, this.e) != 0) {
            return false;
        }
        if (Double.compare(clVar.c, this.c) != 0) {
            return false;
        }
        if (Double.compare(clVar.i, this.i) != 0) {
            return false;
        }
        if (Double.compare(clVar.b, this.b) != 0) {
            return false;
        }
        if (Double.compare(clVar.l, this.l) != 0) {
            return false;
        }
        if (Double.compare(clVar.m, this.m) != 0) {
            return false;
        }
        if (Double.compare(clVar.j, this.j) != 0) {
            return false;
        }
        return true;
    }

    public int b() {
        if (this.f == 0.0d && this.h == 1.0d && this.e == -1.0d && this.c == 0.0d) {
            return 90;
        }
        if (this.f == -1.0d && this.h == 0.0d && this.e == 0.0d && this.c == -1.0d) {
            return 180;
        }
        if (this.f == 0.0d && this.h == -1.0d && this.e == 1.0d && this.c == 0.0d) {
            return 270;
        }
        return 0;
    }

    public static cl a(RandomAccessFile randomAccessFile) {
        double c = ck.c(randomAccessFile);
        double c2 = ck.c(randomAccessFile);
        double g = ck.g(randomAccessFile);
        return new cl(c, c2, ck.c(randomAccessFile), ck.c(randomAccessFile), g, ck.g(randomAccessFile), ck.g(randomAccessFile), ck.c(randomAccessFile), ck.c(randomAccessFile));
    }

    public String toString() {
        if (equals(g)) {
            return z[10];
        }
        if (equals(k)) {
            return z[11];
        }
        if (equals(a)) {
            return z[4];
        }
        return equals(d) ? z[6] : z[0] + this.l + z[9] + this.m + z[2] + this.j + z[12] + this.f + z[5] + this.h + z[1] + this.e + z[7] + this.c + z[8] + this.i + z[3] + this.b + '}';
    }

    public boolean a() {
        return (this.i == 0.0d && this.b == 0.0d) ? false : true;
    }
}
