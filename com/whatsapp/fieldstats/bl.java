package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bl {
    ;
    
    public static final bl HARDWARE;
    public static final bl NONE;
    public static final bl SOFTWARE;
    private static final bl[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[3];
        String str = "&kdv&/xs";
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
                        i4 = 110;
                        break;
                    case at.g /*1*/:
                        i4 = 42;
                        break;
                    case at.i /*2*/:
                        i4 = 54;
                        break;
                    case at.o /*3*/:
                        i4 = 50;
                        break;
                    default:
                        i4 = 113;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "=epf&/xs";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new bl(z[1], 0, 1);
                    SOFTWARE = new bl(z[2], 1, 2);
                    HARDWARE = new bl(z[0], 2, 3);
                    a = new bl[]{NONE, SOFTWARE, HARDWARE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = " exw";
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

    private bl(int i) {
        this.b = i;
    }
}
