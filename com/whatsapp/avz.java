package com.whatsapp;

import java.math.BigDecimal;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

enum avz {
    ;
    
    public static final avz BIG_DECIMAL;
    public static final avz BYTE;
    public static final avz DOUBLE;
    public static final avz FLOAT;
    public static final avz INTEGER;
    public static final avz LONG;
    public static final avz SHORT;
    private static final avz[] a;
    private static final String[] z;

    public static avz fromNumber(Number number) {
        try {
            if (number instanceof Long) {
                return LONG;
            }
            try {
                if (number instanceof Double) {
                    return DOUBLE;
                }
                try {
                    if (number instanceof Integer) {
                        return INTEGER;
                    }
                    try {
                        if (number instanceof Float) {
                            return FLOAT;
                        }
                        try {
                            if (number instanceof Short) {
                                return SHORT;
                            }
                            try {
                                if (number instanceof Byte) {
                                    return BYTE;
                                }
                                try {
                                    if (number instanceof BigDecimal) {
                                        return BIG_DECIMAL;
                                    }
                                    throw new IllegalArgumentException(z[0] + number.getClass().getName() + z[1]);
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        }
    }

    static {
        String[] strArr = new String[11];
        String str = "6\t6\u001c_\n\\8\u0012[\u000b\u000f{Y";
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
                        i4 = 120;
                        break;
                    case at.g /*1*/:
                        i4 = 124;
                        break;
                    case at.i /*2*/:
                        i4 = 91;
                        break;
                    case at.o /*3*/:
                        i4 = 126;
                        break;
                    default:
                        i4 = 58;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "\u001b\u001d5YNX\u001f4\u0010L\u001d\u000e/^";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "X\b4^[X2.\u0013X\u001d\u000e{\u0011X\u0012\u00198\n";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = ":5\u001c!~=?\u00123{4";
                    i = 3;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    str = "12\u000f;}=.";
                    i2 = 5;
                    strArr2 = strArr3;
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    str = "<3\u000e<v=";
                    i2 = 6;
                    strArr2 = strArr3;
                    i = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    strArr2 = strArr3;
                    str = ">0\u0014?n";
                    i = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "+4\u0014,n";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = ":%\u000f;";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "43\u00159";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    LONG = new avz(z[10], 0);
                    DOUBLE = new avz(z[6], 1);
                    INTEGER = new avz(z[5], 2);
                    FLOAT = new avz(z[7], 3);
                    SHORT = new avz(z[8], 4);
                    BYTE = new avz(z[9], 5);
                    BIG_DECIMAL = new avz(z[4], 6);
                    a = new avz[]{LONG, DOUBLE, INTEGER, FLOAT, SHORT, BYTE, BIG_DECIMAL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "_\\2\r\u001a\u0016\u0013/^I\r\f+\u0011H\f\u0019?";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public Number toNumber(double d) {
        try {
            switch (dj.a[ordinal()]) {
                case at.g /*1*/:
                    return new Long((long) d);
                case at.i /*2*/:
                    return Double.valueOf(d);
                case at.o /*3*/:
                    return new Integer((int) d);
                case at.p /*4*/:
                    return new Float(d);
                case at.m /*5*/:
                    return new Short((short) ((int) d));
                case Y.f /*6*/:
                    return new Byte((byte) ((int) d));
                case aF.v /*7*/:
                    return new BigDecimal(d);
                default:
                    throw new InstantiationError(z[2] + this + z[3]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }
}
