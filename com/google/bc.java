package com.google;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import org.v;
import org.whispersystems.at;

final class bc implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private static final String z;
    private final Type a;
    private final Type[] b;
    private final Type c;

    static {
        char[] toCharArray = "HO".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 100;
                    break;
                case at.g /*1*/:
                    i2 = 111;
                    break;
                case at.i /*2*/:
                    i2 = 21;
                    break;
                case at.o /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Type[] getActualTypeArguments() {
        return (Type[]) this.b.clone();
    }

    public String toString() {
        boolean z = ak.i;
        StringBuilder stringBuilder = new StringBuilder((this.b.length + 1) * 30);
        stringBuilder.append(fU.a(this.c));
        if (this.b.length == 0) {
            return stringBuilder.toString();
        }
        stringBuilder.append("<").append(fU.a(this.b[0]));
        int i = 1;
        while (i < this.b.length) {
            stringBuilder.append(z).append(fU.a(this.b[i]));
            i++;
            if (z) {
                break;
            }
        }
        return stringBuilder.append(">").toString();
    }

    public Type getRawType() {
        return this.c;
    }

    public Type getOwnerType() {
        return this.a;
    }

    public bc(Type type, Type type2, Type[] typeArr) {
        int i = 0;
        boolean z = ak.i;
        if (type2 instanceof Class) {
            boolean z2;
            Class cls = (Class) type2;
            int i2;
            if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (type == null && r0 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            ba.a(z2);
        }
        this.a = type == null ? null : fU.d(type);
        this.c = fU.d(type2);
        this.b = (Type[]) typeArr.clone();
        while (i < this.b.length) {
            ba.a(this.b[i]);
            fU.b(this.b[i]);
            this.b[i] = fU.d(this.b[i]);
            i++;
            if (z) {
                return;
            }
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.b) ^ this.c.hashCode()) ^ fU.a(this.a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && fU.a((Type) this, (ParameterizedType) obj);
    }
}
