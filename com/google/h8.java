package com.google;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum h8 {
    ;
    
    public static final h8 ALPHANUMERIC;
    public static final h8 BYTE;
    public static final h8 ECI;
    public static final h8 FNC1_FIRST_POSITION;
    public static final h8 FNC1_SECOND_POSITION;
    public static final h8 HANZI;
    public static final h8 KANJI;
    public static final h8 NUMERIC;
    public static final h8 STRUCTURED_APPEND;
    public static final h8 TERMINATOR;
    private static final String[] z;
    private final int a;
    private final int[] c;

    public int getBits() {
        return this.a;
    }

    static {
        String[] strArr = new String[10];
        String str = "vp\u0003`gqf";
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
                        i4 = 56;
                        break;
                    case at.g /*1*/:
                        i4 = 37;
                        break;
                    case at.i /*2*/:
                        i4 = 78;
                        break;
                    case at.o /*3*/:
                        i4 = 37;
                        break;
                    default:
                        i4 = 53;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "z|\u001a`";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "l`\u001ch|vd\u001ajg";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "sd\u0000o|";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "~k\r\u0014j~l\u001cvagu\u0001v|ll\u0001k";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "}f\u0007";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "yi\u001emtvp\u0003`gqf";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "~k\r\u0014jk`\rj{|z\u001ejfqq\u0007j{";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "pd\u0000\u007f|";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    TERMINATOR = new h8(z[3], 0, new int[]{0, 0, 0}, 0);
                    NUMERIC = new h8(z[0], 1, new int[]{10, 12, 14}, 1);
                    ALPHANUMERIC = new h8(z[7], 2, new int[]{9, 11, 13}, 2);
                    STRUCTURED_APPEND = new h8(z[1], 3, new int[]{0, 0, 0}, 3);
                    BYTE = new h8(z[2], 4, new int[]{8, 16, 16}, 4);
                    ECI = new h8(z[6], 5, new int[]{0, 0, 0}, 7);
                    KANJI = new h8(z[4], 6, new int[]{8, 10, 12}, 8);
                    FNC1_FIRST_POSITION = new h8(z[5], 7, new int[]{0, 0, 0}, 5);
                    FNC1_SECOND_POSITION = new h8(z[8], 8, new int[]{0, 0, 0}, 9);
                    HANZI = new h8(z[9], 9, new int[]{8, 10, 12}, 13);
                    b = new h8[]{TERMINATOR, NUMERIC, ALPHANUMERIC, STRUCTURED_APPEND, BYTE, ECI, KANJI, FNC1_FIRST_POSITION, FNC1_SECOND_POSITION, HANZI};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "kq\u001cpvlp\u001c`qgd\u001eupva";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCharacterCountBits(com.google.fQ r4) {
        /*
        r3 = this;
        r1 = com.google.fQ.b;
        r2 = r4.a();
        r0 = 9;
        if (r2 > r0) goto L_0x000d;
    L_0x000a:
        r0 = 0;
        if (r1 == 0) goto L_0x0015;
    L_0x000d:
        r0 = 26;
        if (r2 > r0) goto L_0x0014;
    L_0x0011:
        r0 = 1;
        if (r1 == 0) goto L_0x0015;
    L_0x0014:
        r0 = 2;
    L_0x0015:
        r1 = r3.c;
        r0 = r1[r0];
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h8.getCharacterCountBits(com.google.fQ):int");
    }

    private h8(int[] iArr, int i) {
        this.c = iArr;
        this.a = i;
    }

    public static h8 forBits(int i) {
        switch (i) {
            case v.m /*0*/:
                try {
                    return TERMINATOR;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case at.g /*1*/:
                return NUMERIC;
            case at.i /*2*/:
                return ALPHANUMERIC;
            case at.o /*3*/:
                return STRUCTURED_APPEND;
            case at.p /*4*/:
                return BYTE;
            case at.m /*5*/:
                return FNC1_FIRST_POSITION;
            case aF.v /*7*/:
                return ECI;
            case aF.u /*8*/:
                return KANJI;
            case Y.l /*9*/:
                return FNC1_SECOND_POSITION;
            case Y.q /*13*/:
                return HANZI;
            default:
                throw new IllegalArgumentException();
        }
    }
}
