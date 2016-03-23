package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum ds {
    ;
    
    public static final ds ENDED;
    public static final ds NOT_INITIATED;
    public static final ds RUNNING;
    private static final ds[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "%D;$W%B;2_?N+";
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
                        i4 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 11;
                        break;
                    case at.i /*2*/:
                        i4 = 111;
                        break;
                    case at.o /*3*/:
                        i4 = 123;
                        break;
                    default:
                        i4 = 30;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ".E+>Z";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_INITIATED = new ds(z[0], 0);
                    RUNNING = new ds(z[1], 1);
                    ENDED = new ds(z[2], 2);
                    a = new ds[]{NOT_INITIATED, RUNNING, ENDED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "9^!5W%L";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
