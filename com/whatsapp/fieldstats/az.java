package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum az {
    ;
    
    public static final az BALANCE_PERSONAL;
    public static final az BALANCE_WORKSPACE;
    public static final az PERSONAL;
    public static final az WORKSPACE;
    private static final az[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[4];
        String str = "T{ >\u000eU\u007f3/\u0005Di#1\u0001Z";
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
                        i4 = 22;
                        break;
                    case at.g /*1*/:
                        i4 = 58;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 127;
                        break;
                    default:
                        i4 = 64;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "T{ >\u000eU\u007f3(\u000fDq?/\u0001U\u007f";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "Au>4\u0013F{/:";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PERSONAL = new az(z[1], 0, 1);
                    WORKSPACE = new az(z[3], 1, 2);
                    BALANCE_PERSONAL = new az(z[0], 2, 3);
                    BALANCE_WORKSPACE = new az(z[2], 3, 4);
                    a = new az[]{PERSONAL, WORKSPACE, BALANCE_PERSONAL, BALANCE_WORKSPACE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "F\u007f>,\u000fX{ ";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private az(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }
}
