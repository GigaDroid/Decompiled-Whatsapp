package com.whatsapp;

import com.whatsapp.protocol.b1;
import java.util.concurrent.Callable;
import org.v;
import org.whispersystems.at;
import org.whispersystems.b;
import org.whispersystems.i;
import org.whispersystems.w;

final class gp implements Callable {
    private static final String z;
    final i a;
    final b1 b;

    static {
        char[] toCharArray = "BlUl\u0002Bf\u0003n\u0007[jF\u007f\u001aNzW-\u001aRrF6NHkSe\u000bYvFu\u001a\u007f{ShS".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 43;
                    break;
                case at.g /*1*/:
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    i2 = 35;
                    break;
                case at.o /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 110;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object call() {
        return a();
    }

    public byte[] a() {
        try {
            switch (this.b.b) {
                case v.m /*0*/:
                    return this.a.a(new b(this.b.c));
                case at.g /*1*/:
                    return this.a.a(new w(this.b.c));
                default:
                    throw new IllegalArgumentException(z + this.b.b);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    gp(b1 b1Var, i iVar) {
        this.b = b1Var;
        this.a = iVar;
    }
}
