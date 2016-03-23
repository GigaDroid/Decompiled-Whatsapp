package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum z {
    ;
    
    public static final z CONTACTS;
    public static final z KEYS;
    public static final z MESSAGES;
    private static final z[] b;
    private static final String[] z;
    private final int a;

    private z(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "_\u0005@25U\u0005@";
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
                        i4 = 18;
                        break;
                    case at.g /*1*/:
                        i4 = 64;
                        break;
                    case at.i /*2*/:
                        i4 = 19;
                        break;
                    case at.o /*3*/:
                        i4 = 97;
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
                    str = "Y\u0005J2";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    MESSAGES = new z(z[0], 0, 1);
                    CONTACTS = new z(z[1], 1, 2);
                    KEYS = new z(z[2], 2, 3);
                    b = new z[]{MESSAGES, CONTACTS, KEYS};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "Q\u000f]55Q\u0014@";
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
}
