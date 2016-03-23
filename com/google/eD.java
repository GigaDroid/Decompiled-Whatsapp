package com.google;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum eD {
    ;
    
    public static final eD BYTE_SEGMENTS;
    public static final eD ERROR_CORRECTION_LEVEL;
    public static final eD ISSUE_NUMBER;
    public static final eD ORIENTATION;
    public static final eD OTHER;
    public static final eD PDF417_EXTRA_METADATA;
    public static final eD POSSIBLE_COUNTRY;
    public static final eD STRUCTURED_APPEND_PARITY;
    public static final eD STRUCTURED_APPEND_SEQUENCE;
    public static final eD SUGGESTED_PRICE;
    public static final eD UPC_EAN_EXTENSION;
    private static final String[] z;

    static {
        String[] strArr = new String[11];
        String str = "pq\n-rwp\n=u|d\b(tma\u0007+trp\u001d6rf";
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
                        i4 = 35;
                        break;
                    case at.g /*1*/:
                        i4 = 37;
                        break;
                    case at.i /*2*/:
                        i4 = 88;
                        break;
                    case at.o /*3*/:
                        i4 = 120;
                        break;
                    default:
                        i4 = 49;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "fw\n7c|f\u0017*cff\f1~mz\u0014=gfi";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "vu\u001b'tbk\u0007=iw`\u0016+xlk";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "lq\u0010=c";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "lw\u0011=\u007fwd\f1~m";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "sa\u001eL\u0000\u0014z\u001d eqd\u00075twd\u001c9eb";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "pq\n-rwp\n=u|d\b(tma\u0007(pql\f!";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "pp\u001f?tpq\u001d<nsw\u0011;t";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "jv\u000b-t|k\r5sfw";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "sj\u000b+xai\u001d'rlp\u0016,cz";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OTHER = new eD(z[4], 0);
                    ORIENTATION = new eD(z[5], 1);
                    BYTE_SEGMENTS = new eD(z[1], 2);
                    ERROR_CORRECTION_LEVEL = new eD(z[2], 3);
                    ISSUE_NUMBER = new eD(z[9], 4);
                    SUGGESTED_PRICE = new eD(z[8], 5);
                    POSSIBLE_COUNTRY = new eD(z[10], 6);
                    UPC_EAN_EXTENSION = new eD(z[3], 7);
                    PDF417_EXTRA_METADATA = new eD(z[6], 8);
                    STRUCTURED_APPEND_SEQUENCE = new eD(z[0], 9);
                    STRUCTURED_APPEND_PARITY = new eD(z[7], 10);
                    a = new eD[]{OTHER, ORIENTATION, BYTE_SEGMENTS, ERROR_CORRECTION_LEVEL, ISSUE_NUMBER, SUGGESTED_PRICE, POSSIBLE_COUNTRY, UPC_EAN_EXTENSION, PDF417_EXTRA_METADATA, STRUCTURED_APPEND_SEQUENCE, STRUCTURED_APPEND_PARITY};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "a|\f=np`\u001f5tmq\u000b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
