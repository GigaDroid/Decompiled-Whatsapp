package com.google;

import com.whatsapp.arj;
import java.util.EnumMap;
import java.util.Map;
import org.v;
import org.whispersystems.at;

final class gv {
    private static final int[] c;
    private static final String[] z;
    private final int[] a;
    private final StringBuilder b;

    int a(d_ d_Var, int[] iArr, StringBuilder stringBuilder) {
        int i = aU.a;
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = d_Var.d();
        int i2 = 0;
        int i3 = 0;
        int i4 = iArr[1];
        while (i2 < 5 && i4 < d) {
            int a = aH.a(d_Var, iArr2, i4, aH.g);
            stringBuilder.append((char) ((a % 10) + 48));
            int length = iArr2.length;
            int i5 = 0;
            while (i5 < length) {
                i4 += iArr2[i5];
                i5++;
                if (i != 0) {
                    break;
                }
            }
            if (a >= 10) {
                i3 |= 1 << (4 - i2);
            }
            if (i2 != 4) {
                i4 = d_Var.d(d_Var.c(i4));
            }
            i5 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i5;
        }
        if (stringBuilder.length() != 5) {
            throw aN.a();
        }
        if (a(stringBuilder.toString()) == a(i3)) {
            return i4;
        }
        throw aN.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r5) {
        /*
        r4 = 1;
        r3 = 0;
        r1 = com.google.aU.a;
        r0 = r5.charAt(r3);
        switch(r0) {
            case 48: goto L_0x0052;
            case 53: goto L_0x0057;
            case 57: goto L_0x005c;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = "";
    L_0x000e:
        r1 = r5.substring(r4);
        r1 = java.lang.Integer.parseInt(r1);
        r2 = r1 / 100;
        r2 = java.lang.String.valueOf(r2);
        r1 = r1 % 100;
        r3 = 10;
        if (r1 >= r3) goto L_0x0090;
    L_0x0022:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "0";
        r3 = r3.append(r4);
        r1 = r3.append(r1);
        r1 = r1.toString();
    L_0x0036:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = r3.append(r0);
        r0 = r0.append(r2);
        r2 = 46;
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x0051:
        return r0;
    L_0x0052:
        r0 = "\u00a3";
        if (r1 == 0) goto L_0x000e;
    L_0x0057:
        r0 = "$";
        if (r1 == 0) goto L_0x000e;
    L_0x005c:
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x0069;
    L_0x0067:
        r0 = 0;
        goto L_0x0051;
    L_0x0069:
        r0 = z;
        r2 = 3;
        r0 = r0[r2];
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x0079;
    L_0x0074:
        r0 = z;
        r0 = r0[r4];
        goto L_0x0051;
    L_0x0079:
        r0 = z;
        r0 = r0[r3];
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x0089;
    L_0x0083:
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        goto L_0x0051;
    L_0x0089:
        r0 = "";
        if (r1 == 0) goto L_0x000e;
    L_0x008e:
        goto L_0x000b;
    L_0x0090:
        r1 = java.lang.String.valueOf(r1);
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gv.a(java.lang.String):java.lang.String");
    }

    private static int a(CharSequence charSequence) {
        int i = aU.a;
        int length = charSequence.length();
        int i2 = 0;
        int i3 = length - 2;
        while (i3 >= 0) {
            i2 += charSequence.charAt(i3) - 48;
            i3 -= 2;
            if (i != 0) {
                break;
            }
        }
        i2 *= 3;
        i3 = length - 1;
        while (i3 >= 0) {
            i2 += charSequence.charAt(i3) - 48;
            i3 -= 2;
            if (i != 0) {
                break;
            }
        }
        return (i2 * 3) % 10;
    }

    f6 a(int i, d_ d_Var, int[] iArr) {
        StringBuilder stringBuilder = this.b;
        stringBuilder.setLength(0);
        int a = a(d_Var, iArr, stringBuilder);
        String stringBuilder2 = stringBuilder.toString();
        Map b = b(stringBuilder2);
        f6 f6Var = new f6(stringBuilder2, null, new fI[]{new fI(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i), new fI((float) a, (float) i)}, gg.UPC_EAN_EXTENSION);
        if (b != null) {
            f6Var.a(b);
        }
        return f6Var;
    }

    gv() {
        this.a = new int[4];
        this.b = new StringBuilder();
    }

    private static int a(int i) {
        int i2 = aU.a;
        int i3 = 0;
        while (i3 < 10) {
            if (i != c[i3]) {
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return i3;
        }
        throw aN.a();
    }

    static {
        String[] strArr = new String[5];
        String str = "Q\fz/H";
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
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 53;
                        break;
                    case at.i /*2*/:
                        i3 = 67;
                        break;
                    case at.o /*3*/:
                        i3 = 22;
                        break;
                    default:
                        i3 = 120;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Q\u0005s&H";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Q\fz/I";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "=F&r";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new int[]{24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
                    return;
                default:
                    strArr2[i] = str;
                    str = "X\u001bs&";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static Map b(String str) {
        if (str.length() != 5) {
            return null;
        }
        String a = a(str);
        if (a == null) {
            return null;
        }
        Map enumMap = new EnumMap(eD.class);
        enumMap.put(eD.SUGGESTED_PRICE, a);
        return enumMap;
    }
}
