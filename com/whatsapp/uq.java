package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum uq implements aqo {
    ;
    
    public static final uq ALLOW;
    public static final uq FORWARD;
    public static final uq NONE;
    public static final uq UPGRADE;
    private static final String[] z;
    private final String b;

    public static uq fromText(String str) {
        boolean z = l5.s;
        uq[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            uq uqVar = values[i];
            if (uqVar.getText().equals(str)) {
                return uqVar;
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
        String str = "\u0018\u001a/4\u007f\t\u000f";
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
                        i4 = arj.Theme_switchStyle;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 72;
                        break;
                    case at.o /*3*/:
                        i4 = 70;
                        break;
                    default:
                        i4 = 30;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "8:\u000f\u0014_)/";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0003\u0005&#";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "#%\u0006\u0003";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "+%\u001a\u0011_?.";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ",&\u0004\tI";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\f\u0006$)i";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ALLOW = new uq(z[6], 0, z[7]);
                    UPGRADE = new uq(z[2], 1, z[0]);
                    FORWARD = new uq(z[5], 2, z[1]);
                    NONE = new uq(z[4], 3, z[3]);
                    a = new uq[]{ALLOW, UPGRADE, FORWARD, NONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u000b\u0005:1\u007f\u001f\u000e";
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

    public static uq getDefault() {
        return NONE;
    }

    private uq(String str) {
        this.b = str;
    }
}
