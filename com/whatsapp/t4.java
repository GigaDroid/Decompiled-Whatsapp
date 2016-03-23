package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum t4 {
    ;
    
    public static final t4 FILL;
    public static final t4 INFLATE;
    public static final t4 ON_ACTIVITY_CREATED;
    public static final t4 ON_CREATE;
    public static final t4 ON_CREATE_VIEW;
    public static final t4 ON_LAYOUT;
    public static final t4 ON_RESUME;
    public static final t4 ON_START;
    public static final t4 PRE_CREATE;
    public static final t4 REFRESH;
    private static final t4[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[10];
        String str = "\u0013-3\u0014*\u000f6!\u0003";
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
                        i4 = 92;
                        break;
                    case at.g /*1*/:
                        i4 = 99;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 70;
                        break;
                    default:
                        i4 = 111;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\f1)\u0019,\u000e&-\u0012*";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0013-3\u0005=\u0019\"8\u0003";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0013-3\u0015;\u001d18";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u001a* \n";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0013-3\u0007,\b*:\u000f;\u0005</\u0014*\u001d7)\u0002";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0015-*\n.\b&";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0013-3\n.\u0005,9\u0012";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u0013-3\u0005=\u0019\"8\u00030\n*)\u0011";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PRE_CREATE = new t4(z[2], 0);
                    ON_CREATE = new t4(z[3], 1);
                    ON_CREATE_VIEW = new t4(z[9], 2);
                    ON_ACTIVITY_CREATED = new t4(z[6], 3);
                    ON_START = new t4(z[4], 4);
                    ON_LAYOUT = new t4(z[8], 5);
                    ON_RESUME = new t4(z[0], 6);
                    INFLATE = new t4(z[7], 7);
                    FILL = new t4(z[5], 8);
                    REFRESH = new t4(z[1], 9);
                    a = new t4[]{PRE_CREATE, ON_CREATE, ON_CREATE_VIEW, ON_ACTIVITY_CREATED, ON_START, ON_LAYOUT, ON_RESUME, INFLATE, FILL, REFRESH};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u000e&*\u0014*\u000f+";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
