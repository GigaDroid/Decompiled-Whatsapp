package com.whatsapp;

import org.v;
import org.whispersystems.at;

enum a7 {
    ;
    
    public static final a7 BLUETOOTH;
    public static final a7 EARPIECE;
    public static final a7 HEADSET;
    public static final a7 SPEAKER;
    private static final a7[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[4];
        String str = "an:\u0004>l\u007f";
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
                        i4 = 41;
                        break;
                    case at.g /*1*/:
                        i4 = 43;
                        break;
                    case at.i /*2*/:
                        i4 = 123;
                        break;
                    case at.o /*3*/:
                        i4 = 64;
                        break;
                    default:
                        i4 = arj.Theme_switchStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "z{>\u0001&ly";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "kg.\u00059fd/\b";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SPEAKER = new a7(z[2], 0, 1);
                    EARPIECE = new a7(z[1], 1, 2);
                    BLUETOOTH = new a7(z[3], 2, 3);
                    HEADSET = new a7(z[0], 3, 4);
                    b = new a7[]{SPEAKER, EARPIECE, BLUETOOTH, HEADSET};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "lj)\u0010$lh>";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static int a(a7 a7Var) {
        return a7Var.a();
    }

    private a7(int i) {
        this.a = i;
    }

    private int a() {
        return this.a;
    }
}
