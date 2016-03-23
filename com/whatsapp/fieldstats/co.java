package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum co {
    ;
    
    public static final co BANNER;
    public static final co CONTACTS;
    public static final co MENU;
    public static final co MULTISELECT;
    private static final co[] a;
    private static final String[] z;
    private final int b;

    private co(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[4];
        String str = "`F!:1p";
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
                        i4 = 34;
                        break;
                    case at.g /*1*/:
                        i4 = 7;
                        break;
                    case at.i /*2*/:
                        i4 = 111;
                        break;
                    case at.o /*3*/:
                        i4 = 116;
                        break;
                    default:
                        i4 = 116;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "aH! 5aS<";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "oR# =qB#17v";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    BANNER = new co(z[0], 0, 1);
                    MENU = new co(z[1], 1, 2);
                    CONTACTS = new co(z[2], 2, 3);
                    MULTISELECT = new co(z[3], 3, 4);
                    a = new co[]{BANNER, MENU, CONTACTS, MULTISELECT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "oB!!";
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
