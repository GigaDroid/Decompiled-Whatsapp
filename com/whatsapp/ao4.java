package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum ao4 implements aqo {
    ;
    
    public static final ao4 ALLOW;
    public static final ao4 FORWARD;
    public static final ao4 NONE;
    public static final ao4 UPGRADE;
    private static final String[] z;
    private final String a;

    public static ao4 getDefault() {
        return NONE;
    }

    private ao4(String str) {
        this.a = str;
    }

    public String getText() {
        return this.a;
    }

    static {
        String[] strArr = new String[8];
        String str = "T\u0007Z^E";
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
                        i4 = 21;
                        break;
                    case at.g /*1*/:
                        i4 = 75;
                        break;
                    case at.i /*2*/:
                        i4 = 22;
                        break;
                    case at.o /*3*/:
                        i4 = 17;
                        break;
                    default:
                        i4 = 18;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "S\u0004DFSG\u000f";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "[\u0004XT";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "`;qcsq.";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "t'z~e";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "s$dfsg/";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "{$xt";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new ao4(z[0], 0, z[5]);
                    UPGRADE = new ao4(z[1], 1, z[4]);
                    FORWARD = new ao4(z[2], 2, z[6]);
                    NONE = new ao4(z[3], 3, z[7]);
                    b = new ao4[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "@\u001bQCSQ\u000e";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static ao4 fromText(String str) {
        boolean z = l5.s;
        ao4[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            ao4 com_whatsapp_ao4 = values[i];
            if (com_whatsapp_ao4.getText().equals(str)) {
                return com_whatsapp_ao4;
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
