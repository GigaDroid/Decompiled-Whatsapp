package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum m {
    ;
    
    public static final m APP_RESUMED;
    public static final m CHAT_DB_COPY_ERROR;
    public static final m CORRUPTED;
    public static final m LOW_BATTERY;
    public static final m NOT_CONNECTED;
    public static final m NOT_ENOUGH_SPACE;
    public static final m NOT_REGISTERED;
    public static final m NOT_SIGNED_IN;
    public static final m NO_CHAT_STORE;
    public static final m OUT_OF_TIME;
    public static final m RESTORING;
    public static final m TOO_LARGE;
    public static final m TOO_OLD;
    public static final m UPLOAD;
    private static final m[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[14];
        String str = "!~nx{!rsk";
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
                        i4 = 115;
                        break;
                    case at.g /*1*/:
                        i4 = 59;
                        break;
                    case at.i /*2*/:
                        i4 = 61;
                        break;
                    case at.o /*3*/:
                        i4 = 44;
                        break;
                    default:
                        i4 = 52;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "'trs{?\u007f";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "0s|xk7ybo{#bbif!to";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "=tisq=thk|,hmmw6";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "=tisw<usiw'~y";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "=tisg:|sip,rs";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "0to~a#oxh";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "=tbo|2ob\u007f`<ix";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "2kmsf6hhaq7";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "<nis{5diey6";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "'trsx2izi";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "&kqcu7";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "=tisf6|t\u007f`6ixh";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_REGISTERED = new m(z[13], 0, 1);
                    NOT_SIGNED_IN = new m(z[6], 1, 2);
                    NO_CHAT_STORE = new m(z[8], 2, 3);
                    CORRUPTED = new m(z[7], 3, 4);
                    NOT_ENOUGH_SPACE = new m(z[4], 4, 5);
                    TOO_LARGE = new m(z[11], 5, 6);
                    UPLOAD = new m(z[12], 6, 7);
                    TOO_OLD = new m(z[2], 7, 8);
                    LOW_BATTERY = new m(z[1], 8, 9);
                    OUT_OF_TIME = new m(z[10], 9, 10);
                    APP_RESUMED = new m(z[9], 10, 11);
                    NOT_CONNECTED = new m(z[5], 11, 12);
                    CHAT_DB_COPY_ERROR = new m(z[3], 12, 13);
                    RESTORING = new m(z[0], 13, 14);
                    a = new m[]{NOT_REGISTERED, NOT_SIGNED_IN, NO_CHAT_STORE, CORRUPTED, NOT_ENOUGH_SPACE, TOO_LARGE, UPLOAD, TOO_OLD, LOW_BATTERY, OUT_OF_TIME, APP_RESUMED, NOT_CONNECTED, CHAT_DB_COPY_ERROR, RESTORING};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "?tjsv2oiif*";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private m(int i) {
        this.b = i;
    }
}
