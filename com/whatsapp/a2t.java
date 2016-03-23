package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum a2t implements aqo {
    ;
    
    public static final a2t ALLOW;
    public static final a2t FORWARD;
    public static final a2t NONE;
    public static final a2t UPGRADE;
    private static final String[] z;
    private final String b;

    private a2t(String str) {
        this.b = str;
    }

    public String getText() {
        return this.b;
    }

    public static a2t fromText(String str) {
        boolean z = l5.s;
        a2t[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            a2t com_whatsapp_a2t = values[i];
            if (com_whatsapp_a2t.getText().equals(str)) {
                return com_whatsapp_a2t;
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
        String str = "X{\u0018(,In";
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
                        i4 = 45;
                        break;
                    case at.g /*1*/:
                        i4 = 11;
                        break;
                    case at.i /*2*/:
                        i4 = 127;
                        break;
                    case at.o /*3*/:
                        i4 = 90;
                        break;
                    default:
                        i4 = 77;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "lG3\u0015\u001a";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "cD1\u001f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "Cd\u0011?";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "Lg\u00135:";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "x[8\b\fiN";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "kD-\r\f\u007fO";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new a2t(z[2], 0, z[5]);
                    UPGRADE = new a2t(z[6], 1, z[0]);
                    FORWARD = new a2t(z[7], 2, z[1]);
                    NONE = new a2t(z[3], 3, z[4]);
                    a = new a2t[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "Kd\r-,_o";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static a2t getDefault() {
        return NONE;
    }
}
