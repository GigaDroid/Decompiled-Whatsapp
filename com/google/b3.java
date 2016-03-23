package com.google;

import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum b3 {
    ;
    
    public static final b3 ALLOWED_EAN_EXTENSIONS;
    public static final b3 ALLOWED_LENGTHS;
    public static final b3 ASSUME_CODE_39_CHECK_DIGIT;
    public static final b3 ASSUME_GS1;
    public static final b3 CHARACTER_SET;
    public static final b3 NEED_RESULT_POINT_CALLBACK;
    public static final b3 OTHER;
    public static final b3 POSSIBLE_FORMATS;
    public static final b3 PURE_BARCODE;
    public static final b3 RETURN_CODABAR_START_END;
    public static final b3 TRY_HARDER;
    private static final String[] z;
    private final Class b;

    private b3(Class cls) {
        this.b = cls;
    }

    public Class getValueType() {
        return this.b;
    }

    static {
        String[] strArr = new String[11];
        String str = "q\u0004B=\nc\u0010B;\u001ae\u0014";
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
                        i4 = 33;
                        break;
                    case at.g /*1*/:
                        i4 = 81;
                        break;
                    case at.i /*2*/:
                        i4 = 16;
                        break;
                    case at.o /*3*/:
                        i4 = 120;
                        break;
                    default:
                        i4 = 85;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "n\u0005X=\u0007";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "q\u001eC+\u001cc\u001dU'\u0013n\u0003]9\u0001r";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "`\u001d\\7\u0002d\u0015O=\u0014o\u000eU \u0001d\u001fC1\u001ao\u0002";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "`\u001d\\7\u0002d\u0015O4\u0010o\u0016D0\u0006";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "`\u0002C-\u0018d\u000eS7\u0011d\u000e#A\nb\u0019U;\u001e~\u0015Y?\u001cu";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "b\u0019Q*\u0014b\u0005U*\nr\u0014D";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "s\u0014D-\u0007o\u000eS7\u0011`\u0013Q*\nr\u0005Q*\u0001~\u0014^<";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "`\u0002C-\u0018d\u000eW+d";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "u\u0003I'\u001d`\u0003T=\u0007";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OTHER = new b3(z[2], 0, Object.class);
                    PURE_BARCODE = new b3(z[0], 1, Void.class);
                    POSSIBLE_FORMATS = new b3(z[3], 2, List.class);
                    TRY_HARDER = new b3(z[10], 3, Void.class);
                    CHARACTER_SET = new b3(z[7], 4, String.class);
                    ALLOWED_LENGTHS = new b3(z[5], 5, int[].class);
                    ASSUME_CODE_39_CHECK_DIGIT = new b3(z[6], 6, Void.class);
                    ASSUME_GS1 = new b3(z[9], 7, Void.class);
                    RETURN_CODABAR_START_END = new b3(z[8], 8, Void.class);
                    NEED_RESULT_POINT_CALLBACK = new b3(z[1], 9, dB.class);
                    ALLOWED_EAN_EXTENSIONS = new b3(z[4], 10, int[].class);
                    a = new b3[]{OTHER, PURE_BARCODE, POSSIBLE_FORMATS, TRY_HARDER, CHARACTER_SET, ALLOWED_LENGTHS, ASSUME_CODE_39_CHECK_DIGIT, ASSUME_GS1, RETURN_CODABAR_START_END, NEED_RESULT_POINT_CALLBACK, ALLOWED_EAN_EXTENSIONS};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "o\u0014U<\ns\u0014C-\u0019u\u000e@7\u001co\u0005O;\u0014m\u001dR9\u0016j";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
