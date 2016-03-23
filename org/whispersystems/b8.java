package org.whispersystems;

import java.math.BigInteger;
import java.util.Arrays;

public class b8 implements E {
    private final byte[] a;

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    b8(byte[] bArr) {
        this.a = bArr;
    }

    public byte[] a() {
        byte[] bArr = new byte[]{(byte) 5};
        return aw.a(new byte[][]{bArr, this.a});
    }

    public int compareTo(Object obj) {
        return a((E) obj);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b8)) {
            return false;
        }
        return Arrays.equals(this.a, ((b8) obj).a);
    }

    public int a(E e) {
        return new BigInteger(this.a).compareTo(new BigInteger(((b8) e).a));
    }

    public byte[] m1033b() {
        return this.a;
    }

    public int b() {
        return 5;
    }
}
