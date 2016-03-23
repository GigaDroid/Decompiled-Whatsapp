package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum bs {
    ;
    
    public static final bs DELIVERED;
    public static final bs PLAYED;
    public static final bs READ;
    private static final bs[] a;
    private static final String[] z;
    private final int b;

    private bs(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "F>\u000b\u001a\u001fG)\u0002\u0017";
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
                        i4 = 2;
                        break;
                    case at.g /*1*/:
                        i4 = 123;
                        break;
                    case at.i /*2*/:
                        i4 = 71;
                        break;
                    case at.o /*3*/:
                        i4 = 83;
                        break;
                    default:
                        i4 = 73;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "P>\u0006\u0017";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    DELIVERED = new bs(z[0], 0, 1);
                    READ = new bs(z[2], 1, 2);
                    PLAYED = new bs(z[1], 2, 3);
                    a = new bs[]{DELIVERED, READ, PLAYED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "R7\u0006\n\fF";
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
