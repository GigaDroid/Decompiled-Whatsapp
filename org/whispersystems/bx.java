package org.whispersystems;

import org.v;
import org.whispersystems.curve25519.a8;
import org.whispersystems.curve25519.d;

public class bx {
    public static int a;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "<W$\"";
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
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = 50;
                        break;
                    case at.i /*2*/:
                        i3 = 87;
                        break;
                    case at.o /*3*/:
                        i3 = 86;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001cS3vp;Kw\"b.Wmv";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u000b\\<8t)\\w\"b.Wmv";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "<W$\"";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "<W$\"";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000eG5:r=\u001268\u007f~B%?m?F2vp;K$vv+A#vy;\u001280;*Z2vh?_2vo'B2w";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "<W$\"";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u000b\\<8t)\\w\"b.Wmv";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000b\\<8t)\\w\"b.Wmv";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static u a(byte[] bArr) {
        return new aA(bArr);
    }

    public static byte[] a(u uVar, byte[] bArr) {
        if (uVar.a() == 5) {
            return d.a(z[0]).a(((aA) uVar).a(), bArr);
        }
        throw new av(z[1] + uVar.a());
    }

    public static e a() {
        a8 a = d.a(z[5]).a();
        return new e(new b8(a.a()), new aA(a.b()));
    }

    public static E a(byte[] bArr, int i) {
        boolean z = false;
        int i2 = a;
        int i3 = bArr[i] & 255;
        switch (i3) {
            case at.m /*5*/:
                Object obj = new byte[32];
                System.arraycopy(bArr, i + 1, obj, 0, obj.length);
                E b8Var = new b8(obj);
                if (i2 != 0) {
                    if (!a5.o) {
                        z = true;
                    }
                    a5.o = z;
                }
                return b8Var;
            default:
                throw new av(z[2] + i3);
        }
    }

    public static boolean a(E e, byte[] bArr, byte[] bArr2) {
        if (e.b() == 5) {
            return d.a(z[4]).a(((b8) e).b(), bArr, bArr2);
        }
        throw new av(z[3] + e.b());
    }

    public static byte[] a(E e, u uVar) {
        int i = a;
        if (e.b() != uVar.a()) {
            throw new av(z[6]);
        } else if (e.b() == 5) {
            byte[] b = d.a(z[7]).b(((b8) e).b(), ((aA) uVar).a());
            if (a5.o) {
                a = i + 1;
            }
            return b;
        } else {
            throw new av(z[8] + e.b());
        }
    }
}
