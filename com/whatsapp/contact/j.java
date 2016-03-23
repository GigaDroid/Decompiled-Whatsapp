package com.whatsapp.contact;

import org.v;
import org.whispersystems.at;

public enum j {
    ;
    
    public static final j DELAYED;
    public static final j FAILED;
    public static final j IN_PROGRESS;
    public static final j NETWORK_UNAVAILABLE;
    public static final j UP_TO_DATE;
    private static final String[] z;

    public boolean isSuccess() {
        return this == UP_TO_DATE;
    }

    public boolean isFailure() {
        return (this == IN_PROGRESS || isSuccess()) ? false : true;
    }

    static {
        String[] strArr = new String[5];
        String str = "MIJ!0QGA#1BZ_?3BNR3";
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
                        i4 = 3;
                        break;
                    case at.g /*1*/:
                        i4 = 12;
                        break;
                    case at.i /*2*/:
                        i4 = 30;
                        break;
                    case at.o /*3*/:
                        i4 = 118;
                        break;
                    default:
                        i4 = 127;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "EMW::G";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "GIR7&FH";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "V\\A\"0\\H_\":";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NETWORK_UNAVAILABLE = new j(z[0], 0);
                    IN_PROGRESS = new j(z[1], 1);
                    UP_TO_DATE = new j(z[4], 2);
                    FAILED = new j(z[2], 3);
                    DELAYED = new j(z[3], 4);
                    a = new j[]{NETWORK_UNAVAILABLE, IN_PROGRESS, UP_TO_DATE, FAILED, DELAYED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "JBA&-LKL3,P";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
