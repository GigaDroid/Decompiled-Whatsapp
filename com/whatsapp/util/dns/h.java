package com.whatsapp.util.dns;

import java.io.OutputStream;
import org.v;
import org.whispersystems.at;

class h {
    private static final String[] z;
    private final short a;
    private final short b;
    private final int c;
    private final f d;

    static {
        String[] strArr = new String[2];
        String str = "oY<\u0005\u0011-M)\u0019BcO<@\u0000h\u0000&\u0015\u000ea";
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
                        i3 = 32;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 98;
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
                    str = "dN;\u0015\u0004kI+\t\u0007cTh\u0004\u0003yA";
                    obj = null;
            }
        }
    }

    static h a(f fVar, short s, short s2) {
        return new h(fVar, s, s2, fVar.a() + 4);
    }

    static h a(byte[] bArr, int i) {
        if (bArr == null) {
            try {
                throw new NullPointerException(z[0]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        f a = f.a(bArr, i);
        int a2 = a.a() + i;
        try {
            if (bArr.length >= a2 + 4) {
                return new h(a, a.b(bArr, a2), a.b(bArr, a2 + 2), a.a() + 4);
            }
            throw new IllegalArgumentException(z[1]);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    void a(OutputStream outputStream) {
        this.d.a(outputStream);
        a.a(outputStream, this.a);
        a.a(outputStream, this.b);
    }

    int a() {
        return this.c;
    }

    private h(f fVar, short s, short s2, int i) {
        this.d = fVar;
        this.a = s;
        this.b = s2;
        this.c = i;
    }
}
