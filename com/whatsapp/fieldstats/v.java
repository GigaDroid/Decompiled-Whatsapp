package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum v {
    ;
    
    public static final v ACCEPTED_BUT_NOT_CONNECTED;
    public static final v BUSY;
    public static final v CALL_CANCELED_AIRPLANE_MODE_ON;
    public static final v CALL_CANCELED_CELLULAR_IN_PROGRESS;
    public static final v CALL_CANCELED_NO_NETWORK;
    public static final v CALL_OFFER_ACK_CORRUPT;
    public static final v CALL_OFFER_ACK_NOT_RECEIVED;
    public static final v CALL_REJECTED_E2E;
    public static final v CALL_REJECTED_TOS;
    public static final v CONNECTED;
    public static final v MISSED;
    public static final v MISSED_NO_RECEIPT;
    public static final v REJECTED_BY_SERVER;
    public static final v REJECTED_BY_USER;
    public static final v SERVER_NACK;
    public static final v SETUP_ERROR;
    private static final v[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    private v(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[16];
        String str = "\u0006\u0017|1z\u0000\u0017r+{\r\rc'|\u0006";
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
                    case org.v.m /*0*/:
                        i4 = 84;
                        break;
                    case at.g /*1*/:
                        i4 = 82;
                        break;
                    case at.i /*2*/:
                        i4 = 54;
                        break;
                    case at.o /*3*/:
                        i4 = 116;
                        break;
                    default:
                        i4 = 57;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case org.v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0017\u0013z8f\u0017\u0013x7|\u0018\u0017r+w\u001b\rx1m\u0003\u001dd?";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0007\u0017d\"|\u0006\rx5z\u001f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0019\u001be'|\u0010\rx;f\u0006\u0017u1p\u0004\u0006";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0006\u0017|1z\u0000\u0017r+{\r\re1k\u0002\u0017d";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0017\u0013z8f\u0017\u0013x7|\u0018\u0017r+z\u0011\u001ez!u\u0015\u0000i=w\u000b\u0002d;~\u0006\u0017e'";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0015\u0011u1i\u0000\u0017r+{\u0001\u0006i:v\u0000\ru;w\u001a\u0017u |\u0010";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0019\u001be'|\u0010";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u0017\u0013z8f\u001b\u0014p1k\u000b\u0013u?f\u0017\u001dd&l\u0004\u0006";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0016\u0007e-";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0007\u0017b!i\u000b\u0017d&v\u0006";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u0017\u001dx:|\u0017\u0006s0";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u0017\u0013z8f\u0017\u0013x7|\u0018\u0017r+x\u001d\u0000f8x\u001a\u0017i9v\u0010\u0017i;w";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u0017\u0013z8f\u0006\u0017|1z\u0000\u0017r+|f\u0017";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0017\u0013z8f\u001b\u0014p1k\u000b\u0013u?f\u001a\u001db+k\u0011\u0011s=o\u0011\u0016";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CONNECTED = new v(z[12], 0, 1);
                    REJECTED_BY_USER = new v(z[0], 1, 2);
                    REJECTED_BY_SERVER = new v(z[5], 2, 3);
                    MISSED = new v(z[8], 3, 4);
                    BUSY = new v(z[10], 4, 5);
                    SETUP_ERROR = new v(z[11], 5, 6);
                    SERVER_NACK = new v(z[3], 6, 7);
                    CALL_OFFER_ACK_NOT_RECEIVED = new v(z[15], 7, 8);
                    MISSED_NO_RECEIPT = new v(z[4], 8, 9);
                    ACCEPTED_BUT_NOT_CONNECTED = new v(z[7], 9, 10);
                    CALL_CANCELED_CELLULAR_IN_PROGRESS = new v(z[6], 10, 11);
                    CALL_CANCELED_AIRPLANE_MODE_ON = new v(z[13], 11, 12);
                    CALL_CANCELED_NO_NETWORK = new v(z[2], 12, 13);
                    CALL_OFFER_ACK_CORRUPT = new v(z[9], 13, 14);
                    CALL_REJECTED_TOS = new v(z[1], 14, 15);
                    CALL_REJECTED_E2E = new v(z[14], 15, 16);
                    b = new v[]{CONNECTED, REJECTED_BY_USER, REJECTED_BY_SERVER, MISSED, BUSY, SETUP_ERROR, SERVER_NACK, CALL_OFFER_ACK_NOT_RECEIVED, MISSED_NO_RECEIPT, ACCEPTED_BUT_NOT_CONNECTED, CALL_CANCELED_CELLULAR_IN_PROGRESS, CALL_CANCELED_AIRPLANE_MODE_ON, CALL_CANCELED_NO_NETWORK, CALL_OFFER_ACK_CORRUPT, CALL_REJECTED_TOS, CALL_REJECTED_E2E};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0017\u0013z8f\u0006\u0017|1z\u0000\u0017r+m\u001b\u0001";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
