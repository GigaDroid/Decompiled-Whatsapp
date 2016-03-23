package com.whatsapp.messaging;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

enum ai {
    ;
    
    public static final ai DEBUG_CHAT_HOST;
    public static final ai END;
    public static final ai FALLBACKS;
    public static final ai HTTP;
    public static final ai IP_OVERRIDE_PORT_1;
    public static final ai IP_OVERRIDE_PORT_2;
    public static final ai OVERRIDES;
    public static final ai PRIMARY;
    public static final ai START;
    private static final ai[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "\u0001iC2]\u0003b";
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
                        i4 = 81;
                        break;
                    case at.g /*1*/:
                        i4 = 59;
                        break;
                    case at.i /*2*/:
                        i4 = 10;
                        break;
                    case at.o /*3*/:
                        i4 = 127;
                        break;
                    default:
                        i4 = 28;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0018kU0J\u0014iX6X\u0014dZ0N\u0005d;";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0017zF3^\u0010xA,";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0018kU0J\u0014iX6X\u0014dZ0N\u0005d8";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0002oK-H";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0019o^/";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0014uN";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u001emO-N\u0018\u007fO,";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    START = new ai(z[5], 0);
                    DEBUG_CHAT_HOST = new ai(z[1], 1);
                    OVERRIDES = new ai(z[8], 2);
                    IP_OVERRIDE_PORT_1 = new ai(z[2], 3);
                    IP_OVERRIDE_PORT_2 = new ai(z[4], 4);
                    PRIMARY = new ai(z[0], 5);
                    FALLBACKS = new ai(z[3], 6);
                    HTTP = new ai(z[6], 7);
                    END = new ai(z[7], 8);
                    a = new ai[]{START, DEBUG_CHAT_HOST, OVERRIDES, IP_OVERRIDE_PORT_1, IP_OVERRIDE_PORT_2, PRIMARY, FALLBACKS, HTTP, END};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0015~H*[\u000exB>H\u000esE,H";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
