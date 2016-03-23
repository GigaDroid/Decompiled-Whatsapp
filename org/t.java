package org;

import android.support.annotation.Nullable;
import org.whispersystems.at;
import org.whispersystems.aw;
import org.whispersystems.curve25519.a8;
import org.whispersystems.curve25519.d;

public class t {
    private static final String z;
    public final aa a;
    public final a9 b;

    static {
        char[] toCharArray = "\u0016n[E".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 11;
                    break;
                case at.i /*2*/:
                    i2 = 40;
                    break;
                case at.o /*3*/:
                    i2 = 49;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public byte[] a() {
        return aw.a(new byte[][]{this.a.a, this.b.a});
    }

    public t(a9 a9Var, aa aaVar) {
        this.b = a9Var;
        this.a = aaVar;
    }

    @Nullable
    public static t a(byte[] bArr) {
        if (bArr == null || bArr.length != 64) {
            return null;
        }
        byte[][] c = aw.c(bArr, 32, 32);
        return new t(new a9(c[1]), new aa(c[0]));
    }

    public static t b() {
        a8 a = d.a(z).a();
        return new t(new a9(a.a()), new aa(a.b()));
    }
}
