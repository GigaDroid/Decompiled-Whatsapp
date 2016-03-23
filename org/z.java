package org;

import org.whispersystems.at;

public enum z {
    ;
    
    public static final z CRAM_MD5;
    public static final z PLAIN;
    private static final z[] b;
    private static final String[] z;
    private final String a;

    static {
        int i;
        int i2;
        String[] strArr = new String[4];
        char[] toCharArray = "\n6{\\h\u0004 \u000f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 73;
                    break;
                case at.g /*1*/:
                    i2 = 100;
                    break;
                case at.i /*2*/:
                    i2 = 58;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\n6{\\\u001a\u0004 \u000f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 73;
                    break;
                case at.g /*1*/:
                    i2 = 100;
                    break;
                case at.i /*2*/:
                    i2 = 58;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u0019({Xy".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 73;
                    break;
                case at.g /*1*/:
                    i2 = 100;
                    break;
                case at.i /*2*/:
                    i2 = 58;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u0019({Xy".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 73;
                    break;
                case at.g /*1*/:
                    i2 = 100;
                    break;
                case at.i /*2*/:
                    i2 = 58;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        z = strArr;
        PLAIN = new z(z[3], 0, z[2]);
        CRAM_MD5 = new z(z[0], 1, z[1]);
        b = new z[]{PLAIN, CRAM_MD5};
    }

    public final String getAuthName() {
        return this.a;
    }

    private z(String str) {
        this.a = str;
    }
}
