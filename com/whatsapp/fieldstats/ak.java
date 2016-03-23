package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum ak {
    ;
    
    public static final ak MAIN;
    public static final ak SHARE_EXT;
    private static final ak[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[2];
        String str = "RrF\u000fi^\u007f_\t";
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
                        i4 = 1;
                        break;
                    case at.g /*1*/:
                        i4 = 58;
                        break;
                    case at.i /*2*/:
                        i4 = 7;
                        break;
                    case at.o /*3*/:
                        i4 = 93;
                        break;
                    default:
                        i4 = 44;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MAIN = new ak(z[1], 0, 1);
                    SHARE_EXT = new ak(z[0], 1, 2);
                    b = new ak[]{MAIN, SHARE_EXT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "L{N\u0013";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private ak(int i) {
        this.a = i;
    }
}
