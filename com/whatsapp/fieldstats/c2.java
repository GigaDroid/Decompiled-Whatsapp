package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum c2 {
    ;
    
    public static final c2 FAILED_ACCESS_DENIED;
    public static final c2 FAILED_COMMUNICATION;
    public static final c2 FAILED_SERVER_ERROR;
    public static final c2 OK_DID_NOT_CHANGE;
    public static final c2 OK_GOT_PICTURE;
    public static final c2 OK_MISSING;
    private static final c2[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private c2(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[6];
        String str = "\u001b\u0017\u001eu\\\u0019\t\u0004|K\u000b\u0013\u0005f\\\u000f\u0004\u0018k";
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
                        i4 = 93;
                        break;
                    case at.g /*1*/:
                        i4 = 86;
                        break;
                    case at.i /*2*/:
                        i4 = 87;
                        break;
                    case at.o /*3*/:
                        i4 = 57;
                        break;
                    default:
                        i4 = 25;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0012\u001d\b~V\t\t\u0007pZ\t\u0003\u0005|";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0012\u001d\b}P\u0019\t\u0019vM\u0002\u0015\u001fxW\u001a\u0013";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u001b\u0017\u001eu\\\u0019\t\u0016zZ\u0018\u0005\u0004f]\u0018\u0018\u001e|]";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0012\u001d\btP\u000e\u0005\u001ew^";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK_GOT_PICTURE = new c2(z[2], 0, 1);
                    OK_DID_NOT_CHANGE = new c2(z[3], 1, 2);
                    OK_MISSING = new c2(z[5], 2, 3);
                    FAILED_COMMUNICATION = new c2(z[1], 3, 4);
                    FAILED_ACCESS_DENIED = new c2(z[4], 4, 5);
                    FAILED_SERVER_ERROR = new c2(z[0], 5, 6);
                    b = new c2[]{OK_GOT_PICTURE, OK_DID_NOT_CHANGE, OK_MISSING, FAILED_COMMUNICATION, FAILED_ACCESS_DENIED, FAILED_SERVER_ERROR};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001b\u0017\u001eu\\\u0019\t\u0014vT\u0010\u0003\u0019pZ\u001c\u0002\u001evW";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
