package com.whatsapp.util.dns;

import java.io.OutputStream;
import org.v;
import org.whispersystems.at;

class g {
    private static final String[] z;
    private final int a;
    private final byte[] b;
    private final short c;
    private final short d;
    private final int e;
    private final f f;

    static {
        String[] strArr = new String[3];
        String str = "do \u0002Ykh0\u001eZcus\u0013^y`";
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
                        i3 = 13;
                        break;
                    case at.g /*1*/:
                        i3 = 1;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 63;
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
                    str = "do \u0002Ykh0\u001eZcus\u0013^y`";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "ox'\u0012L-l2\u000e\u001fcn'W]h!=\u0002Sa";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private g(f fVar, short s, short s2, int i, byte[] bArr, int i2) {
        this.f = fVar;
        this.d = s;
        this.c = s2;
        this.e = i;
        this.b = bArr;
        this.a = i2;
    }

    int e() {
        return this.e;
    }

    f g() {
        return this.f;
    }

    short f() {
        return this.c;
    }

    byte[] a() {
        return this.b;
    }

    short b() {
        return (short) this.b.length;
    }

    short c() {
        return this.d;
    }

    int d() {
        return this.a;
    }

    void a(OutputStream outputStream) {
        this.f.a(outputStream);
        a.a(outputStream, this.d);
        a.a(outputStream, this.c);
        a.a(outputStream, this.e);
        a.a(outputStream, (short) this.b.length);
        outputStream.write(this.b);
    }

    static g a(byte[] bArr, int i) {
        if (bArr == null) {
            try {
                throw new NullPointerException(z[1]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        f a = f.a(bArr, i);
        int a2 = a.a() + i;
        try {
            if (bArr.length < a2 + 10) {
                throw new IllegalArgumentException(z[2]);
            }
            short b = a.b(bArr, a2);
            short b2 = a.b(bArr, a2 + 2);
            int a3 = a.a(bArr, a2 + 4);
            short b3 = a.b(bArr, a2 + 8);
            a2 += 10;
            try {
                if (bArr.length < a2 + b3) {
                    throw new IllegalArgumentException(z[0]);
                }
                Object obj = new byte[b3];
                System.arraycopy(bArr, a2, obj, 0, b3);
                return new g(a, b, b2, a3, obj, b3 + (a.a() + 10));
            } catch (NullPointerException e2) {
                throw e2;
            }
        } catch (NullPointerException e22) {
            throw e22;
        }
    }
}
