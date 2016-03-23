package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public final class y {
    private static final String[] z;
    private final aj a;

    static {
        String[] strArr = new String[5];
        String str = "\u0010c;\f[=e#EI8m\"\u0017A b EN5c!\u0000Lt~\"EZ1n8\u0006Mtz\"\tQ:e \fI85";
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
                        i3 = 84;
                        break;
                    case at.g /*1*/:
                        i3 = 10;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i3 = 40;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "&U6\f\u0005ewm\u0012I'*7\u0000Z;";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0011x?\nZtf\"\u0006I e?EL1m?\u0000Mtn\"\u0000[td\"\u0011\b9k9\u0006@td8\bJ1xm\nNtx\"\n\\'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0016k)EM&x\"\u0017\b8e.\u0004\\=e#";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "'c*\bI\u0000c!\u0001M|:dE_5ym\u001fM&e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private int[] a(ht htVar) {
        int i = 0;
        int i2 = 1;
        int i3 = aj.l;
        int a = htVar.a();
        if (a == 1) {
            try {
                return new int[]{htVar.c(1)};
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        int[] iArr = new int[a];
        while (i2 < this.a.c() && i < a) {
            try {
                if (htVar.a(i2) == 0) {
                    iArr[i] = this.a.b(i2);
                    i++;
                }
                i2++;
                if (i3 != 0) {
                    break;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        if (i == a) {
            return iArr;
        }
        try {
            throw new em(z[3]);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private ht[] a(ht htVar, ht htVar2, int i) {
        ht b;
        int i2 = aj.l;
        if (htVar.a() >= htVar2.a()) {
            ht htVar3 = htVar2;
            htVar2 = htVar;
            htVar = htVar3;
        }
        ht b2 = this.a.b();
        ht d = this.a.d();
        while (htVar.a() >= i / 2) {
            try {
                if (htVar.c()) {
                    throw new em(z[2]);
                }
                b = this.a.b();
                int b3 = this.a.b(htVar.c(htVar.a()));
                while (htVar2.a() >= htVar.a() && !htVar2.c()) {
                    int a = htVar2.a() - htVar.a();
                    int b4 = this.a.b(htVar2.c(htVar2.a()), b3);
                    b = b.c(this.a.a(a, b4));
                    htVar2 = htVar2.c(htVar.a(a, b4));
                    if (i2 != 0) {
                        break;
                    }
                }
                ht htVar4 = b;
                b = htVar2;
                b2 = htVar4.a(d).c(b2);
                try {
                    if (b.a() >= htVar.a()) {
                        throw new IllegalStateException(z[0]);
                    } else if (i2 != 0) {
                        break;
                    } else {
                        htVar2 = htVar;
                        htVar = b;
                        htVar3 = d;
                        d = b2;
                        b2 = htVar3;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        b2 = d;
        b = htVar;
        int c = b2.c(0);
        if (c == 0) {
            try {
                throw new em(z[1]);
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        c = this.a.b(c);
        b2 = b2.b(c);
        d = b.b(c);
        return new ht[]{b2, d};
    }

    public void a(int[] iArr, int i) {
        int i2 = 0;
        int i3 = aj.l;
        ht htVar = new ht(this.a, iArr);
        int[] iArr2 = new int[i];
        int i4 = 0;
        int i5 = 1;
        while (i4 < i) {
            int a = htVar.a(this.a.c(this.a.a() + i4));
            iArr2[(iArr2.length - 1) - i4] = a;
            if (a != 0) {
                i5 = 0;
            }
            i4++;
            if (i3 != 0) {
                break;
            }
        }
        if (i5 == 0) {
            ht[] a2 = a(this.a.a(i, 1), new ht(this.a, iArr2), i);
            ht htVar2 = a2[0];
            ht htVar3 = a2[1];
            int[] a3 = a(htVar2);
            int[] a4 = a(htVar3, a3);
            while (i2 < a3.length) {
                int length = (iArr.length - 1) - this.a.a(a3[i2]);
                if (length < 0) {
                    try {
                        throw new em(z[4]);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                iArr[length] = aj.c(iArr[length], a4[i2]);
                i2++;
                if (i3 != 0) {
                    return;
                }
            }
        }
    }

    private int[] a(ht htVar, int[] iArr) {
        int i = aj.l;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i2 = 0;
        while (i2 < length) {
            int b;
            int b2 = this.a.b(iArr[i2]);
            int i3 = 1;
            int i4 = 0;
            while (i4 < length) {
                if (i2 != i4) {
                    b = this.a.b(iArr[i4], b2);
                    if ((b & 1) == 0) {
                        b |= 1;
                    } else {
                        b &= -2;
                    }
                    b = this.a.b(i3, b);
                } else {
                    b = i3;
                }
                i3 = i4 + 1;
                if (i == 0) {
                    i4 = i3;
                    i3 = b;
                }
                break;
            }
            b = i3;
            try {
                break;
                iArr2[i2] = this.a.b(htVar.a(b2), this.a.b(b));
                if (this.a.a() != 0) {
                    iArr2[i2] = this.a.b(iArr2[i2], b2);
                }
                b = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = b;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return iArr2;
    }

    public y(aj ajVar) {
        this.a = ajVar;
    }
}
