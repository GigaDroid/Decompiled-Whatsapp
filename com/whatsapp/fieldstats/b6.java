package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.at;

public enum b6 {
    ;
    
    public static final b6 LOCAL_BACKUP_IS_NEWER_THAN_REMOTE;
    public static final b6 NO_BACKUP_FOUND;
    public static final b6 ONLY_LOCAL_BACKUP_FOUND;
    public static final b6 ONLY_REMOTE_BACKUP_FOUND;
    @Deprecated
    public static final b6 REMOTE_AND_LOCAL_BACKUP_FOUND;
    public static final b6 REMOTE_BACKUP_IS_NEWER_THAN_LOCAL;
    public static final b6 REMOTE_BACKUP_IS_SAME_AS_LOCAL;
    private static final b6[] a;
    private static final String[] z;
    private final int b;

    private b6(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }

    static {
        String[] strArr = new String[7];
        String str = "5.RbP8*XpN=.XnU";
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
                        i4 = 123;
                        break;
                    case at.g /*1*/:
                        i4 = 97;
                        break;
                    case at.i /*2*/:
                        i4 = 13;
                        break;
                    case at.o /*3*/:
                        i4 = 32;
                        break;
                    default:
                        i4 = 17;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ")$@oE>>OaR04]\u007fX(>CeF>3RtY:/Rl^8 A";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "4/AyN)$@oE>>OaR04]\u007fW44Cd";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = ")$@oE>>LnU$-BcP7>OaR04]\u007fW44Cd";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = ")$@oE>>OaR04]\u007fX(>^a\\>>LsN7.Na]";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "7.Na]$#LcZ.1RiB$/HwT)>YhP5>_e\\45H";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    REMOTE_AND_LOCAL_BACKUP_FOUND = new b6(z[4], 0, 1);
                    ONLY_REMOTE_BACKUP_FOUND = new b6(z[3], 1, 2);
                    ONLY_LOCAL_BACKUP_FOUND = new b6(z[1], 2, 3);
                    NO_BACKUP_FOUND = new b6(z[0], 3, 4);
                    REMOTE_BACKUP_IS_SAME_AS_LOCAL = new b6(z[5], 4, 5);
                    REMOTE_BACKUP_IS_NEWER_THAN_LOCAL = new b6(z[2], 5, 6);
                    LOCAL_BACKUP_IS_NEWER_THAN_REMOTE = new b6(z[6], 6, 7);
                    a = new b6[]{REMOTE_AND_LOCAL_BACKUP_FOUND, ONLY_REMOTE_BACKUP_FOUND, ONLY_LOCAL_BACKUP_FOUND, NO_BACKUP_FOUND, REMOTE_BACKUP_IS_SAME_AS_LOCAL, REMOTE_BACKUP_IS_NEWER_THAN_LOCAL, LOCAL_BACKUP_IS_NEWER_THAN_REMOTE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "4/AyN7.Na]$#LcZ.1Rf^./I";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
