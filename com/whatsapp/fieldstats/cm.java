package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum cm {
    ;
    
    public static final cm ATTACHED;
    public static final cm CREATED;
    public static final cm EXPIRED;
    public static final cm FAIL_BAD_PARAM;
    public static final cm FAIL_BAD_TOKEN;
    public static final cm FAIL_BLOCKED;
    public static final cm FAIL_FORMAT_WRONG;
    public static final cm FAIL_GUESSED_TOO_FAST;
    public static final cm FAIL_INCORRECT;
    public static final cm FAIL_LENGTH_LONG;
    public static final cm FAIL_LENGTH_SHORT;
    public static final cm FAIL_MISMATCH;
    public static final cm FAIL_MISSING;
    public static final cm FAIL_MISSING_PARAM;
    public static final cm FAIL_NEXT_METHOD;
    public static final cm FAIL_NO_ROUTES;
    public static final cm FAIL_OLD_VERSION;
    public static final cm FAIL_PROVIDER_TIMEOUT;
    public static final cm FAIL_PROVIDER_UNROUTABLE;
    public static final cm FAIL_STALE;
    public static final cm FAIL_TEMPORARILY_UNAVAILABLE;
    public static final cm FAIL_TOO_MANY;
    public static final cm FAIL_TOO_MANY_ALL_METHODS;
    public static final cm FAIL_TOO_MANY_GUESSES;
    public static final cm FAIL_TOO_RECENT;
    public static final cm OK;
    public static final cm SENT;
    private static final cm[] a;
    private static final String[] z;
    private final int b;

    private cm(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[27];
        String str = "\u0013\u00048?\u0007\u0018\f\">\u0019\u0001\u00069";
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
                        i4 = 85;
                        break;
                    case at.g /*1*/:
                        i4 = 69;
                        break;
                    case at.i /*2*/:
                        i4 = 113;
                        break;
                    case at.o /*3*/:
                        i4 = 115;
                        break;
                    default:
                        i4 = 88;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0013\u00048?\u0007\u0019\u0000?4\f\u001d\u001a\";\u0017\u0007\u0011";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u001a\u000e";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0013\u00048?\u0007\u0005\u0017>%\u0011\u0011\u0000#,\r\u001b\u0017>&\f\u0014\u0007=6";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u0013\u00048?\u0007\u0013\n#>\u0019\u0001\u001a&!\u0017\u001b\u0002";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0013\u00048?\u0007\u001b\u0000)'\u0007\u0018\u0000%;\u0017\u0011";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0013\u00048?\u0007\u0017\u00045,\b\u0014\u00170>";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0013\u00048?\u0007\u0001\n>,\n\u0010\u00064=\f";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u0013\u00048?\u0007\u0018\f\" \u0011\u001b\u0002.#\u0019\u0007\u0004<";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0013\u00048?\u0007\u0001\u0000<#\u0017\u0007\u0004#:\u0014\f\u001a$=\u0019\u0003\u00048?\u0019\u0017\t4";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0013\u00048?\u0007\u0017\t>0\u0013\u0010\u0001";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u0006\u0000?'";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u0013\u00048?\u0007\u001b\n.!\u0017\u0000\u00114 ";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u0013\u00048?\u0007\u0006\u00110?\u001d";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0013\u00048?\u0007\u0018\f\" \u0011\u001b\u0002";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u0013\u00048?\u0007\u0001\n>,\u0015\u0014\u000b(,\u0019\u0019\t.>\u001d\u0001\r>7\u000b";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u0013\u00048?\u0007\u0012\u00104 \u000b\u0010\u0001.'\u0017\u001a\u001a72\u000b\u0001";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u0013\u00048?\u0007\u0005\u0017>%\u0011\u0011\u0000#,\f\u001c\b4<\r\u0001";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0010\u001d!:\n\u0010\u0001";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u0014\u0011%2\u001b\u001d\u00005";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0013\u00048?\u0007\u0001\n>,\u0015\u0014\u000b(";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "\u0013\u00048?\u0007\u001c\u000b2<\n\u0007\u00002'";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\u0013\u00048?\u0007\u0019\u0000?4\f\u001d\u001a=<\u0016\u0012";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u0013\u00048?\u0007\u0017\u00045,\f\u001a\u000e4=";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u0013\u00048?\u0007\u001a\t5,\u000e\u0010\u0017\":\u0017\u001b";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u0016\u001742\f\u0010\u0001";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new cm(z[3], 0, 1);
                    FAIL_MISMATCH = new cm(z[0], 1, 2);
                    FAIL_TOO_MANY_GUESSES = new cm(z[1], 2, 3);
                    FAIL_GUESSED_TOO_FAST = new cm(z[17], 3, 4);
                    FAIL_MISSING = new cm(z[15], 4, 5);
                    FAIL_STALE = new cm(z[14], 5, 6);
                    FAIL_TEMPORARILY_UNAVAILABLE = new cm(z[10], 6, 7);
                    FAIL_BLOCKED = new cm(z[11], 7, 8);
                    SENT = new cm(z[12], 8, 9);
                    FAIL_NEXT_METHOD = new cm(z[6], 9, 10);
                    FAIL_TOO_MANY_ALL_METHODS = new cm(z[16], 10, 11);
                    FAIL_TOO_RECENT = new cm(z[8], 11, 12);
                    FAIL_TOO_MANY = new cm(z[21], 12, 13);
                    FAIL_OLD_VERSION = new cm(z[25], 13, 14);
                    FAIL_BAD_PARAM = new cm(z[7], 14, 15);
                    FAIL_PROVIDER_TIMEOUT = new cm(z[18], 15, 16);
                    FAIL_PROVIDER_UNROUTABLE = new cm(z[4], 16, 17);
                    FAIL_BAD_TOKEN = new cm(z[24], 17, 18);
                    FAIL_NO_ROUTES = new cm(z[13], 18, 19);
                    ATTACHED = new cm(z[20], 19, 20);
                    FAIL_INCORRECT = new cm(z[22], 20, 21);
                    FAIL_LENGTH_LONG = new cm(z[23], 21, 22);
                    FAIL_LENGTH_SHORT = new cm(z[2], 22, 23);
                    FAIL_FORMAT_WRONG = new cm(z[5], 23, 24);
                    EXPIRED = new cm(z[19], 24, 25);
                    CREATED = new cm(z[26], 25, 26);
                    FAIL_MISSING_PARAM = new cm(z[9], 26, 27);
                    a = new cm[]{OK, FAIL_MISMATCH, FAIL_TOO_MANY_GUESSES, FAIL_GUESSED_TOO_FAST, FAIL_MISSING, FAIL_STALE, FAIL_TEMPORARILY_UNAVAILABLE, FAIL_BLOCKED, SENT, FAIL_NEXT_METHOD, FAIL_TOO_MANY_ALL_METHODS, FAIL_TOO_RECENT, FAIL_TOO_MANY, FAIL_OLD_VERSION, FAIL_BAD_PARAM, FAIL_PROVIDER_TIMEOUT, FAIL_PROVIDER_UNROUTABLE, FAIL_BAD_TOKEN, FAIL_NO_ROUTES, ATTACHED, FAIL_INCORRECT, FAIL_LENGTH_LONG, FAIL_LENGTH_SHORT, FAIL_FORMAT_WRONG, EXPIRED, CREATED, FAIL_MISSING_PARAM};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0013\u00048?\u0007\u0001\n>,\u0015\u0014\u000b(,\u001f\u0000\u0000\" \u001d\u0006";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }
}
