package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum gg {
    ;
    
    public static final gg AZTEC;
    public static final gg CODABAR;
    public static final gg CODE_128;
    public static final gg CODE_39;
    public static final gg CODE_93;
    public static final gg DATA_MATRIX;
    public static final gg EAN_13;
    public static final gg EAN_8;
    public static final gg ITF;
    public static final gg MAXICODE;
    public static final gg PDF_417;
    public static final gg QR_CODE;
    public static final gg RSS_14;
    public static final gg RSS_EXPANDED;
    public static final gg UPC_A;
    public static final gg UPC_E;
    public static final gg UPC_EAN_EXTENSION;
    private static final String[] z;

    static {
        String[] strArr = new String[17];
        String str = "^o\u000e\\\u0015Tl\u001cM\u0014Ix";
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
                        i4 = 12;
                        break;
                    case at.g /*1*/:
                        i4 = 60;
                        break;
                    case at.i /*2*/:
                        i4 = 93;
                        break;
                    case at.o /*3*/:
                        i4 = 3;
                        break;
                    default:
                        i4 = 80;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "A}\u0005J\u0013Cx\u0018";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "Eh\u001b";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "H}\tB\u000fA}\tQ\u0019T";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "^o\u000e\\a8";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "]n\u0002@\u001fHy";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "Os\u0019F\u000f=\u000ee";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "Os\u0019F\u000f5\u000f";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "Yl\u001e\\\u0015";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "Os\u0019F\u000f?\u0005";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\\x\u001b\\d=\u000b";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    str = "I}\u0013\\a?";
                    i = 11;
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    strArr2 = strArr3;
                    str = "Yl\u001e\\\u0011";
                    i = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "Os\u0019B\u0012Mn";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "I}\u0013\\h";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "Mf\tF\u0013";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    AZTEC = new gg(z[16], 0);
                    CODABAR = new gg(z[14], 1);
                    CODE_39 = new gg(z[10], 2);
                    CODE_93 = new gg(z[8], 3);
                    CODE_128 = new gg(z[7], 4);
                    DATA_MATRIX = new gg(z[4], 5);
                    EAN_8 = new gg(z[15], 6);
                    EAN_13 = new gg(z[12], 7);
                    ITF = new gg(z[3], 8);
                    MAXICODE = new gg(z[2], 9);
                    PDF_417 = new gg(z[11], 10);
                    QR_CODE = new gg(z[6], 11);
                    RSS_14 = new gg(z[5], 12);
                    RSS_EXPANDED = new gg(z[0], 13);
                    UPC_A = new gg(z[13], 14);
                    UPC_E = new gg(z[9], 15);
                    UPC_EAN_EXTENSION = new gg(z[1], 16);
                    a = new gg[]{AZTEC, CODABAR, CODE_39, CODE_93, CODE_128, DATA_MATRIX, EAN_8, EAN_13, ITF, MAXICODE, PDF_417, QR_CODE, RSS_14, RSS_EXPANDED, UPC_A, UPC_E, UPC_EAN_EXTENSION};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "Yl\u001e\\\u0015Mr\u0002F\bXy\u0013P\u0019Cr";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
