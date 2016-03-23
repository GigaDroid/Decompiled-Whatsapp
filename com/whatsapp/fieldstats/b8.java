package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum b8 {
    ;
    
    public static final b8 DEDUPED;
    public static final b8 ERROR_CANCEL;
    public static final b8 ERROR_CANNOT_RESUME;
    public static final b8 ERROR_DNS;
    public static final b8 ERROR_HASH_MISMATCH;
    public static final b8 ERROR_INSUFFICIENT_SPACE;
    public static final b8 ERROR_INVALID_MEDIA;
    public static final b8 ERROR_INVALID_URL;
    public static final b8 ERROR_OUTPUT_STREAM;
    public static final b8 ERROR_TIMEOUT;
    public static final b8 ERROR_TOO_OLD;
    public static final b8 ERROR_UNKNOWN;
    public static final b8 OK;
    private static final b8[] b;
    private static final String[] z;
    private final int a;

    private b8(int i) {
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[13];
        String str = ";\u001dZ\u000b\u001c!\u001bG\u000b\u00111\u0003L";
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
                        i4 = 126;
                        break;
                    case at.g /*1*/:
                        i4 = 79;
                        break;
                    case at.i /*2*/:
                        i4 = 8;
                        break;
                    case at.o /*3*/:
                        i4 = 68;
                        break;
                    default:
                        i4 = 78;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ";\u001dZ\u000b\u001c!\u0007I\u0017\u0006!\u0002A\u0017\u0003?\u001bK\f";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = ";\u001dZ\u000b\u001c!\fI\n\r;\u0003";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = ":\nL\u0011\u001e;\u000b";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = ";\u001dZ\u000b\u001c!\u0006F\u0012\u000f2\u0006L\u001b\u0003;\u000bA\u0005";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ";\u001dZ\u000b\u001c!\u001bA\t\u000b1\u001a\\";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "1\u0004";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = ";\u001dZ\u000b\u001c!\u000bF\u0017";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = ";\u001dZ\u000b\u001c!\u0006F\u0017\u001b8\tA\u0007\u0007;\u0001\\\u001b\u001d.\u000eK\u0001";
                    i = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = ";\u001dZ\u000b\u001c!\u0000]\u0010\u001e+\u001bW\u0017\u001a,\nI\t";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = ";\u001dZ\u000b\u001c!\fI\n\u00001\u001bW\u0016\u000b-\u001aE\u0001";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = ";\u001dZ\u000b\u001c!\u0006F\u0012\u000f2\u0006L\u001b\u001b,\u0003";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new b8(z[7], 0, 1);
                    ERROR_UNKNOWN = new b8(z[1], 1, 2);
                    ERROR_TIMEOUT = new b8(z[6], 2, 3);
                    ERROR_DNS = new b8(z[8], 3, 4);
                    ERROR_INSUFFICIENT_SPACE = new b8(z[9], 4, 5);
                    ERROR_TOO_OLD = new b8(z[0], 5, 6);
                    ERROR_CANNOT_RESUME = new b8(z[11], 6, 7);
                    ERROR_HASH_MISMATCH = new b8(z[2], 7, 8);
                    ERROR_INVALID_URL = new b8(z[12], 8, 9);
                    ERROR_OUTPUT_STREAM = new b8(z[10], 9, 10);
                    ERROR_CANCEL = new b8(z[3], 10, 11);
                    DEDUPED = new b8(z[4], 11, 12);
                    ERROR_INVALID_MEDIA = new b8(z[5], 12, 13);
                    b = new b8[]{OK, ERROR_UNKNOWN, ERROR_TIMEOUT, ERROR_DNS, ERROR_INSUFFICIENT_SPACE, ERROR_TOO_OLD, ERROR_CANNOT_RESUME, ERROR_HASH_MISMATCH, ERROR_INVALID_URL, ERROR_OUTPUT_STREAM, ERROR_CANCEL, DEDUPED, ERROR_INVALID_MEDIA};
                    return;
                default:
                    strArr2[i2] = str;
                    str = ";\u001dZ\u000b\u001c!\u001aF\u000f\u00001\u0018F";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
