package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum o {
    ;
    
    public static final o AUDIO_INIT_ERROR;
    public static final o CALL_ACCEPT_FAILED;
    public static final o CANNOT_INITIALIZE_AUDIO_RECORD_OBJECT;
    public static final o HANDLE_ACCEPT_FAILED;
    public static final o HANDLE_OFFER_FAILED;
    public static final o INCOMPATIBLE_SRTP_KEY_EXCHANGE;
    public static final o INIT_MEDIA_STREAM_FAILED;
    public static final o P2P_TRANSPORT_CREATE_FAILED;
    public static final o P2P_TRANSPORT_MEDIA_CREATE_FAILED;
    public static final o P2P_TRANSPORT_START_FAILED;
    public static final o PEER_RELAY_BIND_FAILED;
    public static final o RELAY_BIND_FAILED;
    public static final o SOUND_PORT_CREATE_FAILED;
    public static final o SRTP_KEY_GENERATION_ERROR;
    public static final o START_MEDIA_STREAM_FAILED;
    public static final o UNKNOWN;
    public static final o UNSUPPORTED_AUDIO_CAPS;
    private static final o[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[17];
        String str = "_m/lMSt+zPMf=jKIx#a_Mp\"{]";
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
                        i4 = 12;
                        break;
                    case at.g /*1*/:
                        i4 = 57;
                        break;
                    case at.i /*2*/:
                        i4 = 110;
                        break;
                    case at.o /*3*/:
                        i4 = 62;
                        break;
                    default:
                        i4 = 25;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\\\u000b>aM^x mICk:aZ^|/j\\S\u007f/wUI}";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "Dx zUIf/}ZIi:a_Mp\"{]";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "Ew-qT\\x:w[@|1mKXi1u\\Uf+fZDx y\\";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\\\u000b>aM^x mICk:aJXx<jFJx'r\\H";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "^|\"\u007f@S{'p]S\u007f/wUI}";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\\\u000b>aM^x mICk:aTI}'\u007fFOk+\u007fMIf(\u007fP@|*";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "Ox pVXf'pPXp/rPV|1\u007fLHp!aKIz!l]Sv,t\\Om";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\\|+lF^|\"\u007f@S{'p]S\u007f/wUI}";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "Ox\"rFMz-{IXf(\u007fP@|*";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "Ml*wVSp wMS|<lV^";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    str = "_k:nFG|7a^Iw+lXXp!pFIk<qK";
                    i = 11;
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    strArr2 = strArr3;
                    str = "_v;p]Si!lMSz<{XX|1xXEu+z";
                    i = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "Ew'jFA|*wXSj:l\\Mt1xXEu+z";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "Dx zUIf!x_Ik1xXEu+z";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "Yw%pV[w";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    UNKNOWN = new o(z[16], 0, 1);
                    CALL_ACCEPT_FAILED = new o(z[10], 1, 2);
                    INIT_MEDIA_STREAM_FAILED = new o(z[14], 2, 3);
                    START_MEDIA_STREAM_FAILED = new o(z[0], 3, 4);
                    AUDIO_INIT_ERROR = new o(z[11], 4, 5);
                    HANDLE_OFFER_FAILED = new o(z[15], 5, 6);
                    HANDLE_ACCEPT_FAILED = new o(z[3], 6, 7);
                    SOUND_PORT_CREATE_FAILED = new o(z[13], 7, 8);
                    P2P_TRANSPORT_CREATE_FAILED = new o(z[2], 8, 9);
                    P2P_TRANSPORT_MEDIA_CREATE_FAILED = new o(z[7], 9, 10);
                    INCOMPATIBLE_SRTP_KEY_EXCHANGE = new o(z[4], 10, 11);
                    SRTP_KEY_GENERATION_ERROR = new o(z[12], 11, 12);
                    UNSUPPORTED_AUDIO_CAPS = new o(z[1], 12, 13);
                    P2P_TRANSPORT_START_FAILED = new o(z[5], 13, 14);
                    RELAY_BIND_FAILED = new o(z[6], 14, 15);
                    CANNOT_INITIALIZE_AUDIO_RECORD_OBJECT = new o(z[8], 15, 16);
                    PEER_RELAY_BIND_FAILED = new o(z[9], 16, 17);
                    a = new o[]{UNKNOWN, CALL_ACCEPT_FAILED, INIT_MEDIA_STREAM_FAILED, START_MEDIA_STREAM_FAILED, AUDIO_INIT_ERROR, HANDLE_OFFER_FAILED, HANDLE_ACCEPT_FAILED, SOUND_PORT_CREATE_FAILED, P2P_TRANSPORT_CREATE_FAILED, P2P_TRANSPORT_MEDIA_CREATE_FAILED, INCOMPATIBLE_SRTP_KEY_EXCHANGE, SRTP_KEY_GENERATION_ERROR, UNSUPPORTED_AUDIO_CAPS, P2P_TRANSPORT_START_FAILED, RELAY_BIND_FAILED, CANNOT_INITIALIZE_AUDIO_RECORD_OBJECT, PEER_RELAY_BIND_FAILED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "Yw=kI\\v<j\\Hf/k]Ev1}X\\j";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private o(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }
}
