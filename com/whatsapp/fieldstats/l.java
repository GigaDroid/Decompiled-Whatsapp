package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum l {
    ;
    
    public static final l MESSAGE;
    public static final l PREKEY_MESSAGE;
    public static final l SENDER_KEY_MESSAGE;
    private static final l[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[3];
        String str = "UP8W\u0018\\]0Y\u000eVC:Y";
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
                        i4 = 5;
                        break;
                    case at.g /*1*/:
                        i4 = 2;
                        break;
                    case at.i /*2*/:
                        i4 = 125;
                        break;
                    case at.o /*3*/:
                        i4 = 28;
                        break;
                    default:
                        i4 = 93;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "VG3X\u0018W]6Y\u0004ZO8O\u000eDE8";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MESSAGE = new l(z[1], 0, 0);
                    PREKEY_MESSAGE = new l(z[0], 1, 1);
                    SENDER_KEY_MESSAGE = new l(z[2], 2, 2);
                    b = new l[]{MESSAGE, PREKEY_MESSAGE, SENDER_KEY_MESSAGE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "HG.O\u001cBG";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private l(int i) {
        this.a = i;
    }
}
