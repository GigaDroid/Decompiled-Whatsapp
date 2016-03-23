package com.google;

import java.io.InputStream;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

public abstract class hx implements Iterable {
    static final boolean a;
    public static final hx b;
    private static final String[] z;

    public abstract int a();

    protected abstract int a(int i, int i2, int i3);

    protected abstract void a(byte[] bArr, int i, int i2, int i3);

    public abstract byte b(int i);

    protected abstract int b(int i, int i2, int i3);

    public abstract InputStream b();

    public abstract String b(String str);

    protected abstract int c();

    public abstract boolean d();

    public abstract boolean equals(Object obj);

    public abstract ad f();

    public abstract int hashCode();

    public abstract d8 i();

    public String toString() {
        return String.format(z[5], new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())});
    }

    static c9 a(int i) {
        return new c9(i, null);
    }

    public String e() {
        try {
            return b(z[6]);
        } catch (Throwable e) {
            throw new RuntimeException(z[7], e);
        }
    }

    public void b(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            try {
                throw new IndexOutOfBoundsException(z[2] + i);
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i2 < 0) {
            try {
                throw new IndexOutOfBoundsException(z[1] + i2);
            } catch (RuntimeException e2) {
                throw e2;
            }
        } else if (i3 < 0) {
            try {
                throw new IndexOutOfBoundsException(z[4] + i3);
            } catch (RuntimeException e22) {
                throw e22;
            }
        } else {
            try {
                if (i + i3 > a()) {
                    throw new IndexOutOfBoundsException(z[3] + (i + i3));
                }
                try {
                    if (i2 + i3 > bArr.length) {
                        throw new IndexOutOfBoundsException(z[0] + (i2 + i3));
                    } else if (i3 > 0) {
                        try {
                            a(bArr, i, i2, i3);
                        } catch (RuntimeException e222) {
                            throw e222;
                        }
                    }
                } catch (RuntimeException e2222) {
                    throw e2222;
                }
            } catch (RuntimeException e22222) {
                throw e22222;
            }
        }
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[10];
        char[] toCharArray = "D\u001911tdX&8u0\u0017%0bu\fcj1 Bc".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "D\u001911tdX,0wc\u001d7v-0Hyv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "C\u00176$ruX,0wc\u001d7v-0Hyv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "C\u00176$ruX&8u0\u0017%0bu\fcj1 Bc".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\\\u001d-1exX\u007fv!*X".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = ",::\"tC\f1?\u007fw8f%1c\u001193,5\u001c}".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "E,\u0005{)".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "E,\u0005{)0\u0016,\"1c\r3&~b\f&2.".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "E,\u0005{)0\u0016,\"1c\r3&~b\f&2.".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "E,\u0005{)".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 120;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        z = strArr;
        try {
            boolean z;
            if (hx.class.desiredAssertionStatus()) {
                z = false;
            } else {
                z = true;
            }
            a = z;
            b = new hg(new byte[0]);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    hx() {
    }

    public Iterator iterator() {
        return i();
    }

    public static hx a(byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new hg(obj);
    }

    public byte[] h() {
        int a = a();
        byte[] bArr = new byte[a];
        a(bArr, 0, 0, a);
        return bArr;
    }

    public static hx a(String str) {
        try {
            return new hg(str.getBytes(z[9]));
        } catch (Throwable e) {
            throw new RuntimeException(z[8], e);
        }
    }

    public boolean g() {
        try {
            return a() == 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static hx a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }
}
