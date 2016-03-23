package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum q {
    ;
    
    public static final q CHAT_DB_COPY_ERROR;
    public static final q CORRUPTED;
    public static final q ERROR_FAILED;
    public static final q LOW_BATTERY;
    public static final q MISSING_CHAT_STORE;
    public static final q NOT_CONNECTED;
    public static final q NOT_ENOUGH_SPACE;
    public static final q NOT_REGISTERED;
    public static final q NOT_SIGNED_IN;
    public static final q RESTORING;
    public static final q SUCCESS;
    public static final q TIME_EXPIRED;
    public static final q TOO_LARGE;
    public static final q UPLOAD;
    public static final q USER_STOPPED;
    private static final q[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[15];
        String str = "u#\u0003+fr+\u00191qd%\u0019";
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
                        i4 = 59;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 87;
                        break;
                    case at.o /*3*/:
                        i4 = 116;
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
                    str = "~>\u0005;gd*\u0016=y~(";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "o%\u001a1j~4\u0007=g~(";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "v%\u0004'|u+\b7}z8\b'at>\u0012";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "u#\u0003+pu#\u00023}d?\u00075v~";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "n?\u0012&jh8\u0018$e~(";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "x#\u0005&`k8\u00120";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "x$\u0016 j\u007f.\b7zk5\b1gi#\u0005";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "o#\u0018+yz>\u00101";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "n<\u001b;t\u007f";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "u#\u0003+vt\"\u00191vo)\u0013";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "u#\u0003+g~+\u001e'a~>\u00120";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "w#\u0000+wz8\u00031gb";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "h9\u00147ph?";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new q(z[14], 0, 1);
                    USER_STOPPED = new q(z[6], 1, 2);
                    TIME_EXPIRED = new q(z[3], 2, 3);
                    ERROR_FAILED = new q(z[2], 3, 4);
                    MISSING_CHAT_STORE = new q(z[4], 4, 5);
                    CORRUPTED = new q(z[7], 5, 6);
                    NOT_REGISTERED = new q(z[12], 6, 7);
                    NOT_ENOUGH_SPACE = new q(z[5], 7, 8);
                    TOO_LARGE = new q(z[9], 8, 9);
                    NOT_CONNECTED = new q(z[11], 9, 10);
                    LOW_BATTERY = new q(z[13], 10, 11);
                    NOT_SIGNED_IN = new q(z[0], 11, 12);
                    UPLOAD = new q(z[10], 12, 13);
                    CHAT_DB_COPY_ERROR = new q(z[8], 13, 14);
                    RESTORING = new q(z[1], 14, 15);
                    b = new q[]{SUCCESS, USER_STOPPED, TIME_EXPIRED, ERROR_FAILED, MISSING_CHAT_STORE, CORRUPTED, NOT_REGISTERED, NOT_ENOUGH_SPACE, TOO_LARGE, NOT_CONNECTED, LOW_BATTERY, NOT_SIGNED_IN, UPLOAD, CHAT_DB_COPY_ERROR, RESTORING};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "i)\u0004 zi%\u00193";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private q(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
