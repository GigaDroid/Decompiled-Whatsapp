package org;

import java.util.EventObject;
import org.whispersystems.at;

public class m extends EventObject {
    public static final long d = -1;
    private static final long serialVersionUID = -964927635655051867L;
    private static final String[] z;
    private final long a;
    private final int b;
    private final long c;

    static {
        int i;
        String[] strArr = new String[4];
        char[] toCharArray = "\u001a)\u0002]dSz]".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 54;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 96;
                    break;
                case at.o /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001a)\u0013MjS4".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 54;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 96;
                    break;
                case at.o /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u001a)\u0014KdWe]".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 54;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 96;
                    break;
                case at.o /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "mz\u000fQbUl]".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 54;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 96;
                    break;
                case at.o /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 16;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
    }

    public int c() {
        return this.b;
    }

    public m(Object obj, long j, int i, long j2) {
        int i2 = aj.a;
        super(obj);
        this.b = i;
        this.c = j;
        this.a = j2;
        if (K.b != 0) {
            aj.a = i2 + 1;
        }
    }

    public String toString() {
        int i = aj.a;
        String str = getClass().getName() + z[3] + this.source + z[2] + this.c + z[0] + this.b + z[1] + this.a + "]";
        if (i != 0) {
            K.b++;
        }
        return str;
    }

    public long a() {
        return this.c;
    }

    public long b() {
        return this.a;
    }
}
