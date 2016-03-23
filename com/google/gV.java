package com.google;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class gV {
    private static final String[] a;
    private static final String[] b;
    private static final String[] c;
    private static final String[] d;
    public static boolean f;
    private static final String[] g;
    private static final String[] z;
    private by e;

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    private static String a(boolean[] zArr) {
        boolean z = f;
        int length = zArr.length;
        S s = S.UPPER;
        S s2 = S.UPPER;
        StringBuilder stringBuilder = new StringBuilder(20);
        int i = 0;
        while (i < length) {
            try {
                int a;
                S s3;
                if (s2 == S.BINARY) {
                    if (length - i < 5 && !z) {
                        break;
                    }
                    a = a(zArr, i, 5);
                    i += 5;
                    if (a == 0) {
                        if (length - i < 11 && !z) {
                            break;
                        }
                        a = a(zArr, i, 11) + 31;
                        i += 11;
                    }
                    int i2 = 0;
                    while (i2 < a) {
                        if (length - i < 8) {
                            if (!z) {
                                a = length;
                                break;
                            }
                            i = length;
                        }
                        stringBuilder.append((char) a(zArr, i, 8));
                        i += 8;
                        i2++;
                        if (z) {
                            break;
                        }
                    }
                    a = i;
                    if (z) {
                        i = a;
                        s3 = s;
                    } else {
                        i = a;
                        s2 = s;
                    }
                } else {
                    s3 = s2;
                }
                try {
                    if (s3 == S.DIGIT) {
                        a = 4;
                    } else {
                        a = 5;
                    }
                    if (length - i < a && !z) {
                        break;
                    }
                    int a2 = a(zArr, i, a);
                    i += a;
                    String a3 = a(s3, a2);
                    if (a3.startsWith(z[0])) {
                        s2 = a(a3.charAt(5));
                        if (a3.charAt(6) == 'L') {
                            if (!z) {
                                s = s2;
                            }
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        s2 = s;
                    }
                    stringBuilder.append(a3);
                    s = s2;
                    if (z) {
                        break;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean[] b(boolean[] r14) {
        /*
        r13 = this;
        r6 = f;
        r0 = r13.e;
        r0 = r0.b();
        r1 = 2;
        if (r0 > r1) goto L_0x0010;
    L_0x000b:
        r0 = 6;
        r1 = com.google.aj.o;
        if (r6 == 0) goto L_0x0034;
    L_0x0010:
        r0 = r13.e;	 Catch:{ em -> 0x0046 }
        r0 = r0.b();	 Catch:{ em -> 0x0046 }
        r1 = 8;
        if (r0 > r1) goto L_0x0020;
    L_0x001a:
        r0 = 8;
        r1 = com.google.aj.b;
        if (r6 == 0) goto L_0x0034;
    L_0x0020:
        r0 = r13.e;	 Catch:{ em -> 0x0048 }
        r0 = r0.b();	 Catch:{ em -> 0x0048 }
        r1 = 22;
        if (r0 > r1) goto L_0x0030;
    L_0x002a:
        r0 = 10;
        r1 = com.google.aj.p;
        if (r6 == 0) goto L_0x0034;
    L_0x0030:
        r0 = 12;
        r1 = com.google.aj.a;
    L_0x0034:
        r2 = r13.e;
        r7 = r2.a();
        r2 = r14.length;
        r4 = r2 / r0;
        if (r4 >= r7) goto L_0x004a;
    L_0x003f:
        r0 = com.google.aG.a();	 Catch:{ em -> 0x0044 }
        throw r0;	 Catch:{ em -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r2 = r14.length;
        r3 = r2 % r0;
        r5 = r4 - r7;
        r8 = new int[r4];
        r2 = 0;
    L_0x0052:
        if (r2 >= r4) goto L_0x005f;
    L_0x0054:
        r9 = a(r14, r3, r0);
        r8[r2] = r9;
        r2 = r2 + 1;
        r3 = r3 + r0;
        if (r6 == 0) goto L_0x0052;
    L_0x005f:
        r2 = new com.google.y;	 Catch:{ em -> 0x007f }
        r2.<init>(r1);	 Catch:{ em -> 0x007f }
        r2.a(r8, r5);	 Catch:{ em -> 0x007f }
        r1 = 1;
        r1 = r1 << r0;
        r9 = r1 + -1;
        r2 = 0;
        r1 = 0;
        r12 = r1;
        r1 = r2;
        r2 = r12;
    L_0x0070:
        if (r2 >= r7) goto L_0x0092;
    L_0x0072:
        r3 = r8[r2];
        if (r3 == 0) goto L_0x0078;
    L_0x0076:
        if (r3 != r9) goto L_0x0085;
    L_0x0078:
        r0 = com.google.aG.a();	 Catch:{ em -> 0x007d }
        throw r0;	 Catch:{ em -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        r0 = com.google.aG.a();
        throw r0;
    L_0x0085:
        r4 = 1;
        if (r3 == r4) goto L_0x008c;
    L_0x0088:
        r4 = r9 + -1;
        if (r3 != r4) goto L_0x008e;
    L_0x008c:
        r1 = r1 + 1;
    L_0x008e:
        r2 = r2 + 1;
        if (r6 == 0) goto L_0x0070;
    L_0x0092:
        r2 = r7 * r0;
        r1 = r2 - r1;
        r10 = new boolean[r1];
        r2 = 0;
        r1 = 0;
        r5 = r1;
    L_0x009b:
        if (r5 >= r7) goto L_0x00cf;
    L_0x009d:
        r11 = r8[r5];
        r1 = 1;
        if (r11 == r1) goto L_0x00a6;
    L_0x00a2:
        r1 = r9 + -1;
        if (r11 != r1) goto L_0x00dc;
    L_0x00a6:
        r1 = r2 + r0;
        r3 = r1 + -1;
        r1 = 1;
        if (r11 <= r1) goto L_0x00d0;
    L_0x00ad:
        r1 = 1;
    L_0x00ae:
        java.util.Arrays.fill(r10, r2, r3, r1);
        r1 = r0 + -1;
        r1 = r1 + r2;
        if (r6 == 0) goto L_0x00cb;
    L_0x00b6:
        r2 = r0 + -1;
        r4 = r2;
        r3 = r1;
    L_0x00ba:
        if (r4 < 0) goto L_0x00da;
    L_0x00bc:
        r2 = r3 + 1;
        r1 = 1;
        r1 = r1 << r4;
        r1 = r1 & r11;
        if (r1 == 0) goto L_0x00d2;
    L_0x00c3:
        r1 = 1;
    L_0x00c4:
        r10[r3] = r1;
        r1 = r4 + -1;
        if (r6 == 0) goto L_0x00d7;
    L_0x00ca:
        r1 = r2;
    L_0x00cb:
        r2 = r5 + 1;
        if (r6 == 0) goto L_0x00d4;
    L_0x00cf:
        return r10;
    L_0x00d0:
        r1 = 0;
        goto L_0x00ae;
    L_0x00d2:
        r1 = 0;
        goto L_0x00c4;
    L_0x00d4:
        r5 = r2;
        r2 = r1;
        goto L_0x009b;
    L_0x00d7:
        r4 = r1;
        r3 = r2;
        goto L_0x00ba;
    L_0x00da:
        r1 = r3;
        goto L_0x00cb;
    L_0x00dc:
        r1 = r2;
        goto L_0x00b6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gV.b(boolean[]):boolean[]");
    }

    public am a(by byVar) {
        boolean z = f;
        this.e = byVar;
        try {
            am amVar = new am(null, a(b(a(byVar.a()))), null, null);
            if (aK.a) {
                f = !z;
            }
            return amVar;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private static int a(boolean[] zArr, int i, int i2) {
        boolean z = f;
        int i3 = 0;
        int i4 = i;
        while (i4 < i + i2) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
            i4++;
            if (z) {
                break;
            }
        }
        return i3;
    }

    static {
        String[] strArr = new String[2];
        String str = "yx+8L";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 58;
                        break;
                    case at.g /*1*/:
                        i4 = 44;
                        break;
                    case at.i /*2*/:
                        i4 = 121;
                        break;
                    case at.o /*3*/:
                        i4 = 116;
                        break;
                    default:
                        i4 = 19;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    String[] strArr4 = new String[32];
                    i2 = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "yx+8Lj\u007f";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    strArr3[1] = " ";
                    strArr3[2] = "A";
                    strArr3[3] = "B";
                    strArr3[4] = "C";
                    strArr3[5] = "D";
                    strArr3[6] = "E";
                    strArr3[7] = "F";
                    strArr3[8] = "G";
                    strArr3[9] = "H";
                    strArr3[10] = "I";
                    strArr3[11] = "J";
                    strArr3[12] = "K";
                    strArr3[13] = "L";
                    strArr3[14] = "M";
                    strArr3[15] = "N";
                    strArr3[16] = "O";
                    strArr3[17] = "P";
                    strArr3[18] = "Q";
                    strArr3[19] = "R";
                    strArr3[20] = "S";
                    strArr3[21] = "T";
                    strArr3[22] = "U";
                    strArr3[23] = "V";
                    strArr3[24] = "W";
                    strArr3[25] = "X";
                    strArr3[26] = "Y";
                    strArr3[27] = "Z";
                    i2 = 28;
                    strArr2 = strArr3;
                    str = "yx+8Lv`";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    strArr2 = strArr3;
                    str = "yx+8Lw`";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    strArr2 = strArr3;
                    str = "yx+8L~`";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "yx+8Lx\u007f";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    b = strArr3;
                    strArr = new String[32];
                    str = "yx+8Lj\u007f";
                    i = 6;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    strArr3[1] = " ";
                    strArr3[2] = "a";
                    strArr3[3] = "b";
                    strArr3[4] = "c";
                    strArr3[5] = "d";
                    strArr3[6] = "e";
                    strArr3[7] = "f";
                    strArr3[8] = "g";
                    strArr3[9] = "h";
                    strArr3[10] = "i";
                    strArr3[11] = "j";
                    strArr3[12] = "k";
                    strArr3[13] = "l";
                    strArr3[14] = "m";
                    strArr3[15] = "n";
                    strArr3[16] = "o";
                    strArr3[17] = "p";
                    strArr3[18] = "q";
                    strArr3[19] = "r";
                    strArr3[20] = "s";
                    strArr3[21] = "t";
                    strArr3[22] = "u";
                    strArr3[23] = "v";
                    strArr3[24] = "w";
                    strArr3[25] = "x";
                    strArr3[26] = "y";
                    strArr3[27] = "z";
                    i2 = 28;
                    str = "yx+8Lo\u007f";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "yx+8Lw`";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "yx+8L~`";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "yx+8Lx\u007f";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    c = strArr3;
                    strArr = new String[32];
                    str = "yx+8Lj\u007f";
                    i = 11;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    strArr3[1] = " ";
                    strArr3[2] = "\u0001";
                    strArr3[3] = "\u0002";
                    strArr3[4] = "\u0003";
                    strArr3[5] = "\u0004";
                    strArr3[6] = "\u0005";
                    strArr3[7] = "\u0006";
                    strArr3[8] = "\u0007";
                    strArr3[9] = "\b";
                    strArr3[10] = "\t";
                    strArr3[11] = "\n";
                    strArr3[12] = "\u000b";
                    strArr3[13] = "\f";
                    strArr3[14] = "\r";
                    strArr3[15] = "\u001b";
                    strArr3[16] = "\u001c";
                    strArr3[17] = "\u001d";
                    strArr3[18] = "\u001e";
                    strArr3[19] = "\u001f";
                    strArr3[20] = "@";
                    strArr3[21] = "\\";
                    strArr3[22] = "^";
                    strArr3[23] = "_";
                    strArr3[24] = "`";
                    strArr3[25] = "|";
                    strArr3[26] = "~";
                    strArr3[27] = "\u007f";
                    i2 = 28;
                    str = "yx+8Lv`";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "yx+8Lo`";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "yx+8Lj`";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "yx+8Lx\u007f";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    g = strArr3;
                    strArr = new String[32];
                    strArr[0] = "";
                    strArr[1] = "\r";
                    str = "7&";
                    i = 16;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 2;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    str = "\u0014\f";
                    i = 17;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    str = "\u0016\f";
                    i = 18;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u0000\f";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    strArr3[6] = "!";
                    strArr3[7] = "\"";
                    strArr3[8] = "#";
                    strArr3[9] = "$";
                    strArr3[10] = "%";
                    strArr3[11] = "&";
                    strArr3[12] = "'";
                    strArr3[13] = "(";
                    strArr3[14] = ")";
                    strArr3[15] = "*";
                    strArr3[16] = "+";
                    strArr3[17] = ",";
                    strArr3[18] = "-";
                    strArr3[19] = ".";
                    strArr3[20] = "/";
                    strArr3[21] = ":";
                    strArr3[22] = ";";
                    strArr3[23] = "<";
                    strArr3[24] = "=";
                    strArr3[25] = ">";
                    strArr3[26] = "?";
                    strArr3[27] = "[";
                    strArr3[28] = "]";
                    strArr3[29] = "{";
                    strArr3[30] = "}";
                    i2 = 31;
                    str = "yx+8Lo`";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    a = strArr3;
                    strArr = new String[16];
                    str = "yx+8Lj\u007f";
                    i = 21;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    strArr3[1] = " ";
                    strArr3[2] = "0";
                    strArr3[3] = "1";
                    strArr3[4] = "2";
                    strArr3[5] = "3";
                    strArr3[6] = "4";
                    strArr3[7] = "5";
                    strArr3[8] = "6";
                    strArr3[9] = "7";
                    strArr3[10] = "8";
                    strArr3[11] = "9";
                    strArr3[12] = ",";
                    strArr3[13] = ".";
                    i2 = 14;
                    str = "yx+8Lo`";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "yx+8Lo\u007f";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    d = strArr3;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "xM\u001dTg[N\u0015\u0011";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private static S a(char c) {
        switch (c) {
            case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                return S.BINARY;
            case arj.Theme_searchViewStyle /*68*/:
                return S.DIGIT;
            case arj.Theme_textAppearanceListItem /*76*/:
                try {
                    return S.LOWER;
                } catch (IllegalStateException e) {
                    throw e;
                }
            case arj.Theme_textAppearanceListItemSmall /*77*/:
                return S.MIXED;
            case arj.Theme_panelMenuListTheme /*80*/:
                return S.PUNCT;
            default:
                return S.UPPER;
        }
    }

    private static String a(S s, int i) {
        try {
            switch (q.a[s.ordinal()]) {
                case at.g /*1*/:
                    return b[i];
                case at.i /*2*/:
                    return c[i];
                case at.o /*3*/:
                    return g[i];
                case at.p /*4*/:
                    return a[i];
                case at.m /*5*/:
                    return d[i];
                default:
                    throw new IllegalStateException(z[1]);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
        throw e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean[] a(com.google.hX r21) {
        /*
        r20 = this;
        r9 = f;
        r0 = r20;
        r3 = r0.e;
        r10 = r3.c();
        r0 = r20;
        r3 = r0.e;
        r11 = r3.b();
        if (r10 == 0) goto L_0x00fc;
    L_0x0014:
        r3 = r11 * 4;
        r3 = r3 + 11;
    L_0x0018:
        r12 = new int[r3];
        r4 = a(r11, r10);
        r13 = new boolean[r4];
        if (r10 == 0) goto L_0x0035;
    L_0x0022:
        r4 = 0;
    L_0x0023:
        r5 = r12.length;
        if (r4 >= r5) goto L_0x0033;
    L_0x0026:
        r12[r4] = r4;
        r4 = r4 + 1;
        if (r9 == 0) goto L_0x0023;
    L_0x002c:
        r4 = com.google.aK.a;	 Catch:{ IllegalStateException -> 0x0102 }
        if (r4 == 0) goto L_0x0104;
    L_0x0030:
        r4 = 0;
    L_0x0031:
        com.google.aK.a = r4;
    L_0x0033:
        if (r9 == 0) goto L_0x005f;
    L_0x0035:
        r4 = r3 + 1;
        r5 = r3 / 2;
        r5 = r5 + -1;
        r5 = r5 / 15;
        r5 = r5 * 2;
        r4 = r4 + r5;
        r5 = r3 / 2;
        r6 = r4 / 2;
        r4 = 0;
    L_0x0045:
        if (r4 >= r5) goto L_0x005f;
    L_0x0047:
        r7 = r4 / 15;
        r7 = r7 + r4;
        r8 = r5 - r4;
        r8 = r8 + -1;
        r14 = r6 - r7;
        r14 = r14 + -1;
        r12[r8] = r14;
        r8 = r5 + r4;
        r7 = r7 + r6;
        r7 = r7 + 1;
        r12[r8] = r7;
        r4 = r4 + 1;
        if (r9 == 0) goto L_0x0045;
    L_0x005f:
        r5 = 0;
        r4 = 0;
        r7 = r4;
        r8 = r5;
    L_0x0063:
        if (r8 >= r11) goto L_0x00fb;
    L_0x0065:
        if (r10 == 0) goto L_0x0107;
    L_0x0067:
        r4 = r11 - r8;
        r4 = r4 * 4;
        r4 = r4 + 9;
    L_0x006d:
        r14 = r8 * 2;
        r5 = r3 + -1;
        r15 = r5 - r14;
        r5 = 0;
        r6 = r5;
    L_0x0075:
        if (r6 >= r4) goto L_0x00f4;
    L_0x0077:
        r16 = r6 * 2;
        r5 = 0;
    L_0x007a:
        r17 = 2;
        r0 = r17;
        if (r5 >= r0) goto L_0x00f0;
    L_0x0080:
        r17 = r7 + r16;
        r17 = r17 + r5;
        r18 = r14 + r5;
        r18 = r12[r18];
        r19 = r14 + r6;
        r19 = r12[r19];
        r0 = r21;
        r1 = r18;
        r2 = r19;
        r18 = r0.a(r1, r2);
        r13[r17] = r18;
        r17 = r4 * 2;
        r17 = r17 + r7;
        r17 = r17 + r16;
        r17 = r17 + r5;
        r18 = r14 + r6;
        r18 = r12[r18];
        r19 = r15 - r5;
        r19 = r12[r19];
        r0 = r21;
        r1 = r18;
        r2 = r19;
        r18 = r0.a(r1, r2);
        r13[r17] = r18;
        r17 = r4 * 4;
        r17 = r17 + r7;
        r17 = r17 + r16;
        r17 = r17 + r5;
        r18 = r15 - r5;
        r18 = r12[r18];
        r19 = r15 - r6;
        r19 = r12[r19];
        r0 = r21;
        r1 = r18;
        r2 = r19;
        r18 = r0.a(r1, r2);
        r13[r17] = r18;
        r17 = r4 * 6;
        r17 = r17 + r7;
        r17 = r17 + r16;
        r17 = r17 + r5;
        r18 = r15 - r6;
        r18 = r12[r18];
        r19 = r14 + r5;
        r19 = r12[r19];
        r0 = r21;
        r1 = r18;
        r2 = r19;
        r18 = r0.a(r1, r2);
        r13[r17] = r18;
        r5 = r5 + 1;
        if (r9 == 0) goto L_0x007a;
    L_0x00f0:
        r5 = r6 + 1;
        if (r9 == 0) goto L_0x0113;
    L_0x00f4:
        r4 = r4 * 8;
        r4 = r4 + r7;
        r5 = r8 + 1;
        if (r9 == 0) goto L_0x010f;
    L_0x00fb:
        return r13;
    L_0x00fc:
        r3 = r11 * 4;
        r3 = r3 + 14;
        goto L_0x0018;
    L_0x0102:
        r3 = move-exception;
        throw r3;
    L_0x0104:
        r4 = 1;
        goto L_0x0031;
    L_0x0107:
        r4 = r11 - r8;
        r4 = r4 * 4;
        r4 = r4 + 12;
        goto L_0x006d;
    L_0x010f:
        r7 = r4;
        r8 = r5;
        goto L_0x0063;
    L_0x0113:
        r6 = r5;
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gV.a(com.google.hX):boolean[]");
    }
}
