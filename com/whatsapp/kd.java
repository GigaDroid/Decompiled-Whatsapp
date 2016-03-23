package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.messaging.b1;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.bb;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.ci;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class kd implements b1 {
    private static final String[] z;
    private final App a;

    static {
        String[] strArr = new String[95];
        String str = "]\u001as";
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
                        i3 = 42;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "]\u001as";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "y\u001ac]hX?b\u0005zB\u001eeXlZ\u000f?Eh^";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "]\u001as";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "X\u001a}Jt";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ftnB\u001ee\u000bxD\u0014\u007fDzD_eR}OE1";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\n\u0019~Y-";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "]\u001as";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X bRcI_tY\u007fE\r1";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "[\r1N\u007fX\u0010c\u000b";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Z\u0013pRhN";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "X\u001apO";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    str = "]\u001as";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "Y\u001ae";
                    obj = 13;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "]\u001as";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ft~O\u000bNYhK\u001b1ExF\u0013";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ft~O\u000bN^cX\u001apO";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ft~O\u000bNYhK\u001b1FlF\u0019~Y`O\u001b1Jn^\u0016~E";
                    obj = 17;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ftdD\u0016eBl^\u001a1HeK\u0013}NcM\u001a1[lY\ftO";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\n\u0013~HlFE1";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "]\u001as";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\n\rtH{\u0010_";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "X\u001a`^dX\u001au";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0006_dEfD\u0010fE-H\r~\\~O\r1";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\n\rtZO\u0010_";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ftdD\u0016eBl^\u001a1";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\n\u001cyJaF\u001a\u007fLh\n\u0019pBaO\u001b1HxX\rS\u0011-";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "X\u001ab^`O";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "X\u001a`^dX\u001au";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "X\u001ab^`O";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "I\u0017pGaO\u0011vN";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\n\u000b~@hD_gN\u007fC\u0019xHl^\u0016~E-L\u001exGhNS1XhD\u001bxEj\n\u001cyJaF\u001a\u007fLh\n";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "X\u001a`^dX\u001au";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ftdD\u0016eBl^\u001a1";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\n\u0017pX^O\u001ccNy\u0010_";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ftdD\u0016eBl^\u001a1XhY\fxDc\u0017";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007f\u000bdD\u0016eBl^\u001a1HeK\u0013}NcM\u001a1HbD\u0019}Bn^_r^\u007fX=+\u000b";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0004_sbi\u0010_";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ftdD\u0016eBl^\u001a1";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\n\rtZO\u0010_";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "Y\u001ae";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    str = "]\u001as";
                    obj = 41;
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    str = "K\tpBaK\u001d}N";
                    i = 43;
                    strArr2 = strArr3;
                    obj = 42;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    strArr2 = strArr3;
                    str = "_\u0011p]lC\u0013pIaO";
                    obj = 43;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "Z\u001edXhN";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "]\u001as";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "Y\nsXnX\u0016sN";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "y\u001ac]hX?b\u0005zB\u001eeXlZ\u000f?Eh^";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "X\u001arD\u007fN\u0016\u007fL";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "I\u0010|[bY\u0016\u007fL";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "Z\u001edXhN";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "I\u0010|[bY\u0016\u007fL";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "X\u001arD\u007fN\u0016\u007fL";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "Y\u001ae";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "Y\u001ae";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "N\u001a}NyO";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "Y\u001ae";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "]\u001as";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X `^hX\u0006>FhN\u0016p\u000bhX\r~Y-_\u0011zEb]\u0011";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\n\n\u007f@cE\b\u007f\u000byS\u000ft\u0011-";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "]\u001as";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X `^hX\u0006>FhN\u0016p\u000b\u007fO\naGbK\u001bxEj\n";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "]\u001as";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "]\u001as";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X `^hX\u0006>FhN\u0016p\u000bcE_wBaO";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "]\u001as";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X `^hX\u00061";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "]\u001as";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X `^hX\u0006>FhN\u0016p\u000bhX\r~Y-D\u00101FhY\fpLh";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X `^hX\u0006>FhN\u0016p\u000bhX\r~Y-D\u0010e\u000bxZ\u0013~JiO\u001b";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "]\u001as";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "Z\r~Fb^\u001a";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "X\u001a|D{O";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "Y\u001ae";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "]\u001as";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ft~O\u000bNL\u007fE\na\u000bnX\u001ap_h\n\u0018cDxZE";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "K\u001bu";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "F\u001ap]h";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "Y\nsAhI\u000b";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ft~O\u000bNL\u007fE\na\u000b`K\u0013wD\u007fG\u001au\u000blI\u000bxDc";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ft~O\u000bNL\u007fE\na\u000b`K\u0013wD\u007fG\u001au\u000blI\u000bxDc";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "X\u001a|D{O";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "I\rtJyO";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "Z\r~Fb^\u001a";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "K\u001bu";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X pHyC\u0010\u007ft~O\u000bNL\u007fE\na\u000bcE_\u007fNy]\u0010c@-K\u001crN~YS1MlC\u00131_b\n\u001ccNl^\u001a1L\u007fE\na";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "]\u001as";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X aBcM_";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "[\r1XxI\u001ctX~";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "[\rNNi_\u001cp_dE\u0011";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004|X bRcI_b^nI\u001abX-";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "I\u0010|\u0005zB\u001eeXlZ\u000fN[\u007fO\u0019tYhD\u001ctX";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "Y\u001ae";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "]\u001as";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "K\u000fa\u0004uG\u000fa\u0004\u007fO\u001cg\u0004zO\u001dNJn^\u0016~ERX\u001a}Jtu\u0012bL-G\u001auBlA\u001ah\u000baO\u0011v_e\n\u0011~_-\u0019M+\u000b";
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r12, java.lang.String r13, com.whatsapp.protocol.c2 r14) {
        /*
        r11 = this;
        r10 = 5;
        r9 = 4;
        r8 = 3;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.wn.q();
        if (r0 == 0) goto L_0x0168;
    L_0x000d:
        r4 = r14.k;
        r0 = r11.a;
        r0 = com.whatsapp.App.aK;
        r5 = r4.k;
        r5 = r0.a(r5);
        if (r5 != 0) goto L_0x0126;
    L_0x001b:
        r0 = r11.a;
        com.whatsapp.App.b(r4);
        r6 = r14.g;
        if (r6 == 0) goto L_0x007e;
    L_0x0024:
        r0 = r6.length;
        r7 = 32;
        if (r0 == r7) goto L_0x0054;
    L_0x0029:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r1 = r2[r1];
        r0 = r0.append(r1);
        r1 = r6.length;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = r11.a;
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        com.whatsapp.App.a(r13, r0);
        r0 = r11.a;
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.App.c(r13, r12, r0);
    L_0x0053:
        return;
    L_0x0054:
        r0 = r11.a;
        r0 = r4.c;
        r0 = com.whatsapp.App.a(r0);
        r7 = com.whatsapp.mt.a(r6, r0);
        r0 = r4.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r0.mediaKey = r6;
        r6 = r7.c();
        r0.refKey = r6;
        r6 = r7.a();
        r0.cipherKey = r6;
        r6 = r7.d();
        r0.hmacKey = r6;
        r6 = r7.b();
        r0.iv = r6;
    L_0x007e:
        r0 = r4.k;
        r0 = r0.c;
        r0 = com.whatsapp.l5.e(r0);
        if (r0 == 0) goto L_0x009c;
    L_0x0088:
        r0 = r4.k;
        r0 = r0.c;
        r0 = com.whatsapp.qa.d(r0);
        if (r0 == 0) goto L_0x0099;
    L_0x0092:
        r6 = r11.a;
        com.whatsapp.App.b(r4, r0);
        if (r3 == 0) goto L_0x009c;
    L_0x0099:
        r0 = 0;
        r4.t = r0;
    L_0x009c:
        r0 = r4.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x00ba;
    L_0x00a2:
        r0 = r11.a;
        r0 = com.whatsapp.App.as;
        r0 = r0.e();
        r0 = r0.p;
        r6 = r4.k;
        r6 = r6.c;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x00ba;
    L_0x00b6:
        r0 = 13;
        r4.d = r0;
    L_0x00ba:
        r0 = r11.a;
        r0 = com.whatsapp.App.aK;
        r0.a(r4);
        r6 = com.whatsapp.u1.a();
        r0 = r4.j;
        if (r0 == 0) goto L_0x0179;
    L_0x00c9:
        r0 = r1;
    L_0x00ca:
        r6.a(r0);
        r0 = r4.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x017c;
    L_0x00d3:
        r0 = r4.k;
        r0 = r0.c;
        r0 = com.whatsapp.qa.d(r0);
    L_0x00db:
        if (r0 == 0) goto L_0x0124;
    L_0x00dd:
        r1 = r0.p;
        r1 = com.whatsapp.l5.e(r1);
        if (r1 != 0) goto L_0x0124;
    L_0x00e5:
        r1 = r0.c();
        if (r1 != 0) goto L_0x0124;
    L_0x00eb:
        r1 = r0.p;
        r6 = z;
        r6 = r6[r8];
        r1 = r1.equals(r6);
        if (r1 != 0) goto L_0x0124;
    L_0x00f7:
        r1 = r11.a;
        r1 = com.whatsapp.App.L;
        r6 = r11.a;
        r6 = r0.p;
        r6 = com.whatsapp.App.A(r6);
        r1.removeMessages(r10, r6);
        r1 = r11.a;
        r1 = com.whatsapp.App.L;
        r6 = r11.a;
        r6 = r0.p;
        r6 = com.whatsapp.App.A(r6);
        r1.removeMessages(r8, r6);
        r1 = r11.a;
        r1 = com.whatsapp.App.L;
        r6 = r11.a;
        r0 = r0.p;
        r0 = com.whatsapp.App.A(r0);
        r1.removeMessages(r9, r0);
    L_0x0124:
        if (r3 == 0) goto L_0x0166;
    L_0x0126:
        r0 = r5.d;
        if (r0 != 0) goto L_0x0152;
    L_0x012a:
        r0 = r4.c;
        r0 = com.whatsapp.App.b(r0);
        if (r0 == 0) goto L_0x0152;
    L_0x0132:
        r0 = z;
        r0 = r0[r10];
        r5.J = r0;
        r0 = r4.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r4.q;
        if (r1 == 0) goto L_0x014d;
    L_0x0140:
        if (r0 == 0) goto L_0x0146;
    L_0x0142:
        r0 = r0.file;
        if (r0 != 0) goto L_0x014d;
    L_0x0146:
        r0 = 0;
        com.whatsapp.App.a(r4, r2, r0);
        if (r3 == 0) goto L_0x0150;
    L_0x014d:
        com.whatsapp.App.a(r5, r2);
    L_0x0150:
        if (r3 == 0) goto L_0x015d;
    L_0x0152:
        r0 = r11.a;
        r0 = r4.k;
        r0 = r0.b;
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        com.whatsapp.App.a(r0, r1);
    L_0x015d:
        r0 = r11.a;
        r0 = z;
        r0 = r0[r2];
        com.whatsapp.App.c(r13, r12, r0);
    L_0x0166:
        if (r3 == 0) goto L_0x0171;
    L_0x0168:
        r0 = r11.a;
        r0 = z;
        r0 = r0[r9];
        com.whatsapp.App.c(r13, r12, r0);
    L_0x0171:
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        goto L_0x0053;
    L_0x0179:
        r0 = r2;
        goto L_0x00ca;
    L_0x017c:
        r0 = 0;
        goto L_0x00db;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.a(java.lang.String, java.lang.String, com.whatsapp.protocol.c2):void");
    }

    static App a(kd kdVar) {
        return kdVar.a;
    }

    static c2 b(String str, int i) {
        return a(str, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r10, java.lang.String r11, com.whatsapp.protocol.b2 r12) {
        /*
        r9 = this;
        r6 = 2;
        r4 = 0;
        r7 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.wn.q();
        if (r0 == 0) goto L_0x0148;
    L_0x000a:
        r0 = r12.d;
        if (r0 == 0) goto L_0x0148;
    L_0x000e:
        r0 = r12.e;
        if (r0 == 0) goto L_0x0148;
    L_0x0012:
        r0 = r12.c;
        if (r0 == 0) goto L_0x0148;
    L_0x0016:
        r0 = r12.c;
        r1 = com.whatsapp.App.ad();
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x0148;
    L_0x0022:
        r0 = r9.a;
        r0 = r12.d;
        r0 = com.whatsapp.App.n(r0);
        if (r0 != 0) goto L_0x0151;
    L_0x002c:
        r5 = new com.whatsapp.protocol.bb;
        r0 = r12.d;
        r1 = z;
        r2 = 74;
        r1 = r1[r2];
        r5.<init>(r0, r1);
        r0 = z;
        r1 = 73;
        r0 = r0[r1];
        r1 = r12.e;
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0063;
    L_0x0047:
        r0 = z;
        r1 = 77;
        r0 = r0[r1];
        r1 = r12.e;
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0063;
    L_0x0055:
        r0 = z;
        r1 = 72;
        r0 = r0[r1];
        r1 = r12.e;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x008c;
    L_0x0063:
        r0 = r12.b;
        if (r0 == 0) goto L_0x008c;
    L_0x0067:
        r0 = r12.b;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x008c;
    L_0x006f:
        r0 = r12.f;
        if (r0 == 0) goto L_0x008c;
    L_0x0073:
        r0 = new com.whatsapp.a3i;
        r1 = r12.f;
        r2 = 0;
        r3 = r12.b;
        r0.<init>(r1, r2, r3, r4, r5);
        r2 = r12.e;
        r1 = -1;
        r3 = r2.hashCode();
        switch(r3) {
            case -934610812: goto L_0x0161;
            case -309211200: goto L_0x017e;
            case 96417: goto L_0x01ab;
            default: goto L_0x0087;
        };
    L_0x0087:
        switch(r1) {
            case 0: goto L_0x018d;
            case 1: goto L_0x0196;
            case 2: goto L_0x019f;
            default: goto L_0x008a;
        };
    L_0x008a:
        if (r7 == 0) goto L_0x0146;
    L_0x008c:
        r0 = z;
        r1 = 78;
        r0 = r0[r1];
        r1 = r12.e;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00a5;
    L_0x009a:
        r0 = r12.f;
        if (r0 == 0) goto L_0x00a5;
    L_0x009e:
        r0 = r12.f;
        com.whatsapp.App.a(r0, r5);
        if (r7 == 0) goto L_0x0146;
    L_0x00a5:
        r0 = z;
        r1 = 79;
        r0 = r0[r1];
        r1 = r12.e;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00c4;
    L_0x00b3:
        r0 = r12.a;
        if (r0 == 0) goto L_0x00c4;
    L_0x00b7:
        r0 = r12.f;
        if (r0 == 0) goto L_0x00c4;
    L_0x00bb:
        r0 = r12.f;
        r1 = r12.a;
        com.whatsapp.App.a(r0, r1, r5);
        if (r7 == 0) goto L_0x0146;
    L_0x00c4:
        r0 = z;
        r1 = 83;
        r0 = r0[r1];
        r1 = r12.e;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x013d;
    L_0x00d2:
        r0 = r12.a;
        if (r0 == 0) goto L_0x013d;
    L_0x00d6:
        r0 = r12.b;
        if (r0 == 0) goto L_0x013d;
    L_0x00da:
        r0 = r12.b;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x013d;
    L_0x00e2:
        r0 = r12.a;
        r0 = com.whatsapp.qm.j(r0);
        r1 = r12.b;
        com.whatsapp.qm.a(r0, r1);
        r1 = com.whatsapp.App.Q();
        if (r1 == 0) goto L_0x0124;
    L_0x00f3:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 76;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.App.aK;
        r2 = r12.a;
        r3 = r12.b;
        r2 = com.whatsapp.qm.a(r0, r2, r3, r6);
        r1.a(r2);
        r1 = new com.whatsapp.v9;
        r1.<init>(r9, r0, r12, r5);
        com.whatsapp.util.bq.a(r1);
        if (r7 == 0) goto L_0x013b;
    L_0x0124:
        r1 = z;
        r2 = 86;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = com.whatsapp.App.aK;
        r2 = r12.a;
        r3 = r12.b;
        r4 = 3;
        r0 = com.whatsapp.qm.a(r0, r2, r3, r4);
        r1.a(r0);
    L_0x013b:
        if (r7 == 0) goto L_0x0146;
    L_0x013d:
        r0 = z;
        r1 = 80;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0146:
        if (r7 == 0) goto L_0x0151;
    L_0x0148:
        r0 = z;
        r1 = 81;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x0151:
        r0 = z;
        r1 = 75;
        r0 = r0[r1];
        com.whatsapp.App.c(r11, r10, r0);
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        return;
    L_0x0161:
        r3 = z;
        r8 = 82;
        r3 = r3[r8];
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x0087;
    L_0x016d:
        if (r7 == 0) goto L_0x01a8;
    L_0x016f:
        r1 = z;
        r3 = 85;
        r1 = r1[r3];
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x01a8;
    L_0x017b:
        r1 = 1;
        if (r7 == 0) goto L_0x0087;
    L_0x017e:
        r3 = z;
        r4 = 84;
        r3 = r3[r4];
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0087;
    L_0x018a:
        r1 = r6;
        goto L_0x0087;
    L_0x018d:
        r1 = 30;
        r0.e = r1;
        com.whatsapp.App.g(r0);
        if (r7 == 0) goto L_0x008a;
    L_0x0196:
        r1 = 15;
        r0.e = r1;
        com.whatsapp.App.c(r0);
        if (r7 == 0) goto L_0x008a;
    L_0x019f:
        r1 = 92;
        r0.e = r1;
        com.whatsapp.App.f(r0);
        goto L_0x008a;
    L_0x01a8:
        r1 = r4;
        goto L_0x0087;
    L_0x01ab:
        r4 = r1;
        goto L_0x016f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.a(java.lang.String, java.lang.String, com.whatsapp.protocol.b2):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r9, java.lang.String r10, com.whatsapp.protocol.bk r11) {
        /*
        r8 = this;
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.wn.q();
        if (r0 == 0) goto L_0x00b2;
    L_0x000a:
        r0 = z;
        r4 = 43;
        r0 = r0[r4];
        r4 = r11.c;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0020;
    L_0x0018:
        com.whatsapp.wn.y();
        com.whatsapp.App.aw();
        if (r3 == 0) goto L_0x00b2;
    L_0x0020:
        r0 = z;
        r4 = 44;
        r0 = r0[r4];
        r4 = r11.c;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0038;
    L_0x002e:
        r4 = r11.d;
        com.whatsapp.wn.a(r4);
        com.whatsapp.App.O();
        if (r3 == 0) goto L_0x00b2;
    L_0x0038:
        r0 = z;
        r4 = 47;
        r0 = r0[r4];
        r4 = r11.c;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0055;
    L_0x0046:
        r0 = r11.a;
        if (r0 == 0) goto L_0x0055;
    L_0x004a:
        r0 = r11.a;
        r0 = com.whatsapp.qa.d(r0);
        com.whatsapp.App.a(r0);
        if (r3 == 0) goto L_0x00b2;
    L_0x0055:
        r0 = z;
        r4 = 52;
        r0 = r0[r4];
        r4 = r11.c;
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x007f;
    L_0x0063:
        r0 = z;
        r4 = 45;
        r0 = r0[r4];
        r4 = r11.c;
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x007f;
    L_0x0071:
        r0 = z;
        r4 = 53;
        r0 = r0[r4];
        r4 = r11.c;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x00b2;
    L_0x007f:
        r0 = r11.a;
        if (r0 == 0) goto L_0x00b2;
    L_0x0083:
        r0 = r11.a;
        r4 = com.whatsapp.qa.d(r0);
        if (r4 == 0) goto L_0x00b2;
    L_0x008b:
        r0 = r11.a;
        r0 = com.whatsapp.l5.e(r0);
        if (r0 != 0) goto L_0x00b2;
    L_0x0093:
        r0 = r4.p;
        r5 = z;
        r6 = 48;
        r5 = r5[r6];
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x00b2;
    L_0x00a1:
        r0 = r11.c;
        if (r0 == 0) goto L_0x00b2;
    L_0x00a5:
        r5 = r11.c;
        r0 = -1;
        r6 = r5.hashCode();
        switch(r6) {
            case -1399754289: goto L_0x00d1;
            case -995321554: goto L_0x00e0;
            case 993558001: goto L_0x00c2;
            default: goto L_0x00af;
        };
    L_0x00af:
        switch(r0) {
            case 0: goto L_0x00ee;
            case 1: goto L_0x00f7;
            case 2: goto L_0x0100;
            default: goto L_0x00b2;
        };
    L_0x00b2:
        r0 = z;
        r1 = 46;
        r0 = r0[r1];
        com.whatsapp.App.c(r10, r9, r0);
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        return;
    L_0x00c2:
        r6 = z;
        r7 = 49;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x00af;
    L_0x00ce:
        if (r3 == 0) goto L_0x010a;
    L_0x00d0:
        r0 = r1;
    L_0x00d1:
        r6 = z;
        r7 = 50;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x00af;
    L_0x00dd:
        if (r3 == 0) goto L_0x0108;
    L_0x00df:
        r0 = r2;
    L_0x00e0:
        r6 = z;
        r7 = 51;
        r6 = r6[r7];
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00af;
    L_0x00ec:
        r0 = 2;
        goto L_0x00af;
    L_0x00ee:
        r0 = r8.a;
        r5 = r4.p;
        r0.c(r5, r2);
        if (r3 == 0) goto L_0x00b2;
    L_0x00f7:
        r0 = r8.a;
        r2 = r4.p;
        r0.c(r2, r1);
        if (r3 == 0) goto L_0x00b2;
    L_0x0100:
        r0 = r8.a;
        r1 = r4.p;
        r0.G(r1);
        goto L_0x00b2;
    L_0x0108:
        r0 = r2;
        goto L_0x00af;
    L_0x010a:
        r0 = r1;
        goto L_0x00af;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.a(java.lang.String, java.lang.String, com.whatsapp.protocol.bk):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r10, java.lang.String r11, java.lang.String r12, com.whatsapp.protocol.c3 r13, int r14) {
        /*
        r9 = this;
        r4 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        r8 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r6 = 1;
        r5 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = com.whatsapp.wn.q();
        if (r1 == 0) goto L_0x009d;
    L_0x0010:
        if (r12 == 0) goto L_0x009d;
    L_0x0012:
        r1 = r9.a;
        r1 = com.whatsapp.App.n(r11);
        if (r1 != 0) goto L_0x00a6;
    L_0x001a:
        r1 = com.whatsapp.qa.d(r12);
        r2 = r9.a;
        r2 = com.whatsapp.App.aK;
        r2 = r2.m(r12);
        r3 = -2;
        if (r14 != r3) goto L_0x005a;
    L_0x0029:
        if (r2 != 0) goto L_0x002d;
    L_0x002b:
        if (r13 == 0) goto L_0x0037;
    L_0x002d:
        if (r2 == 0) goto L_0x0047;
    L_0x002f:
        r3 = r2.k;
        r3 = r3.equals(r13);
        if (r3 == 0) goto L_0x0047;
    L_0x0037:
        if (r1 == 0) goto L_0x0047;
    L_0x0039:
        r3 = r1.d;
        if (r3 != 0) goto L_0x0047;
    L_0x003d:
        com.whatsapp.wn.a(r11, r7);
        r3 = r9.a;
        com.whatsapp.App.b(r1, r5);
        if (r0 == 0) goto L_0x009b;
    L_0x0047:
        com.whatsapp.wn.a(r11, r4);
        r3 = r9.a;
        com.whatsapp.App.a(r11, r4);
        r3 = z;
        r4 = 17;
        r3 = r3[r4];
        com.whatsapp.util.Log.e(r3);
        if (r0 == 0) goto L_0x009b;
    L_0x005a:
        r3 = r9.a;
        r3 = com.whatsapp.App.aK;
        r3 = r3.a(r13);
        if (r1 == 0) goto L_0x008a;
    L_0x0064:
        if (r3 == 0) goto L_0x008a;
    L_0x0066:
        if (r2 == 0) goto L_0x0070;
    L_0x0068:
        r2 = r2.k;
        r2 = r13.equals(r2);
        if (r2 != 0) goto L_0x0074;
    L_0x0070:
        r2 = r1.d;
        if (r2 < r14) goto L_0x008a;
    L_0x0074:
        com.whatsapp.wn.a(r11, r7);
        r2 = r9.a;
        r2 = java.lang.Integer.valueOf(r14);
        com.whatsapp.App.a(r1, r5, r5, r13, r2);
        r1 = r9.a;
        com.whatsapp.App.b(r6, r6, r6, r5);
        com.whatsapp.notification.PopupNotification.e(r12);
        if (r0 == 0) goto L_0x009b;
    L_0x008a:
        com.whatsapp.wn.a(r11, r8);
        r1 = r9.a;
        com.whatsapp.App.a(r11, r8);
        r1 = z;
        r2 = 16;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
    L_0x009b:
        if (r0 == 0) goto L_0x00a6;
    L_0x009d:
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
    L_0x00a6:
        r0 = r9.a;
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        com.whatsapp.App.c(r11, r10, r0);
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.a(java.lang.String, java.lang.String, java.lang.String, com.whatsapp.protocol.c3, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r11, java.lang.String r12, com.whatsapp.protocol.bf r13) {
        /*
        r10 = this;
        r7 = com.whatsapp.DialogToastActivity.f;
        r1 = r13.d;
        r8 = r13.b;
        r0 = com.whatsapp.wn.q();
        if (r0 == 0) goto L_0x004d;
    L_0x000c:
        r0 = r10.a;
        r0 = com.whatsapp.App.n(r12);
        if (r0 != 0) goto L_0x004d;
    L_0x0014:
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        switch(r8) {
            case 1: goto L_0x005d;
            case 2: goto L_0x00da;
            case 3: goto L_0x0101;
            case 4: goto L_0x0101;
            case 5: goto L_0x012b;
            case 6: goto L_0x014f;
            case 7: goto L_0x0179;
            case 8: goto L_0x0179;
            case 9: goto L_0x01d5;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r8);
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
    L_0x0041:
        com.whatsapp.wn.a(r12, r0);
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 == r1) goto L_0x004d;
    L_0x0048:
        r1 = r10.a;
        com.whatsapp.App.a(r12, r0);
    L_0x004d:
        r0 = z;
        r1 = 8;
        r0 = r0[r1];
        com.whatsapp.App.c(r12, r11, r0);
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        return;
    L_0x005d:
        r2 = r13.h;
        if (r2 != 0) goto L_0x0097;
    L_0x0061:
        r2 = r10.a;
        r2 = com.whatsapp.App.aK;
        r2 = r2.m(r1);
        if (r2 != 0) goto L_0x006f;
    L_0x006b:
        r3 = r13.i;
        if (r3 == 0) goto L_0x007b;
    L_0x006f:
        if (r2 == 0) goto L_0x0093;
    L_0x0071:
        r2 = r2.k;
        r3 = r13.i;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0093;
    L_0x007b:
        r2 = r13.c;
        if (r2 == 0) goto L_0x0089;
    L_0x007f:
        r2 = r10.a;
        r2 = com.whatsapp.App.aK;
        r3 = 0;
        r2.e(r1, r3);
        if (r7 == 0) goto L_0x0041;
    L_0x0089:
        r2 = r10.a;
        r2 = com.whatsapp.App.aK;
        r3 = 0;
        r2.a(r1, r3);
        if (r7 == 0) goto L_0x0041;
    L_0x0093:
        r0 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        if (r7 == 0) goto L_0x0041;
    L_0x0097:
        r2 = r13.i;
        if (r2 != 0) goto L_0x00d6;
    L_0x009b:
        r2 = r13.h;
        if (r2 == 0) goto L_0x00d6;
    L_0x009f:
        r3 = new java.util.ArrayList;
        r2 = r13.h;
        r2 = r2.length;
        r3.<init>(r2);
        r4 = r13.h;
        r5 = r4.length;
        r2 = 0;
    L_0x00ab:
        if (r2 >= r5) goto L_0x00c0;
    L_0x00ad:
        r6 = r4[r2];
        r9 = r10.a;
        r9 = com.whatsapp.App.aK;
        r6 = r9.a(r6);
        if (r6 == 0) goto L_0x00bc;
    L_0x00b9:
        r3.add(r6);
    L_0x00bc:
        r2 = r2 + 1;
        if (r7 == 0) goto L_0x00ab;
    L_0x00c0:
        r2 = r3.size();
        if (r2 <= 0) goto L_0x00d2;
    L_0x00c6:
        r2 = r10.a;
        r2 = com.whatsapp.App.aK;
        r4 = r13.c;
        r5 = 0;
        r2.a(r3, r4, r5);
        if (r7 == 0) goto L_0x00d4;
    L_0x00d2:
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
    L_0x00d4:
        if (r7 == 0) goto L_0x0041;
    L_0x00d6:
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r7 == 0) goto L_0x0041;
    L_0x00da:
        r2 = r10.a;
        r2 = com.whatsapp.App.aK;
        r2 = r2.m(r1);
        if (r2 != 0) goto L_0x00e8;
    L_0x00e4:
        r3 = r13.i;
        if (r3 == 0) goto L_0x00f4;
    L_0x00e8:
        if (r2 == 0) goto L_0x00fd;
    L_0x00ea:
        r2 = r2.k;
        r3 = r13.i;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00fd;
    L_0x00f4:
        r2 = 0;
        com.whatsapp.App.b(r1, r2);
        com.whatsapp.Conversation.o(r1);
        if (r7 == 0) goto L_0x0041;
    L_0x00fd:
        r0 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        if (r7 == 0) goto L_0x0041;
    L_0x0101:
        r2 = r10.a;
        r2 = com.whatsapp.App.aK;
        r2 = r2.m(r1);
        if (r2 != 0) goto L_0x010f;
    L_0x010b:
        r3 = r13.i;
        if (r3 == 0) goto L_0x011b;
    L_0x010f:
        if (r2 == 0) goto L_0x0127;
    L_0x0111:
        r2 = r2.k;
        r3 = r13.i;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0127;
    L_0x011b:
        r3 = com.whatsapp.App.aK;
        r2 = 3;
        if (r8 != r2) goto L_0x01e2;
    L_0x0120:
        r2 = 1;
    L_0x0121:
        r4 = 0;
        r3.a(r1, r2, r4);
        if (r7 == 0) goto L_0x0041;
    L_0x0127:
        r0 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        if (r7 == 0) goto L_0x0041;
    L_0x012b:
        r6 = r0;
        r0 = com.whatsapp.App.z();
        r0 = com.whatsapp.a3b.a(r0);
        r0 = r0.e(r1);
        if (r0 != 0) goto L_0x014b;
    L_0x013a:
        r0 = com.whatsapp.App.z();
        r0 = com.whatsapp.a3b.a(r0);
        r2 = r13.e;
        r4 = 1;
        r5 = 0;
        r0.a(r1, r2, r4, r5);
        if (r7 == 0) goto L_0x01eb;
    L_0x014b:
        r0 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        if (r7 == 0) goto L_0x0041;
    L_0x014f:
        r2 = com.whatsapp.App.z();
        r2 = com.whatsapp.a3b.a(r2);
        r2 = r2.c(r1);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r4;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r4;
        r4 = r13.a;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0175;
    L_0x0167:
        r2 = com.whatsapp.App.z();
        r2 = com.whatsapp.a3b.a(r2);
        r3 = 0;
        r2.b(r1, r3);
        if (r7 == 0) goto L_0x0041;
    L_0x0175:
        r0 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        if (r7 == 0) goto L_0x0041;
    L_0x0179:
        r2 = r0;
        if (r1 == 0) goto L_0x01e9;
    L_0x017c:
        r0 = r13.i;
        if (r0 != 0) goto L_0x01bd;
    L_0x0180:
        r0 = r13.h;
        if (r0 == 0) goto L_0x01bd;
    L_0x0184:
        r3 = new java.util.ArrayList;
        r0 = r13.h;
        r0 = r0.length;
        r3.<init>(r0);
        r4 = r13.h;
        r5 = r4.length;
        r0 = 0;
    L_0x0190:
        if (r0 >= r5) goto L_0x01a5;
    L_0x0192:
        r6 = r4[r0];
        r9 = r10.a;
        r9 = com.whatsapp.App.aK;
        r6 = r9.a(r6);
        if (r6 == 0) goto L_0x01a1;
    L_0x019e:
        r3.add(r6);
    L_0x01a1:
        r0 = r0 + 1;
        if (r7 == 0) goto L_0x0190;
    L_0x01a5:
        r0 = r3.size();
        if (r0 <= 0) goto L_0x01b9;
    L_0x01ab:
        r0 = r10.a;
        r4 = com.whatsapp.App.aK;
        r0 = 7;
        if (r8 != r0) goto L_0x01e5;
    L_0x01b2:
        r0 = 1;
    L_0x01b3:
        r5 = 0;
        r4.b(r3, r0, r5);
        if (r7 == 0) goto L_0x01e7;
    L_0x01b9:
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
    L_0x01bb:
        if (r7 == 0) goto L_0x0041;
    L_0x01bd:
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r7 == 0) goto L_0x0041;
    L_0x01c1:
        if (r1 != 0) goto L_0x01d1;
    L_0x01c3:
        r2 = 8;
        if (r8 != r2) goto L_0x01d1;
    L_0x01c7:
        r2 = new com.whatsapp.av0;
        r2.<init>(r10);
        com.whatsapp.util.bq.a(r2);
        if (r7 == 0) goto L_0x0041;
    L_0x01d1:
        r0 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r7 == 0) goto L_0x0041;
    L_0x01d5:
        r2 = r10.a;
        r2 = com.whatsapp.App.aK;
        r3 = 1;
        r4 = 0;
        r2.a(r1, r3, r4);
        if (r7 == 0) goto L_0x0041;
    L_0x01e0:
        goto L_0x0019;
    L_0x01e2:
        r2 = 0;
        goto L_0x0121;
    L_0x01e5:
        r0 = 0;
        goto L_0x01b3;
    L_0x01e7:
        r0 = r2;
        goto L_0x01bb;
    L_0x01e9:
        r0 = r2;
        goto L_0x01c1;
    L_0x01eb:
        r0 = r6;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.a(java.lang.String, java.lang.String, com.whatsapp.protocol.bf):void");
    }

    public void c(String str, String str2, String str3) {
        bq.a(new ast(this, str2, str3, str));
    }

    static int a(long j, boolean z) {
        return b(j, z);
    }

    public void a(String str) {
        wn.c(str);
    }

    private static int b(long j, boolean z) {
        return (z || System.currentTimeMillis() < 86400000 + j) ? 20 : 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
        r5 = this;
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r0 = com.whatsapp.wn.q();
        if (r0 == 0) goto L_0x003b;
    L_0x0008:
        r0 = r5.a;
        r0 = com.whatsapp.App.n(r7);
        if (r0 != 0) goto L_0x003b;
    L_0x0010:
        if (r8 == 0) goto L_0x0033;
    L_0x0012:
        r0 = new com.whatsapp.protocol.bb;
        r1 = z;
        r2 = 93;
        r1 = r1[r2];
        r0.<init>(r7, r1);
        r1 = new com.whatsapp.aor;
        r1.<init>(r5, r7, r8);
        r2 = new com.whatsapp.u_;
        r2.<init>(r5, r7);
        r3 = new com.whatsapp.ri;
        r3.<init>(r5, r7);
        com.whatsapp.App.a(r8, r1, r2, r3, r0);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x003b;
    L_0x0033:
        com.whatsapp.wn.a(r7, r4);
        r0 = r5.a;
        com.whatsapp.App.a(r7, r4);
    L_0x003b:
        r0 = z;
        r1 = 94;
        r0 = r0[r1];
        com.whatsapp.App.c(r7, r6, r0);
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.b(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r12, java.lang.String r13, int r14, com.whatsapp.protocol.c2 r15) {
        /*
        r11 = this;
        r10 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r9 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r6 = 0;
        r7 = com.whatsapp.DialogToastActivity.f;
        switch(r14) {
            case 0: goto L_0x0045;
            case 1: goto L_0x0058;
            case 2: goto L_0x0075;
            case 3: goto L_0x0088;
            case 4: goto L_0x0096;
            case 5: goto L_0x00a0;
            case 6: goto L_0x00f6;
            case 7: goto L_0x000a;
            case 8: goto L_0x000a;
            case 9: goto L_0x000a;
            case 10: goto L_0x000a;
            case 11: goto L_0x0105;
            case 12: goto L_0x0123;
            case 13: goto L_0x0114;
            case 14: goto L_0x0132;
            case 15: goto L_0x000a;
            case 16: goto L_0x0141;
            case 17: goto L_0x0150;
            case 18: goto L_0x0066;
            case 19: goto L_0x015f;
            case 20: goto L_0x0169;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 67;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r1 = z;
        r2 = 60;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r14);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = z;
        r1 = 63;
        r0 = r0[r1];
        com.whatsapp.App.c(r13, r12, r0);
        com.whatsapp.App.s(r13);
    L_0x003e:
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        return;
    L_0x0045:
        r0 = r6;
        r0 = (java.util.List) r0;
        r1 = 9;
        com.whatsapp.App.a(r13, r0, r1);
        r0 = z;
        r1 = 68;
        r0 = r0[r1];
        com.whatsapp.App.c(r13, r12, r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0058:
        com.whatsapp.App.d(r13);
        r0 = z;
        r1 = 66;
        r0 = r0[r1];
        com.whatsapp.App.c(r13, r12, r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0066:
        r0 = new com.whatsapp.j9;
        r1 = r11;
        r2 = r15;
        r3 = r13;
        r4 = r14;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0075:
        r0 = r6;
        r0 = (java.util.List) r0;
        r1 = 10;
        com.whatsapp.App.a(r13, r0, r1);
        r0 = z;
        r1 = 64;
        r0 = r0[r1];
        com.whatsapp.App.c(r13, r12, r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0088:
        com.whatsapp.App.z(r13);
        r0 = z;
        r1 = 61;
        r0 = r0[r1];
        com.whatsapp.App.c(r13, r12, r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0096:
        r0 = new com.whatsapp.en;
        r0.<init>(r11, r15, r13, r12);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x00a0:
        r1 = new com.whatsapp.protocol.c3;
        r0 = r15.n;
        r2 = r15.o;
        r3 = r15.a;
        r1.<init>(r0, r2, r3);
        r0 = com.whatsapp.App.aK;
        r2 = r0.a(r1);
        r3 = new com.whatsapp.protocol.c2;
        r3.<init>();
        if (r2 != 0) goto L_0x00c8;
    L_0x00b8:
        r0 = z;
        r4 = 69;
        r0 = r0[r4];
        com.whatsapp.util.Log.e(r0);
        r3.c = r10;
        com.whatsapp.App.a(r13, r3, r14);
        if (r7 == 0) goto L_0x00eb;
    L_0x00c8:
        r0 = r1.a;
        if (r0 == 0) goto L_0x00e5;
    L_0x00cc:
        r0 = r2.d;
        r4 = 2;
        r0 = com.whatsapp.protocol.b7.a(r0, r4);
        if (r0 >= 0) goto L_0x00e5;
    L_0x00d5:
        r0 = z;
        r4 = 70;
        r0 = r0[r4];
        com.whatsapp.util.Log.e(r0);
        r3.c = r9;
        com.whatsapp.App.a(r13, r3, r14);
        if (r7 == 0) goto L_0x00eb;
    L_0x00e5:
        r0 = com.whatsapp.sx.a(r2);
        if (r0 == 0) goto L_0x0175;
    L_0x00eb:
        r0 = z;
        r1 = 71;
        r0 = r0[r1];
        com.whatsapp.App.c(r13, r12, r0);
        if (r7 == 0) goto L_0x003e;
    L_0x00f6:
        r0 = new com.whatsapp.a5c;
        r1 = r11;
        r2 = r15;
        r3 = r13;
        r4 = r14;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0105:
        r0 = new com.whatsapp.aa4;
        r1 = r11;
        r2 = r15;
        r3 = r13;
        r4 = r14;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0114:
        r0 = new com.whatsapp.ou;
        r1 = r11;
        r2 = r15;
        r3 = r13;
        r4 = r14;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0123:
        r0 = new com.whatsapp.ml;
        r1 = r11;
        r2 = r15;
        r3 = r13;
        r4 = r14;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0132:
        r0 = new com.whatsapp.wa;
        r1 = r11;
        r2 = r14;
        r3 = r15;
        r4 = r13;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0141:
        r0 = new com.whatsapp.td;
        r1 = r11;
        r2 = r15;
        r3 = r13;
        r4 = r14;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0150:
        r0 = new com.whatsapp.a5h;
        r1 = r11;
        r2 = r15;
        r3 = r13;
        r4 = r14;
        r5 = r12;
        r0.<init>(r1, r2, r3, r4, r5);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x015f:
        r0 = new com.whatsapp.al;
        r0.<init>(r11, r15, r13, r12);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0169:
        r0 = new com.whatsapp.a29;
        r0.<init>(r11, r13, r12);
        com.whatsapp.util.bq.a(r0);
        if (r7 == 0) goto L_0x003e;
    L_0x0173:
        goto L_0x000a;
    L_0x0175:
        r0 = r2.c;
        r0 = com.whatsapp.App.b(r0);
        if (r0 == 0) goto L_0x01e4;
    L_0x017d:
        r0 = r2.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r4 = r0.file;
        if (r4 == 0) goto L_0x01c3;
    L_0x0185:
        r4 = r0.file;
        r4 = r4.exists();
        if (r4 == 0) goto L_0x01c3;
    L_0x018d:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r8 = 62;
        r5 = r5[r8];
        r4 = r4.append(r5);
        r4 = r4.append(r1);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = new com.whatsapp.MediaData;
        r4.<init>(r0);
        r0 = new com.whatsapp.protocol.co;
        r0.<init>(r2);
        r0.Q = r4;
        r0.q = r6;
        r5 = new com.whatsapp.s_;
        r5.<init>(r2, r0, r13);
        r4.uploader = r5;
        r0 = r4.uploader;
        r0.d();
        if (r7 == 0) goto L_0x01e2;
    L_0x01c3:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r4 = 65;
        r2 = r2[r4];
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r3.c = r10;
        com.whatsapp.App.a(r13, r3, r14);
    L_0x01e2:
        if (r7 == 0) goto L_0x00eb;
    L_0x01e4:
        r0 = z;
        r1 = 59;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r3.c = r9;
        com.whatsapp.App.a(r13, r3, r14);
        goto L_0x00eb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.a(java.lang.String, java.lang.String, int, com.whatsapp.protocol.c2):void");
    }

    public void a(String str, String str2, boolean z, String str3, String str4, long j, String str5) {
        App.a(str, str2, z, str3, str4, j, str5);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r7, java.lang.String r8, com.whatsapp.protocol.bx r9) {
        /*
        r6 = this;
        r5 = 0;
        r0 = com.whatsapp.wn.q();
        if (r0 == 0) goto L_0x008b;
    L_0x0007:
        r0 = r9.c;
        if (r0 == 0) goto L_0x008b;
    L_0x000b:
        r0 = r9.d;
        if (r0 == 0) goto L_0x008b;
    L_0x000f:
        r0 = r9.e;
        if (r0 == 0) goto L_0x008b;
    L_0x0013:
        r0 = r6.a;
        r0 = r9.c;
        r0 = com.whatsapp.App.n(r0);
        if (r0 != 0) goto L_0x008b;
    L_0x001d:
        r0 = z;
        r1 = 57;
        r0 = r0[r1];
        r1 = r9.d;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0066;
    L_0x002b:
        r0 = r9.a;
        if (r0 == 0) goto L_0x0066;
    L_0x002f:
        r0 = r9.b;
        if (r0 == 0) goto L_0x0066;
    L_0x0033:
        r0 = r9.e;
        r1 = com.whatsapp.App.ad();
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x0047;
    L_0x003f:
        r0 = r9.e;
        r0 = com.whatsapp.qm.i(r0);
        if (r0 == 0) goto L_0x008b;
    L_0x0047:
        r0 = new com.whatsapp.protocol.bb;
        r1 = r9.c;
        r2 = z;
        r3 = 54;
        r2 = r2[r3];
        r0.<init>(r1, r2);
        r1 = new com.whatsapp.aw2;
        r2 = r9.e;
        r3 = r9.b;
        r4 = r9.a;
        r1.<init>(r2, r3, r4, r0);
        com.whatsapp.App.a(r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x008b;
    L_0x0066:
        r0 = z;
        r1 = 56;
        r0 = r0[r1];
        r1 = r9.d;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x008b;
    L_0x0074:
        r0 = new com.whatsapp.protocol.bb;
        r1 = r9.c;
        r2 = z;
        r3 = 55;
        r2 = r2[r3];
        r0.<init>(r1, r2);
        r1 = new com.whatsapp.aw2;
        r2 = r9.e;
        r1.<init>(r2, r5, r5, r0);
        com.whatsapp.App.a(r1);
    L_0x008b:
        r0 = z;
        r1 = 58;
        r0 = r0[r1];
        com.whatsapp.App.c(r8, r7, r0);
        com.whatsapp.wn.m();
        com.whatsapp.wn.p();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.a(java.lang.String, java.lang.String, com.whatsapp.protocol.bx):void");
    }

    public void a(String str, String str2, String str3, c3 c3Var) {
        if (wn.q() && c3Var != null && ((z[11].equals(str3) || z[12].equals(str3)) && App.aK.b(c3Var, 9))) {
            co a = App.aK.a(c3Var);
            a.J = z[14];
            App.s(a);
        }
        App.c(str2, str, z[13]);
        wn.m();
        wn.p();
    }

    public void m454a(String str, int i) {
        Log.i(z[9] + str + ' ' + i);
        App.v(z[10] + i);
        wn.b(str, i);
    }

    public void a(String str, String str2, String str3) {
        Log.i(z[88] + str2 + ' ' + str3);
        wn.e(str2, str3);
        App.c(str2, str, z[87]);
        wn.m();
    }

    public kd(App app) {
        this.a = app;
    }

    public void a(String str, String str2, ci ciVar) {
        if (wn.q()) {
            App app = this.a;
            if (!App.n(str2)) {
                bb bbVar = new bb(str2, z[41]);
                App app2 = this.a;
                App.a(ciVar.b, ciVar.a, bbVar);
            }
        }
        App.c(str2, str, z[42]);
        wn.m();
        wn.p();
    }

    private static c2 a(String str, int i) {
        c2 c2Var = new c2();
        c2Var.c = i;
        c2Var.m = App.aK.d(str);
        c2Var.v = App.aK.y(str);
        c2Var.n = str;
        l5 d = qa.d(str);
        if (d != null) {
            String str2;
            c2Var.r = d.d;
            if (TextUtils.isEmpty(d.q)) {
                str2 = null;
            } else {
                str2 = d.q;
            }
            c2Var.u = str2;
        }
        return c2Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
        r8 = this;
        r7 = 2;
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r4 = 31;
        r0 = r0[r4];
        r0 = r0.equals(r14);
        if (r0 == 0) goto L_0x00ea;
    L_0x0011:
        r0 = com.whatsapp.wn.a(r11, r12);
        if (r0 == 0) goto L_0x00e8;
    L_0x0017:
        r4 = r0.a;
        r4 = com.whatsapp.wn.a(r12, r13, r4);
        if (r4 == 0) goto L_0x00a8;
    L_0x001f:
        r5 = z;
        r6 = 19;
        r5 = r5[r6];
        com.whatsapp.util.Log.i(r5);
        r5 = z;
        r6 = 28;
        r5 = r5[r6];
        r6 = r0.b;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x004a;
    L_0x0036:
        r5 = com.whatsapp.wn.d(r12);
        if (r5 == 0) goto L_0x004a;
    L_0x003c:
        r5 = com.whatsapp.wn.q();
        if (r5 == 0) goto L_0x0045;
    L_0x0042:
        com.whatsapp.wn.x();
    L_0x0045:
        com.whatsapp.App.b(r11, r4, r12, r7);
        if (r3 == 0) goto L_0x00e8;
    L_0x004a:
        r5 = z;
        r6 = 33;
        r5 = r5[r6];
        r6 = r0.b;
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0060;
    L_0x0058:
        com.whatsapp.App.d(r2);
        com.whatsapp.App.b(r11, r4, r12, r1);
        if (r3 == 0) goto L_0x00e8;
    L_0x0060:
        r5 = com.whatsapp.wn.q();
        if (r5 != 0) goto L_0x006b;
    L_0x0066:
        com.whatsapp.App.b(r11, r4, r12, r1);
        if (r3 == 0) goto L_0x00e8;
    L_0x006b:
        r5 = com.whatsapp.wn.d(r12);
        if (r5 == 0) goto L_0x0079;
    L_0x0071:
        com.whatsapp.App.d(r2);
        com.whatsapp.App.b(r11, r4, r12, r1);
        if (r3 == 0) goto L_0x00e8;
    L_0x0079:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 37;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = com.whatsapp.wn.b;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 40;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        com.whatsapp.App.a(r2, r11);
        if (r3 == 0) goto L_0x00e8;
    L_0x00a8:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 34;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r0.b;
        r0 = r4.append(r0);
        r4 = z;
        r5 = 27;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = com.whatsapp.wn.b;
        r0 = r0.append(r4);
        r4 = z;
        r5 = 25;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.wn.s();
        com.whatsapp.App.a(r1, r11);
    L_0x00e8:
        if (r3 == 0) goto L_0x0213;
    L_0x00ea:
        r0 = com.whatsapp.wn.q();
        if (r0 == 0) goto L_0x0102;
    L_0x00f0:
        r0 = com.whatsapp.wn.d(r12);
        if (r0 != 0) goto L_0x0102;
    L_0x00f6:
        r0 = z;
        r4 = 23;
        r0 = r0[r4];
        r0 = r0.equals(r14);
        if (r0 == 0) goto L_0x01eb;
    L_0x0102:
        r0 = com.whatsapp.wn.b(r12, r13);
        if (r0 == 0) goto L_0x0144;
    L_0x0108:
        r4 = z;
        r5 = 30;
        r4 = r4[r5];
        r4 = r4.equals(r14);
        if (r4 == 0) goto L_0x0122;
    L_0x0114:
        r4 = com.whatsapp.wn.q();
        if (r4 == 0) goto L_0x011d;
    L_0x011a:
        com.whatsapp.wn.x();
    L_0x011d:
        com.whatsapp.App.b(r11, r0, r12, r7);
        if (r3 == 0) goto L_0x01e9;
    L_0x0122:
        r4 = z;
        r5 = 29;
        r4 = r4[r5];
        r4 = r4.equals(r14);
        if (r4 == 0) goto L_0x0136;
    L_0x012e:
        com.whatsapp.App.d(r2);
        com.whatsapp.App.b(r11, r0, r12, r1);
        if (r3 == 0) goto L_0x01e9;
    L_0x0136:
        r4 = com.whatsapp.wn.q();
        if (r4 == 0) goto L_0x013f;
    L_0x013c:
        com.whatsapp.App.d(r2);
    L_0x013f:
        com.whatsapp.App.b(r11, r0, r12, r1);
        if (r3 == 0) goto L_0x01e9;
    L_0x0144:
        r0 = com.whatsapp.wn.j(r12);
        if (r0 == 0) goto L_0x01ba;
    L_0x014a:
        r0 = com.whatsapp.wn.a(r14, r10, r11, r12);
        com.whatsapp.App.a(r7, r11, r0);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 26;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r14);
        r5 = z;
        r6 = 32;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r4.append(r0);
        r4 = z;
        r5 = 38;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r12);
        r4 = z;
        r5 = 20;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = com.whatsapp.wn.s;
        r0 = r0.append(r4);
        r4 = z;
        r5 = 22;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r13);
        r4 = z;
        r5 = 35;
        r4 = r4[r5];
        r4 = r0.append(r4);
        r0 = com.whatsapp.wn.o;
        if (r0 == 0) goto L_0x021d;
    L_0x01ac:
        r0 = r1;
    L_0x01ad:
        r0 = r4.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r3 == 0) goto L_0x01e9;
    L_0x01ba:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 36;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = com.whatsapp.wn.q();
        r0 = r0.append(r4);
        r4 = z;
        r5 = 24;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r12);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.a(r1, r11);
    L_0x01e9:
        if (r3 == 0) goto L_0x0213;
    L_0x01eb:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 39;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r14);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = com.whatsapp.wn.j(r12);
        if (r0 == 0) goto L_0x0210;
    L_0x020b:
        com.whatsapp.App.a(r2, r11);
        if (r3 == 0) goto L_0x0213;
    L_0x0210:
        com.whatsapp.App.a(r1, r11);
    L_0x0213:
        r0 = z;
        r1 = 21;
        r0 = r0[r1];
        com.whatsapp.App.c(r10, r9, r0);
        return;
    L_0x021d:
        r0 = r2;
        goto L_0x01ad;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.kd.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Log.i(z[91] + str + ' ' + str4 + ' ' + str5 + ' ' + str6);
        App.v(z[89]);
        wn.a(str, str2, str3, str4, str5, str6, z);
        App.z().getSharedPreferences(z[92], 0).edit().putBoolean(z[90], false).commit();
        wn.m();
        wn.p();
    }
}
