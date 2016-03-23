package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum j {
    ;
    
    public static final j INVALID_IMAGE_FILE_LENGTH;
    public static final j INVALID_IMAGE_FILE_SHA256;
    public static final j INVALID_IMAGE_MEDIA_KEY;
    public static final j INVALID_IMAGE_MEDIA_URL;
    public static final j INVALID_IMAGE_MIME_TYPE;
    public static final j INVALID_MESSAGE;
    public static final j INVALID_NUMBER_OF_MESSAGE_TYPES;
    public static final j INVALID_PADDING;
    public static final j INVALID_PROTOCOL_BUFFER;
    public static final j INVALID_VERSION;
    public static final j LEGACY_MESSAGE;
    public static final j NO_SESSION_AVAILABLE;
    public static final j PLAINTEXT_BYTE_MISMATCH;
    public static final j PRE_KEY_MESSAGE_INVALID_KEY;
    public static final j PRE_KEY_MESSAGE_MISSING_PRE_KEY;
    public static final j UNKNOWN_CIPHERTEXT_TYPE;
    public static final j UNKNOWN_CIPHERTEXT_VERSION;
    public static final j UNKNOWN_V2_TAGS;
    public static final j UNTRUSTED_IDENTITY;
    private static final j[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[19];
        String str = "ds:J(dy3F!~n-L!";
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
                        i4 = 45;
                        break;
                    case at.g /*1*/:
                        i4 = 61;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 11;
                        break;
                    default:
                        i4 = 100;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "cr3X!~n%D*r|:J-a|.G!";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "}q-B*yx4_;od8N;`t?F%y~$";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "}o)T/hd3F!~n-L!rp%X7ds+T4\u007fx3@!t";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "ds:J(dy3]!\u007fn%D*";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "ds:J(dy3B)lz)T\"dq)T7e|^>R";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "ds:J(dy3[%iy%E#";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "ds:J(dy3B)lz)T\"dq)T(hs+_,";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "xs'E+zs3H-}u)Y0he8T0tm)";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "xs'E+zs3H-}u)Y0he8T2ho?B+c";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    str = "ds:J(dy3[6bi#H+ab.^\"kx>";
                    i = 10;
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    strArr2 = strArr3;
                    str = "}o)T/hd3F!~n-L!rt\"]%at(T/hd";
                    i = 11;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "ds:J(dy3B)lz)T)hy%J;fx5";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "ds:J(dy3B)lz)T)hy%J;xo ";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "xs'E+zs3]Vri-L7";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "ds:J(dy3E1`\u007f)Y;b{3F!~n-L!ri5[!~";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "xs8Y1~i)O;dy)E0di5";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "ds:J(dy3B)lz)T)dp)T0tm)";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    INVALID_MESSAGE = new j(z[0], 0, 0);
                    LEGACY_MESSAGE = new j(z[1], 1, 1);
                    INVALID_VERSION = new j(z[5], 2, 2);
                    PRE_KEY_MESSAGE_MISSING_PRE_KEY = new j(z[4], 3, 3);
                    PRE_KEY_MESSAGE_INVALID_KEY = new j(z[12], 4, 4);
                    UNTRUSTED_IDENTITY = new j(z[17], 5, 5);
                    NO_SESSION_AVAILABLE = new j(z[2], 6, 6);
                    PLAINTEXT_BYTE_MISMATCH = new j(z[3], 7, 7);
                    UNKNOWN_CIPHERTEXT_TYPE = new j(z[9], 8, 8);
                    UNKNOWN_CIPHERTEXT_VERSION = new j(z[10], 9, 9);
                    INVALID_PADDING = new j(z[7], 10, 10);
                    INVALID_PROTOCOL_BUFFER = new j(z[11], 11, 11);
                    INVALID_NUMBER_OF_MESSAGE_TYPES = new j(z[16], 12, 12);
                    INVALID_IMAGE_FILE_LENGTH = new j(z[8], 13, 13);
                    INVALID_IMAGE_FILE_SHA256 = new j(z[6], 14, 14);
                    INVALID_IMAGE_MEDIA_URL = new j(z[14], 15, 15);
                    INVALID_IMAGE_MEDIA_KEY = new j(z[13], 16, 16);
                    INVALID_IMAGE_MIME_TYPE = new j(z[18], 17, 17);
                    UNKNOWN_V2_TAGS = new j(z[15], 18, 18);
                    b = new j[]{INVALID_MESSAGE, LEGACY_MESSAGE, INVALID_VERSION, PRE_KEY_MESSAGE_MISSING_PRE_KEY, PRE_KEY_MESSAGE_INVALID_KEY, UNTRUSTED_IDENTITY, NO_SESSION_AVAILABLE, PLAINTEXT_BYTE_MISMATCH, UNKNOWN_CIPHERTEXT_TYPE, UNKNOWN_CIPHERTEXT_VERSION, INVALID_PADDING, INVALID_PROTOCOL_BUFFER, INVALID_NUMBER_OF_MESSAGE_TYPES, INVALID_IMAGE_FILE_LENGTH, INVALID_IMAGE_FILE_SHA256, INVALID_IMAGE_MEDIA_URL, INVALID_IMAGE_MEDIA_KEY, INVALID_IMAGE_MIME_TYPE, UNKNOWN_V2_TAGS};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "ax+J'tb!N7~|+N";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private j(int i) {
        this.a = i;
    }
}
