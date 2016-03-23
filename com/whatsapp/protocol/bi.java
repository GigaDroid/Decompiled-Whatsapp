package com.whatsapp.protocol;

import com.whatsapp.arj;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class bi implements bc {
    private static final String[] z;
    private byte[] a;
    private final cm b;
    private final String[] c;
    private final cn d;
    private final String[] e;

    static {
        String[] strArr = new String[16];
        String str = "D\u000fbofEJdv#T\u0006y|mCJcmbY\u0010q9eE\u000bwtfY\u001eqmjX\u00040wlCJclsG\u0005bmfS";
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
                        i3 = 55;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 16;
                        break;
                    case at.o /*3*/:
                        i3 = 25;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001a[0ml\\\u000f~9jYJb|bS9dkjY\r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "E\u000fq}PC\u0018ywd\u0017\t\u007floS\u00047m#Z\u000bdzk\u0017\u001e\u007frfY";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "E\u000b~9lB\u001e0ve\u0017\bimfDJgqj[\u000f0kfV\u000eywd\u0017\u0003~ml\u0017\be\u007feR\u0018";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "_\u000fq}fEJ\u007fwoNJvkbZ\u000f0kfT\u000fyofS";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "U\u000bt9kR\u00120";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "^\u0004fxo^\u000e0ml\\\u000f~6oR\u0004wmk\u0017\u0003~9dR\u001eDvhR\u0004";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "U\u000bt9sV\t{|g\u0017\u001eiif\u0017";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Y\u000fhmWE\u000fu9pR\u000fc93\u0017\u0006yjw\u0017\u0005b9mB\u0006|9wV\r";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "U\u000bt9m^\bruf\u0017";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "^\u0004fxo^\u000e0ujD\u001e0jjM\u000f0pm\u0017\u0018uxg{\u0003cmP^\u0010u##C\u0005{|m\u0017";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001bJ";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "D\u0003j|#\nJ";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Y\u001f|u";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "^\u0004fxo^\u000e0ml\\\u000f~6oR\u0004wmk\u0017\u0003~9fO\u001euwgR\u000e0~fC>\u007frfY";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "E\u000fq}PC\u0018ywd\u0017\t\u007floS\u00047m#E\u000fsvmD\u001ebl`CJzpg";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static int a(InputStream inputStream) {
        return (inputStream.read() << 8) + inputStream.read();
    }

    private static int a(int i, int i2) {
        switch (i) {
            case 251:
                return a(i2);
            case 255:
                return c(i2);
            default:
                throw new cz(z[8] + i);
        }
    }

    private static byte[] a(InputStream inputStream, int i) {
        int i2 = 1;
        int i3 = 0;
        boolean z = co.s;
        int b = b(inputStream);
        int i4 = (b & 128) != 0 ? 1 : 0;
        b &= 127;
        byte[] bArr = new byte[b];
        a(inputStream, bArr);
        b *= 2;
        if (i4 == 0) {
            i2 = 0;
        }
        i4 = b - i2;
        byte[] bArr2 = new byte[i4];
        while (i3 < i4) {
            b = (1 - (i3 % 2)) * 4;
            bArr2[i3] = (byte) a(i, (bArr[i3 / 2] & (15 << b)) >> b);
            i3++;
            if (z) {
                break;
            }
        }
        return bArr2;
    }

    public cw m1032a() {
        byte[] a = a();
        this.a = a;
        InputStream byteArrayInputStream = new ByteArrayInputStream(a);
        if ((((byte) byteArrayInputStream.read()) & b7.c) == 0) {
            return d(byteArrayInputStream);
        }
        throw new cz(z[0]);
    }

    private static boolean b(int i) {
        switch (i) {
            case v.m /*0*/:
            case 248:
            case 249:
                return true;
            default:
                return false;
        }
    }

    private static int e(InputStream inputStream) {
        return (((inputStream.read() & 15) << 16) + (inputStream.read() << 8)) + inputStream.read();
    }

    private ce[] e(InputStream inputStream, int i) {
        boolean z = co.s;
        ce[] ceVarArr = new ce[i];
        int i2 = 0;
        while (i2 < i) {
            ceVarArr[i2] = new ce(d(inputStream, inputStream.read()), d(inputStream, inputStream.read()));
            i2++;
            if (z) {
                break;
            }
        }
        return ceVarArr;
    }

    private static void a(InputStream inputStream, byte[] bArr) {
        boolean z = co.s;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read(bArr, i, length - i);
            if (read == -1) {
                throw new IOException(z[4]);
            }
            i += read;
            if (z) {
                return;
            }
        }
    }

    private static int c(InputStream inputStream) {
        return ((((inputStream.read() & 127) << 24) | (inputStream.read() << 16)) | (inputStream.read() << 8)) | inputStream.read();
    }

    private static int a(int i) {
        switch (i) {
            case v.m /*0*/:
            case at.g /*1*/:
            case at.i /*2*/:
            case at.o /*3*/:
            case at.p /*4*/:
            case at.m /*5*/:
            case Y.f /*6*/:
            case aF.v /*7*/:
            case aF.u /*8*/:
            case Y.l /*9*/:
                return i + 48;
            case Y.t /*10*/:
            case Y.j /*11*/:
            case Y.p /*12*/:
            case Y.q /*13*/:
            case arj.Toolbar_titleMarginEnd /*14*/:
            case arj.Toolbar_titleMarginTop /*15*/:
                return (i - 10) + 65;
            default:
                throw new cz(z[6] + i);
        }
    }

    public cw a(byte[] bArr) {
        return d(new ByteArrayInputStream(bArr));
    }

    private cw d(InputStream inputStream) {
        int b = b(inputStream, inputStream.read());
        int read = inputStream.read();
        if (read == 2) {
            return null;
        }
        String d = d(inputStream, read);
        if (b == 0 || d == null) {
            throw new cz(z[9], b());
        }
        ce[] e = e(inputStream, ((b - 2) + (b % 2)) / 2);
        if (b % 2 == 1) {
            return new cw(d, e);
        }
        int read2 = inputStream.read();
        if (b(read2)) {
            return new cw(d, e, c(inputStream, read2));
        }
        byte[] bArr;
        if (read2 == 252) {
            bArr = new byte[b(inputStream)];
            a(inputStream, bArr);
            return new cw(d, e, bArr);
        } else if (read2 == 253) {
            bArr = new byte[e(inputStream)];
            a(inputStream, bArr);
            return new cw(d, e, bArr);
        } else if (read2 != 254) {
            return (read2 == 255 || read2 == 251) ? new cw(d, e, a(inputStream, read2)) : new cw(d, e, d(inputStream, read2));
        } else {
            bArr = new byte[c(inputStream)];
            a(inputStream, bArr);
            return new cw(d, e, bArr);
        }
    }

    private static int c(int i) {
        switch (i) {
            case v.m /*0*/:
            case at.g /*1*/:
            case at.i /*2*/:
            case at.o /*3*/:
            case at.p /*4*/:
            case at.m /*5*/:
            case Y.f /*6*/:
            case aF.v /*7*/:
            case aF.u /*8*/:
            case Y.l /*9*/:
                return i + 48;
            case Y.t /*10*/:
            case Y.j /*11*/:
                return (i - 10) + 45;
            default:
                throw new cz(z[10] + i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String d(int r4) {
        /*
        r3 = this;
        if (r4 < 0) goto L_0x000f;
    L_0x0002:
        r0 = r3.e;
        r0 = r0.length;
        if (r4 >= r0) goto L_0x000f;
    L_0x0007:
        r0 = r3.e;
        r0 = r0[r4];
        r1 = com.whatsapp.protocol.co.s;
        if (r1 == 0) goto L_0x0010;
    L_0x000f:
        r0 = 0;
    L_0x0010:
        if (r0 != 0) goto L_0x0021;
    L_0x0012:
        r0 = new com.whatsapp.protocol.cz;
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r2 = r3.b();
        r0.<init>(r1, r2);
        throw r0;
    L_0x0021:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bi.d(int):java.lang.String");
    }

    private String d(InputStream inputStream, int i) {
        if (i == -1) {
            throw new cz(z[2], b());
        } else if (i > 2 && i < 236) {
            return d(i);
        } else {
            byte[] bArr;
            switch (i) {
                case v.m /*0*/:
                    return null;
                case 236:
                case 237:
                case 238:
                case 239:
                    return b(i - 236, b(inputStream));
                case 250:
                    String d = d(inputStream, inputStream.read());
                    String d2 = d(inputStream, inputStream.read());
                    if (d != null && d2 != null) {
                        return d + "@" + d2;
                    }
                    if (d2 != null) {
                        return d2;
                    }
                    throw new cz(z[1], b());
                case 251:
                case 255:
                    return b7.a(a(inputStream, i));
                case 252:
                    bArr = new byte[b(inputStream)];
                    a(inputStream, bArr);
                    return b7.a(bArr);
                case 253:
                    bArr = new byte[e(inputStream)];
                    a(inputStream, bArr);
                    return b7.a(bArr);
                case 254:
                    bArr = new byte[c(inputStream)];
                    a(inputStream, bArr);
                    return b7.a(bArr);
                default:
                    throw new cz(z[3], b());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(int r4, int r5) {
        /*
        r3 = this;
        r0 = r4 * 256;
        r0 = r0 + r5;
        if (r0 < 0) goto L_0x0012;
    L_0x0005:
        r1 = r3.c;
        r1 = r1.length;
        if (r0 >= r1) goto L_0x0012;
    L_0x000a:
        r1 = r3.c;
        r0 = r1[r0];
        r1 = com.whatsapp.protocol.co.s;
        if (r1 == 0) goto L_0x0013;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        if (r0 != 0) goto L_0x0025;
    L_0x0015:
        r0 = new com.whatsapp.protocol.cz;
        r1 = z;
        r2 = 15;
        r1 = r1[r2];
        r2 = r3.b();
        r0.<init>(r1, r2);
        throw r0;
    L_0x0025:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bi.b(int, int):java.lang.String");
    }

    public String b() {
        boolean z = co.s;
        if (this.a == null) {
            return z[14];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z[13]).append(Integer.toString(this.a.length)).append('<');
        int i = 0;
        while (i < this.a.length) {
            if (i > 0) {
                stringBuffer.append(z[12]);
            }
            stringBuffer.append(Integer.toString(this.a[i] & 255));
            i++;
            if (z) {
                break;
            }
        }
        stringBuffer.append('>');
        return stringBuffer.toString();
    }

    private cw[] c(InputStream inputStream, int i) {
        boolean z = co.s;
        int b = b(inputStream, i);
        cw[] cwVarArr = new cw[b];
        int i2 = 0;
        while (i2 < b) {
            cwVarArr[i2] = d(inputStream);
            i2++;
            if (z) {
                break;
            }
        }
        return cwVarArr;
    }

    private int b(InputStream inputStream, int i) {
        switch (i) {
            case v.m /*0*/:
                return 0;
            case 248:
                return b(inputStream);
            case 249:
                return a(inputStream);
            default:
                throw new cz(z[11] + i, b());
        }
    }

    public bi(cn cnVar, cm cmVar, String[] strArr, String[] strArr2) {
        this.d = cnVar;
        this.b = cmVar;
        this.e = strArr;
        this.c = strArr2;
    }

    private byte[] a() {
        byte[] a;
        do {
            a = this.d.a();
        } while (a.length == 0);
        if (a.length == 1) {
            throw new cz(z[5]);
        }
        if ((b7.e & a[0]) == 0) {
            return a;
        }
        return this.b.a(a, 1, a.length - 1, new byte[]{r1});
    }

    private static int b(InputStream inputStream) {
        return inputStream.read();
    }
}
