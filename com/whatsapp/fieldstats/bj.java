package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bj {
    ;
    
    public static final bj FAILED_DUMP;
    public static final bj FAILED_MULTIPLE_FILES;
    public static final bj FAILED_NETWORK_UPLOAD;
    public static final bj FAILED_NO_WIFI;
    public static final bj FAILED_NO_WIFI_2;
    public static final bj FAILED_PI_CLEANING;
    public static final bj SUCCESSFUL;
    private static final bj[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private bj(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[7];
        String str = "5\u001f;\u001e\f7\u0001?\u0007\u0005'\u0017\"\u001e\f,\u0018;\u001e\f ";
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
                        i4 = 94;
                        break;
                    case at.i /*2*/:
                        i4 = 114;
                        break;
                    case at.o /*3*/:
                        i4 = 82;
                        break;
                    default:
                        i4 = 73;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "5\u001f;\u001e\f7\u0001<\u001d\u0016$\u00174\u001b\u0016A";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "5\u001f;\u001e\f7\u0001<\u0017\u001d$\u0011 \u0019\u0016&\u000e>\u001d\b7";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "5\u001f;\u001e\f7\u0001\"\u001b\u00160\u00127\u0013\u0007:\u00105";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "5\u001f;\u001e\f7\u00016\u0007\u0004#";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "5\u001f;\u001e\f7\u0001<\u001d\u0016$\u00174\u001b";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESSFUL = new bj(z[1], 0, 1);
                    FAILED_DUMP = new bj(z[5], 1, 2);
                    FAILED_NO_WIFI = new bj(z[6], 2, 3);
                    FAILED_MULTIPLE_FILES = new bj(z[0], 3, 4);
                    FAILED_PI_CLEANING = new bj(z[4], 4, 5);
                    FAILED_NO_WIFI_2 = new bj(z[2], 5, 6);
                    FAILED_NETWORK_UPLOAD = new bj(z[3], 6, 7);
                    b = new bj[]{SUCCESSFUL, FAILED_DUMP, FAILED_NO_WIFI, FAILED_MULTIPLE_FILES, FAILED_PI_CLEANING, FAILED_NO_WIFI_2, FAILED_NETWORK_UPLOAD};
                    return;
                default:
                    strArr2[i2] = str;
                    str = " \u000b1\u0011\f \r4\u0007\u0005";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
