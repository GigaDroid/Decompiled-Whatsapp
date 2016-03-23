package com.whatsapp;

import org.v;
import org.whispersystems.at;

enum ro {
    ;
    
    public static final ro INVALID;
    public static final ro MISMATCH;
    public static final ro OK;
    public static final ro WRONG_CONTACT;
    public static final ro WRONG_YOU;
    private static final ro[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\u0016A>^o\u000fK%";
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
                        i4 = 91;
                        break;
                    case at.g /*1*/:
                        i4 = 8;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_switchStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 19;
                        break;
                    default:
                        i4 = 46;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0014C";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\fZ\"]i\u0004K\"]z\u001aK9";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0012F;Rb\u0012L";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INVALID = new ro(z[4], 0);
                    WRONG_CONTACT = new ro(z[3], 1);
                    WRONG_YOU = new ro(z[1], 2);
                    MISMATCH = new ro(z[0], 3);
                    OK = new ro(z[2], 4);
                    a = new ro[]{INVALID, WRONG_CONTACT, WRONG_YOU, MISMATCH, OK};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\fZ\"]i\u0004Q\"F";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
