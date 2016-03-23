package com.whatsapp;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.ConditionVariable;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.a1;
import com.whatsapp.util.c6;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class asx {
    private static final String[] z;

    static {
        String[] strArr = new String[225];
        String str = "5Nri`7N";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 64;
                        break;
                    case at.g /*1*/:
                        i3 = 32;
                        break;
                    case at.i /*2*/:
                        i3 = 25;
                        break;
                    case at.o /*3*/:
                        i3 = 7;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "J*\u0013\r";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "oCxkc`Vpe}!T|";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\f\u0000]n|4Awdj";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "2Eubn3E";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0006aH']%Slk{3\u0000Kbn$";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "\u0015p";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "\u0016I}b``Tkfa3Cvcj";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "6Opw/#Auk/2Ejrc4";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0004Ijs})Blsf/N";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ".S6";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "!Cmny%";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ".S6";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "oSqhx`Nvsf&S";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    str = "5Njr\u007f0Oksj$\u0000}by)C|";
                    obj = 14;
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    strArr2 = strArr3;
                    str = "r\u000e(5!u\u0015)";
                    obj = 15;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "`\b";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\rIjsv0E}";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "5Nri`7N";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "2Ethy%D";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0013It";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0017E{'|%Sjn`.";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\rO}bc";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0004Amf/2Oxjf.G";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    str = "7E{tf4E";
                    obj = 24;
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    strArr2 = strArr3;
                    str = "2Eubn3E";
                    obj = 25;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "eS#\"|";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "4Orba`Sxqj$";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "oCxkc4Owb";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0015nRI@\u0017n9/a/\u0000mbc%Pqha9\u0000tfa!G|u&";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u000eEmp`2K9uj3Tknl4E}";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    str = ".O9ba#O}b}3";
                    obj = 31;
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    strArr2 = strArr3;
                    str = ":Z";
                    obj = 32;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u000eOm'L!Lzrc!T|c";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0019Ej";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "0Hvij";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "2E\u007f";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "oM|t|!G|'{/N|";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u0010Hvij`t`wj";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "6Opw/\"Iwc/4O9fa9\u0000kbc!Y";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "oM|t|!G|'c)Gqs";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "&Autj";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = ".S6";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u000e\u000fX";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0015nRI@\u0017n9/a/\u0000mbc%Pqha9\u0000tfa!G|u&";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u001cd";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u000eEmp`2K9jj4Ekbk";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "6Opw/#Auk/3I}b";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "/L}'n0I";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u0003Akuf%R";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "r\u000e(5!u\u0015)";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "9Y`~\"\rm4ck`hQ=b-\u001ajt!\u0013sJ]";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = ")N}ny)Dlfc\u001fCqf{\u001fD|an5Lmt";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0013Ekqj2";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0004n";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0013Ozlj4\u0000Zha.";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0006aH']%Slk{3\u0000Kbn$";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u000e\u000fX";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "eS#\"|";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0006aH']%Slk{3\u0000Kb{5Rwbk";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0003Owqj2Sxsf/N9s`.Ej";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0016Ektf/N";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0006R|b/\u0013Pxdj`blnc4\rPi";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u000fs";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0010w";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0004Eonl%";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0002Upkk";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0015nRI@\u0017n9/a/\u0000mbc%Pqha9\u0000tfa!G|u&";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0004Ejd})Pmn`.";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "#Owij#Tpqf4Y";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0013c6_L";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "\u0003Owsj8T";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = ".S6";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "J*\u0013\rt;Etff,\u007f|\u007fl%Pmn`.]d\r";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0012A}n``mZD\"\rnZ";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = ")N}ny)Dlfc\u001fCqf{\u001fD|an5Lmt";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u000e\u000fX''.O9sj,Eio`.Y9jn.A~b}i";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u0004E{rh`Iwa`";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0003Owij#Tpha";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "3Uiw`2T|c";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = ".S6";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u000eOm'L!Lzrc!T|c";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0004Eonl%\u0000PT@x\u0016)6";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "#Hwrb`";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\fc";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\rIjtf.G9Wj2Mpt|)Owt";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u000bEkij,";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\rIjsv0E}'C!Sm1";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u000eEmp`2K9Sv0E";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0006R|b/\u0013Pxdj`r|j`6A{kj";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = ".S6";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "oMlsj`Ewc/4Itb";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "-Oli{%DFu`";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u0016I}b``Tkfa3Cvcj";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "#C";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u0004Ix`a/Smnl`cvcj3";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "\u0014Ak`j4";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "`\b";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "\u0013iT'B\u0003c4JA\u0003";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "\u000eO";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "'Rvr\u007f\u001fCqf{\u001fD|an5Lmt";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\u0003cvcj";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "\u0010Rvcz#T";
                    obj = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = ".S6";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "0H";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "\fg";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "`\b";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = ":Z";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "\u000eOm'\u007f2Ejba4";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "m\rJr\u007f0Oks/\tN\u007fh\"m*";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "6Opw/#Auk/4Ekjf.Amb/2Ext`.";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "\rAwri!Cmr}%R";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "6Opw/#Auk/3Emr\u007f`Eku`2";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "7E{tf4E";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "%Xzb\u007f4Ivi/$Ukna'\u0000|jn)L9d`-Pvtf4Ivi";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "oM|t|!G|'\u007f/Plw";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "`\bkbn$\rvic9\t";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "\u0014Eu'}/Atna'";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = ".S6";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "#Owqj2Sxsf/NFt`5N}";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "#Ot)x(Amtn0PFw}%F|uj.C|t";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "4Rlb";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "5Nkbh)Smb}%D";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0016I}b``Tkfa3Cvcj";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "\u000e\u000fX''.O9sj,Eio`.Y9jn.A~b}i";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "\u0016I}b``Tkfa3Cvcj";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = ".\u000fx";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "\u0017E{'|%Sjn`.";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "z\u0000";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "%Mxnc3Ewcj2\u000fst`.\u000f|u}/R9";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u0005d^B";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0003dTF";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "\ft\\";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "\bsIF";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u0003dTF/m\u0000(\u007f]\u0014t";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "\bsIF$";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u0003dTF/m\u0000\\qK/\u0000kbyn\u0000[";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "\u0003dTF/m\u0000|O]\u0010d";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "\u0015nRI@\u0017n";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u0003dTF/m\u0000\\qK/\u0000kbyn\u0000X";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = ")d\\I";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "\u0003dTF/m\u0000\\qK/\u0000kbyn\u0000)";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "\u0015mMT";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "\u0007pKT";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "\bsLWN";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "\bs]WN";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "`\b";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "\u000eoWB";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = "%MxncmS|ik%R6`j.Ekf{%\r}nn'Nvt{)Cj(h$RpqjmNvs\"#Aifm,E";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "\u0004c4U[\u0005d9";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "\u000ew4PN\u0010\r('";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "/R~)n#Rx)N\u0003rX";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "\u0004c4EN\u0003rT'";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = "\u0006e4@K\u0005\u0000";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = "\u0014k4I\\m";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "%MxncmS|ik%R6`j.Ekf{%\r}nn'Nvt{)Cj(h$RpqjmEunh)Bub";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = "\u0014k4I_m";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = "%MxncmS|ik%R6`j.Ekf{%\r}nn'Nvt{)Cj(h$RpqjmCxwn\"L|";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = "\u0014k4AHm\u00109";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "\u0006e4@K\u0003\u0000";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "%MxncmS|ik%R6`j.Ekf{%\r}nn'Nvt{)Cj(h$RpqjmNvs\"%Lp`f\"L|";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = "&Iwcb)Sjna'P|ub)Sjn`.S6i`mPxdd!G|*b!Nx`j2";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "#Ot)x(Amtn0P";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "l\u0000";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = "!N}u`)D7na4Ews!%Xmunnt\\_[";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "!N}u`)D7na4Ews!!Cmn`.\u000eJBA\u0004\u007fTRC\u0014iIKJ";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "\u000eO9k`'\u0000\u007fnc%\u0000mh/!Tmfl(\u000e\u0013";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    i = 168;
                    str = "0LxnaoT|\u007f{";
                    obj = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i] = str;
                    i = 169;
                    str = "!N}u`)D7na4Ews!!Cmn`.\u000eJBA\u0004";
                    obj = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i] = str;
                    i = 170;
                    str = "!Pikf#Amn`.\u000fcn\u007f";
                    obj = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i] = str;
                    i = 171;
                    str = "#Ot)x(Amtn0P7af,Eiu`6I}b}";
                    obj = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i] = str;
                    i = 172;
                    str = "!N}u`)D7na4Ews!%XmunnsLEE\u0005cM";
                    obj = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i] = str;
                    i = 173;
                    str = "!Pikf#Amn`.\u000fcn\u007f";
                    obj = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i] = str;
                    i = 174;
                    str = "j\u000f3";
                    obj = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i] = str;
                    i = 175;
                    str = "!N}u`)D7na4Ews!%XmunnsMUJ\u0001m";
                    obj = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i] = str;
                    i = 176;
                    str = "!N}u`)DYtz0Pvu{nWqf{3Aiw!#Ot";
                    obj = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i] = str;
                    i = 177;
                    str = "0LxnaoT|\u007f{";
                    obj = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i] = str;
                    i = 178;
                    str = "!N}u`)D7na4Ews!%XmunneTFF\f";
                    obj = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i] = str;
                    i = 179;
                    str = "!N}u`)D7na4Ews!%XmunnsMUJ\u0001m";
                    obj = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i] = str;
                    i = 180;
                    str = ")Mx`jo\n";
                    obj = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i] = str;
                    i = 181;
                    str = "%Mxnc3Ewcj2\u000fpii/Fpkj#LvtjoSrn\u007f";
                    obj = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i] = str;
                    i = 182;
                    str = "%Mxnc3Ewcj2\u000fpii/Fpkj#LvtjoSrn\u007f";
                    obj = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i] = str;
                    i = 183;
                    str = "%Mxnc3Ewcj2\u000fpii/FpkjoSrn\u007f";
                    obj = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i] = str;
                    i = 184;
                    str = "$E{rh)N\u007fh!*Svi";
                    obj = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i] = str;
                    i = 185;
                    str = "%Mxnc3Ewcj2\u000fpii/FpkjoEku`2";
                    obj = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i] = str;
                    i = 186;
                    str = "%Mxnc3Ewcj2\u000fpii/Fpkj#LvtjoSrn\u007f";
                    obj = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i] = str;
                    i = 187;
                    str = "&Okdj$";
                    obj = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i] = str;
                    i = 188;
                    str = "%MxncmS|ik%R6r\u007f,Oxc\",O~t/.O9k`'S9a`5N}'{/\u0000{b/5Puhn$E})";
                    obj = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i] = str;
                    i = 189;
                    str = "&Rvj";
                    obj = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i] = str;
                    i = 190;
                    str = "4Rlb";
                    obj = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i] = str;
                    i = 191;
                    str = "&Iub";
                    obj = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i] = str;
                    i = 192;
                    str = "4Yib";
                    obj = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i] = str;
                    i = 193;
                    str = "3Uiw`2T";
                    obj = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i] = str;
                    i = 194;
                    str = "9Awcj8\u000etff,";
                    obj = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i] = str;
                    i = 195;
                    str = "'M";
                    obj = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i] = str;
                    i = 196;
                    str = "`\\9";
                    obj = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i] = str;
                    i = 197;
                    str = "!N}u`)D7jn)L";
                    obj = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i] = str;
                    i = 198;
                    str = "#Ot)h/O~kjnAwc}/I})n0Pj)f.Bv\u007f";
                    obj = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i] = str;
                    i = 199;
                    str = "u\u000e";
                    obj = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i] = str;
                    i = 200;
                    str = "#Ot)h/O~kjnAwc}/I})n0Pj)f.Bv\u007f";
                    obj = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i] = str;
                    i = 201;
                    str = "%MxncmS|ik%R6f\u007f0\u0000";
                    obj = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i] = str;
                    i = 202;
                    str = "!N}u`)D7na4Ews!%XmunnsMUJ\u0001m";
                    obj = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i] = str;
                    i = 203;
                    str = "!N}u`)D7na4Ews!%XmunnsMUJ\u0001m";
                    obj = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i] = str;
                    i = 204;
                    str = "#Ot)m!Y}nanBvhb%Rxih";
                    obj = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i] = str;
                    i = 205;
                    str = "#Ot)h/O~kjnAwc}/I})h-";
                    obj = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i] = str;
                    i = 206;
                    str = "&Iub";
                    obj = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i] = str;
                    i = 207;
                    str = "(Omjn)L";
                    obj = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i] = str;
                    i = 208;
                    str = "%Mxnc";
                    obj = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i] = str;
                    i = 209;
                    str = "#Ot)n3Uj)j-Apk";
                    obj = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i] = str;
                    i = 210;
                    str = "-Apkk2Opc";
                    obj = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i] = str;
                    i = 211;
                    str = "#Ot)b)Ckh|/Fm)`&FpdjnOlsc/Or";
                    obj = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i] = str;
                    i = 212;
                    str = "!N}u`)D7na4Ews!%XmunniWN[\taUXF\u000et\\I[\u0013";
                    obj = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i] = str;
                    i = 213;
                    str = "&Szl!+\u0019";
                    obj = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i] = str;
                    i = 214;
                    str = "oPkhloS`t +Ekij,\u000fob}3Ivi";
                    obj = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i] = str;
                    i = 215;
                    str = "\u0015Nri`7N9uj,Extj";
                    obj = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i] = str;
                    i = 216;
                    str = "oPkhloS`t +Ekij,\u000fob}3Ivi";
                    obj = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i] = str;
                    i = 217;
                    str = "`Uwla/Ww'y%Rjn`.";
                    obj = 216;
                    strArr2 = strArr3;
                    break;
                case 216:
                    strArr2[i] = str;
                    i = 218;
                    str = "oPkhloS`t +Ekij,\u000fvt}%L|f|%";
                    obj = 217;
                    strArr2 = strArr3;
                    break;
                case 217:
                    strArr2[i] = str;
                    i = 219;
                    str = "oPkhloS`t +Ekij,\u000fvt}%L|f|%";
                    obj = 218;
                    strArr2 = strArr3;
                    break;
                case 218:
                    strArr2[i] = str;
                    i = 220;
                    str = "\u0003dTF";
                    obj = 219;
                    strArr2 = strArr3;
                    break;
                case 219:
                    strArr2[i] = str;
                    i = 221;
                    str = "\u0015nRI@\u0017n";
                    obj = 220;
                    strArr2 = strArr3;
                    break;
                case 220:
                    strArr2[i] = str;
                    i = 222;
                    str = "\u000eoWB";
                    obj = 221;
                    strArr2 = strArr3;
                    break;
                case 221:
                    strArr2[i] = str;
                    i = 223;
                    str = "\u0013iI";
                    obj = 222;
                    strArr2 = strArr3;
                    break;
                case 222:
                    strArr2[i] = str;
                    i = 224;
                    str = "\u0007sT";
                    obj = 223;
                    strArr2 = strArr3;
                    break;
                case 223:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "oM|t|!G|'y)Bkf{%";
                    obj = null;
                    break;
            }
        }
    }

    public static String c() {
        List b = Log.b(1);
        try {
            if (b.size() < 1) {
                Log.e(z[188]);
                return null;
            }
            File file;
            File file2 = (File) b.get(0);
            if (file2.length() > 8388608) {
                File a = a1.a(file2, 8388608, 0);
                if (a == null) {
                    return null;
                }
                file = a;
            } else {
                file = file2;
            }
            StringBuffer stringBuffer = new StringBuffer();
            ConditionVariable conditionVariable = new ConditionVariable();
            try {
                mk mkVar = new mk(azx.g, new aoo(stringBuffer, conditionVariable));
                mkVar.a(new FileInputStream(file), z[191], file.getName(), 0);
                mkVar.a(z[192], z[193]);
                mkVar.a(z[189], App.x(App.z()));
                mkVar.a(z[187], z[190]);
                mkVar.b();
                try {
                    conditionVariable.block(100000);
                    if (stringBuffer.length() == 0) {
                        return null;
                    }
                    try {
                        if (!file.getAbsolutePath().equals(file2.getAbsolutePath())) {
                            file.delete();
                        }
                        return stringBuffer.toString();
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable e3) {
                Log.a(e3);
                return null;
            }
        } catch (Exception e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = com.whatsapp.App.al;	 Catch:{ Exception -> 0x00cf }
        r4 = 0;
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ Exception -> 0x00cf }
        r0 = r0.a(r4, r3);	 Catch:{ Exception -> 0x00cf }
        r3 = r0.a;	 Catch:{ Exception -> 0x00cd }
        if (r3 == 0) goto L_0x002e;
    L_0x0015:
        r3 = z;	 Catch:{ Exception -> 0x00cd }
        r4 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00cd }
        r3 = r2.append(r3);	 Catch:{ Exception -> 0x00cd }
        r4 = r0.a;	 Catch:{ Exception -> 0x00cd }
        r4 = r4.size();	 Catch:{ Exception -> 0x00cd }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x00cd }
        r4 = 32;
        r3.append(r4);	 Catch:{ Exception -> 0x00cd }
    L_0x002e:
        r3 = r0.b;	 Catch:{ Exception -> 0x00db }
        if (r3 == 0) goto L_0x004b;
    L_0x0032:
        r3 = z;	 Catch:{ Exception -> 0x00db }
        r4 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00db }
        r3 = r2.append(r3);	 Catch:{ Exception -> 0x00db }
        r0 = r0.b;	 Catch:{ Exception -> 0x00db }
        r0 = r0.size();	 Catch:{ Exception -> 0x00db }
        r0 = r3.append(r0);	 Catch:{ Exception -> 0x00db }
        r3 = 32;
        r0.append(r3);	 Catch:{ Exception -> 0x00db }
    L_0x004b:
        r0 = z;	 Catch:{ ClassNotFoundException -> 0x00f0 }
        r3 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r0 = r0[r3];	 Catch:{ ClassNotFoundException -> 0x00f0 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x00f0 }
        r0 = z;	 Catch:{ ClassNotFoundException -> 0x00f0 }
        r3 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r0 = r0[r3];	 Catch:{ ClassNotFoundException -> 0x00f0 }
        r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x00f0 }
    L_0x005d:
        r0 = com.whatsapp.ve.F();	 Catch:{ Exception -> 0x00dd }
        if (r0 == 0) goto L_0x006c;
    L_0x0063:
        r0 = z;	 Catch:{ Exception -> 0x00dd }
        r3 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00dd }
        r2.append(r0);	 Catch:{ Exception -> 0x00dd }
    L_0x006c:
        r0 = com.whatsapp.ve.C();	 Catch:{ Exception -> 0x00df }
        if (r0 == 0) goto L_0x007b;
    L_0x0072:
        r0 = z;	 Catch:{ Exception -> 0x00df }
        r3 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00df }
        r2.append(r0);	 Catch:{ Exception -> 0x00df }
    L_0x007b:
        r0 = com.whatsapp.App.j;	 Catch:{ Exception -> 0x00e1 }
        r3 = com.whatsapp.App.am;	 Catch:{ Exception -> 0x00e1 }
        r0 = com.whatsapp.gdrive.fn.b(r0, r3);	 Catch:{ Exception -> 0x00e1 }
        if (r0 == 0) goto L_0x0099;
    L_0x0085:
        r0 = z;	 Catch:{ Exception -> 0x00e3 }
        r3 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00e3 }
        r2.append(r0);	 Catch:{ Exception -> 0x00e3 }
        r0 = z;	 Catch:{ Exception -> 0x00e3 }
        r3 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00e3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00e3 }
        if (r1 == 0) goto L_0x00a2;
    L_0x0099:
        r0 = z;	 Catch:{ Exception -> 0x00e3 }
        r3 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00e3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00e3 }
    L_0x00a2:
        r0 = com.whatsapp.gdrive.GoogleDriveService.z();	 Catch:{ Exception -> 0x00e5 }
        if (r0 == 0) goto L_0x00bc;
    L_0x00a8:
        r0 = z;	 Catch:{ Exception -> 0x00e7 }
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00e7 }
        r2.append(r0);	 Catch:{ Exception -> 0x00e7 }
        r0 = z;	 Catch:{ Exception -> 0x00e7 }
        r3 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00e7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00e7 }
        if (r1 == 0) goto L_0x00c5;
    L_0x00bc:
        r0 = z;	 Catch:{ Exception -> 0x00e7 }
        r1 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00e7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00e7 }
    L_0x00c5:
        r0 = r2.length();	 Catch:{ Exception -> 0x00e9 }
        if (r0 != 0) goto L_0x00eb;
    L_0x00cb:
        r0 = 0;
    L_0x00cc:
        return r0;
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        r0 = z;
        r3 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r0 = r0[r3];
        r2.append(r0);
        goto L_0x004b;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00cf }
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = r2.toString();
        goto L_0x00cc;
    L_0x00f0:
        r0 = move-exception;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asx.a():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(@android.support.annotation.NonNull android.content.Intent r11, @android.support.annotation.NonNull android.content.Context r12, @android.support.annotation.Nullable com.whatsapp.by r13, @android.support.annotation.NonNull java.lang.String r14) {
        /*
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r12.getPackageManager();
        r1 = 0;
        r0 = r0.queryIntentActivities(r11, r1);
        if (r0 == 0) goto L_0x018c;
    L_0x0012:
        r5 = r0.iterator();
    L_0x0016:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x018c;
    L_0x001c:
        r0 = r5.next();
        r0 = (android.content.pm.ResolveInfo) r0;
        r0 = r0.activityInfo;
        r1 = r0.name;
        r0 = r0.applicationInfo;
        r6 = r0.packageName;
        r0 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0.<init>();	 Catch:{ NameNotFoundException -> 0x01a5 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x01a5 }
        r7 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r2 = r2[r7];	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0 = r0.append(r2);	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0 = r0.append(r6);	 Catch:{ NameNotFoundException -> 0x01a5 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x01a5 }
        r7 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r2 = r2[r7];	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0 = r0.append(r2);	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0 = r0.append(r1);	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0 = r0.toString();	 Catch:{ NameNotFoundException -> 0x01a5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01a5 }
        r2 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01a5 }
        if (r0 != 0) goto L_0x00d6;
    L_0x005e:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01a5 }
        r2 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01a5 }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01a5 }
        if (r0 != 0) goto L_0x00d6;
    L_0x006a:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01a7 }
        r2 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01a7 }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01a7 }
        if (r0 != 0) goto L_0x00d6;
    L_0x0076:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01a9 }
        r2 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01a9 }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01a9 }
        if (r0 != 0) goto L_0x00d6;
    L_0x0082:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01ab }
        r2 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01ab }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01ab }
        if (r0 != 0) goto L_0x00d6;
    L_0x008e:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01ad }
        r2 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01ad }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01ad }
        if (r0 != 0) goto L_0x00d6;
    L_0x009a:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01af }
        r2 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01af }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01af }
        if (r0 != 0) goto L_0x00d6;
    L_0x00a6:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01b1 }
        r2 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01b1 }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01b1 }
        if (r0 != 0) goto L_0x00d6;
    L_0x00b2:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01b3 }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01b3 }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01b3 }
        if (r0 != 0) goto L_0x00d6;
    L_0x00be:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01b5 }
        r2 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01b5 }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01b5 }
        if (r0 != 0) goto L_0x00d6;
    L_0x00ca:
        r0 = z;	 Catch:{ NameNotFoundException -> 0x01b7 }
        r2 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r0 = r0[r2];	 Catch:{ NameNotFoundException -> 0x01b7 }
        r0 = r6.contains(r0);	 Catch:{ NameNotFoundException -> 0x01b7 }
        if (r0 == 0) goto L_0x018a;
    L_0x00d6:
        r0 = r11.clone();
        r0 = (android.content.Intent) r0;
        r0.setClassName(r6, r1);
        r0.setPackage(r6);
        r1 = 0;
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NameNotFoundException -> 0x01b9 }
        r7 = 23;
        if (r2 >= r7) goto L_0x0116;
    L_0x00e9:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NameNotFoundException -> 0x01b9 }
        r7 = 10;
        if (r2 <= r7) goto L_0x0116;
    L_0x00ef:
        r2 = z;	 Catch:{ NameNotFoundException -> 0x01bb }
        r7 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r2 = r2[r7];	 Catch:{ NameNotFoundException -> 0x01bb }
        r2 = r6.equals(r2);	 Catch:{ NameNotFoundException -> 0x01bb }
        if (r2 == 0) goto L_0x01c5;
    L_0x00fb:
        r2 = r12.getPackageManager();	 Catch:{ NameNotFoundException -> 0x01bf }
        r7 = 0;
        r2 = r2.getPackageInfo(r6, r7);	 Catch:{ NameNotFoundException -> 0x01bf }
        if (r2 == 0) goto L_0x0116;
    L_0x0106:
        r7 = r2.versionName;	 Catch:{ NameNotFoundException -> 0x01bd }
        if (r7 == 0) goto L_0x0116;
    L_0x010a:
        r2 = r2.versionName;	 Catch:{ NameNotFoundException -> 0x01bf }
        r7 = z;	 Catch:{ NameNotFoundException -> 0x01bf }
        r8 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r7 = r7[r8];	 Catch:{ NameNotFoundException -> 0x01bf }
        r1 = r2.startsWith(r7);	 Catch:{ NameNotFoundException -> 0x01bf }
    L_0x0116:
        if (r1 == 0) goto L_0x0187;
    L_0x0118:
        r1 = z;
        r2 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r1 = r1[r2];
        r1 = r0.getParcelableArrayListExtra(r1);
        if (r1 == 0) goto L_0x0187;
    L_0x0124:
        r6 = new java.util.ArrayList;
        r2 = r1.size();
        r6.<init>(r2);
        r7 = r1.iterator();
    L_0x0131:
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x017e;
    L_0x0137:
        r1 = r7.next();
        r1 = (android.net.Uri) r1;
        r2 = r1.getPath();
        r8 = 1;
        r8 = com.whatsapp.a28.a(r2, r8);
        r9 = z;	 Catch:{ NameNotFoundException -> 0x01d6 }
        r10 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r9 = r9[r10];	 Catch:{ NameNotFoundException -> 0x01d6 }
        r10 = r1.getScheme();	 Catch:{ NameNotFoundException -> 0x01d6 }
        r9 = r9.equals(r10);	 Catch:{ NameNotFoundException -> 0x01d6 }
        if (r9 == 0) goto L_0x01e1;
    L_0x0156:
        r2 = r8.equals(r2);	 Catch:{ NameNotFoundException -> 0x01d6 }
        if (r2 != 0) goto L_0x01e1;
    L_0x015c:
        r2 = r1.getLastPathSegment();	 Catch:{ IOException -> 0x01d8 }
        r8 = 1;
        r2 = com.whatsapp.a28.a(r2, r8);	 Catch:{ IOException -> 0x01d8 }
        r2 = com.whatsapp.App.j(r2);	 Catch:{ IOException -> 0x01d8 }
        r8 = new java.io.File;	 Catch:{ IOException -> 0x01d8 }
        r9 = r1.getPath();	 Catch:{ IOException -> 0x01d8 }
        r8.<init>(r9);	 Catch:{ IOException -> 0x01d8 }
        com.whatsapp.util.ag.a(r8, r2);	 Catch:{ IOException -> 0x01d8 }
        r2 = android.net.Uri.fromFile(r2);	 Catch:{ IOException -> 0x01d8 }
        r6.add(r2);	 Catch:{ IOException -> 0x01d8 }
    L_0x017c:
        if (r3 == 0) goto L_0x0131;
    L_0x017e:
        r1 = z;
        r2 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r1 = r1[r2];
        r0.putParcelableArrayListExtra(r1, r6);
    L_0x0187:
        r4.add(r0);
    L_0x018a:
        if (r3 == 0) goto L_0x0016;
    L_0x018c:
        r0 = r4.size();	 Catch:{ NameNotFoundException -> 0x01e7 }
        if (r0 != 0) goto L_0x01ed;
    L_0x0192:
        if (r13 == 0) goto L_0x019c;
    L_0x0194:
        r0 = 2131231113; // 0x7f080189 float:1.8078298E38 double:1.0529680763E-314;
        r13.a(r0);	 Catch:{ NameNotFoundException -> 0x01eb }
        if (r3 == 0) goto L_0x01a3;
    L_0x019c:
        r0 = 2131231113; // 0x7f080189 float:1.8078298E38 double:1.0529680763E-314;
        r1 = 0;
        com.whatsapp.App.a(r12, r0, r1);	 Catch:{ NameNotFoundException -> 0x01eb }
    L_0x01a3:
        r0 = 0;
    L_0x01a4:
        return r0;
    L_0x01a5:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01a7 }
    L_0x01a7:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01a9 }
    L_0x01a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01ab }
    L_0x01ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01ad }
    L_0x01ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01af }
    L_0x01af:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01b1 }
    L_0x01b1:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01b3 }
    L_0x01b3:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01b5 }
    L_0x01b5:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01b7 }
    L_0x01b7:
        r0 = move-exception;
        throw r0;
    L_0x01b9:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01bb }
    L_0x01bb:
        r0 = move-exception;
        throw r0;
    L_0x01bd:
        r2 = move-exception;
        throw r2;	 Catch:{ NameNotFoundException -> 0x01bf }
    L_0x01bf:
        r2 = move-exception;
        com.whatsapp.util.Log.a(r2);	 Catch:{ NameNotFoundException -> 0x01d4 }
        if (r3 == 0) goto L_0x0116;
    L_0x01c5:
        r2 = z;	 Catch:{ NameNotFoundException -> 0x01d4 }
        r7 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r2 = r2[r7];	 Catch:{ NameNotFoundException -> 0x01d4 }
        r2 = r6.equals(r2);	 Catch:{ NameNotFoundException -> 0x01d4 }
        if (r2 == 0) goto L_0x0116;
    L_0x01d1:
        r1 = 1;
        goto L_0x0116;
    L_0x01d4:
        r0 = move-exception;
        throw r0;
    L_0x01d6:
        r0 = move-exception;
        throw r0;
    L_0x01d8:
        r2 = move-exception;
        r6.add(r1);	 Catch:{ NameNotFoundException -> 0x01e5 }
        com.whatsapp.util.Log.a(r2);	 Catch:{ NameNotFoundException -> 0x01e5 }
        if (r3 == 0) goto L_0x017c;
    L_0x01e1:
        r6.add(r1);	 Catch:{ NameNotFoundException -> 0x01e5 }
        goto L_0x017c;
    L_0x01e5:
        r0 = move-exception;
        throw r0;
    L_0x01e7:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01e9 }
    L_0x01e9:
        r0 = move-exception;
        throw r0;	 Catch:{ NameNotFoundException -> 0x01eb }
    L_0x01eb:
        r0 = move-exception;
        throw r0;
    L_0x01ed:
        r0 = r4.size();
        r1 = 1;
        if (r0 <= r1) goto L_0x0227;
    L_0x01f4:
        r0 = r4.size();
        r0 = r0 + -1;
        r0 = r4.get(r0);
        r0 = (android.content.Intent) r0;
        r1 = android.content.Intent.createChooser(r0, r14);
        r0 = r4.size();	 Catch:{ NameNotFoundException -> 0x0234 }
        r0 = r0 + -1;
        r4.remove(r0);	 Catch:{ NameNotFoundException -> 0x0234 }
        r0 = z;	 Catch:{ NameNotFoundException -> 0x0234 }
        r2 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r2 = r0[r2];	 Catch:{ NameNotFoundException -> 0x0234 }
        r0 = r4.size();	 Catch:{ NameNotFoundException -> 0x0234 }
        r0 = new android.content.Intent[r0];	 Catch:{ NameNotFoundException -> 0x0234 }
        r0 = r4.toArray(r0);	 Catch:{ NameNotFoundException -> 0x0234 }
        r0 = (android.os.Parcelable[]) r0;	 Catch:{ NameNotFoundException -> 0x0234 }
        r1.putExtra(r2, r0);	 Catch:{ NameNotFoundException -> 0x0234 }
        r12.startActivity(r1);	 Catch:{ NameNotFoundException -> 0x0234 }
        if (r3 == 0) goto L_0x0231;
    L_0x0227:
        r0 = 0;
        r0 = r4.get(r0);	 Catch:{ NameNotFoundException -> 0x0234 }
        r0 = (android.content.Intent) r0;	 Catch:{ NameNotFoundException -> 0x0234 }
        r12.startActivity(r0);	 Catch:{ NameNotFoundException -> 0x0234 }
    L_0x0231:
        r0 = 1;
        goto L_0x01a4;
    L_0x0234:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asx.a(android.content.Intent, android.content.Context, com.whatsapp.by, java.lang.String):boolean");
    }

    public static File b(String str) {
        FileOutputStream fileOutputStream;
        IOException e;
        Throwable th;
        File file = new File(App.z().getFilesDir(), z[184]);
        if (!file.exists() || file.delete()) {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(str.getBytes());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            Log.e(z[182] + e2.toString());
                            return null;
                        }
                    }
                    return file;
                } catch (IOException e3) {
                    e2 = e3;
                    try {
                        Log.e(z[183] + e2.toString());
                        if (fileOutputStream != null) {
                            return null;
                        }
                        try {
                            fileOutputStream.close();
                            return null;
                        } catch (IOException e22) {
                            Log.e(z[181] + e22.toString());
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e222) {
                                Log.e(z[186] + e222.toString());
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e222 = e4;
                fileOutputStream = null;
                Log.e(z[183] + e222.toString());
                if (fileOutputStream != null) {
                    return null;
                }
                fileOutputStream.close();
                return null;
            } catch (Throwable th3) {
                fileOutputStream = null;
                th = th3;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        }
        try {
            Log.e(z[185]);
            return null;
        } catch (IOException e5) {
            throw e5;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(@android.support.annotation.NonNull android.app.Activity r18, com.whatsapp.by r19, java.lang.String r20, java.lang.String r21, java.util.ArrayList r22, java.lang.String r23, java.lang.String r24, java.io.File r25, long r26, long r28, java.lang.String r30, boolean r31) {
        /*
        r14 = com.whatsapp.DialogToastActivity.f;
        r2 = 2131231095; // 0x7f080177 float:1.8078261E38 double:1.0529680674E-314;
        r0 = r18;
        r15 = r0.getString(r2);
        r16 = new java.lang.StringBuilder;
        r3 = r18;
        r4 = r20;
        r5 = r21;
        r6 = r23;
        r7 = r24;
        r8 = r26;
        r10 = r28;
        r12 = r30;
        r13 = r31;
        r2 = a(r3, r4, r5, r6, r7, r8, r10, r12, r13);
        r0 = r16;
        r0.<init>(r2);
        if (r22 == 0) goto L_0x0130;
    L_0x002a:
        r2 = r22.isEmpty();
        if (r2 != 0) goto L_0x0130;
    L_0x0030:
        r2 = 1;
    L_0x0031:
        r4 = new android.content.Intent;
        if (r2 == 0) goto L_0x0133;
    L_0x0035:
        r3 = z;
        r5 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r3 = r3[r5];
    L_0x003b:
        r4.<init>(r3);
        if (r24 != 0) goto L_0x0085;
    L_0x0040:
        if (r25 != 0) goto L_0x0058;
    L_0x0042:
        r3 = z;
        r5 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r3 = r3[r5];
        r4.setType(r3);
        r3 = z;
        r5 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r3 = r3[r5];
        r0 = r16;
        r0.append(r3);
        if (r14 == 0) goto L_0x008e;
    L_0x0058:
        if (r2 == 0) goto L_0x013b;
    L_0x005a:
        r3 = z;
        r5 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r3 = r3[r5];
    L_0x0060:
        r4.setType(r3);
        r3 = 1;
        r4.setFlags(r3);
        r3 = android.os.Build.VERSION.SDK_INT;
        r5 = 23;
        if (r3 >= r5) goto L_0x0143;
    L_0x006d:
        r3 = android.net.Uri.fromFile(r25);
    L_0x0071:
        if (r2 == 0) goto L_0x007a;
    L_0x0073:
        r0 = r22;
        r0.add(r3);
        if (r14 == 0) goto L_0x0083;
    L_0x007a:
        r5 = z;
        r6 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r5 = r5[r6];
        r4.putExtra(r5, r3);
    L_0x0083:
        if (r14 == 0) goto L_0x008e;
    L_0x0085:
        r3 = z;
        r5 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r3 = r3[r5];
        r4.setType(r3);
    L_0x008e:
        r3 = z;
        r5 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r3 = r3[r5];
        r5 = 1;
        r5 = new java.lang.String[r5];
        r6 = 0;
        r7 = z;
        r8 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r7 = r7[r8];
        r5[r6] = r7;
        r4.putExtra(r3, r5);
        r3 = z;
        r5 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r3 = r3[r5];
        r4.putExtra(r3, r15);
        r3 = z;
        r5 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r3 = r3[r5];
        r5 = r16.toString();
        r4.putExtra(r3, r5);
        if (r2 == 0) goto L_0x011e;
    L_0x00bb:
        r2 = z;
        r3 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r2 = r2[r3];
        r0 = r22;
        r4.putParcelableArrayListExtra(r2, r0);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 16;
        if (r2 < r3) goto L_0x011e;
    L_0x00cc:
        r3 = new java.util.ArrayList;
        r0 = r22;
        r3.<init>(r0);
        r5 = new android.content.ClipData;
        r2 = 2;
        r6 = new java.lang.String[r2];
        r2 = 0;
        r7 = z;
        r8 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r7 = r7[r8];
        r6[r2] = r7;
        r2 = 1;
        r7 = z;
        r8 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r7 = r7[r8];
        r6[r2] = r7;
        r7 = new android.content.ClipData$Item;
        r2 = 0;
        r2 = r3.get(r2);
        r2 = (android.net.Uri) r2;
        r7.<init>(r2);
        r5.<init>(r15, r6, r7);
        r2 = 0;
        r3.remove(r2);
        r3 = r3.iterator();
    L_0x0101:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x0117;
    L_0x0107:
        r2 = r3.next();
        r2 = (android.net.Uri) r2;
        r6 = new android.content.ClipData$Item;
        r6.<init>(r2);
        r5.addItem(r6);
        if (r14 == 0) goto L_0x0101;
    L_0x0117:
        r4.setClipData(r5);
        r2 = 1;
        r4.setFlags(r2);
    L_0x011e:
        r2 = 2131230962; // 0x7f0800f2 float:1.8077992E38 double:1.0529680017E-314;
        r0 = r18;
        r2 = r0.getString(r2);
        r0 = r18;
        r1 = r19;
        r2 = a(r4, r0, r1, r2);
        return r2;
    L_0x0130:
        r2 = 0;
        goto L_0x0031;
    L_0x0133:
        r3 = z;
        r5 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r3 = r3[r5];
        goto L_0x003b;
    L_0x013b:
        r3 = z;
        r5 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r3 = r3[r5];
        goto L_0x0060;
    L_0x0143:
        r3 = z;
        r5 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r3 = r3[r5];
        r0 = r18;
        r1 = r25;
        r3 = android.support.v4.content.FileProvider.getUriForFile(r0, r3, r1);
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asx.a(android.app.Activity, com.whatsapp.by, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String, java.io.File, long, long, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r10, java.lang.String r11) {
        /*
        r3 = 1;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.length();
        if (r0 != 0) goto L_0x000f;
    L_0x000a:
        r0 = r10.length();
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = r10.length();
        if (r0 != 0) goto L_0x001a;
    L_0x0015:
        r0 = r11.length();
        goto L_0x000e;
    L_0x001a:
        r0 = r10.length();
        r0 = r0 + 1;
        r1 = r11.length();
        r1 = r1 + 1;
        r0 = new int[]{r0, r1};
        r1 = java.lang.Integer.TYPE;
        r0 = java.lang.reflect.Array.newInstance(r1, r0);
        r0 = (int[][]) r0;
        r1 = r2;
    L_0x0033:
        r5 = r10.length();
        if (r1 > r5) goto L_0x0041;
    L_0x0039:
        r5 = r0[r1];
        r5[r2] = r1;
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0033;
    L_0x0041:
        r1 = r2;
    L_0x0042:
        r5 = r11.length();
        if (r1 > r5) goto L_0x0050;
    L_0x0048:
        r5 = r0[r2];
        r5[r1] = r1;
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0042;
    L_0x0050:
        r1 = r3;
    L_0x0051:
        r2 = r11.length();
        if (r1 > r2) goto L_0x00a8;
    L_0x0057:
        r2 = r3;
    L_0x0058:
        r5 = r10.length();
        if (r2 > r5) goto L_0x00a4;
    L_0x005e:
        r5 = r2 + -1;
        r5 = r10.charAt(r5);
        r6 = r1 + -1;
        r6 = r11.charAt(r6);
        if (r5 != r6) goto L_0x007a;
    L_0x006c:
        r5 = r0[r2];
        r6 = r2 + -1;
        r6 = r0[r6];
        r7 = r1 + -1;
        r6 = r6[r7];
        r5[r1] = r6;
        if (r4 == 0) goto L_0x00a0;
    L_0x007a:
        r5 = r0[r2];
        r6 = r2 + -1;
        r6 = r0[r6];
        r7 = r1 + -1;
        r6 = r6[r7];
        r6 = r6 + 1;
        r7 = r2 + -1;
        r7 = r0[r7];
        r7 = r7[r1];
        r7 = r7 + 1;
        r8 = r0[r2];
        r9 = r1 + -1;
        r8 = r8[r9];
        r8 = r8 + 1;
        r7 = java.lang.Math.min(r7, r8);
        r6 = java.lang.Math.min(r6, r7);
        r5[r1] = r6;
    L_0x00a0:
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0058;
    L_0x00a4:
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0051;
    L_0x00a8:
        r1 = r10.length();
        r0 = r0[r1];
        r1 = r11.length();
        r0 = r0[r1];
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asx.a(java.lang.String, java.lang.String):int");
    }

    public static Map d() {
        return new HashMap();
    }

    private static void a(String str, Object obj, Object obj2) {
        if (obj2 instanceof JSONObject) {
            try {
                ((JSONObject) obj2).put(str, obj);
            } catch (JSONException e) {
                Log.e(z[130] + e.toString());
            }
            try {
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (JSONException e2) {
                throw e2;
            }
        }
        if (obj2 instanceof StringBuilder) {
            ((StringBuilder) obj2).append(str).append(z[129]).append(obj).append('\n');
        }
    }

    private static String a(int i) {
        switch (i) {
            case at.g /*1*/:
                return z[144];
            case at.i /*2*/:
                return z[131];
            case at.o /*3*/:
                return z[143];
            case at.p /*4*/:
                return z[132];
            case at.m /*5*/:
                return z[142];
            case Y.f /*6*/:
                return z[140];
            case aF.v /*7*/:
                return z[135];
            case aF.u /*8*/:
                return z[146];
            case Y.l /*9*/:
                return z[145];
            case Y.t /*10*/:
                return z[134];
            case Y.j /*11*/:
                return z[141];
            case Y.p /*12*/:
                return z[137];
            case Y.q /*13*/:
                return z[133];
            case arj.Toolbar_titleMarginEnd /*14*/:
                return z[138];
            case arj.Toolbar_titleMarginTop /*15*/:
                return z[136];
            default:
                return z[139];
        }
    }

    public static boolean a(DialogToastActivity dialogToastActivity, String str, String str2, ArrayList arrayList, String str3, String str4, File file, long j, long j2, String str5, boolean z) {
        return a(dialogToastActivity, dialogToastActivity, str, str2, arrayList, str3, str4, file, j, j2, str5, z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.net.ConnectivityManager r4) {
        /*
        r0 = r4.getActiveNetworkInfo();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        if (r0 == 0) goto L_0x0031;
    L_0x000b:
        r2 = r0.getTypeName();
        a(r1, r2);
        r0 = r0.getSubtypeName();
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x002d;
    L_0x001c:
        r2 = z;
        r3 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r2 = r2[r3];
        r1.append(r2);
        a(r1, r0);
        r0 = 41;
        r1.append(r0);
    L_0x002d:
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x003a;
    L_0x0031:
        r0 = z;
        r2 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r0 = r0[r2];
        r1.append(r0);
    L_0x003a:
        r0 = r1.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asx.a(android.net.ConnectivityManager):java.lang.String");
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(str.length() * 2);
        a(stringBuilder, str);
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18, long r20, java.lang.String r22, boolean r23) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        if (r15 == 0) goto L_0x000a;
    L_0x0007:
        r0.append(r15);
    L_0x000a:
        if (r23 == 0) goto L_0x0025;
    L_0x000c:
        r5 = 0;
        r11 = 0;
        r1 = r13;
        r2 = r14;
        r3 = r16;
        r4 = r17;
        r6 = r18;
        r8 = r20;
        r10 = r22;
        r1 = a(r1, r2, r3, r4, r5, r6, r8, r10, r11);
        r0.append(r1);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x003d;
    L_0x0025:
        r5 = 0;
        r11 = d();
        r1 = r13;
        r2 = r14;
        r3 = r16;
        r4 = r17;
        r6 = r18;
        r8 = r20;
        r10 = r22;
        r1 = a(r1, r2, r3, r4, r5, r6, r8, r10, r11);
        r0.append(r1);
    L_0x003d:
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asx.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, boolean):java.lang.String");
    }

    public static java.lang.String b() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.asx.b():java.lang.String. bs: [B:6:0x002b, B:22:0x005a]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r0 = z;
        r1 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r0 = r0[r1];
        r0 = z;
        r1 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r0 = r0[r1];
        r2 = 0;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r1 = new java.io.BufferedReader;	 Catch:{ all -> 0x0056 }
        r0 = new java.io.FileReader;	 Catch:{ all -> 0x0056 }
        r4 = z;	 Catch:{ all -> 0x0056 }
        r5 = 219; // 0xdb float:3.07E-43 double:1.08E-321;	 Catch:{ all -> 0x0056 }
        r4 = r4[r5];	 Catch:{ all -> 0x0056 }
        r0.<init>(r4);	 Catch:{ all -> 0x0056 }
        r1.<init>(r0);	 Catch:{ all -> 0x0056 }
        r0 = r1.readLine();	 Catch:{ all -> 0x0089 }
        r3.append(r0);	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x002e;
    L_0x002b:
        r1.close();	 Catch:{ IOException -> 0x005e }
    L_0x002e:
        r2 = r1;
    L_0x002f:
        r1 = new java.io.BufferedReader;	 Catch:{ all -> 0x006f }
        r0 = new java.io.FileReader;	 Catch:{ all -> 0x006f }
        r4 = z;	 Catch:{ all -> 0x006f }
        r5 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;	 Catch:{ all -> 0x006f }
        r4 = r4[r5];	 Catch:{ all -> 0x006f }
        r0.<init>(r4);	 Catch:{ all -> 0x006f }
        r1.<init>(r0);	 Catch:{ all -> 0x006f }
        r0 = 32;
        r0 = r3.append(r0);	 Catch:{ all -> 0x0087 }
        r2 = r1.readLine();	 Catch:{ all -> 0x0087 }
        r0.append(r2);	 Catch:{ all -> 0x0087 }
        if (r1 == 0) goto L_0x0051;
    L_0x004e:
        r1.close();	 Catch:{ IOException -> 0x0077 }
    L_0x0051:
        r0 = r3.toString();
        return r0;
    L_0x0056:
        r0 = move-exception;
        r1 = r2;
    L_0x0058:
        if (r1 == 0) goto L_0x005d;
    L_0x005a:
        r1.close();	 Catch:{ IOException -> 0x006d }
    L_0x005d:
        throw r0;	 Catch:{ IOException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        r2 = z;
        r4 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r2 = r2[r4];
        r3.append(r2);
        com.whatsapp.util.Log.a(r0);
        r2 = r1;
        goto L_0x002f;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x005e }
    L_0x006f:
        r0 = move-exception;
        r1 = r2;
    L_0x0071:
        if (r1 == 0) goto L_0x0076;
    L_0x0073:
        r1.close();	 Catch:{ IOException -> 0x0085 }
    L_0x0076:
        throw r0;	 Catch:{ IOException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        r1 = z;
        r2 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r1 = r1[r2];
        r3.append(r1);
        com.whatsapp.util.Log.a(r0);
        goto L_0x0051;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0077 }
    L_0x0087:
        r0 = move-exception;
        goto L_0x0071;
    L_0x0089:
        r0 = move-exception;
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asx.b():java.lang.String");
    }

    private static String b(int i) {
        switch (i) {
            case v.m /*0*/:
                return z[222];
            case at.g /*1*/:
                return z[224];
            case at.i /*2*/:
                return z[220];
            case at.o /*3*/:
                return z[223];
            default:
                return z[221];
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27, long r28, long r30, java.lang.String r32, java.util.Map r33) {
        /*
        r16 = com.whatsapp.DialogToastActivity.f;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r17 = new java.text.SimpleDateFormat;	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 52;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = java.util.Locale.US;	 Catch:{ Exception -> 0x08bc }
        r0 = r17;
        r0.<init>(r2, r3);	 Catch:{ Exception -> 0x08bc }
        r2 = r23.getResources();	 Catch:{ Exception -> 0x08bc }
        r2 = r2.getConfiguration();	 Catch:{ Exception -> 0x08bc }
        r0 = r2.locale;	 Catch:{ Exception -> 0x08bc }
        r18 = r0;
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = 0;
        r0 = r23;
        r19 = r0.getSharedPreferences(r2, r3);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 95;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = "";
        r0 = r19;
        r20 = r0.getString(r2, r3);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = "";
        r0 = r19;
        r21 = r0.getString(r2, r3);	 Catch:{ Exception -> 0x08bc }
        r2 = com.whatsapp.App.ay;	 Catch:{ Exception -> 0x08b8 }
        if (r2 == 0) goto L_0x08d3;
    L_0x0051:
        r2 = com.whatsapp.App.ay;	 Catch:{ Exception -> 0x08b8 }
        r2 = r2.jabber_id;	 Catch:{ Exception -> 0x08b8 }
        if (r2 == 0) goto L_0x08d3;
    L_0x0057:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08ba }
        r2.<init>();	 Catch:{ Exception -> 0x08ba }
        r3 = "+";
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08ba }
        r3 = com.whatsapp.App.ay;	 Catch:{ Exception -> 0x08ba }
        r3 = r3.jabber_id;	 Catch:{ Exception -> 0x08ba }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08ba }
        r2 = r2.toString();	 Catch:{ Exception -> 0x08ba }
    L_0x006f:
        r3 = com.whatsapp.ChangeNumber.g();	 Catch:{ Exception -> 0x08bc }
        if (r3 == 0) goto L_0x09de;
    L_0x0075:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r3.<init>();	 Catch:{ Exception -> 0x08bc }
        r4 = z;	 Catch:{ Exception -> 0x08bc }
        r5 = 84;
        r4 = r4[r5];	 Catch:{ Exception -> 0x08bc }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x08bc }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x08bc }
        r2 = r2.toString();	 Catch:{ Exception -> 0x08bc }
        r3 = com.whatsapp.App.ag();	 Catch:{ Exception -> 0x08bc }
        if (r3 == 0) goto L_0x09de;
    L_0x0092:
        r4 = r3.jabber_id;	 Catch:{ Exception -> 0x08db }
        if (r4 == 0) goto L_0x09de;
    L_0x0096:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r4.<init>();	 Catch:{ Exception -> 0x08bc }
        r2 = r4.append(r2);	 Catch:{ Exception -> 0x08bc }
        r4 = z;	 Catch:{ Exception -> 0x08bc }
        r5 = 98;
        r4 = r4[r5];	 Catch:{ Exception -> 0x08bc }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x08bc }
        r3 = r3.jabber_id;	 Catch:{ Exception -> 0x08bc }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r3 = ")";
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r2 = r2.toString();	 Catch:{ Exception -> 0x08bc }
        r15 = r2;
    L_0x00bb:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 36;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r0 = r23;
        r2 = r0.getSystemService(r2);	 Catch:{ Exception -> 0x08bc }
        r2 = (android.telephony.TelephonyManager) r2;	 Catch:{ Exception -> 0x08bc }
        if (r2 == 0) goto L_0x0109;
    L_0x00d7:
        r3 = r2.getPhoneType();	 Catch:{ Exception -> 0x08bc }
        r7 = b(r3);	 Catch:{ Exception -> 0x08bc }
        r3 = r2.getNetworkType();	 Catch:{ Exception -> 0x08bc }
        r5 = a(r3);	 Catch:{ Exception -> 0x08bc }
        r3 = r2.getNetworkOperator();	 Catch:{ Exception -> 0x08bc }
        r4 = z;	 Catch:{ Exception -> 0x08bc }
        r8 = 58;
        r4 = r4[r8];	 Catch:{ Exception -> 0x08bc }
        r4 = com.whatsapp.util.a_.a(r3, r4);	 Catch:{ Exception -> 0x08bc }
        r3 = r2.getSimOperator();	 Catch:{ Exception -> 0x08bc }
        r8 = z;	 Catch:{ Exception -> 0x08bc }
        r9 = 44;
        r8 = r8[r9];	 Catch:{ Exception -> 0x08bc }
        r3 = com.whatsapp.util.a_.a(r3, r8);	 Catch:{ Exception -> 0x08bc }
        r2 = r2.getNetworkOperatorName();	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09d7;
    L_0x0109:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 30;
        r7 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 45;
        r5 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 77;
        r4 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r3 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r8 = 68;
        r2 = r2[r8];	 Catch:{ Exception -> 0x08bc }
        r10 = r2;
        r11 = r3;
        r12 = r4;
        r13 = r5;
        r14 = r7;
    L_0x012c:
        r2 = com.whatsapp.App.B;	 Catch:{ Exception -> 0x08bc }
        if (r2 == 0) goto L_0x0137;
    L_0x0130:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09d4;
    L_0x0137:
        r2 = com.whatsapp.App.aI;	 Catch:{ Exception -> 0x08dd }
        if (r2 == 0) goto L_0x0143;
    L_0x013b:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 71;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09d4;
    L_0x0143:
        r2 = com.whatsapp.App.aI();	 Catch:{ Exception -> 0x08df }
        if (r2 == 0) goto L_0x0151;
    L_0x0149:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 65;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09d4;
    L_0x0151:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 55;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r9 = r2;
    L_0x0158:
        r2 = -1;
        r2 = (r30 > r2 ? 1 : (r30 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0166;
    L_0x015e:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 34;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09d1;
    L_0x0166:
        r2 = java.lang.Long.toString(r30);	 Catch:{ Exception -> 0x08bc }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r3.<init>();	 Catch:{ Exception -> 0x08bc }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r4 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r3 = r3[r4];	 Catch:{ Exception -> 0x08bc }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r3 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x08bc }
        r0 = r30;
        r3 = android.text.format.Formatter.formatFileSize(r3, r0);	 Catch:{ Exception -> 0x08bc }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r3 = ")";
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r2 = r2.toString();	 Catch:{ Exception -> 0x08bc }
        r8 = r2;
    L_0x0197:
        r2 = -1;
        r2 = (r28 > r2 ? 1 : (r28 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x01a5;
    L_0x019d:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 82;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09cd;
    L_0x01a5:
        r2 = -2;
        r2 = (r28 > r2 ? 1 : (r28 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x01c3;
    L_0x01ab:
        r2 = z;	 Catch:{ Exception -> 0x08e1 }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08e1 }
        r0 = r32;
        r2 = r2.equals(r0);	 Catch:{ Exception -> 0x08e1 }
        if (r2 == 0) goto L_0x01c1;
    L_0x01b9:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09cd;
    L_0x01c1:
        if (r16 == 0) goto L_0x0218;
    L_0x01c3:
        r2 = java.lang.Long.toString(r28);	 Catch:{ Exception -> 0x08bc }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r3.<init>();	 Catch:{ Exception -> 0x08bc }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ Exception -> 0x08bc }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r3 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x08bc }
        r0 = r28;
        r3 = android.text.format.Formatter.formatFileSize(r3, r0);	 Catch:{ Exception -> 0x08bc }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r3 = ")";
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r2 = r2.toString();	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r4 = 93;
        r3 = r3[r4];	 Catch:{ Exception -> 0x08bc }
        r0 = r32;
        r3 = r3.equals(r0);	 Catch:{ Exception -> 0x08bc }
        if (r3 == 0) goto L_0x09cd;
    L_0x0201:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r3.<init>();	 Catch:{ Exception -> 0x08bc }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r4 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r3 = r3[r4];	 Catch:{ Exception -> 0x08bc }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x08bc }
        r32 = r2.toString();	 Catch:{ Exception -> 0x08bc }
    L_0x0218:
        r0 = r23;
        r2 = r0 instanceof com.whatsapp.SearchFAQ;	 Catch:{ Exception -> 0x08bc }
        if (r2 == 0) goto L_0x023a;
    L_0x021e:
        r0 = r23;
        r0 = (com.whatsapp.SearchFAQ) r0;	 Catch:{ Exception -> 0x08bc }
        r2 = r0;
        r2 = r2.b();	 Catch:{ Exception -> 0x08bc }
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x08bc }
        r0 = r23;
        r0 = (com.whatsapp.SearchFAQ) r0;	 Catch:{ Exception -> 0x08bc }
        r2 = r0;
        r2 = r2.a();	 Catch:{ Exception -> 0x08bc }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09c9;
    L_0x023a:
        r0 = r23;
        r2 = r0 instanceof com.whatsapp.DescribeProblemActivity;	 Catch:{ Exception -> 0x08e3 }
        if (r2 == 0) goto L_0x024c;
    L_0x0240:
        r2 = 0;
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x08bc }
        r2 = -1;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x09c9;
    L_0x024c:
        r2 = -1;
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x08bc }
        r2 = -1;
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x08bc }
        r7 = r3;
        r3 = r2;
    L_0x0258:
        if (r27 != 0) goto L_0x026b;
    L_0x025a:
        r2 = z;	 Catch:{ Exception -> 0x08e5 }
        r4 = 2;
        r2 = r2[r4];	 Catch:{ Exception -> 0x08e5 }
        r6.append(r2);	 Catch:{ Exception -> 0x08e5 }
        r2 = z;	 Catch:{ Exception -> 0x08e5 }
        r4 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r2 = r2[r4];	 Catch:{ Exception -> 0x08e5 }
        r6.append(r2);	 Catch:{ Exception -> 0x08e5 }
    L_0x026b:
        r5 = new org.json.JSONObject;	 Catch:{ Exception -> 0x08bc }
        r5.<init>();	 Catch:{ Exception -> 0x08bc }
        if (r27 == 0) goto L_0x08e7;
    L_0x0272:
        r4 = r5;
    L_0x0273:
        r2 = z;	 Catch:{ Exception -> 0x08ea }
        r22 = 78;
        r2 = r2[r22];	 Catch:{ Exception -> 0x08ea }
        a(r2, r15, r4);	 Catch:{ Exception -> 0x08ea }
        r2 = z;	 Catch:{ Exception -> 0x08ea }
        r15 = 69;
        r2 = r2[r15];	 Catch:{ Exception -> 0x08ea }
        r15 = z;	 Catch:{ Exception -> 0x08ea }
        r22 = 51;
        r15 = r15[r22];	 Catch:{ Exception -> 0x08ea }
        a(r2, r15, r4);	 Catch:{ Exception -> 0x08ea }
        r2 = z;	 Catch:{ Exception -> 0x08ea }
        r15 = 62;
        r2 = r2[r15];	 Catch:{ Exception -> 0x08ea }
        r15 = z;	 Catch:{ Exception -> 0x08ea }
        r22 = 16;
        r15 = r15[r22];	 Catch:{ Exception -> 0x08ea }
        a(r2, r15, r4);	 Catch:{ Exception -> 0x08ea }
        r2 = z;	 Catch:{ Exception -> 0x08ea }
        r15 = 85;
        r15 = r2[r15];	 Catch:{ Exception -> 0x08ea }
        if (r18 == 0) goto L_0x08ec;
    L_0x02a2:
        r2 = r18.getCountry();	 Catch:{ Exception -> 0x08ea }
    L_0x02a6:
        a(r15, r2, r4);	 Catch:{ Exception -> 0x08f4 }
        r2 = z;	 Catch:{ Exception -> 0x08f4 }
        r15 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r15 = r2[r15];	 Catch:{ Exception -> 0x08f4 }
        if (r18 == 0) goto L_0x08f6;
    L_0x02b1:
        r2 = r18.getLanguage();	 Catch:{ Exception -> 0x08f4 }
    L_0x02b5:
        a(r15, r2, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r15 = 72;
        r2 = r2[r15];	 Catch:{ Exception -> 0x08fe }
        r0 = r24;
        a(r2, r0, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r15 = 50;
        r2 = r2[r15];	 Catch:{ Exception -> 0x08fe }
        a(r2, r10, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r10 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r2 = r2[r10];	 Catch:{ Exception -> 0x08fe }
        r10 = android.os.Build.MANUFACTURER;	 Catch:{ Exception -> 0x08fe }
        a(r2, r10, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r10 = 23;
        r2 = r2[r10];	 Catch:{ Exception -> 0x08fe }
        r10 = android.os.Build.MODEL;	 Catch:{ Exception -> 0x08fe }
        a(r2, r10, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r10 = 64;
        r2 = r2[r10];	 Catch:{ Exception -> 0x08fe }
        r10 = android.os.Build.VERSION.RELEASE;	 Catch:{ Exception -> 0x08fe }
        a(r2, r10, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r10 = 56;
        r2 = r2[r10];	 Catch:{ Exception -> 0x08fe }
        a(r2, r9, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r9 = 75;
        r2 = r2[r9];	 Catch:{ Exception -> 0x08fe }
        a(r2, r12, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r9 = 99;
        r2 = r2[r9];	 Catch:{ Exception -> 0x08fe }
        a(r2, r11, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r9 = 63;
        r2 = r2[r9];	 Catch:{ Exception -> 0x08fe }
        a(r2, r8, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r8 = 90;
        r2 = r2[r8];	 Catch:{ Exception -> 0x08fe }
        r0 = r32;
        a(r2, r0, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = r7.intValue();	 Catch:{ Exception -> 0x08fe }
        r8 = -1;
        if (r2 == r8) goto L_0x034b;
    L_0x0323:
        r2 = z;	 Catch:{ Exception -> 0x08fe }
        r8 = 60;
        r2 = r2[r8];	 Catch:{ Exception -> 0x08fe }
        a(r2, r7, r4);	 Catch:{ Exception -> 0x08fe }
        r2 = r7.intValue();	 Catch:{ Exception -> 0x08fe }
        if (r2 != 0) goto L_0x0342;
    L_0x0332:
        r2 = z;	 Catch:{ Exception -> 0x0900 }
        r7 = 6;
        r2 = r2[r7];	 Catch:{ Exception -> 0x0900 }
        r7 = z;	 Catch:{ Exception -> 0x0900 }
        r8 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r7 = r7[r8];	 Catch:{ Exception -> 0x0900 }
        a(r2, r7, r4);	 Catch:{ Exception -> 0x0900 }
        if (r16 == 0) goto L_0x034b;
    L_0x0342:
        r2 = z;	 Catch:{ Exception -> 0x0902 }
        r7 = 57;
        r2 = r2[r7];	 Catch:{ Exception -> 0x0902 }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x0902 }
    L_0x034b:
        r2 = com.whatsapp.wn.a();	 Catch:{ Exception -> 0x0904 }
        if (r2 == 0) goto L_0x0362;
    L_0x0351:
        r2 = z;	 Catch:{ Exception -> 0x0904 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0904 }
        r3 = z;	 Catch:{ Exception -> 0x0904 }
        r7 = 12;
        r3 = r3[r7];	 Catch:{ Exception -> 0x0904 }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x0904 }
        if (r16 == 0) goto L_0x0377;
    L_0x0362:
        r2 = com.whatsapp.wn.i();	 Catch:{ Exception -> 0x0906 }
        if (r2 == 0) goto L_0x0377;
    L_0x0368:
        r2 = z;	 Catch:{ Exception -> 0x0908 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0908 }
        r3 = z;	 Catch:{ Exception -> 0x0908 }
        r7 = 28;
        r3 = r3[r7];	 Catch:{ Exception -> 0x0908 }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x0908 }
    L_0x0377:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r3.<init>();	 Catch:{ Exception -> 0x08bc }
        r0 = r20;
        r3 = r3.append(r0);	 Catch:{ Exception -> 0x08bc }
        r7 = " ";
        r3 = r3.append(r7);	 Catch:{ Exception -> 0x08bc }
        r0 = r21;
        r3 = r3.append(r0);	 Catch:{ Exception -> 0x08bc }
        r3 = r3.toString();	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 97;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r7 = 5;
        r3 = r3[r7];	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r7 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r3 = r3[r7];	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = android.os.Build.PRODUCT;	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 66;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = android.os.Build.DEVICE;	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 67;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = android.os.Build.DISPLAY;	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 87;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = b();	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 70;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r0 = r23;
        r2 = r0.getSystemService(r2);	 Catch:{ Exception -> 0x08bc }
        r2 = (android.net.ConnectivityManager) r2;	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x090a }
        r7 = 79;
        r3 = r3[r7];	 Catch:{ Exception -> 0x090a }
        r7 = a(r2);	 Catch:{ Exception -> 0x090a }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x090a }
        if (r25 == 0) goto L_0x040f;
    L_0x0404:
        r3 = z;	 Catch:{ Exception -> 0x090a }
        r7 = 54;
        r3 = r3[r7];	 Catch:{ Exception -> 0x090a }
        r0 = r25;
        a(r3, r0, r4);	 Catch:{ Exception -> 0x090a }
    L_0x040f:
        r3 = z;	 Catch:{ Exception -> 0x090c }
        r7 = 83;
        r3 = r3[r7];	 Catch:{ Exception -> 0x090c }
        r7 = new java.util.Date;	 Catch:{ Exception -> 0x090c }
        r7.<init>();	 Catch:{ Exception -> 0x090c }
        r0 = r17;
        r7 = r0.format(r7);	 Catch:{ Exception -> 0x090c }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x090c }
        r3 = z;	 Catch:{ Exception -> 0x090c }
        r7 = 39;
        r3 = r3[r7];	 Catch:{ Exception -> 0x090c }
        r7 = a(r14);	 Catch:{ Exception -> 0x090c }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x090c }
        r3 = z;	 Catch:{ Exception -> 0x090c }
        r7 = 89;
        r3 = r3[r7];	 Catch:{ Exception -> 0x090c }
        r7 = a(r13);	 Catch:{ Exception -> 0x090c }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x090c }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x090c }
        r7 = 23;
        if (r3 < r7) goto L_0x0450;
    L_0x0443:
        r3 = z;	 Catch:{ Exception -> 0x090c }
        r7 = 86;
        r3 = r3[r7];	 Catch:{ Exception -> 0x090c }
        r7 = a(r23);	 Catch:{ Exception -> 0x090c }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x090c }
    L_0x0450:
        r3 = a();	 Catch:{ Exception -> 0x08bc }
        r7 = android.text.TextUtils.isEmpty(r3);	 Catch:{ Exception -> 0x090e }
        if (r7 != 0) goto L_0x0463;
    L_0x045a:
        r7 = z;	 Catch:{ Exception -> 0x090e }
        r8 = 96;
        r7 = r7[r8];	 Catch:{ Exception -> 0x090e }
        a(r7, r3, r4);	 Catch:{ Exception -> 0x090e }
    L_0x0463:
        r3 = com.whatsapp.App.ay;	 Catch:{ Exception -> 0x08bc }
        if (r3 != 0) goto L_0x0549;
    L_0x0467:
        r7 = com.whatsapp.VerifyNumber.j();	 Catch:{ Exception -> 0x08bc }
        r3 = com.whatsapp.App.W;	 Catch:{ Exception -> 0x0910 }
        if (r3 == 0) goto L_0x0912;
    L_0x046f:
        r3 = com.whatsapp.App.W;	 Catch:{ Exception -> 0x0910 }
        r3 = r3.getSimState();	 Catch:{ Exception -> 0x0910 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x0910 }
    L_0x0479:
        r8 = z;	 Catch:{ Exception -> 0x0915 }
        r9 = 21;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0915 }
        r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0915 }
        r9.<init>();	 Catch:{ Exception -> 0x0915 }
        r9 = r9.append(r7);	 Catch:{ Exception -> 0x0915 }
        r10 = " ";
        r9 = r9.append(r10);	 Catch:{ Exception -> 0x0915 }
        if (r3 != 0) goto L_0x0494;
    L_0x0491:
        r3 = "";
    L_0x0494:
        r3 = r9.append(r3);	 Catch:{ Exception -> 0x08bc }
        r3 = r3.toString();	 Catch:{ Exception -> 0x08bc }
        a(r8, r3, r4);	 Catch:{ Exception -> 0x08bc }
        if (r7 == 0) goto L_0x0549;
    L_0x04a1:
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r8 = 46;
        r3 = r3[r8];	 Catch:{ Exception -> 0x08bc }
        r8 = "";
        r8 = r7.replaceAll(r3, r8);	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r7 = 4;
        r3 = r3[r7];	 Catch:{ Exception -> 0x08bc }
        r0 = r21;
        r7 = a(r0, r8);	 Catch:{ Exception -> 0x08bc }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x08bc }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x08bc }
        r3 = 1;
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x08bc }
        r7 = 6;
        r0 = r21;
        r9 = com.whatsapp.RegisterPhone.a(r0, r8, r7);	 Catch:{ Exception -> 0x08bc }
        if (r9 == 0) goto L_0x04d1;
    L_0x04ce:
        r7 = 1;
        if (r9 != r7) goto L_0x0549;
    L_0x04d1:
        r0 = r21;
        r1 = r20;
        r7 = com.whatsapp.RegisterPhone.a(r0, r1, r8);	 Catch:{ Exception -> 0x08bc }
        r10 = z;	 Catch:{ Exception -> 0x0917 }
        r11 = 18;
        r10 = r10[r11];	 Catch:{ Exception -> 0x0917 }
        if (r7 != 0) goto L_0x0919;
    L_0x04e1:
        r7 = z;	 Catch:{ Exception -> 0x0917 }
        r11 = 42;
        r7 = r7[r11];	 Catch:{ Exception -> 0x0917 }
    L_0x04e7:
        a(r10, r7, r4);	 Catch:{ Exception -> 0x08bc }
        if (r9 != 0) goto L_0x0538;
    L_0x04ec:
        r0 = r20;
        r7 = com.whatsapp.aak.a(r0, r8);	 Catch:{ Exception -> 0x08bc }
        r9 = com.whatsapp.aak.a(r20, r21);	 Catch:{ Exception -> 0x08bc }
        r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r10.<init>();	 Catch:{ Exception -> 0x08bc }
        r0 = r20;
        r10 = r10.append(r0);	 Catch:{ Exception -> 0x08bc }
        r10 = r10.append(r9);	 Catch:{ Exception -> 0x08bc }
        r10 = r10.toString();	 Catch:{ Exception -> 0x08bc }
        r9 = r7.equals(r9);	 Catch:{ Exception -> 0x0921 }
        if (r9 != 0) goto L_0x051f;
    L_0x050f:
        r9 = r7.equals(r10);	 Catch:{ Exception -> 0x0921 }
        if (r9 != 0) goto L_0x051f;
    L_0x0515:
        r0 = r21;
        r1 = r20;
        r8 = com.whatsapp.aak.a(r8, r0, r7, r1);	 Catch:{ Exception -> 0x0923 }
        if (r8 == 0) goto L_0x0526;
    L_0x051f:
        r3 = 0;
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x0538;
    L_0x0526:
        r0 = r21;
        r8 = r0.endsWith(r7);	 Catch:{ Exception -> 0x0925 }
        if (r8 == 0) goto L_0x0538;
    L_0x052e:
        r0 = r20;
        r7 = com.whatsapp.EnterPhoneNumber.a(r0, r7);	 Catch:{ Exception -> 0x0927 }
        r8 = 5;
        if (r7 != r8) goto L_0x0538;
    L_0x0537:
        r3 = 0;
    L_0x0538:
        r7 = z;	 Catch:{ Exception -> 0x0929 }
        r8 = 88;
        r7 = r7[r8];	 Catch:{ Exception -> 0x0929 }
        if (r3 != 0) goto L_0x092b;
    L_0x0540:
        r3 = z;	 Catch:{ Exception -> 0x0929 }
        r8 = 19;
        r3 = r3[r8];	 Catch:{ Exception -> 0x0929 }
    L_0x0546:
        a(r7, r3, r4);	 Catch:{ Exception -> 0x08bc }
    L_0x0549:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x08bc }
        r7 = 21;
        if (r3 < r7) goto L_0x05ef;
    L_0x054f:
        r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r9.<init>();	 Catch:{ Exception -> 0x08bc }
        r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x08bc }
        r10.<init>();	 Catch:{ Exception -> 0x08bc }
        r7 = 0;
        r11 = r2.getAllNetworks();	 Catch:{ Exception -> 0x08bc }
        r12 = r11.length;	 Catch:{ Exception -> 0x08bc }
        r3 = 0;
        r8 = r7;
        r7 = r3;
    L_0x0562:
        if (r7 >= r12) goto L_0x05d5;
    L_0x0564:
        r13 = r11[r7];	 Catch:{ Exception -> 0x08bc }
        if (r8 == 0) goto L_0x0572;
    L_0x0568:
        r3 = 59;
        r9.append(r3);	 Catch:{ Exception -> 0x0931 }
        r3 = 59;
        r10.append(r3);	 Catch:{ Exception -> 0x0931 }
    L_0x0572:
        r14 = r2.getNetworkCapabilities(r13);	 Catch:{ Exception -> 0x08bc }
        if (r14 == 0) goto L_0x05cf;
    L_0x0578:
        r3 = z;	 Catch:{ Exception -> 0x0933 }
        r15 = 27;
        r15 = r3[r15];	 Catch:{ Exception -> 0x0933 }
        r3 = 2;
        r0 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x0933 }
        r17 = r0;
        r3 = 0;
        r18 = r13.toString();	 Catch:{ Exception -> 0x0933 }
        r17[r3] = r18;	 Catch:{ Exception -> 0x0933 }
        r18 = 1;
        r3 = 11;
        r3 = r14.hasCapability(r3);	 Catch:{ Exception -> 0x0933 }
        if (r3 != 0) goto L_0x0937;
    L_0x0594:
        r3 = 1;
    L_0x0595:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x093a }
        r17[r18] = r3;	 Catch:{ Exception -> 0x093a }
        r0 = r17;
        r3 = java.lang.String.format(r15, r0);	 Catch:{ Exception -> 0x093a }
        r9.append(r3);	 Catch:{ Exception -> 0x093a }
        r3 = z;	 Catch:{ Exception -> 0x093a }
        r15 = 59;
        r15 = r3[r15];	 Catch:{ Exception -> 0x093a }
        r3 = 2;
        r0 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x093a }
        r17 = r0;
        r3 = 0;
        r13 = r13.toString();	 Catch:{ Exception -> 0x093a }
        r17[r3] = r13;	 Catch:{ Exception -> 0x093a }
        r13 = 1;
        r3 = 13;
        r3 = r14.hasCapability(r3);	 Catch:{ Exception -> 0x093a }
        if (r3 != 0) goto L_0x093c;
    L_0x05bf:
        r3 = 1;
    L_0x05c0:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x08bc }
        r17[r13] = r3;	 Catch:{ Exception -> 0x08bc }
        r0 = r17;
        r3 = java.lang.String.format(r15, r0);	 Catch:{ Exception -> 0x08bc }
        r10.append(r3);	 Catch:{ Exception -> 0x08bc }
    L_0x05cf:
        r8 = r8 + 1;
        r3 = r7 + 1;
        if (r16 == 0) goto L_0x09c6;
    L_0x05d5:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = r9.toString();	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = r10.toString();	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
    L_0x05ef:
        r2 = de.greenrobot.event.h.b();	 Catch:{ Exception -> 0x08bc }
        r3 = com.whatsapp.a_3.class;
        r2 = r2.b(r3);	 Catch:{ Exception -> 0x08bc }
        r2 = (com.whatsapp.a_3) r2;	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x093f }
        r7 = 24;
        r3 = r3[r7];	 Catch:{ Exception -> 0x093f }
        r2 = r2.d;	 Catch:{ Exception -> 0x093f }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ Exception -> 0x093f }
        a(r3, r2, r4);	 Catch:{ Exception -> 0x093f }
        r2 = z;	 Catch:{ Exception -> 0x093f }
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r3 = r2[r3];	 Catch:{ Exception -> 0x093f }
        r2 = com.whatsapp.App.W;	 Catch:{ Exception -> 0x093f }
        if (r2 != 0) goto L_0x0941;
    L_0x0614:
        r2 = z;	 Catch:{ Exception -> 0x093f }
        r7 = 0;
        r2 = r2[r7];	 Catch:{ Exception -> 0x093f }
    L_0x0619:
        a(r3, r2, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = com.whatsapp.nf.a;	 Catch:{ Exception -> 0x08bc }
        if (r2 == 0) goto L_0x06a0;
    L_0x0620:
        r3 = r2.callSide;	 Catch:{ Exception -> 0x094d }
        if (r3 == 0) goto L_0x0637;
    L_0x0624:
        r3 = z;	 Catch:{ Exception -> 0x094f }
        r7 = 48;
        r3 = r3[r7];	 Catch:{ Exception -> 0x094f }
        r7 = r2.callSide;	 Catch:{ Exception -> 0x094f }
        r7 = r7.intValue();	 Catch:{ Exception -> 0x094f }
        r7 = com.whatsapp.Voip.g(r7);	 Catch:{ Exception -> 0x094f }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x094f }
    L_0x0637:
        r3 = r2.callResult;	 Catch:{ Exception -> 0x0951 }
        if (r3 == 0) goto L_0x064e;
    L_0x063b:
        r3 = z;	 Catch:{ Exception -> 0x0951 }
        r7 = 9;
        r3 = r3[r7];	 Catch:{ Exception -> 0x0951 }
        r7 = r2.callResult;	 Catch:{ Exception -> 0x0951 }
        r7 = r7.intValue();	 Catch:{ Exception -> 0x0951 }
        r7 = com.whatsapp.Voip.f(r7);	 Catch:{ Exception -> 0x0951 }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x0951 }
    L_0x064e:
        r3 = r2.callSetupErrorType;	 Catch:{ Exception -> 0x0953 }
        if (r3 == 0) goto L_0x0665;
    L_0x0652:
        r3 = z;	 Catch:{ Exception -> 0x0953 }
        r7 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r3 = r3[r7];	 Catch:{ Exception -> 0x0953 }
        r7 = r2.callSetupErrorType;	 Catch:{ Exception -> 0x0953 }
        r7 = r7.intValue();	 Catch:{ Exception -> 0x0953 }
        r7 = com.whatsapp.Voip.b(r7);	 Catch:{ Exception -> 0x0953 }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x0953 }
    L_0x0665:
        r3 = r2.callTermReason;	 Catch:{ Exception -> 0x0955 }
        if (r3 == 0) goto L_0x067c;
    L_0x0669:
        r3 = z;	 Catch:{ Exception -> 0x0955 }
        r7 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r3 = r3[r7];	 Catch:{ Exception -> 0x0955 }
        r7 = r2.callTermReason;	 Catch:{ Exception -> 0x0955 }
        r7 = r7.intValue();	 Catch:{ Exception -> 0x0955 }
        r7 = com.whatsapp.Voip.a(r7);	 Catch:{ Exception -> 0x0955 }
        a(r3, r7, r4);	 Catch:{ Exception -> 0x0955 }
    L_0x067c:
        r3 = r2.callRelayBindStatus;	 Catch:{ Exception -> 0x0957 }
        if (r3 == 0) goto L_0x095b;
    L_0x0680:
        r2 = r2.callRelayBindStatus;	 Catch:{ Exception -> 0x0957 }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x0957 }
        r3 = com.whatsapp.fieldstats.h.BINDED;	 Catch:{ Exception -> 0x0957 }
        r3 = r3.getCode();	 Catch:{ Exception -> 0x0957 }
        if (r2 != r3) goto L_0x095b;
    L_0x068e:
        r2 = 1;
    L_0x068f:
        r3 = z;	 Catch:{ Exception -> 0x095e }
        r7 = 40;
        r3 = r3[r7];	 Catch:{ Exception -> 0x095e }
        if (r2 == 0) goto L_0x0960;
    L_0x0697:
        r2 = z;	 Catch:{ Exception -> 0x095e }
        r7 = 35;
        r2 = r2[r7];	 Catch:{ Exception -> 0x095e }
    L_0x069d:
        a(r3, r2, r4);	 Catch:{ Exception -> 0x08bc }
    L_0x06a0:
        if (r26 == 0) goto L_0x06ad;
    L_0x06a2:
        r2 = z;	 Catch:{ Exception -> 0x0968 }
        r3 = 37;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0968 }
        r0 = r26;
        a(r2, r0, r4);	 Catch:{ Exception -> 0x0968 }
    L_0x06ad:
        r2 = com.whatsapp._w.a;	 Catch:{ Exception -> 0x09b0 }
        r3 = com.whatsapp.akr.e();	 Catch:{ Exception -> 0x09b0 }
        r3 = r3.ordinal();	 Catch:{ Exception -> 0x09b0 }
        r2 = r2[r3];	 Catch:{ Exception -> 0x09b0 }
        switch(r2) {
            case 1: goto L_0x096a;
            case 2: goto L_0x097b;
            case 3: goto L_0x098c;
            case 4: goto L_0x099d;
            default: goto L_0x06bc;
        };
    L_0x06bc:
        if (r27 == 0) goto L_0x0884;
    L_0x06be:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 61;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        r3 = z;	 Catch:{ Exception -> 0x08bc }
        r7 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r3 = r3[r7];	 Catch:{ Exception -> 0x08bc }
        r7 = 1;
        r0 = r19;
        r3 = r0.getBoolean(r3, r7);	 Catch:{ Exception -> 0x08bc }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x08bc }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x08bc }
        r2 = com.whatsapp.a3b.a(r23);	 Catch:{ Exception -> 0x08bc }
        r2 = r2.e();	 Catch:{ Exception -> 0x08bc }
        r2 = r2.entrySet();	 Catch:{ Exception -> 0x08bc }
        r7 = r2.iterator();	 Catch:{ Exception -> 0x08bc }
    L_0x06e8:
        r2 = r7.hasNext();	 Catch:{ Exception -> 0x08bc }
        if (r2 == 0) goto L_0x0884;
    L_0x06ee:
        r2 = r7.next();	 Catch:{ Exception -> 0x08bc }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ Exception -> 0x08bc }
        r3 = r2.getValue();	 Catch:{ Exception -> 0x08bc }
        r3 = (com.whatsapp.a9q) r3;	 Catch:{ Exception -> 0x08bc }
        r2 = r2.getKey();	 Catch:{ Exception -> 0x08bc }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x08bc }
        r8 = z;	 Catch:{ Exception -> 0x09b6 }
        r9 = 76;
        r8 = r8[r9];	 Catch:{ Exception -> 0x09b6 }
        r8 = r8.equals(r2);	 Catch:{ Exception -> 0x09b6 }
        if (r8 != 0) goto L_0x0718;
    L_0x070c:
        r8 = com.whatsapp.qm.i(r2);	 Catch:{ Exception -> 0x09b6 }
        if (r8 != 0) goto L_0x0767;
    L_0x0712:
        r8 = r3.k();	 Catch:{ Exception -> 0x09b8 }
        if (r8 == 0) goto L_0x0767;
    L_0x0718:
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x09ba }
        r8.<init>();	 Catch:{ Exception -> 0x09ba }
        r9 = z;	 Catch:{ Exception -> 0x09ba }
        r10 = 11;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09ba }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09ba }
        r8 = r8.append(r2);	 Catch:{ Exception -> 0x09ba }
        r9 = z;	 Catch:{ Exception -> 0x09ba }
        r10 = 29;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09ba }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09ba }
        r8 = r8.toString();	 Catch:{ Exception -> 0x09ba }
        r9 = r3.g();	 Catch:{ Exception -> 0x09ba }
        a(r8, r9, r4);	 Catch:{ Exception -> 0x09ba }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x09ba }
        r8.<init>();	 Catch:{ Exception -> 0x09ba }
        r9 = z;	 Catch:{ Exception -> 0x09ba }
        r10 = 91;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09ba }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09ba }
        r8 = r8.append(r2);	 Catch:{ Exception -> 0x09ba }
        r9 = z;	 Catch:{ Exception -> 0x09ba }
        r10 = 3;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09ba }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09ba }
        r8 = r8.toString();	 Catch:{ Exception -> 0x09ba }
        r9 = r3.d();	 Catch:{ Exception -> 0x09ba }
        a(r8, r9, r4);	 Catch:{ Exception -> 0x09ba }
    L_0x0767:
        r8 = z;	 Catch:{ Exception -> 0x09bc }
        r9 = 53;
        r8 = r8[r9];	 Catch:{ Exception -> 0x09bc }
        r8 = r8.equals(r2);	 Catch:{ Exception -> 0x09bc }
        if (r8 != 0) goto L_0x0785;
    L_0x0773:
        r8 = z;	 Catch:{ Exception -> 0x09bc }
        r9 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r8 = r8[r9];	 Catch:{ Exception -> 0x09bc }
        r8 = r8.equals(r2);	 Catch:{ Exception -> 0x09bc }
        if (r8 != 0) goto L_0x0785;
    L_0x077f:
        r8 = r3.k();	 Catch:{ Exception -> 0x09be }
        if (r8 == 0) goto L_0x0824;
    L_0x0785:
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x09c0 }
        r8.<init>();	 Catch:{ Exception -> 0x09c0 }
        r9 = z;	 Catch:{ Exception -> 0x09c0 }
        r10 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r2);	 Catch:{ Exception -> 0x09c0 }
        r9 = z;	 Catch:{ Exception -> 0x09c0 }
        r10 = 41;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.toString();	 Catch:{ Exception -> 0x09c0 }
        r9 = r3.e();	 Catch:{ Exception -> 0x09c0 }
        a(r8, r9, r4);	 Catch:{ Exception -> 0x09c0 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x09c0 }
        r8.<init>();	 Catch:{ Exception -> 0x09c0 }
        r9 = z;	 Catch:{ Exception -> 0x09c0 }
        r10 = 13;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r2);	 Catch:{ Exception -> 0x09c0 }
        r9 = z;	 Catch:{ Exception -> 0x09c0 }
        r10 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.toString();	 Catch:{ Exception -> 0x09c0 }
        r9 = r3.b();	 Catch:{ Exception -> 0x09c0 }
        a(r8, r9, r4);	 Catch:{ Exception -> 0x09c0 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x09c0 }
        r8.<init>();	 Catch:{ Exception -> 0x09c0 }
        r9 = z;	 Catch:{ Exception -> 0x09c0 }
        r10 = 81;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r2);	 Catch:{ Exception -> 0x09c0 }
        r9 = z;	 Catch:{ Exception -> 0x09c0 }
        r10 = 38;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.toString();	 Catch:{ Exception -> 0x09c0 }
        r9 = r3.c();	 Catch:{ Exception -> 0x09c0 }
        a(r8, r9, r4);	 Catch:{ Exception -> 0x09c0 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x09c0 }
        r8.<init>();	 Catch:{ Exception -> 0x09c0 }
        r9 = z;	 Catch:{ Exception -> 0x09c0 }
        r10 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r2);	 Catch:{ Exception -> 0x09c0 }
        r9 = z;	 Catch:{ Exception -> 0x09c0 }
        r10 = 1;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c0 }
        r8 = r8.toString();	 Catch:{ Exception -> 0x09c0 }
        r9 = r3.l();	 Catch:{ Exception -> 0x09c0 }
        a(r8, r9, r4);	 Catch:{ Exception -> 0x09c0 }
    L_0x0824:
        r8 = r3.f();	 Catch:{ Exception -> 0x09c2 }
        if (r8 == 0) goto L_0x0882;
    L_0x082a:
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x09c2 }
        r8.<init>();	 Catch:{ Exception -> 0x09c2 }
        r9 = z;	 Catch:{ Exception -> 0x09c2 }
        r10 = 73;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c2 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c2 }
        r8 = r8.append(r2);	 Catch:{ Exception -> 0x09c2 }
        r9 = z;	 Catch:{ Exception -> 0x09c2 }
        r10 = 92;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c2 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c2 }
        r8 = r8.toString();	 Catch:{ Exception -> 0x09c2 }
        r10 = r3.h();	 Catch:{ Exception -> 0x09c2 }
        r9 = java.lang.Long.valueOf(r10);	 Catch:{ Exception -> 0x09c2 }
        a(r8, r9, r4);	 Catch:{ Exception -> 0x09c2 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x09c2 }
        r8.<init>();	 Catch:{ Exception -> 0x09c2 }
        r9 = z;	 Catch:{ Exception -> 0x09c2 }
        r10 = 43;
        r9 = r9[r10];	 Catch:{ Exception -> 0x09c2 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x09c2 }
        r2 = r8.append(r2);	 Catch:{ Exception -> 0x09c2 }
        r8 = z;	 Catch:{ Exception -> 0x09c2 }
        r9 = 14;
        r8 = r8[r9];	 Catch:{ Exception -> 0x09c2 }
        r2 = r2.append(r8);	 Catch:{ Exception -> 0x09c2 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x09c2 }
        r3 = r3.a();	 Catch:{ Exception -> 0x09c2 }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ Exception -> 0x09c2 }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x09c2 }
    L_0x0882:
        if (r16 == 0) goto L_0x06e8;
    L_0x0884:
        if (r33 == 0) goto L_0x08a9;
    L_0x0886:
        r2 = r33.entrySet();	 Catch:{ Exception -> 0x08bc }
        r7 = r2.iterator();	 Catch:{ Exception -> 0x08bc }
    L_0x088e:
        r2 = r7.hasNext();	 Catch:{ Exception -> 0x08bc }
        if (r2 == 0) goto L_0x08a9;
    L_0x0894:
        r2 = r7.next();	 Catch:{ Exception -> 0x08bc }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ Exception -> 0x08bc }
        r3 = r2.getKey();	 Catch:{ Exception -> 0x08bc }
        r3 = (java.lang.String) r3;	 Catch:{ Exception -> 0x08bc }
        r2 = r2.getValue();	 Catch:{ Exception -> 0x08bc }
        a(r3, r2, r4);	 Catch:{ Exception -> 0x08bc }
        if (r16 == 0) goto L_0x088e;
    L_0x08a9:
        if (r27 == 0) goto L_0x08b3;
    L_0x08ab:
        r2 = 1;
        r2 = r5.toString(r2);	 Catch:{ Exception -> 0x09c4 }
        r6.append(r2);	 Catch:{ Exception -> 0x09c4 }
    L_0x08b3:
        r2 = r6.toString();
        return r2;
    L_0x08b8:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08ba }
    L_0x08ba:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08bc:
        r2 = move-exception;
        r3 = z;
        r4 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        r3 = z;
        r4 = 74;
        r3 = r3[r4];
        r6.append(r3);
        r6.append(r2);
        goto L_0x08b3;
    L_0x08d3:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x08bc }
        goto L_0x006f;
    L_0x08db:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08dd:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08df:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08e1:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08e3:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08e5:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08e7:
        r4 = r6;
        goto L_0x0273;
    L_0x08ea:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08ec:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r22 = 33;
        r2 = r2[r22];	 Catch:{ Exception -> 0x08bc }
        goto L_0x02a6;
    L_0x08f4:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x08f6:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r18 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r2 = r2[r18];	 Catch:{ Exception -> 0x08bc }
        goto L_0x02b5;
    L_0x08fe:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0900 }
    L_0x0900:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0902 }
    L_0x0902:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0904:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0906 }
    L_0x0906:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0908 }
    L_0x0908:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x090a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x090c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x090e:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0910:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0912:
        r3 = 0;
        goto L_0x0479;
    L_0x0915:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0917:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0919:
        r7 = z;	 Catch:{ Exception -> 0x08bc }
        r11 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r7 = r7[r11];	 Catch:{ Exception -> 0x08bc }
        goto L_0x04e7;
    L_0x0921:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0923 }
    L_0x0923:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0925:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0927 }
    L_0x0927:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0929:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x092b:
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x08bc }
        goto L_0x0546;
    L_0x0931:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0933:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0935 }
    L_0x0935:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0937:
        r3 = 0;
        goto L_0x0595;
    L_0x093a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x093c:
        r3 = 0;
        goto L_0x05c0;
    L_0x093f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0941:
        r2 = com.whatsapp.App.W;	 Catch:{ Exception -> 0x08bc }
        r2 = r2.isNetworkRoaming();	 Catch:{ Exception -> 0x08bc }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ Exception -> 0x08bc }
        goto L_0x0619;
    L_0x094d:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x094f }
    L_0x094f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0951:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0953:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0955:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0957:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0959 }
    L_0x0959:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x095b:
        r2 = 0;
        goto L_0x068f;
    L_0x095e:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x0960:
        r2 = z;	 Catch:{ Exception -> 0x08bc }
        r7 = 100;
        r2 = r2[r7];	 Catch:{ Exception -> 0x08bc }
        goto L_0x069d;
    L_0x0968:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x096a:
        r2 = z;	 Catch:{ Exception -> 0x09b0 }
        r3 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x09b0 }
        r3 = z;	 Catch:{ Exception -> 0x09b0 }
        r7 = 80;
        r3 = r3[r7];	 Catch:{ Exception -> 0x09b0 }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x09b0 }
        if (r16 == 0) goto L_0x06bc;
    L_0x097b:
        r2 = z;	 Catch:{ Exception -> 0x09b2 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ Exception -> 0x09b2 }
        r3 = z;	 Catch:{ Exception -> 0x09b2 }
        r7 = 49;
        r3 = r3[r7];	 Catch:{ Exception -> 0x09b2 }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x09b2 }
        if (r16 == 0) goto L_0x06bc;
    L_0x098c:
        r2 = z;	 Catch:{ Exception -> 0x09b4 }
        r3 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r2 = r2[r3];	 Catch:{ Exception -> 0x09b4 }
        r3 = z;	 Catch:{ Exception -> 0x09b4 }
        r7 = 15;
        r3 = r3[r7];	 Catch:{ Exception -> 0x09b4 }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x09b4 }
        if (r16 == 0) goto L_0x06bc;
    L_0x099d:
        r2 = z;	 Catch:{ Exception -> 0x09ae }
        r3 = 94;
        r2 = r2[r3];	 Catch:{ Exception -> 0x09ae }
        r3 = z;	 Catch:{ Exception -> 0x09ae }
        r7 = 32;
        r3 = r3[r7];	 Catch:{ Exception -> 0x09ae }
        a(r2, r3, r4);	 Catch:{ Exception -> 0x09ae }
        goto L_0x06bc;
    L_0x09ae:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x09b0:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x09b2 }
    L_0x09b2:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x09b4 }
    L_0x09b4:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x09ae }
    L_0x09b6:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x09b8 }
    L_0x09b8:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x09ba }
    L_0x09ba:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x09bc:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x09be }
    L_0x09be:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x09c0 }
    L_0x09c0:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x09c2:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x09c4:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x08bc }
    L_0x09c6:
        r7 = r3;
        goto L_0x0562;
    L_0x09c9:
        r7 = r3;
        r3 = r2;
        goto L_0x0258;
    L_0x09cd:
        r32 = r2;
        goto L_0x0218;
    L_0x09d1:
        r8 = r2;
        goto L_0x0197;
    L_0x09d4:
        r9 = r2;
        goto L_0x0158;
    L_0x09d7:
        r10 = r2;
        r11 = r3;
        r12 = r4;
        r13 = r5;
        r14 = r7;
        goto L_0x012c;
    L_0x09de:
        r15 = r2;
        goto L_0x00bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.asx.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, long, long, java.lang.String, java.util.Map):java.lang.String");
    }

    private static void a(StringBuilder stringBuilder, String str) {
        boolean z = DialogToastActivity.f;
        if (str != null) {
            int i = 0;
            while (i < str.length()) {
                stringBuilder.append(str.charAt(i)).append('.');
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    @TargetApi(23)
    private static String a(Context context) {
        boolean z = DialogToastActivity.f;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.e(z[162]);
                return "";
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(z[163], 4096);
            StringBuilder stringBuilder = new StringBuilder();
            int i = 0;
            while (i < packageInfo.requestedPermissionsFlags.length) {
                try {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) == 0) {
                        if (stringBuilder.length() != 0) {
                            stringBuilder.append(z[164]);
                        }
                        stringBuilder.append(packageInfo.requestedPermissions[i]);
                    }
                    i++;
                    if (z) {
                        break;
                    }
                } catch (NameNotFoundException e) {
                    throw e;
                } catch (NameNotFoundException e2) {
                    throw e2;
                }
            }
            return stringBuilder.toString();
        } catch (Throwable e3) {
            Log.a(e3);
            return "";
        }
    }

    public static File a(File file) {
        List b = Log.b(3);
        if (file != null) {
            b.add(file);
        }
        return c6.a(b, true);
    }
}
