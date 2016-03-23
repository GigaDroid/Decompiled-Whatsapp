package com.whatsapp;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum vl {
    ;
    
    public static final vl AFTER_ACCEPT_TIMEOUT;
    public static final vl BEFORE_ACCEPT_TIMEOUT;
    public static final vl BUSY_TONE_TIMEOUT;
    public static final vl CALL_OFFER_ACK_CORRUPT;
    public static final vl CALL_REJECTED;
    public static final vl CELLULAR_CALL_STARTS;
    public static final vl OTHER_REASON;
    public static final vl RELAY_BIND_FAILED;
    public static final vl RX_TIMEOUT;
    public static final vl SCO_LINK_DOWN;
    public static final vl SEND_CALL_OFFER_TIMEOUT;
    public static final vl TX_TIMEOUT;
    public static final vl USER_END_CALL;
    public static final vl USER_END_CALL_AFTER_CONFIRMATION;
    private static final vl[] a;
    private static final String[] z;

    static {
        String[] strArr = new String[14];
        String str = "]'>\u0017[M:?\u001aGI87";
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
                        i4 = 8;
                        break;
                    case at.g /*1*/:
                        i4 = 116;
                        break;
                    case at.i /*2*/:
                        i4 = 123;
                        break;
                    case at.o /*3*/:
                        i4 = 69;
                        break;
                    default:
                        i4 = 4;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "K57\t[Z11\u0000G\\1?";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "Z17\u0004]W62\u000b@W2:\fHM0";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "G 3\u0000VW&>\u0004WG:";
                    i = 3;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "J1=\nVM+:\u0006GM$/\u001aPA9>\nQ\\";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "K17\tQD5)\u001aGI87\u001aW\\5)\u0011W";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "]'>\u0017[M:?\u001aGI87\u001aEN >\u0017[K;5\u0003MZ9:\u0011MG:";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = "[15\u0001[K57\t[G2=\u0000VW 2\bAG!/";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = "I2/\u0000VW58\u0006AX $\u0011ME14\u0010P";
                    i = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "J!(\u001c[\\;5\u0000[\\=6\u0000K] ";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\\,$\u0011ME14\u0010P";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "Z,$\u0011ME14\u0010P";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "[74\u001aHA:0\u001a@G#5";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    USER_END_CALL = new vl(z[0], 0);
                    USER_END_CALL_AFTER_CONFIRMATION = new vl(z[7], 1);
                    RELAY_BIND_FAILED = new vl(z[3], 2);
                    CELLULAR_CALL_STARTS = new vl(z[6], 3);
                    RX_TIMEOUT = new vl(z[12], 4);
                    TX_TIMEOUT = new vl(z[11], 5);
                    BEFORE_ACCEPT_TIMEOUT = new vl(z[5], 6);
                    AFTER_ACCEPT_TIMEOUT = new vl(z[9], 7);
                    SEND_CALL_OFFER_TIMEOUT = new vl(z[8], 8);
                    BUSY_TONE_TIMEOUT = new vl(z[10], 9);
                    SCO_LINK_DOWN = new vl(z[13], 10);
                    CALL_REJECTED = new vl(z[2], 11);
                    CALL_OFFER_ACK_CORRUPT = new vl(z[1], 12);
                    OTHER_REASON = new vl(z[4], 13);
                    a = new vl[]{USER_END_CALL, USER_END_CALL_AFTER_CONFIRMATION, RELAY_BIND_FAILED, CELLULAR_CALL_STARTS, RX_TIMEOUT, TX_TIMEOUT, BEFORE_ACCEPT_TIMEOUT, AFTER_ACCEPT_TIMEOUT, SEND_CALL_OFFER_TIMEOUT, BUSY_TONE_TIMEOUT, SCO_LINK_DOWN, CALL_REJECTED, CALL_OFFER_ACK_CORRUPT, OTHER_REASON};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "K57\t[G2=\u0000VW58\u000e[K;)\u0017QX ";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
