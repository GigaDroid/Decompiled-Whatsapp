package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum au {
    ;
    
    public static final au DEV;
    public static final au INTERN;
    public static final au PROD;
    private static final au[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[3];
        String str = "7T-K";
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
                        i4 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 6;
                        break;
                    case at.i /*2*/:
                        i4 = 98;
                        break;
                    case at.o /*3*/:
                        i4 = 15;
                        break;
                    default:
                        i4 = 110;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "#C4";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PROD = new au(z[0], 0, 0);
                    INTERN = new au(z[1], 1, 1);
                    DEV = new au(z[2], 2, 2);
                    b = new au[]{PROD, INTERN, DEV};
                    return;
                default:
                    strArr2[i2] = str;
                    str = ".H6J<)";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private au(int i) {
        this.a = i;
    }
}
