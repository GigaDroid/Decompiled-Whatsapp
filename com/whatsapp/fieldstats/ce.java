package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum ce {
    ;
    
    public static final ce APNS_PUSH;
    public static final ce GCM_PUSH;
    public static final ce IOS_VOIP_PUSH;
    public static final ce NONE;
    public static final ce ONLINE;
    public static final ce RIM_PUSH;
    public static final ce UNKNOWN;
    private static final ce[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[7];
        String str = "*Hs\u0003z ";
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
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i4 = 6;
                        break;
                    case at.i /*2*/:
                        i4 = 63;
                        break;
                    case at.o /*3*/:
                        i4 = 74;
                        break;
                    default:
                        i4 = 52;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "0Ht\u0004{2H";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = ",Il\u0015b*Oo\u0015d0Uw";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\"Er\u0015d0Uw";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "7Or\u0015d0Uw";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "$Vq\u0019k5Sl\u0002";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new ce(z[1], 0, 0);
                    UNKNOWN = new ce(z[2], 1, 1);
                    APNS_PUSH = new ce(z[6], 2, 2);
                    IOS_VOIP_PUSH = new ce(z[3], 3, 3);
                    GCM_PUSH = new ce(z[4], 4, 4);
                    ONLINE = new ce(z[0], 5, 5);
                    RIM_PUSH = new ce(z[5], 6, 6);
                    b = new ce[]{NONE, UNKNOWN, APNS_PUSH, IOS_VOIP_PUSH, GCM_PUSH, ONLINE, RIM_PUSH};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "+Iq\u000f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private ce(int i) {
        this.a = i;
    }
}
