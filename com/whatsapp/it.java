package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum it implements aqo {
    ;
    
    public static final it ALLOW;
    public static final it FORWARD;
    public static final it NONE;
    public static final it UPGRADE;
    private static final String[] z;
    private final String b;

    public static it fromText(String str) {
        boolean z = l5.s;
        it[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            it itVar = values[i];
            if (itVar.getText().equals(str)) {
                return itVar;
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return getDefault();
    }

    private it(String str) {
        this.b = str;
    }

    public String getText() {
        return this.b;
    }

    public static it getDefault() {
        return NONE;
    }

    static {
        String[] strArr = new String[8];
        String str = "%N\u000f\"01E";
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
                        i4 = 99;
                        break;
                    case at.g /*1*/:
                        i4 = 1;
                        break;
                    case at.i /*2*/:
                        i4 = 93;
                        break;
                    case at.o /*3*/:
                        i4 = 117;
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
                    str = "\rn3\u0010";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "6Q\u001a'0'D";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\"M\u0011:&";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0016q:\u0007\u0010\u0007d";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0002m1\u001a\u0006";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "-N\u00130";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new it(z[4], 0, z[6]);
                    UPGRADE = new it(z[3], 1, z[5]);
                    FORWARD = new it(z[0], 2, z[1]);
                    NONE = new it(z[7], 3, z[2]);
                    a = new it[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0005n/\u0002\u0010\u0011e";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
