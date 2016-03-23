package com.google;

import com.whatsapp.arj;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.v;
import org.whispersystems.at;

public abstract class hH {
    public static boolean a;
    private static final String[] z;

    static {
        int i;
        String[] strArr = new String[3];
        char[] toCharArray = "\u0016\u0001\u0011\bPx$6g\u007fx!\u0007BT;\u001a_\b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\f\u0006\f[\u00111\u001dEF^,N\u0004\b{\u000b!+\ba*\u0007\bAE1\u0018\u0000\u0006".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\f\u0006\f[\u00111\u001dEF^,N\u0004\b{\u000b!+\bp*\u001c\u0004Q\u001f".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 110;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 49;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
    }

    public String toString() {
        boolean z = true;
        boolean z2 = a;
        try {
            Writer stringWriter = new StringWriter();
            eE eEVar = new eE(stringWriter);
            eEVar.b(true);
            e9.a(this, eEVar);
            String stringWriter2 = stringWriter.toString();
            if (z2) {
                try {
                    if (aX.a) {
                        z = false;
                    }
                    aX.a = z;
                } catch (IOException e) {
                    throw e;
                }
            }
            return stringWriter2;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public hE g() {
        try {
            if (e()) {
                return (hE) this;
            }
            throw new IllegalStateException(z[0] + this);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean b() {
        return this instanceof hy;
    }

    public boolean e() {
        return this instanceof hE;
    }

    public boolean c() {
        return this instanceof hQ;
    }

    public hy d() {
        try {
            if (b()) {
                return (hy) this;
            }
            throw new IllegalStateException(z[1]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean f() {
        return this instanceof h1;
    }

    public h1 a() {
        try {
            if (f()) {
                return (h1) this;
            }
            throw new IllegalStateException(z[2]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
