package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum b4 {
    ;
    
    public static final b4 ORIGINAL_PLAINTEXT;
    public static final b4 PLAINTEXT_RECEIPT;
    public static final b4 UNKNOWN_TAGS_RECEIPT;
    private static final b4[] a;
    private static final String[] z;
    private final int b;

    private b4(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "~vV\u0004\u001f|vB\u001e\u0011lkB\u0018\u0015h}T\u001a\u0004";
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
                        i4 = 43;
                        break;
                    case at.g /*1*/:
                        i4 = 56;
                        break;
                    case at.i /*2*/:
                        i4 = 29;
                        break;
                    case at.o /*3*/:
                        i4 = 74;
                        break;
                    default:
                        i4 = 80;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "{t\\\u0003\u001e\u007f}E\u001e\u000fy}^\u000f\u0019{l";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ORIGINAL_PLAINTEXT = new b4(z[1], 0, 1);
                    PLAINTEXT_RECEIPT = new b4(z[2], 1, 2);
                    UNKNOWN_TAGS_RECEIPT = new b4(z[0], 2, 3);
                    a = new b4[]{ORIGINAL_PLAINTEXT, PLAINTEXT_RECEIPT, UNKNOWN_TAGS_RECEIPT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "djT\r\u0019eyQ\u0015\u0000gyT\u0004\u0004n`I";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }
}
