package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum cn {
    ;
    
    public static final cn ECHOSUPPRESSOR;
    public static final cn MWEBRTC;
    public static final cn NONE;
    public static final cn SPEEX;
    public static final cn WEBRTC;
    private static final cn[] a;
    private static final String[] z;
    private final int b;

    private cn(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[5];
        String str = "Md\\M\u0010]wDP\u0006[t[P";
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
                        i4 = 8;
                        break;
                    case at.g /*1*/:
                        i4 = 39;
                        break;
                    case at.i /*2*/:
                        i4 = 20;
                        break;
                    case at.o /*3*/:
                        i4 = 2;
                        break;
                    default:
                        i4 = 67;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "_bVP\u0017K";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "EpQ@\u0011\\d";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "[wQG\u001b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new cn(z[1], 0, 1);
                    SPEEX = new cn(z[4], 1, 2);
                    WEBRTC = new cn(z[2], 2, 3);
                    MWEBRTC = new cn(z[3], 3, 4);
                    ECHOSUPPRESSOR = new cn(z[0], 4, 5);
                    a = new cn[]{NONE, SPEEX, WEBRTC, MWEBRTC, ECHOSUPPRESSOR};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "FhZG";
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
