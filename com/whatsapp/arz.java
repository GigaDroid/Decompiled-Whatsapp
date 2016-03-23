package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum arz implements aqo {
    ;
    
    public static final arz ALLOW;
    public static final arz FORWARD;
    public static final arz NONE;
    public static final arz UPGRADE;
    private static final String[] z;
    private final String a;

    public static arz fromText(String str) {
        boolean z = l5.s;
        arz[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            arz com_whatsapp_arz = values[i];
            if (com_whatsapp_arz.getText().equals(str)) {
                return com_whatsapp_arz;
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
        return this.a;
    }

    private arz(String str) {
        this.a = str;
    }

    public static arz getDefault() {
        return ALLOW;
    }

    static {
        String[] strArr = new String[8];
        String str = "\u000fpZ>\u0011";
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
                        i4 = 78;
                        break;
                    case at.g /*1*/:
                        i4 = 60;
                        break;
                    case at.i /*2*/:
                        i4 = 22;
                        break;
                    case at.o /*3*/:
                        i4 = 113;
                        break;
                    default:
                        i4 = 70;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "(Sd\u0006'<X";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\bsD&\u0007\u001cx";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "/Pz\u001e1";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u001blQ#\u0007\ny";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = " Sx\u0014";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0000sX4";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new arz(z[0], 0, z[4]);
                    UPGRADE = new arz(z[5], 1, z[1]);
                    FORWARD = new arz(z[3], 2, z[2]);
                    NONE = new arz(z[7], 3, z[6]);
                    b = new arz[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = ";Lq\u0003'*Y";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
