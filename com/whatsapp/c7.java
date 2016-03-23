package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum c7 implements aqo {
    ;
    
    public static final c7 ALLOW;
    public static final c7 FORWARD;
    public static final c7 NONE;
    public static final c7 UPGRADE;
    private static final String[] z;
    private final String a;

    public String getText() {
        return this.a;
    }

    public static c7 getDefault() {
        return NONE;
    }

    private c7(String str) {
        this.a = str;
    }

    static {
        String[] strArr = new String[8];
        String str = "\u001c!RG";
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
                        i4 = 114;
                        break;
                    case at.g /*1*/:
                        i4 = 78;
                        break;
                    case at.i /*2*/:
                        i4 = 60;
                        break;
                    case at.o /*3*/:
                        i4 = 34;
                        break;
                    default:
                        i4 = 23;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0007>[Pv\u0016+";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0014!NUv\u0000*";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0013\"PM`";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "'\u001e{pV6\u000b";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "4\u0001nuV \n";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "3\u0002pm@";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new c7(z[7], 0, z[4]);
                    UPGRADE = new c7(z[5], 1, z[2]);
                    FORWARD = new c7(z[6], 2, z[3]);
                    NONE = new c7(z[1], 3, z[0]);
                    b = new c7[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "<\u0001rg";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static c7 fromText(String str) {
        boolean z = l5.s;
        c7[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            c7 c7Var = values[i];
            if (c7Var.getText().equals(str)) {
                return c7Var;
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return getDefault();
    }
}
