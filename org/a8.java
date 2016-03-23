package org;

import com.whatsapp.arj;
import org.whispersystems.at;

public enum a8 {
    ;
    
    public static final a8 AUTH_STATE;
    public static final a8 DISCONNECTED_STATE;
    public static final a8 LOGOUT_STATE;
    public static final a8 NOT_AUTH_STATE;
    private static final a8[] a;
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "d>.\u0012,v?;\u000e6".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 90;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "a\")\u0019<k%?\u0019'`/%\t'd??".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 90;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "k$.\u00052p?2\u0005 q*.\u001f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 90;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "i$=\u0015&q4)\u000e2q.".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 90;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
        DISCONNECTED_STATE = new a8(z[1], 0);
        NOT_AUTH_STATE = new a8(z[2], 1);
        AUTH_STATE = new a8(z[0], 2);
        LOGOUT_STATE = new a8(z[3], 3);
        a = new a8[]{DISCONNECTED_STATE, NOT_AUTH_STATE, AUTH_STATE, LOGOUT_STATE};
    }
}
