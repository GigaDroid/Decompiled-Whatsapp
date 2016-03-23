package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum aa {
    ;
    
    public static final aa BUSY;
    public static final aa NOT_ALLOWED;
    public static final aa NO_MESSAGES;
    public static final aa SUCCESS;
    private static final aa[] b;
    private static final String[] z;
    private final int a;

    private aa(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[4];
        String str = "\u0013Y\u0000$";
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
                        i4 = 81;
                        break;
                    case at.g /*1*/:
                        i4 = 12;
                        break;
                    case at.i /*2*/:
                        i4 = 83;
                        break;
                    case at.o /*3*/:
                        i4 = 125;
                        break;
                    default:
                        i4 = 95;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u001fC\f0\u001a\u0002_\u0012:\u001a\u0002";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0002Y\u0010>\u001a\u0002_";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new aa(z[3], 0, 1);
                    NO_MESSAGES = new aa(z[2], 1, 2);
                    BUSY = new aa(z[0], 2, 3);
                    NOT_ALLOWED = new aa(z[1], 3, 4);
                    b = new aa[]{SUCCESS, NO_MESSAGES, BUSY, NOT_ALLOWED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001fC\u0007\"\u001e\u001d@\u001c*\u001a\u0015";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
