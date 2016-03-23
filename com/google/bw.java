package com.google;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum bw {
    ;
    
    public static final bw FIXED_LINE;
    public static final bw FIXED_LINE_OR_MOBILE;
    public static final bw MOBILE;
    public static final bw PAGER;
    public static final bw PERSONAL_NUMBER;
    public static final bw PREMIUM_RATE;
    public static final bw SHARED_COST;
    public static final bw TOLL_FREE;
    public static final bw UAN;
    public static final bw UNKNOWN;
    public static final bw VOICEMAIL;
    public static final bw VOIP;
    private static final bw[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[12];
        String str = "`\u0007\"k\u001ah";
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
                        i4 = 45;
                        break;
                    case at.g /*1*/:
                        i4 = 72;
                        break;
                    case at.i /*2*/:
                        i4 = 96;
                        break;
                    case at.o /*3*/:
                        i4 = 34;
                        break;
                    default:
                        i4 = 86;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "x\t.";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "k\u00018g\u0012r\u0004)l\u0013";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "~\u0000!p\u0013i\u0017#m\u0005y";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "}\r2q\u0019c\t,}\u0018x\u0005\"g\u0004";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "}\t'g\u0004";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "}\u001a%o\u001fx\u0005?p\u0017y\r";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "{\u0007)a\u0013`\t)n";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "x\u0006+l\u0019z\u0006";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "{\u0007)r";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "k\u00018g\u0012r\u0004)l\u0013r\u00072}\u001bb\n)n\u0013";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FIXED_LINE = new bw(z[3], 0);
                    MOBILE = new bw(z[0], 1);
                    FIXED_LINE_OR_MOBILE = new bw(z[11], 2);
                    TOLL_FREE = new bw(z[1], 3);
                    PREMIUM_RATE = new bw(z[7], 4);
                    SHARED_COST = new bw(z[4], 5);
                    VOIP = new bw(z[10], 6);
                    PERSONAL_NUMBER = new bw(z[5], 7);
                    PAGER = new bw(z[6], 8);
                    UAN = new bw(z[2], 9);
                    VOICEMAIL = new bw(z[8], 10);
                    UNKNOWN = new bw(z[9], 11);
                    a = new bw[]{FIXED_LINE, MOBILE, FIXED_LINE_OR_MOBILE, TOLL_FREE, PREMIUM_RATE, SHARED_COST, VOIP, PERSONAL_NUMBER, PAGER, UAN, VOICEMAIL, UNKNOWN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "y\u0007,n\tk\u001a%g";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
