package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum a5i implements aqo {
    ;
    
    public static final a5i ALLOW;
    public static final a5i FORWARD;
    public static final a5i NONE;
    public static final a5i UPGRADE;
    private static final String[] z;
    private final String b;

    public static a5i getDefault() {
        return NONE;
    }

    private a5i(String str) {
        this.b = str;
    }

    static {
        String[] strArr = new String[8];
        String str = "[A\"T?";
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
                        i4 = 45;
                        break;
                    case at.i /*2*/:
                        i4 = 78;
                        break;
                    case at.o /*3*/:
                        i4 = 59;
                        break;
                    default:
                        i4 = 72;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\\B<L)HI";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "O])I)^H";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "TB ^";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "|b\u001cl\thi";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "o}\ti\t~h";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "tb\u0000~";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new a5i(z[1], 0, z[0]);
                    UPGRADE = new a5i(z[6], 1, z[3]);
                    FORWARD = new a5i(z[5], 2, z[2]);
                    NONE = new a5i(z[7], 3, z[4]);
                    a = new a5i[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "{a\u0002t\u001f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static a5i fromText(String str) {
        boolean z = l5.s;
        a5i[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            a5i com_whatsapp_a5i = values[i];
            if (com_whatsapp_a5i.getText().equals(str)) {
                return com_whatsapp_a5i;
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return getDefault();
    }

    public String getText() {
        return this.b;
    }
}
