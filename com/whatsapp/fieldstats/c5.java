package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum c5 {
    ;
    
    public static final c5 DELAYED;
    public static final c5 FAILED;
    public static final c5 IN_PROGRESS;
    public static final c5 NETWORK_UNAVAILABLE;
    public static final c5 UP_TO_DATE;
    public static final c5 USER_IS_EXPIRED;
    private static final c5[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private c5(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[6];
        String str = "\u0011\tYk,\r\tC|+\u0014\u0013N|7";
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
                        i4 = 90;
                        break;
                    case at.i /*2*/:
                        i4 = 28;
                        break;
                    case at.o /*3*/:
                        i4 = 57;
                        break;
                    default:
                        i4 = 115;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\r\u0014Ci!\u000b\u001dN| \u0017";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\n\u001fHn<\u0016\u0011Cl=\u0005\f]p?\u0005\u0018P|";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0011\nCm<\u001b\u001e]m6";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0002\u001bUu6\u0000";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NETWORK_UNAVAILABLE = new c5(z[3], 0, 1);
                    IN_PROGRESS = new c5(z[2], 1, 2);
                    UP_TO_DATE = new c5(z[4], 2, 3);
                    FAILED = new c5(z[5], 3, 4);
                    DELAYED = new c5(z[1], 4, 5);
                    USER_IS_EXPIRED = new c5(z[0], 5, 6);
                    a = new c5[]{NETWORK_UNAVAILABLE, IN_PROGRESS, UP_TO_DATE, FAILED, DELAYED, USER_IS_EXPIRED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0000\u001fPx*\u0001\u001e";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
