package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum e5 {
    ;
    
    public static final e5 E164;
    public static final e5 INTERNATIONAL;
    public static final e5 NATIONAL;
    public static final e5 RFC3966;
    private static final e5[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u001dY8.\u001b\u001dY ";
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
                        i4 = 83;
                        break;
                    case at.g /*1*/:
                        i4 = 24;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i4 = 84;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u001aV8\"\u0006\u001dY8.\u001b\u001dY ";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0001^/Tme.";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    E164 = new e5(z[1], 0);
                    INTERNATIONAL = new e5(z[2], 1);
                    NATIONAL = new e5(z[0], 2);
                    RFC3966 = new e5(z[3], 3);
                    a = new e5[]{E164, INTERNATIONAL, NATIONAL, RFC3966};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0016)ZS";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
