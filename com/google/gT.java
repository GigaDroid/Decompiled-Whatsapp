package com.google;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import org.v;
import org.whispersystems.at;

final class gT implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private static final String[] z;
    private final Type a;
    private final Type b;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "`\u00104FR:Bg".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 95;
                    break;
                case at.g /*1*/:
                    i2 = 48;
                    break;
                case at.i /*2*/:
                    i2 = 71;
                    break;
                case at.o /*3*/:
                    i2 = 51;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "`\u0010\"KV:^#@\u0002".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 95;
                    break;
                case at.g /*1*/:
                    i2 = 48;
                    break;
                case at.i /*2*/:
                    i2 = 71;
                    break;
                case at.o /*3*/:
                    i2 = 51;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    public int hashCode() {
        return (this.a != null ? this.a.hashCode() + 31 : 1) ^ (this.b.hashCode() + 31);
    }

    public boolean equals(Object obj) {
        return (obj instanceof WildcardType) && fU.a((Type) this, (WildcardType) obj);
    }

    public Type[] getUpperBounds() {
        return new Type[]{this.b};
    }

    public gT(Type[] typeArr, Type[] typeArr2) {
        boolean z;
        boolean z2 = true;
        ba.a(typeArr2.length <= 1);
        if (typeArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        ba.a(z);
        if (typeArr2.length == 1) {
            ba.a(typeArr2[0]);
            fU.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                z2 = false;
            }
            ba.a(z2);
            this.a = fU.d(typeArr2[0]);
            this.b = Object.class;
            if (!ak.i) {
                return;
            }
        }
        ba.a(typeArr[0]);
        fU.b(typeArr[0]);
        this.a = null;
        this.b = fU.d(typeArr[0]);
    }

    public Type[] getLowerBounds() {
        if (this.a == null) {
            return fU.a;
        }
        return new Type[]{this.a};
    }

    public String toString() {
        if (this.a != null) {
            return z[0] + fU.a(this.a);
        }
        if (this.b == Object.class) {
            return "?";
        }
        return z[1] + fU.a(this.b);
    }
}
