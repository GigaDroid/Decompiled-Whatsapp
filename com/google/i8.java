package com.google;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum i8 {
    ;
    
    public static final i8 AZTEC_LAYERS;
    public static final i8 CHARACTER_SET;
    public static final i8 DATA_MATRIX_SHAPE;
    public static final i8 ERROR_CORRECTION;
    public static final i8 MARGIN;
    public static final i8 MAX_SIZE;
    public static final i8 MIN_SIZE;
    public static final i8 PDF417_COMPACT;
    public static final i8 PDF417_COMPACTION;
    public static final i8 PDF417_DIMENSIONS;
    private static final String[] z;

    static {
        String[] strArr = new String[10];
        String str = "\u0016AQj,qZT\u0011P\u0016DT\nT\tK";
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
                        i4 = 70;
                        break;
                    case at.g /*1*/:
                        i4 = 5;
                        break;
                    case at.i /*2*/:
                        i4 = 23;
                        break;
                    case at.o /*3*/:
                        i4 = 94;
                        break;
                    default:
                        i4 = 29;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0003WE\u0011O\u0019FX\fO\u0003FC\u0017R\b";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0016AQj,qZT\u0011P\u0016DT\n";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "\u0005MV\f\\\u0005QR\fB\u0015@C";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    str = "\u000bDE\u0019T\b";
                    i = 4;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    strArr2 = strArr3;
                    str = "\u000bLY\u0001N\u000f_R";
                    i = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0016AQj,qZS\u0017P\u0003KD\u0017R\bV";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u000bDO\u0001N\u000f_R";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u0007_C\u001b^\u0019IV\u0007X\u0014V";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ERROR_CORRECTION = new i8(z[2], 0);
                    CHARACTER_SET = new i8(z[4], 1);
                    DATA_MATRIX_SHAPE = new i8(z[1], 2);
                    MIN_SIZE = new i8(z[6], 3);
                    MAX_SIZE = new i8(z[8], 4);
                    MARGIN = new i8(z[5], 5);
                    PDF417_COMPACT = new i8(z[3], 6);
                    PDF417_COMPACTION = new i8(z[0], 7);
                    PDF417_DIMENSIONS = new i8(z[7], 8);
                    AZTEC_LAYERS = new i8(z[9], 9);
                    a = new i8[]{ERROR_CORRECTION, CHARACTER_SET, DATA_MATRIX_SHAPE, MIN_SIZE, MAX_SIZE, MARGIN, PDF417_COMPACT, PDF417_COMPACTION, PDF417_DIMENSIONS, AZTEC_LAYERS};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0002DC\u001fB\u000bDC\fT\u001eZD\u0016\\\u0016@";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
