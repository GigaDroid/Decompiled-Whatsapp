package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum n {
    ;
    
    public static final n BROWSER_CLOSE;
    public static final n BROWSER_LOGOUT;
    public static final n PHONE_LOGOUT;
    private static final n[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private n(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "{dP\"\u0004t`P+\u000e~x";
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
                        i4 = 43;
                        break;
                    case at.g /*1*/:
                        i4 = 44;
                        break;
                    case at.i /*2*/:
                        i4 = 31;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    default:
                        i4 = 65;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "i~P;\u0012n~@/\rd\u007fZ";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    BROWSER_CLOSE = new n(z[2], 0, 0);
                    BROWSER_LOGOUT = new n(z[1], 1, 1);
                    PHONE_LOGOUT = new n(z[0], 2, 2);
                    a = new n[]{BROWSER_CLOSE, BROWSER_LOGOUT, PHONE_LOGOUT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "i~P;\u0012n~@ \u000elcJ8";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
