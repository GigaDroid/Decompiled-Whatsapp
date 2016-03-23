package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum aqs {
    ;
    
    public static final aqs CANCEL;
    public static final aqs FAILED_BAD_MEDIA;
    public static final aqs FAILED_CANNOT_RESUME;
    public static final aqs FAILED_DNS_LOOKUP;
    public static final aqs FAILED_GENERIC;
    public static final aqs FAILED_HASH_MISMATCH;
    public static final aqs FAILED_INSUFFICIENT_SPACE;
    public static final aqs FAILED_INVALID_URL;
    public static final aqs FAILED_OUTPUT_STREAM;
    public static final aqs FAILED_TIMEOUT;
    public static final aqs FAILED_TOO_OLD;
    public static final aqs SUCCESS;
    private static final aqs[] a;
    private static final String[] z;
    public final int errorCode;
    public final boolean isTransientError;
    public final String name;

    private aqs(int i, String str, boolean z) {
        this.errorCode = i;
        this.name = str;
        this.isTransientError = z;
    }

    static {
        String[] strArr = new String[24];
        String str = "@\u0005w?\u0016B\u001bj:\u001eC\u000bk'";
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
                        i4 = 6;
                        break;
                    case at.g /*1*/:
                        i4 = 68;
                        break;
                    case at.i /*2*/:
                        i4 = 62;
                        break;
                    case at.o /*3*/:
                        i4 = 115;
                        break;
                    default:
                        i4 = 83;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "@\u0005w?\u0016B\u001bq&\u0007V\u0011j,\u0000R\u0016{2\u001e";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = true;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "@\u0005w?\u0016B\u001bw=\u0000S\u0002x:\u0010O\u0001p'\fU\u0014\u007f0\u0016";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "@\u0005w?\u0016B\u001bz=\u0000Y\bq<\u0018S\u0014";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "t!M\u0006>c\u001bX\u0012:j!Z";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    str = "r+Q,<j ";
                    i = 5;
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    strArr2 = strArr3;
                    str = "`%W\u001f6b\u001bY\u0016=c6W\u0010";
                    i = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "U\u0011}0\u0016U\u0017";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "b-M\u0018\f`1R\u001f";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "r-S\u0016<s0";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "E\u0005p0\u0016J";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "b*M,5g-R\u0006!c";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "d%Z,>c W\u0012";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "o*H\u0012?o a\u0006!j";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "@\u0005w?\u0016B\u001bj<\u001cY\u000br7";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "n%M\u001b\fk-M\u001e2r'V";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "@\u0005w?\u0016B\u001b|2\u0017Y\t{7\u001aG";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "@\u0005w?\u0016B\u001bw=\u0005G\bw7\fS\u0016r";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "s7[\u0001\fe%P\u00106j";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "i1J\u0003&r\u001bM\u0007!c%S,5g-R";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "u1]\u00106u7";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "@\u0005w?\u0016B\u001by6\u001dC\u0016w0";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "@\u0005w?\u0016B\u001b}2\u001dH\u000bj,\u0001C\u0017k>\u0016";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    FAILED_GENERIC = new aqs(z[22], 0, arj.Theme_buttonStyleSmall, z[7], true);
                    FAILED_DNS_LOOKUP = new aqs(z[4], 1, arj.Theme_checkboxStyle, z[12], true);
                    FAILED_TIMEOUT = new aqs(z[0], 2, arj.Theme_checkedTextViewStyle, z[10], true);
                    SUCCESS = new aqs(z[8], 3, 0, z[21]);
                    FAILED_INSUFFICIENT_SPACE = new aqs(z[3], 4, arj.Theme_editTextStyle, z[9]);
                    FAILED_TOO_OLD = new aqs(z[15], 5, arj.Theme_radioButtonStyle, z[6]);
                    FAILED_CANNOT_RESUME = new aqs(z[23], 6, arj.Theme_ratingBarStyle, z[5]);
                    FAILED_HASH_MISMATCH = new aqs(z[1], 7, arj.Theme_seekBarStyle, z[16]);
                    FAILED_INVALID_URL = new aqs(z[18], 8, arj.Theme_spinnerStyle, z[14]);
                    FAILED_OUTPUT_STREAM = new aqs(z[2], 9, arj.Theme_switchStyle, z[20]);
                    FAILED_BAD_MEDIA = new aqs(z[17], 10, 110, z[13]);
                    CANCEL = new aqs(z[11], 11, 111, z[19]);
                    a = new aqs[]{FAILED_GENERIC, FAILED_DNS_LOOKUP, FAILED_TIMEOUT, SUCCESS, FAILED_INSUFFICIENT_SPACE, FAILED_TOO_OLD, FAILED_CANNOT_RESUME, FAILED_HASH_MISMATCH, FAILED_INVALID_URL, FAILED_OUTPUT_STREAM, FAILED_BAD_MEDIA, CANCEL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "@\u0005w?\u0016B\u001bv2\u0000N\u001bs:\u0000K\u0005j0\u001b";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static aqs fromErrorCode(int i) {
        boolean z = DialogToastActivity.f;
        aqs[] values = values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            aqs com_whatsapp_aqs = values[i2];
            if (i == com_whatsapp_aqs.errorCode) {
                return com_whatsapp_aqs;
            }
            int i3 = i2 + 1;
            if (z) {
                break;
            }
            i2 = i3;
        }
        return null;
    }

    private aqs(int i, String str) {
        this(r7, r8, i, str, false);
    }
}
