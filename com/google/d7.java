package com.google;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import org.v;
import org.whispersystems.at;

final class d7 implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private static final String z;
    private final Type a;

    static {
        char[] toCharArray = "\u000bI".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case at.g /*1*/:
                    i2 = 20;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return fU.a(this.a) + z;
    }

    public Type getGenericComponentType() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && fU.a((Type) this, (GenericArrayType) obj);
    }

    public d7(Type type) {
        this.a = fU.d(type);
    }
}
