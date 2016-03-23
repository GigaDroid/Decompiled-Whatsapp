package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum aw {
    ;
    
    public static final aw CREATE_DATA;
    public static final aw DELETE_DATA;
    public static final aw GET_DATA;
    public static final aw SET_DATA;
    private static final aw[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[4];
        String str = "Vy'v^Ph2";
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
                        i4 = 17;
                        break;
                    case at.g /*1*/:
                        i4 = 60;
                        break;
                    case at.i /*2*/:
                        i4 = 115;
                        break;
                    case at.o /*3*/:
                        i4 = 41;
                        break;
                    default:
                        i4 = 26;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "Rn6hNTc7hNP";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "By'v^Ph2";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SET_DATA = new aw(z[3], 0, 1);
                    GET_DATA = new aw(z[0], 1, 2);
                    CREATE_DATA = new aw(z[2], 2, 3);
                    DELETE_DATA = new aw(z[1], 3, 4);
                    a = new aw[]{SET_DATA, GET_DATA, CREATE_DATA, DELETE_DATA};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "Uy?lNTc7hNP";
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

    private aw(int i) {
        this.b = i;
    }
}
