package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum bb {
    ;
    
    public static final bb ABORT;
    public static final bb AUTH;
    public static final bb BUSY;
    public static final bb CANTOPEN;
    public static final bb CONSTRAINT;
    public static final bb CORRUPT;
    public static final bb DONE;
    public static final bb EMPTY;
    public static final bb ERROR;
    public static final bb FORMAT;
    public static final bb FULL;
    public static final bb INTERNAL;
    public static final bb INTERRUPT;
    public static final bb IOERR;
    public static final bb LOCKED;
    public static final bb MISMATCH;
    public static final bb MISUSE;
    public static final bb NOLFS;
    public static final bb NOMEM;
    public static final bb NOTADB;
    public static final bb NOTFOUND;
    public static final bb NOTICE;
    public static final bb OK;
    public static final bb PERM;
    public static final bb PROTOCOL;
    public static final bb RANGE;
    public static final bb READONLY;
    public static final bb ROW;
    public static final bb SCHEMA;
    public static final bb TOOBIG;
    public static final bb WARNING;
    private static final bb[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[31];
        String str = "\u007f)i\u0000%";
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
                        i4 = 49;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 37;
                        break;
                    case at.o /*3*/:
                        i4 = 70;
                        break;
                    default:
                        i4 = 118;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "r)k\u0015\"c'l\b\"";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "x)`\u0014$";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "|/v\u000b7e%m";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "r'k\u00129a#k";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "w)w\u000b7e";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "s3v\u001f";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u007f)h\u0003;";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "r)w\u0014#a2";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "f'w\b?\u007f!";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "~-";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "a4j\u00129r)i";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "c'k\u00013";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "p3q\u000e";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "t+u\u0012/";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "x(q\u0003$\u007f'i";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "e)j\u0004?v";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u007f)q\u00009d(a";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "w3i\n";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "x(q\u0003$c3u\u0012";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "u)k\u0003";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "c)r";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "b%m\u0003;p";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "t4w\t$";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "c#d\u00029\u007f*|";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u007f)q\u00072s";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "|/v\u0013%t";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\u007f)q\u000f5t";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "a#w\u000b";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "p$j\u0014\"";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new bb(z[11], 0, 0);
                    ERROR = new bb(z[24], 1, 1);
                    INTERNAL = new bb(z[16], 2, 2);
                    PERM = new bb(z[29], 3, 3);
                    ABORT = new bb(z[30], 4, 4);
                    BUSY = new bb(z[7], 5, 5);
                    LOCKED = new bb(z[1], 6, 6);
                    NOMEM = new bb(z[8], 7, 7);
                    READONLY = new bb(z[25], 8, 8);
                    INTERRUPT = new bb(z[20], 9, 9);
                    IOERR = new bb(z[3], 10, 10);
                    CORRUPT = new bb(z[9], 11, 11);
                    NOTFOUND = new bb(z[18], 12, 12);
                    FULL = new bb(z[19], 13, 13);
                    CANTOPEN = new bb(z[5], 14, 14);
                    PROTOCOL = new bb(z[12], 15, 15);
                    EMPTY = new bb(z[15], 16, 16);
                    SCHEMA = new bb(z[23], 17, 17);
                    TOOBIG = new bb(z[17], 18, 18);
                    CONSTRAINT = new bb(z[2], 19, 19);
                    MISMATCH = new bb(z[4], 20, 20);
                    MISUSE = new bb(z[27], 21, 21);
                    NOLFS = new bb(z[0], 22, 22);
                    AUTH = new bb(z[14], 23, 23);
                    FORMAT = new bb(z[6], 24, 24);
                    RANGE = new bb(z[13], 25, 25);
                    NOTADB = new bb(z[26], 26, 26);
                    NOTICE = new bb(z[28], 27, 27);
                    WARNING = new bb(z[10], 28, 28);
                    ROW = new bb(z[22], 29, 100);
                    DONE = new bb(z[21], 30, arj.Theme_buttonStyleSmall);
                    b = new bb[]{OK, ERROR, INTERNAL, PERM, ABORT, BUSY, LOCKED, NOMEM, READONLY, INTERRUPT, IOERR, CORRUPT, NOTFOUND, FULL, CANTOPEN, PROTOCOL, EMPTY, SCHEMA, TOOBIG, CONSTRAINT, MISMATCH, MISUSE, NOLFS, AUTH, FORMAT, RANGE, NOTADB, NOTICE, WARNING, ROW, DONE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "})f\r3u";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private bb(int i) {
        this.a = i;
    }
}
