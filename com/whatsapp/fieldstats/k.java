package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum k {
    ;
    
    public static final k ABOUT;
    public static final k ACCOUNT;
    public static final k BACKUP_CONVERSATIONS;
    public static final k CHANGE_NUMBER;
    public static final k CHATS_ALL_ARCHIVE;
    public static final k CHATS_ALL_CLEAR;
    public static final k CHATS_ALL_DELETE;
    public static final k CHATS_CLEAR_OLDER_30_DAYS;
    public static final k CHATS_CLEAR_OLDER_6_MONTHS;
    public static final k CHAT_ARCHIVE;
    public static final k CHAT_CLEAR;
    public static final k CHAT_CLEAR_OLDER_30_DAYS;
    public static final k CHAT_CLEAR_OLDER_6_MONTHS;
    public static final k CHAT_DELETE;
    public static final k CONTACTS_VIEWS;
    public static final k CONTACT_US;
    public static final k DELETE_ACCOUNT;
    public static final k FAQ;
    public static final k FAVORITES_VIEWS;
    public static final k GROUP_INFO;
    public static final k MESSAGE_STAR;
    public static final k NEW_BROADCAST_LIST;
    public static final k NEW_GROUP;
    public static final k PROFILE;
    public static final k SETTINGS;
    public static final k STATUS_VIEWS;
    @Deprecated
    public static final k TAF_VIA_CONTACTPICKER_MENU;
    @Deprecated
    public static final k TAF_VIA_CONTACTSFRAGMENT_MENU;
    @Deprecated
    public static final k TAF_VIA_CONTACTS_LIST;
    @Deprecated
    public static final k TAF_VIA_CONTACT_PICKER_LIST;
    @Deprecated
    public static final k TAF_VIA_EMPTY;
    @Deprecated
    public static final k TAF_VIA_INVITE_NON_WA_CONTACT;
    @Deprecated
    public static final k TAF_VIA_SETTINGS;
    public static final k TELL_A_FRIEND;
    private static final k[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private k(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[34];
        String str = "' \u00173r";
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
                        i4 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i4 = 98;
                        break;
                    case at.i /*2*/:
                        i4 = 88;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i4 = 38;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "+'\u000b5g!'\u00075r'0";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "2#\u001e9p/#\u0007%i(6\u0019%r5=\u0014/u2";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "2#\u001e9p/#\u0007#k66\u0001";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "%*\u00192y%.\u001d't9-\u0014\"c4=kVy\"#\u00015";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "%*\u00192y%.\u001d't";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "2'\u0014*y'=\u001e4o#,\u001c";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "%*\u00192y%.\u001d't9-\u0014\"c4=n9k),\f.u";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "'!\u001b)s(6";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "56\u00192s5=\u000e/c11";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "%*\u00192u9#\u0014*y'0\u001b.o0'";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "%*\u00192y\"'\u0014#r#";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "%*\u00192y'0\u001b.o0'";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "%*\u0019(a#=\u00163k$'\n";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = " #\u000e)t/6\u001d5y0+\u001d1u";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "2#\u001e9p/#\u0007/h0+\f#y(-\u00169q'=\u001b)h2#\u001b2";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "60\u0017 o*'";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\"'\u0014#r#=\u0019%e)7\u00162";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "%-\u00162g%6\u00073u";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "!0\u00173v9+\u0016 i";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "2#\u001e9p/#\u0007%i(6\u0019%r6+\u001b-c4=\u0015#h3";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = " #\t";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "2#\u001e9p/#\u00075c26\u0011(a5";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "2#\u001e9p/#\u0007%i(6\u0019%r5$\n'a+'\u00162y+'\u00163";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "('\u000f9a4-\r6";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "%*\u00192u9#\u0014*y%.\u001d't";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "('\u000f9d4-\u0019\"e'1\f9j/1\f";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "%-\u00162g%6\u000b9p/'\u000f5";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "%*\u00192u9#\u0014*y\"'\u0014#r#";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "%*\u00192u9!\u0014#g4=\u0017*b#0\u0007U\u00169&\u0019?u";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "2#\u001e9p/#\u0007%i(6\u0019%r92\u0011%m#0\u0007*o56";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "%*\u00192u9!\u0014#g4=\u0017*b#0\u0007Py+-\u00162n5";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "5'\f2o(%\u000b";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NEW_GROUP = new k(z[25], 0, 1);
                    NEW_BROADCAST_LIST = new k(z[27], 1, 2);
                    SETTINGS = new k(z[33], 2, 3);
                    PROFILE = new k(z[17], 3, 4);
                    ACCOUNT = new k(z[9], 4, 5);
                    CHANGE_NUMBER = new k(z[14], 5, 6);
                    GROUP_INFO = new k(z[20], 6, 7);
                    BACKUP_CONVERSATIONS = new k(z[1], 7, 8);
                    ABOUT = new k(z[0], 8, 9);
                    FAQ = new k(z[22], 9, 10);
                    CONTACT_US = new k(z[19], 10, 11);
                    DELETE_ACCOUNT = new k(z[18], 11, 12);
                    CONTACTS_VIEWS = new k(z[28], 12, 13);
                    STATUS_VIEWS = new k(z[10], 13, 14);
                    TAF_VIA_SETTINGS = new k(z[23], 14, 15);
                    TAF_VIA_CONTACTS_LIST = new k(z[3], 15, 16);
                    TAF_VIA_CONTACTPICKER_MENU = new k(z[21], 16, 17);
                    TAF_VIA_EMPTY = new k(z[4], 17, 18);
                    TAF_VIA_INVITE_NON_WA_CONTACT = new k(z[16], 18, 19);
                    TAF_VIA_CONTACT_PICKER_LIST = new k(z[31], 19, 20);
                    TAF_VIA_CONTACTSFRAGMENT_MENU = new k(z[24], 20, 21);
                    TELL_A_FRIEND = new k(z[7], 21, 22);
                    FAVORITES_VIEWS = new k(z[15], 22, 23);
                    CHAT_DELETE = new k(z[12], 23, 24);
                    CHAT_CLEAR = new k(z[6], 24, 25);
                    CHAT_ARCHIVE = new k(z[13], 25, 26);
                    CHATS_ALL_DELETE = new k(z[29], 26, 27);
                    CHATS_ALL_CLEAR = new k(z[26], 27, 28);
                    CHATS_ALL_ARCHIVE = new k(z[11], 28, 29);
                    CHATS_CLEAR_OLDER_30_DAYS = new k(z[30], 29, 30);
                    CHATS_CLEAR_OLDER_6_MONTHS = new k(z[32], 30, 31);
                    CHAT_CLEAR_OLDER_30_DAYS = new k(z[5], 31, 32);
                    CHAT_CLEAR_OLDER_6_MONTHS = new k(z[8], 32, 33);
                    MESSAGE_STAR = new k(z[2], 33, 34);
                    a = new k[]{NEW_GROUP, NEW_BROADCAST_LIST, SETTINGS, PROFILE, ACCOUNT, CHANGE_NUMBER, GROUP_INFO, BACKUP_CONVERSATIONS, ABOUT, FAQ, CONTACT_US, DELETE_ACCOUNT, CONTACTS_VIEWS, STATUS_VIEWS, TAF_VIA_SETTINGS, TAF_VIA_CONTACTS_LIST, TAF_VIA_CONTACTPICKER_MENU, TAF_VIA_EMPTY, TAF_VIA_INVITE_NON_WA_CONTACT, TAF_VIA_CONTACT_PICKER_LIST, TAF_VIA_CONTACTSFRAGMENT_MENU, TELL_A_FRIEND, FAVORITES_VIEWS, CHAT_DELETE, CHAT_CLEAR, CHAT_ARCHIVE, CHATS_ALL_DELETE, CHATS_ALL_CLEAR, CHATS_ALL_ARCHIVE, CHATS_CLEAR_OLDER_30_DAYS, CHATS_CLEAR_OLDER_6_MONTHS, CHAT_CLEAR_OLDER_30_DAYS, CHAT_CLEAR_OLDER_6_MONTHS, MESSAGE_STAR};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "$#\u001b-s6=\u001b)h0'\n5g2+\u0017(u";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
