package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum qp {
    ;
    
    public static final qp ERROR_BAD_PARAMETER;
    public static final qp ERROR_BAD_TOKEN;
    public static final qp ERROR_BLOCKED;
    public static final qp ERROR_CONNECTIVITY;
    public static final qp ERROR_MISSING_PARAMETER;
    public static final qp ERROR_NEXT_METHOD;
    public static final qp ERROR_NO_ROUTES;
    public static final qp ERROR_OLD_VERSION;
    public static final qp ERROR_PROVIDER_TIMEOUT;
    public static final qp ERROR_PROVIDER_UNROUTABLE;
    public static final qp ERROR_TEMPORARILY_UNAVAILABLE;
    public static final qp ERROR_TOO_MANY;
    public static final qp ERROR_TOO_MANY_ALL_METHODS;
    public static final qp ERROR_TOO_MANY_GUESSES;
    public static final qp ERROR_TOO_RECENT;
    public static final qp ERROR_UNSPECIFIED;
    public static final qp OK;
    public static final qp YES;
    public static final qp YES_WITH_CODE;
    private static final qp[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[19];
        String str = "r,\u007f5vb=d5bd-i";
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
                        i4 = 43;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_radioButtonStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 44;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_ratingBarStyle;
                        break;
                    default:
                        i4 = 33;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "n;~%st*c$on*x#wb=u";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "n;~%st$e9rb'k5qj;m'd\u007f,~";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "n;~%st=i'qd;m8hg0s?oj?m#mj+`/";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "n;~%st9~%wb-i8~~'~%t\u007f(n&d";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "n;~%st=c%~f(b3~l<i9rn:";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "n;~%st'i2ut$i>id-";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "d\"";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "n;~%st=c%~f(b3~j%`5ln=d%ex";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "r,\u007f";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "n;~%st=c%~y,o/o\u007f";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "n;~%st9~%wb-i8~\u007f a/n~=";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "n;~%st+`%b`,h";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "n;~%st+m.~\u007f&g/o";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "n;~%st=c%~f(b3";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "n;~%st&`.~},~9hd'";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "n;~%st<b9qn*e,hn-";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "n;~%st+m.~{(~+ln=i8";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    YES = new qp(z[10], 0);
                    YES_WITH_CODE = new qp(z[0], 1);
                    OK = new qp(z[8], 2);
                    ERROR_UNSPECIFIED = new qp(z[17], 3);
                    ERROR_CONNECTIVITY = new qp(z[2], 4);
                    ERROR_TOO_RECENT = new qp(z[11], 5);
                    ERROR_TOO_MANY = new qp(z[15], 6);
                    ERROR_OLD_VERSION = new qp(z[16], 7);
                    ERROR_TEMPORARILY_UNAVAILABLE = new qp(z[4], 8);
                    ERROR_NEXT_METHOD = new qp(z[7], 9);
                    ERROR_TOO_MANY_GUESSES = new qp(z[6], 10);
                    ERROR_BLOCKED = new qp(z[13], 11);
                    ERROR_BAD_PARAMETER = new qp(z[18], 12);
                    ERROR_MISSING_PARAMETER = new qp(z[3], 13);
                    ERROR_PROVIDER_TIMEOUT = new qp(z[12], 14);
                    ERROR_PROVIDER_UNROUTABLE = new qp(z[5], 15);
                    ERROR_BAD_TOKEN = new qp(z[14], 16);
                    ERROR_TOO_MANY_ALL_METHODS = new qp(z[9], 17);
                    ERROR_NO_ROUTES = new qp(z[1], 18);
                    a = new qp[]{YES, YES_WITH_CODE, OK, ERROR_UNSPECIFIED, ERROR_CONNECTIVITY, ERROR_TOO_RECENT, ERROR_TOO_MANY, ERROR_OLD_VERSION, ERROR_TEMPORARILY_UNAVAILABLE, ERROR_NEXT_METHOD, ERROR_TOO_MANY_GUESSES, ERROR_BLOCKED, ERROR_BAD_PARAMETER, ERROR_MISSING_PARAMETER, ERROR_PROVIDER_TIMEOUT, ERROR_PROVIDER_UNROUTABLE, ERROR_BAD_TOKEN, ERROR_TOO_MANY_ALL_METHODS, ERROR_NO_ROUTES};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "n;~%st'c5sd<x/r";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
