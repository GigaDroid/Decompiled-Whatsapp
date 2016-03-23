package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum ax {
    ;
    
    public static final ax ANDROID;
    public static final ax BB;
    public static final ax BBX;
    public static final ax IPHONE;
    public static final ax OSMETA;
    public static final ax S40;
    public static final ax SYMBIAN;
    public static final ax TEST;
    public static final ax UNKNOWN;
    public static final ax WEBCLIENT;
    public static final ax WP;
    private static final ax[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[11];
        String str = "o\u0004\u0004E\bm\u0004";
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
                        i4 = 74;
                        break;
                    case at.i /*2*/:
                        i4 = 79;
                        break;
                    case at.o /*3*/:
                        i4 = 11;
                        break;
                    default:
                        i4 = 71;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "s\u001a\u0007D\t\u007f";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "{\u0004\u000bY\bs\u000e";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "u\u0019\u0002N\u0013{";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "i~\u007f";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "n\u000f\u001c_";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "m\u000f\rH\u000bs\u000f\u0001_";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "x\b\u0017";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "i\u0013\u0002I\u000e{\u0004";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "m\u001a";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    IPHONE = new ax(z[2], 0, 1);
                    ANDROID = new ax(z[3], 1, 2);
                    BB = new ax(z[1], 2, 3);
                    BBX = new ax(z[8], 3, 7);
                    S40 = new ax(z[5], 4, 4);
                    SYMBIAN = new ax(z[9], 5, 5);
                    WP = new ax(z[10], 6, 6);
                    WEBCLIENT = new ax(z[7], 7, 8);
                    OSMETA = new ax(z[4], 8, 11);
                    TEST = new ax(z[6], 9, 9);
                    UNKNOWN = new ax(z[0], 10, 10);
                    b = new ax[]{IPHONE, ANDROID, BB, BBX, S40, SYMBIAN, WP, WEBCLIENT, OSMETA, TEST, UNKNOWN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "x\b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private ax(int i) {
        this.a = i;
    }
}
