package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum av3 {
    ;
    
    public static final av3 ANR;
    public static final av3 VOICE;
    private static final av3[] b;
    private static final String[] z;
    private final String a;

    private av3(String str) {
        this.a = str;
    }

    static {
        String[] strArr = new String[4];
        String str = "$~7";
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
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i4 = 48;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i4 = 55;
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
                    str = "\u0004^\u0017";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0013_\fT:";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    VOICE = new av3(z[1], 0, z[3]);
                    ANR = new av3(z[0], 1, z[2]);
                    b = new av3[]{VOICE, ANR};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "3\u007f,t\u001a";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public String getType() {
        return this.a;
    }
}
