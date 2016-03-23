package com.google;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum aM {
    ;
    
    public static final aM ADDRESSBOOK;
    public static final aM CALENDAR;
    public static final aM EMAIL_ADDRESS;
    public static final aM GEO;
    public static final aM ISBN;
    public static final aM PRODUCT;
    public static final aM SMS;
    public static final aM TEL;
    public static final aM TEXT;
    public static final aM URI;
    public static final aM VIN;
    public static final aM WIFI;
    public static int b;
    private static final String[] z;

    static {
        String[] strArr = new String[12];
        String str = "4G3\u001e\u0013.K6\u0013\r4Y!";
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
                        i4 = 113;
                        break;
                    case at.g /*1*/:
                        i4 = 10;
                        break;
                    case at.i /*2*/:
                        i4 = 114;
                        break;
                    case at.o /*3*/:
                        i4 = 87;
                        break;
                    default:
                        i4 = 95;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "%O*\u0003";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "!X=\u0013\n2^";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "%O>";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "6O=";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\"G!";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "$X;";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "8Y0\u0019";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "0N6\u0005\u001a\"Y0\u0018\u0010:";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    str = "'C<";
                    i = 9;
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    strArr2 = strArr3;
                    str = "&C4\u001e";
                    i = 10;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ADDRESSBOOK = new aM(z[9], 0);
                    EMAIL_ADDRESS = new aM(z[0], 1);
                    PRODUCT = new aM(z[3], 2);
                    URI = new aM(z[7], 3);
                    TEXT = new aM(z[2], 4);
                    GEO = new aM(z[5], 5);
                    TEL = new aM(z[4], 6);
                    SMS = new aM(z[6], 7);
                    CALENDAR = new aM(z[1], 8);
                    WIFI = new aM(z[11], 9);
                    ISBN = new aM(z[8], 10);
                    VIN = new aM(z[10], 11);
                    a = new aM[]{ADDRESSBOOK, EMAIL_ADDRESS, PRODUCT, URI, TEXT, GEO, TEL, SMS, CALENDAR, WIFI, ISBN, VIN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "2K>\u0012\u00115K ";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
