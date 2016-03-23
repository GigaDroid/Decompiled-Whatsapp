package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum an {
    ;
    
    public static final an CHECKING;
    public static final an DOWNLOADING;
    public static final an IDLE;
    public static final an OBSOLETE;
    public static final an UNCACHED;
    public static final an UPDATEREADY;
    private static final an[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[6];
        String str = "\u0000in\f\t\u000bg}\u000b\u000b\u0003";
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
                        i4 = 68;
                        break;
                    case at.g /*1*/:
                        i4 = 38;
                        break;
                    case at.i /*2*/:
                        i4 = 57;
                        break;
                    case at.o /*3*/:
                        i4 = 66;
                        break;
                    default:
                        i4 = 69;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\rbu\u0007";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0011v}\u0003\u0011\u0001t|\u0003\u0001\u001d";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0007n|\u0001\u000e\rh~";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0011hz\u0003\u0006\fc}";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    UNCACHED = new an(z[5], 0, 0);
                    IDLE = new an(z[2], 1, 1);
                    CHECKING = new an(z[4], 2, 2);
                    DOWNLOADING = new an(z[0], 3, 3);
                    UPDATEREADY = new an(z[3], 4, 4);
                    OBSOLETE = new an(z[1], 5, 5);
                    b = new an[]{UNCACHED, IDLE, CHECKING, DOWNLOADING, UPDATEREADY, OBSOLETE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u000bdj\r\t\u0001r|";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private an(int i) {
        this.a = i;
    }
}
