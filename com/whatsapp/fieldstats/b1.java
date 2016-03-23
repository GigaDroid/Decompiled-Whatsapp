package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum b1 {
    ;
    
    public static final b1 CANCEL;
    public static final b1 DID_NOT_REQUEST;
    public static final b1 FAILED_COMMUNICATION;
    public static final b1 FAILED_OTHER;
    public static final b1 FAILED_OUT_OF_QUOTA;
    public static final b1 OK;
    private static final b1[] a;
    private static final String[] z;
    private final int b;

    private b1(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[6];
        String str = "\"O\u0015-1 Q\u00135<!\\";
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
                        i4 = 100;
                        break;
                    case at.g /*1*/:
                        i4 = 14;
                        break;
                    case at.i /*2*/:
                        i4 = 92;
                        break;
                    case at.o /*3*/:
                        i4 = 97;
                        break;
                    default:
                        i4 = 116;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\"O\u0015-1 Q\u00134 ;A\u001a>%1A\b ";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "+E";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\"O\u0015-1 Q\u001f.9)[\u0012(7%Z\u0015.:";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "'O\u0012\"1(";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new b1(z[3], 0, 1);
                    CANCEL = new b1(z[5], 1, 2);
                    DID_NOT_REQUEST = new b1(z[1], 2, 3);
                    FAILED_OUT_OF_QUOTA = new b1(z[2], 3, 4);
                    FAILED_COMMUNICATION = new b1(z[4], 4, 5);
                    FAILED_OTHER = new b1(z[0], 5, 6);
                    a = new b1[]{OK, CANCEL, DID_NOT_REQUEST, FAILED_OUT_OF_QUOTA, FAILED_COMMUNICATION, FAILED_OTHER};
                    return;
                default:
                    strArr2[i2] = str;
                    str = " G\u0018>:+Z\u0003315[\u00192 ";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }
}
