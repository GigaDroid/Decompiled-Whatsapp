package com.whatsapp.memory.dump;

import java.util.HashMap;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum d {
    ;
    
    public static final d BOOLEAN;
    public static final d BYTE;
    public static final d CHAR;
    public static final d DOUBLE;
    public static final d FLOAT;
    public static final d INT;
    public static final d LONG;
    public static final d OBJECT;
    public static final d SHORT;
    public static int a;
    private static Map b;
    private static final String[] z;
    private int c;
    private int e;

    private d(int i, int i2) {
        this.e = i;
        this.c = i2;
    }

    public static d getType(int i) {
        return (d) b.get(Integer.valueOf(i));
    }

    static {
        int i = 0;
        String[] strArr = new String[9];
        String str = "z\rI:4a";
        int i2 = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i3 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i4 = 0; length > i4; i4++) {
                int i5;
                char c = cArr[i4];
                switch (i4 % 5) {
                    case v.m /*0*/:
                        i5 = 53;
                        break;
                    case at.g /*1*/:
                        i5 = 79;
                        break;
                    case at.i /*2*/:
                        i5 = 3;
                        break;
                    case at.o /*3*/:
                        i5 = 127;
                        break;
                    default:
                        i5 = 119;
                        break;
                }
                cArr[i4] = (char) (i5 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i3] = str;
                    str = "q\u0000V=;p";
                    i3 = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i3] = str;
                    i3 = 3;
                    strArr2 = strArr3;
                    str = "f\u0007L-#";
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i3] = str;
                    str = "s\u0003L>#";
                    i2 = 3;
                    i3 = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i3] = str;
                    i3 = 5;
                    strArr2 = strArr3;
                    str = "w\u0016W:";
                    i2 = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i3] = str;
                    i3 = 6;
                    str = "v\u0007B-";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i3] = str;
                    i3 = 7;
                    str = "y\u0000M8";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i3] = str;
                    str = "|\u0001W";
                    i2 = 7;
                    i3 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i3] = str;
                    z = strArr3;
                    OBJECT = new d(z[0], 0, 2, 0);
                    BOOLEAN = new d(z[1], 1, 4, 1);
                    CHAR = new d(z[6], 2, 5, 2);
                    FLOAT = new d(z[4], 3, 6, 4);
                    DOUBLE = new d(z[2], 4, 7, 8);
                    BYTE = new d(z[5], 5, 8, 1);
                    SHORT = new d(z[3], 6, 9, 2);
                    INT = new d(z[8], 7, 10, 4);
                    LONG = new d(z[7], 8, 11, 8);
                    d = new d[]{OBJECT, BOOLEAN, CHAR, FLOAT, DOUBLE, BYTE, SHORT, INT, LONG};
                    b = new HashMap();
                    d[] values = values();
                    int length2 = values.length;
                    while (i < length2) {
                        d dVar = values[i];
                        b.put(Integer.valueOf(dVar.e), dVar);
                        i++;
                    }
                    return;
                default:
                    strArr2[i3] = str;
                    str = "w\u0000L32t\u0001";
                    i3 = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public int getSize() {
        return this.c;
    }

    public int getTypeId() {
        return this.e;
    }
}
