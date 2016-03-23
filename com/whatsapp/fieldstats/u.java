package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum u {
    ;
    
    public static final u CONNECTED;
    public static final u DISCONNECTED;
    public static final u PASSWORD_FAIL;
    public static final u SOCKET_CONNECTING;
    public static final u XMPP_CONNECTING;
    private static final u[] b;
    private static final String[] z;
    private final int a;

    private u(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[5];
        String str = "O\u00196Y2H\t6]9R\u00136F>R\u0011";
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
                        i4 = 28;
                        break;
                    case at.g /*1*/:
                        i4 = 86;
                        break;
                    case at.i /*2*/:
                        i4 = 117;
                        break;
                    case at.o /*3*/:
                        i4 = 18;
                        break;
                    default:
                        i4 = 119;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "X\u001f&Q8R\u00180Q#Y\u0012";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "D\u001b%B(_\u0019;\\2_\u0002<\\0";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "L\u0017&A S\u00041M1]\u001f9";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CONNECTED = new u(z[1], 0, 0);
                    SOCKET_CONNECTING = new u(z[0], 1, 1);
                    XMPP_CONNECTING = new u(z[3], 2, 2);
                    DISCONNECTED = new u(z[2], 3, 3);
                    PASSWORD_FAIL = new u(z[4], 4, 4);
                    b = new u[]{CONNECTED, SOCKET_CONNECTING, XMPP_CONNECTING, DISCONNECTED, PASSWORD_FAIL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "_\u0019;\\2_\u00020V";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
