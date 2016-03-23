package com.google;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

class hg extends hx {
    private static final String[] z;
    private int c;
    protected final byte[] d;

    static {
        int i;
        int i2;
        String[] strArr = new String[5];
        char[] toCharArray = ";[&%k\u001f\u001e<-pWR)0x\u0012\u0004h".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 119;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "%_&bp\u0011Xh'q\u0013\u001e'$?\u0018J 'mM\u001e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 119;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "[\u001e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 119;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "[\u001e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 119;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "?_;b~WP-5?\u0003G8'?\u0018Xh\u0000f\u0003[\u001b6m\u001eP/b}\u0012[&b|\u0005[)6z\u0013\u0001h\u0004p\u0002P,b".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 119;
                    break;
                case at.g /*1*/:
                    i2 = 62;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 66;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    public boolean d() {
        int b = b();
        return gp.c(this.d, b, a() + b);
    }

    public byte b(int i) {
        return this.d[i];
    }

    protected int a(int i, int i2, int i3) {
        boolean z = bA.b;
        byte[] bArr = this.d;
        int b = b() + i2;
        int i4 = b + i3;
        int i5 = b;
        b = i;
        while (i5 < i4) {
            b = (b * 31) + bArr[i5];
            i5++;
            if (z) {
                break;
            }
        }
        return b;
    }

    public String b(String str) {
        return new String(this.d, b(), a(), str);
    }

    public int hashCode() {
        int i = this.c;
        if (i == 0) {
            i = a();
            i = a(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    public d8 i() {
        return new g6(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        try {
            if (!(obj instanceof hx)) {
                return false;
            }
            try {
                if (a() != ((hx) obj).a()) {
                    return false;
                }
                try {
                    if (a() == 0) {
                        return true;
                    }
                    try {
                        if (obj instanceof hg) {
                            return a((hg) obj, 0, a());
                        }
                        try {
                            if (obj instanceof id) {
                                return obj.equals(this);
                            }
                            throw new IllegalArgumentException(z[4] + obj.getClass());
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public ad f() {
        return ad.a(this.d, b(), a());
    }

    protected int b(int i, int i2, int i3) {
        int b = b() + i2;
        return gp.a(i, this.d, b, b + i3);
    }

    public int a() {
        return this.d.length;
    }

    protected int c() {
        return this.c;
    }

    public InputStream m428b() {
        return new ByteArrayInputStream(this.d, b(), a());
    }

    protected int b() {
        return 0;
    }

    public Iterator iterator() {
        return i();
    }

    boolean a(hg hgVar, int i, int i2) {
        boolean z = bA.b;
        try {
            if (i2 > hgVar.a()) {
                throw new IllegalArgumentException(z[0] + i2 + a());
            }
            try {
                if (i + i2 > hgVar.a()) {
                    throw new IllegalArgumentException(z[1] + i + z[2] + i2 + z[3] + hgVar.a());
                }
                byte[] bArr = this.d;
                byte[] bArr2 = hgVar.d;
                int b = b() + i2;
                int b2 = b();
                int b3 = hgVar.b() + i;
                while (b2 < b) {
                    try {
                        if (bArr[b2] == bArr2[b3]) {
                            b2++;
                            b3++;
                            if (z) {
                                break;
                            }
                        }
                        return false;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                return true;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    hg(byte[] bArr) {
        this.c = 0;
        this.d = bArr;
    }

    protected void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.d, i, bArr, i2, i3);
    }
}
