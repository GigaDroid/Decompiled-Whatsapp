package org.whispersystems.jobqueue;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

enum n {
    ;
    
    public static final n DEFERRED;
    public static final n FAILURE;
    public static final n SUCCESS;
    private static final n[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "?@z!`+D";
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
                        i4 = 121;
                        break;
                    case at.g /*1*/:
                        i4 = 1;
                        break;
                    case at.i /*2*/:
                        i4 = 51;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_switchStyle;
                        break;
                    default:
                        i4 = 53;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "=Du(g+Dw";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SUCCESS = new n(z[1], 0);
                    FAILURE = new n(z[0], 1);
                    DEFERRED = new n(z[2], 2);
                    a = new n[]{SUCCESS, FAILURE, DEFERRED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "*Tp.p*R";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
