package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum a3m implements aqo {
    ;
    
    public static final a3m ALLOW;
    public static final a3m FORWARD;
    public static final a3m NONE;
    public static final a3m UPGRADE;
    private static final String[] z;
    private final String b;

    private a3m(String str) {
        this.b = str;
    }

    public static a3m fromText(String str) {
        boolean z = l5.s;
        a3m[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            a3m com_whatsapp_a3m = values[i];
            if (com_whatsapp_a3m.getText().equals(str)) {
                return com_whatsapp_a3m;
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return getDefault();
    }

    public static a3m getDefault() {
        return NONE;
    }

    static {
        String[] strArr = new String[8];
        String str = "'?+`";
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
                        i4 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 112;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i4 = 37;
                        break;
                    default:
                        i4 = 38;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "(<)jq";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u001c\u0000\u0002WG\r\u0015";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "< \"wg-5";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0007\u001f\u000b@";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u000f\u001f\u0017RG\u001b\u0014";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\b\u001c\tJQ";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new a3m(z[2], 0, z[7]);
                    UPGRADE = new a3m(z[4], 1, z[3]);
                    FORWARD = new a3m(z[1], 2, z[6]);
                    NONE = new a3m(z[0], 3, z[5]);
                    a = new a3m[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "/?7rg;4";
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
