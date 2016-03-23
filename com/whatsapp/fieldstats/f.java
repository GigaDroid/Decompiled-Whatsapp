package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum f {
    ;
    
    public static final f EMAIL_SEND;
    public static final f IN_APP_FAQ;
    public static final f PROBLEM_DESCRIPTION;
    public static final f SUGGESTED_FAQ;
    private static final f[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private f(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[4];
        String str = "d\u0004\u00181\rd\u0005\u001a2\u0017q\u0010\u000e";
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
                        i4 = 55;
                        break;
                    case at.g /*1*/:
                        i4 = 81;
                        break;
                    case at.i /*2*/:
                        i4 = 95;
                        break;
                    case at.o /*3*/:
                        i4 = 118;
                        break;
                    default:
                        i4 = 72;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "g\u0003\u00104\u0004r\u001c\u00002\rd\u0012\r?\u0018c\u0018\u00108";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "r\u001c\u001e?\u0004h\u0002\u001a8\f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    PROBLEM_DESCRIPTION = new f(z[2], 0, 1);
                    SUGGESTED_FAQ = new f(z[0], 1, 2);
                    EMAIL_SEND = new f(z[3], 2, 3);
                    IN_APP_FAQ = new f(z[1], 3, 4);
                    b = new f[]{PROBLEM_DESCRIPTION, SUGGESTED_FAQ, EMAIL_SEND, IN_APP_FAQ};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "~\u001f\u00007\u0018g\u000e\u00197\u0019";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
