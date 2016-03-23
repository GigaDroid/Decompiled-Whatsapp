package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum ms implements aqo {
    ;
    
    public static final ms ALLOW;
    public static final ms FORWARD;
    public static final ms NONE;
    public static final ms UPGRADE;
    private static final String[] z;
    private final String b;

    public static ms fromText(String str) {
        boolean z = l5.s;
        ms[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            ms msVar = values[i];
            if (msVar.getText().equals(str)) {
                return msVar;
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return getDefault();
    }

    private ms(String str) {
        this.b = str;
    }

    public static ms getDefault() {
        return NONE;
    }

    static {
        String[] strArr = new String[8];
        String str = "\u001d\u0014\n|\u001b\f\u0001";
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
                        i4 = arj.Theme_editTextStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 100;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_switchStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 14;
                        break;
                    default:
                        i4 = 122;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "=4*\\;,!";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\t\b\u0001a\r";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = ".+?Y;: ";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = ")(!A-";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0006\u000b\u0003k";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "&+#K";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new ms(z[5], 0, z[3]);
                    UPGRADE = new ms(z[2], 1, z[0]);
                    FORWARD = new ms(z[4], 2, z[1]);
                    NONE = new ms(z[7], 3, z[6]);
                    a = new ms[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u000e\u000b\u001fy\u001b\u001a\u0000";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public String getText() {
        return this.b;
    }
}
