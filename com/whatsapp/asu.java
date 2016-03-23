package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum asu implements aqo {
    ;
    
    public static final asu ALLOW;
    public static final asu FORWARD;
    public static final asu NONE;
    public static final asu UPGRADE;
    private static final String[] z;
    private final String a;

    public String getText() {
        return this.a;
    }

    public static asu fromText(String str) {
        boolean z = l5.s;
        asu[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            asu com_whatsapp_asu = values[i];
            if (com_whatsapp_asu.getText().equals(str)) {
                return com_whatsapp_asu;
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return getDefault();
    }

    static {
        String[] strArr = new String[8];
        String str = "\u0000Qn^H\u0014Z";
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
                        i4 = 70;
                        break;
                    case at.g /*1*/:
                        i4 = 30;
                        break;
                    case at.i /*2*/:
                        i4 = 60;
                        break;
                    case at.o /*3*/:
                        i4 = 9;
                        break;
                    default:
                        i4 = 9;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "(qRl";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "'rPf~";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0007RpF^";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\bQrL";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = " qN~h4z";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0013N{[H\u0002[";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new asu(z[4], 0, z[3]);
                    UPGRADE = new asu(z[7], 1, z[1]);
                    FORWARD = new asu(z[0], 2, z[6]);
                    NONE = new asu(z[5], 3, z[2]);
                    b = new asu[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "3n[{h\"{";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static asu getDefault() {
        return NONE;
    }

    private asu(String str) {
        this.a = str;
    }
}
