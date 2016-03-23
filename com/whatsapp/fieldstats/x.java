package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum x {
    ;
    
    public static final x CELLULAR_1XRTT;
    public static final x CELLULAR_CDMA;
    public static final x CELLULAR_EDGE;
    public static final x CELLULAR_EHRPD;
    public static final x CELLULAR_EVDO;
    public static final x CELLULAR_GPRS;
    public static final x CELLULAR_HSDPA;
    public static final x CELLULAR_HSPA;
    public static final x CELLULAR_HSPAP;
    public static final x CELLULAR_HSUPA;
    public static final x CELLULAR_IDEN;
    public static final x CELLULAR_LTE;
    public static final x CELLULAR_UMTS;
    public static final x CELLULAR_UNKNOWN;
    public static final x WIFI_UNKNOWN;
    private static final x[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private x(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[15];
        String str = ":NU\u000f25JK\u001c$=FX";
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
                        i4 = 121;
                        break;
                    case at.g /*1*/:
                        i4 = 11;
                        break;
                    case at.i /*2*/:
                        i4 = 25;
                        break;
                    case at.o /*3*/:
                        i4 = 67;
                        break;
                    default:
                        i4 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ":NU\u000f25JK\u001c+-N";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = ":NU\u000f25JK\u001c\"=L\\";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = ":NU\u000f25JK\u001c24_J";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = ":NU\u000f25JK\u001c\"/OV";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ":NU\u000f25JK\u001c/*^I\u0002";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = ":NU\u000f25JK\u001c/*OI\u0002";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = ":NU\u000f25JK\u001c27@W\f07";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = ":NU\u000f25JK\u001c\"1YI\u0007";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = ":NU\u000f25JK\u001c )YJ";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    str = ":NU\u000f25JK\u001c/*[X";
                    i = 10;
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    strArr2 = strArr3;
                    str = ":NU\u000f25JK\u001c/*[X\u0013";
                    i = 11;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = ".B_\n8,ER\r(.E";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = ":NU\u000f25JK\u001c.=NW";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CELLULAR_UNKNOWN = new x(z[8], 0, 0);
                    WIFI_UNKNOWN = new x(z[13], 1, 1);
                    CELLULAR_EDGE = new x(z[3], 2, 100);
                    CELLULAR_IDEN = new x(z[14], 3, arj.Theme_buttonStyleSmall);
                    CELLULAR_UMTS = new x(z[4], 4, arj.Theme_checkboxStyle);
                    CELLULAR_EVDO = new x(z[5], 5, arj.Theme_checkedTextViewStyle);
                    CELLULAR_GPRS = new x(z[10], 6, arj.Theme_editTextStyle);
                    CELLULAR_HSDPA = new x(z[7], 7, arj.Theme_radioButtonStyle);
                    CELLULAR_HSUPA = new x(z[6], 8, arj.Theme_ratingBarStyle);
                    CELLULAR_HSPA = new x(z[11], 9, arj.Theme_seekBarStyle);
                    CELLULAR_CDMA = new x(z[0], 10, arj.Theme_spinnerStyle);
                    CELLULAR_1XRTT = new x(z[1], 11, arj.Theme_switchStyle);
                    CELLULAR_EHRPD = new x(z[9], 12, 110);
                    CELLULAR_LTE = new x(z[2], 13, 111);
                    CELLULAR_HSPAP = new x(z[12], 14, 112);
                    b = new x[]{CELLULAR_UNKNOWN, WIFI_UNKNOWN, CELLULAR_EDGE, CELLULAR_IDEN, CELLULAR_UMTS, CELLULAR_EVDO, CELLULAR_GPRS, CELLULAR_HSDPA, CELLULAR_HSUPA, CELLULAR_HSPA, CELLULAR_CDMA, CELLULAR_1XRTT, CELLULAR_EHRPD, CELLULAR_LTE, CELLULAR_HSPAP};
                    return;
                default:
                    strArr2[i2] = str;
                    str = ":NU\u000f25JK\u001cV!YM\u0017";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
