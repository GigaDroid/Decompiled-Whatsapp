package com.whatsapp.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.ContactsContract.Contacts;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.arj;
import com.whatsapp.l5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import q;

public class bu {
    private static final String[] z;

    static {
        String[] strArr = new String[168];
        String str = "%E4\u00034-O~\u001850N>\u0005u%H$\u00184*\u0005\u0019?\b\u0001y\u0004.\u0014\u0016t\u00155\u0012\u0010";
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 80;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 91;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = " J$\u0010j";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = " J$\u0010jt";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = ")B=\u0014/=[5";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = " J$\u0010h";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = " J$\u0010i";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = " J$\u0010i";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = " J$\u0010n";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = " J$\u0010h";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = " J$\u0010i";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = " J$\u0010h";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^46L1\u001f2>J$\u00184*";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = " J$\u0010o";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = " J$\u0010jq";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^8+E$\u001080t5\u0007>*_";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = " J$\u0010c";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "7C1\u0003>'D>\u0005:'_%\u00052(\u000b";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ")B=\u0014/=[5";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ")B=\u0014/=[5";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0006o\u0011(";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = " J$\u0010j";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^>)J9\u001d\u00042\u0019";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = " J$\u0010j";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = " J$\u0010i";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = " J$\u0010i";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ")B=\u0014/=[5";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = " J$\u0010j";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = " J$\u0010n";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = " J$\u0010b";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ")B=\u0014/=[5";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = " J$\u0010j";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^++X$\u00107iJ4\u0015)!X#.-v";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ")B=\u0014/=[5";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ")B=\u0014/=[5";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^2)";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = " J$\u0010l";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "7C1\u0003>'D>\u0005:'_%\u00052(\u0004$\b+!\u0004%\u001f0*D'\u001f{";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^+,D$\u001e";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^5-H;\u001f:)N";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = " J$\u0010o";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\nb\u0013:\u0015\u0005f\u0015";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^+,D>\u0014\u00042\u0019";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    str = ")B=\u0014/=[5";
                    obj = 42;
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    strArr2 = strArr3;
                    str = " J$\u0010j";
                    obj = 43;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\"B>\u0018(,j3\u000522B$\b\u0014*x1\u0007>\u0007D=\u00017!_5\u0015";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "*J=\u0014";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = " J$\u0010";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "7C1\u0003>'D>\u0005:'_%\u00052(\u0004=\u0014(7J7\u0014v'D>\u0005:'_\u007f\u0014)6D\"Q1-Om";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "h\u000b";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = " J$\u0010jd\u0016oQ\u001a\nop\u00108'D%\u001f/\u001b_)\u0001>d\u0016o";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "7C1\u0003>'D>\u0005:'_%\u00052(\u00046\u001077N\u000f\u001c:0H8K{";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "7C1\u0003>'D>\u0005:'_%\u00052(\u0004%\u001f0*D'\u001f\u0004'D>\u0005:'_\u000f\u0004+ J$\u0014a";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "7C1\u0003>'D>\u0005:'_%\u00052(\u0004 \u00194*N#.1-O#.7-X$.(-Q5.6-X=\u0010/'CjQ";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "'D=_,,J$\u0002:4[";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "7C1\u0003>'D>\u0005:'_%\u00052(\u0004>\u0014,\u001bE%\u001c9!Y\u007f\u001f>!O\u000f\u0015>(_1.(=E3";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = " J$\u0010h";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "4C?\u001f>";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^>)J9\u001d\u00042\u0019";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^++X$\u00107iJ4\u0015)!X#.-v";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^46L1\u001f2>J$\u00184*";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "'D=\u0001:*R";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^+,D>\u0014\u00042\u0019";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = " J$\u0010b";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "!F1\u00187";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = " J$\u0010j";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    str = "4D#\u0005:(";
                    obj = 67;
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    strArr2 = strArr3;
                    str = "4D#\u0005:(t$\b+!";
                    obj = 68;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = " J$\u0010n";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = " J$\u0010n";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = " J$\u0010jt";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = " J$\u0010j";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^5-H;\u001f:)N";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = " J$\u0010j";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "!F1\u00187\u001b_)\u0001>";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "-F\u000f\u0019:*O<\u0014";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^+,D$\u001e";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = " J$\u0010j";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    str = " J$\u0010h";
                    obj = 79;
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    strArr2 = strArr3;
                    str = ".D2./-_<\u0014";
                    obj = 80;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "h\u000b";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "h\u000b";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^8+E$\u001080t5\u0007>*_";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^2)";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "h\u000b";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = " J$\u0010l";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = ")B=\u0014/=[5";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "h\u000b";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "4C?\u001f>\u001b_)\u0001>";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    str = " J$\u0010o";
                    obj = 90;
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    strArr2 = strArr3;
                    str = " J$\u0010c";
                    obj = 91;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = " J$\u0010o";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "-F\u000f\u0001)+_?\u00124(";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = " J$\u0010h";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "%E4\u00034-O~\u001850N>\u0005u%H$\u00184*\u0005\u0019?\b\u0001y\u0004";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_?-Y\u007f\u0003:3t3\u001e50J3\u0005";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "%E4\u00034-O~\u001850N>\u0005u%H$\u00184*\u0005\u0019?\b\u0001y\u0004";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_?-Y\u007f\u0003:3t3\u001e50J3\u0005";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = " J$\u0010h";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = " J$\u0010i";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^>)J9\u001d\u00042\u0019";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = " J$\u0010c";
                    obj = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = " J$\u0010j";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "%H3\u001e.*_\u000f\u001f:)N";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = " J$\u0010l";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^2)";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = ")B=\u0014/=[5";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^++X$\u00107iJ4\u0015)!X#.-v";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = " J$\u0010l";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^5%F5";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = " J$\u0010n";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = " J$\u0010o";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^5-H;\u001f:)N";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = " J$\u0010b";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = " J$\u0010h";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = " J$\u0010h";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^+,D$\u001e";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = " J$\u0010jq";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = " J$\u0010i";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = " J$\u0010h";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = " J$\u0010i";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = " J$\u0010n";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "2B5\u0006(,J\"\u0014?'D>\u0005:'_1\u0012/-]9\u0005\"d";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^8+E$\u001080t5\u0007>*_";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = ")B=\u0014/=[5";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = " J$\u0010j";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = " J$\u0010j";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = ")B=\u0014/=[5";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = " J$\u0010jt";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "7C1\u0003>'D>\u0005:'_%\u00052(\u0004";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^+,D>\u0014\u00042\u0019";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = " J$\u0010i";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = " J$\u0010i";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = ")B=\u0014/=[5";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = " J$\u0010o";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = " J$\u0010j";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = ")B=\u0014/=[5";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = " J$\u0010b";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^46L1\u001f2>J$\u00184*";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = " J$\u0010i";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = " J$\u0010j";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = " J$\u0010j";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "'D=_:*O\"\u001e2 \u00053\u001e50J3\u0005(";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = ")B=\u0014/=[5";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "%H3\u001e.*_\u000f\u0005\"4N";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = " J$\u0010m";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = ")B=\u0014/=[5";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "\u0006o\u0011(";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = ")B=\u0014/=[5";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = " J$\u0010j";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = " J$\u0010n";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "6J'.8+E$\u001080t9\u0015";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = " J$\u0010o";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "\nb\u0013:\u0015\u0005f\u0015";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "2B5\u0006(,J\"\u0014?'D>\u0005:'_1\u0012/-]9\u0005\"k_)\u0001>k^>\u001a5+\\>Q";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = ")B=\u0014/=[5";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "%E4\u00034-O~\u001850N>\u0005u%H$\u00184*\u0005\u0019?\b\u0001y\u0004.\u0014\u0016t\u00155\u0012\u0010";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^8+E$\u001080";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "2E4_:*O\"\u001e2 \u00053\u0004)7D\"_20N=^8+E$\u001080";
                    obj = null;
                    break;
            }
        }
    }

    @TargetApi(11)
    public static void a(@NonNull q qVar, @Nullable Bitmap bitmap, @NonNull Activity activity, int i) {
        activity.startActivityForResult(a(z[96], z[97], qVar.j.e, a(activity.getResources(), qVar, bitmap)), i);
    }

    @TargetApi(11)
    public static void b(@NonNull q qVar, @Nullable Bitmap bitmap, @NonNull Activity activity, int i) {
        activity.startActivityForResult(a(z[166], z[167], qVar.j.e, a(activity.getResources(), qVar, bitmap)), i);
    }

    @TargetApi(11)
    public static void a(@NonNull q qVar, @Nullable Bitmap bitmap, @NonNull Fragment fragment, int i) {
        fragment.startActivityForResult(a(z[98], z[99], qVar.j.e, a(fragment.getResources(), qVar, bitmap)), i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.Intent r7, android.content.ContentValues r8) {
        /*
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.util.Log.h;
        r0 = z;
        r4 = 88;
        r0 = r0[r4];
        r4 = r8.getAsString(r0);
        r0 = -1;
        r5 = r4.hashCode();
        switch(r5) {
            case -1569536764: goto L_0x0029;
            case -1328682538: goto L_0x0065;
            case -601229436: goto L_0x0038;
            case 684173810: goto L_0x001a;
            case 689862072: goto L_0x0047;
            case 905843021: goto L_0x0083;
            case 950831081: goto L_0x0074;
            case 2034973555: goto L_0x0056;
            default: goto L_0x0016;
        };
    L_0x0016:
        switch(r0) {
            case 0: goto L_0x0091;
            case 1: goto L_0x00b9;
            case 2: goto L_0x00e1;
            case 3: goto L_0x0173;
            case 4: goto L_0x01bf;
            case 5: goto L_0x01c1;
            case 6: goto L_0x01c4;
            case 7: goto L_0x01ec;
            default: goto L_0x0019;
        };
    L_0x0019:
        return r2;
    L_0x001a:
        r5 = z;
        r6 = 64;
        r5 = r5[r6];
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x0016;
    L_0x0026:
        if (r3 == 0) goto L_0x01f5;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        r5 = z;
        r6 = 60;
        r5 = r5[r6];
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x0016;
    L_0x0035:
        if (r3 == 0) goto L_0x01f2;
    L_0x0037:
        r0 = r2;
    L_0x0038:
        r5 = z;
        r6 = 61;
        r5 = r5[r6];
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x0016;
    L_0x0044:
        r0 = 2;
        if (r3 == 0) goto L_0x0016;
    L_0x0047:
        r5 = z;
        r6 = 62;
        r5 = r5[r6];
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x0016;
    L_0x0053:
        r0 = 3;
        if (r3 == 0) goto L_0x0016;
    L_0x0056:
        r5 = z;
        r6 = 74;
        r5 = r5[r6];
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x0016;
    L_0x0062:
        r0 = 4;
        if (r3 == 0) goto L_0x0016;
    L_0x0065:
        r5 = z;
        r6 = 84;
        r5 = r5[r6];
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x0016;
    L_0x0071:
        r0 = 5;
        if (r3 == 0) goto L_0x0016;
    L_0x0074:
        r5 = z;
        r6 = 85;
        r5 = r5[r6];
        r5 = r4.equals(r5);
        if (r5 == 0) goto L_0x0016;
    L_0x0080:
        r0 = 6;
        if (r3 == 0) goto L_0x0016;
    L_0x0083:
        r5 = z;
        r6 = 78;
        r5 = r5[r6];
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0016;
    L_0x008f:
        r0 = 7;
        goto L_0x0016;
    L_0x0091:
        r0 = z;
        r4 = 59;
        r0 = r0[r4];
        r4 = z;
        r5 = 67;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r7.putExtra(r0, r4);
        r0 = z;
        r4 = 90;
        r0 = r0[r4];
        r4 = z;
        r5 = 95;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r7.putExtra(r0, r4);
        if (r3 == 0) goto L_0x0019;
    L_0x00b9:
        r0 = z;
        r4 = 66;
        r0 = r0[r4];
        r4 = z;
        r5 = 79;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r7.putExtra(r0, r4);
        r0 = z;
        r4 = 76;
        r0 = r0[r4];
        r4 = z;
        r5 = 58;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r7.putExtra(r0, r4);
        if (r3 == 0) goto L_0x0019;
    L_0x00e1:
        r0 = z;
        r4 = 68;
        r0 = r0[r4];
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 93;
        r5 = r5[r6];
        r5 = r8.getAsString(r5);
        r4 = r4.append(r5);
        r5 = z;
        r6 = 89;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = z;
        r6 = 87;
        r5 = r5[r6];
        r5 = r8.getAsString(r5);
        r4 = r4.append(r5);
        r5 = z;
        r6 = 86;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = z;
        r6 = 92;
        r5 = r5[r6];
        r5 = r8.getAsString(r5);
        r4 = r4.append(r5);
        r5 = " ";
        r4 = r4.append(r5);
        r5 = z;
        r6 = 65;
        r5 = r5[r6];
        r5 = r8.getAsString(r5);
        r4 = r4.append(r5);
        r5 = z;
        r6 = 83;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = z;
        r6 = 72;
        r5 = r5[r6];
        r5 = r8.getAsString(r5);
        r4 = r4.append(r5);
        r4 = r4.toString();
        r7.putExtra(r0, r4);
        r0 = z;
        r4 = 69;
        r0 = r0[r4];
        r4 = z;
        r5 = 80;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r7.putExtra(r0, r4);
        if (r3 == 0) goto L_0x0019;
    L_0x0173:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 75;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r0.append(r4);
        r4 = z;
        r5 = 71;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        if (r4 == 0) goto L_0x019d;
    L_0x0191:
        r5 = z;
        r6 = 82;
        r5 = r5[r6];
        r0.append(r5);
        r0.append(r4);
    L_0x019d:
        r4 = z;
        r5 = 63;
        r4 = r4[r5];
        r0 = r0.toString();
        r7.putExtra(r4, r0);
        r0 = z;
        r4 = 81;
        r0 = r0[r4];
        r4 = z;
        r5 = 91;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r7.putExtra(r0, r4);
        if (r3 == 0) goto L_0x0019;
    L_0x01bf:
        if (r3 == 0) goto L_0x01ef;
    L_0x01c1:
        if (r3 == 0) goto L_0x01ef;
    L_0x01c3:
        r2 = r1;
    L_0x01c4:
        r0 = z;
        r4 = 94;
        r0 = r0[r4];
        r4 = z;
        r5 = 70;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r7.putExtra(r0, r4);
        r0 = z;
        r4 = 77;
        r0 = r0[r4];
        r4 = z;
        r5 = 73;
        r4 = r4[r5];
        r4 = r8.getAsString(r4);
        r7.putExtra(r0, r4);
        if (r3 == 0) goto L_0x0019;
    L_0x01ec:
        r2 = r1;
        goto L_0x0019;
    L_0x01ef:
        r2 = r1;
        goto L_0x0019;
    L_0x01f2:
        r0 = r2;
        goto L_0x0016;
    L_0x01f5:
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bu.a(android.content.Intent, android.content.ContentValues):boolean");
    }

    public static void a(String str, Context context) {
        l5 b = App.as.b(str);
        if (b != null) {
            context.startActivity(Conversation.a(b));
            if (Log.h == 0) {
                return;
            }
        }
        Log.e(z[48] + str);
    }

    @TargetApi(11)
    private static Intent a(String str, String str2, String str3, ArrayList arrayList) {
        Intent intent = new Intent(str, Contacts.CONTENT_URI);
        intent.setType(str2);
        intent.putExtra(z[45], true);
        intent.putExtra(z[46], str3);
        if (!arrayList.isEmpty() && a(intent, (ContentValues) arrayList.get(0))) {
            arrayList.remove(0);
        }
        intent.putParcelableArrayListExtra(z[47], arrayList);
        return intent;
    }

    @TargetApi(11)
    public static void b(@NonNull q qVar, @Nullable Bitmap bitmap, @NonNull Fragment fragment, int i) {
        fragment.startActivityForResult(a(z[0], z[1], qVar.j.e, a(fragment.getResources(), qVar, bitmap)), i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(q r11, @android.support.annotation.Nullable android.graphics.Bitmap r12, java.util.ArrayList r13, java.util.ArrayList r14, com.whatsapp.DialogToastActivity r15) {
        /*
        r6 = 0;
        r10 = 100;
        r9 = 0;
        r2 = com.whatsapp.util.Log.h;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1 = 0;
        r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI;
        r0 = android.content.ContentProviderOperation.newInsert(r0);
        r4 = z;
        r5 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r4 = r4[r5];
        r0.withValue(r4, r6);
        r4 = z;
        r5 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r4 = r4[r5];
        r0.withValue(r4, r6);
        r0 = r0.build();
        r3.add(r0);
        r0 = android.provider.ContactsContract.Data.CONTENT_URI;
        r0 = android.content.ContentProviderOperation.newInsert(r0);
        r4 = z;
        r5 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r4 = r4[r5];
        r0.withValueBackReference(r4, r9);
        r4 = z;
        r5 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r4 = r4[r5];
        r5 = z;
        r6 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r5 = r5[r6];
        r0.withValue(r4, r5);
        r4 = z;
        r5 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r4 = r4[r5];
        r5 = r11.j;
        r5 = r5.e;
        r0.withValue(r4, r5);
        r4 = z;
        r5 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r4 = r4[r5];
        r5 = r11.j;
        r5 = r5.h;
        r0.withValue(r4, r5);
        r4 = z;
        r5 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r4 = r4[r5];
        r5 = r11.j;
        r5 = r5.g;
        r0.withValue(r4, r5);
        r4 = z;
        r5 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r4 = r4[r5];
        r5 = r11.j;
        r5 = r5.c;
        r0.withValue(r4, r5);
        r4 = z;
        r5 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r4 = r4[r5];
        r5 = r11.j;
        r5 = r5.f;
        r0.withValue(r4, r5);
        r4 = z;
        r5 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r4 = r4[r5];
        r5 = r11.j;
        r5 = r5.a;
        r0.withValue(r4, r5);
        r4 = z;
        r5 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r4 = r4[r5];
        r5 = r11.j;
        r5 = r5.d;
        r0.withValue(r4, r5);
        r4 = z;
        r5 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r4 = r4[r5];
        r5 = r11.j;
        r5 = r5.b;
        r0.withValue(r4, r5);
        r0 = r0.build();
        r3.add(r0);
        r0 = r11.k;
        if (r0 == 0) goto L_0x011e;
    L_0x00bc:
        r0 = r11.k;
        r4 = r0.iterator();
    L_0x00c2:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x011e;
    L_0x00c8:
        r0 = r4.next();
        r0 = (g) r0;
        r5 = android.provider.ContactsContract.Data.CONTENT_URI;
        r5 = android.content.ContentProviderOperation.newInsert(r5);
        r6 = z;	 Catch:{ IOException -> 0x048c }
        r7 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048c }
        r5.withValueBackReference(r6, r1);	 Catch:{ IOException -> 0x048c }
        r6 = z;	 Catch:{ IOException -> 0x048c }
        r7 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048c }
        r7 = z;	 Catch:{ IOException -> 0x048c }
        r8 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r7 = r7[r8];	 Catch:{ IOException -> 0x048c }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x048c }
        r6 = z;	 Catch:{ IOException -> 0x048c }
        r7 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048c }
        r7 = r0.c;	 Catch:{ IOException -> 0x048c }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x048c }
        r6 = z;	 Catch:{ IOException -> 0x048c }
        r7 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048c }
        r7 = r0.a;	 Catch:{ IOException -> 0x048c }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ IOException -> 0x048c }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x048c }
        r6 = r0.a;	 Catch:{ IOException -> 0x048c }
        if (r6 != 0) goto L_0x0115;
    L_0x010a:
        r6 = z;	 Catch:{ IOException -> 0x048c }
        r7 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048c }
        r0 = r0.d;	 Catch:{ IOException -> 0x048c }
        r5.withValue(r6, r0);	 Catch:{ IOException -> 0x048c }
    L_0x0115:
        r0 = r5.build();
        r3.add(r0);
        if (r2 == 0) goto L_0x00c2;
    L_0x011e:
        r0 = r11.l;
        if (r0 == 0) goto L_0x025e;
    L_0x0122:
        r0 = r11.l;
        r4 = r0.iterator();
    L_0x0128:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x025e;
    L_0x012e:
        r0 = r4.next();
        r0 = (c) r0;
        r5 = r0.c;
        r6 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        if (r5 != r6) goto L_0x018a;
    L_0x013a:
        r5 = android.provider.ContactsContract.Data.CONTENT_URI;
        r5 = android.content.ContentProviderOperation.newInsert(r5);
        r6 = z;	 Catch:{ IOException -> 0x048e }
        r7 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048e }
        r5.withValueBackReference(r6, r1);	 Catch:{ IOException -> 0x048e }
        r6 = z;	 Catch:{ IOException -> 0x048e }
        r7 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048e }
        r7 = z;	 Catch:{ IOException -> 0x048e }
        r8 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r7 = r7[r8];	 Catch:{ IOException -> 0x048e }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x048e }
        r6 = z;	 Catch:{ IOException -> 0x048e }
        r7 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048e }
        r7 = r0.e;	 Catch:{ IOException -> 0x048e }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x048e }
        r6 = z;	 Catch:{ IOException -> 0x048e }
        r7 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048e }
        r7 = r0.f;	 Catch:{ IOException -> 0x048e }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ IOException -> 0x048e }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x048e }
        r6 = r0.f;	 Catch:{ IOException -> 0x048e }
        if (r6 != 0) goto L_0x0181;
    L_0x0176:
        r6 = z;	 Catch:{ IOException -> 0x048e }
        r7 = 100;
        r6 = r6[r7];	 Catch:{ IOException -> 0x048e }
        r7 = r0.b;	 Catch:{ IOException -> 0x048e }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x048e }
    L_0x0181:
        r5 = r5.build();	 Catch:{ IOException -> 0x0490 }
        r3.add(r5);	 Catch:{ IOException -> 0x0490 }
        if (r2 == 0) goto L_0x025c;
    L_0x018a:
        r5 = r0.c;	 Catch:{ IOException -> 0x0490 }
        r6 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class;
        if (r5 != r6) goto L_0x0218;
    L_0x0190:
        r5 = android.provider.ContactsContract.Data.CONTENT_URI;
        r5 = android.content.ContentProviderOperation.newInsert(r5);
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r5.withValueBackReference(r6, r1);	 Catch:{ IOException -> 0x0492 }
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r7 = z;	 Catch:{ IOException -> 0x0492 }
        r8 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r7 = r7[r8];	 Catch:{ IOException -> 0x0492 }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x0492 }
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r7 = r0.a;	 Catch:{ IOException -> 0x0492 }
        r7 = r7.c();	 Catch:{ IOException -> 0x0492 }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x0492 }
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r7 = r0.a;	 Catch:{ IOException -> 0x0492 }
        r7 = r7.c;	 Catch:{ IOException -> 0x0492 }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x0492 }
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r7 = r0.a;	 Catch:{ IOException -> 0x0492 }
        r7 = r7.e;	 Catch:{ IOException -> 0x0492 }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x0492 }
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r7 = r0.a;	 Catch:{ IOException -> 0x0492 }
        r7 = r7.f;	 Catch:{ IOException -> 0x0492 }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x0492 }
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r7 = r0.a;	 Catch:{ IOException -> 0x0492 }
        r7 = r7.d;	 Catch:{ IOException -> 0x0492 }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x0492 }
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r7 = r0.f;	 Catch:{ IOException -> 0x0492 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ IOException -> 0x0492 }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x0492 }
        r6 = r0.f;	 Catch:{ IOException -> 0x0492 }
        if (r6 != 0) goto L_0x020f;
    L_0x0204:
        r6 = z;	 Catch:{ IOException -> 0x0492 }
        r7 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0492 }
        r7 = r0.b;	 Catch:{ IOException -> 0x0492 }
        r5.withValue(r6, r7);	 Catch:{ IOException -> 0x0492 }
    L_0x020f:
        r5 = r5.build();	 Catch:{ IOException -> 0x0494 }
        r3.add(r5);	 Catch:{ IOException -> 0x0494 }
        if (r2 == 0) goto L_0x025c;
    L_0x0218:
        r5 = r0.c;	 Catch:{ IOException -> 0x0494 }
        r6 = android.provider.ContactsContract.CommonDataKinds.Im.class;
        if (r5 != r6) goto L_0x023e;
    L_0x021e:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0496 }
        r5.<init>();	 Catch:{ IOException -> 0x0496 }
        r6 = z;	 Catch:{ IOException -> 0x0496 }
        r7 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0496 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0496 }
        r6 = r0.toString();	 Catch:{ IOException -> 0x0496 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0496 }
        r5 = r5.toString();	 Catch:{ IOException -> 0x0496 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ IOException -> 0x0496 }
        if (r2 == 0) goto L_0x025c;
    L_0x023e:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0498 }
        r5.<init>();	 Catch:{ IOException -> 0x0498 }
        r6 = z;	 Catch:{ IOException -> 0x0498 }
        r7 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0498 }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0498 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0498 }
        r0 = r5.append(r0);	 Catch:{ IOException -> 0x0498 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0498 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0498 }
    L_0x025c:
        if (r2 == 0) goto L_0x0128;
    L_0x025e:
        r0 = r11.i;	 Catch:{ IOException -> 0x049a }
        if (r0 == 0) goto L_0x02d0;
    L_0x0262:
        r0 = r11.i;	 Catch:{ IOException -> 0x049a }
        r0 = r0.size();	 Catch:{ IOException -> 0x049a }
        if (r0 <= 0) goto L_0x02d0;
    L_0x026a:
        r0 = r11.i;
        r0 = r0.get(r9);
        r0 = (o) r0;
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r4 = android.content.ContentProviderOperation.newInsert(r1);
        r1 = z;
        r5 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1 = r1[r5];
        r4.withValueBackReference(r1, r9);
        r1 = z;
        r5 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r1 = r1[r5];
        r5 = z;
        r6 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r5 = r5[r6];
        r4.withValue(r1, r5);
        r1 = r0.c;
        r5 = " ";
        r5 = r1.lastIndexOf(r5);
        if (r5 <= 0) goto L_0x049e;
    L_0x029b:
        r1 = r0.c;	 Catch:{ IOException -> 0x049c }
        r6 = 0;
        r1 = r1.substring(r6, r5);	 Catch:{ IOException -> 0x049c }
    L_0x02a2:
        r6 = z;	 Catch:{ IOException -> 0x04a2 }
        r7 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r6 = r6[r7];	 Catch:{ IOException -> 0x04a2 }
        r4.withValue(r6, r1);	 Catch:{ IOException -> 0x04a2 }
        if (r5 <= 0) goto L_0x02be;
    L_0x02ad:
        r1 = z;	 Catch:{ IOException -> 0x04a2 }
        r6 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r1 = r1[r6];	 Catch:{ IOException -> 0x04a2 }
        r6 = r0.c;	 Catch:{ IOException -> 0x04a2 }
        r5 = r5 + 1;
        r5 = r6.substring(r5);	 Catch:{ IOException -> 0x04a2 }
        r4.withValue(r1, r5);	 Catch:{ IOException -> 0x04a2 }
    L_0x02be:
        r1 = z;
        r5 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r1 = r1[r5];
        r0 = r0.a;
        r4.withValue(r1, r0);
        r0 = r4.build();
        r3.add(r0);
    L_0x02d0:
        r0 = r11.g;
        if (r0 == 0) goto L_0x041a;
    L_0x02d4:
        r0 = r11.g;
        r0 = r0.keySet();
        r4 = r0.iterator();
    L_0x02de:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x041a;
    L_0x02e4:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r1 = z;
        r5 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r1 = r1[r5];
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0337;
    L_0x02f6:
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r1 = android.content.ContentProviderOperation.newInsert(r1);
        r5 = z;
        r6 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r5 = r5[r6];
        r1 = r1.withValueBackReference(r5, r9);
        r5 = z;
        r6 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r5 = r5[r6];
        r6 = z;
        r7 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r6 = r6[r7];
        r5 = r1.withValue(r5, r6);
        r1 = z;
        r6 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r6 = r1[r6];
        r1 = r11.g;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r9);
        r1 = (m) r1;
        r1 = r1.c;
        r1 = r5.withValue(r6, r1);
        r1 = r1.build();
        r3.add(r1);
    L_0x0337:
        r1 = z;
        r5 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r1 = r1[r5];
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0393;
    L_0x0343:
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r1 = android.content.ContentProviderOperation.newInsert(r1);
        r5 = z;
        r6 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r5 = r5[r6];
        r1 = r1.withValueBackReference(r5, r9);
        r5 = z;
        r6 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r5 = r5[r6];
        r6 = z;
        r7 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r6 = r6[r7];
        r1 = r1.withValue(r5, r6);
        r5 = z;
        r6 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r5 = r5[r6];
        r6 = 3;
        r6 = java.lang.Integer.valueOf(r6);
        r5 = r1.withValue(r5, r6);
        r1 = z;
        r6 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r6 = r1[r6];
        r1 = r11.g;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r9);
        r1 = (m) r1;
        r1 = r1.c;
        r1 = r5.withValue(r6, r1);
        r1 = r1.build();
        r3.add(r1);
    L_0x0393:
        r1 = q.b;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x0418;
    L_0x039b:
        r1 = r11.g;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r9);
        r1 = (m) r1;
        r5 = android.provider.ContactsContract.Data.CONTENT_URI;
        r5 = android.content.ContentProviderOperation.newInsert(r5);
        r6 = z;
        r7 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r6 = r6[r7];
        r5 = r5.withValueBackReference(r6, r9);
        r6 = z;
        r7 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r6 = r6[r7];
        r7 = z;
        r8 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r7 = r7[r8];
        r5 = r5.withValue(r6, r7);
        r6 = z;
        r7 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r6 = r6[r7];
        r7 = q.b;
        r7 = r7.get(r0);
        r5 = r5.withValue(r6, r7);
        r6 = z;
        r7 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r6 = r6[r7];
        r7 = r11.g;
        r0 = r7.get(r0);
        r0 = (java.util.List) r0;
        r0 = r0.get(r9);
        r0 = (m) r0;
        r0 = r0.c;
        r0 = r5.withValue(r6, r0);
        r5 = r1.d;	 Catch:{ IOException -> 0x04a4 }
        if (r5 == 0) goto L_0x0411;
    L_0x03f7:
        r5 = r1.d;	 Catch:{ IOException -> 0x04a4 }
        r5 = r5.size();	 Catch:{ IOException -> 0x04a4 }
        if (r5 <= 0) goto L_0x0411;
    L_0x03ff:
        r5 = z;	 Catch:{ IOException -> 0x04a6 }
        r6 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r5 = r5[r6];	 Catch:{ IOException -> 0x04a6 }
        r1 = r1.d;	 Catch:{ IOException -> 0x04a6 }
        r1 = r1.toArray();	 Catch:{ IOException -> 0x04a6 }
        r6 = 0;
        r1 = r1[r6];	 Catch:{ IOException -> 0x04a6 }
        r0.withValue(r5, r1);	 Catch:{ IOException -> 0x04a6 }
    L_0x0411:
        r0 = r0.build();
        r3.add(r0);
    L_0x0418:
        if (r2 == 0) goto L_0x02de;
    L_0x041a:
        if (r12 == 0) goto L_0x045e;
    L_0x041c:
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r1 = android.graphics.Bitmap.CompressFormat.PNG;
        r12.compress(r1, r10, r0);
        r1 = r0.toByteArray();
        r2 = android.provider.ContactsContract.Data.CONTENT_URI;
        r2 = android.content.ContentProviderOperation.newInsert(r2);
        r4 = z;
        r5 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r4 = r4[r5];
        r2 = r2.withValueBackReference(r4, r9);
        r4 = z;
        r5 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r4 = r4[r5];
        r5 = z;
        r6 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r5 = r5[r6];
        r2 = r2.withValue(r4, r5);
        r4 = z;
        r5 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r4 = r4[r5];
        r1 = r2.withValue(r4, r1);
        r1 = r1.build();
        r3.add(r1);
        r0.close();	 Catch:{ IOException -> 0x04c8 }
    L_0x045e:
        r0 = com.whatsapp.App.at;	 Catch:{ Exception -> 0x04a8 }
        r1 = z;	 Catch:{ Exception -> 0x04a8 }
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r1 = r1[r2];	 Catch:{ Exception -> 0x04a8 }
        r0 = r0.applyBatch(r1, r3);	 Catch:{ Exception -> 0x04a8 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ Exception -> 0x04a8 }
        r0 = r0.uri;	 Catch:{ Exception -> 0x04a8 }
        r0 = r0.getLastPathSegment();	 Catch:{ Exception -> 0x04a8 }
        r1 = r11.a();	 Catch:{ Exception -> 0x04a8 }
        a(r13, r14, r1, r0, r15);	 Catch:{ Exception -> 0x04a8 }
        r0 = 0;
        r1 = 2131230943; // 0x7f0800df float:1.8077953E38 double:1.0529679923E-314;
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ Exception -> 0x04a8 }
        r3 = 0;
        r4 = r11.a();	 Catch:{ Exception -> 0x04a8 }
        r2[r3] = r4;	 Catch:{ Exception -> 0x04a8 }
        r15.a(r0, r1, r2);	 Catch:{ Exception -> 0x04a8 }
    L_0x048b:
        return;
    L_0x048c:
        r0 = move-exception;
        throw r0;
    L_0x048e:
        r0 = move-exception;
        throw r0;
    L_0x0490:
        r0 = move-exception;
        throw r0;
    L_0x0492:
        r0 = move-exception;
        throw r0;
    L_0x0494:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0496 }
    L_0x0496:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0498 }
    L_0x0498:
        r0 = move-exception;
        throw r0;
    L_0x049a:
        r0 = move-exception;
        throw r0;
    L_0x049c:
        r0 = move-exception;
        throw r0;
    L_0x049e:
        r1 = r0.c;
        goto L_0x02a2;
    L_0x04a2:
        r0 = move-exception;
        throw r0;
    L_0x04a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04a6 }
    L_0x04a6:
        r0 = move-exception;
        throw r0;
    L_0x04a8:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x048b;
    L_0x04c8:
        r0 = move-exception;
        goto L_0x045e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bu.a(q, android.graphics.Bitmap, java.util.ArrayList, java.util.ArrayList, com.whatsapp.DialogToastActivity):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.ArrayList r18, java.util.ArrayList r19, java.lang.String r20, java.lang.String r21, android.app.Activity r22) {
        /*
        r13 = com.whatsapp.util.Log.h;
        r2 = r18.size();
        r3 = r19.size();
        if (r2 == r3) goto L_0x003d;
    L_0x000c:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 55;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r18.size();
        r2 = r2.append(r3);
        r3 = z;
        r4 = 49;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r19.size();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
    L_0x003c:
        return;
    L_0x003d:
        r3 = 0;
        r2 = 0;
        r11 = r2;
    L_0x0040:
        r2 = r18.size();
        if (r11 >= r2) goto L_0x014f;
    L_0x0046:
        r0 = r18;
        r2 = r0.get(r11);
        r8 = r2;
        r8 = (java.lang.String) r8;
        r0 = r19;
        r2 = r0.get(r11);
        r9 = r2;
        r9 = (java.lang.String) r9;
        if (r9 != 0) goto L_0x005d;
    L_0x005a:
        r3 = 1;
        if (r13 == 0) goto L_0x014b;
    L_0x005d:
        r12 = r3;
        r2 = com.whatsapp.App.as;
        r14 = r2.l(r9);
        r2 = r14.size();
        if (r2 <= 0) goto L_0x014a;
    L_0x006a:
        r2 = 0;
        r15 = r14.iterator();
        r3 = r2;
    L_0x0070:
        r2 = r15.hasNext();
        if (r2 == 0) goto L_0x0174;
    L_0x0076:
        r2 = r15.next();
        r10 = r2;
        r10 = (com.whatsapp.l5) r10;
        r2 = r10.p;
        if (r2 == 0) goto L_0x0070;
    L_0x0081:
        r2 = r10.l;
        if (r2 == 0) goto L_0x0087;
    L_0x0085:
        if (r13 == 0) goto L_0x0070;
    L_0x0087:
        r2 = r10.p;
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x00a1;
    L_0x008f:
        r2 = 0;
        r4 = "@";
        r4 = r9.indexOf(r4);
        r2 = r9.substring(r2, r4);
        r2 = android.telephony.PhoneNumberUtils.compare(r8, r2);
        if (r2 != 0) goto L_0x00bf;
    L_0x00a1:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 52;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r10.p;
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
        if (r13 == 0) goto L_0x0070;
    L_0x00bf:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 54;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r10);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.App.v(r22);
        if (r2 == 0) goto L_0x0171;
    L_0x00df:
        r2 = r22.getContentResolver();
        r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = z;
        r7 = 50;
        r6 = r6[r7];
        r4[r5] = r6;
        r5 = z;
        r6 = 51;
        r5 = r5[r6];
        r6 = 2;
        r6 = new java.lang.String[r6];
        r7 = 0;
        r6[r7] = r8;
        r7 = 1;
        r16 = z;
        r17 = 56;
        r16 = r16[r17];
        r6[r7] = r16;
        r7 = 0;
        r3 = r2.query(r3, r4, r5, r6, r7);
        if (r3 == 0) goto L_0x016e;
    L_0x010d:
        r2 = r3.moveToFirst();
        if (r2 == 0) goto L_0x016e;
    L_0x0113:
        r2 = z;
        r4 = 53;
        r2 = r2[r4];
        r2 = r3.getColumnIndex(r2);
        r2 = r3.getString(r2);
    L_0x0121:
        if (r3 == 0) goto L_0x0126;
    L_0x0123:
        r3.close();
    L_0x0126:
        r3 = new com.whatsapp.db;
        r4 = java.lang.Long.parseLong(r2);
        r3.<init>(r4, r8);
        r10.l = r3;
        r0 = r20;
        r10.q = r0;
        r2 = 1;
        r10.m = r2;
        r2 = 1;
        if (r13 == 0) goto L_0x016b;
    L_0x013b:
        if (r2 == 0) goto L_0x0148;
    L_0x013d:
        r2 = com.whatsapp.App.as;
        r2.d(r14);
        r2 = com.whatsapp.App.aB;
        r3 = 1;
        r2.sendEmptyMessage(r3);
    L_0x0148:
        if (r13 == 0) goto L_0x0169;
    L_0x014a:
        r3 = 1;
    L_0x014b:
        r2 = r11 + 1;
        if (r13 == 0) goto L_0x0166;
    L_0x014f:
        if (r3 == 0) goto L_0x003c;
    L_0x0151:
        r2 = z;
        r3 = 57;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = new com.whatsapp.util.r;
        r0 = r22;
        r2.<init>(r0);
        com.whatsapp.util.bq.a(r2);
        goto L_0x003c;
    L_0x0166:
        r11 = r2;
        goto L_0x0040;
    L_0x0169:
        r3 = r12;
        goto L_0x014b;
    L_0x016b:
        r3 = r2;
        goto L_0x0070;
    L_0x016e:
        r2 = r21;
        goto L_0x0121;
    L_0x0171:
        r2 = r21;
        goto L_0x0126;
    L_0x0174:
        r2 = r3;
        goto L_0x013b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bu.a(java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, android.app.Activity):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList a(@android.support.annotation.NonNull android.content.res.Resources r11, @android.support.annotation.NonNull q r12, @android.support.annotation.Nullable android.graphics.Bitmap r13) {
        /*
        r10 = 3;
        r9 = 0;
        r3 = com.whatsapp.util.Log.h;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r12.k;
        if (r0 == 0) goto L_0x0066;
    L_0x000d:
        r0 = r12.k;
        r1 = r0.iterator();
    L_0x0013:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0066;
    L_0x0019:
        r0 = r1.next();
        r0 = (g) r0;
        r2 = new android.content.ContentValues;
        r2.<init>();
        r5 = z;
        r6 = 18;
        r5 = r5[r6];
        r6 = z;
        r7 = 42;
        r6 = r6[r7];
        r2.put(r5, r6);
        r5 = z;
        r6 = 27;
        r5 = r5[r6];
        r6 = r0.c;
        r2.put(r5, r6);
        r5 = z;
        r6 = 7;
        r5 = r5[r6];
        r6 = r0.a;
        r6 = java.lang.Integer.valueOf(r6);
        r2.put(r5, r6);
        r5 = z;
        r6 = 9;
        r5 = r5[r6];
        r6 = r0.a;
        r0 = r0.d;
        r0 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(r11, r6, r0);
        r0 = r0.toString();
        r2.put(r5, r0);
        r4.add(r2);
        if (r3 == 0) goto L_0x0013;
    L_0x0066:
        r0 = r12.l;
        if (r0 == 0) goto L_0x0193;
    L_0x006a:
        r0 = r12.l;
        r1 = r0.iterator();
    L_0x0070:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0193;
    L_0x0076:
        r0 = r1.next();
        r0 = (c) r0;
        r2 = r0.c;
        r5 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        if (r2 != r5) goto L_0x00c9;
    L_0x0082:
        r2 = new android.content.ContentValues;
        r2.<init>();
        r5 = z;	 Catch:{ IOException -> 0x0344 }
        r6 = 43;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0344 }
        r6 = z;	 Catch:{ IOException -> 0x0344 }
        r7 = 22;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0344 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0344 }
        r5 = z;	 Catch:{ IOException -> 0x0344 }
        r6 = 21;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0344 }
        r6 = r0.e;	 Catch:{ IOException -> 0x0344 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0344 }
        r5 = z;	 Catch:{ IOException -> 0x0344 }
        r6 = 25;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0344 }
        r6 = r0.f;	 Catch:{ IOException -> 0x0344 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x0344 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0344 }
        r5 = z;	 Catch:{ IOException -> 0x0344 }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0344 }
        r6 = r0.f;	 Catch:{ IOException -> 0x0344 }
        r7 = r0.b;	 Catch:{ IOException -> 0x0344 }
        r6 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(r11, r6, r7);	 Catch:{ IOException -> 0x0344 }
        r6 = r6.toString();	 Catch:{ IOException -> 0x0344 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0344 }
        r4.add(r2);	 Catch:{ IOException -> 0x0344 }
        if (r3 == 0) goto L_0x0191;
    L_0x00c9:
        r2 = r0.c;	 Catch:{ IOException -> 0x0344 }
        r5 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class;
        if (r2 != r5) goto L_0x014d;
    L_0x00cf:
        r2 = new android.content.ContentValues;
        r2.<init>();
        r5 = z;	 Catch:{ IOException -> 0x0346 }
        r6 = 30;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0346 }
        r6 = z;	 Catch:{ IOException -> 0x0346 }
        r7 = 32;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0346 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0346 }
        r5 = z;	 Catch:{ IOException -> 0x0346 }
        r6 = 40;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0346 }
        r6 = r0.a;	 Catch:{ IOException -> 0x0346 }
        r6 = r6.c();	 Catch:{ IOException -> 0x0346 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0346 }
        r5 = z;	 Catch:{ IOException -> 0x0346 }
        r6 = 36;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0346 }
        r6 = r0.a;	 Catch:{ IOException -> 0x0346 }
        r6 = r6.c;	 Catch:{ IOException -> 0x0346 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0346 }
        r5 = z;	 Catch:{ IOException -> 0x0346 }
        r6 = 16;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0346 }
        r6 = r0.a;	 Catch:{ IOException -> 0x0346 }
        r6 = r6.e;	 Catch:{ IOException -> 0x0346 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0346 }
        r5 = z;	 Catch:{ IOException -> 0x0346 }
        r6 = 29;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0346 }
        r6 = r0.a;	 Catch:{ IOException -> 0x0346 }
        r6 = r6.f;	 Catch:{ IOException -> 0x0346 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0346 }
        r5 = z;	 Catch:{ IOException -> 0x0346 }
        r6 = 3;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0346 }
        r6 = r0.a;	 Catch:{ IOException -> 0x0346 }
        r6 = r6.d;	 Catch:{ IOException -> 0x0346 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0346 }
        r5 = z;	 Catch:{ IOException -> 0x0346 }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0346 }
        r6 = r0.f;	 Catch:{ IOException -> 0x0346 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x0346 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0346 }
        r5 = z;	 Catch:{ IOException -> 0x0346 }
        r6 = 11;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0346 }
        r6 = r0.f;	 Catch:{ IOException -> 0x0346 }
        r7 = r0.b;	 Catch:{ IOException -> 0x0346 }
        r6 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(r11, r6, r7);	 Catch:{ IOException -> 0x0346 }
        r6 = r6.toString();	 Catch:{ IOException -> 0x0346 }
        r2.put(r5, r6);	 Catch:{ IOException -> 0x0346 }
        r4.add(r2);	 Catch:{ IOException -> 0x0346 }
        if (r3 == 0) goto L_0x0191;
    L_0x014d:
        r2 = r0.c;	 Catch:{ IOException -> 0x0346 }
        r5 = android.provider.ContactsContract.CommonDataKinds.Im.class;
        if (r2 != r5) goto L_0x0173;
    L_0x0153:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0348 }
        r2.<init>();	 Catch:{ IOException -> 0x0348 }
        r5 = z;	 Catch:{ IOException -> 0x0348 }
        r6 = 17;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0348 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0348 }
        r5 = r0.toString();	 Catch:{ IOException -> 0x0348 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0348 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0348 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0348 }
        if (r3 == 0) goto L_0x0191;
    L_0x0173:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x034a }
        r2.<init>();	 Catch:{ IOException -> 0x034a }
        r5 = z;	 Catch:{ IOException -> 0x034a }
        r6 = 37;
        r5 = r5[r6];	 Catch:{ IOException -> 0x034a }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x034a }
        r0 = r0.toString();	 Catch:{ IOException -> 0x034a }
        r0 = r2.append(r0);	 Catch:{ IOException -> 0x034a }
        r0 = r0.toString();	 Catch:{ IOException -> 0x034a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x034a }
    L_0x0191:
        if (r3 == 0) goto L_0x0070;
    L_0x0193:
        r0 = r12.i;	 Catch:{ IOException -> 0x034c }
        if (r0 == 0) goto L_0x01f6;
    L_0x0197:
        r0 = r12.i;	 Catch:{ IOException -> 0x034c }
        r0 = r0.size();	 Catch:{ IOException -> 0x034c }
        if (r0 <= 0) goto L_0x01f6;
    L_0x019f:
        r0 = r12.i;
        r0 = r0.get(r9);
        r0 = (o) r0;
        r1 = r0.c;
        r2 = " ";
        r2 = r1.lastIndexOf(r2);
        if (r2 <= 0) goto L_0x0350;
    L_0x01b2:
        r1 = r0.c;	 Catch:{ IOException -> 0x034e }
        r5 = 0;
        r1 = r1.substring(r5, r2);	 Catch:{ IOException -> 0x034e }
    L_0x01b9:
        r5 = new android.content.ContentValues;
        r5.<init>();
        r6 = z;	 Catch:{ IOException -> 0x0354 }
        r7 = 4;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0354 }
        r7 = z;	 Catch:{ IOException -> 0x0354 }
        r8 = 12;
        r7 = r7[r8];	 Catch:{ IOException -> 0x0354 }
        r5.put(r6, r7);	 Catch:{ IOException -> 0x0354 }
        r6 = z;	 Catch:{ IOException -> 0x0354 }
        r7 = 44;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0354 }
        r5.put(r6, r1);	 Catch:{ IOException -> 0x0354 }
        if (r2 <= 0) goto L_0x01e8;
    L_0x01d7:
        r1 = z;	 Catch:{ IOException -> 0x0354 }
        r6 = 28;
        r1 = r1[r6];	 Catch:{ IOException -> 0x0354 }
        r6 = r0.c;	 Catch:{ IOException -> 0x0354 }
        r2 = r2 + 1;
        r2 = r6.substring(r2);	 Catch:{ IOException -> 0x0354 }
        r5.put(r1, r2);	 Catch:{ IOException -> 0x0354 }
    L_0x01e8:
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        r0 = r0.a;
        r5.put(r1, r0);
        r4.add(r5);
    L_0x01f6:
        r0 = r12.g;
        if (r0 == 0) goto L_0x030e;
    L_0x01fa:
        r0 = r12.g;
        r0 = r0.keySet();
        r5 = r0.iterator();
    L_0x0204:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x030e;
    L_0x020a:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r1 = z;
        r2 = 41;
        r1 = r1[r2];
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x024b;
    L_0x021c:
        r2 = new android.content.ContentValues;
        r2.<init>();
        r1 = z;
        r6 = 19;
        r1 = r1[r6];
        r6 = z;
        r7 = 39;
        r6 = r6[r7];
        r2.put(r1, r6);
        r1 = z;
        r6 = 2;
        r6 = r1[r6];
        r1 = r12.g;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r9);
        r1 = (m) r1;
        r1 = r1.c;
        r2.put(r6, r1);
        r4.add(r2);
    L_0x024b:
        r1 = z;
        r2 = 20;
        r1 = r1[r2];
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0294;
    L_0x0257:
        r2 = new android.content.ContentValues;
        r2.<init>();
        r1 = z;
        r6 = 33;
        r1 = r1[r6];
        r6 = z;
        r7 = 15;
        r6 = r6[r7];
        r2.put(r1, r6);
        r1 = z;
        r6 = 10;
        r1 = r1[r6];
        r6 = java.lang.Integer.valueOf(r10);
        r2.put(r1, r6);
        r1 = z;
        r6 = 31;
        r6 = r1[r6];
        r1 = r12.g;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r9);
        r1 = (m) r1;
        r1 = r1.c;
        r2.put(r6, r1);
        r4.add(r2);
    L_0x0294:
        r1 = q.b;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x030c;
    L_0x029c:
        r1 = r12.g;
        r1 = r1.get(r0);
        r1 = (java.util.List) r1;
        r1 = r1.get(r9);
        r1 = (m) r1;
        r6 = new android.content.ContentValues;
        r6.<init>();
        r2 = z;	 Catch:{ IOException -> 0x0356 }
        r7 = 34;
        r2 = r2[r7];	 Catch:{ IOException -> 0x0356 }
        r7 = z;	 Catch:{ IOException -> 0x0356 }
        r8 = 35;
        r7 = r7[r8];	 Catch:{ IOException -> 0x0356 }
        r6.put(r2, r7);	 Catch:{ IOException -> 0x0356 }
        r2 = z;	 Catch:{ IOException -> 0x0356 }
        r7 = 8;
        r7 = r2[r7];	 Catch:{ IOException -> 0x0356 }
        r2 = q.b;	 Catch:{ IOException -> 0x0356 }
        r2 = r2.get(r0);	 Catch:{ IOException -> 0x0356 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x0356 }
        r6.put(r7, r2);	 Catch:{ IOException -> 0x0356 }
        r2 = z;	 Catch:{ IOException -> 0x0356 }
        r7 = 23;
        r2 = r2[r7];	 Catch:{ IOException -> 0x0356 }
        r7 = r12.g;	 Catch:{ IOException -> 0x0356 }
        r0 = r7.get(r0);	 Catch:{ IOException -> 0x0356 }
        r0 = (java.util.List) r0;	 Catch:{ IOException -> 0x0356 }
        r7 = 0;
        r0 = r0.get(r7);	 Catch:{ IOException -> 0x0356 }
        r0 = (m) r0;	 Catch:{ IOException -> 0x0356 }
        r0 = r0.c;	 Catch:{ IOException -> 0x0356 }
        r6.put(r2, r0);	 Catch:{ IOException -> 0x0356 }
        r0 = r1.d;	 Catch:{ IOException -> 0x0356 }
        if (r0 == 0) goto L_0x0309;
    L_0x02ed:
        r0 = r1.d;	 Catch:{ IOException -> 0x0356 }
        r0 = r0.size();	 Catch:{ IOException -> 0x0356 }
        if (r0 <= 0) goto L_0x0309;
    L_0x02f5:
        r0 = z;	 Catch:{ IOException -> 0x0358 }
        r2 = 24;
        r2 = r0[r2];	 Catch:{ IOException -> 0x0358 }
        r0 = r1.d;	 Catch:{ IOException -> 0x0358 }
        r0 = r0.toArray();	 Catch:{ IOException -> 0x0358 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0358 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x0358 }
        r6.put(r2, r0);	 Catch:{ IOException -> 0x0358 }
    L_0x0309:
        r4.add(r6);
    L_0x030c:
        if (r3 == 0) goto L_0x0204;
    L_0x030e:
        if (r13 == 0) goto L_0x0343;
    L_0x0310:
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r1 = android.graphics.Bitmap.CompressFormat.PNG;
        r2 = 100;
        r13.compress(r1, r2, r0);
        r1 = r0.toByteArray();
        r2 = new android.content.ContentValues;
        r2.<init>();
        r3 = z;
        r5 = 26;
        r3 = r3[r5];
        r5 = z;
        r6 = 38;
        r5 = r5[r6];
        r2.put(r3, r5);
        r3 = z;
        r5 = 14;
        r3 = r3[r5];
        r2.put(r3, r1);
        r4.add(r2);
        r0.close();	 Catch:{ IOException -> 0x035a }
    L_0x0343:
        return r4;
    L_0x0344:
        r0 = move-exception;
        throw r0;
    L_0x0346:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0348 }
    L_0x0348:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x034a }
    L_0x034a:
        r0 = move-exception;
        throw r0;
    L_0x034c:
        r0 = move-exception;
        throw r0;
    L_0x034e:
        r0 = move-exception;
        throw r0;
    L_0x0350:
        r1 = r0.c;
        goto L_0x01b9;
    L_0x0354:
        r0 = move-exception;
        throw r0;
    L_0x0356:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0358 }
    L_0x0358:
        r0 = move-exception;
        throw r0;
    L_0x035a:
        r0 = move-exception;
        goto L_0x0343;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bu.a(android.content.res.Resources, q, android.graphics.Bitmap):java.util.ArrayList");
    }
}
