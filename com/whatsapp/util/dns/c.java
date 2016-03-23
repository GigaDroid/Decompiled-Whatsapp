package com.whatsapp.util.dns;

import com.whatsapp.WAAppCompatActivity;
import java.io.OutputStream;
import org.v;
import org.whispersystems.at;

class c {
    private static final String[] z;
    private final short a;
    private final boolean b;
    private final short c;
    private final short d;
    private final short e;
    private final boolean f;
    private final boolean g;
    private final short h;
    private final boolean i;
    private final boolean j;
    private final short k;
    private final byte l;

    static {
        String[] strArr = new String[4];
        String str = "XHTf:\u001a\\AziT^T#+_\u0011Nv%V";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 58;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 32;
                        break;
                    case at.o /*3*/:
                        i3 = 3;
                        break;
                    default:
                        i3 = 73;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "XHTf:\u001aUOf:\u001a_OwiY^Nw(S_\u0000f'UDGkiIAA`,";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "XHTf:\u001a\\AziT^T#+_\u0011Nv%V";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "XHTf:\u001aUOf:\u001a_OwiY^Nw(S_\u0000f'UDGki^PTb";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    byte[] h() {
        byte[] bArr = new byte[12];
        b(bArr, 0);
        return bArr;
    }

    boolean b() {
        return this.j;
    }

    short d() {
        return this.e;
    }

    short g() {
        return this.d;
    }

    c(short s, boolean z, byte b, boolean z2, boolean z3, boolean z4, boolean z5, short s2, short s3, short s4, short s5, short s6) {
        this.h = s;
        this.j = z;
        this.l = b;
        this.i = z2;
        this.b = z3;
        this.f = z4;
        this.g = z5;
        this.e = s2;
        this.k = s3;
        this.d = s4;
        this.a = s5;
        this.c = s6;
    }

    short e() {
        return this.k;
    }

    static c a(byte[] bArr, int i) {
        boolean z = false;
        int i2 = i.a;
        if (bArr == null) {
            try {
                throw new NullPointerException(z[0]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            if (bArr.length < i + 12) {
                throw new IllegalArgumentException(z[1]);
            }
            short b = a.b(bArr, i);
            try {
                boolean z2;
                if ((bArr[i + 2] & 128) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                byte b2 = (byte) ((bArr[i + 2] >> 3) & 15);
                try {
                    boolean z3 = (bArr[i + 2] & 4) != 0;
                    try {
                        boolean z4 = (bArr[i + 2] & 2) != 0;
                        try {
                            boolean z5 = (bArr[i + 2] & 1) != 0;
                            try {
                                if ((bArr[i + 3] & 128) != 0) {
                                    z = true;
                                }
                                try {
                                    c cVar = new c(b, z2, b2, z3, z4, z5, z, (short) ((byte) (bArr[i + 3] & 15)), a.b(bArr, i + 4), a.b(bArr, i + 6), a.b(bArr, i + 8), a.b(bArr, i + 10));
                                    if (WAAppCompatActivity.c != 0) {
                                        i.a = i2 + 1;
                                    }
                                    return cVar;
                                } catch (NullPointerException e2) {
                                    throw e2;
                                }
                            } catch (NullPointerException e22) {
                                throw e22;
                            }
                        } catch (NullPointerException e222) {
                            throw e222;
                        }
                    } catch (NullPointerException e2222) {
                        throw e2222;
                    }
                } catch (NullPointerException e22222) {
                    throw e22222;
                }
            } catch (NullPointerException e222222) {
                throw e222222;
            }
        } catch (NullPointerException e2222222) {
            throw e2222222;
        }
    }

    void a(OutputStream outputStream) {
        outputStream.write(h());
    }

    void b(byte[] bArr, int i) {
        int i2 = 128;
        int i3 = 2;
        int i4 = i.a;
        if (bArr == null) {
            try {
                throw new NullPointerException(z[3]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            if (bArr.length < i + 12) {
                throw new IllegalArgumentException(z[2]);
            }
            try {
                int i5;
                a.a(this.h, bArr, i);
                bArr[i + 2] = (byte) 0;
                int i6 = i + 2;
                byte b = bArr[i6];
                if (this.j) {
                    i5 = 128;
                } else {
                    i5 = 0;
                }
                try {
                    bArr[i6] = (byte) (i5 | b);
                    i5 = i + 2;
                    bArr[i5] = (byte) (bArr[i5] | ((byte) ((this.l & 15) << 3)));
                    i6 = i + 2;
                    try {
                        bArr[i6] = (byte) ((this.i ? 4 : 0) | bArr[i6]);
                        i5 = i + 2;
                        byte b2 = bArr[i5];
                        if (!this.b) {
                            i3 = 0;
                        }
                        try {
                            bArr[i5] = (byte) (i3 | b2);
                            i5 = i + 2;
                            b2 = bArr[i5];
                            if (this.f) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            try {
                                bArr[i5] = (byte) (i3 | b2);
                                bArr[i + 3] = (byte) 0;
                                i3 = i + 3;
                                byte b3 = bArr[i3];
                                if (!this.g) {
                                    i2 = 0;
                                }
                                bArr[i3] = (byte) (i2 | b3);
                                i2 = i + 3;
                                bArr[i2] = (byte) (bArr[i2] | ((byte) (this.e & 15)));
                                a.a(this.k, bArr, i + 4);
                                a.a(this.d, bArr, i + 6);
                                a.a(this.a, bArr, i + 8);
                                a.a(this.c, bArr, i + 10);
                                if (i4 != 0) {
                                    WAAppCompatActivity.c++;
                                }
                            } catch (NullPointerException e2) {
                                throw e2;
                            }
                        } catch (NullPointerException e22) {
                            throw e22;
                        }
                    } catch (NullPointerException e222) {
                        throw e222;
                    }
                } catch (NullPointerException e2222) {
                    throw e2222;
                }
            } catch (NullPointerException e22222) {
                throw e22222;
            }
        } catch (NullPointerException e222222) {
            throw e222222;
        }
    }

    short f() {
        return this.h;
    }

    public int a() {
        return 12;
    }

    boolean c() {
        return this.b;
    }
}
