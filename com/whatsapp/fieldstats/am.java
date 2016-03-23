package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum am {
    ;
    
    public static final am CHAT_DB_ERROR;
    public static final am DOWNLOAD_ERROR;
    public static final am NOT_ENOUGH_SPACE;
    public static final am NOT_SIGNED_IN;
    public static final am NO_BACKUP;
    @Deprecated
    public static final am QUIT;
    public static final am SKIPPED;
    public static final am SUCCESS;
    public static final am TAR_ERROR;
    private static final am[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[9];
        String str = "u8\u0004>wr0\u001e$`d>\u001e";
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
                        i4 = 59;
                        break;
                    case at.g /*1*/:
                        i4 = 119;
                        break;
                    case at.i /*2*/:
                        i4 = 80;
                        break;
                    case at.o /*3*/:
                        i4 = 97;
                        break;
                    default:
                        i4 = 36;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "u8\u000f#ex<\u00051";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "h\"\u0013\"ah$";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u007f8\u0007/ht6\u0014>ai%\u001f3";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "j\"\u00195";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "o6\u0002>ai%\u001f3";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "h<\u00191t~3";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "x?\u00115{\u007f5\u000f$vi8\u0002";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NOT_SIGNED_IN = new am(z[0], 0, 1);
                    NO_BACKUP = new am(z[2], 1, 2);
                    SKIPPED = new am(z[7], 2, 3);
                    SUCCESS = new am(z[3], 3, 4);
                    CHAT_DB_ERROR = new am(z[8], 4, 5);
                    TAR_ERROR = new am(z[6], 5, 6);
                    DOWNLOAD_ERROR = new am(z[4], 6, 7);
                    NOT_ENOUGH_SPACE = new am(z[1], 7, 8);
                    QUIT = new am(z[5], 8, 9);
                    b = new am[]{NOT_SIGNED_IN, NO_BACKUP, SKIPPED, SUCCESS, CHAT_DB_ERROR, TAR_ERROR, DOWNLOAD_ERROR, NOT_ENOUGH_SPACE, QUIT};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "u8\u0004>au8\u0005&ld$\u0000 g~";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private am(int i) {
        this.a = i;
    }
}
