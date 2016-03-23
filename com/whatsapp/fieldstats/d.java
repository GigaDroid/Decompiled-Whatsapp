package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum d {
    ;
    
    public static final d BROADCAST;
    public static final d GROUP;
    public static final d INDIVIDUAL;
    private static final d[] a;
    private static final String[] z;
    private final int b;

    private d(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[3];
        String str = "\r\u0003-ya\f\u00101l";
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
                        i4 = 79;
                        break;
                    case at.g /*1*/:
                        i4 = 81;
                        break;
                    case at.i /*2*/:
                        i4 = 98;
                        break;
                    case at.o /*3*/:
                        i4 = 56;
                        break;
                    default:
                        i4 = 37;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0006\u001f&qs\u0006\u00157yi";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INDIVIDUAL = new d(z[2], 0, 1);
                    GROUP = new d(z[1], 1, 2);
                    BROADCAST = new d(z[0], 2, 3);
                    a = new d[]{INDIVIDUAL, GROUP, BROADCAST};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\b\u0003-mu";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
