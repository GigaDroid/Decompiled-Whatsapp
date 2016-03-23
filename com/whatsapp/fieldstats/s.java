package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum s {
    ;
    
    public static final s AIRTEL;
    public static final s ALFA;
    public static final s BANGLALINK;
    public static final s BEELINE;
    public static final s BICS;
    public static final s CELLC;
    public static final s CLARO;
    public static final s CLICKATELL;
    public static final s COSMOTE;
    public static final s DIGI;
    public static final s DJEZZY;
    public static final s DONT_SEND_SMS;
    public static final s DONT_SEND_VOICE;
    public static final s EMAILONLY;
    public static final s ETB;
    public static final s FACEBOOK;
    public static final s GLOBE_PH;
    public static final s HIGHSIDE;
    public static final s HTHK;
    public static final s IMESSAGE;
    public static final s INDOSAT;
    public static final s INFOBIP;
    public static final s INFOBIPSMS;
    public static final s JAWWAL;
    public static final s MACH;
    public static final s MBLOX;
    public static final s MIO;
    public static final s MOBILY;
    public static final s MOBME;
    public static final s MOVISTAR;
    public static final s MTN;
    public static final s NAWRAS;
    public static final s NEXMO;
    public static final s NEXMOVOICE;
    public static final s NEXMOVOICE2;
    public static final s OMANTEL;
    public static final s PERSONAL;
    public static final s PLIVO;
    public static final s ROUTO;
    public static final s ROUTOSMS;
    public static final s SELF;
    public static final s SMSGATEWAY;
    public static final s SMSGATEWAY2;
    public static final s SUNRISE;
    public static final s SYBASE;
    public static final s SYNIVERSE;
    public static final s TELENOR;
    public static final s TELESIGNSMS;
    public static final s TELESIGNVOICE;
    public static final s TIGO;
    public static final s TIM;
    public static final s TOUCH;
    public static final s TROPO;
    public static final s TWILIO;
    public static final s TWILIO2;
    public static final s TWILIOL;
    public static final s TWILIOSMS;
    public static final s TWILIOSMS2;
    public static final s TWILIOSMSV;
    public static final s TYNTEC;
    public static final s UFONE;
    public static final s VEXX;
    public static final s VIETTEL;
    public static final s VOICEWORKS;
    public static final s WEBAROO;
    public static final s XL;
    public static final s ZAIN;
    private static final s[] b;
    private static final String[] z;
    private final int a;

    private s(int i) {
        this.a = i;
    }

    static {
        String[] strArr = new String[67];
        String str = "=l\u0019i\u000e=r\fk\u001f";
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
                        i4 = 116;
                        break;
                    case at.g /*1*/:
                        i4 = 34;
                        break;
                    case at.i /*2*/:
                        i4 = 95;
                        break;
                    case at.o /*3*/:
                        i4 = 38;
                        break;
                    default:
                        i4 = 76;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\"g\u0007~";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "7m\fk\u0003 g";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "7g\u0013j\u000f";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = " g\u0013c\u0002;p";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "1o\u001eo\u0000;l\u0013\u007f";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "'{\u001dg\u001f1";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "9m\u001do\u0000-";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "'g\u0013`";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "9v\u0011";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "6k\u001cu";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "9k\u0010";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = " u\u0016j\u0005;n";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = " g\u0013c\u001f=e\u0011u\u0001'";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "'o\fa\r g\bg\u0015F";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = " {\u0011r\t7";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = " u\u0016j\u0005;q\u0012u\u001a";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "9m\u001dk\t";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "0h\u001a|\u0016-";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = ">c\bq\r8";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = " u\u0016j\u0005;";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "9c\u001cn";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "9m\to\u001f c\r";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = " u\u0016j\u0005;q\u0012u~";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = " m\ne\u0004";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "3n\u0010d\t+r\u0017";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = ".c\u0016h";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "6g\u001aj\u0005:g";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = " p\u0010v\u0003";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "7n\u001et\u0003";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "7n\u0016e\u00075v\u001aj\u0000";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "=l\u0019i\u000e=r";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "=o\u001au\u001f5e\u001a";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    str = "&m\nr\u0003'o\f";
                    i = 33;
                    i2 = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    strArr2 = strArr3;
                    str = " k\u0012";
                    i = 34;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\"k\u001ar\u00181n";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "!d\u0010h\t";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    str = ":g\u0007k\u0003\"m\u0016e\t";
                    i = 37;
                    i2 = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    strArr2 = strArr3;
                    str = "&m\nr\u0003";
                    i = 38;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "=l\u001bi\u001f5v";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = " u\u0016j\u0005;q\u0012u";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "$g\ru\u0003:c\u0013";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "<k\u0018n\u001f=f\u001a";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = ";o\u001eh\u00181n";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "1v\u001d";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "9`\u0013i\u0014";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "0m\u0011r\u0013'g\u0011b\u0013\"m\u0016e\t";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = " g\u0013c\u001f=e\u0011p\u0003=a\u001a";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "5k\rr\t8";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\"m\u0016e\t#m\rm\u001f";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "<v\u0017m";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = ":g\u0007k\u0003\"m\u0016e\tF";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = ":g\u0007k\u0003";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = " k\u0018i";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = ":c\bt\r'";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "2c\u001cc\u000e;m\u0014";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "'w\u0011t\u0005'g";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "#g\u001dg\u001e;m";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "0m\u0011r\u0013'g\u0011b\u0013'o\f";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = " u\u0016j\u0005;\u0010";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "'o\fa\r g\bg\u0015";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "'{\u0011o\u001a1p\fc";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "$n\u0016p\u0003";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "6c\u0011a\u00005n\u0016h\u0007";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "0k\u0018o";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "5n\u0019g";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SELF = new s(z[9], 0, 0);
                    CLICKATELL = new s(z[31], 1, 1);
                    SYBASE = new s(z[7], 2, 2);
                    SMSGATEWAY = new s(z[61], 3, 3);
                    TROPO = new s(z[29], 4, 4);
                    ROUTO = new s(z[39], 5, 5);
                    INFOBIP = new s(z[32], 6, 6);
                    ROUTOSMS = new s(z[34], 7, 7);
                    TWILIO = new s(z[21], 8, 8);
                    INFOBIPSMS = new s(z[0], 9, 9);
                    TWILIOSMS = new s(z[41], 10, 10);
                    NEXMO = new s(z[53], 11, 11);
                    EMAILONLY = new s(z[6], 12, 12);
                    INDOSAT = new s(z[40], 13, 13);
                    MIO = new s(z[12], 14, 14);
                    UFONE = new s(z[37], 15, 15);
                    NAWRAS = new s(z[55], 16, 16);
                    VOICEWORKS = new s(z[50], 17, 17);
                    HTHK = new s(z[51], 18, 18);
                    DIGI = new s(z[65], 19, 19);
                    AIRTEL = new s(z[49], 20, 20);
                    SMSGATEWAY2 = new s(z[15], 21, 21);
                    XL = new s(z[1], 22, 22);
                    TELESIGNVOICE = new s(z[48], 23, 23);
                    MOBILY = new s(z[8], 24, 24);
                    OMANTEL = new s(z[44], 25, 25);
                    PLIVO = new s(z[63], 26, 26);
                    TYNTEC = new s(z[16], 27, 27);
                    MACH = new s(z[22], 28, 28);
                    TELESIGNSMS = new s(z[14], 29, 29);
                    HIGHSIDE = new s(z[43], 30, 30);
                    IMESSAGE = new s(z[33], 31, 31);
                    TWILIO2 = new s(z[60], 32, 32);
                    TELENOR = new s(z[5], 33, 33);
                    CLARO = new s(z[30], 34, 34);
                    ALFA = new s(z[66], 35, 35);
                    BANGLALINK = new s(z[64], 36, 36);
                    MTN = new s(z[10], 37, 37);
                    MOBME = new s(z[18], 38, 38);
                    COSMOTE = new s(z[3], 39, 39);
                    SUNRISE = new s(z[57], 40, 40);
                    VEXX = new s(z[2], 41, 41);
                    TOUCH = new s(z[25], 42, 42);
                    DJEZZY = new s(z[19], 43, 43);
                    MOVISTAR = new s(z[23], 44, 44);
                    JAWWAL = new s(z[20], 45, 45);
                    TWILIOSMS2 = new s(z[24], 46, 46);
                    VIETTEL = new s(z[36], 47, 47);
                    PERSONAL = new s(z[42], 48, 48);
                    BEELINE = new s(z[28], 49, 49);
                    TIGO = new s(z[54], 50, 50);
                    ETB = new s(z[45], 51, 51);
                    CELLC = new s(z[4], 52, 52);
                    WEBAROO = new s(z[58], 53, 53);
                    TIM = new s(z[35], 54, 54);
                    NEXMOVOICE = new s(z[38], 55, 55);
                    SYNIVERSE = new s(z[62], 56, 56);
                    BICS = new s(z[11], 57, 57);
                    MBLOX = new s(z[46], 58, 58);
                    TWILIOSMSV = new s(z[17], 59, 59);
                    TWILIOL = new s(z[13], 60, 60);
                    FACEBOOK = new s(z[56], 61, 61);
                    NEXMOVOICE2 = new s(z[52], 62, 62);
                    GLOBE_PH = new s(z[26], 63, 63);
                    ZAIN = new s(z[27], 64, 64);
                    DONT_SEND_SMS = new s(z[59], 65, 98);
                    DONT_SEND_VOICE = new s(z[47], 66, 99);
                    b = new s[]{SELF, CLICKATELL, SYBASE, SMSGATEWAY, TROPO, ROUTO, INFOBIP, ROUTOSMS, TWILIO, INFOBIPSMS, TWILIOSMS, NEXMO, EMAILONLY, INDOSAT, MIO, UFONE, NAWRAS, VOICEWORKS, HTHK, DIGI, AIRTEL, SMSGATEWAY2, XL, TELESIGNVOICE, MOBILY, OMANTEL, PLIVO, TYNTEC, MACH, TELESIGNSMS, HIGHSIDE, IMESSAGE, TWILIO2, TELENOR, CLARO, ALFA, BANGLALINK, MTN, MOBME, COSMOTE, SUNRISE, VEXX, TOUCH, DJEZZY, MOVISTAR, JAWWAL, TWILIOSMS2, VIETTEL, PERSONAL, BEELINE, TIGO, ETB, CELLC, WEBAROO, TIM, NEXMOVOICE, SYNIVERSE, BICS, MBLOX, TWILIOSMSV, TWILIOL, FACEBOOK, NEXMOVOICE2, GLOBE_PH, ZAIN, DONT_SEND_SMS, DONT_SEND_VOICE};
                    return;
                default:
                    strArr2[i2] = str;
                    str = ",n";
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
}
