package org;

import org.whispersystems.at;

public enum e {
    ;
    
    public static final e ALL;
    public static final e BODY;
    public static final e BODYSTRUCTURE;
    public static final e ENVELOPE;
    public static final e FAST;
    public static final e FLAGS;
    public static final e FULL;
    public static final e INTERNALDATE;
    public static final e RFC822;
    public static final e UID;
    private static final e[] a;
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[10];
        char[] toCharArray = "\u0015]Sd\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0011^Vz\u0006\u0007CG`\u0001\u0006CW".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0006XV".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0015PAw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0011^Vz".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u001a_Ff\u0007\u001dP^g\u0014\u0007T".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "\u0001WQ\u001bga".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "\u0015D^o".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "\u0012]^".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "\u0016_Df\u0019\u001cAW".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 83;
                    break;
                case at.g /*1*/:
                    i2 = 17;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        z = strArr;
        ALL = new e(z[8], 0);
        FAST = new e(z[3], 1);
        FULL = new e(z[7], 2);
        BODY = new e(z[4], 3);
        BODYSTRUCTURE = new e(z[1], 4);
        ENVELOPE = new e(z[9], 5);
        FLAGS = new e(z[0], 6);
        INTERNALDATE = new e(z[5], 7);
        RFC822 = new e(z[6], 8);
        UID = new e(z[2], 9);
        a = new e[]{ALL, FAST, FULL, BODY, BODYSTRUCTURE, ENVELOPE, FLAGS, INTERNALDATE, RFC822, UID};
    }
}
