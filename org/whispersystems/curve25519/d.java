package org.whispersystems.curve25519;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class d {
    public static int a;
    private static final String[] z;
    private final K b;

    static {
        String[] strArr = new String[9];
        String str = ",Bg\u0006\\\u0013Qg\u0002-S\u0016 ^O\u0014Lg\u000e{\u0003Q";
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
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 35;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0004Fb\u0013";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\f\u0011|\u0002";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\bBe\u000ei\u0003";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "(Be\u000ei\u0003`d\u0015i\u0003\u0011$R._sc\bi\u000fGt\u0015";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ",\u0011|\u0002\\\u0013Qg\u0002-S\u0016 ^O\u0014Lg\u000e{\u0003Q";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\tQvIh\u000eJb\u0017z\u0014Ph\u0014k\u0003NbI|\u0013Qg\u0002-S\u0016 ^1";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ")Sa\bm\u0012V\u007f\u000el\u0012Jr$j\u0014UtU*S\u0012(7m\tUx\u0003z\u0014";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\fBg\u0006";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static K c(X x) {
        return a(z[0], x);
    }

    public a8 a() {
        byte[] a = this.b.a();
        return new a8(this.b.generatePublicKey(a), a);
    }

    private static K b(X x) {
        return a(z[5], x);
    }

    public boolean a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.b.verifySignature(bArr, bArr2, bArr3);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.b.calculateSignature(this.b.a(64), bArr, bArr2);
    }

    public static d b(String str, X x) {
        try {
            if (z[4].equals(str)) {
                return new d(b(x));
            }
            try {
                if (z[1].equals(str)) {
                    return new d(c(x));
                }
                try {
                    if (z[3].equals(str)) {
                        return new d(a(x));
                    }
                    try {
                        if (z[2].equals(str)) {
                            return new d(d(x));
                        }
                        throw new e(str);
                    } catch (e e) {
                        throw e;
                    }
                } catch (e e2) {
                    throw e2;
                }
            } catch (e e22) {
                throw e22;
            }
        } catch (e e222) {
            throw e222;
        }
    }

    public static d a(String str) {
        return b(str, null);
    }

    private static K d(X x) {
        return a(z[8], x);
    }

    private static K a(X x) {
        return a(z[6], x);
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.b.calculateAgreement(bArr2, bArr);
    }

    private static K a(String str, X x) {
        try {
            K k = (K) Class.forName(z[7] + str).newInstance();
            if (x != null) {
                k.a(x);
            }
            return k;
        } catch (InstantiationException e) {
            throw e;
        } catch (Throwable e2) {
            throw new e(e2);
        } catch (Throwable e22) {
            throw new e(e22);
        } catch (Throwable e222) {
            throw new e(e222);
        }
    }

    private d(K k) {
        this.b = k;
    }
}
