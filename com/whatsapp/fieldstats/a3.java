package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum a3 {
    ;
    
    public static final a3 CANCEL;
    public static final a3 FAILED_COMMUNICATION;
    public static final a3 FAILED_OTHER;
    public static final a3 FAILED_OUT_OF_QUOTA;
    public static final a3 OK;
    private static final a3[] b;
    private static final String[] z;
    private final int a;

    private a3(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[5];
        String str = "]W 0x_I*3pVC'5~ZB 3s";
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
                        i4 = 27;
                        break;
                    case at.g /*1*/:
                        i4 = 22;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_radioButtonStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 124;
                        break;
                    default:
                        i4 = 61;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "]W 0x_I&(u^D";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "]W 0x_I&)iDY/#lNY==";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "XW'?xW";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new a3(z[1], 0, 1);
                    CANCEL = new a3(z[4], 1, 2);
                    FAILED_OUT_OF_QUOTA = new a3(z[3], 2, 3);
                    FAILED_COMMUNICATION = new a3(z[0], 3, 4);
                    FAILED_OTHER = new a3(z[2], 4, 5);
                    b = new a3[]{OK, CANCEL, FAILED_OUT_OF_QUOTA, FAILED_COMMUNICATION, FAILED_OTHER};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "T]";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
