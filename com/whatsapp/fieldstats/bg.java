package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bg {
    ;
    
    public static final bg FULL;
    public static final bg THUMB;
    private static final bg[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[2];
        String str = "PDC\f";
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
                        i4 = 17;
                        break;
                    case at.i /*2*/:
                        i4 = 15;
                        break;
                    case at.o /*3*/:
                        i4 = 64;
                        break;
                    default:
                        i4 = 12;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    THUMB = new bg(z[1], 0, 1);
                    FULL = new bg(z[0], 1, 2);
                    b = new bg[]{THUMB, FULL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "BYZ\rN";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    private bg(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
