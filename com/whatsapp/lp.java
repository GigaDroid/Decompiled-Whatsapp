package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class lp {
    public static boolean a;
    private static Map b;
    private static final String[] z;

    abstract int c(int i);

    static {
        String[] strArr = new String[6];
        String str = "6L\n_";
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
                        i4 = 76;
                        break;
                    case at.g /*1*/:
                        i4 = 41;
                        break;
                    case at.i /*2*/:
                        i4 = 120;
                        break;
                    case at.o /*3*/:
                        i4 = 48;
                        break;
                    default:
                        i4 = 41;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "8^\u0017";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "*L\u000f";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "#G\u001d";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "!H\u0016I";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = new HashMap();
                    strArr = new String[54];
                    str = ".L\u0015";
                    i = 5;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    str = ".[\u0000";
                    i = 6;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = "(H";
                    i = 7;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    str = "(L";
                    i = 8;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    str = ")E";
                    i = 9;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = ")G";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = ")F";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = ")Z";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = ")]";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "*@";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "*F";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "+E";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "$L";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "%^";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "%]";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\"K";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\"E";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\"G";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\"F";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "?_";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "-O";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = ".N";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = ".G";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "/H";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = ")\\";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "*\\\n";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "*P";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "+\\";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "$H";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "%Z";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "'\\";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = " K";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "!E";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "![";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\"H\u0010";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\"L";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "#D";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "#[";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "<H";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "<H\b";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "<Z";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "?F";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "?X";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "?^";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "8H";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "8L";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "8B";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "9[";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "6\\";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "!G";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "+Z\u000f";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "/A\n";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = ">D";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "<]";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    a(strArr3, new mo());
                    strArr = new String[2];
                    str = "/Z";
                    i = 59;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    str = "?B";
                    i = 60;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    a(strArr3, new l7());
                    strArr = new String[3];
                    str = "*O";
                    i = 61;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    str = "*[";
                    i = 62;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    str = "'H\u001a";
                    i = 63;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    a(strArr3, new lf());
                    strArr = new String[7];
                    str = "$[";
                    i = 64;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    str = ">\\";
                    i = 65;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    str = "?[";
                    i = 66;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    str = "9B";
                    i = 67;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    str = ".L";
                    i = 68;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = ".Z";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "?A";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    a(strArr3, new lc());
                    strArr = new String[1];
                    str = " _";
                    i = 71;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    a(strArr3, new l6());
                    strArr = new String[1];
                    str = " ]";
                    i = 72;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    a(strArr3, new lg());
                    strArr = new String[1];
                    str = "<E";
                    i = 73;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    a(strArr3, new mz());
                    strArr = new String[2];
                    str = ">F";
                    i = 74;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    str = "!F";
                    i = 75;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    a(strArr3, new ma());
                    strArr = new String[1];
                    str = "?E";
                    i = 76;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    a(strArr3, new mi());
                    strArr = new String[1];
                    str = "-[";
                    i = 77;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    a(strArr3, new lb());
                    strArr = new String[1];
                    str = "!B";
                    i = 78;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    a(strArr3, new lh());
                    strArr = new String[1];
                    str = "/P";
                    i = 79;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    a(strArr3, new m9());
                    strArr = new String[1];
                    str = ".[";
                    i = 80;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    a(strArr3, new lj());
                    strArr = new String[1];
                    str = " H\u001f";
                    i = 81;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i2] = str;
                    a(strArr3, new l0());
                    strArr = new String[1];
                    str = "?A\u0011";
                    i = 82;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i2] = str;
                    a(strArr3, new mw());
                    strArr = new String[1];
                    str = "!]";
                    i = 83;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i2] = str;
                    a(strArr3, new l8());
                    strArr = new String[7];
                    str = "+H";
                    i = 84;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i2] = str;
                    str = "?L";
                    i = 85;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i2] = str;
                    str = "?D\u0019";
                    i = 86;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i2] = str;
                    str = "?D\u0011";
                    i = 87;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i2] = str;
                    str = "?D\u0012";
                    i = 88;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "?D\u0016";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "?D\u000b";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i2] = str;
                    a(strArr3, new me());
                    strArr = new String[12];
                    str = "-B";
                    i = 91;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i2] = str;
                    str = "-D";
                    i = 92;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i2] = str;
                    str = ".A";
                    i = 93;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i2] = str;
                    str = "*@\u0014";
                    i = 94;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i2] = str;
                    str = "8E";
                    i = 95;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "+\\\u000f";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "$@";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = " G";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "!N";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\"Z\u0017";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "8@";
                    i = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = ";H";
                    i = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i2] = str;
                    a(strArr3, new m3());
                    strArr = new String[27];
                    str = "-S";
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i2] = str;
                    str = ".D";
                    i = arj.Theme_editTextStyle;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i2] = str;
                    str = "*H";
                    i = arj.Theme_radioButtonStyle;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i2] = str;
                    str = "%N";
                    i = arj.Theme_ratingBarStyle;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i2] = str;
                    str = "$\\";
                    i = arj.Theme_seekBarStyle;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "&H";
                    i = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "'M\u001d";
                    i = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "'L\u0019";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "'F";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "!P";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "?L\u000b";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "?N";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "8F";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "8[";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = ":@";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = ";F";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "5F";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "6A";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = ".F";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "(S";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "%M";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "&_";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "'H";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "'D";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "'G";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "!Z";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "8A";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    a(strArr3, new ly());
                    return;
                default:
                    strArr2[i2] = str;
                    str = "#]\u0010U[";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static final String a(int i) {
        switch (i) {
            case at.g /*1*/:
                return z[0];
            case at.i /*2*/:
                return z[4];
            case at.p /*4*/:
                return z[2];
            case aF.u /*8*/:
                return z[3];
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                return z[5];
            default:
                return z[1];
        }
    }

    static final lp a(Locale locale) {
        return (lp) b.get(locale.getLanguage());
    }

    static final int b(int i) {
        switch (i) {
            case at.g /*1*/:
                return 16777221;
            case at.i /*2*/:
                return 16777222;
            case at.p /*4*/:
                return 16777223;
            case aF.u /*8*/:
                return 16777224;
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                return 16777225;
            default:
                return 16777220;
        }
    }

    public static void a(String[] strArr, lp lpVar) {
        for (Object put : strArr) {
            b.put(put, lpVar);
        }
    }
}
