package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum tq implements aqo {
    ;
    
    public static final tq ALLOW;
    public static final tq FORWARD;
    public static final tq NONE;
    public static final tq UPGRADE;
    private static final String[] z;
    private final String b;

    public static tq fromText(String str) {
        boolean z = l5.s;
        tq[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            tq tqVar = values[i];
            if (tqVar.getText().equals(str)) {
                return tqVar;
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return getDefault();
    }

    public static tq getDefault() {
        return NONE;
    }

    private tq(String str) {
        this.b = str;
    }

    static {
        String[] strArr = new String[8];
        String str = "t\fz\u0006";
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
                        i4 = 67;
                        break;
                    case at.i /*2*/:
                        i4 = 52;
                        break;
                    case at.o /*3*/:
                        i4 = 67;
                        break;
                    default:
                        i4 = 54;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "o\u0013s\u0011w~\u0006";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "|\ff\u0014wh\u0007";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\\,F4WH'";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "T,Z&";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "{\u000fx\fa";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "O3S1W^&";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new tq(z[6], 0, z[1]);
                    UPGRADE = new tq(z[2], 1, z[7]);
                    FORWARD = new tq(z[3], 2, z[4]);
                    NONE = new tq(z[0], 3, z[5]);
                    a = new tq[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "[/X,A";
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
