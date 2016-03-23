package org.whispersystems;

import org.v;

public class g {
    public static int a;
    private static final String z;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;

    static {
        char[] toCharArray = "R~\u001cn9`d2o&pf".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 5;
                    break;
                case at.g /*1*/:
                    i2 = 22;
                    break;
                case at.i /*2*/:
                    i2 = 117;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int b() {
        return this.b;
    }

    public byte[] c() {
        return this.d;
    }

    public byte[] d() {
        return this.c;
    }

    public byte[] a() {
        return this.e;
    }

    public g(int i, byte[] bArr) {
        boolean z = false;
        int i2 = a;
        byte[][] c = aw.c(new bd().b(bArr, z.getBytes(), 48), 16, 32);
        this.b = i;
        this.d = bArr;
        this.c = c[0];
        this.e = c[1];
        if (i2 != 0) {
            if (!a5.o) {
                z = true;
            }
            a5.o = z;
        }
    }
}
