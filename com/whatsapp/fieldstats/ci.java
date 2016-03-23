package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum ci {
    ;
    
    public static final ci CONNECTED;
    public static final ci CONNECTING;
    public static final ci DISCONNECTED;
    public static final ci UNKNOWN;
    private static final ci[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[4];
        String str = "oz92\"oa28";
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
                        i4 = 44;
                        break;
                    case at.g /*1*/:
                        i4 = 53;
                        break;
                    case at.i /*2*/:
                        i4 = 119;
                        break;
                    case at.o /*3*/:
                        i4 = 124;
                        break;
                    default:
                        i4 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "h|$?(b{2?3iq";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "oz92\"oa>2 ";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    DISCONNECTED = new ci(z[2], 0, 1);
                    CONNECTING = new ci(z[3], 1, 2);
                    CONNECTED = new ci(z[0], 2, 3);
                    UNKNOWN = new ci(z[1], 3, 4);
                    b = new ci[]{DISCONNECTED, CONNECTING, CONNECTED, UNKNOWN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "y{<2({{";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private ci(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }
}
