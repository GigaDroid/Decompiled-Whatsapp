package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum y {
    ;
    
    public static final y APP_OPEN;
    public static final y CHAT_OPEN;
    public static final y OTHER;
    private static final y[] b;
    private static final String[] z;
    private final int a;

    private y(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[3];
        String str = "ZE\u001ef\bKP\u0000";
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
                        i4 = 27;
                        break;
                    case at.g /*1*/:
                        i4 = 21;
                        break;
                    case at.i /*2*/:
                        i4 = 78;
                        break;
                    case at.o /*3*/:
                        i4 = 57;
                        break;
                    default:
                        i4 = 71;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "TA\u0006|\u0015";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OTHER = new y(z[2], 0, 1);
                    APP_OPEN = new y(z[0], 1, 2);
                    CHAT_OPEN = new y(z[1], 2, 3);
                    b = new y[]{OTHER, APP_OPEN, CHAT_OPEN};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "X]\u000fm\u0018TE\u000bw";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }
}
