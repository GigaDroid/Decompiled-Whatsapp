package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum bp {
    ;
    
    public static final bp CONNECTING;
    public static final bp NORMAL;
    public static final bp OFFLINE;
    public static final bp OPENING;
    public static final bp PAIRING;
    public static final bp RESUMING;
    public static final bp SYNCING;
    public static final bp TIMEOUT;
    private static final bp[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[8];
        String str = ":z[c\u0012!qO";
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
                        i4 = arj.Theme_editTextStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 63;
                        break;
                    case at.i /*2*/:
                        i4 = 8;
                        break;
                    case at.o /*3*/:
                        i4 = 54;
                        break;
                    default:
                        i4 = 95;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "<vEs\u0010=k";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "&pZ{\u001e$";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "8~Ad\u0016&x";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "+pFx\u001a+kAx\u0018";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "'oMx\u0016&x";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "'yNz\u0016&z";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OFFLINE = new bp(z[7], 0, 0);
                    OPENING = new bp(z[6], 1, 1);
                    PAIRING = new bp(z[4], 2, 2);
                    SYNCING = new bp(z[1], 3, 3);
                    RESUMING = new bp(z[0], 4, 4);
                    CONNECTING = new bp(z[5], 5, 5);
                    NORMAL = new bp(z[3], 6, 6);
                    TIMEOUT = new bp(z[2], 7, 7);
                    b = new bp[]{OFFLINE, OPENING, PAIRING, SYNCING, RESUMING, CONNECTING, NORMAL, TIMEOUT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = ";fFu\u0016&x";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private bp(int i) {
        this.a = i;
    }
}
