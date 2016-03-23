package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum air implements aqo {
    ;
    
    public static final air ALLOW;
    public static final air FORWARD;
    public static final air NONE;
    public static final air UPGRADE;
    private static final String[] z;
    private final String b;

    public String getText() {
        return this.b;
    }

    public static air fromText(String str) {
        boolean z = l5.s;
        air[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            air com_whatsapp_air = values[i];
            if (com_whatsapp_air.getText().equals(str)) {
                return com_whatsapp_air;
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
        String str = "\\^=\"}HU";
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
                        i4 = 58;
                        break;
                    case at.g /*1*/:
                        i4 = 49;
                        break;
                    case at.i /*2*/:
                        i4 = 79;
                        break;
                    case at.o /*3*/:
                        i4 = 85;
                        break;
                    default:
                        i4 = 28;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "{}\u0003\u001aK";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "OA('}^T";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "t~\u0001\u0010";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "T^!0";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "|~\u001d\u0002]hu";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "oa\b\u0007]~t";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new air(z[2], 0, z[1]);
                    UPGRADE = new air(z[7], 1, z[3]);
                    FORWARD = new air(z[6], 2, z[0]);
                    NONE = new air(z[4], 3, z[5]);
                    a = new air[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "[]#:k";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static air getDefault() {
        return NONE;
    }

    private air(String str) {
        this.b = str;
    }
}
