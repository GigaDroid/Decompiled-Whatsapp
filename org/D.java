package org;

import org.whispersystems.at;

public enum D {
    ;
    
    public static final D MESSAGES;
    public static final D RECENT;
    public static final D UIDNEXT;
    public static final D UIDVALIDITY;
    public static final D UNSEEN;
    private static final D[] a;
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[5];
        char[] toCharArray = "\u0010aZii\u001d|".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 69;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0017m]bb\u0011".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 69;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\bmMtm\u0002mM".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 69;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0010fMbi\u000b".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 69;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0010aZqm\taZnx\u001c".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 69;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        z = strArr;
        MESSAGES = new D(z[2], 0);
        RECENT = new D(z[1], 1);
        UIDNEXT = new D(z[0], 2);
        UIDVALIDITY = new D(z[4], 3);
        UNSEEN = new D(z[3], 4);
        a = new D[]{MESSAGES, RECENT, UIDNEXT, UIDVALIDITY, UNSEEN};
    }
}
