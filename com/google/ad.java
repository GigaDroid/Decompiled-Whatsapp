package com.google;

import com.whatsapp.arj;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

public final class ad {
    private static final String[] z;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final InputStream j;
    private final byte[] k;

    static {
        int i;
        String[] strArr = new String[5];
        char[] toCharArray = "*A\u0001\u001fW4f\u0012\u0010]=VO_\u001b;E\u000b\u001a^<\u0004\u0010\u001e^6\u0004\u0005\u0003]>A\u0015VL9W\tQOxA\n\u0006O!\n".toCharArray();
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
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "Rp\u000f\u0013\u001b\u0011J\u0017\u0003O\u000bP\u0015\u0013Z5\u0004\u000e\u001bK4A\n\u0013U,E\u0013\u001fT6\u0004\u000e\u0005\u001b:Q\u0000\u0011Bv".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0011J\u0017\u0003O\u000bP\u0015\u0013Z5\u0007\u0015\u0013Z<\f\u0005\u000fO=\u007f:_\u001b*A\u0013\u0003I6A\u0003VR6R\u0006\u001aR<\u0004\u0015\u0013H-H\u0013L\u001b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\rp![\u0003".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\rp![\u0003".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 36;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
    }

    public static ad a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public long m() {
        return j();
    }

    public void g(int i) {
        this.i = i;
        d();
    }

    public long y() {
        return o();
    }

    public long o() {
        boolean z = bA.b;
        int i = 0;
        long j = 0;
        while (i < 64) {
            byte h = h();
            j |= ((long) (h & 127)) << i;
            if ((h & 128) != 0) {
                i += 7;
                if (z) {
                    break;
                }
            }
            return j;
        }
        throw fN.d();
    }

    public long a() {
        return o();
    }

    public int c() {
        return l();
    }

    public static ad a(InputStream inputStream) {
        return new ad(inputStream);
    }

    public static int f(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public int z() {
        try {
            if (k()) {
                this.e = 0;
                return 0;
            }
            try {
                this.e = n();
                if (f7.a(this.e) != 0) {
                    return this.e;
                }
                throw fN.g();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void a(il ilVar, h hVar) {
        int n = n();
        try {
            if (this.b >= this.d) {
                throw fN.c();
            }
            n = b(n);
            this.b++;
            ilVar.mergeFrom(this, hVar);
            e(0);
            this.b--;
            g(n);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int n() {
        /*
        r4 = this;
        r2 = com.google.bA.b;
        r0 = r4.h();
        if (r0 < 0) goto L_0x0009;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = r0 & 127;
        r1 = r4.h();
        if (r1 < 0) goto L_0x0016;
    L_0x0011:
        r3 = r1 << 7;
        r0 = r0 | r3;
        if (r2 == 0) goto L_0x0008;
    L_0x0016:
        r1 = r1 & 127;
        r1 = r1 << 7;
        r0 = r0 | r1;
        r1 = r4.h();
        if (r1 < 0) goto L_0x0026;
    L_0x0021:
        r3 = r1 << 14;
        r0 = r0 | r3;
        if (r2 == 0) goto L_0x0008;
    L_0x0026:
        r1 = r1 & 127;
        r1 = r1 << 14;
        r0 = r0 | r1;
        r1 = r4.h();
        if (r1 < 0) goto L_0x0036;
    L_0x0031:
        r3 = r1 << 21;
        r0 = r0 | r3;
        if (r2 == 0) goto L_0x0008;
    L_0x0036:
        r1 = r1 & 127;
        r1 = r1 << 21;
        r0 = r0 | r1;
        r1 = r4.h();
        r3 = r1 << 28;
        r0 = r0 | r3;
        if (r1 >= 0) goto L_0x0008;
    L_0x0044:
        r1 = 0;
    L_0x0045:
        r3 = 5;
        if (r1 >= r3) goto L_0x0052;
    L_0x0048:
        r3 = r4.h();	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r3 >= 0) goto L_0x0008;
    L_0x004e:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0045;
    L_0x0052:
        r0 = com.google.fN.d();
        throw r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ad.n():int");
    }

    public String v() {
        int n = n();
        try {
            if (n > this.g - this.h || n <= 0) {
                return new String(a(n), z[4]);
            }
            String str = new String(this.k, this.h, n, z[3]);
            this.h = n + this.h;
            return str;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int i() {
        return n();
    }

    public byte h() {
        try {
            if (this.h == this.g) {
                a(true);
            }
            byte[] bArr = this.k;
            int i = this.h;
            this.h = i + 1;
            return bArr[i];
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void u() {
        int z;
        do {
            z = z();
            if (z != 0) {
                try {
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return;
        } while (d(z));
    }

    public hx q() {
        int n = n();
        if (n == 0) {
            try {
                return hx.b;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (n > this.g - this.h || n <= 0) {
                return hx.a(a(n));
            }
            hx a = hx.a(this.k, this.h, n);
            this.h = n + this.h;
            return a;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int b(int i) {
        if (i < 0) {
            try {
                throw fN.e();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        int i2 = (this.a + this.h) + i;
        int i3 = this.i;
        if (i2 > i3) {
            try {
                throw fN.f();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        this.i = i2;
        d();
        return i3;
    }

    public long r() {
        return a(o());
    }

    public static ad a(byte[] bArr, int i, int i2) {
        ad adVar = new ad(bArr, i, i2);
        try {
            adVar.b(i2);
            return adVar;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int l() {
        return (((h() & 255) | ((h() & 255) << 8)) | ((h() & 255) << 16)) | ((h() & 255) << 24);
    }

    public void c(int i) {
        boolean z = bA.b;
        if (i < 0) {
            try {
                throw fN.e();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if ((this.a + this.h) + i > this.i) {
                c((this.i - this.a) - this.h);
                throw fN.f();
            }
            try {
                if (i <= this.g - this.h) {
                    this.h += i;
                    if (!z) {
                        return;
                    }
                }
                int i2 = this.g - this.h;
                this.h = this.g;
                a(true);
                while (i - i2 > this.g) {
                    i2 += this.g;
                    this.h = this.g;
                    a(true);
                    if (z) {
                        break;
                    }
                }
                this.h = i - i2;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public boolean w() {
        try {
            return n() != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(int i, il ilVar, h hVar) {
        try {
            if (this.b >= this.d) {
                throw fN.c();
            }
            this.b++;
            ilVar.mergeFrom(this, hVar);
            e(f7.a(i, 4));
            this.b--;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public byte[] a(int i) {
        boolean z = bA.b;
        if (i < 0) {
            try {
                throw fN.e();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if ((this.a + this.h) + i > this.i) {
                c((this.i - this.a) - this.h);
                throw fN.f();
            } else if (i <= this.g - this.h) {
                Object obj = new byte[i];
                System.arraycopy(this.k, this.h, obj, 0, i);
                this.h += i;
                return obj;
            } else if (i < 4096) {
                Object obj2 = new byte[i];
                r0 = this.g - this.h;
                System.arraycopy(this.k, this.h, obj2, 0, r0);
                this.h = this.g;
                a(true);
                while (i - r0 > this.g) {
                    System.arraycopy(this.k, 0, obj2, r0, this.g);
                    r0 += this.g;
                    this.h = this.g;
                    a(true);
                    if (z) {
                        break;
                    }
                }
                System.arraycopy(this.k, 0, obj2, r0, i - r0);
                this.h = i - r0;
                return obj2;
            } else {
                int i2;
                int i3 = this.h;
                int i4 = this.g;
                this.a += this.g;
                this.h = 0;
                this.g = 0;
                r0 = i - (i4 - i3);
                List<byte[]> arrayList = new ArrayList();
                int i5 = r0;
                while (i5 > 0) {
                    Object obj3 = new byte[Math.min(i5, 4096)];
                    r0 = 0;
                    while (r0 < obj3.length) {
                        try {
                            if (this.j == null) {
                                i2 = -1;
                            } else {
                                i2 = this.j.read(obj3, r0, obj3.length - r0);
                            }
                            if (i2 != -1) {
                                this.a += i2;
                                r0 += i2;
                                if (z) {
                                    break;
                                }
                            }
                            try {
                                throw fN.f();
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                    r0 = i5 - obj3.length;
                    arrayList.add(obj3);
                    if (z) {
                        break;
                    }
                    i5 = r0;
                }
                Object obj4 = new byte[i];
                r0 = i4 - i3;
                System.arraycopy(this.k, i3, obj4, 0, r0);
                i2 = r0;
                for (byte[] bArr : arrayList) {
                    System.arraycopy(bArr, 0, obj4, i2, bArr.length);
                    r0 = bArr.length + i2;
                    if (z) {
                        break;
                    }
                    i2 = r0;
                }
                return obj4;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public float p() {
        return Float.intBitsToFloat(l());
    }

    public int b() {
        return n();
    }

    private boolean a(boolean z) {
        try {
            if (this.h < this.g) {
                throw new IllegalStateException(z[0]);
            }
            try {
                if (this.a + this.g != this.i) {
                    try {
                        this.a += this.g;
                        this.h = 0;
                        try {
                            this.g = this.j == null ? -1 : this.j.read(this.k);
                            if (this.g != 0) {
                                if (this.g >= -1) {
                                    try {
                                        if (this.g == -1) {
                                            this.g = 0;
                                            if (!z) {
                                                return false;
                                            }
                                            throw fN.f();
                                        }
                                        d();
                                        int i = (this.a + this.g) + this.c;
                                        try {
                                            if (i <= this.f && i >= 0) {
                                                return true;
                                            }
                                            throw fN.i();
                                        } catch (IllegalArgumentException e) {
                                            throw e;
                                        } catch (IllegalArgumentException e2) {
                                            throw e2;
                                        }
                                    } catch (IllegalArgumentException e22) {
                                        throw e22;
                                    } catch (IllegalArgumentException e222) {
                                        throw e222;
                                    }
                                }
                            }
                            throw new IllegalStateException(z[2] + this.g + z[1]);
                        } catch (IllegalArgumentException e2222) {
                            throw e2222;
                        } catch (IllegalArgumentException e22222) {
                            throw e22222;
                        }
                    } catch (IllegalArgumentException e222222) {
                        throw e222222;
                    }
                } else if (!z) {
                    return false;
                } else {
                    throw fN.f();
                }
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            } catch (IllegalArgumentException e22222222) {
                throw e22222222;
            }
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        }
    }

    public int t() {
        return n();
    }

    private ad(InputStream inputStream) {
        this.i = Integer.MAX_VALUE;
        this.d = 64;
        this.f = 67108864;
        this.k = new byte[4096];
        this.g = 0;
        this.h = 0;
        this.a = 0;
        this.j = inputStream;
    }

    public boolean d(int i) {
        try {
            switch (f7.b(i)) {
                case v.m /*0*/:
                    i();
                    return true;
                case at.g /*1*/:
                    j();
                    return true;
                case at.i /*2*/:
                    c(n());
                    return true;
                case at.o /*3*/:
                    u();
                    e(f7.a(f7.a(i), 4));
                    return true;
                case at.p /*4*/:
                    return false;
                case at.m /*5*/:
                    l();
                    return true;
                default:
                    throw fN.b();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    public long j() {
        byte h = h();
        byte h2 = h();
        return ((((((((((long) h2) & 255) << 8) | (((long) h) & 255)) | ((((long) h()) & 255) << 16)) | ((((long) h()) & 255) << 24)) | ((((long) h()) & 255) << 32)) | ((((long) h()) & 255) << 40)) | ((((long) h()) & 255) << 48)) | ((((long) h()) & 255) << 56);
    }

    public fO a(T t, h hVar) {
        int n = n();
        try {
            if (this.b >= this.d) {
                throw fN.c();
            }
            int b = b(n);
            this.b++;
            fO fOVar = (fO) t.parsePartialFrom(this, hVar);
            e(0);
            this.b--;
            g(b);
            return fOVar;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean k() {
        try {
            if (this.h == this.g) {
                return !a(false);
            } else {
                return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private ad(byte[] bArr, int i, int i2) {
        this.i = Integer.MAX_VALUE;
        this.d = 64;
        this.f = 67108864;
        this.k = bArr;
        this.g = i + i2;
        this.h = i;
        this.a = -i;
        this.j = null;
    }

    public int g() {
        return f(n());
    }

    public int e() {
        try {
            if (this.i == Integer.MAX_VALUE) {
                return -1;
            }
            return this.i - (this.a + this.h);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public double x() {
        return Double.longBitsToDouble(j());
    }

    private void d() {
        this.g += this.c;
        int i = this.a + this.g;
        try {
            if (i > this.i) {
                this.c = i - this.i;
                this.g -= this.c;
                if (!bA.b) {
                    return;
                }
            }
            this.c = 0;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public long s() {
        return j();
    }

    public static long a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public void e(int i) {
        try {
            if (this.e != i) {
                throw fN.a();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public int f() {
        return l();
    }

    public static int a(int i, InputStream inputStream) {
        boolean z = bA.b;
        if ((i & 128) != 0) {
            int read;
            i &= 127;
            int i2 = 7;
            while (i2 < 32) {
                read = inputStream.read();
                if (read != -1) {
                    i |= (read & 127) << i2;
                    if ((read & 128) == 0) {
                        break;
                    }
                    i2 += 7;
                    if (z) {
                        break;
                    }
                }
                try {
                    throw fN.f();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            while (i2 < 64) {
                read = inputStream.read();
                if (read == -1) {
                    try {
                        throw fN.f();
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } else if ((read & 128) != 0) {
                    i2 += 7;
                    if (z) {
                        break;
                    }
                }
            }
            throw fN.d();
        }
        return i;
    }
}
